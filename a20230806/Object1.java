package a20230806;

public class Object1 {
        public static void main(String[] args) {
                Cat cat1 = new Cat();
                cat1.name = "小白";
                cat1.age = 10;
                cat1.Color = "绿色";
                System.out.println("第一只猫的信息为" + cat1.name + "" + cat1.age + "" + cat1.Color + "");

                Cat cat2 = new Cat();
                cat2.name = "小花";
                cat2.age = 20;
                cat2.Color = "蓝色";
                System.out.println("第二只猫的信息为" + cat2.name + "" + cat2.age + "" + cat2.Color + "");
        }
}

class Cat {
        String name;
        int age;
        String Color;
}