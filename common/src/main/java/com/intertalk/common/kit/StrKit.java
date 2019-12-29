package com.intertalk.common.kit;

import android.content.Context;
import android.text.TextUtils;

import com.intertalk.catering.utils.other.CharacterParser;
import com.intertalk.catering.utils.other.ToastUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author caozheng
 * Created time on 2016/4/14
 * description:
 */

public class StrKit {

    private static String[] number = {"零","一","二","三","四","五","六","七","八","九"};

    public static String purenumberToChinese(String name){
        String str = "";
        try{
            if(name.length() > 2){
                str = toChinese(name);
            }else {
                str = name;
            }
        }catch (Exception e){
            e.printStackTrace();
            str = name;
        }
        return str;
    }

    /**
     * 替换大部分空白字符， 不限于空格
     * \s 可以匹配空格、制表符、换页符等空白字符的其中任意一个
     * @param str
     * @return
     */
    public static String replaceSpace(String str){
        return str.replaceAll("\\s*", "");
    }

    public static String endChartTochinese(String name){
        int count = 0;
        String newName = "";
        for(int i = 0; i< name.length(); i++){
            String str = name.substring(i, i + 1);
            if(str.matches("[0-9]{1,}")){
                count ++;
            }
        }
        if(count > 2){
            try{
                String str[] = new String[name.length()];
                for(int i = 0; i < str.length; i++){
                    str[i] = name.substring(i,i+1);
                    if(str[i].matches("[0-9]{1,}")){
                        int pos = Integer.parseInt(str[i]);
                        newName = newName + number[pos];
                    }else {
                        newName = newName + str[i];
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
                newName = name;
            }
        }else {
            newName = name;
        }
        return newName;
    }

    //获取拼音首字母
    public static String getFirstNum(String str){
        if(str == null){
            return "#";
        }
        CharacterParser characterParser = CharacterParser.getInstance();
        String pinyin = "";
        if(str.equals("")){
            pinyin = characterParser.getSelling("unknown");
        }else{
            pinyin = characterParser.getSelling(str);
        }
        String sortString = pinyin.substring(0, 1).toUpperCase();
        if(sortString.matches("[A-Z]")){
            return sortString.toUpperCase();
        }else{
            return "#";
        }
    }

    private static String toChinese(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < str.length() ; i++){
            if(str.substring(i, i + 1).matches("[0-9]{1,}")){
                int pos = Integer.parseInt(str.substring(i, i + 1));
                newStr.append(number[pos]);
            }else {
                newStr.append(str.substring(i, i + 1));
            }
        }
        return newStr.toString();
    }


    private static Pattern PHONE_PATTERN = Pattern.compile("^[1][3,4,5,7,8,9][0-9]{9}$");
    /**
     * 手机号验证
     * @param  str
     * @return 验证通过返回true
     */
    public static boolean isMobile(final String str) {
        Matcher m = null;
        boolean b = false;

        // 验证手机号
        m = PHONE_PATTERN.matcher(str);
        b = m.matches();

        return b;
    }

    /**
     * 判断字符串是否为数字或中文或字母
     * @param str
     *
     * 汉字：[0x4e00,0x9fa5]（或十进制[19968,40869]）
     * 数字：[0x30,0x39]（或十进制[48, 57]）
     * 小写字母：[0x61,0x7a]（或十进制[97, 122]）
     * 大写字母：[0x41,0x5a]（或十进制[65, 90]）
     *
     * @return 验证通过返回true
     */
    public static boolean isLetterDigitOrChinese(String str) {
        String regex = "^[a-z0-9A-Z\u4e00-\u9fa5]+$";
        return str.matches(regex);
    }

    /**
     * 判断字符串是否为数字
     * @param str
     * @return
     */
    public static boolean isDigit(String str) {
        String regex = "[0-9]{1,}";
        return str.matches(regex);
    }

    /**
     * 判断字符串是否为中文
     * @param str
     * @return
     */
    public static boolean isChinese(String str) {
        String regex = "^[\u4e00-\u9fa5]+$";
        return str.matches(regex);
    }

    /**
     * 判断字符串是否为英文字母
     * @param str
     * @return
     */
    public static boolean isLetter(String str) {
        String regex = "^[a-zA-Z]+$";
        return str.matches(regex);
    }
}