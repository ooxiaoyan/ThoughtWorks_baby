package pers.guessnumbers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 筱湮 on 2018/1/16.
 * 完成整个游戏。整个游戏是以命令行方式进行的。每回游戏有六次机会。每输入一次数字就会减少一次机会并打印xAxB。
 * 当游戏开始时，打印“Welcome!”空一行打印 “Please input your number(6): “
 * 每次输入完并敲击回车，就会在下面打印出xAxB，然后空一行打印出新的”Please input your number(x): “
 * 当输入的数字包含重复数字并回车时，在下面打印”Cannot input duplicate numbers!”
 * 当6次都没有猜中的时候，打印”Game Over”并退出
 * 当猜中的时候，不要打印4A0B,而是打印”Congratulations!”并退出
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Guess guess = new Guess();

        for(int i = 6; i > 0 ; i--){
            System.out.println("Please input your number(" + i + "): ");

            String input = sc.nextLine();
            if(! isFourNumber(input)){
                System.out.println("Please input four numbers！");
            }
            if(isUnique(input)){
                String result = guess.guessNumber(input);
                if("4A0B".equals(result)){
                    System.out.println("Congratulations!");
                }else{
                    System.out.println(result);
                    if(i == 1){
                        System.out.println("Game Over");
                    }
                }

            }
        }
    }

    public static boolean isUnique(String input){
        char[] inputChar = input.toCharArray();
        for(int i = 0; i < inputChar.length; i++){
            for(int j = i+1; j < inputChar.length; j++){
                if(inputChar[i] == inputChar[j]){
                    System.out.println("Cannot input duplicate numbers!");
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isFourNumber(String input){
        Pattern pattern = Pattern.compile("[0-9]{4}");
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();
        return result;
    }
}
