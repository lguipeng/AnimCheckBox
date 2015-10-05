package com.github.lguipeng.animcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.lguipeng.library.animcheckbox.AnimCheckBox;

public class MainActivity extends AppCompatActivity implements AnimCheckBox.OnCheckedChangeListener{
    private AnimCheckBox mAnimCheckBox1, mAnimCheckBox2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAnimCheckBox1 = (AnimCheckBox)findViewById(R.id.checkbox_1);
        mAnimCheckBox1.setChecked(false, false);
        mAnimCheckBox2 = (AnimCheckBox)findViewById(R.id.checkbox_2);
        mAnimCheckBox2.setChecked(false, false);
        mAnimCheckBox1.setOnCheckedChangeListener(this);
        mAnimCheckBox2.setOnCheckedChangeListener(this);
    }

    @Override
    public void onChange(boolean checked) {
        Log.d("MainActivity" , "checked-->" + checked);
    }
}
