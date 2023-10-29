package a20230827.ExtendDetail;

public class Text {
    public static void main(String[] args) {
        Sub sub1 = new Sub();
        sub1.SayAttribute();
        sub1.SayMethod();

        System.out.println("=============");
        Sub sub2 = new Sub("jack");

    }
}
/*
1.子类不能访问父类的私有属性和方法，只能通过父类的公有方法访问这些私有成员
2.子类必须调用父类的构造器，完成父类的初始化
3.当创建子类对象时，不管是用子类哪一个构造器，默认情况下总会去调用父类的无参构造器
如果父类没有提供无参构造器，则必须在子类的构造器中用super()去指定父类的哪个构造器完成对父类的初始化工作
否则编译不会通过
4.如果希望指定去调用父类的某个构造器，则显式的调用一下：super(参数列表)
5.super在使用时，需要放在构造器第一行，super只能在构造器中使用
6.super()和this()都只能放在构造器第一行，因此这两个方法不能共存在一个构造器中
7.java所有类都是Object类的子类，Object是所有类的父类（输入ctrl + H 可以看到类的继承关系）
8、父类构造器的调用不局限于直接父类，将一直往上追溯直到Object类（顶级父类）
9.子类最多只能继承一个父类（指直接继承），java中是单继承机制
10.不能滥用继承，子类和父类之间必须满足逻辑关系
 */
