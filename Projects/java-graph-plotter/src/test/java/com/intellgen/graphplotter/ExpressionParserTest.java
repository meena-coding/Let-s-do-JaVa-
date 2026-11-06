package com.intellgen.graphplotter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExpressionParserTest {
    @Test void evaluatesOperatorPrecedenceAndParentheses() {
        assertEquals(14.0, ExpressionParser.parse("2 + 3 * 4").evaluate(0));
        assertEquals(20.0, ExpressionParser.parse("(2 + 3) * 4").evaluate(0));
    }

    @Test void evaluatesVariableFunctionsAndScientificNotation() {
        assertEquals(7.0, ExpressionParser.parse("2*x + 1").evaluate(3));
        assertEquals(1.0, ExpressionParser.parse("sin(x)^2 + cos(x)^2").evaluate(0), 1e-12);
        assertEquals(0.001, ExpressionParser.parse("1e-3").evaluate(0), 1e-12);
    }

    @Test void supportsRightAssociativePowersAndUnaryMinus() {
        assertEquals(512.0, ExpressionParser.parse("2^3^2").evaluate(0));
        assertEquals(-4.0, ExpressionParser.parse("-2^2").evaluate(0));
    }

    @Test void returnsNanForUndefinedDomains() {
        assertTrue(Double.isNaN(ExpressionParser.parse("1 / x").evaluate(0)));
        assertTrue(Double.isNaN(ExpressionParser.parse("sqrt(x)").evaluate(-1)));
        assertTrue(Double.isNaN(ExpressionParser.parse("log(x)").evaluate(0)));
    }

    @Test void rejectsInvalidInputWithUsefulMessage() {
        ExpressionException exception = assertThrows(ExpressionException.class, () -> ExpressionParser.parse("sin x"));
        assertTrue(exception.getMessage().contains("Expected '('"));
    }
}
