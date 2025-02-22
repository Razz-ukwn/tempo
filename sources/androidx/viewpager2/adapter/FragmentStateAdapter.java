package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.e0;
import androidx.fragment.app.i0;
import androidx.fragment.app.j0;
import androidx.fragment.app.p;
import androidx.fragment.app.x;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.recaptcha.RecaptchaDefinitions;
import d2.d1;
import d2.i0;
import java.util.List;
import java.util.WeakHashMap;
import o.b;
import o.d;

public abstract class FragmentStateAdapter extends RecyclerView.e<f> implements g {
    public final d<p> B = new d<>();
    public final d<p.f> C = new d<>();
    public final d<Integer> D = new d<>();
    public b E;
    public boolean F = false;
    public boolean G = false;

    /* renamed from: d  reason: collision with root package name */
    public final j f2820d;

    /* renamed from: e  reason: collision with root package name */
    public final i0 f2821e;

    public static abstract class a extends RecyclerView.g {
        public a(int i8) {
        }

        public abstract void a();

        public final void b() {
            a();
        }

        public final void c(Object obj, int i8, int i10) {
            a();
        }

        public final void d(int i8, int i10) {
            a();
        }

        public final void e(int i8, int i10) {
            a();
        }

        public final void f(int i8, int i10) {
            a();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public d f2827a;

        /* renamed from: b  reason: collision with root package name */
        public e f2828b;

        /* renamed from: c  reason: collision with root package name */
        public n f2829c;

        /* renamed from: d  reason: collision with root package name */
        public ViewPager2 f2830d;

        /* renamed from: e  reason: collision with root package name */
        public long f2831e = -1;

        public b() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z10) {
            int currentItem;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (!fragmentStateAdapter.f2821e.O() && this.f2830d.getScrollState() == 0) {
                d<p> dVar = fragmentStateAdapter.B;
                if (!(dVar.k() == 0) && (currentItem = this.f2830d.getCurrentItem()) < 5) {
                    long j10 = (long) currentItem;
                    if (j10 != this.f2831e || z10) {
                        p pVar = null;
                        p pVar2 = (p) dVar.g((Long) null, j10);
                        if (pVar2 != null && pVar2.C()) {
                            this.f2831e = j10;
                            i0 i0Var = fragmentStateAdapter.f2821e;
                            i0Var.getClass();
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0Var);
                            for (int i8 = 0; i8 < dVar.k(); i8++) {
                                long h3 = dVar.h(i8);
                                p l10 = dVar.l(i8);
                                if (l10.C()) {
                                    if (h3 != this.f2831e) {
                                        aVar.m(l10, j.b.f2280d);
                                    } else {
                                        pVar = l10;
                                    }
                                    l10.j0(h3 == this.f2831e);
                                }
                            }
                            if (pVar != null) {
                                aVar.m(pVar, j.b.f2281e);
                            }
                            if (!aVar.f2106a.isEmpty()) {
                                aVar.j();
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentStateAdapter(x xVar) {
        j0 I = xVar.I();
        this.f2821e = I;
        this.f2820d = xVar.f550d;
        if (!this.f2459a.a()) {
            this.f2460b = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public static void p(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public static boolean q(long j10) {
        return j10 >= 0 && j10 < ((long) 5);
    }

    public final Bundle a() {
        d<p> dVar = this.B;
        int k10 = dVar.k();
        d<p.f> dVar2 = this.C;
        Bundle bundle = new Bundle(dVar2.k() + k10);
        for (int i8 = 0; i8 < dVar.k(); i8++) {
            long h3 = dVar.h(i8);
            p pVar = (p) dVar.g((Long) null, h3);
            if (pVar != null && pVar.C()) {
                this.f2821e.U(bundle, "f#" + h3, pVar);
            }
        }
        for (int i10 = 0; i10 < dVar2.k(); i10++) {
            long h10 = dVar2.h(i10);
            if (q(h10)) {
                bundle.putParcelable("s#" + h10, (Parcelable) dVar2.g((Long) null, h10));
            }
        }
        return bundle;
    }

    public final void b(Parcelable parcelable) {
        d<p.f> dVar = this.C;
        boolean z10 = false;
        if (dVar.k() == 0) {
            d<p> dVar2 = this.B;
            if (dVar2.k() == 0) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String next : bundle.keySet()) {
                    if (next.startsWith("f#") && next.length() > 2) {
                        dVar2.i(this.f2821e.E(bundle, next), Long.parseLong(next.substring(2)));
                    } else {
                        if (next.startsWith("s#") && next.length() > 2) {
                            long parseLong = Long.parseLong(next.substring(2));
                            p.f fVar = (p.f) bundle.getParcelable(next);
                            if (q(parseLong)) {
                                dVar.i(fVar, parseLong);
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
                        }
                    }
                }
                if (dVar2.k() == 0) {
                    z10 = true;
                }
                if (!z10) {
                    this.G = true;
                    this.F = true;
                    r();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final c cVar = new c(this);
                    this.f2820d.a(new n() {
                        public final void d(androidx.lifecycle.p pVar, j.a aVar) {
                            if (aVar == j.a.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                pVar.b().c(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final long e(int i8) {
        return (long) i8;
    }

    public final void h(RecyclerView recyclerView) {
        if (this.E == null) {
            b bVar = new b();
            this.E = bVar;
            bVar.f2830d = b.a(recyclerView);
            d dVar = new d(bVar);
            bVar.f2827a = dVar;
            bVar.f2830d.f2845c.f2861a.add(dVar);
            e eVar = new e(bVar);
            bVar.f2828b = eVar;
            o(eVar);
            FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(bVar);
            bVar.f2829c = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
            this.f2820d.a(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void i(RecyclerView.b0 b0Var, int i8) {
        Bundle bundle;
        f fVar = (f) b0Var;
        long j10 = fVar.f2444e;
        FrameLayout frameLayout = (FrameLayout) fVar.f2440a;
        int id2 = frameLayout.getId();
        Long s10 = s(id2);
        d<Integer> dVar = this.D;
        if (!(s10 == null || s10.longValue() == j10)) {
            u(s10.longValue());
            dVar.j(s10.longValue());
        }
        dVar.i(Integer.valueOf(id2), j10);
        long j11 = (long) i8;
        d<p> dVar2 = this.B;
        if (dVar2.f12019a) {
            dVar2.f();
        }
        if (!(cb.b.o(dVar2.f12020b, dVar2.f12022d, j11) >= 0)) {
            List<p> list = ((yc.a) this).H;
            p pVar = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? list.get(4) : list.get(3) : list.get(2) : list.get(1) : list.get(0);
            Bundle bundle2 = null;
            p.f fVar2 = (p.f) this.C.g((Long) null, j11);
            if (pVar.P == null) {
                if (!(fVar2 == null || (bundle = fVar2.f2098a) == null)) {
                    bundle2 = bundle;
                }
                pVar.f2061b = bundle2;
                dVar2.i(pVar, j11);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
        if (i0.g.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new a(this, frameLayout, fVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        r();
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        int i10 = f.f2842u;
        FrameLayout frameLayout = new FrameLayout(recyclerView.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
        frameLayout.setId(i0.e.a());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    public final void k(RecyclerView recyclerView) {
        b bVar = this.E;
        bVar.getClass();
        ViewPager2 a10 = b.a(recyclerView);
        a10.f2845c.f2861a.remove(bVar.f2827a);
        e eVar = bVar.f2828b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.f2459a.unregisterObserver(eVar);
        fragmentStateAdapter.f2820d.c(bVar.f2829c);
        bVar.f2830d = null;
        this.E = null;
    }

    public final /* bridge */ /* synthetic */ boolean l(RecyclerView.b0 b0Var) {
        f fVar = (f) b0Var;
        return true;
    }

    public final void m(RecyclerView.b0 b0Var) {
        t((f) b0Var);
        r();
    }

    public final void n(RecyclerView.b0 b0Var) {
        Long s10 = s(((FrameLayout) ((f) b0Var).f2440a).getId());
        if (s10 != null) {
            u(s10.longValue());
            this.D.j(s10.longValue());
        }
    }

    public final void r() {
        d<p> dVar;
        d<Integer> dVar2;
        p pVar;
        View view;
        if (this.G && !this.f2821e.O()) {
            o.b bVar = new o.b();
            int i8 = 0;
            while (true) {
                dVar = this.B;
                int k10 = dVar.k();
                dVar2 = this.D;
                if (i8 >= k10) {
                    break;
                }
                long h3 = dVar.h(i8);
                if (!q(h3)) {
                    bVar.add(Long.valueOf(h3));
                    dVar2.j(h3);
                }
                i8++;
            }
            if (!this.F) {
                this.G = false;
                for (int i10 = 0; i10 < dVar.k(); i10++) {
                    long h10 = dVar.h(i10);
                    if (dVar2.f12019a) {
                        dVar2.f();
                    }
                    boolean z10 = true;
                    if (!(cb.b.o(dVar2.f12020b, dVar2.f12022d, h10) >= 0) && ((pVar = (p) dVar.g((Long) null, h10)) == null || (view = pVar.f2066d0) == null || view.getParent() == null)) {
                        z10 = false;
                    }
                    if (!z10) {
                        bVar.add(Long.valueOf(h10));
                    }
                }
            }
            b.a aVar = new b.a();
            while (aVar.hasNext()) {
                u(((Long) aVar.next()).longValue());
            }
        }
    }

    public final Long s(int i8) {
        Long l10 = null;
        int i10 = 0;
        while (true) {
            d<Integer> dVar = this.D;
            if (i10 >= dVar.k()) {
                return l10;
            }
            if (dVar.l(i10).intValue() == i8) {
                if (l10 == null) {
                    l10 = Long.valueOf(dVar.h(i10));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
            i10++;
        }
    }

    public final void t(final f fVar) {
        p pVar = (p) this.B.g((Long) null, fVar.f2444e);
        if (pVar != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.f2440a;
            View view = pVar.f2066d0;
            if (pVar.C() || view == null) {
                boolean C2 = pVar.C();
                androidx.fragment.app.i0 i0Var = this.f2821e;
                if (C2 && view == null) {
                    i0Var.m.f1944a.add(new e0.a(new b(this, pVar, frameLayout)));
                } else if (!pVar.C() || view.getParent() == null) {
                    if (pVar.C()) {
                        p(view, frameLayout);
                    } else if (!i0Var.O()) {
                        i0Var.m.f1944a.add(new e0.a(new b(this, pVar, frameLayout)));
                        i0Var.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0Var);
                        aVar.d(0, pVar, "f" + fVar.f2444e, 1);
                        aVar.m(pVar, j.b.f2280d);
                        aVar.j();
                        this.E.b(false);
                    } else if (!i0Var.H) {
                        this.f2820d.a(new n() {
                            public final void d(androidx.lifecycle.p pVar, j.a aVar) {
                                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                                if (!fragmentStateAdapter.f2821e.O()) {
                                    pVar.b().c(this);
                                    f fVar = fVar;
                                    WeakHashMap<View, d1> weakHashMap = d2.i0.f7217a;
                                    if (i0.g.b((FrameLayout) fVar.f2440a)) {
                                        fragmentStateAdapter.t(fVar);
                                    }
                                }
                            }
                        });
                    }
                } else if (view.getParent() != frameLayout) {
                    p(view, frameLayout);
                }
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void u(long j10) {
        ViewParent parent;
        d<p> dVar = this.B;
        p pVar = (p) dVar.g((Long) null, j10);
        if (pVar != null) {
            View view = pVar.f2066d0;
            if (!(view == null || (parent = view.getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            boolean q10 = q(j10);
            d<p.f> dVar2 = this.C;
            if (!q10) {
                dVar2.j(j10);
            }
            if (!pVar.C()) {
                dVar.j(j10);
                return;
            }
            androidx.fragment.app.i0 i0Var = this.f2821e;
            if (i0Var.O()) {
                this.G = true;
                return;
            }
            if (pVar.C() && q(j10)) {
                dVar2.i(i0Var.Z(pVar), j10);
            }
            i0Var.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0Var);
            aVar.l(pVar);
            aVar.j();
            dVar.j(j10);
        }
    }
}
