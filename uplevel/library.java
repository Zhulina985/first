package uplevel;
import java.util.ArrayList;
import java.util.Scanner;
public class library {
    public static void main(String[] args) {
        ArrayList<method> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        way:
        while (true) {
            System.out.println("请选择你要用的方法");
            System.out.println("1:添加书本信息");
            System.out.println("2:删除书本信息");
            System.out.println("3:查询书本信息");
            System.out.println("4:修改书本信息");
            System.out.println("5:退出");
            System.out.println("6:填写类型帮助你获取书本");
            int chose = sc.nextInt();
            switch (chose) {
                case 1: {
                    System.out.println("添加");
                    add(list);
                    break;
                }
                case 2: {
                    System.out.println("删除");
                    delete(list);
                    break;
                }
                case 3: {
                    System.out.println("查询");
                    broose(list);
                    break;
                }
                case 4: {
                    System.out.println("修改");
                    change(list);
                    break;
                }
                case 5: {
                    System.out.println("退出");
                    break way;

                }
                case 6:{
                    hobby(list);
                }
            }
        }
    }
    //方法使用
    //遍历数组
    public static void broose(ArrayList<method> list) {
        if (list.size() == 0) {
            System.out.println("暂无数据");
        } else {
            System.out.println("书名\t 类型\t序号");
            for (int i = 0; i < list.size(); i++) {
                method book = list.get(i);
                System.out.println(book.getBook()+"\t"+book.getType() + "\t" + book.getLabel());
            }
        }
    }
    //增加
    public static void add(ArrayList<method> list) {
        method book = new method();
        Scanner sc = new Scanner(System.in);

        System.out.println("加入书名");
        String name = sc.next();
        book.setBook(name);
        System.out.println("加入类型");
        String type = sc.next();
        book.setType(type);
        System.out.println("加入标签");
        String lable = sc.next();
        book.setLabel(lable);
        list.add(book);
    }
    //删除+标签的搜索
    public static void delete(ArrayList<method> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入标签");
        String label = sc.next();
        int num = labelGet(list, label);
        if (check(list, label)) {
            list.remove(num);
            System.out.println("删除了编号为" + label + "的标签");
        } else {
            System.out.println("不存在这个标签");
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
    //修改
    public static void change(ArrayList<method> list) {
        method book = new method();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想改动的标签");
        String label = sc.next();
        int num = labelGet(list, label);
        if (check(list, label)) {
            book = list.get(num);
            System.out.println("请重新输入书的名称");
            String name = sc.next();
            book.setBook(name);
            System.out.println("请重新输入书的类型");
            String type = sc.next();
            book.setType(type);
        }
    }
    //爱好
    public static void hobby(ArrayList<method>list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的爱好");
        String hobby=sc.next();
        for (int i = 0; i < list.size(); i++) {
        method book=list.get(i);
        String hobbyType=book.getType();
        if(hobby.equals(hobbyType)){
            System.out.println(book.getBook()+"     "+book.getType()+"        "+book.getLabel());
            }
        }
    }
}


