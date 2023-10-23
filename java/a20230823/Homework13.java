package a20230823;

import java.util.Random;
import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        //创建一个玩家对象
        tom t = new tom();
        //用来记录最后输赢的次数
        int isWinCount = 0;

        //创建一个二维数组，用来接收局数，tom出拳情况以及电脑出拳情况
        int[][] arr1 = new int[3][3];//第一个3表示玩3局，第二个3表示开了三个位置，分别是局数和两种出拳情况
        int j = 0;

        //创建一个一维数组，用来接受输赢情况
        String []arr2 = new String[3];//3局的输赢用数组承载

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {//比赛3次
            //获取玩家出的拳
            System.out.println("请输入你要出的拳（0-拳头，1-剪刀，2-布）：");
            int num = scanner.nextInt();

            //这个set方法将当前的tomGuessNum设置为输入的那个数字，get方法用于获取这个数字
            t.setTomGuessNum(num);
            int tomGuess = t.getTomGuessNum();

            arr1[i][j + 1] = tomGuess;

            //获取电脑出的拳
            int comGuess = t.computer();
            arr1[i][j + 2] = comGuess;

            //将玩家猜的拳与电脑做比较
            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;

            //对每一局的情况进行输出
            System.out.println("========================================");
            System.out.println("局数\t\t玩家的出拳\t电脑的出拳\t输赢情况");
            System.out.println(t.count + "\t\t\t" + tomGuess + "\t\t\t" + comGuess + "\t\t" + isWin);
            System.out.println("========================================");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
        }

        //对游戏最终结果进行输出
        System.out.println("局数\t\t玩家的出拳\t电脑的出拳\t\t输赢情况");
        for(int a = 0;a < arr1.length;a++){
            for(int b = 0;b < arr1[a].length;b++){
                System.out.print(arr1[a][b] + "\t\t\t");
            }
            System.out.print(arr2[a]);
            System.out.println();
        }
        System.out.println("你赢了" + isWinCount + "次");
    }
}
//有个人tom，设计他的成员变量，成员方法，可以电脑猜拳
//电脑每次都会随记生成0,1,2
//0表示石头，1表示剪刀，2表示布
//并要可以显示tom的输赢次数
class tom{//核心代码
    //玩家出拳的类型
    int tomGuessNum;
    //电脑出拳的类型
    int comGuessNum;
    //玩家赢的次数
    int winCountNum;
    //比赛的次数
    int count = 1;

    //电脑随机生成数的方法
    public int computer(){
        Random r = new Random();
        comGuessNum = r.nextInt(3);//这个方法返回0-2的随机数
        return comGuessNum;
    }

    //设置玩家猜拳数的方法
    public void setTomGuessNum(int tomGuessNum){
//        if(tomGuessNum > 2 || tomGuessNum < 0){
//            throw new IllegalAccessException("数字输入有误");
//        }
        this.tomGuessNum = tomGuessNum;
    }

    public int getTomGuessNum(){
        return tomGuessNum;
    }

    //比较猜拳的结果
    public String vsComputer(){
        if(tomGuessNum == 1 && comGuessNum == 2){
            return "你赢了";
        }else if(tomGuessNum == 0 && comGuessNum == 1){
            return "你赢了";
        }else if(tomGuessNum == 2 && comGuessNum==0){
            return "你赢了";
        }else if(tomGuessNum == comGuessNum){
            return "平局";
        }else{
            return "你输了";
        }
    }

    //记录玩家赢的次数
    public int winCount(String s){
        count ++;
        if(s.equals("你赢了")){
            winCountNum ++;
        }
        return winCountNum;
    }
}