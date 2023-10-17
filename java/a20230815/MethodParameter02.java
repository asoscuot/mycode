package a20230815;

public class MethodParameter02 {
    public static void main(String[] args) {
        int []a =  {1,2,3};
        B b = new B();
        b.text100(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "\t");
        }
        System.out.println();

        Person person = new Person();
        person.age = 10;
        person.name = "jack";

        b.text200(person);
        System.out.println("person.age=" + person.age + " person.name=" + person.name);
    }
}

class B{
    //B类中编写一个Text100方法，接受一个数组，在方法中修改该数组，看原来的数组是否会发生变化
    public void text100(int []arr){
        arr[0] = 100;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();
    }
    //B类中编写一个方法text200，可以接受一个Person(age,sal)对象，在方法中修改该对象属性，看看原来的对象是否变化
    public void text200(Person P){
        P.age = 200;
        P.name = "tom";
    }
}

class Person{
    int age;
    String name;

}
