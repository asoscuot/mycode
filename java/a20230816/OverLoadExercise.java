package a20230816;

public class OverLoadExercise {
    public static void main(String[] args) {
        method method = new method();
        System.out.println(method.m(3));
        System.out.println(method.m(4,5));
        System.out.println(method.m('$'));

        System.out.println(method.max(2,3));
        System.out.println(method.max(2.2,3.3));
        System.out.println(method.max(2.2,3.3,4.4));
    }
}

class method{
    /*
编写程序，在method类中定义三个重载方法并使用。方法名为m，
分别接受一个int参数，两个int参数，一个字符串参数，分别执行平方运算，两个数相乘，输出字符串信息
 */
    public int m(int n1){
        return n1 * n1;
    }
    public int m(int n1,int n2){
        return n1 * n2;
    }
    public char m(char c){
        return c;
    }
    /*
    定义三个重载方法max，第一个方法返回两个int中的最大值
    第二个方法返回两个double中的最大值
    第三个方法返回三个double中的最大值
     */
    public int max(int n1,int n2){
        return n1>n2 ? n1:n2;
    }
    public double max(double n1,double n2){
        return n1>n2 ? n1:n2;
    }
    public double max(double n1,double n2,double n3){
        double max = n1 > n2 ? n1 : n2;
        return max > n3 ? max : n3;
    }
}
