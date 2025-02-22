package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class s extends t {
    public s(RecyclerView.m mVar) {
        super(mVar);
    }

    public final int b(View view) {
        this.f2749a.getClass();
        return RecyclerView.m.u(view) + view.getBottom() + ((RecyclerView.n) view.getLayoutParams()).bottomMargin;
    }

    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f2749a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f2492b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + nVar.topMargin + nVar.bottomMargin;
    }

    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f2749a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f2492b;
        return view.getMeasuredWidth() + rect.left + rect.right + nVar.leftMargin + nVar.rightMargin;
    }

    public final int e(View view) {
        this.f2749a.getClass();
        return (view.getTop() - RecyclerView.m.K(view)) - ((RecyclerView.n) view.getLayoutParams()).topMargin;
    }

    public final int f() {
        return this.f2749a.f2484o;
    }

    public final int g() {
        RecyclerView.m mVar = this.f2749a;
        return mVar.f2484o - mVar.C();
    }

    public final int h() {
        return this.f2749a.C();
    }

    public final int i() {
        return this.f2749a.m;
    }

    public final int j() {
        return this.f2749a.f2482l;
    }

    public final int k() {
        return this.f2749a.F();
    }

    public final int l() {
        RecyclerView.m mVar = this.f2749a;
        return (mVar.f2484o - mVar.F()) - mVar.C();
    }

    public final int m(View view) {
        RecyclerView.m mVar = this.f2749a;
        Rect rect = this.f2751c;
        mVar.L(view, rect);
        return rect.bottom;
    }

    public final int n(View view) {
        RecyclerView.m mVar = this.f2749a;
        Rect rect = this.f2751c;
        mVar.L(view, rect);
        return rect.top;
    }

    public final void o(int i8) {
        this.f2749a.Q(i8);
    }
}
