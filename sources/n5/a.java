package n5;

import android.view.MotionEvent;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import o5.b;
import o5.d;

public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FastScroller f11596a;

    public a(FastScroller fastScroller) {
        this.f11596a = fastScroller;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        int i8;
        int i10;
        FastScroller fastScroller = this.f11596a;
        fastScroller.requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (fastScroller.J != null && motionEvent.getAction() == 0) {
                b bVar = fastScroller.I;
                bVar.getClass();
                if (bVar.a() != null) {
                    bVar.a().f();
                }
            }
            fastScroller.H = true;
            if (fastScroller.c()) {
                float rawY = motionEvent.getRawY();
                View view2 = fastScroller.f4139d;
                int[] iArr = {0, (int) view2.getY()};
                ((View) view2.getParent()).getLocationInWindow(iArr);
                f10 = rawY - ((float) iArr[1]);
                i10 = fastScroller.getHeight();
                i8 = fastScroller.f4139d.getHeight();
            } else {
                float rawX = motionEvent.getRawX();
                View view3 = fastScroller.f4139d;
                int[] iArr2 = {(int) view3.getX(), 0};
                ((View) view3.getParent()).getLocationInWindow(iArr2);
                f10 = rawX - ((float) iArr2[0]);
                i10 = fastScroller.getWidth();
                i8 = fastScroller.f4139d.getWidth();
            }
            float f11 = f10 / ((float) (i10 - i8));
            fastScroller.setScrollerPosition(f11);
            fastScroller.setRecyclerViewPosition(f11);
            return true;
        } else if (motionEvent.getAction() != 1) {
            return false;
        } else {
            fastScroller.H = false;
            if (fastScroller.J != null) {
                b bVar2 = fastScroller.I;
                bVar2.getClass();
                if (bVar2.a() != null) {
                    d dVar = (d) bVar2.a().f7705a;
                    dVar.a();
                    dVar.f12183b.start();
                }
            }
            return true;
        }
    }
}
