package com.example.hack;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class Resources extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        listView = findViewById(R.id.res_list);

        ArrayList<Res> images = new ArrayList<Res>();

        images.add(new Res(R.drawable.rectangle1, "An influencer marketing platform that lets you identify your most influential customers and fans."));
        images.add(new Res(R.drawable.rectangle3, "An elite site and resourceful community for freelancers that will negotiate high pay rates"));
        images.add(new Res(R.drawable.rectangle2, "Gives you complete control over your rates, pay schedule and contract negotiations."));
        images.add(new Res(R.drawable.rectangle4, "Provides support in creating exclusive material and promoting your talents."));
        images.add(new Res(R.drawable.rectangle6, "Top influencer site for brands and influencers to use.it has the most campaigns and brands to look through."));
        images.add(new Res(R.drawable.rectangle5, "A platform that lets you create whiteboard videos for a really cheap price."));

        Res_adapter res_adapter = new Res_adapter(this, R.layout.list_view_adapter, images);

        listView.setAdapter(res_adapter);
    }



    public static void setWindowFlag(Activity activity, final int bits, boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    public void openActivity_home_res(View v){
        Intent it = new Intent(Resources.this, home_layout.class);
        startActivity(it);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}