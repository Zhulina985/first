import java.util.Scanner;

public class remanner {
    public static void main(String[] args) {
        System.out.println("选择2还是3");
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        switch (first){
            case 2:{
                System.out.println("请输入第一个数");
        int num1= sc.nextInt();
                System.out.println("请输入第二个数");
        int num2= sc.nextInt();
        int result=one(num1,num2);
                System.out.println(result);
                break;
            }
            case 3: {
                System.out.println("请输入第一个数");
                int num1 = sc.nextInt();
                System.out.println("请输入第二个数");
                int num2 = sc.nextInt();
                System.out.println("请输入第三个数");
                int num3 = sc.nextInt();
                int result = one(num1, num2,num3);
                System.out.println(result);
                break;}
            default:{
                System.out.println("无法计算");
                     break;
            }
        }
    }
    public static int one(int a,int b){
        int sum=a*b;
        return sum;
    }
    public static int one(int a,int b,int c) {
        int sum = a * b * c;
        return sum;
    }
}

