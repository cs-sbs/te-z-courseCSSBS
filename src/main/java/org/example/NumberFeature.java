package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑
        int count=0;//二进制此时的位数，当前为0
        int count1 = 1;//数字当前的位数
        int n;

        do{
            n = inputNumber % 10;
            if (n % 2 == count1 % 2)
            {
                result = result+(int)(1 * Math.pow(2,count));

            }
            count += 1;//无论如何都会自增，一定不要写到if循环里面
            count1 += 1;//切记不要写到if循环里面
            inputNumber = inputNumber / 10;
        }while(inputNumber != 0);

        result = inputNumber;

        System.out.println(result);
        
    }
}
