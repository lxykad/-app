package com.lxy.wx;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

/**
 * Created by liuxinyu on 2016/6/20.
 */
public class MyBaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this, "RBTTTRtf4W8RvNMERiAxdvgb-gzGzoHsz", "f2oMSEh4vbMopvLfISiVV5Dv");

        //以下代码测试用
//        AVObject testObject = new AVObject("TestObject");
//        testObject.put("foo", "bar");
//        testObject.saveInBackground();

    }

}
