package com.experience.geotask.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.experience.geotask.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageView)
    ImageView imgView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);

        Glide.with(this).load("https://images.unsplash.com/photo-1536238708445-f883e72db7ea?ixlib=rb-" +
                "0.3.5&s=e370c8979533e7fde8de397f4d843fec&auto=format&fit=crop&w=1527&q=80").into(imgView);


    }

    @OnClick(R.id.new_task_button)
    public void newTask() {
        startActivity(new Intent(this, TaskActivity.class));
    }

}
