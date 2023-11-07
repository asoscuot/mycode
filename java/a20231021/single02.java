package a20231021;

/**
 * 演示懒汉式
 */
public class single02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}

class Cat{

    public static int n1 = 100;
    private String name;
    private static Cat cat;
/*
步骤：
1.依然构造器私有化
2.定义一个static的静态属性对象
3.提供一个公共的static方法，可以返回一个Cat对象
4.懒汉式，只有当用户使用getInstance时，才返回Cat对象，然后再次调用时，会返回上次创建的Cat对象
从而保证了单例模式
 */

    private Cat(String name){
        this.name = name;
        System.out.println("构造器被调用...");
    }

    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat("小猫");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
/*饿汉式vs懒汉式
1.二者最主要的区别在于创建对象的时机不同：饿汉式是在类加载时就创建了对象实例，而懒汉式是在使用时才创建
2.饿汉式不存在线程安全问题，懒汉式存在线程安全问题
3.饿汉式存在浪费资源的可能，因为如果程序员一个对象实例都没有使用，那么饿汉式创建的对象就浪费了，懒汉式是使用时才创建，就不存在这个问题
 */
