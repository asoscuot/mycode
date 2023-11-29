package a20230831;

public class polyExercise01 {
    public static void main(String[] args) {
        Sub1 sub = new Sub1();
        System.out.println(sub.count);
        sub.display();
        Base1 b = sub;//向上转型
        System.out.println(b==sub);
        System.out.println(b.count);
        b.display();
    }
}
class Base1{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub1 extends Base1{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
/*
20;
20;
true；
10；
20；
 */
