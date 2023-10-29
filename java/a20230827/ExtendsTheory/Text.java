package a20230827.ExtendsTheory;

/**
 * 继承的本质
 */
public class Text {
    public static void main(String[] args) {
        son son = new son();//执行这句话时内存是如何布局的？
        /*
        要按照查找关系来来返回信息
        1.首先看子类是否有这个属性
        2.如果子类有这个属性，并且可以访问，则返回信息
        3.如果子类没有这个属性，就往上看父类有没有这个属性（如果父类有这个属性，并且可以访问，则返回信息）
        4.如果父类没有就一直往上找，直到Object，如果都没有，则报错
         */

        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}
class GrandPa{
    String name = "爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa{
    String name = "爸爸";
    int age = 39;
}

class son extends Father{
    String name = "儿子";
}
