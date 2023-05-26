package week1_tasks;


    public class DivisionWithoutDivisionOperator {

        public static int divide(int dividend, int divisor) {
            // Check for division by zero
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            // Determine the sign of the result
            boolean isNegative = (dividend < 0) ^ (divisor < 0);

            // Convert dividend and divisor to positive values
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);

            // Initialize quotient and remainder
            int quotient = 0;
            int remainder = dividend;

            // Subtract divisor from remainder until it becomes less than divisor
            while (remainder >= divisor) {
                remainder -= divisor;
                quotient++;
            }

            // Apply the sign to the quotient
            if (isNegative) {
                quotient = -quotient;
            }

            return quotient;
        }

        public static void main(String[] args) {
            int dividend = 15;
            int divisor = 3;
            int result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        }
    }




