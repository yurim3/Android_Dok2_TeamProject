package com.cookandroid.android_dok2_teamproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BookRecordActivity extends AppCompatActivity {
    ListView list;
    /*BookAdatper bAdapter;*/
    ArrayList<Book> bArray;
    Book bItem;
    Integer[] image = {R.drawable.pigbook, R.drawable.pigbook,R.drawable.pigbook,R.drawable.pigbook,
            R.drawable.pigbook,R.drawable.pigbook,R.drawable.pigbook,R.drawable.pigbook,R.drawable.pigbook,
            R.drawable.pigbook};
    String [] title = {"돼지책", "돼지책", "돼지책","돼지책", "돼지책",
            "돼지책","돼지책","돼지책","돼지책", "돼지책"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_record);
        list = findViewById(R.id.list);
        bArray = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            bItem = new Book(ContextCompat.getDrawable(this, image[i]), title[i]);
            bArray.add(bItem);
        }//무비 객체 배열 초기화(ArrayList에 값으로 생성)
//        bAdapter = new BookAdatper(this, bArray);
//        list.setAdapter(bAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Book item = (Book)list.getItemAtPosition(i);
            }
        });

    }
}