package pers.guessnumbers;

import org.junit.Test;

/**
 * Created by 筱湮 on 2018/1/15.
 */
public class AnswerGeneratorTest {

    @Test
    public void shouldReturnFourDifferentNumbers(){

        AnswerGenerator answerGenerator = new AnswerGenerator();

        String result = answerGenerator.randomNumber(4);
        System.out.println("随机生成数测试：" + result);
        char[] resultChar = result.toCharArray();
        for(int i = 0; i < resultChar.length; i++){
            for(int j = i+1; j < resultChar.length; j++){
                if(resultChar[i] == resultChar[j]){
                    System.out.println("随机生成数错误");
                }
            }
        }
    }

}
