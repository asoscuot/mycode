package a20230828.SuperDetail;

public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }

    public void Cal(){
        System.out.println("A类的Cal()方法被调用...");
    }
}

class B extends A{
    public void Sum(){
        System.out.println("B类的Sum()方法被调用...");

        //想调用父类A的Cal()方法
        //这时，因为子类B没有Cal()方法，因此可以用下面三种方式
        Cal();
        this.Cal();
        super.Cal();
        /*
        找Cal()方法时，顺序是：
        1.先找本类，如果有，则调用
        2.如果没有，则找父类，如果有，并且可以调用，则调用
        3.如果直接父类没有，则继续找父类的父类，整个规则是一样的，直到Object类
        注意：查找方法的过程中，找到了但是是私有的不能访问，则报错
             查找方法的过程中，没找到，则提示方法不存在
             super.Cal();找Cal()方法的顺序是直接查找父类，其它的规则一样
        访问属性也遵循以上规则
         */
    }
}
/*
super可以访问父类的非private属性与方法
super给编程带来的好处：
1.调用父类构造器的好处：分工明确，父类属性由父类初始化，紫雷属性由子类初始化
2.当子类中有和父类中的成员重名时，为了访问父类的成员，必须通过super，如果没有重名
使用super，this，直接访问是一样的效果
3.super访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员
如果多个上级类都有同名的成员，使用super遵循就近原则，也需要遵守访问权限的相关规则
 */