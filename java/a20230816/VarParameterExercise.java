package a20230816;

public class VarParameterExercise {
    public static void main(String[] args) {
        Tools tools = new Tools();
        tools.showScore("jack",80,75,85);
        tools.showScore("mary",90,80,80,75);
    }
}

class Tools{
    /*
    有三个方法，分别实现返回姓名和两门课成绩总分，返回姓名和三门课成绩总分，返回姓名和五门课成绩总分
    封装成一个可变参数的方法
     */
    public void showScore(String name,double...nums){
        double res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        System.out.println("名字" + name + "\n成绩总分为" + res + "（" + nums.length + "门课总分）");
    }
}
