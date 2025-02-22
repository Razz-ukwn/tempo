package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f2604a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2605b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2606c = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f2607a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f2608b;

        public final void a(int i8) {
            if (i8 >= 64) {
                a aVar = this.f2608b;
                if (aVar != null) {
                    aVar.a(i8 - 64);
                    return;
                }
                return;
            }
            this.f2607a &= ~(1 << i8);
        }

        public final int b(int i8) {
            a aVar = this.f2608b;
            if (aVar == null) {
                return i8 >= 64 ? Long.bitCount(this.f2607a) : Long.bitCount(this.f2607a & ((1 << i8) - 1));
            }
            if (i8 < 64) {
                return Long.bitCount(this.f2607a & ((1 << i8) - 1));
            }
            return Long.bitCount(this.f2607a) + aVar.b(i8 - 64);
        }

        public final void c() {
            if (this.f2608b == null) {
                this.f2608b = new a();
            }
        }

        public final boolean d(int i8) {
            if (i8 < 64) {
                return (this.f2607a & (1 << i8)) != 0;
            }
            c();
            return this.f2608b.d(i8 - 64);
        }

        public final void e(int i8, boolean z10) {
            if (i8 >= 64) {
                c();
                this.f2608b.e(i8 - 64, z10);
                return;
            }
            long j10 = this.f2607a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i8) - 1;
            this.f2607a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i8);
            } else {
                a(i8);
            }
            if (z11 || this.f2608b != null) {
                c();
                this.f2608b.e(0, z11);
            }
        }

        public final boolean f(int i8) {
            if (i8 >= 64) {
                c();
                return this.f2608b.f(i8 - 64);
            }
            long j10 = 1 << i8;
            long j11 = this.f2607a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f2607a = j12;
            long j13 = j10 - 1;
            this.f2607a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f2608b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2608b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f2607a = 0;
            a aVar = this.f2608b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i8) {
            if (i8 >= 64) {
                c();
                this.f2608b.h(i8 - 64);
                return;
            }
            this.f2607a |= 1 << i8;
        }

        public final String toString() {
            if (this.f2608b == null) {
                return Long.toBinaryString(this.f2607a);
            }
            return this.f2608b.toString() + "xx" + Long.toBinaryString(this.f2607a);
        }
    }

    public interface b {
    }

    public d(w wVar) {
        this.f2604a = wVar;
    }

    public final void a(View view, int i8, boolean z10) {
        b bVar = this.f2604a;
        int a10 = i8 < 0 ? ((w) bVar).a() : f(i8);
        this.f2605b.e(a10, z10);
        if (z10) {
            i(view);
        }
        RecyclerView recyclerView = ((w) bVar).f2755a;
        recyclerView.addView(view, a10);
        RecyclerView.b0 J = RecyclerView.J(view);
        RecyclerView.e eVar = recyclerView.H;
        if (!(eVar == null || J == null)) {
            eVar.m(J);
        }
        ArrayList arrayList = recyclerView.f2404b0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.o) recyclerView.f2404b0.get(size)).b(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b bVar = this.f2604a;
        int a10 = i8 < 0 ? ((w) bVar).a() : f(i8);
        this.f2605b.e(a10, z10);
        if (z10) {
            i(view);
        }
        w wVar = (w) bVar;
        wVar.getClass();
        RecyclerView.b0 J = RecyclerView.J(view);
        RecyclerView recyclerView = wVar.f2755a;
        if (J != null) {
            if (J.l() || J.p()) {
                J.f2449j &= -257;
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + J + recyclerView.z());
            }
        }
        recyclerView.attachViewToParent(view, a10, layoutParams);
    }

    public final void c(int i8) {
        RecyclerView.b0 J;
        int f10 = f(i8);
        this.f2605b.f(f10);
        w wVar = (w) this.f2604a;
        View childAt = wVar.f2755a.getChildAt(f10);
        RecyclerView recyclerView = wVar.f2755a;
        if (!(childAt == null || (J = RecyclerView.J(childAt)) == null)) {
            if (!J.l() || J.p()) {
                J.b(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + J + recyclerView.z());
            }
        }
        recyclerView.detachViewFromParent(f10);
    }

    public final View d(int i8) {
        return ((w) this.f2604a).f2755a.getChildAt(f(i8));
    }

    public final int e() {
        return ((w) this.f2604a).a() - this.f2606c.size();
    }

    public final int f(int i8) {
        if (i8 < 0) {
            return -1;
        }
        int a10 = ((w) this.f2604a).a();
        int i10 = i8;
        while (i10 < a10) {
            a aVar = this.f2605b;
            int b10 = i8 - (i10 - aVar.b(i10));
            if (b10 == 0) {
                while (aVar.d(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += b10;
        }
        return -1;
    }

    public final View g(int i8) {
        return ((w) this.f2604a).f2755a.getChildAt(i8);
    }

    public final int h() {
        return ((w) this.f2604a).a();
    }

    public final void i(View view) {
        this.f2606c.add(view);
        w wVar = (w) this.f2604a;
        wVar.getClass();
        RecyclerView.b0 J = RecyclerView.J(view);
        if (J != null) {
            int i8 = J.f2455q;
            View view2 = J.f2440a;
            if (i8 != -1) {
                J.f2454p = i8;
            } else {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                J.f2454p = i0.d.c(view2);
            }
            RecyclerView recyclerView = wVar.f2755a;
            if (recyclerView.L()) {
                J.f2455q = 4;
                recyclerView.Q0.add(J);
                return;
            }
            WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
            i0.d.s(view2, 4);
        }
    }

    public final boolean j(View view) {
        return this.f2606c.contains(view);
    }

    public final void k(View view) {
        if (this.f2606c.remove(view)) {
            w wVar = (w) this.f2604a;
            wVar.getClass();
            RecyclerView.b0 J = RecyclerView.J(view);
            if (J != null) {
                int i8 = J.f2454p;
                RecyclerView recyclerView = wVar.f2755a;
                if (recyclerView.L()) {
                    J.f2455q = i8;
                    recyclerView.Q0.add(J);
                } else {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.d.s(J.f2440a, i8);
                }
                J.f2454p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2605b.toString() + ", hidden list:" + this.f2606c.size();
    }
}
