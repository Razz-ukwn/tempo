package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.quickkonnect.silencio.R;
import i0.a;
import i0.b;
import i0.f;
import sf.j;

public class o1 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1381a;

    public o1(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(f fVar, View view, long j10) {
        j.f(fVar, "canvas");
        j.f(view, "view");
        Canvas canvas = b.f9360a;
        super.drawChild(((a) fVar).f9359a, view, j10);
    }

    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        j.f(canvas, "canvas");
        int childCount = super.getChildCount();
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = getChildAt(i8);
            j.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((e3) childAt).D) {
                z10 = true;
                break;
            }
            i8++;
        }
        if (z10) {
            this.f1381a = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f1381a = false;
            }
        }
    }

    public int getChildCount() {
        if (this.f1381a) {
            return super.getChildCount();
        }
        return 0;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
    }

    public final void onMeasure(int i8, int i10) {
        setMeasuredDimension(0, 0);
    }
}
