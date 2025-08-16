interface MathOperations {

    int operate(int a, int b);
}

class SumOperation implements MathOperations {
    public int operate(int a, int b) {
        return a + b;
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        MathOperations sum = (a, b) -> a + b;
        MathOperations substract = (a, b) -> a - b;
        System.out.println("After addition using Lambda expression: " + sum.operate(4, 5));
        System.out.println("After substract using Lambda expression: " + substract.operate(14, 5));
    }
}
