package com.example.eniyanilavan.banquest;

import android.app.Application;

public class CustomFonts extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FontOverride.setDefaultFont(this, "DEFAULT", "Product Sans Regular.ttf");
        FontOverride.setDefaultFont(this, "MONOSPACE", "Product Sans Regular.ttf");
    }

}