package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import q5.a;
import s5.g;
import v5.c;
import y5.e;

public class LineChart extends a<g> implements c {
    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void e() {
        super.e();
        this.L = new e(this, this.O, this.N);
    }

    public g getLineData() {
        return (g) this.f12878b;
    }

    public final void onDetachedFromWindow() {
        y5.c cVar = this.L;
        if (cVar != null && (cVar instanceof e)) {
            e eVar = (e) cVar;
            Canvas canvas = eVar.f17277k;
            if (canvas != null) {
                canvas.setBitmap((Bitmap) null);
                eVar.f17277k = null;
            }
            WeakReference<Bitmap> weakReference = eVar.f17276j;
            if (weakReference != null) {
                Bitmap bitmap = weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                eVar.f17276j.clear();
                eVar.f17276j = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
