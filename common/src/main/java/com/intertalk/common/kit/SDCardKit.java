package com.intertalk.common.kit;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;

import com.intertalk.catering.app.App;
import com.intertalk.catering.callcenter3.R;

import java.io.File;

/**
 * @author caozheng
 * @date 2017/11/4
 *
 * describe: SD卡工具类
 */
public class SDCardKit {

    /**
     * 获取SD卡的状态
     */
    public static String getState() {
        return Environment.getExternalStorageState();
    }


    /**
     * SD卡是否可用
     *
     * @return 只有当SD卡已经安装并且准备好了才返回true
     */
    public static boolean isAvailable() {
        return getState().equals(Environment.MEDIA_MOUNTED);
    }


    /**
     * 获取SD卡的根目录
     *
     * @return null：不存在SD卡
     */
    public static File getRootDirectory() {
        return isAvailable() ? Environment.getExternalStorageDirectory() : null;
    }


    /**
     * 获取SD卡的根路径
     *
     * @return null：不存在SD卡
     */
    public static String getRootPath() {
        File rootDirectory = getRootDirectory();
        return rootDirectory != null ? rootDirectory.getPath() : null;
    }

    /**
     * 获取sd卡路径
     *
     * @return Stringpath
     */
    public static String getSDPath() {
        File sdDir = null;
        //判断sd卡是否存在
        boolean sdCardExist = Environment.getExternalStorageState()
                .equals(Environment.MEDIA_MOUNTED);
        if (sdCardExist) {
            //获取跟目录
            sdDir = Environment.getExternalStorageDirectory();
        }
        return sdDir.toString();
    }

    /**
     * 获取空闲的空间大小
     * @return  空间大小
     */
    public static long getFreeSpaceBytes() {
        long freeSpaceBytes;
        final StatFs statFs = new StatFs(getSDPath());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            freeSpaceBytes = statFs.getAvailableBytes();
        } else {
            //noinspection deprecation
            freeSpaceBytes = statFs.getAvailableBlocks() * (long) statFs.getBlockSize();
        }

        return freeSpaceBytes;
    }

    public static String getSystemImagePath() {
        if (Build.VERSION.SDK_INT > 7) {
            String picturePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
            return picturePath + "/" + App.getAppContext().getString(R.string.app_name) + "/";
        } else {
            String picturePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
            return picturePath + "/" + App.getAppContext().getString(R.string.app_name) + "/";
        }
    }

    public static String getSystemFilePath() {
        if (Build.VERSION.SDK_INT > 7) {
            String picturePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
            return picturePath + "/itk_file";
        } else {
            String picturePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
            return picturePath + "/itk_file";
        }
    }

    public static String getAdvSystemImagePath() {
        if (Build.VERSION.SDK_INT > 7) {
            String picturePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
            return picturePath + "/" + App.getAppContext().getString(R.string.app_name) + "/adv/";
        } else {
            String picturePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
            return picturePath + "/" + App.getAppContext().getString(R.string.app_name) + "/adv/";
        }
    }

    public static String getFontPath() {
        if (Build.VERSION.SDK_INT > 7) {
            String fontPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            return fontPath + "/" + App.getAppContext().getString(R.string.app_name) + "/font/";
        } else {
            String fontPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
            return fontPath + "/" + App.getAppContext().getString(R.string.app_name) + "/font/";
        }
    }

    public static String getReportPath() {
        if (Build.VERSION.SDK_INT > 7) {
            String reportPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            return reportPath + "/" + App.getAppContext().getString(R.string.app_name) + "/reportData/";
        } else {
            String reportPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
            return reportPath + "/" + App.getAppContext().getString(R.string.app_name) + "/reportData/";
        }
    }

}
