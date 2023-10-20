package a20230820;

public class Homework01 {
    public static void main(String[] args) {
        double [] arr = {};
        A01 a01 = new A01();

        Double res = a01.max(arr);
        if(res != null) {
            System.out.println("这个数组的最大值是：" + res);
        }else{
            System.out.println("数组输入有误,不能为null或者{}");
        }
    }
}
//编写类A01，定义方法max，实现求某个double数组的最大值，并返回

class A01{
    public Double max(double[]arr){
        if(arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }else{
            return null;
        }
        }
}