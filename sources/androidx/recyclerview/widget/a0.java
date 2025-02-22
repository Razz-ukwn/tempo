package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;

public abstract class a0 extends RecyclerView.j {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2586g = true;

    public final boolean a(RecyclerView.b0 b0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i8;
        int i10;
        if (cVar == null || ((i8 = cVar.f2468a) == (i10 = cVar2.f2468a) && cVar.f2469b == cVar2.f2469b)) {
            e eVar = (e) this;
            eVar.r(b0Var);
            b0Var.f2440a.setAlpha(0.0f);
            eVar.f2617i.add(b0Var);
            return true;
        }
        return l(b0Var, i8, cVar.f2469b, i10, cVar2.f2469b);
    }

    public final boolean b(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i8;
        int i10;
        int i11 = cVar.f2468a;
        int i12 = cVar.f2469b;
        if (b0Var2.p()) {
            int i13 = cVar.f2468a;
            i8 = cVar.f2469b;
            i10 = i13;
        } else {
            i10 = cVar2.f2468a;
            i8 = cVar2.f2469b;
        }
        e eVar = (e) this;
        if (b0Var == b0Var2) {
            return eVar.l(b0Var, i11, i12, i10, i8);
        }
        View view = b0Var.f2440a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        eVar.r(b0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        eVar.r(b0Var2);
        View view2 = b0Var2.f2440a;
        view2.setTranslationX((float) (-((int) (((float) (i10 - i11)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i8 - i12)) - translationY))));
        view2.setAlpha(0.0f);
        eVar.f2619k.add(new e.d(b0Var, b0Var2, i11, i12, i10, i8));
        return true;
    }

    public final boolean c(RecyclerView.b0 b0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i8 = cVar.f2468a;
        int i10 = cVar.f2469b;
        View view = b0Var.f2440a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2468a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2469b;
        if (b0Var.j() || (i8 == left && i10 == top)) {
            e eVar = (e) this;
            eVar.r(b0Var);
            eVar.f2616h.add(b0Var);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return l(b0Var, i8, i10, left, top);
    }

    public final boolean d(RecyclerView.b0 b0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i8 = cVar.f2468a;
        int i10 = cVar2.f2468a;
        if (i8 == i10 && cVar.f2469b == cVar2.f2469b) {
            g(b0Var);
            return false;
        }
        return l(b0Var, i8, cVar.f2469b, i10, cVar2.f2469b);
    }

    public abstract boolean l(RecyclerView.b0 b0Var, int i8, int i10, int i11, int i12);

    public final boolean m(RecyclerView.b0 b0Var) {
        return !this.f2586g || b0Var.h();
    }
}
