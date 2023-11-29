package a20230831;
//java的动态绑定机制，非常非常重要

public class polyDynamic {
    public static void main(String[] args) {
        //编译类型为A，运行类型为B
        A a = new B();
        System.out.println(a.sum());//输出40->30
        System.out.println(a.sum1());//输出30->20
    }
}

class A{
    public int i = 10;
    //动态绑定机制
    /*
    当调用对象方法的时候，该方法会和该对象的内存机制/运行类型相绑定
    当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
     */
    public int sum(){//字类和父类都有getI方法，调用哪个？
        return getI() + 10;
    }
    public int sum1(){
        return i + 10;
    }
    public int getI(){
        return i;
    }
}

class B extends A{
    public int i = 20;
//    public int sum(){
//        return i + 20;
//    }
    public int getI(){
        return i;
    }
//    public int sum1(){
//        return i + 10;
//    }
}
/*
假如把子类的sum()注销
假如把子类的sum1()注销
 */