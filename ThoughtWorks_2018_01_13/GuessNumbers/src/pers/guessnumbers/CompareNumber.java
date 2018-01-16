package pers.guessnumbers;

/**
 * Created by 筱湮 on 2018/1/15.
 * 只有一个函数，该函数接受两个参数，一个是答案，一个是用户输入的四位数。返回值是xAxB的字符串
 * 这里我们假定答案和用户输入都是合法的四位数。不用考虑数字合法性问题。
 * 请对这个类写测试（思考要写几个测试）
 */
public class CompareNumber {

    public String compare(String answer, String input){

        int numberOfA = 0, numnerOfB = 0;
        char[] answerChar = answer.toCharArray();
        char[] inputChar = input.toCharArray();

        for(int i = 0; i <answer.length(); i++){
            if(answerChar[i] == inputChar[i]){
                numberOfA++;
            }else{
                for(int j = 0; j < answer.length(); j++){
                    if(answerChar[j] == inputChar[i]){
                        numnerOfB++;
                    }
                }
            }
        }

        String result = numberOfA + "A" + numnerOfB + "B";

        return result;
    }
}
