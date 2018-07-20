package com.example.module;

import android.Manifest;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.widget.Toast;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMWeb;

import java.util.List;

public class Umeng {
    //初始化
    public void init(Context context,String appid){
        UMConfigure.init(context,appid,"umeng", UMConfigure.DEVICE_TYPE_PHONE,"");
    }
    //微信
    public void initweixin(String appid,String AppSecret){
        PlatformConfig.setWeixin(appid, AppSecret);
    }

}
