package a20230820;

public class ThisDetail {
    public static void main(String[] args) {
        T t1 = new T();
        t1.f2();
    }
}
//1.this关键字可以用来访问本类的属性，方法和构造器
//2.this用来区分当前类的属性和局部变量

class T{
    //3.访问成员方法的语法：this.方法名(参数列表)
    public void f1(){
        System.out.println("f1()方法被调用...");
    }

    public void f2(){
        System.out.println("f2()方法被调用...");

        //这里调用f1()方法，第一种方式
        f1();
        //第二种方法
        this.f1();//访问成员方法的语法：this.方法名(参数列表)
    }

    //4.访问构造器语法this(参数列表),注意只能在构造器中使用(只能在构造器中访问另外一个构造器)
    //注意：访问构造器语法this(参数列表)必须放在第一条语句

    public T(){
        this("tom",20);
        System.out.println("无参构造器被调用...");
    }

    public T(String name,int age){
        System.out.println("String name,int age参数构造器被调用...");
    }
    //this不能在类定义的外部使用，只能在类定义的方法中使用
}