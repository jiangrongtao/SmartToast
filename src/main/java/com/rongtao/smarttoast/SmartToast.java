package com.rongtao.smarttoast;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

/**
 *@author jiangrongtao
 *
 *csdn:http://blog.csdn.net/jiang_rong_tao
 *
 *github:https://github.com/jiangrongtao/jiangrongtao.github.io
 *
 * created at 2016/6/28 17:20
*/

public class SmartToast {
    private static SmartToast mSmartToast=new SmartToast();
    private ISmartToast mISmartToast;
    private SmartToast(){}
    public static SmartToast getInstance(){
        return mSmartToast;
    }

    /**
     *  显示自定义样式的Toast,如果
     * @param context
     * @param deftext 默认要显示的文字
     */
    public void showToast(Context context,CharSequence deftext){
        Toast t = Toast.makeText(context, deftext, Toast.LENGTH_SHORT);
        if (mISmartToast!= null) {
            //在回调接口中做View的显示的具体操作
            View inflate=mISmartToast.showSuccessView();
            if (inflate!=null) {
                t.setGravity(Gravity.CENTER, 0, 0);
                t.setView(inflate);
            }
        }
        t.show();
    }

    public void setISmartToast(ISmartToast iSmartToast){
        this.mISmartToast=iSmartToast;
    }
}
