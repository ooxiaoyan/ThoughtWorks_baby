package pers.guessnumbers;

import java.util.Random;

/**
 * Created by 筱湮 on 2018/1/15.
 * 只有一个函数，返回一个四位，每位都不重复随机数。
 * 请对这个类写测试。（思考测试哪些）
 */
public class AnswerGenerator {
    /**
     * 获取count个随机数
     * @param count 随机数个数
     * @return
     */
    public String randomNumber(int count){

        StringBuffer sb = new StringBuffer();
        String str = "0123456789";
        Random r = new Random();
        for(int i = 0; i < count; i++){
            int num = r.nextInt(str.length());
            sb.append(str.charAt(num));
            str = str.replace((str.charAt(num)+""), "");
        }
        return sb.toString();
    }
}
