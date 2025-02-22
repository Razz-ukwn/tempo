package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g1.a;
import java.util.HashMap;
import java.util.Set;
import s0.a0;
import sf.j;

public final class a1 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<a, a0> f1255a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<a0, a> f1256b = new HashMap<>();

    public a1(Context context) {
        super(context);
        setClipChildren(false);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<a, a0> getHolderToLayoutNode() {
        return this.f1255a;
    }

    public final HashMap<a0, a> getLayoutNodeToHolder() {
        return this.f1256b;
    }

    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(View view, View view2) {
        j.f(view, "child");
        j.f(view2, "target");
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        Set<a> keySet = this.f1255a.keySet();
        j.e(keySet, "holderToLayoutNode.keys");
        for (a aVar : keySet) {
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
        }
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        boolean z10 = true;
        if (View.MeasureSpec.getMode(i8) == 1073741824) {
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                z10 = false;
            }
            if (z10) {
                setMeasuredDimension(View.MeasureSpec.getSize(i8), View.MeasureSpec.getSize(i10));
                Set<a> keySet = this.f1255a.keySet();
                j.e(keySet, "holderToLayoutNode.keys");
                for (a aVar : keySet) {
                    int i12 = aVar.H;
                    if (!(i12 == Integer.MIN_VALUE || (i11 = aVar.I) == Integer.MIN_VALUE)) {
                        aVar.measure(i12, i11);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            a0 a0Var = this.f1255a.get(childAt);
            if (childAt.isLayoutRequested() && a0Var != null) {
                a0.c cVar = a0.f14306e0;
                a0Var.I(false);
            }
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
