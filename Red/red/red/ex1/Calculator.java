package red.ex1;

public class Calculator {

    private float result;

    public Calculator() {
    }

    public Calculator(float result) {
        this.result = result;
    }

    public void add(int value) {
        this.result += value;
    }

    public void sub(int value) {
        this.result -= value;
    }

    public void mult(int value) {
        this.result *= value;
    }

    public void div(int value) {
        this.result /= value;
    }

    public void pow(int value) {
        this.result = (float) Math.pow(this.result,value);
    }

    public float getResult() {
        return result;
    }

    public void abs() {
        this.result  = Math.abs(this.result);
    }
}
