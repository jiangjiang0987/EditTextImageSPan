package com.qingtai.qingtai.test;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Administrator on 2016/12/28.
 */
public class MyEditText extends EditText {
    public MyEditText(Context context){
        super(context);
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void insertDrawable(int id){
        final SpannableString ss = new SpannableString("easy");
        //得到drawable对象，即所有插入的图片
        Drawable d = getResources().getDrawable(id);
        d.setBounds(0,0,d.getIntrinsicWidth(),d.getIntrinsicHeight());
        //用这个drawable对象代替字符串easy
        ImageSpan span  = new ImageSpan(d,ImageSpan.ALIGN_BASELINE);
        ss.setSpan(span,0,"easy".length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        append(ss);
    }
}
