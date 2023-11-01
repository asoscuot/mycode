package a20230829;

public class student extends Person{
     private int id;
     private double score;

    public student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
        return super.say() + "id=" + id + "分数为" + score;
    }
}
