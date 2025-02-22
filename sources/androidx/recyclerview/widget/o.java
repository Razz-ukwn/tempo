package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class o extends RecyclerView.x {

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f2741i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f2742j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f2743k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f2744l;
    public boolean m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f2745n;

    /* renamed from: o  reason: collision with root package name */
    public int f2746o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f2747p = 0;

    public o(Context context) {
        this.f2744l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i8, int i10, int i11, int i12, int i13) {
        if (i13 == -1) {
            return i11 - i8;
        }
        if (i13 == 0) {
            int i14 = i11 - i8;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i12 - i10;
            if (i15 < 0) {
                return i15;
            }
            return 0;
        } else if (i13 == 1) {
            return i12 - i10;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public void c(View view, RecyclerView.x.a aVar) {
        int i8;
        int i10;
        int i11;
        PointF pointF = this.f2743k;
        int i12 = -1;
        int i13 = 0;
        int i14 = (pointF == null || pointF.x == 0.0f) ? 0 : i11 > 0 ? 1 : -1;
        RecyclerView.m mVar = this.f2513c;
        if (mVar == null || !mVar.d()) {
            i8 = 0;
        } else {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            i8 = e((view.getLeft() - RecyclerView.m.B(view)) - nVar.leftMargin, RecyclerView.m.I(view) + view.getRight() + nVar.rightMargin, mVar.D(), mVar.f2483n - mVar.E(), i14);
        }
        PointF pointF2 = this.f2743k;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i12 = 0;
        } else if (i10 > 0) {
            i12 = 1;
        }
        RecyclerView.m mVar2 = this.f2513c;
        if (mVar2 != null && mVar2.e()) {
            RecyclerView.n nVar2 = (RecyclerView.n) view.getLayoutParams();
            i13 = e((view.getTop() - RecyclerView.m.K(view)) - nVar2.topMargin, RecyclerView.m.u(view) + view.getBottom() + nVar2.bottomMargin, mVar2.F(), mVar2.f2484o - mVar2.C(), i12);
        }
        int ceil = (int) Math.ceil(((double) g((int) Math.sqrt((double) ((i13 * i13) + (i8 * i8))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f2742j;
            aVar.f2519a = -i8;
            aVar.f2520b = -i13;
            aVar.f2521c = ceil;
            aVar.f2523e = decelerateInterpolator;
            aVar.f2524f = true;
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int g(int i8) {
        float abs = (float) Math.abs(i8);
        if (!this.m) {
            this.f2745n = f(this.f2744l);
            this.m = true;
        }
        return (int) Math.ceil((double) (abs * this.f2745n));
    }
}
