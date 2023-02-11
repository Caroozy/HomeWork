package Task14unit7;

public class E1 {
    public static void main(String[] args) {
        int[][]students=new int[3][10];
        int student1sum=0;
        int student2sum=0;
        int student3sum=0;
        String top="a";
        String bot="a";
        for(int i=0;i<students.length;i++){
            System.out.println("student "+(i+1)+" grades:");
            for(int id=0;id<students[i].length;id++){
                students[i][id]=(int)(Math.random()*41)+60;
                System.out.println(students[i][id]);
                if (i==0){
                    student1sum+=students[i][id];
                }else if(i==1){
                    student2sum+=students[i][id];
                }else{
                    student3sum+=students[i][id];
                }
            }
            System.out.println("_________________________________");
        }
        System.out.println("student 1 avg is: "+(student1sum/students[0].length));
        System.out.println("student 2 avg is: "+(student2sum/students[1].length));
        System.out.println("student 3 avg is: "+(student3sum/students[2].length));
        System.out.println("the class average is: "+((student1sum+student2sum+student3sum)/30));
        if ((student1sum)>(student2sum)){
            if (student3sum<student1sum){
                top="student 1";
                if (student2sum>student3sum){
                    bot="student 3";
                }else{
                    bot="student 2";
                }
            }else if(student3sum>student2sum){
                top="student 3";
                bot="student 2";
            }
        }else{
            if(student2sum>student3sum){
                top="student 2";
                if(student3sum>student1sum){
                    bot="student 1";
                }else{
                    bot="student 3";
                }
            }else{
                top="student 3";
                bot="student 1";
            }
        }
        System.out.println("the bottom student is "+bot+"  and the top student is "+top);
    }
}
