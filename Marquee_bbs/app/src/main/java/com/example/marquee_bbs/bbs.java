package com.example.marquee_bbs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.example.marquee_bbs.utils.DateUtil;

public class bbs extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {
    private TextView tv_bbs;
    private TextView tv_control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);

        tv_control = findViewById(R.id.tv_control);
        tv_control.setOnClickListener(this);
        tv_control.setOnLongClickListener(this);
        tv_bbs = findViewById(R.id.tv_bbs);
        tv_bbs.setOnClickListener(this);
        tv_bbs.setOnLongClickListener(this);
        tv_bbs.setMovementMethod(new ScrollingMovementMethod());    // 设置聊天室文本的移动方式为滚动模式
    }

    private String[] mChatStr = {"你好!", "你好呀！", "我是小明，我来自地球。", "哦哦我是小红，我是火星人", "？？？？","我是熊家畅18990182"};

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_control || v.getId() == R.id.tv_bbs) {
            int random = (int) (Math.random() * 10) % 5;
            String newStr = String.format("%s\n%s %s",
                    tv_bbs.getText().toString(), DateUtil.getNowTime(), mChatStr[random]);
            tv_bbs.setText(newStr);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.tv_control || v.getId() == R.id.tv_bbs) {
            tv_bbs.setText("");
        }
        return true;
    }
}
