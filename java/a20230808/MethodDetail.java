package a20230808;

public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();
        int []resArr = a.getSumAndSub(5,2);
        System.out.println("和=" + resArr[0]);
        System.out.println("差=" + resArr[1]);

    }
}
class AA{
    //1.一个方法最多有一个返回值，如果要返回多个值，可以使用数组
    public int[] getSumAndSub(int num1,int num2){
        int[] arr = new int[2];
        arr[0] = num1 + num2;
        arr[1] = num1 - num2;

        return arr;
    }
}
