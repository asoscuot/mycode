package a20230819;

public class This01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("tom",3);
        dog1.info();
    }
}

class Dog{
    String name;
    int age;
    /*
    dname和dage可否直接写成属性名name和age？
   public Dog(String dname,int dage){
        name = dname;
        age = dage;
   }
   根据变量的作用域原则，构造器中的name和age是局部变量，相当于局部变量给局部变量赋值，因此会导致dog1调用info方法时仅仅完成默认初始化
   需要用This解决
     */
    public Dog(String name,int age){
        //this.name就是代表当前对象的name
        //this.age就是代表当前对象的age
        this.name = name;
        this.age = age;
    }

    public void info(){
        System.out.println(name + "\t" + age + "\t");
    }
}
