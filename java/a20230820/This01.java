package a20230820;

public class This01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("大黄",3);
        System.out.println("dog1的hashcode=" + dog1.hashCode());

        Dog dog2 = new Dog("大壮",2);
        System.out.println("dog2的hashcode=" + dog2.hashCode());
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

//使用hashCode来看看对象的情况
        System.out.println("This.hashCode=" + this.hashCode());
    }

    public void info(){
        System.out.println(name + "\t" + age + "\t");
    }
}
//简单的说，哪个对象调用，this就代表哪个对象

