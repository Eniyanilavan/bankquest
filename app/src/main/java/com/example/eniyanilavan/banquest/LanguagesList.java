package com.example.eniyanilavan.banquest;

import android.media.Image;
import android.widget.ImageView;

public class LanguagesList {

    public String lang_sub_title;
    public int lang_image;

    public int getSelect_Image() {
        return select_Image;
    }

    public void setSelect_Image(int select_Image) {
        this.select_Image = select_Image;
    }

    public int select_Image;

    public int getSelect_image() {
        return select_image;
    }

    public void setSelect_image(int select_image) {
        this.select_image = select_image;
    }

    public int select_image;

    public String getLang_sub_title() {
        return lang_sub_title;
    }

    public void setLang_sub_title(String lang_sub_title) {
        this.lang_sub_title = lang_sub_title;
    }

    public int getLang_image() {
        return lang_image;
    }

    public void setLang_image(int lang_image) {
        this.lang_image = lang_image;
    }

    public int getLang_title() {
        return lang_title;
    }

    public void setLang_title(int lang_title) {
        this.lang_title = lang_title;
    }

    public int lang_title;

    public LanguagesList(int image, int title, String subtitle,int select_Image){

        this.lang_image = image;
        this.lang_title = title;
        this.lang_sub_title = subtitle;
        this.select_image = select_Image;

    }
}
