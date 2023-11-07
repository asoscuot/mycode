package a20231021;

/**什么是单例模式
 * 1.所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
 * 并且该类只提供一个取得对象实例的方法
 * 2.单例模式有两种方式：饿汉式 和 懒汉式
 */

/**
 * 下面展示 饿汉式
 */
public class single01 {
    public static void main(String[] args) {
    //通过方法getInstance可以返回对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);
        /*
        instance和instance1是同一个对象
         */

        System.out.println(instance == instance1);//true

        //System.out.println(GirlFriend.n1);这里通过类名调用静态属性n1,这时GirlFriend类会被加载，private static GirlFriend gf = new GirlFriend("张佳玉");
        //这句话会被执行，因此gf就存在了。饿汉式可能造成创建了对象，但是没有使用
    }
}

class GirlFriend{
    private String name;

    //构造器私有化
    private GirlFriend(String name){
        this.name = name;
        System.out.println("构造器被调用...");
    }

    /*
    类的内部创建对象
    将这个对象创建为静态的
     */
    private static GirlFriend gf = new GirlFriend("张佳玉");

    //向外暴露一个静态的公共方法
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }

    //public static int n1 = 100;
}
/*
步骤如下：
1.构造器私有化
2.类的内部创建对象
3.向外暴露一个静态的公共方法
4.代码实现
 */
