package series1;

public class Calculator {
    private float value;
    private float result=0;
    private float pow;

    public Calculator(float result) {
        this.result = result;
    }

    public void add(float value, float result){
        result+=value;
    }
    public void sub(float value,float result){
        result-=value;
    }
    public void mult(float value,float result){
        result*=value;
    }
    public void div(float value,float result){
        result/=value;
    }
    public void pow(float pow,float result){
        result=(int)(Math.pow(result,pow));
    }
    public float getResult(float result){
        return result;
    }
    public void absolute(float value,float result){
        if (value<0){
            result*=-1;
        }
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public float getPow() {
        return pow;
    }

    public void setPow(float pow) {
        this.pow = pow;
    }
}
