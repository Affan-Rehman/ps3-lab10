package expressivo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExpressionTest {

    @Test
    public void testSumExpression() {
        // Test SumExpression
        Expression expr1 = new SumExpression(new NumberExpression(3), new NumberExpression(4));
        System.out.println("expr1 (Sum): " + expr1.toString());
        assertEquals("3.0 + 4.0", expr1.toString());
    }

    @Test
    public void testProductExpression() {
        // Test ProductExpression
        Expression expr2 = new ProductExpression(new NumberExpression(5), new NumberExpression(6));
        System.out.println("expr2 (Product): " + expr2.toString());
        assertEquals("5.0 * 6.0", expr2.toString());
    }

    @Test
    public void testEquality() {
        // Test equality
        Expression expr3 = new SumExpression(new NumberExpression(3), new NumberExpression(4));
        Expression expr4 = new SumExpression(new NumberExpression(3), new NumberExpression(4));
        Expression expr5 = new ProductExpression(new NumberExpression(5), new NumberExpression(6));

        System.out.println("Are expr3 and expr4 equal? " + expr3.equals(expr4)); // Should be true
        System.out.println("Are expr1 and expr5 equal? " + expr3.equals(expr5)); // Should be false

        assertTrue(expr3.equals(expr4));  // Should be true
        assertFalse(expr3.equals(expr5)); // Should be false
    }

    @Test
    public void testHashCode() {
        // Test hashCode
        Expression expr6 = new SumExpression(new NumberExpression(3), new NumberExpression(4));
        Expression expr7 = new SumExpression(new NumberExpression(3), new NumberExpression(4));

        System.out.println("HashCode of expr6 and expr7: " + (expr6.hashCode() == expr7.hashCode())); // Should be true
        assertEquals(expr6.hashCode(), expr7.hashCode()); // Should be equal
    }
}
