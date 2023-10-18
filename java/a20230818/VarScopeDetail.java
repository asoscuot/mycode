package a20230818;

public class VarScopeDetail {
    public static void main(String[] args) {
        //属性和局部变量可以重名，访问时遵循就近原则
        //在同一个作用域中，比如在两个成员方法中，两个局部变量不能重名
        //属性伴随着对象的创建而创建，伴随对象的销毁而销毁。局部变量伴随着它的代码块的执行而创建，伴随着代码块结束而销毁
        //全局变量可以被本类使用，或者被其他类使用（通过对象调用）
        //属性可以加访问修饰符，局部变量不可以
        T t = new T();
        t.test();

        Person P = new Person();//通过对像访问属性
        t.test2(P);

    }
}
class T{
    Person P1 = new Person();//通过对象访问属性
    public void test(){
        System.out.println(P1.name);
    }

    public void test2(Person P){
        System.out.println(P.name);
    }
}

class Person{
    String name = "jack";
    public void say(){
        System.out.println("name=" + name);
    }
}
