package a20230830.polyDetail;

public class Cat extends animal{
    //方法重写
    public void eat(){
        System.out.println("子类的eat方法被调用...");
    }

    public void walk(){//子类的特有方法
        System.out.println("子类的特有walk方法被调用...");
    }
}
