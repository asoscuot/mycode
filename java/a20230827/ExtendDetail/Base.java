package a20230827.ExtendDetail;

public class Base {//父类
    //用四种访问修饰符定义的属性和方法
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base(){//无参构造器
        System.out.println("Base()父类构造器被调用...");
    }

    public Base(String name,int age){
        System.out.println("Base(String name,int age)构造器被调用...");
    }

    //父类提供的在子类中访问私有属性的公有方法
    public int GetN4(){
        return n4;
    }

    public void text100(){
        System.out.println("text100");
    }

    protected void text200(){
        System.out.println("text200");
    }

    void text300(){
        System.out.println("text300");
    }

    private void text400(){
        System.out.println("text400");
    }

    //父类提供的在子类中访问私有方法的公有方法
    public void Gettext400(){
        text400();
    }
}
