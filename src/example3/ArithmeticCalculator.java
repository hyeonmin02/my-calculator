package example3;
public class ArithmeticCalculator {
    public enum Operator {
        PLUS("+") {
            @Override
            public int apply(int a, int b) {
                return a + b;

            }
        },
        MINUS("-") {
            @Override
            public int apply (int a, int b) {
                return a - b;
            }
        },
        MULTIPLY("*") {
            @Override
            public int apply (int a, int b) {
                return a * b;
            }
        },
        DIVIDE("/") {
            @Override
            public int apply (int a, int b) {
                return  a / b;

            }
        };
        private final String symbol;
        Operator (String symbol) {
            this.symbol = symbol;
        }
        public abstract int apply (int a, int b);
    }
}
