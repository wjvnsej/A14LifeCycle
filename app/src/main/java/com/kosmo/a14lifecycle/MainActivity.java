package com.kosmo.a14lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "KOSMO123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        해당 로그는 아래 Logcat에서 확인 할 수 있다.
        검색 시 TAG로 지정된 "KOSMO123"을 활용한다.
         */
        Log.d(TAG, "메인엑티비티실행");
    }

    public void onButtonClicked(View view){
        Log.d(TAG, "서브엑티비티 실행 버튼 click");
        Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        startActivity(intent);
    }
}