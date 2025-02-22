package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;

public final class x implements a.C0029a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2756a;

    public x(RecyclerView recyclerView) {
        this.f2756a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i8 = bVar.f2582a;
        RecyclerView recyclerView = this.f2756a;
        if (i8 == 1) {
            recyclerView.I.Y(bVar.f2583b, bVar.f2585d);
        } else if (i8 == 2) {
            recyclerView.I.b0(bVar.f2583b, bVar.f2585d);
        } else if (i8 == 4) {
            recyclerView.I.c0(bVar.f2583b, bVar.f2585d);
        } else if (i8 == 8) {
            recyclerView.I.a0(bVar.f2583b, bVar.f2585d);
        }
    }

    public final RecyclerView.b0 b(int i8) {
        RecyclerView recyclerView = this.f2756a;
        int h3 = recyclerView.f2409e.h();
        int i10 = 0;
        RecyclerView.b0 b0Var = null;
        while (true) {
            if (i10 >= h3) {
                break;
            }
            RecyclerView.b0 J = RecyclerView.J(recyclerView.f2409e.g(i10));
            if (J != null && !J.j() && J.f2442c == i8) {
                if (!recyclerView.f2409e.j(J.f2440a)) {
                    b0Var = J;
                    break;
                }
                b0Var = J;
            }
            i10++;
        }
        if (b0Var != null && !recyclerView.f2409e.j(b0Var.f2440a)) {
            return b0Var;
        }
        return null;
    }

    public final void c(Object obj, int i8, int i10) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f2756a;
        int h3 = recyclerView.f2409e.h();
        int i13 = i10 + i8;
        for (int i14 = 0; i14 < h3; i14++) {
            View g10 = recyclerView.f2409e.g(i14);
            RecyclerView.b0 J = RecyclerView.J(g10);
            if (J != null && !J.p() && (i12 = J.f2442c) >= i8 && i12 < i13) {
                J.b(2);
                J.a(obj);
                ((RecyclerView.n) g10.getLayoutParams()).f2493c = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2403b;
        ArrayList<RecyclerView.b0> arrayList = tVar.f2503c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.b0 b0Var = arrayList.get(size);
                if (b0Var != null && (i11 = b0Var.f2442c) >= i8 && i11 < i13) {
                    b0Var.b(2);
                    tVar.e(size);
                }
            } else {
                recyclerView.H0 = true;
                return;
            }
        }
    }

    public final void d(int i8, int i10) {
        RecyclerView recyclerView = this.f2756a;
        int h3 = recyclerView.f2409e.h();
        for (int i11 = 0; i11 < h3; i11++) {
            RecyclerView.b0 J = RecyclerView.J(recyclerView.f2409e.g(i11));
            if (J != null && !J.p() && J.f2442c >= i8) {
                J.m(i10, false);
                recyclerView.D0.f2531f = true;
            }
        }
        ArrayList<RecyclerView.b0> arrayList = recyclerView.f2403b.f2503c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.b0 b0Var = arrayList.get(i12);
            if (b0Var != null && b0Var.f2442c >= i8) {
                b0Var.m(i10, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.G0 = true;
    }

    public final void e(int i8, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.f2756a;
        int h3 = recyclerView.f2409e.h();
        int i18 = -1;
        if (i8 < i10) {
            i13 = i8;
            i12 = i10;
            i11 = -1;
        } else {
            i12 = i8;
            i13 = i10;
            i11 = 1;
        }
        for (int i19 = 0; i19 < h3; i19++) {
            RecyclerView.b0 J = RecyclerView.J(recyclerView.f2409e.g(i19));
            if (J != null && (i17 = J.f2442c) >= i13 && i17 <= i12) {
                if (i17 == i8) {
                    J.m(i10 - i8, false);
                } else {
                    J.m(i11, false);
                }
                recyclerView.D0.f2531f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2403b;
        tVar.getClass();
        if (i8 < i10) {
            i15 = i8;
            i14 = i10;
        } else {
            i14 = i8;
            i15 = i10;
            i18 = 1;
        }
        ArrayList<RecyclerView.b0> arrayList = tVar.f2503c;
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            RecyclerView.b0 b0Var = arrayList.get(i20);
            if (b0Var != null && (i16 = b0Var.f2442c) >= i15 && i16 <= i14) {
                if (i16 == i8) {
                    b0Var.m(i10 - i8, false);
                } else {
                    b0Var.m(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.G0 = true;
    }
}
