package a20230901;



public class Equals {
    public static void main(String[] args) {
        A a = new A();
        A aa = a;
        A aaa = aa;
        System.out.println(a == aa);//true
        System.out.println(a == aaa);//true

        B b = aaa;//向上转型
        System.out.println(b == a);//true

        A c = new A();
        System.out.println(c == a);//false

        System.out.println("hello".equals("abc"));//false
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1.equals(integer2));//true
        System.out.println(integer1 == integer2);//false

        String str1 = new String("男神梁松涛");
        String str2 = new String("男神梁松涛");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

    }
}

/*
== 是一个比较运算符
1.即可以判断基本类型，又可以判断引用类型
2.如果判断的是基本类型，判断的是值是否相等
3.如果判断的是引用类型，判断的是地址是否相等，即判定是否是同一个对象
 */

/*
equals 是Object类中的一个方法，只能判断引用类型
如何查看jdk源码？ctrl + b
默认判断的是地址是否相等，即判断两个对象是都是同一个对象，子类中往往重写该方法，用于判断内容是否相等
 */
class A extends B{
}

class B{
}
//真是辛苦