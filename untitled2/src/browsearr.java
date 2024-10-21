public class browsearr {
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
    }
   public static void newarr(int arr[]){
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
       int a=0;
       for (int j = 0; j < arr.length; j++) {
           if(arr[a]<arr[j]){
               arr[a]=arr[j];}
            else {arr[a]=arr[a];}

       }
    }
}
