package a20230815;

public class MethodExercise02 {
    public static void main(String[] args) {
        int[][]a = {{1,2},{3,4},{5,6}};
        MyTools myTools = new MyTools();
        myTools.print(a);

        Person01 person01 = new Person01();
        person01.name = "mary";
        person01.age = 15;

        Person01 P = myTools.copyPerson(person01);
        System.out.println("person01的属性:person01.name=" + person01.name + " person01.age=" + person01.age);
        System.out.println("P的属性:P.name=" + P.name + " P.age=" + P.age);

        System.out.println(P==person01);//证明这两个对象是相互独立的
    }
}

class MyTools{
    //编写一个方法可以打印二维数组的数据
    public void print(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    //编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象，要求得到的新对象和原来的对象是两个独立的对象，只是他们的属性相同
    public Person01 copyPerson(Person01 P){
        Person01 P1 = new Person01();
        P1.name = P.name;
        P1.age =  P.age;
        return P1;
    }
}

class Person01{
    String name;
    int age;
}
