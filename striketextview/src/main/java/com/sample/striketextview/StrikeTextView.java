package com.sample.striketextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class StrikeTextView extends AppCompatTextView {
    private Paint paint;

    public StrikeTextView(Context context) {
        super(context);
    }

    public StrikeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public StrikeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    /**
     * Initialize text view with given attribute set
     * @param context Context
     * @param attrs   Attribute set which is given by XML
     */
    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.StrikeTextView, 0, 0);
            String fontName = typedArray.getString(R.styleable.StrikeTextView_fontName) != null ? typedArray.getString(R.styleable.StrikeTextView_fontName) : getResources().getString(R.string.tt_regular);
            int color = typedArray.getColor(R.styleable.StrikeTextView_lineColor, getResources().getColor(android.R.color.black));
            int lineHeight = typedArray.getInteger(R.styleable.StrikeTextView_lineHeight, 5);
            //Create paint object and set default color and stroke
            paint = new Paint();
            paint.setColor(color);
            paint.setStrokeWidth(lineHeight);

            Typeface typeFace = Typeface.createFromAsset(context.getAssets(), fontName);
            this.setTypeface(typeFace != null ? typeFace : getTypeface());
            typedArray.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0, getHeight() / 2 + 5, getWidth(), getHeight() / 2 + 5, paint);
    }
}
