package cn.wolfcode.demo.text;


import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

import java.sql.Array;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

public class ArrayOperations {
    public static void createArrayParam(int [] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要插入的元素");
        int num = sc.nextInt();
        int index = 3;
          int [] newArray = new int [6];
        for (int i = 0; i < array.length; i++) {
                if(i < index){
                    newArray[i] = array[i];
                }else if(i == index){
                    newArray[i] = array[index];
                }else if(i > index){
                    newArray[i] = array[i - 1];
                }
            }
        String start = "{";
        for (int i = 0; i < newArray.length; i++) {
            if (i == newArray.length - 1 ){
                start += newArray[i] + "}";
            }else {
                start += newArray[i] + ",";
            }
        }
        System.out.println(start);
        }
    }

