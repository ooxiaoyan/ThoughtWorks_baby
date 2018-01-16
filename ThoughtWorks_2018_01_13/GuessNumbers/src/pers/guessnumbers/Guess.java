package pers.guessnumbers;

/**
 * Created by 筱湮 on 2018/1/15.
 * 只有一个函数，但是只有一个参数。把前两问做的类集成起来，写一个集成的单元测试，写一个集成测试。
 */
public class Guess {

    AnswerGenerator answerGenerator = new AnswerGenerator();
    String randomNumber = answerGenerator.randomNumber(4);

    public String guessNumber(String input) {
//        System.out.println("随机数："+randomNumber);
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare(randomNumber, input);
//        System.out.println(result);
        return result;
    }
}
