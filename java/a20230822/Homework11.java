package a20230822;

public class Homework11 {
    public static void main(String[] args) {
        Employee e1 = new Employee("tom","男",28,"员工",2000);
        Employee e2 = new Employee("jack","男",25);
        Employee e3 = new Employee("员工",3000);
    }
}
//创建一个Employee类，属性有名字，性别，年龄，职位，薪水，提供三个构造器
//可以初始化（1）名字，性别，年龄，职位，薪水
//（2）名字，性别，年龄
//（3）职位，薪水
//要求充分复用构造器

class Employee{
    String name;
    String sex;
    int age;
    String position;
    double sal;
//提高复用性，先写属性少的构造器
    public Employee(String position, double sal) {
        this.position = position;
        this.sal = sal;
    }

    public Employee(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String name,String sex, int age, String position, double sal){
        this(name,sex,age);
        this.position = position;
        this.sal = sal;
    }
}
