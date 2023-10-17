package a20230815;

public class MethodParameter{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        A aa = new A();
        aa.Swap(a,b);
        System.out.println("main中\na=" + a + " b=" + b);
    }
}

class A{
    public void Swap(int num1,int num2){
        System.out.println("交换前\nnum1=" + num1 + " num2=" + num2);
        int tem = num1;
        num1 = num2;
        tem = num2;

        System.out.println("交换后\nnum1=" + num1 + " num2=" + num2);
    }
}
