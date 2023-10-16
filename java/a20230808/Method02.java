package a20230808;

public class Method02 {
    public static void main(String[] args) {
        //编写一个方法，遍历一次数组
        int [][] map = {{1,1,1},{1,0,2},{0,2,1}};

        MyTools myTools = new MyTools();
        myTools.printArr(map);


    }
}

class MyTools{
    public void printArr(int [][] map1){
        for (int i = 0; i < map1.length; i++) {
            for(int j = 0;j<map1[i].length;j++){
                System.out.print(map1[i][j] + " ");
            }
        }
    }
}
