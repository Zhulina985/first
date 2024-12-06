package uplevel;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bookshop {
    public static void main(String[] args) {
        ArrayList<method> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        logo();
        System.out.println("-----<-----<-----<-----<-----WELCOME----->----->----->----->-----");
        System.out.println("! Welcome to the Peter Bookshop !");
        System.out.println("");
        System.out.println("Before you use it,please let us know you are not a robot.\033[032m[-_-]\033[0m");
        System.out.println("So,please enter the verification code");
        System.out.println("\033[31mWarm:make sure it right,otherwise you can not use the system!!!\033[0m");
        System.out.println("");
        System.out.println("SOME BOOK");
        System.out.println("Name\t\t\t\t\t Type\t\t\t\t\tNumber\t\t\t\tPrice");
        method book1=new method("Robinson Crusoe","1","Adventure");
        book1.setPrice(20);
        method book2=new method("Three body1","2","Science");
        book2.setPrice(25);
        method book3=new method("Jane Eyre ","3","Plot");
        book3.setPrice(30);
        method book4=new method("Three body2","4","Science");
        book4.setPrice(30);
        method book5=new method("Little Prince","5","Adventure");
        book5.setPrice(17);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        for (int i = 0; i < list.size(); i++) {
            method start=list.get(i);
            System.out.println(start.getBook()+"\t\t\t\t"+start.getType() + "\t\t\t\t" + start.getLabel()+"\t\t\t\t"+start.getPrice()+"￥");
        }
    //The verification code
        System.out.println("The verification code:");
        boolean flag=true;
        do{
            String NewCode=code();
            System.out.println(NewCode);
            String sure= sc.next();
        if (sure.equalsIgnoreCase(NewCode)){
            flag=true;
            }else
            {
                System.out.println("\033[31mWrong\033[0m");
                System.out.println("\033[31mPlease input again\033[0m");
                flag=false;}
        }while (!flag);
            System.out.println("\033[034m------------------------------------------\033[0m");
            System.out.println("\033[34mSUCCESSFUL\033[0m");
    way:    while (true) {
            System.out.println("\033[034m------------------------------------------\033[0m");
            System.out.println("Please choose the way");
            System.out.println("1:Add the book information");
            System.out.println("2:Delete the book information");
            System.out.println("3:Check the book information");
            System.out.println("4:Change the book information");
            System.out.println("5:Get the book according to the type");
            System.out.println("6:Get the book according to the price");
            System.out.println("7:Instruction of each function");
            System.out.println("8:Exit");
            int chose = sc.nextInt();
            switch (chose) {
                case 1: {
                    System.out.println("Add");
                    add(list);
                    break;
                }
                case 2: {
                    System.out.println("Delete");
                    delete(list);
                    break;
                }
                case 3: {
                    System.out.println("Check");
                    broose(list);
                    break;
                }
                case 4: {
                    System.out.println("Change");
                    change(list);
                    break;
                }
                case 5: {
                    System.out.println("GetType");
                    hobby(list);
                    break;
                }
                case 6: {
                    System.out.println("GetPrice");
                    price(list);
                    break;
                    }
                case 7: {
                    System.out.println("Instruction");
                    System.out.println("Please choose the way you want to know");
                    System.out.println("1,2,3,4,5,6,7,8");
                    instruction();
                    break;
                    }
                case 8: {
                    ;System.out.println("Exit");
                    break way;
                }
                default:{
                    System.out.println("\033[31mWrong\033[0m");
                    System.out.println("\033[31mPlease rechose\033[0m");
                    break;
                    }
                }
            }
    }
    //CHECK
    public static void broose(ArrayList<method> list) {
        if (list.size() == 0) {
            System.out.println("Not data available");
        } else {
            System.out.println("Name\t\t\t\t\t Type\t\t\t\t\tNumber\t\t\t\tPrice");
            for (int i = 0; i < list.size(); i++) {
                method book = list.get(i);
                System.out.println(book.getBook()+"\t\t\t\t"+book.getType() + "\t\t\t\t" + book.getLabel()+"\t\t\t\t"+book.getPrice()+"￥");
            }
        }
    }
    //ADD
    public static void add(ArrayList<method> list) {
        method book = new method();
        Scanner sc = new Scanner(System.in);
        System.out.println("Add book name");
        String name = sc.next();
        book.setBook(name);
        System.out.println("Add book type");
        String type = sc.next();
        book.setType(type);
        boolean flag = true;
        String input;
        do {
            System.out.print("Add book number ");
            input = sc.next();
            for (int i=0;i<list.size();i++) {
                method example=list.get(i);
                if (input.equals(example.getLabel()) ) {
                    System.out.println("\033[34mThe number exits\033[0m");
                    System.out.println("\033[34mPlease input again\033[0m");
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
        } while (!flag);
        book.setLabel(input);

        System.out.println("Add book price");
        int price= sc.nextInt();
        book.setPrice(price);
        list.add(book);
    }
    //DELETE+NUMBER
    public static void delete(ArrayList<method> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add the number");
        String label = sc.next();
        int num = labelGet(list, label);
        if (check(list, label)) {
            list.remove(num);
            System.out.println("Delete the book with the number"+label);
        } else {
            System.out.println("The number does not exist");
        }
    }

    public static boolean check(ArrayList<method> list, String label) {
        int b = labelGet(list, label);
        if (b == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static int labelGet(ArrayList<method> list, String label) {
        for (int i = 0; i < list.size(); i++) {
            method book = list.get(i);
            String realLabel = book.getLabel();
            if (realLabel.equals(label)) {
                return i;
            }
        }
        return -1;
    }
    //CHANGE
    public static void change(ArrayList<method> list) {
        method book = new method();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the book number you want to change");
        String label = sc.next();
        int num = labelGet(list, label);
        if (check(list, label)) {
            book = list.get(num);
            System.out.println("Please input the name");
            String name = sc.next();
            book.setBook(name);
            System.out.println("Please input the type");
            String type = sc.next();
            book.setType(type);
            System.out.println("Please input the price");
            int price=sc.nextInt();
            book.setPrice(price);

        }
    }
    //TYPE
    public static void hobby(ArrayList<method>list){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input the type");
        String hobby=sc.next();
        System.out.println("Name\t\t Type\t\tNumber\t\tPrice");
        for (int i = 0; i < list.size(); i++) {
        method book=list.get(i);
        String hobbyType=book.getType();
            if(hobby.equals(hobbyType)){
            System.out.println(book.getBook()+"\t\t"+book.getType()+"\t\t"+book.getLabel()+"\t\t\t"+book.getPrice());
            }
        }
    }
    //PRICE
    public static void price(ArrayList<method>list){
     Scanner sc=new Scanner(System.in);
        System.out.println("Please input the max price");
        int maxPrice= sc.nextInt();;
        System.out.println("Please input the min price");
        int minPrice= sc.nextInt();
        System.out.println("Name\t\t type\t\tnumber\t\tprice");;
        for (int i = 0; i < list.size(); i++) {
            method book=list.get(i);
            int priceGet=book.getPrice();
            if(priceGet>=minPrice&priceGet<=maxPrice){
                System.out.println(book.getBook()+"\t\t"+book.getType()+"\t\t"+book.getLabel()+"\t\t\t"+book.getPrice()+"￥");
            }
        }
    }
    //VERIFICATION CODE
    public static String code(){
        StringBuilder sb=new StringBuilder(4);
        for (int i = 0; i < sb.capacity()-1; i++) {
            Random code=new Random();
           sb.append(code.nextInt(10));
        }
        Random r=new Random();
        char l=(char)(r.nextInt(26)+65);
        sb.append(l);
        return sb.toString();
    }
    //LOGO
    public static void logo(){
        System.out.println("[\033[34m ********       *********      ***********         *********          **********  \033[0m  ]      ");
        System.out.println("[\033[34m **     **      **                  *              **                 **       ** \033[0m  ]      ");
        System.out.println("[\033[34m **     **      **                  *              **                 **       ** \033[0m  ]     ");
        System.out.println("[\033[34m *******        *********           *              *********          *********   \033[0m  ]    ");
        System.out.println("[\033[34m **             **                  *              **                 ****        \033[0m  ]    ");
        System.out.println("[\033[34m **             **                  *              **                 **  ****    \033[0m  ]    ");
        System.out.println("[\033[34m **             *********           *              *********          **      ****\033[0m  ]    ");
        System.out.println("");
        System.out.println("");
        System.out.println("  [ \033[32m  ********      **          **             *****            ********  \033[0m]                 ");
        System.out.println("  [ \033[32m *              **          **          **       **         **     ** \033[0m]      ");
        System.out.println("  [ \033[32m   **           **          **        **           **       **     ** \033[0m]      ");
        System.out.println("  [ \033[32m     **         **************       **             **      *******   \033[0m]   ");
        System.out.println("  [ \033[32m      **        **          **        **           **       **        \033[0m]    ");
        System.out.println("  [ \033[32m        *       **          **          **       **         **        \033[0m]    ");
        System.out.println("  [ \033[32m ********       **          **             *****            **        \033[0m]    ");


    }
    //INSTRUCTION
    public static void instruction(){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        switch (num){
            case 1->{
                System.out.println("Add information about a book, name, type, price and number.");
                System.out.println( "Please make sure the number is not repeated.");

            }
            case 2->{
                System.out.println("Select a book you want to delete and enter the number to delete it.");
            }
            case 3->{
                System.out.println("Display information about all books.");
            }
            case 4->{
                System.out.println("Select a book you want to change and enter the number,");
                System.out.println("You can change its name,type and price.");
            }
            case 5->{
                System.out.println("Input the type.");
                System.out.println("All of these types of books will show up.");
            }
            case 6->{
                System.out.println("Input the max price and min price.");
                System.out.println("All the books in this price range will show up.");
            }
            case 7->{
                System.out.println("Instruction of various methods.");
            }
            case 8->{
                System.out.println("End the whole system.");
            }
            default -> {
                System.out.println("We do not have this method.");
            }
        }
    }
}





