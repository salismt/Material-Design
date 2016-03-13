package com.example.salis.materialdesign.customs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.salis.materialdesign.R;

public class XTextView extends TextView{

    private AttributeSet attributeSet;

    public XTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.attributeSet = attributeSet;
        init();
    }

    private void init(){
        TypedArray styledAttributes  = getContext().obtainStyledAttributes(attributeSet,    R.styleable.XTextView);
        int fontFamily  = styledAttributes.getInt(R.styleable.XTextView_fontFamily,  XTextViewAttr.lato);
        int fontStyle   = styledAttributes.getInt(R.styleable.XTextView_fontStyle,   XTextViewAttr.regular);
        String fontName = null;

        switch (fontFamily){

            // font family BEBAS
            case XTextViewAttr.bebas:
                switch (fontStyle){
                    case XTextViewAttr.regular:
                        fontName = "fonts/BebasNeue Regular.ttf";
                        break;
                    case XTextViewAttr.bold:
                        fontName = "fonts/BebasNeue Bold.ttf";
                        break;
                }
                break;

            // font family LATO
            case XTextViewAttr.lato:
                switch (fontStyle){
                    case XTextViewAttr.regular:
                        fontName = "fonts/lato-regular.ttf";
                        break;
                    case XTextViewAttr.bold:
                        fontName = "fonts/lato-bold.ttf";
                        break;
                }
                break;

            // font family CHAMPAGNE
            case XTextViewAttr.champagne:
                switch (fontStyle){
                    case XTextViewAttr.regular:
                        fontName = "fonts/ChampagneLimousines-1.ttf";
                        break;
                    case XTextViewAttr.bold:
                        fontName = "fonts/ChampagneLimousines Bold-1.ttf";
                        break;
                }
                break;

            // font family us101
            case XTextViewAttr.us:
                fontName = "fonts/us101.TTF";
                break;

        }

        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), fontName);
        if(android.os.Build.VERSION.SDK_INT<android.os.Build.VERSION_CODES.HONEYCOMB ||
                android.os.Build.VERSION.SDK_INT>android.os.Build.VERSION_CODES.HONEYCOMB_MR2){
            setTypeface(typeface);
        }
    }

    public void setText(int fontFamily, int fontStyle){
        String fontName = null;

        switch (fontFamily){

            // font family BEBAS
            case XTextViewAttr.bebas:
                switch (fontStyle){
                    case XTextViewAttr.regular:
                        fontName = "fonts/BebasNeue Regular.ttf";
                        break;
                    case XTextViewAttr.bold:
                        fontName = "fonts/BebasNeue Bold.ttf";
                        break;
                }
                break;

            // font family LATO
            case XTextViewAttr.lato:
                switch (fontStyle){
                    case XTextViewAttr.regular:
                        fontName = "fonts/lato-regular.ttf";
                        break;
                    case XTextViewAttr.bold:
                        fontName = "fonts/lato-bold.ttf";
                        break;
                }
                break;

            // font family CHAMPAGNE
            case XTextViewAttr.champagne:
                switch (fontStyle){
                    case XTextViewAttr.regular:
                        fontName = "fonts/ChampagneLimousines-1.ttf";
                        break;
                    case XTextViewAttr.bold:
                        fontName = "fonts/ChampagneLimousines Bold-1.ttf";
                        break;
                }
                break;

            case XTextViewAttr.us:
                fontName = "fonts/us101.TTF";
                break;
        }

        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), fontName);
        if(android.os.Build.VERSION.SDK_INT<android.os.Build.VERSION_CODES.HONEYCOMB ||
                android.os.Build.VERSION.SDK_INT>android.os.Build.VERSION_CODES.HONEYCOMB_MR2){
            setTypeface(typeface);
        }
    }

    public static class XTextViewAttr{
        // font family
        public static final int lato        = 1;
        public static final int bebas       = 2;
        public static final int us          = 3;
        public static final int champagne   = 4;

        // font style
        public static final int bold        = 0;
        public static final int regular     = 1;
    }
}
