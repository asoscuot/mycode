package a20230818;

public class Constructor01 {
    //在创建人类对象时，直接指定这个对象的年龄和姓名
    public static void main(String[] args) {
        person P = new person("smith", 80);
        System.out.println("P的信息如下：name=" + P.name + " age=" + P.age);
    }
}

class person{
    String name;
    int age;
    //构造器
    public person(String pname, int page) {
        System.out.println("构造器被调用");
     name = pname;
     age = page;
    }
}
