import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class twocolor {
    public static void main(String[] args) {
        while(true){
        int red = RED();
        int blue = BLUE();
        System.out.println("中了" + red + "个红球");
        System.out.println("中了" + blue + "个蓝球");
        if (red <= 2 & blue == 1) {
            System.out.println("5元");
        } else if (red == 3 & blue == 1) {
            System.out.println("10元");
        } else if (red == 4 & blue == 0) {
            System.out.println("10元");
        } else if (red == 4 & blue == 1) {
            System.out.println("200元");
        } else if (red == 5 & blue == 0) {
            System.out.println("200元");
        } else if (red == 5 & blue == 1) {
            System.out.println("3000元");
        } else if (red == 6 & blue == 0) {
            System.out.println("500万元");
        } else if (red == 6 & blue == 1) {
            System.out.println("1000万元");
        } else {
            System.out.println("很遗憾没有中奖");
        }
    }
    }
    public  static int RED(){
        System.out.println("请从1-33之间输入数字");
     int arr[]=new int[6];
     Random r=new Random();
     for (int i = 0; i < arr.length; i++) {
         arr[i] = r.nextInt(33) + 1;
     }
     Scanner sc=new Scanner(System.in);
       int count=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个红球");

            int a=sc.nextInt();
            if(arr[i]==a){
                count++;
               arr[i]=0;
            }
        }
    return count;
    }
   public static int BLUE(){
       System.out.println("请从1-16之间输入数字");
        Random r=new Random();
        int b=r.nextInt(16)+1;
        int c;
        Scanner sc=new Scanner(System.in);
       System.out.println("请输入蓝球");
        int last=sc.nextInt();
        if(last==b){
            c=1;
        }else {c=0;}
    return c;
    }
}

