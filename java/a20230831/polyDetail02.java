package a20230831;

public class polyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说，调用属性输出的值取决于对象的编译类型
        Base base = new Sub();//向上转型
        System.out.println(base.count);//编译类型是Base

        Sub sub = new Sub();
        System.out.println(sub.count);//编译类型是Sub
    }
}

class Base{
    public int count = 10;
}

class Sub extends Base{
    public int count = 20;
}