package com.example.administrator.testdeviceid;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.umeng.socialize.ShareAction;
import com.umeng.socialize.bean.SHARE_MEDIA;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppUtils u = new AppUtils(this);
        Log.i("DeviceId","DeviceId = "+u.getUniqueID());



       // new ShareAction(this).setPlatform(SHARE_MEDIA.YIXIN)



    }

    public String getPesudoUniqueID() {
        String m_szDevIDShort = "35" + //we make this look like a valid IMEI
                Build.BOARD +"&"+
                Build.BRAND +"&"+
                Build.CPU_ABI +"&"+
                Build.DEVICE+"&"+
                Build.DISPLAY +"&"+
                Build.HOST  +"&"+
                Build.ID  +"&"+
                Build.MANUFACTURER  +"&"+
                Build.MODEL  +"&"+
                Build.PRODUCT  +"&"+
                Build.TAGS +"&"+
                Build.TYPE +"&"+
                Build.USER ; //13 digits

        Log.i("Build","BOARD = "+Build.BOARD);
        Log.i("Build","BRAND = "+Build.BRAND);
        Log.i("Build","CPU_ABI = "+Build.CPU_ABI);
        Log.i("Build","DEVICE = "+Build.DEVICE);
        Log.i("Build","DISPLAY = "+Build.DISPLAY);
        Log.i("Build","HOST = "+Build.HOST);
        Log.i("Build","ID = "+Build.ID);
        Log.i("Build","MANUFACTURER = "+Build.MANUFACTURER);
        Log.i("Build","MODEL = "+Build.MODEL);
        Log.i("Build","PRODUCT = "+Build.PRODUCT);
        Log.i("Build","TAGS = "+Build.TAGS);
        Log.i("Build","TYPE = "+Build.TYPE);
        Log.i("Build","USER = "+Build.USER); 
        return m_szDevIDShort;
    }
}
