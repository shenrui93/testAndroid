package com.example.administrator.testdeviceid.wxapi;

import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.weixin.view.WXCallbackActivity;

public class WXEntryActivity extends WXCallbackActivity {

    @Override
    public void onResp(BaseResp resp) {

        super.onResp(resp);

        this.finish();
    }
}
