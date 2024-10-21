public class compare {
    public static void main(String[] args) {
        int need=fang(10,30,30,2);
        System.out.println(need);
    }
    public  static int fang(int c1,int k1,int c2,int k2){
       int s1=c1*k1;
        int s2=c2*k2;
        int max=(s1>s2?s1:s2);
        return max;
    }


}
