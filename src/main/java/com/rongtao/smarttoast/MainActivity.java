package com.rongtao.smarttoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 *@author jiangrongtao
 * 
 *csdn:http://blog.csdn.net/jiang_rong_tao
 * 
 *github:https://github.com/jiangrongtao/jiangrongtao.github.io
 *
 * created at 2016/6/28 17:13
*/



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view){
        SmartToast instance = SmartToast.getInstance();
        instance.setISmartToast(new ISmartToast() {
            @Override
            public View showSuccessView() {
                View inflate = View.inflate(MainActivity.this, R.layout.toast_layout, null);
                return inflate;
            }
        });
        instance.showToast(this,"俺是默认的文本");
    }
}
