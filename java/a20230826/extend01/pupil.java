package a20230826.extend01;
//模拟小学生考试的情况
public class pupil {
    public String name;
    public int age;
    private int score;

    public pupil(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.setScore(score);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void textInfo(){
        System.out.println("小学生" + name + "正在考试...");
    }

    public void showInfo(){
        System.out.println("姓名=" + name + "\t年龄" + age + "\t考了" + score + "分");
    }
}
