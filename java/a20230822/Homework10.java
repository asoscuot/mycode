package a20230822;

//试写出以下代码的运行结果
class Homework10 {
     int i = 100;

     public void m(){
         int j = i++;

         System.out.println("i=" + i);
         System.out.println("j=" + j);
     }
}

class Text{
    public static void main(String[] args) {
        Homework10 t1 = new Homework10();
        Homework10 t2 = t1;

        t2.m();
        System.out.println(t1.i);
        System.out.println(t2.i);
    }
}
/*
输出结果：
i=101;
j=100;
101;
101;
 */