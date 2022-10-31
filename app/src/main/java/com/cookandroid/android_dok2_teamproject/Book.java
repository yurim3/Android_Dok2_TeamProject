package com.cookandroid.android_dok2_teamproject;

import android.graphics.drawable.Drawable;

public class Book {
    private Drawable image;
    private String title;

    public Book(Drawable imgae, String title) {
        this.image = imgae;
        this.title = title;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
