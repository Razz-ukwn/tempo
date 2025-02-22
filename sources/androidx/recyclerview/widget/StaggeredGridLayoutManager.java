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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import d2.d1;
import d2.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.x.b {
    public int A;
    public final d B;
    public int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public final boolean I;
    public int[] J;
    public final a K;

    /* renamed from: p  reason: collision with root package name */
    public int f2539p;

    /* renamed from: q  reason: collision with root package name */
    public f[] f2540q;

    /* renamed from: r  reason: collision with root package name */
    public t f2541r;

    /* renamed from: s  reason: collision with root package name */
    public t f2542s;

    /* renamed from: t  reason: collision with root package name */
    public int f2543t;

    /* renamed from: u  reason: collision with root package name */
    public int f2544u;

    /* renamed from: v  reason: collision with root package name */
    public final n f2545v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2546w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2547x;

    /* renamed from: y  reason: collision with root package name */
    public BitSet f2548y;

    /* renamed from: z  reason: collision with root package name */
    public int f2549z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            StaggeredGridLayoutManager.this.E0();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2551a;

        /* renamed from: b  reason: collision with root package name */
        public int f2552b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2553c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2554d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2555e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f2556f;

        public b() {
            a();
        }

        public final void a() {
            this.f2551a = -1;
            this.f2552b = Integer.MIN_VALUE;
            this.f2553c = false;
            this.f2554d = false;
            this.f2555e = false;
            int[] iArr = this.f2556f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public f f2558e;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i8, int i10) {
            super(i8, i10);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int[] B;
        public List<d.a> C;
        public boolean D;
        public boolean E;
        public boolean F;

        /* renamed from: a  reason: collision with root package name */
        public int f2565a;

        /* renamed from: b  reason: collision with root package name */
        public int f2566b;

        /* renamed from: c  reason: collision with root package name */
        public int f2567c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f2568d;

        /* renamed from: e  reason: collision with root package name */
        public int f2569e;

        public class a implements Parcelable.Creator<e> {
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public final Object[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f2565a);
            parcel.writeInt(this.f2566b);
            parcel.writeInt(this.f2567c);
            if (this.f2567c > 0) {
                parcel.writeIntArray(this.f2568d);
            }
            parcel.writeInt(this.f2569e);
            if (this.f2569e > 0) {
                parcel.writeIntArray(this.B);
            }
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeList(this.C);
        }

        public e(Parcel parcel) {
            this.f2565a = parcel.readInt();
            this.f2566b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2567c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2568d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2569e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.B = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.D = parcel.readInt() == 1;
            this.E = parcel.readInt() == 1;
            this.F = parcel.readInt() == 1 ? true : z10;
            this.C = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2567c = eVar.f2567c;
            this.f2565a = eVar.f2565a;
            this.f2566b = eVar.f2566b;
            this.f2568d = eVar.f2568d;
            this.f2569e = eVar.f2569e;
            this.B = eVar.B;
            this.D = eVar.D;
            this.E = eVar.E;
            this.F = eVar.F;
            this.C = eVar.C;
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f2570a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2571b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f2572c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f2573d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f2574e;

        public f(int i8) {
            this.f2574e = i8;
        }

        public static c h(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.f2570a;
            View view = arrayList.get(arrayList.size() - 1);
            c h3 = h(view);
            this.f2572c = StaggeredGridLayoutManager.this.f2541r.b(view);
            h3.getClass();
        }

        public final void b() {
            this.f2570a.clear();
            this.f2571b = Integer.MIN_VALUE;
            this.f2572c = Integer.MIN_VALUE;
            this.f2573d = 0;
        }

        public final int c() {
            boolean z10 = StaggeredGridLayoutManager.this.f2546w;
            ArrayList<View> arrayList = this.f2570a;
            return z10 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
        }

        public final int d() {
            boolean z10 = StaggeredGridLayoutManager.this.f2546w;
            ArrayList<View> arrayList = this.f2570a;
            return z10 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
        }

        public final int e(int i8, int i10) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k10 = staggeredGridLayoutManager.f2541r.k();
            int g10 = staggeredGridLayoutManager.f2541r.g();
            int i11 = i10 > i8 ? 1 : -1;
            while (i8 != i10) {
                View view = this.f2570a.get(i8);
                int e10 = staggeredGridLayoutManager.f2541r.e(view);
                int b10 = staggeredGridLayoutManager.f2541r.b(view);
                boolean z10 = false;
                boolean z11 = e10 <= g10;
                if (b10 >= k10) {
                    z10 = true;
                }
                if (z11 && z10 && (e10 < k10 || b10 > g10)) {
                    return RecyclerView.m.G(view);
                }
                i8 += i11;
            }
            return -1;
        }

        public final int f(int i8) {
            int i10 = this.f2572c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            if (this.f2570a.size() == 0) {
                return i8;
            }
            a();
            return this.f2572c;
        }

        public final View g(int i8, int i10) {
            ArrayList<View> arrayList = this.f2570a;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            View view = null;
            if (i10 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f2546w && RecyclerView.m.G(view2) >= i8) || ((!staggeredGridLayoutManager.f2546w && RecyclerView.m.G(view2) <= i8) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i11 = 0;
                while (i11 < size2) {
                    View view3 = arrayList.get(i11);
                    if ((staggeredGridLayoutManager.f2546w && RecyclerView.m.G(view3) <= i8) || ((!staggeredGridLayoutManager.f2546w && RecyclerView.m.G(view3) >= i8) || !view3.hasFocusable())) {
                        break;
                    }
                    i11++;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i8) {
            int i10 = this.f2571b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            ArrayList<View> arrayList = this.f2570a;
            if (arrayList.size() == 0) {
                return i8;
            }
            View view = arrayList.get(0);
            c h3 = h(view);
            this.f2571b = StaggeredGridLayoutManager.this.f2541r.e(view);
            h3.getClass();
            return this.f2571b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i8, int i10) {
        this.f2539p = -1;
        this.f2546w = false;
        this.f2547x = false;
        this.f2549z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new d();
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.m.d H2 = RecyclerView.m.H(context, attributeSet, i8, i10);
        int i11 = H2.f2487a;
        if (i11 == 0 || i11 == 1) {
            c((String) null);
            if (i11 != this.f2543t) {
                this.f2543t = i11;
                t tVar = this.f2541r;
                this.f2541r = this.f2542s;
                this.f2542s = tVar;
                o0();
            }
            f1(H2.f2488b);
            boolean z10 = H2.f2489c;
            c((String) null);
            e eVar = this.F;
            if (!(eVar == null || eVar.D == z10)) {
                eVar.D = z10;
            }
            this.f2546w = z10;
            o0();
            this.f2545v = new n();
            this.f2541r = t.a(this, this.f2543t);
            this.f2542s = t.a(this, 1 - this.f2543t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static int i1(int i8, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return i8;
        }
        int mode = View.MeasureSpec.getMode(i8);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - i10) - i11), mode) : i8;
    }

    public final void A0(RecyclerView recyclerView, int i8) {
        o oVar = new o(recyclerView.getContext());
        oVar.f2511a = i8;
        B0(oVar);
    }

    public final boolean C0() {
        return this.F == null;
    }

    public final int D0(int i8) {
        if (w() == 0) {
            return this.f2547x ? 1 : -1;
        }
        return (i8 < N0()) != this.f2547x ? -1 : 1;
    }

    public final boolean E0() {
        int i8;
        if (!(w() == 0 || this.C == 0 || !this.f2477g)) {
            if (this.f2547x) {
                i8 = O0();
                N0();
            } else {
                i8 = N0();
                O0();
            }
            if (i8 == 0 && S0() != null) {
                this.B.a();
                this.f2476f = true;
                o0();
                return true;
            }
        }
        return false;
    }

    public final int F0(RecyclerView.y yVar) {
        if (w() == 0) {
            return 0;
        }
        t tVar = this.f2541r;
        boolean z10 = this.I;
        return z.a(yVar, tVar, K0(!z10), J0(!z10), this, this.I);
    }

    public final int G0(RecyclerView.y yVar) {
        if (w() == 0) {
            return 0;
        }
        t tVar = this.f2541r;
        boolean z10 = this.I;
        return z.b(yVar, tVar, K0(!z10), J0(!z10), this, this.I, this.f2547x);
    }

    public final int H0(RecyclerView.y yVar) {
        if (w() == 0) {
            return 0;
        }
        t tVar = this.f2541r;
        boolean z10 = this.I;
        return z.c(yVar, tVar, K0(!z10), J0(!z10), this, this.I);
    }

    public final int I0(RecyclerView.t tVar, n nVar, RecyclerView.y yVar) {
        f fVar;
        boolean z10;
        int i8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        RecyclerView.t tVar2 = tVar;
        n nVar2 = nVar;
        int i17 = 0;
        int i18 = 1;
        this.f2548y.set(0, this.f2539p, true);
        n nVar3 = this.f2545v;
        int i19 = nVar3.f2740i ? nVar2.f2736e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : nVar2.f2736e == 1 ? nVar2.f2738g + nVar2.f2733b : nVar2.f2737f - nVar2.f2733b;
        int i20 = nVar2.f2736e;
        for (int i21 = 0; i21 < this.f2539p; i21++) {
            if (!this.f2540q[i21].f2570a.isEmpty()) {
                h1(this.f2540q[i21], i20, i19);
            }
        }
        int g10 = this.f2547x ? this.f2541r.g() : this.f2541r.k();
        boolean z11 = false;
        while (true) {
            int i22 = nVar2.f2734c;
            if (((i22 < 0 || i22 >= yVar.b()) ? i17 : i18) == 0 || (!nVar3.f2740i && this.f2548y.isEmpty())) {
                int i23 = i17;
            } else {
                View view = tVar2.i(nVar2.f2734c, Long.MAX_VALUE).f2440a;
                nVar2.f2734c += nVar2.f2735d;
                c cVar = (c) view.getLayoutParams();
                int a10 = cVar.a();
                d dVar = this.B;
                int[] iArr = dVar.f2559a;
                int i24 = (iArr == null || a10 >= iArr.length) ? -1 : iArr[a10];
                if ((i24 == -1 ? i18 : i17) != 0) {
                    if (W0(nVar2.f2736e)) {
                        i16 = this.f2539p - i18;
                        i15 = -1;
                        i14 = -1;
                    } else {
                        i14 = i18;
                        i15 = this.f2539p;
                        i16 = i17;
                    }
                    f fVar2 = null;
                    if (nVar2.f2736e == i18) {
                        int k10 = this.f2541r.k();
                        int i25 = Integer.MAX_VALUE;
                        while (i16 != i15) {
                            f fVar3 = this.f2540q[i16];
                            int f10 = fVar3.f(k10);
                            if (f10 < i25) {
                                i25 = f10;
                                fVar2 = fVar3;
                            }
                            i16 += i14;
                        }
                    } else {
                        int g11 = this.f2541r.g();
                        int i26 = Integer.MIN_VALUE;
                        while (i16 != i15) {
                            f fVar4 = this.f2540q[i16];
                            int i27 = fVar4.i(g11);
                            if (i27 > i26) {
                                fVar2 = fVar4;
                                i26 = i27;
                            }
                            i16 += i14;
                        }
                    }
                    fVar = fVar2;
                    dVar.b(a10);
                    dVar.f2559a[a10] = fVar.f2574e;
                } else {
                    fVar = this.f2540q[i24];
                }
                cVar.f2558e = fVar;
                if (nVar2.f2736e == 1) {
                    z10 = false;
                    b(view, -1, false);
                } else {
                    z10 = false;
                    b(view, 0, false);
                }
                if (this.f2543t == 1) {
                    U0(view, RecyclerView.m.x(z10, this.f2544u, this.f2482l, z10 ? 1 : 0, cVar.width), RecyclerView.m.x(true, this.f2484o, this.m, C() + F(), cVar.height), z10);
                } else {
                    U0(view, RecyclerView.m.x(true, this.f2483n, this.f2482l, E() + D(), cVar.width), RecyclerView.m.x(false, this.f2544u, this.m, 0, cVar.height), false);
                }
                if (nVar2.f2736e == 1) {
                    i10 = fVar.f(g10);
                    i8 = this.f2541r.c(view) + i10;
                } else {
                    i8 = fVar.i(g10);
                    i10 = i8 - this.f2541r.c(view);
                }
                if (nVar2.f2736e == 1) {
                    f fVar5 = cVar.f2558e;
                    fVar5.getClass();
                    c cVar2 = (c) view.getLayoutParams();
                    cVar2.f2558e = fVar5;
                    ArrayList<View> arrayList = fVar5.f2570a;
                    arrayList.add(view);
                    fVar5.f2572c = Integer.MIN_VALUE;
                    if (arrayList.size() == 1) {
                        fVar5.f2571b = Integer.MIN_VALUE;
                    }
                    if (cVar2.c() || cVar2.b()) {
                        fVar5.f2573d = StaggeredGridLayoutManager.this.f2541r.c(view) + fVar5.f2573d;
                    }
                } else {
                    f fVar6 = cVar.f2558e;
                    fVar6.getClass();
                    c cVar3 = (c) view.getLayoutParams();
                    cVar3.f2558e = fVar6;
                    ArrayList<View> arrayList2 = fVar6.f2570a;
                    arrayList2.add(0, view);
                    fVar6.f2571b = Integer.MIN_VALUE;
                    if (arrayList2.size() == 1) {
                        fVar6.f2572c = Integer.MIN_VALUE;
                    }
                    if (cVar3.c() || cVar3.b()) {
                        fVar6.f2573d = StaggeredGridLayoutManager.this.f2541r.c(view) + fVar6.f2573d;
                    }
                }
                if (!T0() || this.f2543t != 1) {
                    i11 = this.f2542s.k() + (fVar.f2574e * this.f2544u);
                    i12 = this.f2542s.c(view) + i11;
                } else {
                    i12 = this.f2542s.g() - (((this.f2539p - 1) - fVar.f2574e) * this.f2544u);
                    i11 = i12 - this.f2542s.c(view);
                }
                if (this.f2543t == 1) {
                    RecyclerView.m.O(view, i11, i10, i12, i8);
                } else {
                    RecyclerView.m.O(view, i10, i11, i8, i12);
                }
                h1(fVar, nVar3.f2736e, i19);
                Y0(tVar2, nVar3);
                if (!nVar3.f2739h || !view.hasFocusable()) {
                    i13 = 0;
                } else {
                    i13 = 0;
                    this.f2548y.set(fVar.f2574e, false);
                }
                i17 = i13;
                i18 = 1;
                z11 = true;
            }
        }
        int i232 = i17;
        if (!z11) {
            Y0(tVar2, nVar3);
        }
        int k11 = nVar3.f2736e == -1 ? this.f2541r.k() - Q0(this.f2541r.k()) : P0(this.f2541r.g()) - this.f2541r.g();
        return k11 > 0 ? Math.min(nVar2.f2733b, k11) : i232;
    }

    public final View J0(boolean z10) {
        int k10 = this.f2541r.k();
        int g10 = this.f2541r.g();
        View view = null;
        for (int w10 = w() - 1; w10 >= 0; w10--) {
            View v3 = v(w10);
            int e10 = this.f2541r.e(v3);
            int b10 = this.f2541r.b(v3);
            if (b10 > k10 && e10 < g10) {
                if (b10 <= g10 || !z10) {
                    return v3;
                }
                if (view == null) {
                    view = v3;
                }
            }
        }
        return view;
    }

    public final View K0(boolean z10) {
        int k10 = this.f2541r.k();
        int g10 = this.f2541r.g();
        int w10 = w();
        View view = null;
        for (int i8 = 0; i8 < w10; i8++) {
            View v3 = v(i8);
            int e10 = this.f2541r.e(v3);
            if (this.f2541r.b(v3) > k10 && e10 < g10) {
                if (e10 >= k10 || !z10) {
                    return v3;
                }
                if (view == null) {
                    view = v3;
                }
            }
        }
        return view;
    }

    public final void L0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int g10;
        int P0 = P0(Integer.MIN_VALUE);
        if (P0 != Integer.MIN_VALUE && (g10 = this.f2541r.g() - P0) > 0) {
            int i8 = g10 - (-c1(-g10, tVar, yVar));
            if (z10 && i8 > 0) {
                this.f2541r.o(i8);
            }
        }
    }

    public final boolean M() {
        return this.C != 0;
    }

    public final void M0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10) {
        int k10;
        int Q0 = Q0(Integer.MAX_VALUE);
        if (Q0 != Integer.MAX_VALUE && (k10 = Q0 - this.f2541r.k()) > 0) {
            int c12 = k10 - c1(k10, tVar, yVar);
            if (z10 && c12 > 0) {
                this.f2541r.o(-c12);
            }
        }
    }

    public final int N0() {
        if (w() == 0) {
            return 0;
        }
        return RecyclerView.m.G(v(0));
    }

    public final int O0() {
        int w10 = w();
        if (w10 == 0) {
            return 0;
        }
        return RecyclerView.m.G(v(w10 - 1));
    }

    public final void P(int i8) {
        super.P(i8);
        for (int i10 = 0; i10 < this.f2539p; i10++) {
            f fVar = this.f2540q[i10];
            int i11 = fVar.f2571b;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f2571b = i11 + i8;
            }
            int i12 = fVar.f2572c;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2572c = i12 + i8;
            }
        }
    }

    public final int P0(int i8) {
        int f10 = this.f2540q[0].f(i8);
        for (int i10 = 1; i10 < this.f2539p; i10++) {
            int f11 = this.f2540q[i10].f(i8);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    public final void Q(int i8) {
        super.Q(i8);
        for (int i10 = 0; i10 < this.f2539p; i10++) {
            f fVar = this.f2540q[i10];
            int i11 = fVar.f2571b;
            if (i11 != Integer.MIN_VALUE) {
                fVar.f2571b = i11 + i8;
            }
            int i12 = fVar.f2572c;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2572c = i12 + i8;
            }
        }
    }

    public final int Q0(int i8) {
        int i10 = this.f2540q[0].i(i8);
        for (int i11 = 1; i11 < this.f2539p; i11++) {
            int i12 = this.f2540q[i11].i(i8);
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i10;
    }

    public final void R() {
        this.B.a();
        for (int i8 = 0; i8 < this.f2539p; i8++) {
            this.f2540q[i8].b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f2547x
            if (r0 == 0) goto L_0x0009
            int r0 = r7.O0()
            goto L_0x000d
        L_0x0009:
            int r0 = r7.N0()
        L_0x000d:
            r1 = 8
            if (r10 != r1) goto L_0x001a
            if (r8 >= r9) goto L_0x0016
            int r2 = r9 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r8 + 1
            r3 = r9
            goto L_0x001d
        L_0x001a:
            int r2 = r8 + r9
        L_0x001c:
            r3 = r8
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r7.B
            r4.c(r3)
            r5 = 1
            if (r10 == r5) goto L_0x0036
            r6 = 2
            if (r10 == r6) goto L_0x0032
            if (r10 == r1) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            r4.e(r8, r5)
            r4.d(r9, r5)
            goto L_0x0039
        L_0x0032:
            r4.e(r8, r9)
            goto L_0x0039
        L_0x0036:
            r4.d(r8, r9)
        L_0x0039:
            if (r2 > r0) goto L_0x003c
            return
        L_0x003c:
            boolean r8 = r7.f2547x
            if (r8 == 0) goto L_0x0045
            int r8 = r7.N0()
            goto L_0x0049
        L_0x0045:
            int r8 = r7.O0()
        L_0x0049:
            if (r3 > r8) goto L_0x004e
            r7.o0()
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0(int, int, int):void");
    }

    public final void S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2472b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i8 = 0; i8 < this.f2539p; i8++) {
            this.f2540q[i8].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        if (r10 == r11) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (r10 == r11) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e7, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View S0() {
        /*
            r13 = this;
            int r0 = r13.w()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f2539p
            r2.<init>(r3)
            int r3 = r13.f2539p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.f2543t
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.T0()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r13.f2547x
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x0106
            android.view.View r7 = r13.v(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2558e
            int r9 = r9.f2574e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00b7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2558e
            boolean r10 = r13.f2547x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x0073
            int r10 = r9.f2572c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.a()
            int r10 = r9.f2572c
        L_0x0056:
            androidx.recyclerview.widget.t r11 = r13.f2541r
            int r11 = r11.g()
            if (r10 >= r11) goto L_0x00ac
            java.util.ArrayList<android.view.View> r9 = r9.f2570a
            int r10 = r9.size()
            int r10 = r10 - r1
            java.lang.Object r9 = r9.get(r10)
            android.view.View r9 = (android.view.View) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.f.h(r9)
            r9.getClass()
            goto L_0x00aa
        L_0x0073:
            int r10 = r9.f2571b
            if (r10 == r11) goto L_0x0078
            goto L_0x0093
        L_0x0078:
            java.util.ArrayList<android.view.View> r10 = r9.f2570a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.f.h(r10)
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r12 = r12.f2541r
            int r10 = r12.e(r10)
            r9.f2571b = r10
            r11.getClass()
            int r10 = r9.f2571b
        L_0x0093:
            androidx.recyclerview.widget.t r11 = r13.f2541r
            int r11 = r11.k()
            if (r10 <= r11) goto L_0x00ac
            java.util.ArrayList<android.view.View> r9 = r9.f2570a
            java.lang.Object r9 = r9.get(r4)
            android.view.View r9 = (android.view.View) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.f.h(r9)
            r9.getClass()
        L_0x00aa:
            r9 = r1
            goto L_0x00ad
        L_0x00ac:
            r9 = r4
        L_0x00ad:
            if (r9 == 0) goto L_0x00b0
            return r7
        L_0x00b0:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2558e
            int r9 = r9.f2574e
            r2.clear(r9)
        L_0x00b7:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x002e
            android.view.View r9 = r13.v(r0)
            boolean r10 = r13.f2547x
            if (r10 == 0) goto L_0x00d4
            androidx.recyclerview.widget.t r10 = r13.f2541r
            int r10 = r10.b(r7)
            androidx.recyclerview.widget.t r11 = r13.f2541r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00d1
            return r7
        L_0x00d1:
            if (r10 != r11) goto L_0x00e7
            goto L_0x00e5
        L_0x00d4:
            androidx.recyclerview.widget.t r10 = r13.f2541r
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.t r11 = r13.f2541r
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x00e3
            return r7
        L_0x00e3:
            if (r10 != r11) goto L_0x00e7
        L_0x00e5:
            r10 = r1
            goto L_0x00e8
        L_0x00e7:
            r10 = r4
        L_0x00e8:
            if (r10 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2558e
            int r8 = r8.f2574e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2558e
            int r9 = r9.f2574e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00fd
            r8 = r1
            goto L_0x00fe
        L_0x00fd:
            r8 = r4
        L_0x00fe:
            if (r3 >= 0) goto L_0x0102
            r9 = r1
            goto L_0x0103
        L_0x0102:
            r9 = r4
        L_0x0103:
            if (r8 == r9) goto L_0x002e
            return r7
        L_0x0106:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0():android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r8.f2543t == 1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (r8.f2543t == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (T0() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        if (T0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View T(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.t r11, androidx.recyclerview.widget.RecyclerView.y r12) {
        /*
            r8 = this;
            int r0 = r8.w()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f2472b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r9 = r1
            goto L_0x001e
        L_0x000e:
            android.view.View r9 = r0.B(r9)
            if (r9 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            androidx.recyclerview.widget.d r0 = r8.f2471a
            boolean r0 = r0.j(r9)
            if (r0 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r9 != 0) goto L_0x0021
            return r1
        L_0x0021:
            r8.b1()
            r0 = 1
            r2 = -1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x0060
            r4 = 2
            if (r10 == r4) goto L_0x0054
            r4 = 17
            if (r10 == r4) goto L_0x004d
            r4 = 33
            if (r10 == r4) goto L_0x0048
            r4 = 66
            if (r10 == r4) goto L_0x0043
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x003e
            goto L_0x0052
        L_0x003e:
            int r10 = r8.f2543t
            if (r10 != r0) goto L_0x0052
            goto L_0x006b
        L_0x0043:
            int r10 = r8.f2543t
            if (r10 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0048:
            int r10 = r8.f2543t
            if (r10 != r0) goto L_0x0052
            goto L_0x006d
        L_0x004d:
            int r10 = r8.f2543t
            if (r10 != 0) goto L_0x0052
            goto L_0x006d
        L_0x0052:
            r10 = r3
            goto L_0x006e
        L_0x0054:
            int r10 = r8.f2543t
            if (r10 != r0) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            boolean r10 = r8.T0()
            if (r10 == 0) goto L_0x006b
            goto L_0x006d
        L_0x0060:
            int r10 = r8.f2543t
            if (r10 != r0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            boolean r10 = r8.T0()
            if (r10 == 0) goto L_0x006d
        L_0x006b:
            r10 = r0
            goto L_0x006e
        L_0x006d:
            r10 = r2
        L_0x006e:
            if (r10 != r3) goto L_0x0071
            return r1
        L_0x0071:
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r3
            r3.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r3.f2558e
            if (r10 != r0) goto L_0x0083
            int r4 = r8.O0()
            goto L_0x0087
        L_0x0083:
            int r4 = r8.N0()
        L_0x0087:
            r8.g1(r4, r12)
            r8.e1(r10)
            androidx.recyclerview.widget.n r5 = r8.f2545v
            int r6 = r5.f2735d
            int r6 = r6 + r4
            r5.f2734c = r6
            androidx.recyclerview.widget.t r6 = r8.f2541r
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f2733b = r6
            r5.f2739h = r0
            r6 = 0
            r5.f2732a = r6
            r8.I0(r11, r5, r12)
            boolean r11 = r8.f2547x
            r8.D = r11
            android.view.View r11 = r3.g(r4, r10)
            if (r11 == 0) goto L_0x00b7
            if (r11 == r9) goto L_0x00b7
            return r11
        L_0x00b7:
            boolean r11 = r8.W0(r10)
            if (r11 == 0) goto L_0x00d2
            int r11 = r8.f2539p
            int r11 = r11 - r0
        L_0x00c0:
            if (r11 < 0) goto L_0x00e7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2540q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00cf
            if (r12 == r9) goto L_0x00cf
            return r12
        L_0x00cf:
            int r11 = r11 + -1
            goto L_0x00c0
        L_0x00d2:
            r11 = r6
        L_0x00d3:
            int r12 = r8.f2539p
            if (r11 >= r12) goto L_0x00e7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2540q
            r12 = r12[r11]
            android.view.View r12 = r12.g(r4, r10)
            if (r12 == 0) goto L_0x00e4
            if (r12 == r9) goto L_0x00e4
            return r12
        L_0x00e4:
            int r11 = r11 + 1
            goto L_0x00d3
        L_0x00e7:
            boolean r11 = r8.f2546w
            r11 = r11 ^ r0
            if (r10 != r2) goto L_0x00ee
            r12 = r0
            goto L_0x00ef
        L_0x00ee:
            r12 = r6
        L_0x00ef:
            if (r11 != r12) goto L_0x00f3
            r11 = r0
            goto L_0x00f4
        L_0x00f3:
            r11 = r6
        L_0x00f4:
            if (r11 == 0) goto L_0x00fb
            int r12 = r3.c()
            goto L_0x00ff
        L_0x00fb:
            int r12 = r3.d()
        L_0x00ff:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0108
            if (r12 == r9) goto L_0x0108
            return r12
        L_0x0108:
            boolean r10 = r8.W0(r10)
            if (r10 == 0) goto L_0x0137
            int r10 = r8.f2539p
            int r10 = r10 - r0
        L_0x0111:
            if (r10 < 0) goto L_0x015a
            int r12 = r3.f2574e
            if (r10 != r12) goto L_0x0118
            goto L_0x0134
        L_0x0118:
            if (r11 == 0) goto L_0x0123
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2540q
            r12 = r12[r10]
            int r12 = r12.c()
            goto L_0x012b
        L_0x0123:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f2540q
            r12 = r12[r10]
            int r12 = r12.d()
        L_0x012b:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L_0x0134
            if (r12 == r9) goto L_0x0134
            return r12
        L_0x0134:
            int r10 = r10 + -1
            goto L_0x0111
        L_0x0137:
            int r10 = r8.f2539p
            if (r6 >= r10) goto L_0x015a
            if (r11 == 0) goto L_0x0146
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f2540q
            r10 = r10[r6]
            int r10 = r10.c()
            goto L_0x014e
        L_0x0146:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f2540q
            r10 = r10[r6]
            int r10 = r10.d()
        L_0x014e:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L_0x0157
            if (r10 == r9) goto L_0x0157
            return r10
        L_0x0157:
            int r6 = r6 + 1
            goto L_0x0137
        L_0x015a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    public final boolean T0() {
        return A() == 1;
    }

    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (w() > 0) {
            View K0 = K0(false);
            View J0 = J0(false);
            if (K0 != null && J0 != null) {
                int G2 = RecyclerView.m.G(K0);
                int G3 = RecyclerView.m.G(J0);
                if (G2 < G3) {
                    accessibilityEvent.setFromIndex(G2);
                    accessibilityEvent.setToIndex(G3);
                    return;
                }
                accessibilityEvent.setFromIndex(G3);
                accessibilityEvent.setToIndex(G2);
            }
        }
    }

    public final void U0(View view, int i8, int i10, boolean z10) {
        RecyclerView recyclerView = this.f2472b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.K(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i12 = i1(i8, cVar.leftMargin + rect.left, cVar.rightMargin + rect.right);
        int i13 = i1(i10, cVar.topMargin + rect.top, cVar.bottomMargin + rect.bottom);
        if (x0(view, i12, i13, cVar)) {
            view.measure(i12, i13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0408, code lost:
        if (E0() != false) goto L_0x040c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V0(androidx.recyclerview.widget.RecyclerView.t r17, androidx.recyclerview.widget.RecyclerView.y r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r3 = r0.F
            r4 = -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r5 = r0.H
            if (r3 != 0) goto L_0x0011
            int r3 = r0.f2549z
            if (r3 == r4) goto L_0x001e
        L_0x0011:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x001e
            r16.j0(r17)
            r5.a()
            return
        L_0x001e:
            boolean r3 = r5.f2555e
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x002f
            int r3 = r0.f2549z
            if (r3 != r4) goto L_0x002f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r3 = r0.F
            if (r3 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r3 = r6
            goto L_0x0030
        L_0x002f:
            r3 = r7
        L_0x0030:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r0.B
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L_0x020b
            r5.a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 == 0) goto L_0x00c2
            int r12 = r11.f2567c
            r13 = 0
            if (r12 <= 0) goto L_0x0087
            int r14 = r0.f2539p
            if (r12 != r14) goto L_0x0079
            r11 = r6
        L_0x0049:
            int r12 = r0.f2539p
            if (r11 >= r12) goto L_0x0087
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r0.f2540q
            r12 = r12[r11]
            r12.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r12 = r0.F
            int[] r14 = r12.f2568d
            r14 = r14[r11]
            if (r14 == r10) goto L_0x006e
            boolean r12 = r12.E
            if (r12 == 0) goto L_0x0067
            androidx.recyclerview.widget.t r12 = r0.f2541r
            int r12 = r12.g()
            goto L_0x006d
        L_0x0067:
            androidx.recyclerview.widget.t r12 = r0.f2541r
            int r12 = r12.k()
        L_0x006d:
            int r14 = r14 + r12
        L_0x006e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r0.f2540q
            r12 = r12[r11]
            r12.f2571b = r14
            r12.f2572c = r14
            int r11 = r11 + 1
            goto L_0x0049
        L_0x0079:
            r11.f2568d = r13
            r11.f2567c = r6
            r11.f2569e = r6
            r11.B = r13
            r11.C = r13
            int r12 = r11.f2566b
            r11.f2565a = r12
        L_0x0087:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            boolean r12 = r11.F
            r0.E = r12
            boolean r11 = r11.D
            r0.c(r13)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r12 = r0.F
            if (r12 == 0) goto L_0x009c
            boolean r13 = r12.D
            if (r13 == r11) goto L_0x009c
            r12.D = r11
        L_0x009c:
            r0.f2546w = r11
            r16.o0()
            r16.b1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            int r12 = r11.f2565a
            if (r12 == r4) goto L_0x00b1
            r0.f2549z = r12
            boolean r12 = r11.E
            r5.f2553c = r12
            goto L_0x00b5
        L_0x00b1:
            boolean r12 = r0.f2547x
            r5.f2553c = r12
        L_0x00b5:
            int r12 = r11.f2569e
            if (r12 <= r7) goto L_0x00c9
            int[] r12 = r11.B
            r9.f2559a = r12
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r11 = r11.C
            r9.f2560b = r11
            goto L_0x00c9
        L_0x00c2:
            r16.b1()
            boolean r11 = r0.f2547x
            r5.f2553c = r11
        L_0x00c9:
            boolean r11 = r2.f2532g
            if (r11 != 0) goto L_0x01c8
            int r11 = r0.f2549z
            if (r11 != r4) goto L_0x00d3
            goto L_0x01c8
        L_0x00d3:
            if (r11 < 0) goto L_0x01c4
            int r12 = r18.b()
            if (r11 < r12) goto L_0x00dd
            goto L_0x01c4
        L_0x00dd:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 == 0) goto L_0x00f2
            int r12 = r11.f2565a
            if (r12 == r4) goto L_0x00f2
            int r11 = r11.f2567c
            if (r11 >= r7) goto L_0x00ea
            goto L_0x00f2
        L_0x00ea:
            r5.f2552b = r10
            int r11 = r0.f2549z
            r5.f2551a = r11
            goto L_0x01c2
        L_0x00f2:
            int r11 = r0.f2549z
            android.view.View r11 = r0.q(r11)
            if (r11 == 0) goto L_0x0184
            boolean r12 = r0.f2547x
            if (r12 == 0) goto L_0x0103
            int r12 = r16.O0()
            goto L_0x0107
        L_0x0103:
            int r12 = r16.N0()
        L_0x0107:
            r5.f2551a = r12
            int r12 = r0.A
            if (r12 == r10) goto L_0x0139
            boolean r12 = r5.f2553c
            if (r12 == 0) goto L_0x0125
            androidx.recyclerview.widget.t r12 = r0.f2541r
            int r12 = r12.g()
            int r13 = r0.A
            int r12 = r12 - r13
            androidx.recyclerview.widget.t r13 = r0.f2541r
            int r11 = r13.b(r11)
            int r12 = r12 - r11
            r5.f2552b = r12
            goto L_0x01c2
        L_0x0125:
            androidx.recyclerview.widget.t r12 = r0.f2541r
            int r12 = r12.k()
            int r13 = r0.A
            int r12 = r12 + r13
            androidx.recyclerview.widget.t r13 = r0.f2541r
            int r11 = r13.e(r11)
            int r12 = r12 - r11
            r5.f2552b = r12
            goto L_0x01c2
        L_0x0139:
            androidx.recyclerview.widget.t r12 = r0.f2541r
            int r12 = r12.c(r11)
            androidx.recyclerview.widget.t r13 = r0.f2541r
            int r13 = r13.l()
            if (r12 <= r13) goto L_0x015c
            boolean r11 = r5.f2553c
            if (r11 == 0) goto L_0x0152
            androidx.recyclerview.widget.t r11 = r0.f2541r
            int r11 = r11.g()
            goto L_0x0158
        L_0x0152:
            androidx.recyclerview.widget.t r11 = r0.f2541r
            int r11 = r11.k()
        L_0x0158:
            r5.f2552b = r11
            goto L_0x01c2
        L_0x015c:
            androidx.recyclerview.widget.t r12 = r0.f2541r
            int r12 = r12.e(r11)
            androidx.recyclerview.widget.t r13 = r0.f2541r
            int r13 = r13.k()
            int r12 = r12 - r13
            if (r12 >= 0) goto L_0x016f
            int r11 = -r12
            r5.f2552b = r11
            goto L_0x01c2
        L_0x016f:
            androidx.recyclerview.widget.t r12 = r0.f2541r
            int r12 = r12.g()
            androidx.recyclerview.widget.t r13 = r0.f2541r
            int r11 = r13.b(r11)
            int r12 = r12 - r11
            if (r12 >= 0) goto L_0x0181
            r5.f2552b = r12
            goto L_0x01c2
        L_0x0181:
            r5.f2552b = r10
            goto L_0x01c2
        L_0x0184:
            int r11 = r0.f2549z
            r5.f2551a = r11
            int r12 = r0.A
            if (r12 != r10) goto L_0x01a9
            int r11 = r0.D0(r11)
            if (r11 != r7) goto L_0x0194
            r11 = r7
            goto L_0x0195
        L_0x0194:
            r11 = r6
        L_0x0195:
            r5.f2553c = r11
            if (r11 == 0) goto L_0x01a0
            androidx.recyclerview.widget.t r11 = r8.f2541r
            int r11 = r11.g()
            goto L_0x01a6
        L_0x01a0:
            androidx.recyclerview.widget.t r11 = r8.f2541r
            int r11 = r11.k()
        L_0x01a6:
            r5.f2552b = r11
            goto L_0x01c0
        L_0x01a9:
            boolean r11 = r5.f2553c
            if (r11 == 0) goto L_0x01b7
            androidx.recyclerview.widget.t r11 = r8.f2541r
            int r11 = r11.g()
            int r11 = r11 - r12
            r5.f2552b = r11
            goto L_0x01c0
        L_0x01b7:
            androidx.recyclerview.widget.t r11 = r8.f2541r
            int r11 = r11.k()
            int r11 = r11 + r12
            r5.f2552b = r11
        L_0x01c0:
            r5.f2554d = r7
        L_0x01c2:
            r11 = r7
            goto L_0x01c9
        L_0x01c4:
            r0.f2549z = r4
            r0.A = r10
        L_0x01c8:
            r11 = r6
        L_0x01c9:
            if (r11 == 0) goto L_0x01cc
            goto L_0x0209
        L_0x01cc:
            boolean r11 = r0.D
            if (r11 == 0) goto L_0x01e8
            int r11 = r18.b()
            int r12 = r16.w()
        L_0x01d8:
            int r12 = r12 + r4
            if (r12 < 0) goto L_0x0204
            android.view.View r13 = r0.v(r12)
            int r13 = androidx.recyclerview.widget.RecyclerView.m.G(r13)
            if (r13 < 0) goto L_0x01d8
            if (r13 >= r11) goto L_0x01d8
            goto L_0x0205
        L_0x01e8:
            int r11 = r18.b()
            int r12 = r16.w()
            r13 = r6
        L_0x01f1:
            if (r13 >= r12) goto L_0x0204
            android.view.View r14 = r0.v(r13)
            int r14 = androidx.recyclerview.widget.RecyclerView.m.G(r14)
            if (r14 < 0) goto L_0x0201
            if (r14 >= r11) goto L_0x0201
            r13 = r14
            goto L_0x0205
        L_0x0201:
            int r13 = r13 + 1
            goto L_0x01f1
        L_0x0204:
            r13 = r6
        L_0x0205:
            r5.f2551a = r13
            r5.f2552b = r10
        L_0x0209:
            r5.f2555e = r7
        L_0x020b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r11 = r0.F
            if (r11 != 0) goto L_0x0226
            int r11 = r0.f2549z
            if (r11 != r4) goto L_0x0226
            boolean r11 = r5.f2553c
            boolean r12 = r0.D
            if (r11 != r12) goto L_0x0221
            boolean r11 = r16.T0()
            boolean r12 = r0.E
            if (r11 == r12) goto L_0x0226
        L_0x0221:
            r9.a()
            r5.f2554d = r7
        L_0x0226:
            int r9 = r16.w()
            if (r9 <= 0) goto L_0x02d1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r9 = r0.F
            if (r9 == 0) goto L_0x0234
            int r9 = r9.f2567c
            if (r9 >= r7) goto L_0x02d1
        L_0x0234:
            boolean r9 = r5.f2554d
            if (r9 == 0) goto L_0x0253
            r3 = r6
        L_0x0239:
            int r8 = r0.f2539p
            if (r3 >= r8) goto L_0x02d1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r0.f2540q
            r8 = r8[r3]
            r8.b()
            int r8 = r5.f2552b
            if (r8 == r10) goto L_0x0250
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r0.f2540q
            r9 = r9[r3]
            r9.f2571b = r8
            r9.f2572c = r8
        L_0x0250:
            int r3 = r3 + 1
            goto L_0x0239
        L_0x0253:
            if (r3 != 0) goto L_0x0271
            int[] r3 = r5.f2556f
            if (r3 != 0) goto L_0x025a
            goto L_0x0271
        L_0x025a:
            r3 = r6
        L_0x025b:
            int r8 = r0.f2539p
            if (r3 >= r8) goto L_0x02d1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r0.f2540q
            r8 = r8[r3]
            r8.b()
            int[] r9 = r5.f2556f
            r9 = r9[r3]
            r8.f2571b = r9
            r8.f2572c = r9
            int r3 = r3 + 1
            goto L_0x025b
        L_0x0271:
            r3 = r6
        L_0x0272:
            int r9 = r0.f2539p
            if (r3 >= r9) goto L_0x02b0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r0.f2540q
            r9 = r9[r3]
            boolean r11 = r0.f2547x
            int r12 = r5.f2552b
            if (r11 == 0) goto L_0x0285
            int r13 = r9.f(r10)
            goto L_0x0289
        L_0x0285:
            int r13 = r9.i(r10)
        L_0x0289:
            r9.b()
            if (r13 != r10) goto L_0x028f
            goto L_0x02ad
        L_0x028f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r14 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            if (r11 == 0) goto L_0x029b
            androidx.recyclerview.widget.t r15 = r14.f2541r
            int r15 = r15.g()
            if (r13 < r15) goto L_0x02ad
        L_0x029b:
            if (r11 != 0) goto L_0x02a6
            androidx.recyclerview.widget.t r11 = r14.f2541r
            int r11 = r11.k()
            if (r13 <= r11) goto L_0x02a6
            goto L_0x02ad
        L_0x02a6:
            if (r12 == r10) goto L_0x02a9
            int r13 = r13 + r12
        L_0x02a9:
            r9.f2572c = r13
            r9.f2571b = r13
        L_0x02ad:
            int r3 = r3 + 1
            goto L_0x0272
        L_0x02b0:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r0.f2540q
            int r9 = r3.length
            int[] r11 = r5.f2556f
            if (r11 == 0) goto L_0x02ba
            int r11 = r11.length
            if (r11 >= r9) goto L_0x02c1
        L_0x02ba:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f2540q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r5.f2556f = r8
        L_0x02c1:
            r8 = r6
        L_0x02c2:
            if (r8 >= r9) goto L_0x02d1
            int[] r11 = r5.f2556f
            r12 = r3[r8]
            int r12 = r12.i(r10)
            r11[r8] = r12
            int r8 = r8 + 1
            goto L_0x02c2
        L_0x02d1:
            r16.p(r17)
            androidx.recyclerview.widget.n r3 = r0.f2545v
            r3.f2732a = r6
            androidx.recyclerview.widget.t r8 = r0.f2542s
            int r8 = r8.l()
            int r9 = r0.f2539p
            int r9 = r8 / r9
            r0.f2544u = r9
            androidx.recyclerview.widget.t r9 = r0.f2542s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r8 = r5.f2551a
            r0.g1(r8, r2)
            boolean r8 = r5.f2553c
            if (r8 == 0) goto L_0x030a
            r0.e1(r4)
            r0.I0(r1, r3, r2)
            r0.e1(r7)
            int r4 = r5.f2551a
            int r8 = r3.f2735d
            int r4 = r4 + r8
            r3.f2734c = r4
            r0.I0(r1, r3, r2)
            goto L_0x031d
        L_0x030a:
            r0.e1(r7)
            r0.I0(r1, r3, r2)
            r0.e1(r4)
            int r4 = r5.f2551a
            int r8 = r3.f2735d
            int r4 = r4 + r8
            r3.f2734c = r4
            r0.I0(r1, r3, r2)
        L_0x031d:
            androidx.recyclerview.widget.t r3 = r0.f2542s
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L_0x0329
            goto L_0x03c9
        L_0x0329:
            int r3 = r16.w()
            r4 = 0
            r8 = r6
        L_0x032f:
            if (r8 >= r3) goto L_0x0351
            android.view.View r9 = r0.v(r8)
            androidx.recyclerview.widget.t r11 = r0.f2542s
            int r11 = r11.c(r9)
            float r11 = (float) r11
            int r12 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0341
            goto L_0x034e
        L_0x0341:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r11)
        L_0x034e:
            int r8 = r8 + 1
            goto L_0x032f
        L_0x0351:
            int r8 = r0.f2544u
            int r9 = r0.f2539p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            androidx.recyclerview.widget.t r9 = r0.f2542s
            int r9 = r9.i()
            if (r9 != r10) goto L_0x036d
            androidx.recyclerview.widget.t r9 = r0.f2542s
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L_0x036d:
            int r9 = r0.f2539p
            int r9 = r4 / r9
            r0.f2544u = r9
            androidx.recyclerview.widget.t r9 = r0.f2542s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.f2544u
            if (r4 != r8) goto L_0x0381
            goto L_0x03c9
        L_0x0381:
            r4 = r6
        L_0x0382:
            if (r4 >= r3) goto L_0x03c9
            android.view.View r9 = r0.v(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r10
            r10.getClass()
            boolean r11 = r16.T0()
            if (r11 == 0) goto L_0x03b1
            int r11 = r0.f2543t
            if (r11 != r7) goto L_0x03b1
            int r11 = r0.f2539p
            int r12 = r11 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.f2558e
            int r10 = r10.f2574e
            int r12 = r12 - r10
            int r12 = -r12
            int r13 = r0.f2544u
            int r12 = r12 * r13
            int r11 = r11 - r7
            int r11 = r11 - r10
            int r10 = -r11
            int r10 = r10 * r8
            int r12 = r12 - r10
            r9.offsetLeftAndRight(r12)
            goto L_0x03c6
        L_0x03b1:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.f2558e
            int r10 = r10.f2574e
            int r11 = r0.f2544u
            int r11 = r11 * r10
            int r10 = r10 * r8
            int r12 = r0.f2543t
            if (r12 != r7) goto L_0x03c2
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L_0x03c6
        L_0x03c2:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L_0x03c6:
            int r4 = r4 + 1
            goto L_0x0382
        L_0x03c9:
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x03e0
            boolean r3 = r0.f2547x
            if (r3 == 0) goto L_0x03da
            r0.L0(r1, r2, r7)
            r0.M0(r1, r2, r6)
            goto L_0x03e0
        L_0x03da:
            r0.M0(r1, r2, r7)
            r0.L0(r1, r2, r6)
        L_0x03e0:
            if (r19 == 0) goto L_0x040b
            boolean r3 = r2.f2532g
            if (r3 != 0) goto L_0x040b
            int r3 = r0.C
            if (r3 == 0) goto L_0x03f8
            int r3 = r16.w()
            if (r3 <= 0) goto L_0x03f8
            android.view.View r3 = r16.S0()
            if (r3 == 0) goto L_0x03f8
            r3 = r7
            goto L_0x03f9
        L_0x03f8:
            r3 = r6
        L_0x03f9:
            if (r3 == 0) goto L_0x040b
            androidx.recyclerview.widget.RecyclerView r3 = r0.f2472b
            if (r3 == 0) goto L_0x0404
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r4 = r0.K
            r3.removeCallbacks(r4)
        L_0x0404:
            boolean r3 = r16.E0()
            if (r3 == 0) goto L_0x040b
            goto L_0x040c
        L_0x040b:
            r7 = r6
        L_0x040c:
            boolean r3 = r2.f2532g
            if (r3 == 0) goto L_0x0413
            r5.a()
        L_0x0413:
            boolean r3 = r5.f2553c
            r0.D = r3
            boolean r3 = r16.T0()
            r0.E = r3
            if (r7 == 0) goto L_0x0425
            r5.a()
            r0.V0(r1, r2, r6)
        L_0x0425:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.V0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    public final boolean W0(int i8) {
        if (this.f2543t == 0) {
            return (i8 == -1) != this.f2547x;
        }
        return ((i8 == -1) == this.f2547x) == T0();
    }

    public final void X0(int i8, RecyclerView.y yVar) {
        int i10;
        int i11;
        if (i8 > 0) {
            i11 = O0();
            i10 = 1;
        } else {
            i11 = N0();
            i10 = -1;
        }
        n nVar = this.f2545v;
        nVar.f2732a = true;
        g1(i11, yVar);
        e1(i10);
        nVar.f2734c = i11 + nVar.f2735d;
        nVar.f2733b = Math.abs(i8);
    }

    public final void Y(int i8, int i10) {
        R0(i8, i10, 1);
    }

    public final void Y0(RecyclerView.t tVar, n nVar) {
        if (nVar.f2732a && !nVar.f2740i) {
            if (nVar.f2733b != 0) {
                int i8 = 1;
                if (nVar.f2736e == -1) {
                    int i10 = nVar.f2737f;
                    int i11 = this.f2540q[0].i(i10);
                    while (i8 < this.f2539p) {
                        int i12 = this.f2540q[i8].i(i10);
                        if (i12 > i11) {
                            i11 = i12;
                        }
                        i8++;
                    }
                    int i13 = i10 - i11;
                    Z0(i13 < 0 ? nVar.f2738g : nVar.f2738g - Math.min(i13, nVar.f2733b), tVar);
                    return;
                }
                int i14 = nVar.f2738g;
                int f10 = this.f2540q[0].f(i14);
                while (i8 < this.f2539p) {
                    int f11 = this.f2540q[i8].f(i14);
                    if (f11 < f10) {
                        f10 = f11;
                    }
                    i8++;
                }
                int i15 = f10 - nVar.f2738g;
                a1(i15 < 0 ? nVar.f2737f : Math.min(i15, nVar.f2733b) + nVar.f2737f, tVar);
            } else if (nVar.f2736e == -1) {
                Z0(nVar.f2738g, tVar);
            } else {
                a1(nVar.f2737f, tVar);
            }
        }
    }

    public final void Z() {
        this.B.a();
        o0();
    }

    public final void Z0(int i8, RecyclerView.t tVar) {
        int w10 = w() - 1;
        while (w10 >= 0) {
            View v3 = v(w10);
            if (this.f2541r.e(v3) >= i8 && this.f2541r.n(v3) >= i8) {
                c cVar = (c) v3.getLayoutParams();
                cVar.getClass();
                if (cVar.f2558e.f2570a.size() != 1) {
                    f fVar = cVar.f2558e;
                    ArrayList<View> arrayList = fVar.f2570a;
                    int size = arrayList.size();
                    View remove = arrayList.remove(size - 1);
                    c h3 = f.h(remove);
                    h3.f2558e = null;
                    if (h3.c() || h3.b()) {
                        fVar.f2573d -= StaggeredGridLayoutManager.this.f2541r.c(remove);
                    }
                    if (size == 1) {
                        fVar.f2571b = Integer.MIN_VALUE;
                    }
                    fVar.f2572c = Integer.MIN_VALUE;
                    l0(v3, tVar);
                    w10--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final PointF a(int i8) {
        int D0 = D0(i8);
        PointF pointF = new PointF();
        if (D0 == 0) {
            return null;
        }
        if (this.f2543t == 0) {
            pointF.x = (float) D0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) D0;
        }
        return pointF;
    }

    public final void a0(int i8, int i10) {
        R0(i8, i10, 8);
    }

    public final void a1(int i8, RecyclerView.t tVar) {
        while (w() > 0) {
            View v3 = v(0);
            if (this.f2541r.b(v3) <= i8 && this.f2541r.m(v3) <= i8) {
                c cVar = (c) v3.getLayoutParams();
                cVar.getClass();
                if (cVar.f2558e.f2570a.size() != 1) {
                    f fVar = cVar.f2558e;
                    ArrayList<View> arrayList = fVar.f2570a;
                    View remove = arrayList.remove(0);
                    c h3 = f.h(remove);
                    h3.f2558e = null;
                    if (arrayList.size() == 0) {
                        fVar.f2572c = Integer.MIN_VALUE;
                    }
                    if (h3.c() || h3.b()) {
                        fVar.f2573d -= StaggeredGridLayoutManager.this.f2541r.c(remove);
                    }
                    fVar.f2571b = Integer.MIN_VALUE;
                    l0(v3, tVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void b0(int i8, int i10) {
        R0(i8, i10, 2);
    }

    public final void b1() {
        if (this.f2543t == 1 || !T0()) {
            this.f2547x = this.f2546w;
        } else {
            this.f2547x = !this.f2546w;
        }
    }

    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    public final void c0(int i8, int i10) {
        R0(i8, i10, 4);
    }

    public final int c1(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        if (w() == 0 || i8 == 0) {
            return 0;
        }
        X0(i8, yVar);
        n nVar = this.f2545v;
        int I0 = I0(tVar, nVar, yVar);
        if (nVar.f2733b >= I0) {
            i8 = i8 < 0 ? -I0 : I0;
        }
        this.f2541r.o(-i8);
        this.D = this.f2547x;
        nVar.f2733b = 0;
        Y0(tVar, nVar);
        return i8;
    }

    public final boolean d() {
        return this.f2543t == 0;
    }

    public final void d0(RecyclerView.t tVar, RecyclerView.y yVar) {
        V0(tVar, yVar, true);
    }

    public final void d1() {
        c((String) null);
        if (2 != this.C) {
            this.C = 2;
            o0();
        }
    }

    public final boolean e() {
        return this.f2543t == 1;
    }

    public final void e0(RecyclerView.y yVar) {
        this.f2549z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void e1(int i8) {
        n nVar = this.f2545v;
        nVar.f2736e = i8;
        int i10 = 1;
        if (this.f2547x != (i8 == -1)) {
            i10 = -1;
        }
        nVar.f2735d = i10;
    }

    public final boolean f(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    public final void f0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.F = eVar;
            if (this.f2549z != -1) {
                eVar.f2568d = null;
                eVar.f2567c = 0;
                eVar.f2565a = -1;
                eVar.f2566b = -1;
                eVar.f2568d = null;
                eVar.f2567c = 0;
                eVar.f2569e = 0;
                eVar.B = null;
                eVar.C = null;
            }
            o0();
        }
    }

    public final void f1(int i8) {
        c((String) null);
        if (i8 != this.f2539p) {
            this.B.a();
            o0();
            this.f2539p = i8;
            this.f2548y = new BitSet(this.f2539p);
            this.f2540q = new f[this.f2539p];
            for (int i10 = 0; i10 < this.f2539p; i10++) {
                this.f2540q[i10] = new f(i10);
            }
            o0();
        }
    }

    public final Parcelable g0() {
        int i8;
        int i10;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.D = this.f2546w;
        eVar2.E = this.D;
        eVar2.F = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f2559a) == null) {
            eVar2.f2569e = 0;
        } else {
            eVar2.B = iArr;
            eVar2.f2569e = iArr.length;
            eVar2.C = dVar.f2560b;
        }
        int i11 = -1;
        if (w() > 0) {
            eVar2.f2565a = this.D ? O0() : N0();
            View J0 = this.f2547x ? J0(true) : K0(true);
            if (J0 != null) {
                i11 = RecyclerView.m.G(J0);
            }
            eVar2.f2566b = i11;
            int i12 = this.f2539p;
            eVar2.f2567c = i12;
            eVar2.f2568d = new int[i12];
            for (int i13 = 0; i13 < this.f2539p; i13++) {
                if (this.D) {
                    i8 = this.f2540q[i13].f(Integer.MIN_VALUE);
                    if (i8 != Integer.MIN_VALUE) {
                        i10 = this.f2541r.g();
                    } else {
                        eVar2.f2568d[i13] = i8;
                    }
                } else {
                    i8 = this.f2540q[i13].i(Integer.MIN_VALUE);
                    if (i8 != Integer.MIN_VALUE) {
                        i10 = this.f2541r.k();
                    } else {
                        eVar2.f2568d[i13] = i8;
                    }
                }
                i8 -= i10;
                eVar2.f2568d[i13] = i8;
            }
        } else {
            eVar2.f2565a = -1;
            eVar2.f2566b = -1;
            eVar2.f2567c = 0;
        }
        return eVar2;
    }

    public final void g1(int i8, RecyclerView.y yVar) {
        int i10;
        int i11;
        int i12;
        n nVar = this.f2545v;
        boolean z10 = false;
        nVar.f2733b = 0;
        nVar.f2734c = i8;
        RecyclerView.x xVar = this.f2475e;
        if (!(xVar != null && xVar.f2515e) || (i12 = yVar.f2526a) == -1) {
            i11 = 0;
            i10 = 0;
        } else {
            if (this.f2547x == (i12 < i8)) {
                i11 = this.f2541r.l();
                i10 = 0;
            } else {
                i10 = this.f2541r.l();
                i11 = 0;
            }
        }
        RecyclerView recyclerView = this.f2472b;
        if (recyclerView != null && recyclerView.C) {
            nVar.f2737f = this.f2541r.k() - i10;
            nVar.f2738g = this.f2541r.g() + i11;
        } else {
            nVar.f2738g = this.f2541r.f() + i11;
            nVar.f2737f = -i10;
        }
        nVar.f2739h = false;
        nVar.f2732a = true;
        if (this.f2541r.i() == 0 && this.f2541r.f() == 0) {
            z10 = true;
        }
        nVar.f2740i = z10;
    }

    public final void h(int i8, int i10, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        n nVar;
        int i11;
        int i12;
        if (this.f2543t != 0) {
            i8 = i10;
        }
        if (w() != 0 && i8 != 0) {
            X0(i8, yVar);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f2539p) {
                this.J = new int[this.f2539p];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f2539p;
                nVar = this.f2545v;
                if (i13 >= i15) {
                    break;
                }
                if (nVar.f2735d == -1) {
                    i12 = nVar.f2737f;
                    i11 = this.f2540q[i13].i(i12);
                } else {
                    i12 = this.f2540q[i13].f(nVar.f2738g);
                    i11 = nVar.f2738g;
                }
                int i16 = i12 - i11;
                if (i16 >= 0) {
                    this.J[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.J, 0, i14);
            int i17 = 0;
            while (i17 < i14) {
                int i18 = nVar.f2734c;
                if (i18 >= 0 && i18 < yVar.b()) {
                    ((m.b) cVar).a(nVar.f2734c, this.J[i17]);
                    nVar.f2734c += nVar.f2735d;
                    i17++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h0(int i8) {
        if (i8 == 0) {
            E0();
        }
    }

    public final void h1(f fVar, int i8, int i10) {
        int i11 = fVar.f2573d;
        int i12 = fVar.f2574e;
        if (i8 == -1) {
            int i13 = fVar.f2571b;
            if (i13 == Integer.MIN_VALUE) {
                View view = fVar.f2570a.get(0);
                c h3 = f.h(view);
                fVar.f2571b = StaggeredGridLayoutManager.this.f2541r.e(view);
                h3.getClass();
                i13 = fVar.f2571b;
            }
            if (i13 + i11 <= i10) {
                this.f2548y.set(i12, false);
                return;
            }
            return;
        }
        int i14 = fVar.f2572c;
        if (i14 == Integer.MIN_VALUE) {
            fVar.a();
            i14 = fVar.f2572c;
        }
        if (i14 - i11 >= i10) {
            this.f2548y.set(i12, false);
        }
    }

    public final int j(RecyclerView.y yVar) {
        return F0(yVar);
    }

    public final int k(RecyclerView.y yVar) {
        return G0(yVar);
    }

    public final int l(RecyclerView.y yVar) {
        return H0(yVar);
    }

    public final int m(RecyclerView.y yVar) {
        return F0(yVar);
    }

    public final int n(RecyclerView.y yVar) {
        return G0(yVar);
    }

    public final int o(RecyclerView.y yVar) {
        return H0(yVar);
    }

    public final int p0(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        return c1(i8, tVar, yVar);
    }

    public final void q0(int i8) {
        e eVar = this.F;
        if (!(eVar == null || eVar.f2565a == i8)) {
            eVar.f2568d = null;
            eVar.f2567c = 0;
            eVar.f2565a = -1;
            eVar.f2566b = -1;
        }
        this.f2549z = i8;
        this.A = Integer.MIN_VALUE;
        o0();
    }

    public final RecyclerView.n r() {
        return this.f2543t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final int r0(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        return c1(i8, tVar, yVar);
    }

    public final RecyclerView.n s(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final RecyclerView.n t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void u0(Rect rect, int i8, int i10) {
        int i11;
        int i12;
        int E2 = E() + D();
        int C2 = C() + F();
        if (this.f2543t == 1) {
            int height = rect.height() + C2;
            RecyclerView recyclerView = this.f2472b;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i12 = RecyclerView.m.g(i10, height, i0.d.d(recyclerView));
            i11 = RecyclerView.m.g(i8, (this.f2544u * this.f2539p) + E2, i0.d.e(this.f2472b));
        } else {
            int width = rect.width() + E2;
            RecyclerView recyclerView2 = this.f2472b;
            WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
            i11 = RecyclerView.m.g(i8, width, i0.d.e(recyclerView2));
            i12 = RecyclerView.m.g(i10, (this.f2544u * this.f2539p) + C2, i0.d.d(this.f2472b));
        }
        this.f2472b.setMeasuredDimension(i11, i12);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2559a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f2560b;

        public final void a() {
            int[] iArr = this.f2559a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2560b = null;
        }

        public final void b(int i8) {
            int[] iArr = this.f2559a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i8, 10) + 1)];
                this.f2559a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i8 >= iArr.length) {
                int length = iArr.length;
                while (length <= i8) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2559a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2559a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f2559a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r6 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2560b
                if (r0 != 0) goto L_0x000f
                goto L_0x005e
            L_0x000f:
                r2 = 0
                if (r0 != 0) goto L_0x0013
                goto L_0x002b
            L_0x0013:
                int r0 = r0.size()
                int r0 = r0 + r1
            L_0x0018:
                if (r0 < 0) goto L_0x002b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f2560b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r4 = r3.f2561a
                if (r4 != r6) goto L_0x0028
                r2 = r3
                goto L_0x002b
            L_0x0028:
                int r0 = r0 + -1
                goto L_0x0018
            L_0x002b:
                if (r2 == 0) goto L_0x0032
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2560b
                r0.remove(r2)
            L_0x0032:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2560b
                int r0 = r0.size()
                r2 = 0
            L_0x0039:
                if (r2 >= r0) goto L_0x004b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f2560b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f2561a
                if (r3 < r6) goto L_0x0048
                goto L_0x004c
            L_0x0048:
                int r2 = r2 + 1
                goto L_0x0039
            L_0x004b:
                r2 = r1
            L_0x004c:
                if (r2 == r1) goto L_0x005e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r5.f2560b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r5.f2560b
                r3.remove(r2)
                int r0 = r0.f2561a
                goto L_0x005f
            L_0x005e:
                r0 = r1
            L_0x005f:
                if (r0 != r1) goto L_0x006b
                int[] r0 = r5.f2559a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f2559a
                int r6 = r6.length
                return r6
            L_0x006b:
                int r0 = r0 + 1
                int[] r2 = r5.f2559a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r5.f2559a
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.c(int):int");
        }

        public final void d(int i8, int i10) {
            int[] iArr = this.f2559a;
            if (iArr != null && i8 < iArr.length) {
                int i11 = i8 + i10;
                b(i11);
                int[] iArr2 = this.f2559a;
                System.arraycopy(iArr2, i8, iArr2, i11, (iArr2.length - i8) - i10);
                Arrays.fill(this.f2559a, i8, i11, -1);
                List<a> list = this.f2560b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f2560b.get(size);
                        int i12 = aVar.f2561a;
                        if (i12 >= i8) {
                            aVar.f2561a = i12 + i10;
                        }
                    }
                }
            }
        }

        public final void e(int i8, int i10) {
            int[] iArr = this.f2559a;
            if (iArr != null && i8 < iArr.length) {
                int i11 = i8 + i10;
                b(i11);
                int[] iArr2 = this.f2559a;
                System.arraycopy(iArr2, i11, iArr2, i8, (iArr2.length - i8) - i10);
                int[] iArr3 = this.f2559a;
                Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
                List<a> list = this.f2560b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f2560b.get(size);
                        int i12 = aVar.f2561a;
                        if (i12 >= i8) {
                            if (i12 < i11) {
                                this.f2560b.remove(size);
                            } else {
                                aVar.f2561a = i12 - i10;
                            }
                        }
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0028a();

            /* renamed from: a  reason: collision with root package name */
            public int f2561a;

            /* renamed from: b  reason: collision with root package name */
            public int f2562b;

            /* renamed from: c  reason: collision with root package name */
            public int[] f2563c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f2564d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public class C0028a implements Parcelable.Creator<a> {
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                public final Object[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(Parcel parcel) {
                this.f2561a = parcel.readInt();
                this.f2562b = parcel.readInt();
                this.f2564d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2563c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f2561a + ", mGapDir=" + this.f2562b + ", mHasUnwantedGapAfter=" + this.f2564d + ", mGapPerSpan=" + Arrays.toString(this.f2563c) + '}';
            }

            public final void writeToParcel(Parcel parcel, int i8) {
                parcel.writeInt(this.f2561a);
                parcel.writeInt(this.f2562b);
                parcel.writeInt(this.f2564d ? 1 : 0);
                int[] iArr = this.f2563c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2563c);
            }

            public a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i8) {
        this.f2539p = -1;
        this.f2546w = false;
        this.f2547x = false;
        this.f2549z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new d();
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        this.f2543t = 1;
        f1(i8);
        this.f2545v = new n();
        this.f2541r = t.a(this, this.f2543t);
        this.f2542s = t.a(this, 1 - this.f2543t);
    }
}
