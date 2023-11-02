package a20230830.polyObject;

public class polyObject {
    public static void main(String[] args) {
        //体验对象多态特点

        Animals animal = new Dog();//编译类型是Animals，运行类型是Dog
        animal.cry();//因为运行类型是Dog，所以执行的是Dog类的cry方法

        animal = new Cat();//把animal的运行类型变为了Cat
        animal.cry();//执行的是Cat类的cry方法
    }
}
/*
重要的几句话：
1.一个对象的编译类型和运行类型可以不一致
2.编译类型在定义时就确定了，不能改变
3.运行类型是可以变化的
4.编译类型看定义时 = 号的左边，运行类型看定义时 = 号的右边
 */
