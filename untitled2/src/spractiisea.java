import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class spractiisea {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[6];
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入一个数");
            arr[i] =sc.nextInt();
            if(arr[i]>100|arr[i]<0){
                System.out.println("请重新输入");
                i=i-1;
            }
            else{
                arr[i]=arr[i];
                sum = sum + arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int MAX = max( arr);
        int MIN=min (arr);
        System.out.println("");

        System.out.println(sum);
        System.out.println(MAX);
        System.out.println(MIN);
    int result=(sum-MIN-MAX)/4;
        System.out.println(result);
    }
        public  static int max(int bit[]){
        int max;
        int a=0;
        for (int j = 0; j < bit.length; j++) {
            if (bit[a] < bit[j]) {
                bit[a] = bit[j];
            } else {
                bit[a] = bit[a];
            }
        }  max=bit[a];
    return max;
    }
    public  static int min(int biit[]){
        int min;
        int c=0;
        for (int j = 0; j < biit.length; j++) {
            if (biit[c] > biit[j]) {
                biit[c] = biit[j];
            } else {
                biit[c] = biit[c];
            }
        }  min=biit[c];
        return min;
    }
}

