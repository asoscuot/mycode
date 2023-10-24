package a20230824;

import a20230822.Homework12;

import java.util.Arrays;

public class import01 {
    public static void main(String[] args) {
        //使用系统自带的Arrays完成数组排序
        int []arr = {-2,3,-5,20,10};
        //传统方法对其排序(冒泡)
  /*
        for (int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length-1-i; j++) {
                int temp;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length;j++) {
            System.out.print(arr[j] + "\t");
        }
        */
        Arrays.sort(arr);
        for (int j = 0; j < arr.length;j++) {
            System.out.print(arr[j] + "\t");
        }

    }

}
//两种导入方式：
//import java.util.Scanner;//表示只会引入java.util包下的Scanner
//import java.util.*//表示将java.util下的所有类都导入
//建议:需要哪个类就导入哪个类即可，不建议使用 * 导入
