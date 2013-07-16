package com.textstyle.sample;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * User: raychenon
 * Date: 16/7/13
 * Time: 11:24 PM
 * this class is an example how on the projects I've seen people using programmatically the typeface
 */
public class ProgrammaticTextActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.avt_text_prog);


        TextView textView1 = (TextView) findViewById(R.id.text1);
        Typeface typefaceFajardo = Typeface.createFromAsset(getAssets(), getString(R.string.font_james_fajardo));
        textView1.setTypeface(typefaceFajardo);


        TextView textView2 = (TextView) findViewById(R.id.text2);
        Typeface typefaceBaroque = Typeface.createFromAsset(getAssets(), getString(R.string.font_baroquescript));
        textView2.setTypeface(typefaceBaroque);
    }

}
