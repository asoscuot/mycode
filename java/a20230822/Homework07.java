package a20230822;

public class Homework07 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("大壮","绿色",2);
        dog1.show();
        Dog dog2 = new Dog("小壮","黑色",3);
        dog2.show();
    }
}
//设计一个dog类，有名字，颜色，年龄属性，定义输出方法show()显示该信息，并创建对象进行测试
class Dog{
    String name;
    String color;
    int age;

    public Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show(){
        System.out.println("这只狗的信息为：" + "名字=" + this.name + "颜色" + this.color +
                "年龄" + this.age);
    }
}
