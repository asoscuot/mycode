package a20230829.poly01;
//编写一个程序，Master类中有一个Feed方法，可以完成给动物喂食的信息
public class Poly01 {
    public static void main(String[] args) {
        Master jack = new Master("jack");
        Dog dog1 = new Dog("狗1");
        Bone bone1 = new Bone("大棒骨");
        System.out.println(jack.feed(dog1,bone1));

        System.out.println("==========================");
        Master tom = new Master("tom");
        Cat cat1 = new Cat("猫1");
        Fish fish1 = new Fish("黄花鱼");
        System.out.println(tom.feed(cat1,fish1));

        //添加主人给猪喂食米饭
        System.out.println("==========");
        Pig pig1 = new Pig("佩琪");
        rice rice = new rice("米饭");
        System.out.println(jack.feed(pig1,rice));
    }
    //如果动物很多，食物很多，feed方法就会很多，会造成代码复用性不高
}
