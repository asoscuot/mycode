package a20230829;

public class Override01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}

class Animals{
    public void cry(){
        System.out.println("Animals的cry()方法被调用...");
    }
}

class Dog extends Animals{
    public void cry(){
        System.out.println("Dog的cry()方法被调用...");
    }
}
/*
dog是animals的子类
这两个类中的cry方法定义形式(包括名称，返回类型，参数)都一样
这是我们就说dog的cry方法，重写了animals的cry方法
 */
