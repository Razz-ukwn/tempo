package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class r extends t {
    public r(RecyclerView.m mVar) {
        super(mVar);
    }

    public final int b(View view) {
        this.f2749a.getClass();
        return RecyclerView.m.I(view) + view.getRight() + ((RecyclerView.n) view.getLayoutParams()).rightMargin;
    }

    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f2749a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f2492b;
        return view.getMeasuredWidth() + rect.left + rect.right + nVar.leftMargin + nVar.rightMargin;
    }

    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f2749a.getClass();
        Rect rect = ((RecyclerView.n) view.getLayoutParams()).f2492b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + nVar.topMargin + nVar.bottomMargin;
    }

    public final int e(View view) {
        this.f2749a.getClass();
        return (view.getLeft() - RecyclerView.m.B(view)) - ((RecyclerView.n) view.getLayoutParams()).leftMargin;
    }

    public final int f() {
        return this.f2749a.f2483n;
    }

    public final int g() {
        RecyclerView.m mVar = this.f2749a;
        return mVar.f2483n - mVar.E();
    }

    public final int h() {
        return this.f2749a.E();
    }

    public final int i() {
        return this.f2749a.f2482l;
    }

    public final int j() {
        return this.f2749a.m;
    }

    public final int k() {
        return this.f2749a.D();
    }

    public final int l() {
        RecyclerView.m mVar = this.f2749a;
        return (mVar.f2483n - mVar.D()) - mVar.E();
    }

    public final int m(View view) {
        RecyclerView.m mVar = this.f2749a;
        Rect rect = this.f2751c;
        mVar.L(view, rect);
        return rect.right;
    }

    public final int n(View view) {
        RecyclerView.m mVar = this.f2749a;
        Rect rect = this.f2751c;
        mVar.L(view, rect);
        return rect.left;
    }

    public final void o(int i8) {
        this.f2749a.P(i8);
    }
}
