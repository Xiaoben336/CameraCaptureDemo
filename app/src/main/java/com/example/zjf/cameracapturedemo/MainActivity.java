package com.example.zjf.cameracapturedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mBtnSurfaceView = null;
    private Button mBtnTextureView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnSurfaceView = (Button)findViewById(R.id.btnSurfaceView);
        mBtnTextureView = (Button)findViewById(R.id.btnTextureView);

        mBtnTextureView.setOnClickListener(this);
        mBtnSurfaceView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btnSurfaceView:
                intent.setClass(this,SurfaceViewActivity.class);
                startActivity(intent);
                break;
            case R.id.btnTextureView:
                intent.setClass(this,TextureViewActivity.class);
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
