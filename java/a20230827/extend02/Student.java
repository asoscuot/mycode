package a20230827.extend02;
//用继承解决昨天的代码复用性低的问题，Student是父类
public class Student {
    public String name;
    public int age;
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("姓名=" + name + "\t年龄" + age + "\t考了" + score + "分");
    }
}
