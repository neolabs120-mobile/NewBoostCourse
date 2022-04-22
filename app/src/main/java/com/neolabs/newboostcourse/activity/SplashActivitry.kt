package com.neolabs.newboostcourse.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.neolabs.newboostcourse.R

class SplashActivitry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val hd = Handler()
        hd.postDelayed(splashhandler(), 3000)
    }

    private inner class splashhandler : Runnable {
        override fun run() {
            startActivity(Intent(application, MainActivity::class.java)) //로딩이 끝난 후, ChoiceFunction 이동
            finish() // 로딩페이지 Activity stack에서 제거
        }
    }

    override fun onBackPressed() {
        //초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못누르게 함
    }
}