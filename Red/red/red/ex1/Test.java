package red.ex1;

public class Test {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(7);

        calculator.add(2);
        calculator.add(6);
        calculator.sub(1);
        calculator.mult(3);
        calculator.add(3);
        calculator.div(8);
        calculator.sub(1);
        calculator.pow(3);

        float result = calculator.getResult();
        System.out.println("Result is : "+result);
    }
}
