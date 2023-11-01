package a20230829;
/*
1.编写一个person类，包括属性private(name，age)，构造器，方法say(返回自我介绍的字符串
2。编写一个student类，继承Person类，增加id，score等private属性，以机构造器，定义say()方法，返回自我介绍的信息
3.在main中，分别创建person和student对象，调用say方法输出自我介绍
 */
public class OverrideExercise01 {
    public static void main(String[] args) {
        Person smith = new Person("smith", 20);
        System.out.println(smith.say());
        System.out.println("======================");
        student tom = new student("tom", 25, 123, 80);
        System.out.println(tom.say());
    }
}

class Person{
    private String name;
    private int age;

//    public Person() {
//    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say(){
        return "名字" + name + "年龄为" + age;
    }
}
