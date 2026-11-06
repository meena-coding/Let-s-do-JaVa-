package com.intellgen.graphplotter;

import java.util.List;

public final class ExpressionParser {
    private final List<Token> tokens;
    private int current;

    private ExpressionParser(List<Token> tokens) {
        this.tokens = tokens;
    }

    public static Expression parse(String expression) {
        ExpressionParser parser = new ExpressionParser(new Lexer(expression).tokenize());
        Expression result = parser.expression();
        parser.consume(TokenType.END, "Expected end of expression, found trailing characters.");
        return result;
    }

    private Expression expression() {
        Expression result = term();
        while (true) {
            if (match(TokenType.PLUS)) result = Expressions.binary('+', result, term());
            else if (match(TokenType.MINUS)) result = Expressions.binary('-', result, term());
            else return result;
        }
    }

    private Expression term() {
        Expression result = factor();
        while (true) {
            if (match(TokenType.MULTIPLY)) result = Expressions.binary('*', result, factor());
            else if (match(TokenType.DIVIDE)) result = Expressions.binary('/', result, factor());
            else return result;
        }
    }

    private Expression factor() {
        if (match(TokenType.PLUS)) return factor();
        if (match(TokenType.MINUS)) return Expressions.unaryMinus(factor());
        return power();
    }

    private Expression power() {
        Expression result = primary();
        return match(TokenType.POWER) ? Expressions.binary('^', result, factor()) : result;
    }

    private Expression primary() {
        Token token = peek();
        if (match(TokenType.NUMBER)) {
            try { return Expressions.number(Double.parseDouble(token.value())); }
            catch (NumberFormatException exception) { throw new ExpressionException("Invalid number '" + token.value() + "' at position " + token.position()); }
        }
        if (match(TokenType.VARIABLE)) return Expressions.variable();
        if (match(TokenType.FUNCTION)) {
            consume(TokenType.LEFT_PAREN, "Expected '(' after function name.");
            Expression argument = expression();
            consume(TokenType.RIGHT_PAREN, "Expected ')' after function argument.");
            return Expressions.function(token.value(), argument);
        }
        if (match(TokenType.LEFT_PAREN)) {
            Expression result = expression();
            consume(TokenType.RIGHT_PAREN, "Expected ')' to close opening parenthesis.");
            return result;
        }
        if (token.type() == TokenType.ERROR) throw new ExpressionException("Lexer Error: Invalid character or token '" + token.value() + "' at position " + token.position());
        throw new ExpressionException("Parser Error: Unexpected token '" + token.value() + "' at position " + token.position());
    }

    private boolean match(TokenType type) { if (peek().type() != type) return false; current++; return true; }
    private void consume(TokenType type, String message) { if (!match(type)) throw new ExpressionException("Parser Error at position " + peek().position() + ": " + message); }
    private Token peek() { return current < tokens.size() ? tokens.get(current) : new Token(TokenType.END, "", 0); }
}
