package a20230828.ExtendsExercise02;

class A {
    public A(){
        System.out.println("我是A类的无参构造器");
    }
}

class B extends A{
    public B(){
        System.out.println("我是B类的无参构造器");
    }
    public B(String name){
        System.out.println(name + "我是B类的B(String name)构造器");
    }
}

class C extends B{
    public C(){
        this("hello");
        System.out.println("我是C类的无参构造器");
    }
    public C(String name){
        super("hi");
        System.out.println("我是C类的C(String name)构造器");
    }
}
