import java.util.Random;
import java.util.Scanner;

public class prefect {
    public static void main(String[] args) {
      boolean result=back();
      if(result==false){
          System.out.println("不存在这本书");
      }
        System.out.println(result);
    }
    public static boolean back() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的第一兴趣值");
        int hobby = sc.nextInt();
        System.out.println("请输入你的第二兴趣值");
        int shoppy = sc.nextInt();
        int sum = hobby + shoppy;
        int arr[] = new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(30);
            if (sum == arr[i]) {
                System.out.println("这本书在第"+i+"个");;
                return true;
            }
        }
    return false;
    }
}