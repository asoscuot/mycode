package a20230821;

public class Homework04 {
    public static void main(String[] args) {
        double[]arr1 = {2.3,6.5,8.3};
        A04 a04 = new A04();
        double NewArr[] = a04.copyArr(arr1);
        System.out.println("返回的新数组的情况：");

        for (int i = 0; i < NewArr.length; i++) {
            System.out.print(NewArr[i] + "\t");
        }
    }
}
//编写类A04，实现数组的复制功能copyArr，输入旧数组，返回新数组，元素和旧数组一样
class A04{
    public double[] copyArr(double[]OldArr){
        double[]NewArr = new double[OldArr.length];
        for (int i = 0; i < OldArr.length; i++) {
            NewArr[i] = OldArr[i];
        }
        return NewArr;
    }
}
