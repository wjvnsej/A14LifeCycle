package com.kosmo.a14lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    //로그 확인을 위한 상수 선언
    private static final String TAG = "KOSMO123";

    /*
    Activity 의 LifeCycle(수명주기) 메소드
        : 액티비티가 실행되면 아래 순서대로 메소드가 실행된다.
        onCreate() -> onStart() -> onResume()

        액티비티가 종료되면
        onPause() -> onStop() -> onDestroy()

        안드로이드에서 수명주기 메소드는 앱이 비정상적으로 종료되믄
        시점의 상태를 저장하거나, 앱이 실행될 때 자동으로 실행하고자
        하는 명령이 있을 때 사용한다.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Log.d(TAG, "서브액티비티 실행");
        Log.d(TAG, "onCreate() 실행");

    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart() 실행");

        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d(TAG, "onResume() 실행");

        super.onResume();
    }



    @Override
    protected void onPause() {
        Log.d(TAG, "onPause() 실행");

        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop() 실행");

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() 실행");

        super.onDestroy();
    }


    public void OnSubBtnClicked(View v){
        Log.d(TAG, "서브액티비티 종료버튼 클릭됨");
        finish();
    }

}























