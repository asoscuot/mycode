package a20230828.ExtendsExercise01;


class A {
    A(){
        System.out.println("a");
    }

    A(String name){
        System.out.println("a name");
    }
}

class B extends A{
    B(){
        this("abc");//注意，有了this就不会有super了，所以这里不会调用A类的无参构造器
        System.out.println("b");
    }

    B(String name){
        System.out.println("b name");//通过this访问到这句话，从这里隐藏的super()才会调用A类的无参构造器
    }
}
