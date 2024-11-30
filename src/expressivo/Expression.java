package expressivo;
import java.util.Objects;

/**
 * Immutable, recursive abstract data type for mathematical expressions.
 * Supported operations include addition, multiplication, numeric constants, and variables.
 */

/**
 * The Expression interface defines the structure for all expressions.
 * Each expression type should implement this interface.
 */
public interface Expression {
    String toString();
    boolean equals(Object obj);
    int hashCode();
}

/**
 * A concrete class representing an addition expression (e.g., "1 + 2").
 */
class SumExpression implements Expression {
    private final Expression left;
    private final Expression right;

    /**
     * Constructs a SumExpression with two operands (left and right).
     *
     * @param left  The left operand of the addition expression.
     * @param right The right operand of the addition expression.
     */
    public SumExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Returns a string representation of the addition expression.
     * 
     * @return A string representation of the expression.
     */
    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }

    /**
     * Checks if two SumExpression objects are structurally equal.
     * 
     * @param obj The object to compare this instance with.
     * @return true if the two expressions are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SumExpression that = (SumExpression) obj;
        return left.equals(that.left) && right.equals(that.right);
    }

    /**
     * Computes the hash code for this SumExpression.
     * 
     * @return A hash code for this expression.
     */
    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}

/**
 * A concrete class representing a multiplication expression (e.g., "1 * 2").
 */
class ProductExpression implements Expression {
    private final Expression left;
    private final Expression right;

    /**
     * Constructs a ProductExpression with two operands (left and right).
     *
     * @param left  The left operand of the multiplication expression.
     * @param right The right operand of the multiplication expression.
     */
    public ProductExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Returns a string representation of the multiplication expression.
     * 
     * @return A string representation of the expression.
     */
    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }

    /**
     * Checks if two ProductExpression objects are structurally equal.
     * 
     * @param obj The object to compare this instance with.
     * @return true if the two expressions are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProductExpression that = (ProductExpression) obj;
        return left.equals(that.left) && right.equals(that.right);
    }

    /**
     * Computes the hash code for this ProductExpression.
     * 
     * @return A hash code for this expression.
     */
    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}

/**
 * A concrete class representing a number expression (e.g., "1").
 */
class NumberExpression implements Expression {
    private final double value;

    /**
     * Constructs a NumberExpression with a specific value.
     *
     * @param value The numeric value.
     */
    public NumberExpression(double value) {
        this.value = value;
    }

    /**
     * Returns a string representation of the number expression.
     * 
     * @return A string representation of the value.
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Checks if two NumberExpression objects are equal.
     * 
     * @param obj The object to compare this instance with.
     * @return true if the two expressions are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        NumberExpression that = (NumberExpression) obj;
        return Double.compare(that.value, value) == 0;
    }

    /**
     * Computes the hash code for this NumberExpression.
     * 
     * @return A hash code for this expression.
     */
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}