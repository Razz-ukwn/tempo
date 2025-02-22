package y5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import p5.a;
import w5.b;
import z5.f;
import z5.g;

public abstract class c extends p2.c {

    /* renamed from: b  reason: collision with root package name */
    public final a f17264b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f17265c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f17266d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f17267e;

    public c(a aVar, g gVar) {
        super(gVar);
        this.f17264b = aVar;
        Paint paint = new Paint(1);
        this.f17265c = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f17267e = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f.c(9.0f));
        Paint paint3 = new Paint(1);
        this.f17266d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f17266d.setStrokeWidth(2.0f);
        this.f17266d.setColor(Color.rgb(255, 187, 115));
    }

    public final void f(b bVar) {
        Paint paint = this.f17267e;
        bVar.E();
        paint.setTypeface((Typeface) null);
        paint.setTextSize(bVar.t());
    }

    public abstract void g(Canvas canvas);

    public abstract void h(Canvas canvas);

    public abstract void i(Canvas canvas, u5.b[] bVarArr);

    public abstract void j(Canvas canvas);

    public abstract void k();

    public boolean l(v5.b bVar) {
        return ((float) bVar.getData().d()) < ((float) bVar.getMaxVisibleCount()) * ((g) this.f12427a).f17763i;
    }
}
