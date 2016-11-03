package com.zdc.VerticalMarqueeView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;

import com.zdc.VerticalMarqueeView.view.VerticalMarqueeView;

public class MainActivity extends AppCompatActivity {

   private VerticalMarqueeView mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initView();
    }

    private void initView() {
        mView = (VerticalMarqueeView) findViewById(R.id.ll_container);
        mView.setEllipsize(TextUtils.TruncateAt.END);
        String[] datas = new String[] {"床前明月光", "疑是地上霜", "举头望明月", "低头思故乡"};
        mView.color(getResources()
                .getColor(android.R.color.black)).textSize(15).datas(datas).commit();
        mView.startScroll();
    }
}
