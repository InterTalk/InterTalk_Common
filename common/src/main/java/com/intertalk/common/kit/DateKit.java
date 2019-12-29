package com.intertalk.common.kit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author caozheng
 * @date 2017/10/28
 * <p>
 * describe: 日期相关
 */

public class DateKit {

    private static SimpleDateFormat m = new SimpleDateFormat("MM", Locale.getDefault());
    private static SimpleDateFormat d = new SimpleDateFormat("dd", Locale.getDefault());
    private static SimpleDateFormat md = new SimpleDateFormat("MM-dd", Locale.getDefault());
    private static SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    private static SimpleDateFormat ymdDot = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault());
    private static SimpleDateFormat ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    private static SimpleDateFormat ymdhmss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
    private static SimpleDateFormat ymdhm = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    private static SimpleDateFormat hm = new SimpleDateFormat("HH:mm", Locale.getDefault());
    private static SimpleDateFormat ahm = new SimpleDateFormat("a hh:mm", Locale.getDefault());
    private static SimpleDateFormat mdhm = new SimpleDateFormat("MM月dd日 HH:mm", Locale.getDefault());
    private static SimpleDateFormat mdahm = new SimpleDateFormat("MM月dd日 a hh:mm", Locale.getDefault());
    private static SimpleDateFormat ymd2 = new SimpleDateFormat("yyyy年MM月dd日", Locale.getDefault());
    private static SimpleDateFormat mdhmLink = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault());
    private static SimpleDateFormat mdhmsLink = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.getDefault());

    /**
     * 年月日[2015-07-28]
     *
     * @param timeInMills
     * @return
     */
    public static String getYmd(long timeInMills) {
        return ymd.format(new Date(timeInMills));
    }

    /**
     * 年月日[2015-07-28]
     *
     * @param timeInMills
     * @return
     */
    public static String getYmd2(long timeInMills) {
        return ymd2.format(new Date(timeInMills));
    }

    /**
     * 年月日[2015.07.28]
     *
     * @param timeInMills
     * @return
     */
    public static String getYmdDot(long timeInMills) {
        return ymdDot.format(new Date(timeInMills));
    }

    public static String getYmdhms(long timeInMills) {
        return ymdhms.format(new Date(timeInMills));
    }

    public static String getYmdhmsS(long timeInMills) {
        return ymdhmss.format(new Date(timeInMills));
    }

    public static String getYmdhm(long timeInMills) {
        return ymdhm.format(new Date(timeInMills));
    }

    public static String getHm(long timeInMills) {
        return hm.format(new Date(timeInMills));
    }

    public static String getMd(long timeInMills) {
        return md.format(new Date(timeInMills));
    }

    public static String getMdhm(long timeInMills) {
        return mdhm.format(new Date(timeInMills));
    }

    public static String getMdhmLink(long timeInMills) {
        return mdhmLink.format(new Date(timeInMills));
    }

    public static String getMdhmsLink(long timeInMills) {
        return mdhmsLink.format(new Date(timeInMills));
    }

    public static String getMdahmLink(long timeInMills) {
        return mdahm.format(new Date(timeInMills));
    }

    public static String getM(long timeInMills) {
        return m.format(new Date(timeInMills));
    }

    public static String getD(long timeInMills) {
        return d.format(new Date(timeInMills));
    }

    /**
     * 是否是今天
     *
     * @param timeInMills
     * @return
     */
    public static boolean isToday(long timeInMills) {
        String dest = getYmd(timeInMills);
        String now = getYmd(Calendar.getInstance().getTimeInMillis());
        return dest.equals(now);
    }

    /**
     * 是否是同一天
     *
     * @param aMills
     * @param bMills
     * @return
     */
    public static boolean isSameDay(long aMills, long bMills) {
        String aDay = getYmd(aMills);
        String bDay = getYmd(bMills);
        return aDay.equals(bDay);
    }

    /**
     * 获取年份
     *
     * @param mills
     * @return
     */
    public static int getYear(long mills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取月份
     *
     * @param mills
     * @return
     */
    public static int getMonth(long mills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);
        return calendar.get(Calendar.MONTH) + 1;
    }


    /**
     * 获取月份的天数
     *
     * @param mills
     * @return
     */
    public static int getDaysInMonth(long mills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        switch (month) {
            case Calendar.JANUARY:
            case Calendar.MARCH:
            case Calendar.MAY:
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.OCTOBER:
            case Calendar.DECEMBER:
                return 31;
            case Calendar.APRIL:
            case Calendar.JUNE:
            case Calendar.SEPTEMBER:
            case Calendar.NOVEMBER:
                return 30;
            case Calendar.FEBRUARY:
                return (year % 4 == 0) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid Month");
        }
    }

    /**
     * 获取星期,0-周日,1-周一，2-周二，3-周三，4-周四，5-周五，6-周六
     *
     * @param mills
     * @return
     */
    public static int getWeek(long mills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);

        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * 获取当月第一天的时间（毫秒值）
     *
     * @param mills
     * @return
     */
    public static long getFirstOfMonth(long mills) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        return calendar.getTimeInMillis();
    }

    /**
     * 获取上个月的第一天
     *
     * @return
     */
    public static String getFirstOfLastMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        return ymd.format(calendar.getTime());
    }

    /**
     * 获取上周一的日期
     *
     * @return
     */
    public static String getLastMondayTime(){
        Calendar cal = Calendar.getInstance();
        //n为推迟的周数
        int n = -1;
        cal.add(Calendar.DATE, n*7);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        return ymd.format(cal.getTime());
    }

    /**
     * 获取指定月份的天数
     * */
    public static int getDaysOfMonth(String time) {
        try {
            Date date = ymd.parse(time);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static int getTimeDiff(String startTime){
        long timeS = dateToStamp(startTime);
        long timeC = System.currentTimeMillis();

        long diff = (timeC - timeS)/1000;

        if(diff < 0){
            diff = 0;
        }

        return (int)diff;
    }

    public static long dateToStamp(String time){
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = simpleDateFormat.parse(time);
            long ts = date.getTime();

            return ts;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int getHour(long mills){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mills);

        //24小时制
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 指定日期加上天数后的日期
     * @param num
     * @param newDate
     * @return
     */
    public static String reduceDay(String newDate, int num){
        try{
            Date currentDate = ymd.parse(newDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(currentDate);
            // num为增加的天数，可以改变的
            calendar.add(Calendar.DATE, num);
            currentDate = calendar.getTime();

            return ymd.format(currentDate);
        }catch (Exception e){
            e.printStackTrace();
        }

        return newDate;
    }

    /**
     * 指定日期加上天数后的日期
     * @param num
     * @param newDate
     * @param simpleDateFormat
     * @return
     */
    public static String reduceDay(String newDate, int num, SimpleDateFormat simpleDateFormat){
        try{
            Date currentDate = simpleDateFormat.parse(newDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(currentDate);
            // num为增加的天数，可以改变的
            calendar.add(Calendar.DATE, num);
            currentDate = calendar.getTime();

            return simpleDateFormat.format(currentDate);
        }catch (Exception e){
            e.printStackTrace();
        }

        return newDate;
    }

    /**
     * 获取间隔天数
     * @param startTime
     * @param endTime
     * @return
     */
    public static int getDays(String startTime, String endTime){
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

            Date beginDate = simpleDateFormat.parse(startTime);
            Date endDate= simpleDateFormat.parse(endTime);
            int day = (int) ((endDate.getTime() - beginDate.getTime())/(24*60*60*1000));

            return day + 1;
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }

    public static long ymdhmDateToStamp(String time){
        try {
            Date date = ymdhm.parse(time);
            long ts = date.getTime();

            return ts;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static Date strToDate(String time){
        try {
            return ymdhms.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return new Date();
    }

    public static String getAmOrPmDate(String time){
        return ahm.format(ymdhmDateToStamp(time));
    }
}
