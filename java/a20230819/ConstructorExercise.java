package a20230819;

public class ConstructorExercise {
    public static void main(String[] args) {
        person p1 = new person();//走第一个构造器
        System.out.println("p1的信息 name=" + p1.name + " age=" + p1.age);

        person p2 = new person("tom",35);//走第二个构造器
        System.out.println("p2的信息 name=" + p2.name + " age=" + p2.age);

    }
}
//定义一个person类
class person{
    String name;
    int age;

    //创建一个无参构造器，将所有人的年龄属性初始值设置为18
    public person(){
        age = 18;
    }

    //创建一个带以上两个参数的构造器，使得每次创建person对象时同时初始化name和age的值
    public person(String Pname,int Page){
        name = Pname;
        age = Page;
    }
}

/*
创建对象的流程如下：
1.在方法区中加载person类信息（只会加载一次）
2.在堆中分配空间（地址）
3.完成对象的初始化，顺序如下：
    3.1默认初始化，以上面为例，name=null，age=0
    3.2显式初始化，相当于给属性赋值
    3.3构造器的初始化 age=18
4.把对象在堆中的地址返回给对象名，如上面的p1 p2
*/
