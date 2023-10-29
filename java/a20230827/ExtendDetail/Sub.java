package a20230827.ExtendDetail;

public class Sub extends Base{

    public Sub(){//无参构造器
        super("smith",20);
        System.out.println("Sub()子类无参构造器被调用...");
    }

    public Sub(String name){
        super("tom",10);
        System.out.println("Sub(String name)构造器被调用...");
    }

    //子类不能访问父类的私有属性和方法，只能通过父类的公有方法访问这些私有
    public void SayAttribute(){
        System.out.print("n1=" + n1 + "n2=" + n2 + "n3=" + n3);
        System.out.println("n4=" + GetN4());//只能通过父类的公有方法访问这些私有
    }

    public void SayMethod(){
        text100();
        text200();
        text300();

        Gettext400();//只能通过父类的公有方法访问这些私有
    }
}
