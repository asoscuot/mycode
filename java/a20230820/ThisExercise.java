package a20230820;

public class ThisExercise {
    public static void main(String[] args) {
        Person person1 = new Person("jack",15);
        Person person2 = new Person("jack",18);

        System.out.println(person1.CompareTo(person2));
    }
}
/*
定义Person类，里面有name，age属性，并提供CompareTo比较方法，用于判断和另一个人是否相等，
提供测试类TextExercise用于测试，名字和年龄完全一样就返回true
否则返回false
 */

class Person{
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean CompareTo(Person P2){
//        if(this.name == P2.name && this.age == P2.age){
//            return true;
//        }else{
//            return false;
//        }
        return this.name.equals(P2.name) && this.age == P2.age;
  }

}
