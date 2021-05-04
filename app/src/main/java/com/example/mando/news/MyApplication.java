package com.example.mando.news;

import android.app.Application;

import com.example.mando.news.DataBase.NewsDataBase;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        NewsDataBase.init(this);
    }
}
