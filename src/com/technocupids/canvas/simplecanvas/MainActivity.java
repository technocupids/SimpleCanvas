package com.technocupids.canvas.simplecanvas;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new MyCanvas(this));

	}

	public class MyCanvas extends View {
		Paint paint = new Paint();
		public static final float RADIUS = 100;

		public MyCanvas(Context context) {
			super(context);
			paint.setColor(Color.BLUE);
		}

		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);
			float w = canvas.getWidth();
			float h = canvas.getHeight();
			canvas.drawCircle(w/2, h/2, RADIUS, paint);
		}
	}
}
