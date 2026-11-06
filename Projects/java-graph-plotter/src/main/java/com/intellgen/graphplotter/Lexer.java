package com.intellgen.graphplotter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

final class Lexer {
    private static final Set<String> FUNCTIONS = Set.of("sin", "cos", "tan", "log", "exp", "sqrt", "abs");
    private final String input;
    private int position;

    Lexer(String input) {
        this.input = input;
    }

    List<Token> tokenize() {
        List<Token> tokens = new ArrayList<>();
        while (position < input.length()) {
            skipWhitespace();
            if (position >= input.length()) break;
            int start = position;
            char current = peek();
            if (Character.isDigit(current) || current == '.') {
                tokens.add(readNumber(start));
            } else if (Character.isAlphabetic(current)) {
                tokens.add(readIdentifier(start));
            } else {
                next();
                tokens.add(switch (current) {
                    case '+' -> new Token(TokenType.PLUS, "+", start);
                    case '-' -> new Token(TokenType.MINUS, "-", start);
                    case '*' -> new Token(TokenType.MULTIPLY, "*", start);
                    case '/' -> new Token(TokenType.DIVIDE, "/", start);
                    case '^' -> new Token(TokenType.POWER, "^", start);
                    case '(' -> new Token(TokenType.LEFT_PAREN, "(", start);
                    case ')' -> new Token(TokenType.RIGHT_PAREN, ")", start);
                    default -> new Token(TokenType.ERROR, String.valueOf(current), start);
                });
            }
        }
        tokens.add(new Token(TokenType.END, "", position));
        return tokens;
    }

    private Token readNumber(int start) {
        boolean startsWithDot = peek() == '.';
        if (startsWithDot) {
            next();
            if (!Character.isDigit(peek())) return new Token(TokenType.ERROR, ".", start);
        }
        while (Character.isDigit(peek())) next();
        if (!startsWithDot && peek() == '.') {
            next();
            while (Character.isDigit(peek())) next();
        }
        if (peek() == 'e' || peek() == 'E') {
            next();
            if (peek() == '+' || peek() == '-') next();
            while (Character.isDigit(peek())) next();
        }
        return new Token(TokenType.NUMBER, input.substring(start, position), start);
    }

    private Token readIdentifier(int start) {
        while (Character.isLetterOrDigit(peek())) next();
        String identifier = input.substring(start, position);
        if (identifier.equals("x")) return new Token(TokenType.VARIABLE, identifier, start);
        return FUNCTIONS.contains(identifier)
                ? new Token(TokenType.FUNCTION, identifier, start)
                : new Token(TokenType.ERROR, identifier, start);
    }

    private void skipWhitespace() { while (Character.isWhitespace(peek())) next(); }
    private char peek() { return position < input.length() ? input.charAt(position) : '\0'; }
    private char next() { return position < input.length() ? input.charAt(position++) : '\0'; }
}
