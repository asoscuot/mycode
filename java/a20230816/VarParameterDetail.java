package a20230816;

public class VarParameterDetail {
    public static void main(String[] args) {
        //细节：可变参数的实参可以为数组
        int[]arr = {1,4,7};
        T t = new T();
        t.f1(arr);
    }
}

class T{
    public void f1(int...nums){
        System.out.println("长度为：" + nums.length);
    }
    //细节：可变参数可以和普通类型的参数放在形参列表，但必须保证可变参数放在最后
    //细节：一个形参列表中最多只能有一个可变参数
}
