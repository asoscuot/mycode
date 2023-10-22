package a20230822;

//给定一个java程序如下，则编译结果是
public class Homework08 {
        int count = 9;

        public void count1(){
            count = 10;
            System.out.println("count1=" + count);
        }

        public void count2(){
            System.out.println("count1=" + count++);
        }
//任何一个类，都可以有main方法
        public static void main(String[] args) {
            new Homework08().count1();//匿名对象

            Homework08 t1 = new Homework08();
            t1.count2();
            t1.count2();
    }
}


/*
编译结果：
count1 = 10;
count1 = 9;
count1 = 10;
 */