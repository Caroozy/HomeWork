package Task14unit1;

public class E2 {
    public static void main(String[] args) {
        String name ="john bryce";
        int length=name.length();
        int count=0;
        for(int i=0; i<length;i++){
            if(name.charAt(i)=='a'|| name.charAt(i)=='e'|| name.charAt(i)=='o'|| name.charAt(i)=='i'|| name.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("number of ahoi characters are "+count);

    }
}
