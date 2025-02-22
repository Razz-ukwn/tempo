package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.m implements RecyclerView.x.b {
    public final a A;
    public final b B;
    public final int C;
    public final int[] D;

    /* renamed from: p  reason: collision with root package name */
    public int f2366p;

    /* renamed from: q  reason: collision with root package name */
    public c f2367q;

    /* renamed from: r  reason: collision with root package name */
    public t f2368r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2369s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2370t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2371u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2372v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f2373w;

    /* renamed from: x  reason: collision with root package name */
    public int f2374x;

    /* renamed from: y  reason: collision with root package name */
    public int f2375y;

    /* renamed from: z  reason: collision with root package name */
    public d f2376z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public t f2377a;

        /* renamed from: b  reason: collision with root package name */
        public int f2378b;

        /* renamed from: c  reason: collision with root package name */
        public int f2379c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2380d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2381e;

        public a() {
            d();
        }

        public final void a() {
            this.f2379c = this.f2380d ? this.f2377a.g() : this.f2377a.k();
        }

        public final void b(View view, int i8) {
            if (this.f2380d) {
                int b10 = this.f2377a.b(view);
                t tVar = this.f2377a;
                this.f2379c = (Integer.MIN_VALUE == tVar.f2750b ? 0 : tVar.l() - tVar.f2750b) + b10;
            } else {
                this.f2379c = this.f2377a.e(view);
            }
            this.f2378b = i8;
        }

        public final void c(View view, int i8) {
            t tVar = this.f2377a;
            int l10 = Integer.MIN_VALUE == tVar.f2750b ? 0 : tVar.l() - tVar.f2750b;
            if (l10 >= 0) {
                b(view, i8);
                return;
            }
            this.f2378b = i8;
            if (this.f2380d) {
                int g10 = (this.f2377a.g() - l10) - this.f2377a.b(view);
                this.f2379c = this.f2377a.g() - g10;
                if (g10 > 0) {
                    int c3 = this.f2379c - this.f2377a.c(view);
                    int k10 = this.f2377a.k();
                    int min = c3 - (Math.min(this.f2377a.e(view) - k10, 0) + k10);
                    if (min < 0) {
                        this.f2379c = Math.min(g10, -min) + this.f2379c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e10 = this.f2377a.e(view);
            int k11 = e10 - this.f2377a.k();
            this.f2379c = e10;
            if (k11 > 0) {
                int g11 = (this.f2377a.g() - Math.min(0, (this.f2377a.g() - l10) - this.f2377a.b(view))) - (this.f2377a.c(view) + e10);
                if (g11 < 0) {
                    this.f2379c -= Math.min(k11, -g11);
                }
            }
        }

        public final void d() {
            this.f2378b = -1;
            this.f2379c = Integer.MIN_VALUE;
            this.f2380d = false;
            this.f2381e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f2378b + ", mCoordinate=" + this.f2379c + ", mLayoutFromEnd=" + this.f2380d + ", mValid=" + this.f2381e + '}';
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2382a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2383b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2384c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2385d;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2386a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f2387b;

        /* renamed from: c  reason: collision with root package name */
        public int f2388c;

        /* renamed from: d  reason: collision with root package name */
        public int f2389d;

        /* renamed from: e  reason: collision with root package name */
        public int f2390e;

        /* renamed from: f  reason: collision with root package name */
        public int f2391f;

        /* renamed from: g  reason: collision with root package name */
        public int f2392g;

        /* renamed from: h  reason: collision with root package name */
        public int f2393h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f2394i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f2395j;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.b0> f2396k = null;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2397l;

        public final void a(View view) {
            int a10;
            int size = this.f2396k.size();
            View view2 = null;
            int i8 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                View view3 = this.f2396k.get(i10).f2440a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.c() && (a10 = (nVar.a() - this.f2389d) * this.f2390e) >= 0 && a10 < i8) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i8 = a10;
                }
            }
            if (view2 == null) {
                this.f2389d = -1;
            } else {
                this.f2389d = ((RecyclerView.n) view2.getLayoutParams()).a();
            }
        }

        public final View b(RecyclerView.t tVar) {
            List<RecyclerView.b0> list = this.f2396k;
            if (list != null) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    View view = this.f2396k.get(i8).f2440a;
                    RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                    if (!nVar.c() && this.f2389d == nVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = tVar.i(this.f2389d, Long.MAX_VALUE).f2440a;
            this.f2389d += this.f2390e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f2398a;

        /* renamed from: b  reason: collision with root package name */
        public int f2399b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2400c;

        public class a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f2398a);
            parcel.writeInt(this.f2399b);
            parcel.writeInt(this.f2400c ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f2398a = parcel.readInt();
            this.f2399b = parcel.readInt();
            this.f2400c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f2398a = dVar.f2398a;
            this.f2399b = dVar.f2399b;
            this.f2400c = dVar.f2400c;
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public void A0(RecyclerView recyclerView, int i8) {
        o oVar = new o(recyclerView.getContext());
        oVar.f2511a = i8;
        B0(oVar);
    }

    public boolean C0() {
        return this.f2376z == null && this.f2369s == this.f2372v;
    }

    public void D0(RecyclerView.y yVar, int[] iArr) {
        int i8;
        int l10 = yVar.f2526a != -1 ? this.f2368r.l() : 0;
        if (this.f2367q.f2391f == -1) {
            i8 = 0;
        } else {
            i8 = l10;
            l10 = 0;
        }
        iArr[0] = l10;
        iArr[1] = i8;
    }

    public void E0(RecyclerView.y yVar, c cVar, RecyclerView.m.c cVar2) {
        int i8 = cVar.f2389d;
        if (i8 >= 0 && i8 < yVar.b()) {
            ((m.b) cVar2).a(i8, Math.max(0, cVar.f2392g));
        }
    }

    public final int F0(RecyclerView.y yVar) {
        if (w() == 0) {
            return 0;
        }
        J0();
        t tVar = this.f2368r;
        boolean z10 = !this.f2373w;
        return z.a(yVar, tVar, M0(z10), L0(z10), this, this.f2373w);
    }

    public final int G0(RecyclerView.y yVar) {
        if (w() == 0) {
            return 0;
        }
        J0();
        t tVar = this.f2368r;
        boolean z10 = !this.f2373w;
        return z.b(yVar, tVar, M0(z10), L0(z10), this, this.f2373w, this.f2371u);
    }

    public final int H0(RecyclerView.y yVar) {
        if (w() == 0) {
            return 0;
        }
        J0();
        t tVar = this.f2368r;
        boolean z10 = !this.f2373w;
        return z.c(yVar, tVar, M0(z10), L0(z10), this, this.f2373w);
    }

    public final int I0(int i8) {
        if (i8 == 1) {
            return (this.f2366p != 1 && W0()) ? 1 : -1;
        }
        if (i8 == 2) {
            return (this.f2366p != 1 && W0()) ? -1 : 1;
        }
        if (i8 == 17) {
            return this.f2366p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i8 == 33) {
            return this.f2366p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i8 == 66) {
            return this.f2366p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i8 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f2366p == 1 ? 1 : Integer.MIN_VALUE;
    }

    public final void J0() {
        if (this.f2367q == null) {
            this.f2367q = new c();
        }
    }

    public final int K0(RecyclerView.t tVar, c cVar, RecyclerView.y yVar, boolean z10) {
        int i8 = cVar.f2388c;
        int i10 = cVar.f2392g;
        if (i10 != Integer.MIN_VALUE) {
            if (i8 < 0) {
                cVar.f2392g = i10 + i8;
            }
            Z0(tVar, cVar);
        }
        int i11 = cVar.f2388c + cVar.f2393h;
        while (true) {
            if (!cVar.f2397l && i11 <= 0) {
                break;
            }
            int i12 = cVar.f2389d;
            if (!(i12 >= 0 && i12 < yVar.b())) {
                break;
            }
            b bVar = this.B;
            bVar.f2382a = 0;
            bVar.f2383b = false;
            bVar.f2384c = false;
            bVar.f2385d = false;
            X0(tVar, yVar, cVar, bVar);
            if (!bVar.f2383b) {
                int i13 = cVar.f2387b;
                int i14 = bVar.f2382a;
                cVar.f2387b = (cVar.f2391f * i14) + i13;
                if (!bVar.f2384c || cVar.f2396k != null || !yVar.f2532g) {
                    cVar.f2388c -= i14;
                    i11 -= i14;
                }
                int i15 = cVar.f2392g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    cVar.f2392g = i16;
                    int i17 = cVar.f2388c;
                    if (i17 < 0) {
                        cVar.f2392g = i16 + i17;
                    }
                    Z0(tVar, cVar);
                }
                if (z10 && bVar.f2385d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i8 - cVar.f2388c;
    }

    public final View L0(boolean z10) {
        return this.f2371u ? Q0(0, w(), z10) : Q0(w() - 1, -1, z10);
    }

    public final boolean M() {
        return true;
    }

    public final View M0(boolean z10) {
        return this.f2371u ? Q0(w() - 1, -1, z10) : Q0(0, w(), z10);
    }

    public final int N0() {
        View Q0 = Q0(0, w(), false);
        if (Q0 == null) {
            return -1;
        }
        return RecyclerView.m.G(Q0);
    }

    public final int O0() {
        View Q0 = Q0(w() - 1, -1, false);
        if (Q0 == null) {
            return -1;
        }
        return RecyclerView.m.G(Q0);
    }

    public final View P0(int i8, int i10) {
        int i11;
        int i12;
        J0();
        if ((i10 > i8 ? 1 : i10 < i8 ? (char) 65535 : 0) == 0) {
            return v(i8);
        }
        if (this.f2368r.e(v(i8)) < this.f2368r.k()) {
            i12 = 16644;
            i11 = 16388;
        } else {
            i12 = 4161;
            i11 = 4097;
        }
        return this.f2366p == 0 ? this.f2473c.a(i8, i10, i12, i11) : this.f2474d.a(i8, i10, i12, i11);
    }

    public final View Q0(int i8, int i10, boolean z10) {
        J0();
        int i11 = z10 ? 24579 : 320;
        return this.f2366p == 0 ? this.f2473c.a(i8, i10, i11, 320) : this.f2474d.a(i8, i10, i11, 320);
    }

    public View R0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i8;
        int i10;
        int i11;
        J0();
        int w10 = w();
        if (z11) {
            i11 = w() - 1;
            i10 = -1;
            i8 = -1;
        } else {
            i10 = w10;
            i11 = 0;
            i8 = 1;
        }
        int b10 = yVar.b();
        int k10 = this.f2368r.k();
        int g10 = this.f2368r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View v3 = v(i11);
            int G = RecyclerView.m.G(v3);
            int e10 = this.f2368r.e(v3);
            int b11 = this.f2368r.b(v3);
            if (G >= 0 && G < b10) {
                if (!((RecyclerView.n) v3.getLayoutParams()).c()) {
                    boolean z12 = b11 <= k10 && e10 < k10;
                    boolean z13 = e10 >= g10 && b11 > g10;
                    if (!z12 && !z13) {
                        return v3;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = v3;
                        }
                    } else if (!z12) {
                        if (view != null) {
                        }
                        view = v3;
                    }
                    view2 = v3;
                } else if (view3 == null) {
                    view3 = v3;
                }
            }
            i11 += i8;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final void S(RecyclerView recyclerView) {
    }

    public final int S0(int i8, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g10;
        int g11 = this.f2368r.g() - i8;
        if (g11 <= 0) {
            return 0;
        }
        int i10 = -c1(-g11, tVar, yVar);
        int i11 = i8 + i10;
        if (!z10 || (g10 = this.f2368r.g() - i11) <= 0) {
            return i10;
        }
        this.f2368r.o(g10);
        return g10 + i10;
    }

    public View T(View view, int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        int I0;
        b1();
        if (w() == 0 || (I0 = I0(i8)) == Integer.MIN_VALUE) {
            return null;
        }
        J0();
        f1(I0, (int) (((float) this.f2368r.l()) * 0.33333334f), false, yVar);
        c cVar = this.f2367q;
        cVar.f2392g = Integer.MIN_VALUE;
        cVar.f2386a = false;
        K0(tVar, cVar, yVar, true);
        View P0 = I0 == -1 ? this.f2371u ? P0(w() - 1, -1) : P0(0, w()) : this.f2371u ? P0(0, w()) : P0(w() - 1, -1);
        View V0 = I0 == -1 ? V0() : U0();
        if (!V0.hasFocusable()) {
            return P0;
        }
        if (P0 == null) {
            return null;
        }
        return V0;
    }

    public final int T0(int i8, RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int k11 = i8 - this.f2368r.k();
        if (k11 <= 0) {
            return 0;
        }
        int i10 = -c1(k11, tVar, yVar);
        int i11 = i8 + i10;
        if (!z10 || (k10 = i11 - this.f2368r.k()) <= 0) {
            return i10;
        }
        this.f2368r.o(-k10);
        return i10 - k10;
    }

    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(N0());
            accessibilityEvent.setToIndex(O0());
        }
    }

    public final View U0() {
        return v(this.f2371u ? 0 : w() - 1);
    }

    public final View V0() {
        return v(this.f2371u ? w() - 1 : 0);
    }

    public final boolean W0() {
        return A() == 1;
    }

    public void X0(RecyclerView.t tVar, RecyclerView.y yVar, c cVar, b bVar) {
        int i8;
        int i10;
        int i11;
        int i12;
        View b10 = cVar.b(tVar);
        if (b10 == null) {
            bVar.f2383b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) b10.getLayoutParams();
        if (cVar.f2396k == null) {
            if (this.f2371u == (cVar.f2391f == -1)) {
                b(b10, -1, false);
            } else {
                b(b10, 0, false);
            }
        } else {
            if (this.f2371u == (cVar.f2391f == -1)) {
                b(b10, -1, true);
            } else {
                b(b10, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) b10.getLayoutParams();
        Rect K = this.f2472b.K(b10);
        int x10 = RecyclerView.m.x(d(), this.f2483n, this.f2482l, E() + D() + nVar2.leftMargin + nVar2.rightMargin + K.left + K.right + 0, nVar2.width);
        int x11 = RecyclerView.m.x(e(), this.f2484o, this.m, C() + F() + nVar2.topMargin + nVar2.bottomMargin + K.top + K.bottom + 0, nVar2.height);
        if (x0(b10, x10, x11, nVar2)) {
            b10.measure(x10, x11);
        }
        bVar.f2382a = this.f2368r.c(b10);
        if (this.f2366p == 1) {
            if (W0()) {
                i12 = this.f2483n - E();
                i11 = i12 - this.f2368r.d(b10);
            } else {
                i11 = D();
                i12 = this.f2368r.d(b10) + i11;
            }
            if (cVar.f2391f == -1) {
                i8 = cVar.f2387b;
                i10 = i8 - bVar.f2382a;
            } else {
                i10 = cVar.f2387b;
                i8 = bVar.f2382a + i10;
            }
        } else {
            int F = F();
            int d10 = this.f2368r.d(b10) + F;
            if (cVar.f2391f == -1) {
                int i13 = cVar.f2387b;
                int i14 = i13 - bVar.f2382a;
                int i15 = F;
                i12 = i13;
                i8 = d10;
                i11 = i14;
                i10 = i15;
            } else {
                int i16 = cVar.f2387b;
                int i17 = bVar.f2382a + i16;
                int i18 = d10;
                i11 = i16;
                i8 = i18;
                int i19 = i17;
                i10 = F;
                i12 = i19;
            }
        }
        RecyclerView.m.O(b10, i11, i10, i12, i8);
        if (nVar.c() || nVar.b()) {
            bVar.f2384c = true;
        }
        bVar.f2385d = b10.hasFocusable();
    }

    public void Y0(RecyclerView.t tVar, RecyclerView.y yVar, a aVar, int i8) {
    }

    public final void Z0(RecyclerView.t tVar, c cVar) {
        if (cVar.f2386a && !cVar.f2397l) {
            int i8 = cVar.f2392g;
            int i10 = cVar.f2394i;
            if (cVar.f2391f == -1) {
                int w10 = w();
                if (i8 >= 0) {
                    int f10 = (this.f2368r.f() - i8) + i10;
                    if (this.f2371u) {
                        for (int i11 = 0; i11 < w10; i11++) {
                            View v3 = v(i11);
                            if (this.f2368r.e(v3) < f10 || this.f2368r.n(v3) < f10) {
                                a1(tVar, 0, i11);
                                return;
                            }
                        }
                        return;
                    }
                    int i12 = w10 - 1;
                    for (int i13 = i12; i13 >= 0; i13--) {
                        View v10 = v(i13);
                        if (this.f2368r.e(v10) < f10 || this.f2368r.n(v10) < f10) {
                            a1(tVar, i12, i13);
                            return;
                        }
                    }
                }
            } else if (i8 >= 0) {
                int i14 = i8 - i10;
                int w11 = w();
                if (this.f2371u) {
                    int i15 = w11 - 1;
                    for (int i16 = i15; i16 >= 0; i16--) {
                        View v11 = v(i16);
                        if (this.f2368r.b(v11) > i14 || this.f2368r.m(v11) > i14) {
                            a1(tVar, i15, i16);
                            return;
                        }
                    }
                    return;
                }
                for (int i17 = 0; i17 < w11; i17++) {
                    View v12 = v(i17);
                    if (this.f2368r.b(v12) > i14 || this.f2368r.m(v12) > i14) {
                        a1(tVar, 0, i17);
                        return;
                    }
                }
            }
        }
    }

    public final PointF a(int i8) {
        if (w() == 0) {
            return null;
        }
        boolean z10 = false;
        int i10 = 1;
        if (i8 < RecyclerView.m.G(v(0))) {
            z10 = true;
        }
        if (z10 != this.f2371u) {
            i10 = -1;
        }
        return this.f2366p == 0 ? new PointF((float) i10, 0.0f) : new PointF(0.0f, (float) i10);
    }

    public final void a1(RecyclerView.t tVar, int i8, int i10) {
        if (i8 != i10) {
            if (i10 > i8) {
                while (true) {
                    i10--;
                    if (i10 >= i8) {
                        View v3 = v(i10);
                        m0(i10);
                        tVar.f(v3);
                    } else {
                        return;
                    }
                }
            } else {
                while (i8 > i10) {
                    View v10 = v(i8);
                    m0(i8);
                    tVar.f(v10);
                    i8--;
                }
            }
        }
    }

    public final void b1() {
        if (this.f2366p == 1 || !W0()) {
            this.f2371u = this.f2370t;
        } else {
            this.f2371u = !this.f2370t;
        }
    }

    public final void c(String str) {
        if (this.f2376z == null) {
            super.c(str);
        }
    }

    public final int c1(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (w() == 0 || i8 == 0) {
            return 0;
        }
        J0();
        this.f2367q.f2386a = true;
        int i10 = i8 > 0 ? 1 : -1;
        int abs = Math.abs(i8);
        f1(i10, abs, true, yVar);
        c cVar = this.f2367q;
        int K0 = K0(tVar, cVar, yVar, false) + cVar.f2392g;
        if (K0 < 0) {
            return 0;
        }
        if (abs > K0) {
            i8 = i10 * K0;
        }
        this.f2368r.o(-i8);
        this.f2367q.f2395j = i8;
        return i8;
    }

    public final boolean d() {
        return this.f2366p == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d0(androidx.recyclerview.widget.RecyclerView.t r18, androidx.recyclerview.widget.RecyclerView.y r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f2376z
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f2374x
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r19.b()
            if (r3 != 0) goto L_0x0019
            r17.j0(r18)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f2376z
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002a
            int r3 = r3.f2398a
            if (r3 < 0) goto L_0x0025
            r7 = r5
            goto L_0x0026
        L_0x0025:
            r7 = r6
        L_0x0026:
            if (r7 == 0) goto L_0x002a
            r0.f2374x = r3
        L_0x002a:
            r17.J0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r3.f2386a = r6
            r17.b1()
            androidx.recyclerview.widget.RecyclerView r3 = r0.f2472b
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x0049
        L_0x003a:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x0038
            androidx.recyclerview.widget.d r8 = r0.f2471a
            boolean r8 = r8.j(r3)
            if (r8 == 0) goto L_0x0049
            goto L_0x0038
        L_0x0049:
            androidx.recyclerview.widget.LinearLayoutManager$a r8 = r0.A
            boolean r9 = r8.f2381e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == 0) goto L_0x0081
            int r9 = r0.f2374x
            if (r9 != r4) goto L_0x0081
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f2376z
            if (r9 == 0) goto L_0x005a
            goto L_0x0081
        L_0x005a:
            if (r3 == 0) goto L_0x0246
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r9 = r9.e(r3)
            androidx.recyclerview.widget.t r11 = r0.f2368r
            int r11 = r11.g()
            if (r9 >= r11) goto L_0x0078
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r9 = r9.b(r3)
            androidx.recyclerview.widget.t r11 = r0.f2368r
            int r11 = r11.k()
            if (r9 > r11) goto L_0x0246
        L_0x0078:
            int r9 = androidx.recyclerview.widget.RecyclerView.m.G(r3)
            r8.c(r3, r9)
            goto L_0x0246
        L_0x0081:
            r8.d()
            boolean r3 = r0.f2371u
            boolean r9 = r0.f2372v
            r3 = r3 ^ r9
            r8.f2380d = r3
            boolean r3 = r2.f2532g
            if (r3 != 0) goto L_0x0190
            int r3 = r0.f2374x
            if (r3 != r4) goto L_0x0095
            goto L_0x0190
        L_0x0095:
            if (r3 < 0) goto L_0x018c
            int r9 = r19.b()
            if (r3 < r9) goto L_0x009f
            goto L_0x018c
        L_0x009f:
            int r3 = r0.f2374x
            r8.f2378b = r3
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f2376z
            if (r9 == 0) goto L_0x00d4
            int r11 = r9.f2398a
            if (r11 < 0) goto L_0x00ad
            r11 = r5
            goto L_0x00ae
        L_0x00ad:
            r11 = r6
        L_0x00ae:
            if (r11 == 0) goto L_0x00d4
            boolean r3 = r9.f2400c
            r8.f2380d = r3
            if (r3 == 0) goto L_0x00c5
            androidx.recyclerview.widget.t r3 = r0.f2368r
            int r3 = r3.g()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f2376z
            int r9 = r9.f2399b
            int r3 = r3 - r9
            r8.f2379c = r3
            goto L_0x018a
        L_0x00c5:
            androidx.recyclerview.widget.t r3 = r0.f2368r
            int r3 = r3.k()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.f2376z
            int r9 = r9.f2399b
            int r3 = r3 + r9
            r8.f2379c = r3
            goto L_0x018a
        L_0x00d4:
            int r9 = r0.f2375y
            if (r9 != r10) goto L_0x016d
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L_0x014b
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r9 = r9.c(r3)
            androidx.recyclerview.widget.t r11 = r0.f2368r
            int r11 = r11.l()
            if (r9 <= r11) goto L_0x00f1
            r8.a()
            goto L_0x018a
        L_0x00f1:
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r9 = r9.e(r3)
            androidx.recyclerview.widget.t r11 = r0.f2368r
            int r11 = r11.k()
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x010c
            androidx.recyclerview.widget.t r3 = r0.f2368r
            int r3 = r3.k()
            r8.f2379c = r3
            r8.f2380d = r6
            goto L_0x018a
        L_0x010c:
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r9 = r9.g()
            androidx.recyclerview.widget.t r11 = r0.f2368r
            int r11 = r11.b(r3)
            int r9 = r9 - r11
            if (r9 >= 0) goto L_0x0127
            androidx.recyclerview.widget.t r3 = r0.f2368r
            int r3 = r3.g()
            r8.f2379c = r3
            r8.f2380d = r5
            goto L_0x018a
        L_0x0127:
            boolean r9 = r8.f2380d
            if (r9 == 0) goto L_0x0142
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r3 = r9.b(r3)
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r11 = r9.f2750b
            if (r10 != r11) goto L_0x0139
            r11 = r6
            goto L_0x0140
        L_0x0139:
            int r11 = r9.l()
            int r9 = r9.f2750b
            int r11 = r11 - r9
        L_0x0140:
            int r11 = r11 + r3
            goto L_0x0148
        L_0x0142:
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r11 = r9.e(r3)
        L_0x0148:
            r8.f2379c = r11
            goto L_0x018a
        L_0x014b:
            int r3 = r17.w()
            if (r3 <= 0) goto L_0x0169
            android.view.View r3 = r0.v(r6)
            int r3 = androidx.recyclerview.widget.RecyclerView.m.G(r3)
            int r9 = r0.f2374x
            if (r9 >= r3) goto L_0x015f
            r3 = r5
            goto L_0x0160
        L_0x015f:
            r3 = r6
        L_0x0160:
            boolean r9 = r0.f2371u
            if (r3 != r9) goto L_0x0166
            r3 = r5
            goto L_0x0167
        L_0x0166:
            r3 = r6
        L_0x0167:
            r8.f2380d = r3
        L_0x0169:
            r8.a()
            goto L_0x018a
        L_0x016d:
            boolean r3 = r0.f2371u
            r8.f2380d = r3
            if (r3 == 0) goto L_0x017f
            androidx.recyclerview.widget.t r3 = r0.f2368r
            int r3 = r3.g()
            int r9 = r0.f2375y
            int r3 = r3 - r9
            r8.f2379c = r3
            goto L_0x018a
        L_0x017f:
            androidx.recyclerview.widget.t r3 = r0.f2368r
            int r3 = r3.k()
            int r9 = r0.f2375y
            int r3 = r3 + r9
            r8.f2379c = r3
        L_0x018a:
            r3 = r5
            goto L_0x0191
        L_0x018c:
            r0.f2374x = r4
            r0.f2375y = r10
        L_0x0190:
            r3 = r6
        L_0x0191:
            if (r3 == 0) goto L_0x0195
            goto L_0x0244
        L_0x0195:
            int r3 = r17.w()
            if (r3 != 0) goto L_0x019d
            goto L_0x0230
        L_0x019d:
            androidx.recyclerview.widget.RecyclerView r3 = r0.f2472b
            if (r3 != 0) goto L_0x01a3
        L_0x01a1:
            r3 = 0
            goto L_0x01b2
        L_0x01a3:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x01a1
            androidx.recyclerview.widget.d r9 = r0.f2471a
            boolean r9 = r9.j(r3)
            if (r9 == 0) goto L_0x01b2
            goto L_0x01a1
        L_0x01b2:
            if (r3 == 0) goto L_0x01dd
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r9 = (androidx.recyclerview.widget.RecyclerView.n) r9
            boolean r11 = r9.c()
            if (r11 != 0) goto L_0x01d2
            int r11 = r9.a()
            if (r11 < 0) goto L_0x01d2
            int r9 = r9.a()
            int r11 = r19.b()
            if (r9 >= r11) goto L_0x01d2
            r9 = r5
            goto L_0x01d3
        L_0x01d2:
            r9 = r6
        L_0x01d3:
            if (r9 == 0) goto L_0x01dd
            int r9 = androidx.recyclerview.widget.RecyclerView.m.G(r3)
            r8.c(r3, r9)
            goto L_0x022e
        L_0x01dd:
            boolean r3 = r0.f2369s
            boolean r9 = r0.f2372v
            if (r3 == r9) goto L_0x01e4
            goto L_0x0230
        L_0x01e4:
            boolean r3 = r8.f2380d
            android.view.View r3 = r0.R0(r1, r2, r3, r9)
            if (r3 == 0) goto L_0x0230
            int r9 = androidx.recyclerview.widget.RecyclerView.m.G(r3)
            r8.b(r3, r9)
            boolean r9 = r2.f2532g
            if (r9 != 0) goto L_0x022e
            boolean r9 = r17.C0()
            if (r9 == 0) goto L_0x022e
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r9 = r9.e(r3)
            androidx.recyclerview.widget.t r11 = r0.f2368r
            int r3 = r11.b(r3)
            androidx.recyclerview.widget.t r11 = r0.f2368r
            int r11 = r11.k()
            androidx.recyclerview.widget.t r12 = r0.f2368r
            int r12 = r12.g()
            if (r3 > r11) goto L_0x021b
            if (r9 >= r11) goto L_0x021b
            r13 = r5
            goto L_0x021c
        L_0x021b:
            r13 = r6
        L_0x021c:
            if (r9 < r12) goto L_0x0222
            if (r3 <= r12) goto L_0x0222
            r3 = r5
            goto L_0x0223
        L_0x0222:
            r3 = r6
        L_0x0223:
            if (r13 != 0) goto L_0x0227
            if (r3 == 0) goto L_0x022e
        L_0x0227:
            boolean r3 = r8.f2380d
            if (r3 == 0) goto L_0x022c
            r11 = r12
        L_0x022c:
            r8.f2379c = r11
        L_0x022e:
            r3 = r5
            goto L_0x0231
        L_0x0230:
            r3 = r6
        L_0x0231:
            if (r3 == 0) goto L_0x0234
            goto L_0x0244
        L_0x0234:
            r8.a()
            boolean r3 = r0.f2372v
            if (r3 == 0) goto L_0x0241
            int r3 = r19.b()
            int r3 = r3 + r4
            goto L_0x0242
        L_0x0241:
            r3 = r6
        L_0x0242:
            r8.f2378b = r3
        L_0x0244:
            r8.f2381e = r5
        L_0x0246:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            int r9 = r3.f2395j
            if (r9 < 0) goto L_0x024e
            r9 = r5
            goto L_0x024f
        L_0x024e:
            r9 = r4
        L_0x024f:
            r3.f2391f = r9
            int[] r3 = r0.D
            r3[r6] = r6
            r3[r5] = r6
            r0.D0(r2, r3)
            r9 = r3[r6]
            int r9 = java.lang.Math.max(r6, r9)
            androidx.recyclerview.widget.t r11 = r0.f2368r
            int r11 = r11.k()
            int r11 = r11 + r9
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r6, r3)
            androidx.recyclerview.widget.t r9 = r0.f2368r
            int r9 = r9.h()
            int r9 = r9 + r3
            boolean r3 = r2.f2532g
            if (r3 == 0) goto L_0x02af
            int r3 = r0.f2374x
            if (r3 == r4) goto L_0x02af
            int r12 = r0.f2375y
            if (r12 == r10) goto L_0x02af
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L_0x02af
            boolean r10 = r0.f2371u
            if (r10 == 0) goto L_0x029a
            androidx.recyclerview.widget.t r10 = r0.f2368r
            int r10 = r10.g()
            androidx.recyclerview.widget.t r12 = r0.f2368r
            int r3 = r12.b(r3)
            int r10 = r10 - r3
            int r3 = r0.f2375y
            goto L_0x02a9
        L_0x029a:
            androidx.recyclerview.widget.t r10 = r0.f2368r
            int r3 = r10.e(r3)
            androidx.recyclerview.widget.t r10 = r0.f2368r
            int r10 = r10.k()
            int r3 = r3 - r10
            int r10 = r0.f2375y
        L_0x02a9:
            int r10 = r10 - r3
            if (r10 <= 0) goto L_0x02ae
            int r11 = r11 + r10
            goto L_0x02af
        L_0x02ae:
            int r9 = r9 - r10
        L_0x02af:
            boolean r3 = r8.f2380d
            if (r3 == 0) goto L_0x02b8
            boolean r3 = r0.f2371u
            if (r3 == 0) goto L_0x02bc
            goto L_0x02be
        L_0x02b8:
            boolean r3 = r0.f2371u
            if (r3 == 0) goto L_0x02be
        L_0x02bc:
            r3 = r4
            goto L_0x02bf
        L_0x02be:
            r3 = r5
        L_0x02bf:
            r0.Y0(r1, r2, r8, r3)
            r17.p(r18)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            androidx.recyclerview.widget.t r10 = r0.f2368r
            int r10 = r10.i()
            if (r10 != 0) goto L_0x02d9
            androidx.recyclerview.widget.t r10 = r0.f2368r
            int r10 = r10.f()
            if (r10 != 0) goto L_0x02d9
            r10 = r5
            goto L_0x02da
        L_0x02d9:
            r10 = r6
        L_0x02da:
            r3.f2397l = r10
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r3.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r3.f2394i = r6
            boolean r3 = r8.f2380d
            if (r3 == 0) goto L_0x032e
            int r3 = r8.f2378b
            int r10 = r8.f2379c
            r0.h1(r3, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r3.f2393h = r11
            r0.K0(r1, r3, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            int r10 = r3.f2387b
            int r11 = r3.f2389d
            int r3 = r3.f2388c
            if (r3 <= 0) goto L_0x0302
            int r9 = r9 + r3
        L_0x0302:
            int r3 = r8.f2378b
            int r12 = r8.f2379c
            r0.g1(r3, r12)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r3.f2393h = r9
            int r9 = r3.f2389d
            int r12 = r3.f2390e
            int r9 = r9 + r12
            r3.f2389d = r9
            r0.K0(r1, r3, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            int r9 = r3.f2387b
            int r3 = r3.f2388c
            if (r3 <= 0) goto L_0x0374
            r0.h1(r11, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.f2367q
            r10.f2393h = r3
            r0.K0(r1, r10, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            int r10 = r3.f2387b
            goto L_0x0374
        L_0x032e:
            int r3 = r8.f2378b
            int r10 = r8.f2379c
            r0.g1(r3, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r3.f2393h = r9
            r0.K0(r1, r3, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            int r9 = r3.f2387b
            int r10 = r3.f2389d
            int r3 = r3.f2388c
            if (r3 <= 0) goto L_0x0347
            int r11 = r11 + r3
        L_0x0347:
            int r3 = r8.f2378b
            int r12 = r8.f2379c
            r0.h1(r3, r12)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r3.f2393h = r11
            int r11 = r3.f2389d
            int r12 = r3.f2390e
            int r11 = r11 + r12
            r3.f2389d = r11
            r0.K0(r1, r3, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            int r11 = r3.f2387b
            int r3 = r3.f2388c
            if (r3 <= 0) goto L_0x0373
            r0.g1(r10, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.f2367q
            r9.f2393h = r3
            r0.K0(r1, r9, r2, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            int r3 = r3.f2387b
            r9 = r3
        L_0x0373:
            r10 = r11
        L_0x0374:
            int r3 = r17.w()
            if (r3 <= 0) goto L_0x0398
            boolean r3 = r0.f2371u
            boolean r11 = r0.f2372v
            r3 = r3 ^ r11
            if (r3 == 0) goto L_0x038c
            int r3 = r0.S0(r9, r1, r2, r5)
            int r10 = r10 + r3
            int r9 = r9 + r3
            int r3 = r0.T0(r10, r1, r2, r6)
            goto L_0x0396
        L_0x038c:
            int r3 = r0.T0(r10, r1, r2, r5)
            int r10 = r10 + r3
            int r9 = r9 + r3
            int r3 = r0.S0(r9, r1, r2, r6)
        L_0x0396:
            int r10 = r10 + r3
            int r9 = r9 + r3
        L_0x0398:
            boolean r3 = r2.f2536k
            if (r3 == 0) goto L_0x043d
            int r3 = r17.w()
            if (r3 == 0) goto L_0x043d
            boolean r3 = r2.f2532g
            if (r3 != 0) goto L_0x043d
            boolean r3 = r17.C0()
            if (r3 != 0) goto L_0x03ae
            goto L_0x043d
        L_0x03ae:
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r3 = r1.f2504d
            int r11 = r3.size()
            android.view.View r12 = r0.v(r6)
            int r12 = androidx.recyclerview.widget.RecyclerView.m.G(r12)
            r13 = r6
            r14 = r13
            r15 = r14
        L_0x03bf:
            if (r13 >= r11) goto L_0x03f8
            java.lang.Object r16 = r3.get(r13)
            r5 = r16
            androidx.recyclerview.widget.RecyclerView$b0 r5 = (androidx.recyclerview.widget.RecyclerView.b0) r5
            boolean r16 = r5.j()
            if (r16 == 0) goto L_0x03d0
            goto L_0x03f3
        L_0x03d0:
            int r7 = r5.d()
            if (r7 >= r12) goto L_0x03d8
            r7 = 1
            goto L_0x03d9
        L_0x03d8:
            r7 = r6
        L_0x03d9:
            boolean r6 = r0.f2371u
            if (r7 == r6) goto L_0x03df
            r6 = r4
            goto L_0x03e0
        L_0x03df:
            r6 = 1
        L_0x03e0:
            android.view.View r5 = r5.f2440a
            if (r6 != r4) goto L_0x03ec
            androidx.recyclerview.widget.t r6 = r0.f2368r
            int r5 = r6.c(r5)
            int r14 = r14 + r5
            goto L_0x03f3
        L_0x03ec:
            androidx.recyclerview.widget.t r6 = r0.f2368r
            int r5 = r6.c(r5)
            int r15 = r15 + r5
        L_0x03f3:
            int r13 = r13 + 1
            r5 = 1
            r6 = 0
            goto L_0x03bf
        L_0x03f8:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f2367q
            r4.f2396k = r3
            if (r14 <= 0) goto L_0x041a
            android.view.View r3 = r17.V0()
            int r3 = androidx.recyclerview.widget.RecyclerView.m.G(r3)
            r0.h1(r3, r10)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r3.f2393h = r14
            r4 = 0
            r3.f2388c = r4
            r5 = 0
            r3.a(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r0.K0(r1, r3, r2, r4)
            goto L_0x041b
        L_0x041a:
            r4 = 0
        L_0x041b:
            if (r15 <= 0) goto L_0x0438
            android.view.View r3 = r17.U0()
            int r3 = androidx.recyclerview.widget.RecyclerView.m.G(r3)
            r0.g1(r3, r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r3.f2393h = r15
            r3.f2388c = r4
            r5 = 0
            r3.a(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f2367q
            r0.K0(r1, r3, r2, r4)
            goto L_0x0439
        L_0x0438:
            r5 = 0
        L_0x0439:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f2367q
            r1.f2396k = r5
        L_0x043d:
            boolean r1 = r2.f2532g
            if (r1 != 0) goto L_0x044a
            androidx.recyclerview.widget.t r1 = r0.f2368r
            int r2 = r1.l()
            r1.f2750b = r2
            goto L_0x044d
        L_0x044a:
            r8.d()
        L_0x044d:
            boolean r1 = r0.f2372v
            r0.f2369s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.d0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    public final void d1(int i8) {
        if (i8 == 0 || i8 == 1) {
            c((String) null);
            if (i8 != this.f2366p || this.f2368r == null) {
                t a10 = t.a(this, i8);
                this.f2368r = a10;
                this.A.f2377a = a10;
                this.f2366p = i8;
                o0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(q.a("invalid orientation:", i8));
    }

    public final boolean e() {
        return this.f2366p == 1;
    }

    public void e0(RecyclerView.y yVar) {
        this.f2376z = null;
        this.f2374x = -1;
        this.f2375y = Integer.MIN_VALUE;
        this.A.d();
    }

    public void e1(boolean z10) {
        c((String) null);
        if (this.f2372v != z10) {
            this.f2372v = z10;
            o0();
        }
    }

    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f2376z = dVar;
            if (this.f2374x != -1) {
                dVar.f2398a = -1;
            }
            o0();
        }
    }

    public final void f1(int i8, int i10, boolean z10, RecyclerView.y yVar) {
        int i11;
        int i12 = 1;
        boolean z11 = false;
        this.f2367q.f2397l = this.f2368r.i() == 0 && this.f2368r.f() == 0;
        this.f2367q.f2391f = i8;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        D0(yVar, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i8 == 1) {
            z11 = true;
        }
        c cVar = this.f2367q;
        int i13 = z11 ? max2 : max;
        cVar.f2393h = i13;
        if (!z11) {
            max = max2;
        }
        cVar.f2394i = max;
        if (z11) {
            cVar.f2393h = this.f2368r.h() + i13;
            View U0 = U0();
            c cVar2 = this.f2367q;
            if (this.f2371u) {
                i12 = -1;
            }
            cVar2.f2390e = i12;
            int G = RecyclerView.m.G(U0);
            c cVar3 = this.f2367q;
            cVar2.f2389d = G + cVar3.f2390e;
            cVar3.f2387b = this.f2368r.b(U0);
            i11 = this.f2368r.b(U0) - this.f2368r.g();
        } else {
            View V0 = V0();
            c cVar4 = this.f2367q;
            cVar4.f2393h = this.f2368r.k() + cVar4.f2393h;
            c cVar5 = this.f2367q;
            if (!this.f2371u) {
                i12 = -1;
            }
            cVar5.f2390e = i12;
            int G2 = RecyclerView.m.G(V0);
            c cVar6 = this.f2367q;
            cVar5.f2389d = G2 + cVar6.f2390e;
            cVar6.f2387b = this.f2368r.e(V0);
            i11 = (-this.f2368r.e(V0)) + this.f2368r.k();
        }
        c cVar7 = this.f2367q;
        cVar7.f2388c = i10;
        if (z10) {
            cVar7.f2388c = i10 - i11;
        }
        cVar7.f2392g = i11;
    }

    public final Parcelable g0() {
        d dVar = this.f2376z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (w() > 0) {
            J0();
            boolean z10 = this.f2369s ^ this.f2371u;
            dVar2.f2400c = z10;
            if (z10) {
                View U0 = U0();
                dVar2.f2399b = this.f2368r.g() - this.f2368r.b(U0);
                dVar2.f2398a = RecyclerView.m.G(U0);
            } else {
                View V0 = V0();
                dVar2.f2398a = RecyclerView.m.G(V0);
                dVar2.f2399b = this.f2368r.e(V0) - this.f2368r.k();
            }
        } else {
            dVar2.f2398a = -1;
        }
        return dVar2;
    }

    public final void g1(int i8, int i10) {
        this.f2367q.f2388c = this.f2368r.g() - i10;
        c cVar = this.f2367q;
        cVar.f2390e = this.f2371u ? -1 : 1;
        cVar.f2389d = i8;
        cVar.f2391f = 1;
        cVar.f2387b = i10;
        cVar.f2392g = Integer.MIN_VALUE;
    }

    public final void h(int i8, int i10, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        if (this.f2366p != 0) {
            i8 = i10;
        }
        if (w() != 0 && i8 != 0) {
            J0();
            f1(i8 > 0 ? 1 : -1, Math.abs(i8), true, yVar);
            E0(yVar, this.f2367q, cVar);
        }
    }

    public final void h1(int i8, int i10) {
        this.f2367q.f2388c = i10 - this.f2368r.k();
        c cVar = this.f2367q;
        cVar.f2389d = i8;
        cVar.f2390e = this.f2371u ? 1 : -1;
        cVar.f2391f = -1;
        cVar.f2387b = i10;
        cVar.f2392g = Integer.MIN_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(int r7, androidx.recyclerview.widget.RecyclerView.m.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f2376z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0013
            int r4 = r0.f2398a
            if (r4 < 0) goto L_0x000d
            r5 = r1
            goto L_0x000e
        L_0x000d:
            r5 = r3
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            boolean r0 = r0.f2400c
            goto L_0x0022
        L_0x0013:
            r6.b1()
            boolean r0 = r6.f2371u
            int r4 = r6.f2374x
            if (r4 != r2) goto L_0x0022
            if (r0 == 0) goto L_0x0021
            int r4 = r7 + -1
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            r1 = r2
        L_0x0025:
            r0 = r3
        L_0x0026:
            int r2 = r6.C
            if (r0 >= r2) goto L_0x0038
            if (r4 < 0) goto L_0x0038
            if (r4 >= r7) goto L_0x0038
            r2 = r8
            androidx.recyclerview.widget.m$b r2 = (androidx.recyclerview.widget.m.b) r2
            r2.a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i(int, androidx.recyclerview.widget.RecyclerView$m$c):void");
    }

    public final int j(RecyclerView.y yVar) {
        return F0(yVar);
    }

    public int k(RecyclerView.y yVar) {
        return G0(yVar);
    }

    public int l(RecyclerView.y yVar) {
        return H0(yVar);
    }

    public final int m(RecyclerView.y yVar) {
        return F0(yVar);
    }

    public int n(RecyclerView.y yVar) {
        return G0(yVar);
    }

    public int o(RecyclerView.y yVar) {
        return H0(yVar);
    }

    public int p0(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2366p == 1) {
            return 0;
        }
        return c1(i8, tVar, yVar);
    }

    public final View q(int i8) {
        int w10 = w();
        if (w10 == 0) {
            return null;
        }
        int G = i8 - RecyclerView.m.G(v(0));
        if (G >= 0 && G < w10) {
            View v3 = v(G);
            if (RecyclerView.m.G(v3) == i8) {
                return v3;
            }
        }
        return super.q(i8);
    }

    public final void q0(int i8) {
        this.f2374x = i8;
        this.f2375y = Integer.MIN_VALUE;
        d dVar = this.f2376z;
        if (dVar != null) {
            dVar.f2398a = -1;
        }
        o0();
    }

    public RecyclerView.n r() {
        return new RecyclerView.n(-2, -2);
    }

    public int r0(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2366p == 0) {
            return 0;
        }
        return c1(i8, tVar, yVar);
    }

    public final boolean y0() {
        boolean z10;
        if (this.m == 1073741824 || this.f2482l == 1073741824) {
            return false;
        }
        int w10 = w();
        int i8 = 0;
        while (true) {
            if (i8 >= w10) {
                z10 = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = v(i8).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z10 = true;
                break;
            }
            i8++;
        }
        return z10;
    }

    public LinearLayoutManager(int i8) {
        this.f2366p = 1;
        this.f2370t = false;
        this.f2371u = false;
        this.f2372v = false;
        this.f2373w = true;
        this.f2374x = -1;
        this.f2375y = Integer.MIN_VALUE;
        this.f2376z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        d1(i8);
        c((String) null);
        if (this.f2370t) {
            this.f2370t = false;
            o0();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i8, int i10) {
        this.f2366p = 1;
        this.f2370t = false;
        this.f2371u = false;
        this.f2372v = false;
        this.f2373w = true;
        this.f2374x = -1;
        this.f2375y = Integer.MIN_VALUE;
        this.f2376z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.m.d H = RecyclerView.m.H(context, attributeSet, i8, i10);
        d1(H.f2487a);
        boolean z10 = H.f2489c;
        c((String) null);
        if (z10 != this.f2370t) {
            this.f2370t = z10;
            o0();
        }
        e1(H.f2490d);
    }
}
