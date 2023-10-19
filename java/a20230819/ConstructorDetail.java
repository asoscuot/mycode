package a20230819;

public class ConstructorDetail {
    public static void main(String[] args) {
        Person P1 = new Person("tom",20);
        Person P2 = new Person(25);

    }
}
class Person{
    //一个类可以定义多个构造器，构成构造器重载
    String name;
    int age;

    //第1个构造器
    public Person(String Pname,int Page){
        name = Pname;
        age = Page;
    }
    //第2个构造器
    public Person(int Page){
        age = Page;
    }
    //第3个构造器(无参构造器)
    public Person(){

    }
}
//构造器名和类名要相同
//构造器没有返回值
//构造器是完成对象的初始化，不是创建对象
//在创建对象时，系统自动调用该类的构造方法

//如果我们没有定义构造器，那么系统会自动给类生成一个默认无参构造器
//一旦我们定义了自己的构造器，那么原来默认的无参构造器就没有了，除非我们重新定义