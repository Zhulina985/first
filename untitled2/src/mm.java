public class mm {
    public static void main(String[] args) {
        Bar c1=new Bar("America", "BMW", 1000000);
        Bar c2=new Bar("China","Ford",200000);
        Bar c3=new Bar("England","Apollo",8000000);
        Bar[] cars=new Bar[]{c1,c2,c3};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        }
    }

class Bar{

    public String make;
    public String model;
    public int price;

    public Bar(String ma,String mo,int p){
        this.make=ma;
        this.model=mo;
        this.price=p;

    }
    public String toString(){
        return String.format("---Model:%s  Make:%s  Price:%d", model,make,price);
    }
}
