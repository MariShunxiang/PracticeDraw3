package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice09SetTextScaleXView extends View {
  Paint  paint = new Paint(Paint.ANTI_ALIAS_FLAG);
  String text  = "Hello HenCoder";

  public Practice09SetTextScaleXView(Context context) {
    super(context);
  }

  public Practice09SetTextScaleXView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice09SetTextScaleXView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  {
    paint.setTextSize(60);

    // 使用 Paint.setTextScaleX() 来改变文字宽度
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    paint.setTextScaleX(0.8f);
    canvas.drawText(text, 50, 100, paint);

    paint.setTextScaleX(1.0f);
    canvas.drawText(text, 50, 180, paint);

    paint.setTextScaleX(1.2f);
    canvas.drawText(text, 50, 260, paint);

    paint.setTextScaleX(1.0f);
    float textSize = paint.getTextSize();

    paint.setTextSize(textSize * 0.8f);
    canvas.drawText(text, 50, 400, paint);

    paint.setTextSize(textSize * 1.0f);
    canvas.drawText(text, 50, 480, paint);

    paint.setTextSize(textSize * 1.2f);
    canvas.drawText(text, 50, 560, paint);
  }
}
