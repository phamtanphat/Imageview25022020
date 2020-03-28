package com.example.image25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView mImg;
    Button mBtnNext,mBtnPrevious,mBtnRandom,mBtnAutoNext,mBtnAutoPrevious;
    ArrayList<Integer> mArrayImageIntegers;
    int mCount = 0;
    int mIndexRandom = 0;
    Random mRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImg = findViewById(R.id.imageview);
        mBtnNext = findViewById(R.id.buttonNext);
        mBtnPrevious = findViewById(R.id.buttonPrevious);
        mBtnRandom = findViewById(R.id.buttonRandom);
        mBtnAutoNext = findViewById(R.id.buttonAutoNext);
        mBtnAutoPrevious = findViewById(R.id.buttonAutoPrevious);

        // Tạo mảng hình
        mArrayImageIntegers = new ArrayList<>();
        mArrayImageIntegers.add(R.drawable.hinh1);
        mArrayImageIntegers.add(R.drawable.hinh2);
        mArrayImageIntegers.add(R.drawable.hinh3);
        mArrayImageIntegers.add(R.drawable.hinh4);
        mArrayImageIntegers.add(R.drawable.hinh5);

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount = mCount >= mArrayImageIntegers.size() - 1 ? 0 : ++mCount;
                mImg.setImageResource(mArrayImageIntegers.get(mCount));
            }
        });

        mBtnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount = mCount <= 0 ? mArrayImageIntegers.size() - 1 : --mCount;
                mImg.setImageResource(mArrayImageIntegers.get(mCount));
            }
        });

        mBtnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRandom = new Random();
                mIndexRandom = mRandom.nextInt(mArrayImageIntegers.size());
                mCount = mIndexRandom;
                mImg.setImageResource(mArrayImageIntegers.get(mIndexRandom));
            }
        });
    }
}
