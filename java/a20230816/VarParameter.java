package a20230816;

public class VarParameter {
    public static void main(String[] args) {
        LstMethod lst = new LstMethod();
        System.out.println(lst.sum(1,3,6));
    }
}
//可变参数的使用
/*
计算2个数的和，3个数的和，4个数的和......
使用方法的重载会使代码显得无聊，可以通过可变参数解决问题
 */
class LstMethod{
    public int sum(int... nums){//表示接受的是可变参数，类型为int(数量为0到多)，可以把nums当作是一个数组，遍历求和即可
        System.out.println("调用了" + nums.length + "个参数");
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}
