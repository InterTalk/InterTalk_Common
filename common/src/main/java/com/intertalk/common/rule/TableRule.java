package com.intertalk.common.rule;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author caozheng
 * Created time on 2018/5/14
 * description:
 */

public class TableRule {

    /**
     * 桌位名称格式化
     *
     * 例如 001 —> 1
     * 数字结尾的 + "号"
     * @param name
     * @return
     */
    public static String getFormatName(String name){
        if(StrKit.isDigit(name)){
            return String.format("%s号", Integer.parseInt(name));
        }else {
            return name;
        }
    }

    /**
     * 将字符串中的数字转换为 指定 长度的数字串
     *
     * @param content
     * @return 返回转换后的字符串
     */
    public static String changeIntToSpecifyLength(String content) {

        // 匹配的数字的List
        List<String> intMatchList = new ArrayList<String>();
        // 截取的非数字的List
        List<String> unIntSubList = new ArrayList<String>();
        // 匹配的数字转换后的List
        List<String> intChangeList = new ArrayList<String>();

        // 表达式的功能：验证必须为数字（整数或小数）
        String pattern = "[0-9]+([0-9]+)?";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(content);

        // 非数子截取的开始index，默认为0
        int unIntSubStartIndex = 0;

        while (m.find()) {
            intMatchList.add(m.group());

            // 本次非数字截取的结束index（值是数字匹配的开始），默认为0
            int unIntSubEndIndex = 0;
            if (m.start() != 0) {
                unIntSubEndIndex = m.start();
            }

            // 截取 非数字 字符串
            String sub = content
                    .substring(unIntSubStartIndex, unIntSubEndIndex);
            unIntSubList.add(sub);

            // 本次数字匹配的结束index是 下一次 非数字截取的开始
            unIntSubStartIndex = m.end();
        }

        // 将匹配的数字转换为 指定长度的数字
        if (intMatchList != null && !intMatchList.isEmpty()) {
            for (String string : intMatchList) {
                if(string.length() > 9){
                    intChangeList.add(string);
                }else {
                    String changeStr = changeIntLength(string, 9);
                    intChangeList.add(changeStr);
                }
            }
        }

        // 将数据拼接
        String temp = "";
        if (unIntSubList != null && unIntSubList != null
                && unIntSubList.size() == intChangeList.size()) {
            for (int i = 0; i < intMatchList.size(); i++) {
                // 非数字 + 转化后的数字
                temp += unIntSubList.get(i) + intChangeList.get(i);
            }

            content = temp;
        }

        return content;

    }

    /**
     * 将数字转换为指定长度的数字
     *
     * @param value
     * @param retLength
     * @return 返回指定长度的数字 字符串
     */
    private static String changeIntLength(String value, int retLength) {
        String ret = value;
        if (value != null && !value.equals("")) {
            int intValue = Integer.valueOf(value);

            char[] cc = new char[retLength];
            int i = 0;
            for (i = 0; i < retLength; i++) {
                cc[i] = '0';
            }

            DecimalFormat df = new DecimalFormat(new String(cc));
            ret = df.format(intValue);
        }

        return ret;
    }
}
