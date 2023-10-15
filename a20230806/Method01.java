package a20230806;

public class Method01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speck();
        int returnRes = p1.getSum(20,30);
        System.out.println("调用了getSun方法返回了值" + returnRes);
    }
}

class Person {
    String name;
    int age;

    public void speck(){
        System.out.println("我是一个好人");
    }
    //编写一个方法返回一个参数
    public int getSum(int num1,int num2){
        int res = num1 + num2;
        return res;
    }
}