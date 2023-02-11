import java.util.Scanner;

public class Simulation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("this is a tic-tac-toe game");
        System.out.println("x starts");
        char[][] arr = new char[3][3];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int id = 0; id < arr[i].length; id++) {
                arr[i][id] = Integer.toString(count).charAt(0);
                ;
                count++;
            }
        }
        print(arr);
        boolean xwin = false;
        boolean owin = false;
        char player='x';
        while (!win(arr)){
            System.out.println("choose a number on the board");
            String index= scanner.next();
            char idx=index.charAt(0);
            while (check(arr,idx)==false){
                System.out.println("choose a number on the board");
                index= scanner.next();
                idx=index.charAt(0);
            }
            placer(arr,idx,player);
            if (player=='x'){
                player='o';
            }else{
                player='x';
            }
            print(arr);
        }
        if (player=='x'){
            System.out.println("o wins");
        }else {
            System.out.println("x wins");
        }
    }
    public static boolean check(char[][]arr,char idx){
        boolean check=false;
        for (int i=0;i< arr.length;i++){
            for (int id=0;id<arr[i].length;id++){
                if (idx==arr[i][id]){
                    check=true;
                }
            }
        }
        return check;
    }
    public static void print(char[][]arr){
        for (int i=0;i< arr.length;i++){
            System.out.print("|");
            for (int id=0;id<arr[i].length;id++){
                System.out.print(arr[i][id]+"|");
            }
            System.out.println();
        }
    }
    public static void placer(char[][]arr,char idx,char player){
        for (int i=0;i< arr.length;i++){
            for (int id=0;id< arr.length;id++){
                if (arr[i][id]==idx){
                    arr[i][id]=player;
                }
            }
        }
    }
    public static boolean win(char[][]arr){
        boolean win =true;
        for (int i=0;i< arr.length;i++){
            for (int id=1;id< arr[i].length;id++){
                if (arr[i][id]!=arr[i][id-1]){
                    win=false;
                    break;
                }
            }
            if (!win){
                win=true;
            }else {
                return true;
            }
        }
        for (int i=0;i<arr[0].length;i++){
            for (int id=1;id< arr.length;id++){
                if (arr[id][i]!=arr[id-1][i]){
                    win=false;
                    break;
                }
            }
            if (!win){
                win=true;
            }else {
                return true;
            }
        }
        for (int i=1;i< arr.length;i++){
            if (arr[i][i]!=arr[i-1][i-1]){
                win=false;
            }
        }
        return win;
    }
}
