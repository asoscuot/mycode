package a20230830.polyDetail;

public class Test {
    public static void main(String[] args) {
        animal animal = new Cat();//向上转型，将一个父类的引用指向一个子类的对象

        animal.eat();//animal可以调用父类的所有成员（需要遵守访问权限）
        animal.show();//但是不能调用子类的特有成员
        animal.cry();//最终运行效果从运行类型（子类）开始具体实现，遵守继承的方法调用原则
        animal.sleep();

        //如果想要调用子类的特有成员walk该怎么做？
        Cat cat = (Cat) animal;//向下转型 语法：子类类型 子类引用 = (子类类型) 父类引用
        cat.walk();//要求父类的引用必须指向的是当前目标类型的对象
        //向下转型后可以调用子类的所有成员
    }
}
/*
多态的前提是：两个对象存在继承关系
多态的向上转型
多态的向下转型
 */
