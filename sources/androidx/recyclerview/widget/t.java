package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.m f2749a;

    /* renamed from: b  reason: collision with root package name */
    public int f2750b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2751c = new Rect();

    public t(RecyclerView.m mVar) {
        this.f2749a = mVar;
    }

    public static t a(RecyclerView.m mVar, int i8) {
        if (i8 == 0) {
            return new r(mVar);
        }
        if (i8 == 1) {
            return new s(mVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i8);
}
