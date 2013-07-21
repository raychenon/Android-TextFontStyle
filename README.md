Android-TextFontStyle
=====================

Library for implementing custom Text Font/Typography using layout or style


TextFontStyle is a standalone library to ease the use of font .otf files across TextView .

![Screenshot](https://github.com/raychenon/Android-TextFontStyle/raw/master/screenshot.png)

## Documentation


### Apply font programmatically
I've seen code where the text font is applied .
``` java
TextView textView1 = (TextView) findViewById(R.id.text1);
Typeface typefaceFajardo = Typeface.createFromAsset(getAssets(), getString(R.string.font_james_fajardo));
textView1.setTypeface(typefaceFajardo);
```
This way is hard to maintain.

### Use a layout
The nice thing about using it in layout is :
- In the Java code , you don't have to change anything. Since TextViewStyle extends TextView , any reference to TextView will work. So any (TextView) findViewById
will stay the same.
- You can centralize the text fonts in style.xml.

#### Get started
Just replace the TextView by 

``` xml
  <com.raychenon.TextViewStyle
      android:id="@+id/text_wifi"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      android:gravity="bottom"
      android:text="@string/loremipsum_long"
      ray:typeFace="@string/font_baroquescript"/>
```

Even better, now you can use a stytle to centralize the font in one place. Like this

``` xml
    <com.raychenon.TextViewStyle
          android:id="@+id/text_license_middle"
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          android:gravity="center"
          android:text="@string/text_license_apache2_url"
          style="@style/TextStyleStint"/>
    
```

where the style
``` xml
    <style name="TextStyleBaroque" >
        <item name="typeFace">@string/font_baroquescript</item>
    </style>
```

## Font resources

Download some .otf files from http://www.1001freefonts.com/
Put them in the assets folder.
