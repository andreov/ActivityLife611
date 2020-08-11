package com.example.activitylife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private static final String KEY_STATE = "keyOnState";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","Activity0"+"onCreate");
        mTextView=findViewById(R.id.infoActivity);
        if(savedInstanceState!=null){
            String restore = savedInstanceState.getString(KEY_STATE);
            mTextView.setText(restore);
        }else mTextView.append("\nonCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Lifecycle","Activity0"+"onStart");
        mTextView.append("\nonStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Lifecycle","Activity0"+"onResume");

        mTextView.append("\nonResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Lifecycle","Activity0"+"onPause");

        mTextView.append("\nonPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Lifecycle","Activity0"+"onStop");

        mTextView.append("\nonStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lifecycle","Activity0"+"onDestroy");

        mTextView.append("\nonDestroy");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Lifecycle","Activity0"+"onRestart");

        mTextView.append("\nonStart");
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        Log.d("Lifecycle","Activity0"+"onPostCreate");

        mTextView.append("\nonPostCreate");
    }
    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.d("Lifecycle","Activity0"+"onPostResume");

        mTextView.append("\nonPostResume");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("Lifecycle","onKeyDown"+keyCode);
        mTextView.append("\nonKeyDown"+keyCode);
        return super.onKeyDown(keyCode, event);



    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d("Lifecycle","onKeyLongPress"+keyCode);
        mTextView.append("\nonKeyLongPress"+keyCode);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d("Lifecycle","onBackPressed");
        mTextView.append("\nonBackPressed");
    }

    @Override
    protected  void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d("Lifecycle", "onSaveInstanceState");
        outState.putString(KEY_STATE,mTextView.getText().toString());
    }

    @Override
    protected  void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Lifecycle", "onRestoreInstanceState");
        //String restore = savedInstanceState.getString(KEY_STATE);
        //mTextView.setText(restore);
    }
}