package com.intellgen.graphplotter;

final class Expressions {
    private Expressions() { }

    static Expression number(double value) { return x -> value; }
    static Expression variable() { return x -> x; }
    static Expression unaryMinus(Expression operand) { return x -> -operand.evaluate(x); }

    static Expression binary(char operator, Expression left, Expression right) {
        return x -> {
            double lhs = left.evaluate(x);
            double rhs = right.evaluate(x);
            return switch (operator) {
                case '+' -> lhs + rhs;
                case '-' -> lhs - rhs;
                case '*' -> lhs * rhs;
                case '/' -> rhs == 0.0 ? Double.NaN : lhs / rhs;
                case '^' -> Math.pow(lhs, rhs);
                default -> throw new IllegalStateException("Unknown operator: " + operator);
            };
        };
    }

    static Expression function(String name, Expression argument) {
        return x -> {
            double value = argument.evaluate(x);
            return switch (name) {
                case "sin" -> Math.sin(value);
                case "cos" -> Math.cos(value);
                case "tan" -> Math.tan(value);
                case "log" -> value <= 0.0 ? Double.NaN : Math.log(value);
                case "exp" -> Math.exp(value);
                case "sqrt" -> value < 0.0 ? Double.NaN : Math.sqrt(value);
                case "abs" -> Math.abs(value);
                default -> throw new ExpressionException("Unknown function: " + name);
            };
        };
    }
}
