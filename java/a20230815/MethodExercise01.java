package a20230815;

public class MethodExercise01 {
    public static void main(String[] args) {
        AA a = new AA();
        if(a.isOdd(1004)){
            System.out.println("这是奇数");
        }else{
            System.out.println("这是偶数");
        }

        a.Print(4,4,'#');
    }
}

class AA {
    //编写类AA，有一个方法，判断一个数odd是奇数还是偶数，返回boolean
    public boolean isOdd(int n) {
        return n % 2 != 0 ? true : false;
    }

    //根据行数和列数和字符打印相应的效果
    public void Print(int num1,int num2,char c){
        for (int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
