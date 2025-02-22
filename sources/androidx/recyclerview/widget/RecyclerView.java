package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.widget.a1;
import androidx.compose.ui.platform.b3;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.y;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import d2.v0;
import e2.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import y1.k;

public class RecyclerView extends ViewGroup implements d2.u {
    public static final int[] W0 = {16843830};
    public static final Class<?>[] X0;
    public static final c Y0 = new c();
    public final a0 A0;
    public final d0 B;
    public m B0;
    public boolean C;
    public final m.b C0;
    public final a D;
    public final y D0;
    public final Rect E;
    public r E0;
    public final Rect F;
    public ArrayList F0;
    public final RectF G;
    public boolean G0;
    public e H;
    public boolean H0;
    public m I;
    public final k I0;
    public u J;
    public boolean J0;
    public final ArrayList K;
    public y K0;
    public final ArrayList<l> L;
    public final int[] L0;
    public final ArrayList<q> M;
    public d2.v M0;
    public q N;
    public final int[] N0;
    public boolean O;
    public final int[] O0;
    public boolean P;
    public final int[] P0;
    public boolean Q;
    public final ArrayList Q0;
    public int R;
    public final b R0;
    public boolean S;
    public boolean S0;
    public boolean T;
    public int T0;
    public boolean U;
    public int U0;
    public int V;
    public final d V0;
    public boolean W;

    /* renamed from: a  reason: collision with root package name */
    public final v f2401a;

    /* renamed from: a0  reason: collision with root package name */
    public final AccessibilityManager f2402a0;

    /* renamed from: b  reason: collision with root package name */
    public final t f2403b;

    /* renamed from: b0  reason: collision with root package name */
    public ArrayList f2404b0;

    /* renamed from: c  reason: collision with root package name */
    public w f2405c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2406c0;

    /* renamed from: d  reason: collision with root package name */
    public a f2407d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2408d0;

    /* renamed from: e  reason: collision with root package name */
    public d f2409e;

    /* renamed from: e0  reason: collision with root package name */
    public int f2410e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2411f0;

    /* renamed from: g0  reason: collision with root package name */
    public i f2412g0;

    /* renamed from: h0  reason: collision with root package name */
    public EdgeEffect f2413h0;

    /* renamed from: i0  reason: collision with root package name */
    public EdgeEffect f2414i0;

    /* renamed from: j0  reason: collision with root package name */
    public EdgeEffect f2415j0;

    /* renamed from: k0  reason: collision with root package name */
    public EdgeEffect f2416k0;

    /* renamed from: l0  reason: collision with root package name */
    public j f2417l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f2418m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f2419n0;

    /* renamed from: o0  reason: collision with root package name */
    public VelocityTracker f2420o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f2421p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2422q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2423r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f2424s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f2425t0;

    /* renamed from: u0  reason: collision with root package name */
    public p f2426u0;

    /* renamed from: v0  reason: collision with root package name */
    public final int f2427v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f2428w0;

    /* renamed from: x0  reason: collision with root package name */
    public final float f2429x0;

    /* renamed from: y0  reason: collision with root package name */
    public final float f2430y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2431z0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.Q && !recyclerView.isLayoutRequested()) {
                if (!recyclerView.O) {
                    recyclerView.requestLayout();
                } else if (recyclerView.T) {
                    recyclerView.S = true;
                } else {
                    recyclerView.m();
                }
            }
        }
    }

    public class a0 implements Runnable {
        public boolean B = false;

        /* renamed from: a  reason: collision with root package name */
        public int f2433a;

        /* renamed from: b  reason: collision with root package name */
        public int f2434b;

        /* renamed from: c  reason: collision with root package name */
        public OverScroller f2435c;

        /* renamed from: d  reason: collision with root package name */
        public Interpolator f2436d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2437e = false;

        public a0() {
            c cVar = RecyclerView.Y0;
            this.f2436d = cVar;
            this.f2435c = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a() {
            if (this.f2437e) {
                this.B = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.m(recyclerView, this);
        }

        public final void b(int i8, int i10, int i11, Interpolator interpolator) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i11 == Integer.MIN_VALUE) {
                int abs = Math.abs(i8);
                int abs2 = Math.abs(i10);
                boolean z10 = abs > abs2;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z10) {
                    abs = abs2;
                }
                i11 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
            }
            int i12 = i11;
            if (interpolator == null) {
                interpolator = RecyclerView.Y0;
            }
            if (this.f2436d != interpolator) {
                this.f2436d = interpolator;
                this.f2435c = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f2434b = 0;
            this.f2433a = 0;
            recyclerView.setScrollState(2);
            this.f2435c.startScroll(0, 0, i8, i10, i12);
            a();
        }

        public final void run() {
            int i8;
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.I == null) {
                recyclerView.removeCallbacks(this);
                this.f2435c.abortAnimation();
                return;
            }
            this.B = false;
            this.f2437e = true;
            recyclerView.m();
            OverScroller overScroller = this.f2435c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f2433a;
                int i14 = currY - this.f2434b;
                this.f2433a = currX;
                this.f2434b = currY;
                int[] iArr = recyclerView.P0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean s10 = recyclerView.s(i13, i14, 1, iArr, (int[]) null);
                int[] iArr2 = recyclerView.P0;
                if (s10) {
                    i13 -= iArr2[0];
                    i14 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.l(i13, i14);
                }
                if (recyclerView.H != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.Z(i13, i14, iArr2);
                    int i15 = iArr2[0];
                    int i16 = iArr2[1];
                    int i17 = i13 - i15;
                    int i18 = i14 - i16;
                    x xVar = recyclerView.I.f2475e;
                    if (xVar != null && !xVar.f2514d && xVar.f2515e) {
                        int b10 = recyclerView.D0.b();
                        if (b10 == 0) {
                            xVar.d();
                        } else if (xVar.f2511a >= b10) {
                            xVar.f2511a = b10 - 1;
                            xVar.b(i15, i16);
                        } else {
                            xVar.b(i15, i16);
                        }
                    }
                    i11 = i15;
                    i10 = i17;
                    i8 = i18;
                    i12 = i16;
                } else {
                    i10 = i13;
                    i8 = i14;
                    i12 = 0;
                    i11 = 0;
                }
                if (!recyclerView.L.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.P0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i19 = i12;
                recyclerView.t(i11, i12, i10, i8, (int[]) null, 1, iArr3);
                int i20 = i10 - iArr2[0];
                int i21 = i8 - iArr2[1];
                if (!(i11 == 0 && i19 == 0)) {
                    recyclerView.u(i11, i19);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i20 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i21 != 0));
                x xVar2 = recyclerView.I.f2475e;
                if ((xVar2 != null && xVar2.f2514d) || !z10) {
                    a();
                    m mVar = recyclerView.B0;
                    if (mVar != null) {
                        mVar.a(recyclerView, i11, i19);
                    }
                } else {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i22 = i20 < 0 ? -currVelocity : i20 > 0 ? currVelocity : 0;
                        if (i21 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i21 <= 0) {
                            currVelocity = 0;
                        }
                        if (i22 < 0) {
                            recyclerView.w();
                            if (recyclerView.f2413h0.isFinished()) {
                                recyclerView.f2413h0.onAbsorb(-i22);
                            }
                        } else if (i22 > 0) {
                            recyclerView.x();
                            if (recyclerView.f2415j0.isFinished()) {
                                recyclerView.f2415j0.onAbsorb(i22);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.y();
                            if (recyclerView.f2414i0.isFinished()) {
                                recyclerView.f2414i0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.v();
                            if (recyclerView.f2416k0.isFinished()) {
                                recyclerView.f2416k0.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i22 == 0 && currVelocity == 0)) {
                            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                            i0.d.k(recyclerView);
                        }
                    }
                    m.b bVar = recyclerView.C0;
                    int[] iArr4 = bVar.f2725c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    bVar.f2726d = 0;
                }
            }
            x xVar3 = recyclerView.I.f2475e;
            if (xVar3 != null && xVar3.f2514d) {
                xVar3.b(0, 0);
            }
            this.f2437e = false;
            if (this.B) {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                i0.d.m(recyclerView, this);
                return;
            }
            recyclerView.setScrollState(0);
            recyclerView.f0(1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            j jVar = recyclerView.f2417l0;
            if (jVar != null) {
                jVar.k();
            }
            recyclerView.J0 = false;
        }
    }

    public static abstract class b0 {

        /* renamed from: t  reason: collision with root package name */
        public static final List<Object> f2439t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f2440a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f2441b;

        /* renamed from: c  reason: collision with root package name */
        public int f2442c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f2443d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f2444e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2445f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2446g = -1;

        /* renamed from: h  reason: collision with root package name */
        public b0 f2447h = null;

        /* renamed from: i  reason: collision with root package name */
        public b0 f2448i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f2449j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList f2450k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f2451l = null;
        public int m = 0;

        /* renamed from: n  reason: collision with root package name */
        public t f2452n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2453o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f2454p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f2455q = -1;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f2456r;

        /* renamed from: s  reason: collision with root package name */
        public e<? extends b0> f2457s;

        public b0(View view) {
            if (view != null) {
                this.f2440a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f2449j) == 0) {
                if (this.f2450k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f2450k = arrayList;
                    this.f2451l = Collections.unmodifiableList(arrayList);
                }
                this.f2450k.add(obj);
            }
        }

        public final void b(int i8) {
            this.f2449j = i8 | this.f2449j;
        }

        public final int c() {
            RecyclerView recyclerView = this.f2456r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.G(this);
        }

        public final int d() {
            int i8 = this.f2446g;
            return i8 == -1 ? this.f2442c : i8;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f2450k;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<java.lang.Object> e() {
            /*
                r1 = this;
                int r0 = r1.f2449j
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 != 0) goto L_0x0014
                java.util.ArrayList r0 = r1.f2450k
                if (r0 == 0) goto L_0x0014
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0011
                goto L_0x0014
            L_0x0011:
                java.util.List<java.lang.Object> r0 = r1.f2451l
                return r0
            L_0x0014:
                java.util.List<java.lang.Object> r0 = f2439t
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.b0.e():java.util.List");
        }

        public final boolean f() {
            View view = this.f2440a;
            return (view.getParent() == null || view.getParent() == this.f2456r) ? false : true;
        }

        public final boolean g() {
            return (this.f2449j & 1) != 0;
        }

        public final boolean h() {
            return (this.f2449j & 4) != 0;
        }

        public final boolean i() {
            if ((this.f2449j & 16) == 0) {
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                if (!i0.d.i(this.f2440a)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean j() {
            return (this.f2449j & 8) != 0;
        }

        public final boolean k() {
            return this.f2452n != null;
        }

        public final boolean l() {
            return (this.f2449j & 256) != 0;
        }

        public final void m(int i8, boolean z10) {
            if (this.f2443d == -1) {
                this.f2443d = this.f2442c;
            }
            if (this.f2446g == -1) {
                this.f2446g = this.f2442c;
            }
            if (z10) {
                this.f2446g += i8;
            }
            this.f2442c += i8;
            View view = this.f2440a;
            if (view.getLayoutParams() != null) {
                ((n) view.getLayoutParams()).f2493c = true;
            }
        }

        public final void n() {
            this.f2449j = 0;
            this.f2442c = -1;
            this.f2443d = -1;
            this.f2444e = -1;
            this.f2446g = -1;
            this.m = 0;
            this.f2447h = null;
            this.f2448i = null;
            ArrayList arrayList = this.f2450k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f2449j &= -1025;
            this.f2454p = 0;
            this.f2455q = -1;
            RecyclerView.j(this);
        }

        public final void o(boolean z10) {
            int i8 = this.m;
            int i10 = z10 ? i8 - 1 : i8 + 1;
            this.m = i10;
            if (i10 < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i10 == 1) {
                this.f2449j |= 16;
            } else if (z10 && i10 == 0) {
                this.f2449j &= -17;
            }
        }

        public final boolean p() {
            return (this.f2449j & 128) != 0;
        }

        public final boolean q() {
            return (this.f2449j & 32) != 0;
        }

        public final String toString() {
            StringBuilder b10 = d.a.b(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            b10.append(Integer.toHexString(hashCode()));
            b10.append(" position=");
            b10.append(this.f2442c);
            b10.append(" id=");
            b10.append(this.f2444e);
            b10.append(", oldPos=");
            b10.append(this.f2443d);
            b10.append(", pLpos:");
            b10.append(this.f2446g);
            StringBuilder sb2 = new StringBuilder(b10.toString());
            if (k()) {
                sb2.append(" scrap ");
                sb2.append(this.f2453o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (h()) {
                sb2.append(" invalid");
            }
            if (!g()) {
                sb2.append(" unbound");
            }
            boolean z10 = true;
            if ((this.f2449j & 2) != 0) {
                sb2.append(" update");
            }
            if (j()) {
                sb2.append(" removed");
            }
            if (p()) {
                sb2.append(" ignored");
            }
            if (l()) {
                sb2.append(" tmpDetached");
            }
            if (!i()) {
                sb2.append(" not recyclable(" + this.m + ")");
            }
            if ((this.f2449j & 512) == 0 && !h()) {
                z10 = false;
            }
            if (z10) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2440a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public class c implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class d {
        public d() {
        }
    }

    public static abstract class e<VH extends b0> {

        /* renamed from: a  reason: collision with root package name */
        public final f f2459a = new f();

        /* renamed from: b  reason: collision with root package name */
        public boolean f2460b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f2461c = 1;

        public abstract int d();

        public long e(int i8) {
            return -1;
        }

        public int f(int i8) {
            return 0;
        }

        public final void g() {
            this.f2459a.b();
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(VH vh, int i8);

        public abstract b0 j(RecyclerView recyclerView, int i8);

        public void k(RecyclerView recyclerView) {
        }

        public boolean l(VH vh) {
            return false;
        }

        public void m(VH vh) {
        }

        public void n(VH vh) {
        }

        public final void o(g gVar) {
            this.f2459a.registerObserver(gVar);
        }
    }

    public static class f extends Observable<g> {
        public final boolean a() {
            return !this.mObservers.isEmpty();
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).a();
            }
        }

        public final void c(int i8, int i10) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).e(i8, i10);
            }
        }

        public final void d(Object obj, int i8, int i10) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).c(obj, i8, i10);
            }
        }

        public final void e(int i8, int i10) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).d(i8, i10);
            }
        }

        public final void f(int i8, int i10) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).f(i8, i10);
            }
        }

        public final void g() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).g();
            }
        }
    }

    public static abstract class g {
        public void a() {
        }

        public void b() {
        }

        public void c(Object obj, int i8, int i10) {
            b();
        }

        public void d(int i8, int i10) {
        }

        public void e(int i8, int i10) {
        }

        public void f(int i8, int i10) {
        }

        public void g() {
        }
    }

    public interface h {
    }

    public static class i {
    }

    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public b f2462a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<a> f2463b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public final long f2464c = 120;

        /* renamed from: d  reason: collision with root package name */
        public final long f2465d = 120;

        /* renamed from: e  reason: collision with root package name */
        public final long f2466e = 250;

        /* renamed from: f  reason: collision with root package name */
        public final long f2467f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f2468a;

            /* renamed from: b  reason: collision with root package name */
            public int f2469b;

            public final void a(b0 b0Var) {
                View view = b0Var.f2440a;
                this.f2468a = view.getLeft();
                this.f2469b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void e(b0 b0Var) {
            int i8 = b0Var.f2449j & 14;
            if (!b0Var.h() && (i8 & 4) == 0) {
                b0Var.c();
            }
        }

        public abstract boolean a(b0 b0Var, c cVar, c cVar2);

        public abstract boolean b(b0 b0Var, b0 b0Var2, c cVar, c cVar2);

        public abstract boolean c(b0 b0Var, c cVar, c cVar2);

        public abstract boolean d(b0 b0Var, c cVar, c cVar2);

        public abstract boolean f(b0 b0Var, List<Object> list);

        public final void g(b0 b0Var) {
            b bVar = this.f2462a;
            if (bVar != null) {
                k kVar = (k) bVar;
                boolean z10 = true;
                b0Var.o(true);
                if (b0Var.f2447h != null && b0Var.f2448i == null) {
                    b0Var.f2447h = null;
                }
                b0Var.f2448i = null;
                if (!((b0Var.f2449j & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.d0();
                    d dVar = recyclerView.f2409e;
                    w wVar = (w) dVar.f2604a;
                    RecyclerView recyclerView2 = wVar.f2755a;
                    View view = b0Var.f2440a;
                    int indexOfChild = recyclerView2.indexOfChild(view);
                    if (indexOfChild == -1) {
                        dVar.k(view);
                    } else {
                        d.a aVar = dVar.f2605b;
                        if (aVar.d(indexOfChild)) {
                            aVar.f(indexOfChild);
                            dVar.k(view);
                            wVar.b(indexOfChild);
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        b0 J = RecyclerView.J(view);
                        t tVar = recyclerView.f2403b;
                        tVar.j(J);
                        tVar.g(J);
                    }
                    recyclerView.e0(!z10);
                    if (!z10 && b0Var.l()) {
                        recyclerView.removeDetachedView(view, false);
                    }
                }
            }
        }

        public abstract void h(b0 b0Var);

        public abstract void i();

        public abstract boolean j();

        public abstract void k();
    }

    public class k implements j.b {
        public k() {
        }
    }

    public static abstract class l {
        public void d(Rect rect, View view, RecyclerView recyclerView, y yVar) {
            ((n) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void e(Canvas canvas, RecyclerView recyclerView) {
        }

        public void f(Canvas canvas) {
        }
    }

    public static abstract class m {

        /* renamed from: a  reason: collision with root package name */
        public d f2471a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f2472b;

        /* renamed from: c  reason: collision with root package name */
        public final c0 f2473c;

        /* renamed from: d  reason: collision with root package name */
        public final c0 f2474d;

        /* renamed from: e  reason: collision with root package name */
        public x f2475e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2476f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2477g = false;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f2478h = true;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f2479i = true;

        /* renamed from: j  reason: collision with root package name */
        public int f2480j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2481k;

        /* renamed from: l  reason: collision with root package name */
        public int f2482l;
        public int m;

        /* renamed from: n  reason: collision with root package name */
        public int f2483n;

        /* renamed from: o  reason: collision with root package name */
        public int f2484o;

        public class a implements c0.b {
            public a() {
            }

            public final int a(View view) {
                m.this.getClass();
                return (view.getLeft() - m.B(view)) - ((n) view.getLayoutParams()).leftMargin;
            }

            public final int b() {
                return m.this.D();
            }

            public final int c() {
                m mVar = m.this;
                return mVar.f2483n - mVar.E();
            }

            public final View d(int i8) {
                return m.this.v(i8);
            }

            public final int e(View view) {
                m.this.getClass();
                return m.I(view) + view.getRight() + ((n) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements c0.b {
            public b() {
            }

            public final int a(View view) {
                m.this.getClass();
                return (view.getTop() - m.K(view)) - ((n) view.getLayoutParams()).topMargin;
            }

            public final int b() {
                return m.this.F();
            }

            public final int c() {
                m mVar = m.this;
                return mVar.f2484o - mVar.C();
            }

            public final View d(int i8) {
                return m.this.v(i8);
            }

            public final int e(View view) {
                m.this.getClass();
                return m.u(view) + view.getBottom() + ((n) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f2487a;

            /* renamed from: b  reason: collision with root package name */
            public int f2488b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f2489c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f2490d;
        }

        public m() {
            a aVar = new a();
            b bVar = new b();
            this.f2473c = new c0(aVar);
            this.f2474d = new c0(bVar);
        }

        public static int B(View view) {
            return ((n) view.getLayoutParams()).f2492b.left;
        }

        public static int G(View view) {
            return ((n) view.getLayoutParams()).a();
        }

        public static d H(Context context, AttributeSet attributeSet, int i8, int i10) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3.f1264d, i8, i10);
            dVar.f2487a = obtainStyledAttributes.getInt(0, 1);
            dVar.f2488b = obtainStyledAttributes.getInt(10, 1);
            dVar.f2489c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f2490d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int I(View view) {
            return ((n) view.getLayoutParams()).f2492b.right;
        }

        public static int K(View view) {
            return ((n) view.getLayoutParams()).f2492b.top;
        }

        public static boolean N(int i8, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (i11 > 0 && i8 != i11) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i8;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i8;
            }
            return true;
        }

        public static void O(View view, int i8, int i10, int i11, int i12) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f2492b;
            view.layout(i8 + rect.left + nVar.leftMargin, i10 + rect.top + nVar.topMargin, (i11 - rect.right) - nVar.rightMargin, (i12 - rect.bottom) - nVar.bottomMargin);
        }

        public static int g(int i8, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
        }

        public static int u(View view) {
            return ((n) view.getLayoutParams()).f2492b.bottom;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r6 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int x(boolean r4, int r5, int r6, int r7, int r8) {
            /*
                int r5 = r5 - r7
                r7 = 0
                int r5 = java.lang.Math.max(r7, r5)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x001a
                if (r8 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r8 != r1) goto L_0x002f
                if (r6 == r2) goto L_0x0020
                if (r6 == 0) goto L_0x002f
                if (r6 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r8 < 0) goto L_0x001e
            L_0x001c:
                r6 = r3
                goto L_0x0031
            L_0x001e:
                if (r8 != r1) goto L_0x0022
            L_0x0020:
                r8 = r5
                goto L_0x0031
            L_0x0022:
                if (r8 != r0) goto L_0x002f
                if (r6 == r2) goto L_0x002c
                if (r6 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r8 = r5
                r6 = r7
                goto L_0x0031
            L_0x002c:
                r8 = r5
                r6 = r2
                goto L_0x0031
            L_0x002f:
                r6 = r7
                r8 = r6
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.x(boolean, int, int, int, int):int");
        }

        public static void z(View view, Rect rect) {
            int[] iArr = RecyclerView.W0;
            n nVar = (n) view.getLayoutParams();
            Rect rect2 = nVar.f2492b;
            rect.set((view.getLeft() - rect2.left) - nVar.leftMargin, (view.getTop() - rect2.top) - nVar.topMargin, view.getRight() + rect2.right + nVar.rightMargin, view.getBottom() + rect2.bottom + nVar.bottomMargin);
        }

        public final int A() {
            RecyclerView recyclerView = this.f2472b;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            return i0.e.d(recyclerView);
        }

        public void A0(RecyclerView recyclerView, int i8) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final void B0(o oVar) {
            x xVar = this.f2475e;
            if (!(xVar == null || oVar == xVar || !xVar.f2515e)) {
                xVar.d();
            }
            this.f2475e = oVar;
            RecyclerView recyclerView = this.f2472b;
            a0 a0Var = recyclerView.A0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f2435c.abortAnimation();
            if (oVar.f2518h) {
                Log.w("RecyclerView", "An instance of " + oVar.getClass().getSimpleName() + " was started more than once. Each instance of" + oVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            oVar.f2512b = recyclerView;
            oVar.f2513c = this;
            int i8 = oVar.f2511a;
            if (i8 != -1) {
                recyclerView.D0.f2526a = i8;
                oVar.f2515e = true;
                oVar.f2514d = true;
                oVar.f2516f = recyclerView.I.q(i8);
                oVar.f2512b.A0.a();
                oVar.f2518h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final int C() {
            RecyclerView recyclerView = this.f2472b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean C0() {
            return false;
        }

        public final int D() {
            RecyclerView recyclerView = this.f2472b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int E() {
            RecyclerView recyclerView = this.f2472b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int F() {
            RecyclerView recyclerView = this.f2472b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int J(t tVar, y yVar) {
            return -1;
        }

        public final void L(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((n) view.getLayoutParams()).f2492b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.f2472b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f2472b.G;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean M() {
            return false;
        }

        public void P(int i8) {
            RecyclerView recyclerView = this.f2472b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2409e.e();
                for (int i10 = 0; i10 < e10; i10++) {
                    recyclerView.f2409e.d(i10).offsetLeftAndRight(i8);
                }
            }
        }

        public void Q(int i8) {
            RecyclerView recyclerView = this.f2472b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2409e.e();
                for (int i10 = 0; i10 < e10; i10++) {
                    recyclerView.f2409e.d(i10).offsetTopAndBottom(i8);
                }
            }
        }

        public void R() {
        }

        public void S(RecyclerView recyclerView) {
        }

        public View T(View view, int i8, t tVar, y yVar) {
            return null;
        }

        public void U(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2472b;
            t tVar = recyclerView.f2403b;
            y yVar = recyclerView.D0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f2472b.canScrollVertically(-1) && !this.f2472b.canScrollHorizontally(-1) && !this.f2472b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                e eVar = this.f2472b.H;
                if (eVar != null) {
                    accessibilityEvent.setItemCount(eVar.d());
                }
            }
        }

        public void V(t tVar, y yVar, e2.i iVar) {
            if (this.f2472b.canScrollVertically(-1) || this.f2472b.canScrollHorizontally(-1)) {
                iVar.a(8192);
                iVar.o(true);
            }
            if (this.f2472b.canScrollVertically(1) || this.f2472b.canScrollHorizontally(1)) {
                iVar.a(4096);
                iVar.o(true);
            }
            iVar.k(i.c.a(J(tVar, yVar), y(tVar, yVar), 0));
        }

        public final void W(View view, e2.i iVar) {
            b0 J = RecyclerView.J(view);
            if (J != null && !J.j() && !this.f2471a.j(J.f2440a)) {
                RecyclerView recyclerView = this.f2472b;
                X(recyclerView.f2403b, recyclerView.D0, view, iVar);
            }
        }

        public void X(t tVar, y yVar, View view, e2.i iVar) {
        }

        public void Y(int i8, int i10) {
        }

        public void Z() {
        }

        public void a0(int i8, int i10) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.view.View r9, int r10, boolean r11) {
            /*
                r8 = this;
                androidx.recyclerview.widget.RecyclerView$b0 r0 = androidx.recyclerview.widget.RecyclerView.J(r9)
                r1 = 0
                r2 = 1
                if (r11 != 0) goto L_0x0017
                boolean r11 = r0.j()
                if (r11 == 0) goto L_0x000f
                goto L_0x0017
            L_0x000f:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f2472b
                androidx.recyclerview.widget.d0 r11 = r11.B
                r11.c(r0)
                goto L_0x0031
            L_0x0017:
                androidx.recyclerview.widget.RecyclerView r11 = r8.f2472b
                androidx.recyclerview.widget.d0 r11 = r11.B
                o.f<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.d0$a> r11 = r11.f2609a
                java.lang.Object r3 = r11.getOrDefault(r0, r1)
                androidx.recyclerview.widget.d0$a r3 = (androidx.recyclerview.widget.d0.a) r3
                if (r3 != 0) goto L_0x002c
                androidx.recyclerview.widget.d0$a r3 = androidx.recyclerview.widget.d0.a.a()
                r11.put(r0, r3)
            L_0x002c:
                int r11 = r3.f2612a
                r11 = r11 | r2
                r3.f2612a = r11
            L_0x0031:
                android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$n r11 = (androidx.recyclerview.widget.RecyclerView.n) r11
                boolean r3 = r0.q()
                r4 = 0
                if (r3 != 0) goto L_0x012d
                boolean r3 = r0.k()
                if (r3 == 0) goto L_0x0046
                goto L_0x012d
            L_0x0046:
                android.view.ViewParent r3 = r9.getParent()
                androidx.recyclerview.widget.RecyclerView r5 = r8.f2472b
                r6 = -1
                if (r3 != r5) goto L_0x0108
                androidx.recyclerview.widget.d r3 = r8.f2471a
                androidx.recyclerview.widget.d$b r5 = r3.f2604a
                androidx.recyclerview.widget.w r5 = (androidx.recyclerview.widget.w) r5
                androidx.recyclerview.widget.RecyclerView r5 = r5.f2755a
                int r5 = r5.indexOfChild(r9)
                if (r5 != r6) goto L_0x005e
                goto L_0x0066
            L_0x005e:
                androidx.recyclerview.widget.d$a r3 = r3.f2605b
                boolean r7 = r3.d(r5)
                if (r7 == 0) goto L_0x0068
            L_0x0066:
                r5 = r6
                goto L_0x006d
            L_0x0068:
                int r3 = r3.b(r5)
                int r5 = r5 - r3
            L_0x006d:
                if (r10 != r6) goto L_0x0075
                androidx.recyclerview.widget.d r10 = r8.f2471a
                int r10 = r10.e()
            L_0x0075:
                if (r5 == r6) goto L_0x00e5
                if (r5 == r10) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = r8.f2472b
                androidx.recyclerview.widget.RecyclerView$m r9 = r9.I
                android.view.View r3 = r9.v(r5)
                if (r3 == 0) goto L_0x00c8
                r9.v(r5)
                androidx.recyclerview.widget.d r6 = r9.f2471a
                r6.c(r5)
                android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$n r5 = (androidx.recyclerview.widget.RecyclerView.n) r5
                androidx.recyclerview.widget.RecyclerView$b0 r6 = androidx.recyclerview.widget.RecyclerView.J(r3)
                boolean r7 = r6.j()
                if (r7 == 0) goto L_0x00b6
                androidx.recyclerview.widget.RecyclerView r7 = r9.f2472b
                androidx.recyclerview.widget.d0 r7 = r7.B
                o.f<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.d0$a> r7 = r7.f2609a
                java.lang.Object r1 = r7.getOrDefault(r6, r1)
                androidx.recyclerview.widget.d0$a r1 = (androidx.recyclerview.widget.d0.a) r1
                if (r1 != 0) goto L_0x00b0
                androidx.recyclerview.widget.d0$a r1 = androidx.recyclerview.widget.d0.a.a()
                r7.put(r6, r1)
            L_0x00b0:
                int r7 = r1.f2612a
                r2 = r2 | r7
                r1.f2612a = r2
                goto L_0x00bd
            L_0x00b6:
                androidx.recyclerview.widget.RecyclerView r1 = r9.f2472b
                androidx.recyclerview.widget.d0 r1 = r1.B
                r1.c(r6)
            L_0x00bd:
                androidx.recyclerview.widget.d r9 = r9.f2471a
                boolean r1 = r6.j()
                r9.b(r3, r10, r5, r1)
                goto L_0x0148
            L_0x00c8:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r0 = "Cannot move a child from non-existing index:"
                r11.<init>(r0)
                r11.append(r5)
                androidx.recyclerview.widget.RecyclerView r9 = r9.f2472b
                java.lang.String r9 = r9.toString()
                r11.append(r9)
                java.lang.String r9 = r11.toString()
                r10.<init>(r9)
                throw r10
            L_0x00e5:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
                r11.<init>(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r8.f2472b
                int r9 = r0.indexOfChild(r9)
                r11.append(r9)
                androidx.recyclerview.widget.RecyclerView r9 = r8.f2472b
                java.lang.String r9 = r9.z()
                r11.append(r9)
                java.lang.String r9 = r11.toString()
                r10.<init>(r9)
                throw r10
            L_0x0108:
                androidx.recyclerview.widget.d r1 = r8.f2471a
                r1.a(r9, r10, r4)
                r11.f2493c = r2
                androidx.recyclerview.widget.RecyclerView$x r10 = r8.f2475e
                if (r10 == 0) goto L_0x0148
                boolean r1 = r10.f2515e
                if (r1 == 0) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r1 = r10.f2512b
                r1.getClass()
                androidx.recyclerview.widget.RecyclerView$b0 r1 = androidx.recyclerview.widget.RecyclerView.J(r9)
                if (r1 == 0) goto L_0x0126
                int r6 = r1.d()
            L_0x0126:
                int r1 = r10.f2511a
                if (r6 != r1) goto L_0x0148
                r10.f2516f = r9
                goto L_0x0148
            L_0x012d:
                boolean r1 = r0.k()
                if (r1 == 0) goto L_0x0139
                androidx.recyclerview.widget.RecyclerView$t r1 = r0.f2452n
                r1.j(r0)
                goto L_0x013f
            L_0x0139:
                int r1 = r0.f2449j
                r1 = r1 & -33
                r0.f2449j = r1
            L_0x013f:
                androidx.recyclerview.widget.d r1 = r8.f2471a
                android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
                r1.b(r9, r10, r2, r4)
            L_0x0148:
                boolean r9 = r11.f2494d
                if (r9 == 0) goto L_0x0153
                android.view.View r9 = r0.f2440a
                r9.invalidate()
                r11.f2494d = r4
            L_0x0153:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.b(android.view.View, int, boolean):void");
        }

        public void b0(int i8, int i10) {
        }

        public void c(String str) {
            RecyclerView recyclerView = this.f2472b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void c0(int i8, int i10) {
        }

        public boolean d() {
            return false;
        }

        public void d0(t tVar, y yVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public boolean e() {
            return false;
        }

        public void e0(y yVar) {
        }

        public boolean f(n nVar) {
            return nVar != null;
        }

        public void f0(Parcelable parcelable) {
        }

        public Parcelable g0() {
            return null;
        }

        public void h(int i8, int i10, y yVar, c cVar) {
        }

        public void h0(int i8) {
        }

        public void i(int i8, c cVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x006a A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean i0(androidx.recyclerview.widget.RecyclerView.t r2, androidx.recyclerview.widget.RecyclerView.y r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f2472b
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x003e
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = r3
                r4 = r2
                goto L_0x0068
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0027
                int r2 = r1.f2484o
                int r5 = r1.F()
                int r2 = r2 - r5
                int r5 = r1.C()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x0028
            L_0x0027:
                r2 = r3
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f2472b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0067
                int r4 = r1.f2483n
                int r5 = r1.D()
                int r4 = r4 - r5
                int r5 = r1.E()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x0068
            L_0x003e:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0051
                int r2 = r1.f2484o
                int r4 = r1.F()
                int r2 = r2 - r4
                int r4 = r1.C()
                int r2 = r2 - r4
                goto L_0x0052
            L_0x0051:
                r2 = r3
            L_0x0052:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f2472b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0067
                int r4 = r1.f2483n
                int r5 = r1.D()
                int r4 = r4 - r5
                int r5 = r1.E()
                int r4 = r4 - r5
                goto L_0x0068
            L_0x0067:
                r4 = r3
            L_0x0068:
                if (r2 != 0) goto L_0x006d
                if (r4 != 0) goto L_0x006d
                return r3
            L_0x006d:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f2472b
                r3.b0(r4, r2, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.i0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y, int, android.os.Bundle):boolean");
        }

        public int j(y yVar) {
            return 0;
        }

        public final void j0(t tVar) {
            int w10 = w();
            while (true) {
                w10--;
                if (w10 < 0) {
                    return;
                }
                if (!RecyclerView.J(v(w10)).p()) {
                    View v3 = v(w10);
                    m0(w10);
                    tVar.f(v3);
                }
            }
        }

        public int k(y yVar) {
            return 0;
        }

        public final void k0(t tVar) {
            ArrayList<b0> arrayList;
            int size = tVar.f2501a.size();
            int i8 = size - 1;
            while (true) {
                arrayList = tVar.f2501a;
                if (i8 < 0) {
                    break;
                }
                View view = arrayList.get(i8).f2440a;
                b0 J = RecyclerView.J(view);
                if (!J.p()) {
                    J.o(false);
                    if (J.l()) {
                        this.f2472b.removeDetachedView(view, false);
                    }
                    j jVar = this.f2472b.f2417l0;
                    if (jVar != null) {
                        jVar.h(J);
                    }
                    J.o(true);
                    b0 J2 = RecyclerView.J(view);
                    J2.f2452n = null;
                    J2.f2453o = false;
                    J2.f2449j &= -33;
                    tVar.g(J2);
                }
                i8--;
            }
            arrayList.clear();
            ArrayList<b0> arrayList2 = tVar.f2502b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f2472b.invalidate();
            }
        }

        public int l(y yVar) {
            return 0;
        }

        public final void l0(View view, t tVar) {
            d dVar = this.f2471a;
            w wVar = (w) dVar.f2604a;
            int indexOfChild = wVar.f2755a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (dVar.f2605b.f(indexOfChild)) {
                    dVar.k(view);
                }
                wVar.b(indexOfChild);
            }
            tVar.f(view);
        }

        public int m(y yVar) {
            return 0;
        }

        public final void m0(int i8) {
            if (v(i8) != null) {
                d dVar = this.f2471a;
                int f10 = dVar.f(i8);
                w wVar = (w) dVar.f2604a;
                View childAt = wVar.f2755a.getChildAt(f10);
                if (childAt != null) {
                    if (dVar.f2605b.f(f10)) {
                        dVar.k(childAt);
                    }
                    wVar.b(f10);
                }
            }
        }

        public int n(y yVar) {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
            if (r10 == false) goto L_0x00b0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean n0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.D()
                int r1 = r8.F()
                int r2 = r8.f2483n
                int r3 = r8.E()
                int r2 = r2 - r3
                int r3 = r8.f2484o
                int r4 = r8.C()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.A()
                r7 = 1
                if (r3 != r7) goto L_0x005c
                if (r2 == 0) goto L_0x0057
                goto L_0x0064
            L_0x0057:
                int r2 = java.lang.Math.max(r6, r10)
                goto L_0x0064
            L_0x005c:
                if (r6 == 0) goto L_0x005f
                goto L_0x0063
            L_0x005f:
                int r6 = java.lang.Math.min(r4, r2)
            L_0x0063:
                r2 = r6
            L_0x0064:
                if (r1 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                int r1 = java.lang.Math.min(r5, r11)
            L_0x006b:
                if (r13 == 0) goto L_0x00ab
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L_0x0074
                goto L_0x00a8
            L_0x0074:
                int r11 = r8.D()
                int r13 = r8.F()
                int r3 = r8.f2483n
                int r4 = r8.E()
                int r3 = r3 - r4
                int r4 = r8.f2484o
                int r5 = r8.C()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f2472b
                android.graphics.Rect r5 = r5.E
                z(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto L_0x00a8
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto L_0x00a8
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto L_0x00a8
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto L_0x00a6
                goto L_0x00a8
            L_0x00a6:
                r10 = r7
                goto L_0x00a9
            L_0x00a8:
                r10 = r0
            L_0x00a9:
                if (r10 == 0) goto L_0x00b0
            L_0x00ab:
                if (r2 != 0) goto L_0x00b1
                if (r1 == 0) goto L_0x00b0
                goto L_0x00b1
            L_0x00b0:
                return r0
            L_0x00b1:
                if (r12 == 0) goto L_0x00b7
                r9.scrollBy(r2, r1)
                goto L_0x00ba
            L_0x00b7:
                r9.b0(r2, r1, r0)
            L_0x00ba:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.n0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public int o(y yVar) {
            return 0;
        }

        public final void o0() {
            RecyclerView recyclerView = this.f2472b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public final void p(t tVar) {
            int w10 = w();
            while (true) {
                w10--;
                if (w10 >= 0) {
                    View v3 = v(w10);
                    b0 J = RecyclerView.J(v3);
                    if (!J.p()) {
                        if (!J.h() || J.j() || this.f2472b.H.f2460b) {
                            v(w10);
                            this.f2471a.c(w10);
                            tVar.h(v3);
                            this.f2472b.B.c(J);
                        } else {
                            m0(w10);
                            tVar.g(J);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public int p0(int i8, t tVar, y yVar) {
            return 0;
        }

        public View q(int i8) {
            int w10 = w();
            for (int i10 = 0; i10 < w10; i10++) {
                View v3 = v(i10);
                b0 J = RecyclerView.J(v3);
                if (J != null && J.d() == i8 && !J.p() && (this.f2472b.D0.f2532g || !J.j())) {
                    return v3;
                }
            }
            return null;
        }

        public void q0(int i8) {
        }

        public abstract n r();

        public int r0(int i8, t tVar, y yVar) {
            return 0;
        }

        public n s(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public final void s0(RecyclerView recyclerView) {
            t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public n t(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof n ? new n((n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        public final void t0(int i8, int i10) {
            this.f2483n = View.MeasureSpec.getSize(i8);
            int mode = View.MeasureSpec.getMode(i8);
            this.f2482l = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.W0;
            }
            this.f2484o = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.m = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.W0;
            }
        }

        public void u0(Rect rect, int i8, int i10) {
            int E = E() + D() + rect.width();
            int C = C() + F() + rect.height();
            RecyclerView recyclerView = this.f2472b;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            this.f2472b.setMeasuredDimension(g(i8, E, i0.d.e(recyclerView)), g(i10, C, i0.d.d(this.f2472b)));
        }

        public final View v(int i8) {
            d dVar = this.f2471a;
            if (dVar != null) {
                return dVar.d(i8);
            }
            return null;
        }

        public final void v0(int i8, int i10) {
            int w10 = w();
            if (w10 == 0) {
                this.f2472b.n(i8, i10);
                return;
            }
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < w10; i15++) {
                View v3 = v(i15);
                Rect rect = this.f2472b.E;
                z(v3, rect);
                int i16 = rect.left;
                if (i16 < i14) {
                    i14 = i16;
                }
                int i17 = rect.right;
                if (i17 > i11) {
                    i11 = i17;
                }
                int i18 = rect.top;
                if (i18 < i12) {
                    i12 = i18;
                }
                int i19 = rect.bottom;
                if (i19 > i13) {
                    i13 = i19;
                }
            }
            this.f2472b.E.set(i14, i12, i11, i13);
            u0(this.f2472b.E, i8, i10);
        }

        public final int w() {
            d dVar = this.f2471a;
            if (dVar != null) {
                return dVar.e();
            }
            return 0;
        }

        public final void w0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f2472b = null;
                this.f2471a = null;
                this.f2483n = 0;
                this.f2484o = 0;
            } else {
                this.f2472b = recyclerView;
                this.f2471a = recyclerView.f2409e;
                this.f2483n = recyclerView.getWidth();
                this.f2484o = recyclerView.getHeight();
            }
            this.f2482l = 1073741824;
            this.m = 1073741824;
        }

        public final boolean x0(View view, int i8, int i10, n nVar) {
            return view.isLayoutRequested() || !this.f2478h || !N(view.getWidth(), i8, nVar.width) || !N(view.getHeight(), i10, nVar.height);
        }

        public int y(t tVar, y yVar) {
            return -1;
        }

        public boolean y0() {
            return false;
        }

        public final boolean z0(View view, int i8, int i10, n nVar) {
            return !this.f2478h || !N(view.getMeasuredWidth(), i8, nVar.width) || !N(view.getMeasuredHeight(), i10, nVar.height);
        }
    }

    public interface o {
        void a();

        void b(View view);
    }

    public static abstract class p {
    }

    public interface q {
        void a(MotionEvent motionEvent);

        void b();

        boolean c(MotionEvent motionEvent);
    }

    public static abstract class r {
        public void a(int i8, RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i8, int i10) {
        }
    }

    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f2495a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2496b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<b0> f2497a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final int f2498b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f2499c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f2500d = 0;
        }

        public final a a(int i8) {
            SparseArray<a> sparseArray = this.f2495a;
            a aVar = sparseArray.get(i8);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i8, aVar2);
            return aVar2;
        }
    }

    public final class t {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<b0> f2501a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b0> f2502b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<b0> f2503c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<b0> f2504d;

        /* renamed from: e  reason: collision with root package name */
        public int f2505e;

        /* renamed from: f  reason: collision with root package name */
        public int f2506f;

        /* renamed from: g  reason: collision with root package name */
        public s f2507g;

        public t() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.f2501a = arrayList;
            this.f2504d = Collections.unmodifiableList(arrayList);
            this.f2505e = 2;
            this.f2506f = 2;
        }

        public final void a(b0 b0Var, boolean z10) {
            RecyclerView.j(b0Var);
            RecyclerView recyclerView = RecyclerView.this;
            y yVar = recyclerView.K0;
            if (yVar != null) {
                y.a aVar = yVar.f2758e;
                boolean z11 = aVar instanceof y.a;
                View view = b0Var.f2440a;
                i0.n(view, z11 ? (d2.a) aVar.f2760e.remove(view) : null);
            }
            if (z10) {
                u uVar = recyclerView.J;
                if (uVar != null) {
                    uVar.a();
                }
                ArrayList arrayList = recyclerView.K;
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((u) arrayList.get(i8)).a();
                }
                e eVar = recyclerView.H;
                if (eVar != null) {
                    eVar.n(b0Var);
                }
                if (recyclerView.D0 != null) {
                    recyclerView.B.d(b0Var);
                }
            }
            b0Var.f2457s = null;
            b0Var.f2456r = null;
            s c3 = c();
            c3.getClass();
            int i10 = b0Var.f2445f;
            ArrayList<b0> arrayList2 = c3.a(i10).f2497a;
            if (c3.f2495a.get(i10).f2498b > arrayList2.size()) {
                b0Var.n();
                arrayList2.add(b0Var);
            }
        }

        public final int b(int i8) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i8 >= 0 && i8 < recyclerView.D0.b()) {
                return !recyclerView.D0.f2532g ? i8 : recyclerView.f2407d.f(i8, 0);
            }
            StringBuilder b10 = a1.b("invalid position ", i8, ". State item count is ");
            b10.append(recyclerView.D0.b());
            b10.append(recyclerView.z());
            throw new IndexOutOfBoundsException(b10.toString());
        }

        public final s c() {
            if (this.f2507g == null) {
                this.f2507g = new s();
            }
            return this.f2507g;
        }

        public final void d() {
            ArrayList<b0> arrayList = this.f2503c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                e(size);
            }
            arrayList.clear();
            int[] iArr = RecyclerView.W0;
            m.b bVar = RecyclerView.this.C0;
            int[] iArr2 = bVar.f2725c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f2726d = 0;
        }

        public final void e(int i8) {
            ArrayList<b0> arrayList = this.f2503c;
            a(arrayList.get(i8), true);
            arrayList.remove(i8);
        }

        public final void f(View view) {
            b0 J = RecyclerView.J(view);
            boolean l10 = J.l();
            RecyclerView recyclerView = RecyclerView.this;
            if (l10) {
                recyclerView.removeDetachedView(view, false);
            }
            if (J.k()) {
                J.f2452n.j(J);
            } else if (J.q()) {
                J.f2449j &= -33;
            }
            g(J);
            if (recyclerView.f2417l0 != null && !J.i()) {
                recyclerView.f2417l0.h(J);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void g(androidx.recyclerview.widget.RecyclerView.b0 r12) {
            /*
                r11 = this;
                boolean r0 = r12.k()
                r1 = 0
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                r3 = 1
                android.view.View r4 = r12.f2440a
                if (r0 != 0) goto L_0x0105
                android.view.ViewParent r0 = r4.getParent()
                if (r0 == 0) goto L_0x0014
                goto L_0x0105
            L_0x0014:
                boolean r0 = r12.l()
                if (r0 != 0) goto L_0x00ea
                boolean r0 = r12.p()
                if (r0 != 0) goto L_0x00d2
                int r0 = r12.f2449j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                java.util.WeakHashMap<android.view.View, d2.d1> r0 = d2.i0.f7217a
                boolean r0 = d2.i0.d.i(r4)
                if (r0 == 0) goto L_0x0030
                r0 = r3
                goto L_0x0031
            L_0x0030:
                r0 = r1
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView$e r4 = r2.H
                if (r4 == 0) goto L_0x003f
                if (r0 == 0) goto L_0x003f
                boolean r4 = r4.l(r12)
                if (r4 == 0) goto L_0x003f
                r4 = r3
                goto L_0x0040
            L_0x003f:
                r4 = r1
            L_0x0040:
                if (r4 != 0) goto L_0x004c
                boolean r4 = r12.i()
                if (r4 == 0) goto L_0x0049
                goto L_0x004c
            L_0x0049:
                r3 = r1
                goto L_0x00c1
            L_0x004c:
                int r4 = r11.f2506f
                if (r4 <= 0) goto L_0x00b8
                int r4 = r12.f2449j
                r4 = r4 & 526(0x20e, float:7.37E-43)
                if (r4 == 0) goto L_0x0058
                r4 = r3
                goto L_0x0059
            L_0x0058:
                r4 = r1
            L_0x0059:
                if (r4 != 0) goto L_0x00b8
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r4 = r11.f2503c
                int r5 = r4.size()
                int r6 = r11.f2506f
                if (r5 < r6) goto L_0x006c
                if (r5 <= 0) goto L_0x006c
                r11.e(r1)
                int r5 = r5 + -1
            L_0x006c:
                int[] r6 = androidx.recyclerview.widget.RecyclerView.W0
                if (r5 <= 0) goto L_0x00b3
                int r6 = r12.f2442c
                androidx.recyclerview.widget.m$b r7 = r2.C0
                int[] r8 = r7.f2725c
                if (r8 == 0) goto L_0x008a
                int r8 = r7.f2726d
                int r8 = r8 * 2
                r9 = r1
            L_0x007d:
                if (r9 >= r8) goto L_0x008a
                int[] r10 = r7.f2725c
                r10 = r10[r9]
                if (r10 != r6) goto L_0x0087
                r6 = r3
                goto L_0x008b
            L_0x0087:
                int r9 = r9 + 2
                goto L_0x007d
            L_0x008a:
                r6 = r1
            L_0x008b:
                if (r6 != 0) goto L_0x00b3
            L_0x008d:
                int r5 = r5 + -1
                if (r5 < 0) goto L_0x00b2
                java.lang.Object r6 = r4.get(r5)
                androidx.recyclerview.widget.RecyclerView$b0 r6 = (androidx.recyclerview.widget.RecyclerView.b0) r6
                int r6 = r6.f2442c
                int[] r8 = r7.f2725c
                if (r8 == 0) goto L_0x00af
                int r8 = r7.f2726d
                int r8 = r8 * 2
                r9 = r1
            L_0x00a2:
                if (r9 >= r8) goto L_0x00af
                int[] r10 = r7.f2725c
                r10 = r10[r9]
                if (r10 != r6) goto L_0x00ac
                r6 = r3
                goto L_0x00b0
            L_0x00ac:
                int r9 = r9 + 2
                goto L_0x00a2
            L_0x00af:
                r6 = r1
            L_0x00b0:
                if (r6 != 0) goto L_0x008d
            L_0x00b2:
                int r5 = r5 + r3
            L_0x00b3:
                r4.add(r5, r12)
                r4 = r3
                goto L_0x00b9
            L_0x00b8:
                r4 = r1
            L_0x00b9:
                if (r4 != 0) goto L_0x00bf
                r11.a(r12, r3)
                r1 = r3
            L_0x00bf:
                r3 = r1
                r1 = r4
            L_0x00c1:
                androidx.recyclerview.widget.d0 r2 = r2.B
                r2.d(r12)
                if (r1 != 0) goto L_0x00d1
                if (r3 != 0) goto L_0x00d1
                if (r0 == 0) goto L_0x00d1
                r0 = 0
                r12.f2457s = r0
                r12.f2456r = r0
            L_0x00d1:
                return
            L_0x00d2:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                r0.<init>(r1)
                java.lang.String r1 = r2.z()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r12.<init>(r0)
                throw r12
            L_0x00ea:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.<init>(r3)
                r1.append(r12)
                java.lang.String r12 = r2.z()
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                r0.<init>(r12)
                throw r0
            L_0x0105:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Scrapped or attached views may not be recycled. isScrap:"
                r5.<init>(r6)
                boolean r12 = r12.k()
                r5.append(r12)
                java.lang.String r12 = " isAttached:"
                r5.append(r12)
                android.view.ViewParent r12 = r4.getParent()
                if (r12 == 0) goto L_0x0121
                r1 = r3
            L_0x0121:
                r5.append(r1)
                java.lang.String r12 = r2.z()
                r5.append(r12)
                java.lang.String r12 = r5.toString()
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.g(androidx.recyclerview.widget.RecyclerView$b0):void");
        }

        public final void h(View view) {
            b0 J = RecyclerView.J(view);
            int i8 = J.f2449j;
            boolean z10 = (i8 & 12) != 0;
            RecyclerView recyclerView = RecyclerView.this;
            if (!z10) {
                if ((i8 & 2) != 0) {
                    j jVar = recyclerView.f2417l0;
                    if (!(jVar == null || jVar.f(J, J.e()))) {
                        if (this.f2502b == null) {
                            this.f2502b = new ArrayList<>();
                        }
                        J.f2452n = this;
                        J.f2453o = true;
                        this.f2502b.add(J);
                        return;
                    }
                }
            }
            if (!J.h() || J.j() || recyclerView.H.f2460b) {
                J.f2452n = this;
                J.f2453o = false;
                this.f2501a.add(J);
                return;
            }
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.z());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:231:0x041a, code lost:
            if (r8.h() == false) goto L_0x041d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x0234  */
        /* JADX WARNING: Removed duplicated region for block: B:212:0x03d4  */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x03d6  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x03d9  */
        /* JADX WARNING: Removed duplicated region for block: B:222:0x0403  */
        /* JADX WARNING: Removed duplicated region for block: B:223:0x0406  */
        /* JADX WARNING: Removed duplicated region for block: B:297:0x0531  */
        /* JADX WARNING: Removed duplicated region for block: B:298:0x053b  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0142  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.b0 i(int r19, long r20) {
            /*
                r18 = this;
                r1 = r18
                r0 = r19
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                if (r0 < 0) goto L_0x0558
                androidx.recyclerview.widget.RecyclerView$y r3 = r2.D0
                int r3 = r3.b()
                if (r0 >= r3) goto L_0x0558
                androidx.recyclerview.widget.RecyclerView$y r3 = r2.D0
                boolean r4 = r3.f2532g
                r5 = 0
                r6 = 32
                if (r4 == 0) goto L_0x0082
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r4 = r1.f2502b
                if (r4 == 0) goto L_0x007d
                int r4 = r4.size()
                if (r4 != 0) goto L_0x0024
                goto L_0x007d
            L_0x0024:
                r7 = r5
            L_0x0025:
                if (r7 >= r4) goto L_0x0042
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r8 = r1.f2502b
                java.lang.Object r8 = r8.get(r7)
                androidx.recyclerview.widget.RecyclerView$b0 r8 = (androidx.recyclerview.widget.RecyclerView.b0) r8
                boolean r9 = r8.q()
                if (r9 != 0) goto L_0x003f
                int r9 = r8.d()
                if (r9 != r0) goto L_0x003f
                r8.b(r6)
                goto L_0x007e
            L_0x003f:
                int r7 = r7 + 1
                goto L_0x0025
            L_0x0042:
                androidx.recyclerview.widget.RecyclerView$e r7 = r2.H
                boolean r7 = r7.f2460b
                if (r7 == 0) goto L_0x007d
                androidx.recyclerview.widget.a r7 = r2.f2407d
                int r7 = r7.f(r0, r5)
                if (r7 <= 0) goto L_0x007d
                androidx.recyclerview.widget.RecyclerView$e r8 = r2.H
                int r8 = r8.d()
                if (r7 >= r8) goto L_0x007d
                androidx.recyclerview.widget.RecyclerView$e r8 = r2.H
                long r7 = r8.e(r7)
                r9 = r5
            L_0x005f:
                if (r9 >= r4) goto L_0x007d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r10 = r1.f2502b
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$b0 r10 = (androidx.recyclerview.widget.RecyclerView.b0) r10
                boolean r11 = r10.q()
                if (r11 != 0) goto L_0x007a
                long r11 = r10.f2444e
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 != 0) goto L_0x007a
                r10.b(r6)
                r8 = r10
                goto L_0x007e
            L_0x007a:
                int r9 = r9 + 1
                goto L_0x005f
            L_0x007d:
                r8 = 0
            L_0x007e:
                if (r8 == 0) goto L_0x0083
                r4 = 1
                goto L_0x0084
            L_0x0082:
                r8 = 0
            L_0x0083:
                r4 = r5
            L_0x0084:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r7 = r1.f2503c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r9 = r1.f2501a
                r10 = -1
                if (r8 != 0) goto L_0x0231
                int r8 = r9.size()
                r11 = r5
            L_0x0090:
                if (r11 >= r8) goto L_0x00bd
                java.lang.Object r12 = r9.get(r11)
                androidx.recyclerview.widget.RecyclerView$b0 r12 = (androidx.recyclerview.widget.RecyclerView.b0) r12
                boolean r13 = r12.q()
                if (r13 != 0) goto L_0x00ba
                int r13 = r12.d()
                if (r13 != r0) goto L_0x00ba
                boolean r13 = r12.h()
                if (r13 != 0) goto L_0x00ba
                boolean r13 = r3.f2532g
                if (r13 != 0) goto L_0x00b4
                boolean r13 = r12.j()
                if (r13 != 0) goto L_0x00ba
            L_0x00b4:
                r12.b(r6)
                r8 = r12
                goto L_0x01ae
            L_0x00ba:
                int r11 = r11 + 1
                goto L_0x0090
            L_0x00bd:
                androidx.recyclerview.widget.d r8 = r2.f2409e
                java.util.ArrayList r11 = r8.f2606c
                int r12 = r11.size()
                r13 = r5
            L_0x00c6:
                if (r13 >= r12) goto L_0x00f1
                java.lang.Object r14 = r11.get(r13)
                android.view.View r14 = (android.view.View) r14
                androidx.recyclerview.widget.d$b r15 = r8.f2604a
                androidx.recyclerview.widget.w r15 = (androidx.recyclerview.widget.w) r15
                r15.getClass()
                androidx.recyclerview.widget.RecyclerView$b0 r15 = androidx.recyclerview.widget.RecyclerView.J(r14)
                int r6 = r15.d()
                if (r6 != r0) goto L_0x00ec
                boolean r6 = r15.h()
                if (r6 != 0) goto L_0x00ec
                boolean r6 = r15.j()
                if (r6 != 0) goto L_0x00ec
                goto L_0x00f2
            L_0x00ec:
                int r13 = r13 + 1
                r6 = 32
                goto L_0x00c6
            L_0x00f1:
                r14 = 0
            L_0x00f2:
                if (r14 == 0) goto L_0x0185
                androidx.recyclerview.widget.RecyclerView$b0 r6 = androidx.recyclerview.widget.RecyclerView.J(r14)
                androidx.recyclerview.widget.d r8 = r2.f2409e
                androidx.recyclerview.widget.d$b r11 = r8.f2604a
                androidx.recyclerview.widget.w r11 = (androidx.recyclerview.widget.w) r11
                androidx.recyclerview.widget.RecyclerView r11 = r11.f2755a
                int r11 = r11.indexOfChild(r14)
                if (r11 < 0) goto L_0x0171
                androidx.recyclerview.widget.d$a r12 = r8.f2605b
                boolean r13 = r12.d(r11)
                if (r13 == 0) goto L_0x015d
                r12.a(r11)
                r8.k(r14)
                androidx.recyclerview.widget.d r8 = r2.f2409e
                androidx.recyclerview.widget.d$b r11 = r8.f2604a
                androidx.recyclerview.widget.w r11 = (androidx.recyclerview.widget.w) r11
                androidx.recyclerview.widget.RecyclerView r11 = r11.f2755a
                int r11 = r11.indexOfChild(r14)
                if (r11 != r10) goto L_0x0123
                goto L_0x012b
            L_0x0123:
                androidx.recyclerview.widget.d$a r8 = r8.f2605b
                boolean r12 = r8.d(r11)
                if (r12 == 0) goto L_0x012d
            L_0x012b:
                r11 = r10
                goto L_0x0132
            L_0x012d:
                int r8 = r8.b(r11)
                int r11 = r11 - r8
            L_0x0132:
                if (r11 == r10) goto L_0x0142
                androidx.recyclerview.widget.d r8 = r2.f2409e
                r8.c(r11)
                r1.h(r14)
                r8 = 8224(0x2020, float:1.1524E-41)
                r6.b(r8)
                goto L_0x01ad
            L_0x0142:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "layout index should not be -1 after unhiding a view:"
                r3.<init>(r4)
                r3.append(r6)
                java.lang.String r2 = r2.z()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x015d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.<init>(r3)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0171:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.<init>(r3)
                r2.append(r14)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0185:
                int r6 = r7.size()
                r8 = r5
            L_0x018a:
                if (r8 >= r6) goto L_0x01ac
                java.lang.Object r11 = r7.get(r8)
                androidx.recyclerview.widget.RecyclerView$b0 r11 = (androidx.recyclerview.widget.RecyclerView.b0) r11
                boolean r12 = r11.h()
                if (r12 != 0) goto L_0x01a9
                int r12 = r11.d()
                if (r12 != r0) goto L_0x01a9
                boolean r12 = r11.f()
                if (r12 != 0) goto L_0x01a9
                r7.remove(r8)
                r8 = r11
                goto L_0x01ae
            L_0x01a9:
                int r8 = r8 + 1
                goto L_0x018a
            L_0x01ac:
                r6 = 0
            L_0x01ad:
                r8 = r6
            L_0x01ae:
                if (r8 == 0) goto L_0x0231
                boolean r6 = r8.j()
                if (r6 == 0) goto L_0x01b9
                boolean r6 = r3.f2532g
                goto L_0x01ec
            L_0x01b9:
                int r6 = r8.f2442c
                if (r6 < 0) goto L_0x0216
                androidx.recyclerview.widget.RecyclerView$e r11 = r2.H
                int r11 = r11.d()
                if (r6 >= r11) goto L_0x0216
                boolean r6 = r3.f2532g
                if (r6 != 0) goto L_0x01d6
                androidx.recyclerview.widget.RecyclerView$e r6 = r2.H
                int r11 = r8.f2442c
                int r6 = r6.f(r11)
                int r11 = r8.f2445f
                if (r6 == r11) goto L_0x01d6
                goto L_0x01e9
            L_0x01d6:
                androidx.recyclerview.widget.RecyclerView$e r6 = r2.H
                boolean r11 = r6.f2460b
                if (r11 == 0) goto L_0x01eb
                long r11 = r8.f2444e
                int r13 = r8.f2442c
                long r13 = r6.e(r13)
                int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r6 != 0) goto L_0x01e9
                goto L_0x01eb
            L_0x01e9:
                r6 = r5
                goto L_0x01ec
            L_0x01eb:
                r6 = 1
            L_0x01ec:
                if (r6 != 0) goto L_0x0214
                r6 = 4
                r8.b(r6)
                boolean r6 = r8.k()
                if (r6 == 0) goto L_0x0203
                android.view.View r6 = r8.f2440a
                r2.removeDetachedView(r6, r5)
                androidx.recyclerview.widget.RecyclerView$t r6 = r8.f2452n
                r6.j(r8)
                goto L_0x020f
            L_0x0203:
                boolean r6 = r8.q()
                if (r6 == 0) goto L_0x020f
                int r6 = r8.f2449j
                r6 = r6 & -33
                r8.f2449j = r6
            L_0x020f:
                r1.g(r8)
                r8 = 0
                goto L_0x0231
            L_0x0214:
                r4 = 1
                goto L_0x0231
            L_0x0216:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Inconsistency detected. Invalid view holder adapter position"
                r3.<init>(r4)
                r3.append(r8)
                java.lang.String r2 = r2.z()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x0231:
                r6 = 2
                if (r8 != 0) goto L_0x03c8
                androidx.recyclerview.widget.a r15 = r2.f2407d
                int r5 = r15.f(r0, r5)
                if (r5 < 0) goto L_0x0399
                androidx.recyclerview.widget.RecyclerView$e r15 = r2.H
                int r15 = r15.d()
                if (r5 >= r15) goto L_0x0399
                androidx.recyclerview.widget.RecyclerView$e r15 = r2.H
                int r15 = r15.f(r5)
                androidx.recyclerview.widget.RecyclerView$e r13 = r2.H
                boolean r14 = r13.f2460b
                if (r14 == 0) goto L_0x02d6
                long r13 = r13.e(r5)
                int r8 = r9.size()
                int r8 = r8 + r10
            L_0x0259:
                if (r8 < 0) goto L_0x02a9
                java.lang.Object r10 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$b0 r10 = (androidx.recyclerview.widget.RecyclerView.b0) r10
                long r11 = r10.f2444e
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 != 0) goto L_0x02a6
                boolean r11 = r10.q()
                if (r11 != 0) goto L_0x02a6
                int r11 = r10.f2445f
                if (r15 != r11) goto L_0x0289
                r11 = 32
                r10.b(r11)
                boolean r7 = r10.j()
                if (r7 == 0) goto L_0x0287
                boolean r7 = r3.f2532g
                if (r7 != 0) goto L_0x0287
                int r7 = r10.f2449j
                r7 = r7 & -15
                r7 = r7 | r6
                r10.f2449j = r7
            L_0x0287:
                r8 = r10
                goto L_0x02d1
            L_0x0289:
                r11 = 32
                r9.remove(r8)
                android.view.View r10 = r10.f2440a
                r12 = 0
                r2.removeDetachedView(r10, r12)
                androidx.recyclerview.widget.RecyclerView$b0 r10 = androidx.recyclerview.widget.RecyclerView.J(r10)
                r11 = 0
                r10.f2452n = r11
                r10.f2453o = r12
                int r11 = r10.f2449j
                r11 = r11 & -33
                r10.f2449j = r11
                r1.g(r10)
            L_0x02a6:
                int r8 = r8 + -1
                goto L_0x0259
            L_0x02a9:
                int r8 = r7.size()
            L_0x02ad:
                int r8 = r8 + -1
                if (r8 < 0) goto L_0x02cf
                java.lang.Object r9 = r7.get(r8)
                androidx.recyclerview.widget.RecyclerView$b0 r9 = (androidx.recyclerview.widget.RecyclerView.b0) r9
                long r10 = r9.f2444e
                int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
                if (r10 != 0) goto L_0x02ad
                boolean r10 = r9.f()
                if (r10 != 0) goto L_0x02ad
                int r10 = r9.f2445f
                if (r15 != r10) goto L_0x02cc
                r7.remove(r8)
                r8 = r9
                goto L_0x02d1
            L_0x02cc:
                r1.e(r8)
            L_0x02cf:
                r7 = 0
                r8 = r7
            L_0x02d1:
                if (r8 == 0) goto L_0x02d6
                r8.f2442c = r5
                r4 = 1
            L_0x02d6:
                if (r8 != 0) goto L_0x0312
                androidx.recyclerview.widget.RecyclerView$s r5 = r18.c()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$s$a> r5 = r5.f2495a
                java.lang.Object r5 = r5.get(r15)
                androidx.recyclerview.widget.RecyclerView$s$a r5 = (androidx.recyclerview.widget.RecyclerView.s.a) r5
                if (r5 == 0) goto L_0x0309
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r5.f2497a
                boolean r7 = r5.isEmpty()
                if (r7 != 0) goto L_0x0309
                int r7 = r5.size()
            L_0x02f2:
                int r7 = r7 + -1
                if (r7 < 0) goto L_0x0309
                java.lang.Object r8 = r5.get(r7)
                androidx.recyclerview.widget.RecyclerView$b0 r8 = (androidx.recyclerview.widget.RecyclerView.b0) r8
                boolean r8 = r8.f()
                if (r8 != 0) goto L_0x02f2
                java.lang.Object r5 = r5.remove(r7)
                androidx.recyclerview.widget.RecyclerView$b0 r5 = (androidx.recyclerview.widget.RecyclerView.b0) r5
                goto L_0x030a
            L_0x0309:
                r5 = 0
            L_0x030a:
                if (r5 == 0) goto L_0x0311
                r5.n()
                int[] r7 = androidx.recyclerview.widget.RecyclerView.W0
            L_0x0311:
                r8 = r5
            L_0x0312:
                if (r8 != 0) goto L_0x03c8
                long r7 = r2.getNanoTime()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
                if (r5 == 0) goto L_0x033c
                androidx.recyclerview.widget.RecyclerView$s r5 = r1.f2507g
                androidx.recyclerview.widget.RecyclerView$s$a r5 = r5.a(r15)
                long r9 = r5.f2499c
                r11 = 0
                int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0337
                long r9 = r9 + r7
                int r5 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
                if (r5 >= 0) goto L_0x0335
                goto L_0x0337
            L_0x0335:
                r5 = 0
                goto L_0x0338
            L_0x0337:
                r5 = 1
            L_0x0338:
                if (r5 != 0) goto L_0x033c
                r0 = 0
                return r0
            L_0x033c:
                androidx.recyclerview.widget.RecyclerView$e r5 = r2.H
                r5.getClass()
                java.lang.String r9 = "RV CreateView"
                int r10 = y1.k.f17122a     // Catch:{ all -> 0x0392 }
                y1.k.a.a(r9)     // Catch:{ all -> 0x0392 }
                androidx.recyclerview.widget.RecyclerView$b0 r5 = r5.j(r2, r15)     // Catch:{ all -> 0x0392 }
                android.view.View r9 = r5.f2440a     // Catch:{ all -> 0x0392 }
                android.view.ViewParent r9 = r9.getParent()     // Catch:{ all -> 0x0392 }
                if (r9 != 0) goto L_0x038a
                r5.f2445f = r15     // Catch:{ all -> 0x0392 }
                y1.k.a.b()
                int[] r9 = androidx.recyclerview.widget.RecyclerView.W0
                android.view.View r9 = r5.f2440a
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.E(r9)
                if (r9 == 0) goto L_0x036a
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r9)
                r5.f2441b = r10
            L_0x036a:
                long r9 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$s r11 = r1.f2507g
                long r9 = r9 - r7
                androidx.recyclerview.widget.RecyclerView$s$a r7 = r11.a(r15)
                long r11 = r7.f2499c
                r13 = 0
                int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r8 != 0) goto L_0x037e
                goto L_0x0386
            L_0x037e:
                r13 = 4
                long r11 = r11 / r13
                r15 = 3
                long r11 = r11 * r15
                long r9 = r9 / r13
                long r9 = r9 + r11
            L_0x0386:
                r7.f2499c = r9
                r8 = r5
                goto L_0x03c8
            L_0x038a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0392 }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x0392 }
                throw r0     // Catch:{ all -> 0x0392 }
            L_0x0392:
                r0 = move-exception
                int r2 = y1.k.f17122a
                y1.k.a.b()
                throw r0
            L_0x0399:
                java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "Inconsistency detected. Invalid item position "
                r6.<init>(r7)
                r6.append(r0)
                java.lang.String r0 = "(offset:"
                r6.append(r0)
                r6.append(r5)
                java.lang.String r0 = ").state:"
                r6.append(r0)
                int r0 = r3.b()
                r6.append(r0)
                java.lang.String r0 = r2.z()
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                r4.<init>(r0)
                throw r4
            L_0x03c8:
                if (r4 == 0) goto L_0x03f9
                boolean r5 = r3.f2532g
                if (r5 != 0) goto L_0x03f9
                int r5 = r8.f2449j
                r7 = r5 & 8192(0x2000, float:1.14794E-41)
                if (r7 == 0) goto L_0x03d6
                r7 = 1
                goto L_0x03d7
            L_0x03d6:
                r7 = 0
            L_0x03d7:
                if (r7 == 0) goto L_0x03f9
                r5 = r5 & -8193(0xffffffffffffdfff, float:NaN)
                r5 = r5 | 0
                r8.f2449j = r5
                boolean r5 = r3.f2535j
                if (r5 == 0) goto L_0x03f9
                androidx.recyclerview.widget.RecyclerView.j.e(r8)
                androidx.recyclerview.widget.RecyclerView$j r5 = r2.f2417l0
                r8.e()
                r5.getClass()
                androidx.recyclerview.widget.RecyclerView$j$c r5 = new androidx.recyclerview.widget.RecyclerView$j$c
                r5.<init>()
                r5.a(r8)
                r2.V(r8, r5)
            L_0x03f9:
                boolean r5 = r3.f2532g
                if (r5 == 0) goto L_0x0406
                boolean r5 = r8.g()
                if (r5 == 0) goto L_0x0406
                r8.f2446g = r0
                goto L_0x041d
            L_0x0406:
                boolean r5 = r8.g()
                if (r5 == 0) goto L_0x0422
                int r5 = r8.f2449j
                r5 = r5 & r6
                if (r5 == 0) goto L_0x0413
                r5 = 1
                goto L_0x0414
            L_0x0413:
                r5 = 0
            L_0x0414:
                if (r5 != 0) goto L_0x0422
                boolean r5 = r8.h()
                if (r5 == 0) goto L_0x041d
                goto L_0x0422
            L_0x041d:
                r0 = 0
                r3 = 1
                r5 = 0
                goto L_0x0527
            L_0x0422:
                androidx.recyclerview.widget.a r5 = r2.f2407d
                r6 = 0
                int r5 = r5.f(r0, r6)
                r7 = 0
                r8.f2457s = r7
                r8.f2456r = r2
                int r9 = r8.f2445f
                long r10 = r2.getNanoTime()
                r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r12 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
                if (r12 == 0) goto L_0x045b
                androidx.recyclerview.widget.RecyclerView$s r12 = r1.f2507g
                androidx.recyclerview.widget.RecyclerView$s$a r9 = r12.a(r9)
                long r12 = r9.f2500d
                r14 = 0
                int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r9 == 0) goto L_0x0453
                long r12 = r12 + r10
                int r9 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
                if (r9 >= 0) goto L_0x0451
                goto L_0x0453
            L_0x0451:
                r9 = r6
                goto L_0x0454
            L_0x0453:
                r9 = 1
            L_0x0454:
                if (r9 != 0) goto L_0x045b
                r3 = 1
                r0 = r6
                r5 = r0
                goto L_0x0527
            L_0x045b:
                androidx.recyclerview.widget.RecyclerView$e r9 = r2.H
                r9.getClass()
                androidx.recyclerview.widget.RecyclerView$e<? extends androidx.recyclerview.widget.RecyclerView$b0> r12 = r8.f2457s
                if (r12 != 0) goto L_0x0466
                r12 = 1
                goto L_0x0467
            L_0x0466:
                r12 = r6
            L_0x0467:
                if (r12 == 0) goto L_0x0484
                r8.f2442c = r5
                boolean r13 = r9.f2460b
                if (r13 == 0) goto L_0x0475
                long r13 = r9.e(r5)
                r8.f2444e = r13
            L_0x0475:
                int r13 = r8.f2449j
                r13 = r13 & -520(0xfffffffffffffdf8, float:NaN)
                r13 = r13 | 1
                r8.f2449j = r13
                int r13 = y1.k.f17122a
                java.lang.String r13 = "RV OnBindView"
                y1.k.a.a(r13)
            L_0x0484:
                r8.f2457s = r9
                r8.e()
                r9.i(r8, r5)
                android.view.View r5 = r8.f2440a
                if (r12 == 0) goto L_0x04af
                java.util.ArrayList r9 = r8.f2450k
                if (r9 == 0) goto L_0x0497
                r9.clear()
            L_0x0497:
                int r9 = r8.f2449j
                r9 = r9 & -1025(0xfffffffffffffbff, float:NaN)
                r8.f2449j = r9
                android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
                boolean r12 = r9 instanceof androidx.recyclerview.widget.RecyclerView.n
                if (r12 == 0) goto L_0x04aa
                androidx.recyclerview.widget.RecyclerView$n r9 = (androidx.recyclerview.widget.RecyclerView.n) r9
                r12 = 1
                r9.f2493c = r12
            L_0x04aa:
                int r9 = y1.k.f17122a
                y1.k.a.b()
            L_0x04af:
                long r12 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$s r9 = r1.f2507g
                int r14 = r8.f2445f
                long r12 = r12 - r10
                androidx.recyclerview.widget.RecyclerView$s$a r9 = r9.a(r14)
                long r10 = r9.f2500d
                r14 = 0
                int r14 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
                if (r14 != 0) goto L_0x04c5
                goto L_0x04ce
            L_0x04c5:
                r14 = 4
                long r10 = r10 / r14
                r16 = 3
                long r10 = r10 * r16
                long r12 = r12 / r14
                long r12 = r12 + r10
            L_0x04ce:
                r9.f2500d = r12
                android.view.accessibility.AccessibilityManager r9 = r2.f2402a0
                if (r9 == 0) goto L_0x04dc
                boolean r9 = r9.isEnabled()
                if (r9 == 0) goto L_0x04dc
                r9 = 1
                goto L_0x04dd
            L_0x04dc:
                r9 = r6
            L_0x04dd:
                if (r9 == 0) goto L_0x051e
                java.util.WeakHashMap<android.view.View, d2.d1> r9 = d2.i0.f7217a
                int r9 = d2.i0.d.c(r5)
                if (r9 != 0) goto L_0x04ec
                r9 = 1
                d2.i0.d.s(r5, r9)
                goto L_0x04ed
            L_0x04ec:
                r9 = 1
            L_0x04ed:
                androidx.recyclerview.widget.y r10 = r2.K0
                if (r10 != 0) goto L_0x04f2
                goto L_0x051c
            L_0x04f2:
                androidx.recyclerview.widget.y$a r10 = r10.f2758e
                boolean r11 = r10 instanceof androidx.recyclerview.widget.y.a
                if (r11 == 0) goto L_0x0519
                r10.getClass()
                android.view.View$AccessibilityDelegate r11 = d2.i0.d(r5)
                if (r11 != 0) goto L_0x0502
                goto L_0x0510
            L_0x0502:
                boolean r7 = r11 instanceof d2.a.C0112a
                if (r7 == 0) goto L_0x050b
                d2.a$a r11 = (d2.a.C0112a) r11
                d2.a r7 = r11.f7188a
                goto L_0x0510
            L_0x050b:
                d2.a r7 = new d2.a
                r7.<init>(r11)
            L_0x0510:
                if (r7 == 0) goto L_0x0519
                if (r7 == r10) goto L_0x0519
                java.util.WeakHashMap r11 = r10.f2760e
                r11.put(r5, r7)
            L_0x0519:
                d2.i0.n(r5, r10)
            L_0x051c:
                r5 = r9
                goto L_0x051f
            L_0x051e:
                r5 = 1
            L_0x051f:
                boolean r3 = r3.f2532g
                if (r3 == 0) goto L_0x0525
                r8.f2446g = r0
            L_0x0525:
                r3 = r5
                r0 = r6
            L_0x0527:
                android.view.View r6 = r8.f2440a
                android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
                android.view.View r7 = r8.f2440a
                if (r6 != 0) goto L_0x053b
                android.view.ViewGroup$LayoutParams r2 = r2.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$n r2 = (androidx.recyclerview.widget.RecyclerView.n) r2
                r7.setLayoutParams(r2)
                goto L_0x054e
            L_0x053b:
                boolean r9 = r2.checkLayoutParams(r6)
                if (r9 != 0) goto L_0x054b
                android.view.ViewGroup$LayoutParams r2 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r6)
                androidx.recyclerview.widget.RecyclerView$n r2 = (androidx.recyclerview.widget.RecyclerView.n) r2
                r7.setLayoutParams(r2)
                goto L_0x054e
            L_0x054b:
                r2 = r6
                androidx.recyclerview.widget.RecyclerView$n r2 = (androidx.recyclerview.widget.RecyclerView.n) r2
            L_0x054e:
                r2.f2491a = r8
                if (r4 == 0) goto L_0x0555
                if (r5 == 0) goto L_0x0555
                r0 = r3
            L_0x0555:
                r2.f2494d = r0
                return r8
            L_0x0558:
                java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Invalid item position "
                r4.<init>(r5)
                r4.append(r0)
                java.lang.String r5 = "("
                r4.append(r5)
                r4.append(r0)
                java.lang.String r0 = "). Item count:"
                r4.append(r0)
                androidx.recyclerview.widget.RecyclerView$y r0 = r2.D0
                int r0 = r0.b()
                r4.append(r0)
                java.lang.String r0 = r2.z()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t.i(int, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        public final void j(b0 b0Var) {
            if (b0Var.f2453o) {
                this.f2502b.remove(b0Var);
            } else {
                this.f2501a.remove(b0Var);
            }
            b0Var.f2452n = null;
            b0Var.f2453o = false;
            b0Var.f2449j &= -33;
        }

        public final void k() {
            m mVar = RecyclerView.this.I;
            this.f2506f = this.f2505e + (mVar != null ? mVar.f2480j : 0);
            ArrayList<b0> arrayList = this.f2503c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2506f; size--) {
                e(size);
            }
        }
    }

    public interface u {
        void a();
    }

    public class v extends g {
        public v() {
        }

        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.i((String) null);
            recyclerView.D0.f2531f = true;
            recyclerView.U(true);
            if (!recyclerView.f2407d.g()) {
                recyclerView.requestLayout();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
            if (r2.size() == 1) goto L_0x0026;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(java.lang.Object r5, int r6, int r7) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.a r0 = r0.f2407d
                r1 = 1
                if (r7 >= r1) goto L_0x000f
                r0.getClass()
                goto L_0x0025
            L_0x000f:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f2577b
                r3 = 4
                androidx.recyclerview.widget.a$b r5 = r0.h(r5, r3, r6, r7)
                r2.add(r5)
                int r5 = r0.f2581f
                r5 = r5 | r3
                r0.f2581f = r5
                int r5 = r2.size()
                if (r5 != r1) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r1 = 0
            L_0x0026:
                if (r1 == 0) goto L_0x002b
                r4.h()
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.c(java.lang.Object, int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
            if (r3.size() == 1) goto L_0x0025;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.a r0 = r0.f2407d
                r2 = 1
                if (r6 >= r2) goto L_0x000f
                r0.getClass()
                goto L_0x0024
            L_0x000f:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f2577b
                androidx.recyclerview.widget.a$b r5 = r0.h(r1, r2, r5, r6)
                r3.add(r5)
                int r5 = r0.f2581f
                r5 = r5 | r2
                r0.f2581f = r5
                int r5 = r3.size()
                if (r5 != r2) goto L_0x0024
                goto L_0x0025
            L_0x0024:
                r2 = 0
            L_0x0025:
                if (r2 == 0) goto L_0x002a
                r4.h()
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.d(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
            if (r2.size() == 1) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.a r0 = r0.f2407d
                r0.getClass()
                if (r5 != r6) goto L_0x000e
                goto L_0x0026
            L_0x000e:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f2577b
                r3 = 8
                androidx.recyclerview.widget.a$b r5 = r0.h(r1, r3, r5, r6)
                r2.add(r5)
                int r5 = r0.f2581f
                r5 = r5 | r3
                r0.f2581f = r5
                int r5 = r2.size()
                r6 = 1
                if (r5 != r6) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r6 = 0
            L_0x0027:
                if (r6 == 0) goto L_0x002c
                r4.h()
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.e(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
            if (r3.size() == 1) goto L_0x0026;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.a r0 = r0.f2407d
                r2 = 1
                if (r7 >= r2) goto L_0x000f
                r0.getClass()
                goto L_0x0025
            L_0x000f:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f2577b
                r4 = 2
                androidx.recyclerview.widget.a$b r6 = r0.h(r1, r4, r6, r7)
                r3.add(r6)
                int r6 = r0.f2581f
                r6 = r6 | r4
                r0.f2581f = r6
                int r6 = r3.size()
                if (r6 != r2) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r2 = 0
            L_0x0026:
                if (r2 == 0) goto L_0x002b
                r5.h()
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.f(int, int):void");
        }

        public final void g() {
            e eVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2405c != null && (eVar = recyclerView.H) != null) {
                int c3 = q.g.c(eVar.f2461c);
                boolean z10 = false;
                if (c3 == 1 ? eVar.d() > 0 : c3 != 2) {
                    z10 = true;
                }
                if (z10) {
                    recyclerView.requestLayout();
                }
            }
        }

        public final void h() {
            int[] iArr = RecyclerView.W0;
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.P || !recyclerView.O) {
                recyclerView.W = true;
                recyclerView.requestLayout();
                return;
            }
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.m(recyclerView, recyclerView.D);
        }
    }

    public static abstract class x {

        /* renamed from: a  reason: collision with root package name */
        public int f2511a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f2512b;

        /* renamed from: c  reason: collision with root package name */
        public m f2513c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2514d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2515e;

        /* renamed from: f  reason: collision with root package name */
        public View f2516f;

        /* renamed from: g  reason: collision with root package name */
        public final a f2517g = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f2518h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f2519a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f2520b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f2521c = Integer.MIN_VALUE;

            /* renamed from: d  reason: collision with root package name */
            public int f2522d = -1;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f2523e = null;

            /* renamed from: f  reason: collision with root package name */
            public boolean f2524f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f2525g = 0;

            public final void a(RecyclerView recyclerView) {
                int i8 = this.f2522d;
                if (i8 >= 0) {
                    this.f2522d = -1;
                    recyclerView.M(i8);
                    this.f2524f = false;
                } else if (this.f2524f) {
                    Interpolator interpolator = this.f2523e;
                    if (interpolator == null || this.f2521c >= 1) {
                        int i10 = this.f2521c;
                        if (i10 >= 1) {
                            recyclerView.A0.b(this.f2519a, this.f2520b, i10, interpolator);
                            int i11 = this.f2525g + 1;
                            this.f2525g = i11;
                            if (i11 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f2524f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f2525g = 0;
                }
            }
        }

        public interface b {
            PointF a(int i8);
        }

        public final PointF a(int i8) {
            m mVar = this.f2513c;
            if (mVar instanceof b) {
                return ((b) mVar).a(i8);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public final void b(int i8, int i10) {
            PointF a10;
            RecyclerView recyclerView = this.f2512b;
            int i11 = -1;
            if (this.f2511a == -1 || recyclerView == null) {
                d();
            }
            if (this.f2514d && this.f2516f == null && this.f2513c != null && (a10 = a(this.f2511a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.Z((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            boolean z10 = false;
            this.f2514d = false;
            View view = this.f2516f;
            a aVar = this.f2517g;
            if (view != null) {
                this.f2512b.getClass();
                b0 J = RecyclerView.J(view);
                if (J != null) {
                    i11 = J.d();
                }
                if (i11 == this.f2511a) {
                    View view2 = this.f2516f;
                    y yVar = recyclerView.D0;
                    c(view2, aVar);
                    aVar.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2516f = null;
                }
            }
            if (this.f2515e) {
                y yVar2 = recyclerView.D0;
                o oVar = (o) this;
                if (oVar.f2512b.I.w() == 0) {
                    oVar.d();
                } else {
                    int i12 = oVar.f2746o;
                    int i13 = i12 - i8;
                    if (i12 * i13 <= 0) {
                        i13 = 0;
                    }
                    oVar.f2746o = i13;
                    int i14 = oVar.f2747p;
                    int i15 = i14 - i10;
                    if (i14 * i15 <= 0) {
                        i15 = 0;
                    }
                    oVar.f2747p = i15;
                    if (i13 == 0 && i15 == 0) {
                        PointF a11 = oVar.a(oVar.f2511a);
                        if (a11 != null) {
                            float f11 = a11.x;
                            if (!(f11 == 0.0f && a11.y == 0.0f)) {
                                float f12 = a11.y;
                                float sqrt = (float) Math.sqrt((double) ((f12 * f12) + (f11 * f11)));
                                float f13 = a11.x / sqrt;
                                a11.x = f13;
                                float f14 = a11.y / sqrt;
                                a11.y = f14;
                                oVar.f2743k = a11;
                                oVar.f2746o = (int) (f13 * 10000.0f);
                                oVar.f2747p = (int) (f14 * 10000.0f);
                                int g10 = oVar.g(10000);
                                LinearInterpolator linearInterpolator = oVar.f2741i;
                                aVar.f2519a = (int) (((float) oVar.f2746o) * 1.2f);
                                aVar.f2520b = (int) (((float) oVar.f2747p) * 1.2f);
                                aVar.f2521c = (int) (((float) g10) * 1.2f);
                                aVar.f2523e = linearInterpolator;
                                aVar.f2524f = true;
                            }
                        }
                        aVar.f2522d = oVar.f2511a;
                        oVar.d();
                    }
                }
                if (aVar.f2522d >= 0) {
                    z10 = true;
                }
                aVar.a(recyclerView);
                if (z10 && this.f2515e) {
                    this.f2514d = true;
                    recyclerView.A0.a();
                }
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (this.f2515e) {
                this.f2515e = false;
                o oVar = (o) this;
                oVar.f2747p = 0;
                oVar.f2746o = 0;
                oVar.f2743k = null;
                this.f2512b.D0.f2526a = -1;
                this.f2516f = null;
                this.f2511a = -1;
                this.f2514d = false;
                m mVar = this.f2513c;
                if (mVar.f2475e == this) {
                    mVar.f2475e = null;
                }
                this.f2513c = null;
                this.f2512b = null;
            }
        }
    }

    public static class y {

        /* renamed from: a  reason: collision with root package name */
        public int f2526a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f2527b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2528c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2529d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f2530e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2531f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2532g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2533h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2534i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2535j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2536k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f2537l;
        public long m;

        /* renamed from: n  reason: collision with root package name */
        public int f2538n;

        public final void a(int i8) {
            if ((this.f2529d & i8) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i8) + " but it is " + Integer.toBinaryString(this.f2529d));
            }
        }

        public final int b() {
            return this.f2532g ? this.f2527b - this.f2528c : this.f2530e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f2526a + ", mData=null, mItemCount=" + this.f2530e + ", mIsMeasuring=" + this.f2534i + ", mPreviousLayoutItemCount=" + this.f2527b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2528c + ", mStructureChanged=" + this.f2531f + ", mInPreLayout=" + this.f2532g + ", mRunSimpleAnimations=" + this.f2535j + ", mRunPredictiveAnimations=" + this.f2536k + '}';
        }
    }

    public static abstract class z {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            W0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r0
            r2 = 3
            r1[r2] = r0
            X0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            Y0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static RecyclerView E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            RecyclerView E2 = E(viewGroup.getChildAt(i8));
            if (E2 != null) {
                return E2;
            }
        }
        return null;
    }

    public static b0 J(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f2491a;
    }

    private d2.v getScrollingChildHelper() {
        if (this.M0 == null) {
            this.M0 = new d2.v(this);
        }
        return this.M0;
    }

    public static void j(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.f2441b;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != b0Var.f2440a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            b0Var.f2441b = null;
        }
    }

    public final void A(y yVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A0.f2435c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            yVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        yVar.getClass();
    }

    public final View B(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<q> arrayList = this.M;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            q qVar = arrayList.get(i8);
            if (!qVar.c(motionEvent) || action == 3) {
                i8++;
            } else {
                this.N = qVar;
                return true;
            }
        }
        return false;
    }

    public final void D(int[] iArr) {
        int e10 = this.f2409e.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i8 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < e10; i11++) {
            b0 J2 = J(this.f2409e.d(i11));
            if (!J2.p()) {
                int d10 = J2.d();
                if (d10 < i8) {
                    i8 = d10;
                }
                if (d10 > i10) {
                    i10 = d10;
                }
            }
        }
        iArr[0] = i8;
        iArr[1] = i10;
    }

    public final b0 F(int i8) {
        b0 b0Var = null;
        if (this.f2406c0) {
            return null;
        }
        int h3 = this.f2409e.h();
        for (int i10 = 0; i10 < h3; i10++) {
            b0 J2 = J(this.f2409e.g(i10));
            if (J2 != null && !J2.j() && G(J2) == i8) {
                if (!this.f2409e.j(J2.f2440a)) {
                    return J2;
                }
                b0Var = J2;
            }
        }
        return b0Var;
    }

    public final int G(b0 b0Var) {
        if (!((b0Var.f2449j & 524) != 0) && b0Var.g()) {
            a aVar = this.f2407d;
            int i8 = b0Var.f2442c;
            ArrayList<a.b> arrayList = aVar.f2577b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a.b bVar = arrayList.get(i10);
                int i11 = bVar.f2582a;
                if (i11 != 1) {
                    if (i11 == 2) {
                        int i12 = bVar.f2583b;
                        if (i12 <= i8) {
                            int i13 = bVar.f2585d;
                            if (i12 + i13 <= i8) {
                                i8 -= i13;
                            }
                        } else {
                            continue;
                        }
                    } else if (i11 == 8) {
                        int i14 = bVar.f2583b;
                        if (i14 == i8) {
                            i8 = bVar.f2585d;
                        } else {
                            if (i14 < i8) {
                                i8--;
                            }
                            if (bVar.f2585d <= i8) {
                                i8++;
                            }
                        }
                    }
                } else if (bVar.f2583b <= i8) {
                    i8 += bVar.f2585d;
                }
            }
            return i8;
        }
        return -1;
    }

    public final long H(b0 b0Var) {
        return this.H.f2460b ? b0Var.f2444e : (long) b0Var.f2442c;
    }

    public final b0 I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect K(View view) {
        n nVar = (n) view.getLayoutParams();
        boolean z10 = nVar.f2493c;
        Rect rect = nVar.f2492b;
        if (!z10) {
            return rect;
        }
        y yVar = this.D0;
        if (yVar.f2532g && (nVar.b() || nVar.f2491a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<l> arrayList = this.L;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Rect rect2 = this.E;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i8).d(rect2, view, this, yVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.f2493c = false;
        return rect;
    }

    public final boolean L() {
        return this.f2410e0 > 0;
    }

    public final void M(int i8) {
        if (this.I != null) {
            setScrollState(2);
            this.I.q0(i8);
            awakenScrollBars();
        }
    }

    public final void N() {
        int h3 = this.f2409e.h();
        for (int i8 = 0; i8 < h3; i8++) {
            ((n) this.f2409e.g(i8).getLayoutParams()).f2493c = true;
        }
        ArrayList<b0> arrayList = this.f2403b.f2503c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10).f2440a.getLayoutParams();
            if (nVar != null) {
                nVar.f2493c = true;
            }
        }
    }

    public final void O(int i8, int i10, boolean z10) {
        int i11 = i8 + i10;
        int h3 = this.f2409e.h();
        for (int i12 = 0; i12 < h3; i12++) {
            b0 J2 = J(this.f2409e.g(i12));
            if (J2 != null && !J2.p()) {
                int i13 = J2.f2442c;
                y yVar = this.D0;
                if (i13 >= i11) {
                    J2.m(-i10, z10);
                    yVar.f2531f = true;
                } else if (i13 >= i8) {
                    J2.b(8);
                    J2.m(-i10, z10);
                    J2.f2442c = i8 - 1;
                    yVar.f2531f = true;
                }
            }
        }
        t tVar = this.f2403b;
        ArrayList<b0> arrayList = tVar.f2503c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                b0 b0Var = arrayList.get(size);
                if (b0Var != null) {
                    int i14 = b0Var.f2442c;
                    if (i14 >= i11) {
                        b0Var.m(-i10, z10);
                    } else if (i14 >= i8) {
                        b0Var.b(8);
                        tVar.e(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void P() {
        this.f2410e0++;
    }

    public final void Q(boolean z10) {
        int i8;
        boolean z11 = true;
        int i10 = this.f2410e0 - 1;
        this.f2410e0 = i10;
        if (i10 < 1) {
            this.f2410e0 = 0;
            if (z10) {
                int i11 = this.V;
                this.V = 0;
                if (i11 != 0) {
                    AccessibilityManager accessibilityManager = this.f2402a0;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z11 = false;
                    }
                    if (z11) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        e2.b.b(obtain, i11);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.Q0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b0 b0Var = (b0) arrayList.get(size);
                    if (b0Var.f2440a.getParent() == this && !b0Var.p() && (i8 = b0Var.f2455q) != -1) {
                        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                        i0.d.s(b0Var.f2440a, i8);
                        b0Var.f2455q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2419n0) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f2419n0 = motionEvent.getPointerId(i8);
            int x10 = (int) (motionEvent.getX(i8) + 0.5f);
            this.f2423r0 = x10;
            this.f2421p0 = x10;
            int y10 = (int) (motionEvent.getY(i8) + 0.5f);
            this.f2424s0 = y10;
            this.f2422q0 = y10;
        }
    }

    public final void S() {
        if (!this.J0 && this.O) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.m(this, this.R0);
            this.J0 = true;
        }
    }

    public final void T() {
        boolean z10;
        boolean z11 = false;
        if (this.f2406c0) {
            a aVar = this.f2407d;
            aVar.l(aVar.f2577b);
            aVar.l(aVar.f2578c);
            aVar.f2581f = 0;
            if (this.f2408d0) {
                this.I.Z();
            }
        }
        if (this.f2417l0 != null && this.I.C0()) {
            this.f2407d.j();
        } else {
            this.f2407d.c();
        }
        boolean z12 = this.G0 || this.H0;
        boolean z13 = this.Q && this.f2417l0 != null && ((z10 = this.f2406c0) || z12 || this.I.f2476f) && (!z10 || this.H.f2460b);
        y yVar = this.D0;
        yVar.f2535j = z13;
        if (z13 && z12 && !this.f2406c0) {
            if (this.f2417l0 != null && this.I.C0()) {
                z11 = true;
            }
        }
        yVar.f2536k = z11;
    }

    public final void U(boolean z10) {
        this.f2408d0 = z10 | this.f2408d0;
        this.f2406c0 = true;
        int h3 = this.f2409e.h();
        for (int i8 = 0; i8 < h3; i8++) {
            b0 J2 = J(this.f2409e.g(i8));
            if (J2 != null && !J2.p()) {
                J2.b(6);
            }
        }
        N();
        t tVar = this.f2403b;
        ArrayList<b0> arrayList = tVar.f2503c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = arrayList.get(i10);
            if (b0Var != null) {
                b0Var.b(6);
                b0Var.a((Object) null);
            }
        }
        e eVar = RecyclerView.this.H;
        if (eVar == null || !eVar.f2460b) {
            tVar.d();
        }
    }

    public final void V(b0 b0Var, j.c cVar) {
        boolean z10 = false;
        int i8 = (b0Var.f2449j & -8193) | 0;
        b0Var.f2449j = i8;
        boolean z11 = this.D0.f2533h;
        d0 d0Var = this.B;
        if (z11) {
            if ((i8 & 2) != 0) {
                z10 = true;
            }
            if (z10 && !b0Var.j() && !b0Var.p()) {
                d0Var.f2610b.i(b0Var, H(b0Var));
            }
        }
        o.f<b0, d0.a> fVar = d0Var.f2609a;
        d0.a orDefault = fVar.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = d0.a.a();
            fVar.put(b0Var, orDefault);
        }
        orDefault.f2613b = cVar;
        orDefault.f2612a |= 4;
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f2493c) {
                int i8 = rect.left;
                Rect rect2 = nVar.f2492b;
                rect.left = i8 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.I.n0(this, view, this.E, !this.Q, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.f2420o0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        f0(0);
        EdgeEffect edgeEffect = this.f2413h0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f2413h0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2414i0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f2414i0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2415j0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f2415j0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2416k0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f2416k0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Y(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r18.m()
            androidx.recyclerview.widget.RecyclerView$e r0 = r8.H
            int[] r11 = r8.P0
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0027
            r11[r13] = r13
            r11[r12] = r13
            r8.Z(r9, r10, r11)
            r0 = r11[r13]
            r1 = r11[r12]
            int r2 = r9 - r0
            int r3 = r10 - r1
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x002d
        L_0x0027:
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x002d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$l> r0 = r8.L
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r18.invalidate()
        L_0x0038:
            r11[r13] = r13
            r11[r12] = r13
            int[] r5 = r8.N0
            r0 = r18
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r22
            r7 = r11
            r0.t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r11[r13]
            int r1 = r16 - r0
            r2 = r11[r12]
            int r3 = r17 - r2
            if (r0 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = r13
            goto L_0x005c
        L_0x005b:
            r0 = r12
        L_0x005c:
            int r2 = r8.f2423r0
            int[] r4 = r8.N0
            r5 = r4[r13]
            int r2 = r2 - r5
            r8.f2423r0 = r2
            int r2 = r8.f2424s0
            r4 = r4[r12]
            int r2 = r2 - r4
            r8.f2424s0 = r2
            int[] r2 = r8.O0
            r6 = r2[r13]
            int r6 = r6 + r5
            r2[r13] = r6
            r5 = r2[r12]
            int r5 = r5 + r4
            r2[r12] = r5
            int r2 = r18.getOverScrollMode()
            r4 = 2
            if (r2 == r4) goto L_0x011b
            if (r21 == 0) goto L_0x0118
            int r2 = r21.getSource()
            r4 = 8194(0x2002, float:1.1482E-41)
            r2 = r2 & r4
            if (r2 != r4) goto L_0x008c
            r2 = r12
            goto L_0x008d
        L_0x008c:
            r2 = r13
        L_0x008d:
            if (r2 != 0) goto L_0x0118
            float r2 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b8
            r18.w()
            android.widget.EdgeEffect r6 = r8.f2413h0
            float r11 = -r1
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r7 - r4
            h2.d.a.a(r6, r11, r4)
            goto L_0x00d1
        L_0x00b8:
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d3
            r18.x()
            android.widget.EdgeEffect r6 = r8.f2415j0
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            h2.d.a.a(r6, r11, r4)
        L_0x00d1:
            r4 = 1
            goto L_0x00d4
        L_0x00d3:
            r4 = r13
        L_0x00d4:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ee
            r18.y()
            android.widget.EdgeEffect r4 = r8.f2414i0
            float r6 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            h2.d.a.a(r4, r6, r2)
            goto L_0x0108
        L_0x00ee:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0109
            r18.v()
            android.widget.EdgeEffect r4 = r8.f2416k0
            int r6 = r18.getHeight()
            float r6 = (float) r6
            float r6 = r3 / r6
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r7 = r7 - r2
            h2.d.a.a(r4, r6, r7)
        L_0x0108:
            r4 = 1
        L_0x0109:
            if (r4 != 0) goto L_0x0113
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0113
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0118
        L_0x0113:
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            d2.i0.d.k(r18)
        L_0x0118:
            r18.l(r19, r20)
        L_0x011b:
            if (r14 != 0) goto L_0x011f
            if (r15 == 0) goto L_0x0122
        L_0x011f:
            r8.u(r14, r15)
        L_0x0122:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x012b
            r18.invalidate()
        L_0x012b:
            if (r0 != 0) goto L_0x0134
            if (r14 != 0) goto L_0x0134
            if (r15 == 0) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            r12 = r13
            goto L_0x0135
        L_0x0134:
            r12 = 1
        L_0x0135:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void Z(int i8, int i10, int[] iArr) {
        b0 b0Var;
        d0();
        P();
        int i11 = y1.k.f17122a;
        k.a.a("RV Scroll");
        y yVar = this.D0;
        A(yVar);
        t tVar = this.f2403b;
        int p02 = i8 != 0 ? this.I.p0(i8, tVar, yVar) : 0;
        int r02 = i10 != 0 ? this.I.r0(i10, tVar, yVar) : 0;
        k.a.b();
        int e10 = this.f2409e.e();
        for (int i12 = 0; i12 < e10; i12++) {
            View d10 = this.f2409e.d(i12);
            b0 I2 = I(d10);
            if (!(I2 == null || (b0Var = I2.f2448i) == null)) {
                int left = d10.getLeft();
                int top = d10.getTop();
                View view = b0Var.f2440a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        e0(false);
        if (iArr != null) {
            iArr[0] = p02;
            iArr[1] = r02;
        }
    }

    public final void a0(int i8) {
        x xVar;
        if (!this.T) {
            setScrollState(0);
            a0 a0Var = this.A0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f2435c.abortAnimation();
            m mVar = this.I;
            if (!(mVar == null || (xVar = mVar.f2475e) == null)) {
                xVar.d();
            }
            m mVar2 = this.I;
            if (mVar2 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            mVar2.q0(i8);
            awakenScrollBars();
        }
    }

    public final void addFocusables(ArrayList<View> arrayList, int i8, int i10) {
        m mVar = this.I;
        if (mVar != null) {
            mVar.getClass();
        }
        super.addFocusables(arrayList, i8, i10);
    }

    public final void b0(int i8, int i10, boolean z10) {
        m mVar = this.I;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.T) {
            int i11 = 0;
            if (!mVar.d()) {
                i8 = 0;
            }
            if (!this.I.e()) {
                i10 = 0;
            }
            if (i8 != 0 || i10 != 0) {
                if (z10) {
                    if (i8 != 0) {
                        i11 = 1;
                    }
                    if (i10 != 0) {
                        i11 |= 2;
                    }
                    getScrollingChildHelper().g(i11, 1);
                }
                this.A0.b(i8, i10, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void c0(int i8) {
        if (!this.T) {
            m mVar = this.I;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                mVar.A0(this, i8);
            }
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.I.f((n) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        m mVar = this.I;
        if (mVar != null && mVar.d()) {
            return this.I.j(this.D0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        m mVar = this.I;
        if (mVar != null && mVar.d()) {
            return this.I.k(this.D0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        m mVar = this.I;
        if (mVar != null && mVar.d()) {
            return this.I.l(this.D0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        m mVar = this.I;
        if (mVar != null && mVar.e()) {
            return this.I.m(this.D0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        m mVar = this.I;
        if (mVar != null && mVar.e()) {
            return this.I.n(this.D0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        m mVar = this.I;
        if (mVar != null && mVar.e()) {
            return this.I.o(this.D0);
        }
        return 0;
    }

    public final void d0() {
        int i8 = this.R + 1;
        this.R = i8;
        if (i8 == 1 && !this.T) {
            this.S = false;
        }
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i8, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i8, i10, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i8, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().e(i8, i10, i11, i12, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList<l> arrayList = this.L;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).f(canvas);
        }
        EdgeEffect edgeEffect = this.f2413h0;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.C ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f2413h0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2414i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.C) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2414i0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2415j0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.C ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.f2415j0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2416k0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.C) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f2416k0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f2417l0 == null || arrayList.size() <= 0 || !this.f2417l0.j()) {
            z12 = z10;
        }
        if (z12) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(boolean z10) {
        if (this.R < 1) {
            this.R = 1;
        }
        if (!z10 && !this.T) {
            this.S = false;
        }
        if (this.R == 1) {
            if (z10 && this.S && !this.T && this.I != null && this.H != null) {
                p();
            }
            if (!this.T) {
                this.S = false;
            }
        }
        this.R--;
    }

    public final void f(b0 b0Var) {
        View view = b0Var.f2440a;
        boolean z10 = view.getParent() == this;
        this.f2403b.j(I(view));
        if (b0Var.l()) {
            this.f2409e.b(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f2409e.a(view, -1, true);
        } else {
            d dVar = this.f2409e;
            int indexOfChild = ((w) dVar.f2604a).f2755a.indexOfChild(view);
            if (indexOfChild >= 0) {
                dVar.f2605b.h(indexOfChild);
                dVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f0(int i8) {
        getScrollingChildHelper().h(i8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x015a, code lost:
        if (r4 > 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0178, code lost:
        if (r3 > 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x017b, code lost:
        if (r4 < 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x017e, code lost:
        if (r3 < 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0186, code lost:
        if ((r3 * r2) <= 0) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x018e, code lost:
        if ((r3 * r2) >= 0) goto L_0x0191;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.I
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView$e r0 = r13.H
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.I
            if (r0 == 0) goto L_0x001b
            boolean r0 = r13.L()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.T
            if (r0 != 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            androidx.recyclerview.widget.RecyclerView$y r4 = r13.D0
            androidx.recyclerview.widget.RecyclerView$t r5 = r13.f2403b
            r6 = 33
            r7 = 17
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x008d
            if (r15 == r9) goto L_0x0030
            if (r15 != r1) goto L_0x008d
        L_0x0030:
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.I
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0046
            if (r15 != r9) goto L_0x003d
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003e
        L_0x003d:
            r0 = r6
        L_0x003e:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0046
            r0 = r1
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 != 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$m r10 = r13.I
            boolean r10 = r10.d()
            if (r10 == 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.I
            int r0 = r0.A()
            if (r0 != r1) goto L_0x005b
            r0 = r1
            goto L_0x005c
        L_0x005b:
            r0 = r2
        L_0x005c:
            if (r15 != r9) goto L_0x0060
            r10 = r1
            goto L_0x0061
        L_0x0060:
            r10 = r2
        L_0x0061:
            r0 = r0 ^ r10
            if (r0 == 0) goto L_0x0067
            r0 = 66
            goto L_0x0068
        L_0x0067:
            r0 = r7
        L_0x0068:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0070
            r0 = r1
            goto L_0x0071
        L_0x0070:
            r0 = r2
        L_0x0071:
            if (r0 == 0) goto L_0x0088
            r13.m()
            android.view.View r0 = r13.B(r14)
            if (r0 != 0) goto L_0x007d
            return r8
        L_0x007d:
            r13.d0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.I
            r0.T(r14, r15, r5, r4)
            r13.e0(r2)
        L_0x0088:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00ad
        L_0x008d:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00ac
            if (r0 == 0) goto L_0x00ac
            r13.m()
            android.view.View r0 = r13.B(r14)
            if (r0 != 0) goto L_0x009f
            return r8
        L_0x009f:
            r13.d0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.I
            android.view.View r0 = r0.T(r14, r15, r5, r4)
            r13.e0(r2)
            goto L_0x00ad
        L_0x00ac:
            r0 = r3
        L_0x00ad:
            if (r0 == 0) goto L_0x00c4
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00c4
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c0
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c0:
            r13.W(r0, r8)
            return r14
        L_0x00c4:
            if (r0 == 0) goto L_0x0191
            if (r0 == r13) goto L_0x0191
            if (r0 != r14) goto L_0x00cc
            goto L_0x0191
        L_0x00cc:
            android.view.View r3 = r13.B(r0)
            if (r3 != 0) goto L_0x00d5
            r1 = r2
            goto L_0x0192
        L_0x00d5:
            if (r14 != 0) goto L_0x00d9
            goto L_0x0192
        L_0x00d9:
            android.view.View r3 = r13.B(r14)
            if (r3 != 0) goto L_0x00e1
            goto L_0x0192
        L_0x00e1:
            int r3 = r14.getWidth()
            int r4 = r14.getHeight()
            android.graphics.Rect r5 = r13.E
            r5.set(r2, r2, r3, r4)
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            android.graphics.Rect r8 = r13.F
            r8.set(r2, r2, r3, r4)
            r13.offsetDescendantRectToMyCoords(r14, r5)
            r13.offsetDescendantRectToMyCoords(r0, r8)
            androidx.recyclerview.widget.RecyclerView$m r2 = r13.I
            int r2 = r2.A()
            if (r2 != r1) goto L_0x010b
            r2 = -1
            goto L_0x010c
        L_0x010b:
            r2 = r1
        L_0x010c:
            int r3 = r5.left
            int r4 = r8.left
            if (r3 < r4) goto L_0x0116
            int r10 = r5.right
            if (r10 > r4) goto L_0x011e
        L_0x0116:
            int r10 = r5.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x011e
            r3 = r1
            goto L_0x012b
        L_0x011e:
            int r10 = r5.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0126
            if (r3 < r11) goto L_0x012a
        L_0x0126:
            if (r3 <= r4) goto L_0x012a
            r3 = -1
            goto L_0x012b
        L_0x012a:
            r3 = 0
        L_0x012b:
            int r4 = r5.top
            int r10 = r8.top
            if (r4 < r10) goto L_0x0135
            int r11 = r5.bottom
            if (r11 > r10) goto L_0x013d
        L_0x0135:
            int r11 = r5.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x013d
            r4 = r1
            goto L_0x014a
        L_0x013d:
            int r5 = r5.bottom
            int r8 = r8.bottom
            if (r5 > r8) goto L_0x0145
            if (r4 < r8) goto L_0x0149
        L_0x0145:
            if (r4 <= r10) goto L_0x0149
            r4 = -1
            goto L_0x014a
        L_0x0149:
            r4 = 0
        L_0x014a:
            if (r15 == r1) goto L_0x0189
            if (r15 == r9) goto L_0x0181
            if (r15 == r7) goto L_0x017e
            if (r15 == r6) goto L_0x017b
            r2 = 66
            if (r15 == r2) goto L_0x0178
            r2 = 130(0x82, float:1.82E-43)
            if (r15 != r2) goto L_0x015d
            if (r4 <= 0) goto L_0x0191
            goto L_0x0192
        L_0x015d:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid direction: "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = r13.z()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r14.<init>(r15)
            throw r14
        L_0x0178:
            if (r3 <= 0) goto L_0x0191
            goto L_0x0192
        L_0x017b:
            if (r4 >= 0) goto L_0x0191
            goto L_0x0192
        L_0x017e:
            if (r3 >= 0) goto L_0x0191
            goto L_0x0192
        L_0x0181:
            if (r4 > 0) goto L_0x0192
            if (r4 != 0) goto L_0x0191
            int r3 = r3 * r2
            if (r3 <= 0) goto L_0x0191
            goto L_0x0192
        L_0x0189:
            if (r4 < 0) goto L_0x0192
            if (r4 != 0) goto L_0x0191
            int r3 = r3 * r2
            if (r3 >= 0) goto L_0x0191
            goto L_0x0192
        L_0x0191:
            r1 = 0
        L_0x0192:
            if (r1 == 0) goto L_0x0195
            goto L_0x0199
        L_0x0195:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x0199:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(l lVar) {
        m mVar = this.I;
        if (mVar != null) {
            mVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.L;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(lVar);
        N();
        requestLayout();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.I;
        if (mVar != null) {
            return mVar.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.I;
        if (mVar != null) {
            return mVar.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.H;
    }

    public int getBaseline() {
        m mVar = this.I;
        if (mVar == null) {
            return super.getBaseline();
        }
        mVar.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i8, int i10) {
        return super.getChildDrawingOrder(i8, i10);
    }

    public boolean getClipToPadding() {
        return this.C;
    }

    public y getCompatAccessibilityDelegate() {
        return this.K0;
    }

    public i getEdgeEffectFactory() {
        return this.f2412g0;
    }

    public j getItemAnimator() {
        return this.f2417l0;
    }

    public int getItemDecorationCount() {
        return this.L.size();
    }

    public m getLayoutManager() {
        return this.I;
    }

    public int getMaxFlingVelocity() {
        return this.f2428w0;
    }

    public int getMinFlingVelocity() {
        return this.f2427v0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public p getOnFlingListener() {
        return this.f2426u0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2431z0;
    }

    public s getRecycledViewPool() {
        return this.f2403b.c();
    }

    public int getScrollState() {
        return this.f2418m0;
    }

    public final void h(r rVar) {
        if (this.F0 == null) {
            this.F0 = new ArrayList();
        }
        this.F0.add(rVar);
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    public final void i(String str) {
        if (L()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + z());
            }
            throw new IllegalStateException(str);
        } else if (this.f2411f0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + z()));
        }
    }

    public final boolean isAttachedToWindow() {
        return this.O;
    }

    public final boolean isLayoutSuppressed() {
        return this.T;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f7283d;
    }

    public final void k() {
        int h3 = this.f2409e.h();
        for (int i8 = 0; i8 < h3; i8++) {
            b0 J2 = J(this.f2409e.g(i8));
            if (!J2.p()) {
                J2.f2443d = -1;
                J2.f2446g = -1;
            }
        }
        t tVar = this.f2403b;
        ArrayList<b0> arrayList = tVar.f2503c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = arrayList.get(i10);
            b0Var.f2443d = -1;
            b0Var.f2446g = -1;
        }
        ArrayList<b0> arrayList2 = tVar.f2501a;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            b0 b0Var2 = arrayList2.get(i11);
            b0Var2.f2443d = -1;
            b0Var2.f2446g = -1;
        }
        ArrayList<b0> arrayList3 = tVar.f2502b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                b0 b0Var3 = tVar.f2502b.get(i12);
                b0Var3.f2443d = -1;
                b0Var3.f2446g = -1;
            }
        }
    }

    public final void l(int i8, int i10) {
        boolean z10;
        EdgeEffect edgeEffect = this.f2413h0;
        if (edgeEffect == null || edgeEffect.isFinished() || i8 <= 0) {
            z10 = false;
        } else {
            this.f2413h0.onRelease();
            z10 = this.f2413h0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2415j0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i8 < 0) {
            this.f2415j0.onRelease();
            z10 |= this.f2415j0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2414i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.f2414i0.onRelease();
            z10 |= this.f2414i0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2416k0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.f2416k0.onRelease();
            z10 |= this.f2416k0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.d.k(this);
        }
    }

    public final void m() {
        if (!this.Q || this.f2406c0) {
            int i8 = y1.k.f17122a;
            k.a.a("RV FullInvalidate");
            p();
            k.a.b();
        } else if (this.f2407d.g()) {
            a aVar = this.f2407d;
            int i10 = aVar.f2581f;
            boolean z10 = false;
            if ((4 & i10) != 0) {
                if (!((i10 & 11) != 0)) {
                    int i11 = y1.k.f17122a;
                    k.a.a("RV PartialInvalidate");
                    d0();
                    P();
                    this.f2407d.j();
                    if (!this.S) {
                        int e10 = this.f2409e.e();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= e10) {
                                break;
                            }
                            b0 J2 = J(this.f2409e.d(i12));
                            if (J2 != null && !J2.p()) {
                                if ((J2.f2449j & 2) != 0) {
                                    z10 = true;
                                    break;
                                }
                            }
                            i12++;
                        }
                        if (z10) {
                            p();
                        } else {
                            this.f2407d.b();
                        }
                    }
                    e0(true);
                    Q(true);
                    k.a.b();
                    return;
                }
            }
            if (aVar.g()) {
                int i13 = y1.k.f17122a;
                k.a.a("RV FullInvalidate");
                p();
                k.a.b();
            }
        }
    }

    public final void n(int i8, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        setMeasuredDimension(m.g(i8, paddingRight, i0.d.e(this)), m.g(i10, getPaddingBottom() + getPaddingTop(), i0.d.d(this)));
    }

    public final void o(View view) {
        J(view);
        e eVar = this.H;
        ArrayList arrayList = this.f2404b0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((o) this.f2404b0.get(size)).a();
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r1 >= 30.0f) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2410e0 = r0
            r1 = 1
            r5.O = r1
            boolean r2 = r5.Q
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = r1
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            r5.Q = r2
            androidx.recyclerview.widget.RecyclerView$m r2 = r5.I
            if (r2 == 0) goto L_0x001e
            r2.f2477g = r1
        L_0x001e:
            r5.J0 = r0
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.m.f2718e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.m) r1
            r5.B0 = r1
            if (r1 != 0) goto L_0x005a
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.B0 = r1
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            android.view.Display r1 = d2.i0.e.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x004c
            if (r1 == 0) goto L_0x004c
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x004e:
            androidx.recyclerview.widget.m r2 = r5.B0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f2721c = r3
            r0.set(r2)
        L_0x005a:
            androidx.recyclerview.widget.m r0 = r5.B0
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f2719a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public final void onDetachedFromWindow() {
        x xVar;
        super.onDetachedFromWindow();
        j jVar = this.f2417l0;
        if (jVar != null) {
            jVar.i();
        }
        setScrollState(0);
        a0 a0Var = this.A0;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f2435c.abortAnimation();
        m mVar = this.I;
        if (!(mVar == null || (xVar = mVar.f2475e) == null)) {
            xVar.d();
        }
        this.O = false;
        m mVar2 = this.I;
        if (mVar2 != null) {
            mVar2.f2477g = false;
            mVar2.S(this);
        }
        this.Q0.clear();
        removeCallbacks(this.R0);
        this.B.getClass();
        do {
        } while (d0.a.f2611d.b() != null);
        m mVar3 = this.B0;
        if (mVar3 != null) {
            mVar3.f2719a.remove(this);
            this.B0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<l> arrayList = this.L;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).e(canvas, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r16) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.I
            r8 = 0
            if (r0 != 0) goto L_0x0009
            return r8
        L_0x0009:
            boolean r0 = r6.T
            if (r0 == 0) goto L_0x000e
            return r8
        L_0x000e:
            int r0 = r16.getAction()
            r1 = 8
            if (r0 != r1) goto L_0x00dc
            int r0 = r16.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L_0x003f
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.I
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x002f
            r0 = 9
            float r0 = r7.getAxisValue(r0)
            float r0 = -r0
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            androidx.recyclerview.widget.RecyclerView$m r2 = r6.I
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0057
            r2 = 10
            float r2 = r7.getAxisValue(r2)
            goto L_0x0065
        L_0x003f:
            int r0 = r16.getSource()
            r2 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0063
            r0 = 26
            float r2 = r7.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.I
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0059
            float r0 = -r2
        L_0x0057:
            r2 = r1
            goto L_0x0065
        L_0x0059:
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.I
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0063
            r0 = r1
            goto L_0x0065
        L_0x0063:
            r0 = r1
            r2 = r0
        L_0x0065:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x006d
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00dc
        L_0x006d:
            float r1 = r6.f2429x0
            float r2 = r2 * r1
            int r9 = (int) r2
            float r1 = r6.f2430y0
            float r0 = r0 * r1
            int r10 = (int) r0
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.I
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r0, r1)
            goto L_0x00dc
        L_0x0082:
            boolean r1 = r6.T
            if (r1 == 0) goto L_0x0087
            goto L_0x00dc
        L_0x0087:
            int[] r11 = r6.P0
            r11[r8] = r8
            r12 = 1
            r11[r12] = r8
            boolean r13 = r0.d()
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.I
            boolean r14 = r0.e()
            if (r14 == 0) goto L_0x009d
            r0 = r13 | 2
            goto L_0x009e
        L_0x009d:
            r0 = r13
        L_0x009e:
            d2.v r1 = r15.getScrollingChildHelper()
            r1.g(r0, r12)
            if (r13 == 0) goto L_0x00a9
            r1 = r9
            goto L_0x00aa
        L_0x00a9:
            r1 = r8
        L_0x00aa:
            if (r14 == 0) goto L_0x00ae
            r2 = r10
            goto L_0x00af
        L_0x00ae:
            r2 = r8
        L_0x00af:
            int[] r4 = r6.P0
            int[] r5 = r6.N0
            r3 = 1
            r0 = r15
            boolean r0 = r0.s(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00c1
            r0 = r11[r8]
            int r9 = r9 - r0
            r0 = r11[r12]
            int r10 = r10 - r0
        L_0x00c1:
            if (r13 == 0) goto L_0x00c5
            r0 = r9
            goto L_0x00c6
        L_0x00c5:
            r0 = r8
        L_0x00c6:
            if (r14 == 0) goto L_0x00ca
            r1 = r10
            goto L_0x00cb
        L_0x00ca:
            r1 = r8
        L_0x00cb:
            r15.Y(r0, r1, r7, r12)
            androidx.recyclerview.widget.m r0 = r6.B0
            if (r0 == 0) goto L_0x00d9
            if (r9 != 0) goto L_0x00d6
            if (r10 == 0) goto L_0x00d9
        L_0x00d6:
            r0.a(r15, r9, r10)
        L_0x00d9:
            r15.f0(r12)
        L_0x00dc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.T) {
            return false;
        }
        this.N = null;
        if (C(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        m mVar = this.I;
        if (mVar == null) {
            return false;
        }
        boolean d10 = mVar.d();
        boolean e10 = this.I.e();
        if (this.f2420o0 == null) {
            this.f2420o0 = VelocityTracker.obtain();
        }
        this.f2420o0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.U) {
                this.U = false;
            }
            this.f2419n0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f2423r0 = x10;
            this.f2421p0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f2424s0 = y10;
            this.f2422q0 = y10;
            if (this.f2418m0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                f0(1);
            }
            int[] iArr = this.O0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (e10) {
                d10 |= true;
            }
            getScrollingChildHelper().g(d10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f2420o0.clear();
            f0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2419n0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2419n0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2418m0 != 1) {
                int i8 = x11 - this.f2421p0;
                int i10 = y11 - this.f2422q0;
                if (!d10 || Math.abs(i8) <= this.f2425t0) {
                    z10 = false;
                } else {
                    this.f2423r0 = x11;
                    z10 = true;
                }
                if (e10 && Math.abs(i10) > this.f2425t0) {
                    this.f2424s0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2419n0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2423r0 = x12;
            this.f2421p0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2424s0 = y12;
            this.f2422q0 = y12;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f2418m0 == 1;
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        int i13 = y1.k.f17122a;
        k.a.a("RV OnLayout");
        p();
        k.a.b();
        this.Q = true;
    }

    public final void onMeasure(int i8, int i10) {
        m mVar = this.I;
        if (mVar == null) {
            n(i8, i10);
            return;
        }
        boolean M2 = mVar.M();
        boolean z10 = false;
        y yVar = this.D0;
        if (M2) {
            int mode = View.MeasureSpec.getMode(i8);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.I.f2472b.n(i8, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.S0 = z10;
            if (!z10 && this.H != null) {
                if (yVar.f2529d == 1) {
                    q();
                }
                this.I.t0(i8, i10);
                yVar.f2534i = true;
                r();
                this.I.v0(i8, i10);
                if (this.I.y0()) {
                    this.I.t0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    yVar.f2534i = true;
                    r();
                    this.I.v0(i8, i10);
                }
                this.T0 = getMeasuredWidth();
                this.U0 = getMeasuredHeight();
            }
        } else if (this.P) {
            this.I.f2472b.n(i8, i10);
        } else {
            if (this.W) {
                d0();
                P();
                T();
                Q(true);
                if (yVar.f2536k) {
                    yVar.f2532g = true;
                } else {
                    this.f2407d.c();
                    yVar.f2532g = false;
                }
                this.W = false;
                e0(false);
            } else if (yVar.f2536k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.H;
            if (eVar != null) {
                yVar.f2530e = eVar.d();
            } else {
                yVar.f2530e = 0;
            }
            d0();
            this.I.f2472b.n(i8, i10);
            e0(false);
            yVar.f2532g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i8, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        this.f2405c = wVar;
        super.onRestoreInstanceState(wVar.f10267a);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        w wVar = new w(super.onSaveInstanceState());
        w wVar2 = this.f2405c;
        if (wVar2 != null) {
            wVar.f2510c = wVar2.f2510c;
        } else {
            m mVar = this.I;
            if (mVar != null) {
                wVar.f2510c = mVar.g0();
            } else {
                wVar.f2510c = null;
            }
        }
        return wVar;
    }

    public final void onSizeChanged(int i8, int i10, int i11, int i12) {
        super.onSizeChanged(i8, i10, i11, i12);
        if (i8 != i11 || i10 != i12) {
            this.f2416k0 = null;
            this.f2414i0 = null;
            this.f2415j0 = null;
            this.f2413h0 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:209:0x033b, code lost:
        if (r0 < r8) goto L_0x033e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r26) {
        /*
            r25 = this;
            r6 = r25
            r7 = r26
            boolean r0 = r6.T
            r8 = 0
            if (r0 != 0) goto L_0x03fb
            boolean r0 = r6.U
            if (r0 == 0) goto L_0x000f
            goto L_0x03fb
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$q r0 = r6.N
            r1 = 0
            r9 = 1
            r2 = 3
            if (r0 != 0) goto L_0x0023
            int r0 = r26.getAction()
            if (r0 != 0) goto L_0x001e
            r0 = r8
            goto L_0x0031
        L_0x001e:
            boolean r0 = r25.C(r26)
            goto L_0x0031
        L_0x0023:
            r0.a(r7)
            int r0 = r26.getAction()
            if (r0 == r2) goto L_0x002e
            if (r0 != r9) goto L_0x0030
        L_0x002e:
            r6.N = r1
        L_0x0030:
            r0 = r9
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r25.X()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.I
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.d()
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.I
            boolean r11 = r0.e()
            android.view.VelocityTracker r0 = r6.f2420o0
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f2420o0 = r0
        L_0x0053:
            int r0 = r26.getActionMasked()
            int r3 = r26.getActionIndex()
            int[] r12 = r6.O0
            if (r0 != 0) goto L_0x0063
            r12[r9] = r8
            r12[r8] = r8
        L_0x0063:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r26)
            r4 = r12[r8]
            float r4 = (float) r4
            r5 = r12[r9]
            float r5 = (float) r5
            r13.offsetLocation(r4, r5)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x03bf
            r5 = 2
            java.lang.String r14 = "RecyclerView"
            if (r0 == r9) goto L_0x0198
            if (r0 == r5) goto L_0x00ae
            if (r0 == r2) goto L_0x00a6
            r1 = 5
            if (r0 == r1) goto L_0x008a
            r1 = 6
            if (r0 == r1) goto L_0x0085
            goto L_0x0193
        L_0x0085:
            r25.R(r26)
            goto L_0x0193
        L_0x008a:
            int r0 = r7.getPointerId(r3)
            r6.f2419n0 = r0
            float r0 = r7.getX(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f2423r0 = r0
            r6.f2421p0 = r0
            float r0 = r7.getY(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f2424s0 = r0
            r6.f2422q0 = r0
            goto L_0x0193
        L_0x00a6:
            r25.X()
            r6.setScrollState(r8)
            goto L_0x0193
        L_0x00ae:
            int r0 = r6.f2419n0
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00cf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.<init>(r1)
            int r1 = r6.f2419n0
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r14, r0)
            return r8
        L_0x00cf:
            float r1 = r7.getX(r0)
            float r1 = r1 + r4
            int r14 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r4
            int r15 = (int) r0
            int r0 = r6.f2423r0
            int r0 = r0 - r14
            int r1 = r6.f2424s0
            int r1 = r1 - r15
            int r2 = r6.f2418m0
            if (r2 == r9) goto L_0x0118
            if (r10 == 0) goto L_0x00fc
            if (r0 <= 0) goto L_0x00f1
            int r2 = r6.f2425t0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00f8
        L_0x00f1:
            int r2 = r6.f2425t0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00f8:
            if (r0 == 0) goto L_0x00fc
            r2 = r9
            goto L_0x00fd
        L_0x00fc:
            r2 = r8
        L_0x00fd:
            if (r11 == 0) goto L_0x0113
            if (r1 <= 0) goto L_0x0109
            int r3 = r6.f2425t0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x0110
        L_0x0109:
            int r3 = r6.f2425t0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x0110:
            if (r1 == 0) goto L_0x0113
            r2 = r9
        L_0x0113:
            if (r2 == 0) goto L_0x0118
            r6.setScrollState(r9)
        L_0x0118:
            r16 = r0
            r17 = r1
            int r0 = r6.f2418m0
            if (r0 != r9) goto L_0x0193
            int[] r5 = r6.P0
            r5[r8] = r8
            r5[r9] = r8
            if (r10 == 0) goto L_0x012b
            r1 = r16
            goto L_0x012c
        L_0x012b:
            r1 = r8
        L_0x012c:
            if (r11 == 0) goto L_0x0131
            r2 = r17
            goto L_0x0132
        L_0x0131:
            r2 = r8
        L_0x0132:
            int[] r4 = r6.N0
            r3 = 0
            r0 = r25
            r18 = r4
            r4 = r5
            r19 = r5
            r5 = r18
            boolean r0 = r0.s(r1, r2, r3, r4, r5)
            int[] r1 = r6.N0
            if (r0 == 0) goto L_0x0163
            r0 = r19[r8]
            int r16 = r16 - r0
            r0 = r19[r9]
            int r17 = r17 - r0
            r0 = r12[r8]
            r2 = r1[r8]
            int r0 = r0 + r2
            r12[r8] = r0
            r0 = r12[r9]
            r2 = r1[r9]
            int r0 = r0 + r2
            r12[r9] = r0
            android.view.ViewParent r0 = r25.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0163:
            r0 = r16
            r2 = r17
            r3 = r1[r8]
            int r14 = r14 - r3
            r6.f2423r0 = r14
            r1 = r1[r9]
            int r15 = r15 - r1
            r6.f2424s0 = r15
            if (r10 == 0) goto L_0x0175
            r1 = r0
            goto L_0x0176
        L_0x0175:
            r1 = r8
        L_0x0176:
            if (r11 == 0) goto L_0x017a
            r3 = r2
            goto L_0x017b
        L_0x017a:
            r3 = r8
        L_0x017b:
            boolean r1 = r6.Y(r1, r3, r7, r8)
            if (r1 == 0) goto L_0x0188
            android.view.ViewParent r1 = r25.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0188:
            androidx.recyclerview.widget.m r1 = r6.B0
            if (r1 == 0) goto L_0x0193
            if (r0 != 0) goto L_0x0190
            if (r2 == 0) goto L_0x0193
        L_0x0190:
            r1.a(r6, r0, r2)
        L_0x0193:
            r0 = r6
            r20 = r13
            goto L_0x03e9
        L_0x0198:
            android.view.VelocityTracker r0 = r6.f2420o0
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r6.f2420o0
            int r2 = r6.f2428w0
            float r3 = (float) r2
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4, r3)
            r0 = 0
            if (r10 == 0) goto L_0x01b4
            android.view.VelocityTracker r3 = r6.f2420o0
            int r4 = r6.f2419n0
            float r3 = r3.getXVelocity(r4)
            float r3 = -r3
            goto L_0x01b5
        L_0x01b4:
            r3 = r0
        L_0x01b5:
            if (r11 == 0) goto L_0x01c1
            android.view.VelocityTracker r4 = r6.f2420o0
            int r7 = r6.f2419n0
            float r4 = r4.getYVelocity(r7)
            float r4 = -r4
            goto L_0x01c2
        L_0x01c1:
            r4 = r0
        L_0x01c2:
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x01d1
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x01cb
            goto L_0x01d1
        L_0x01cb:
            r0 = r6
            r1 = r8
            r20 = r13
            goto L_0x03b7
        L_0x01d1:
            int r3 = (int) r3
            int r4 = (int) r4
            androidx.recyclerview.widget.RecyclerView$m r7 = r6.I
            if (r7 != 0) goto L_0x01dd
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r14, r0)
            goto L_0x0204
        L_0x01dd:
            boolean r10 = r6.T
            if (r10 == 0) goto L_0x01e2
            goto L_0x0204
        L_0x01e2:
            boolean r7 = r7.d()
            androidx.recyclerview.widget.RecyclerView$m r10 = r6.I
            boolean r10 = r10.e()
            int r11 = r6.f2427v0
            if (r7 == 0) goto L_0x01f6
            int r12 = java.lang.Math.abs(r3)
            if (r12 >= r11) goto L_0x01f7
        L_0x01f6:
            r3 = r8
        L_0x01f7:
            if (r10 == 0) goto L_0x01ff
            int r12 = java.lang.Math.abs(r4)
            if (r12 >= r11) goto L_0x0200
        L_0x01ff:
            r4 = r8
        L_0x0200:
            if (r3 != 0) goto L_0x0209
            if (r4 != 0) goto L_0x0209
        L_0x0204:
            r0 = r6
            r20 = r13
            goto L_0x03b4
        L_0x0209:
            float r11 = (float) r3
            float r12 = (float) r4
            boolean r14 = r6.dispatchNestedPreFling(r11, r12)
            if (r14 != 0) goto L_0x03b0
            if (r7 != 0) goto L_0x0218
            if (r10 == 0) goto L_0x0216
            goto L_0x0218
        L_0x0216:
            r14 = r8
            goto L_0x0219
        L_0x0218:
            r14 = r9
        L_0x0219:
            r6.dispatchNestedFling(r11, r12, r14)
            androidx.recyclerview.widget.RecyclerView$p r11 = r6.f2426u0
            if (r11 == 0) goto L_0x0354
            androidx.recyclerview.widget.b0 r11 = (androidx.recyclerview.widget.b0) r11
            androidx.recyclerview.widget.RecyclerView r12 = r11.f2588a
            androidx.recyclerview.widget.RecyclerView$m r12 = r12.getLayoutManager()
            if (r12 != 0) goto L_0x022b
            goto L_0x0233
        L_0x022b:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f2588a
            androidx.recyclerview.widget.RecyclerView$e r15 = r15.getAdapter()
            if (r15 != 0) goto L_0x0237
        L_0x0233:
            r20 = r13
            goto L_0x034e
        L_0x0237:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f2588a
            int r15 = r15.getMinFlingVelocity()
            int r1 = java.lang.Math.abs(r4)
            if (r1 > r15) goto L_0x024e
            int r1 = java.lang.Math.abs(r3)
            if (r1 <= r15) goto L_0x024a
            goto L_0x024e
        L_0x024a:
            r20 = r13
            goto L_0x034d
        L_0x024e:
            boolean r1 = r12 instanceof androidx.recyclerview.widget.RecyclerView.x.b
            if (r1 != 0) goto L_0x0253
            goto L_0x0266
        L_0x0253:
            androidx.recyclerview.widget.v r11 = (androidx.recyclerview.widget.v) r11
            if (r1 != 0) goto L_0x0259
            r15 = 0
            goto L_0x0264
        L_0x0259:
            androidx.recyclerview.widget.u r15 = new androidx.recyclerview.widget.u
            androidx.recyclerview.widget.RecyclerView r8 = r11.f2588a
            android.content.Context r8 = r8.getContext()
            r15.<init>(r11, r8)
        L_0x0264:
            if (r15 != 0) goto L_0x026a
        L_0x0266:
            r20 = r13
            goto L_0x0341
        L_0x026a:
            androidx.recyclerview.widget.RecyclerView r8 = r12.f2472b
            if (r8 == 0) goto L_0x0273
            androidx.recyclerview.widget.RecyclerView$e r8 = r8.getAdapter()
            goto L_0x0274
        L_0x0273:
            r8 = 0
        L_0x0274:
            if (r8 == 0) goto L_0x027b
            int r8 = r8.d()
            goto L_0x027c
        L_0x027b:
            r8 = 0
        L_0x027c:
            if (r8 != 0) goto L_0x027f
            goto L_0x0298
        L_0x027f:
            boolean r19 = r12.e()
            if (r19 == 0) goto L_0x028a
            androidx.recyclerview.widget.t r11 = r11.h(r12)
            goto L_0x0296
        L_0x028a:
            boolean r19 = r12.d()
            if (r19 == 0) goto L_0x0295
            androidx.recyclerview.widget.t r11 = r11.g(r12)
            goto L_0x0296
        L_0x0295:
            r11 = 0
        L_0x0296:
            if (r11 != 0) goto L_0x029c
        L_0x0298:
            r20 = r13
            goto L_0x033d
        L_0x029c:
            int r5 = r12.w()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r9 = r19
            r0 = 0
            r21 = 0
            r22 = 0
            r24 = r20
            r20 = r13
            r13 = r24
        L_0x02b2:
            if (r0 >= r5) goto L_0x02d6
            r23 = r5
            android.view.View r5 = r12.v(r0)
            if (r5 != 0) goto L_0x02bd
            goto L_0x02cf
        L_0x02bd:
            int r6 = androidx.recyclerview.widget.v.e(r5, r11)
            if (r6 > 0) goto L_0x02c8
            if (r6 <= r9) goto L_0x02c8
            r22 = r5
            r9 = r6
        L_0x02c8:
            if (r6 < 0) goto L_0x02cf
            if (r6 >= r13) goto L_0x02cf
            r21 = r5
            r13 = r6
        L_0x02cf:
            int r0 = r0 + 1
            r6 = r25
            r5 = r23
            goto L_0x02b2
        L_0x02d6:
            boolean r0 = r12.d()
            if (r0 == 0) goto L_0x02df
            if (r3 <= 0) goto L_0x02e3
            goto L_0x02e1
        L_0x02df:
            if (r4 <= 0) goto L_0x02e3
        L_0x02e1:
            r0 = 1
            goto L_0x02e4
        L_0x02e3:
            r0 = 0
        L_0x02e4:
            if (r0 == 0) goto L_0x02ed
            if (r21 == 0) goto L_0x02ed
            int r0 = androidx.recyclerview.widget.RecyclerView.m.G(r21)
            goto L_0x033e
        L_0x02ed:
            if (r0 != 0) goto L_0x02f6
            if (r22 == 0) goto L_0x02f6
            int r0 = androidx.recyclerview.widget.RecyclerView.m.G(r22)
            goto L_0x033e
        L_0x02f6:
            if (r0 == 0) goto L_0x02fa
            r21 = r22
        L_0x02fa:
            if (r21 != 0) goto L_0x02fd
            goto L_0x033d
        L_0x02fd:
            int r5 = androidx.recyclerview.widget.RecyclerView.m.G(r21)
            androidx.recyclerview.widget.RecyclerView r6 = r12.f2472b
            if (r6 == 0) goto L_0x030c
            androidx.recyclerview.widget.RecyclerView$e r6 = r6.getAdapter()
            r16 = r6
            goto L_0x030e
        L_0x030c:
            r16 = 0
        L_0x030e:
            if (r16 == 0) goto L_0x0315
            int r6 = r16.d()
            goto L_0x0316
        L_0x0315:
            r6 = 0
        L_0x0316:
            if (r1 == 0) goto L_0x0332
            r1 = r12
            androidx.recyclerview.widget.RecyclerView$x$b r1 = (androidx.recyclerview.widget.RecyclerView.x.b) r1
            r9 = 1
            int r6 = r6 - r9
            android.graphics.PointF r1 = r1.a(r6)
            if (r1 == 0) goto L_0x0332
            float r6 = r1.x
            r9 = 0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0330
            float r1 = r1.y
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0332
        L_0x0330:
            r1 = 1
            goto L_0x0333
        L_0x0332:
            r1 = 0
        L_0x0333:
            if (r1 != r0) goto L_0x0337
            r0 = -1
            goto L_0x0338
        L_0x0337:
            r0 = 1
        L_0x0338:
            int r0 = r0 + r5
            if (r0 < 0) goto L_0x033d
            if (r0 < r8) goto L_0x033e
        L_0x033d:
            r0 = -1
        L_0x033e:
            r1 = -1
            if (r0 != r1) goto L_0x0343
        L_0x0341:
            r0 = 0
            goto L_0x0349
        L_0x0343:
            r15.f2511a = r0
            r12.B0(r15)
            r0 = 1
        L_0x0349:
            if (r0 == 0) goto L_0x034d
            r8 = 1
            goto L_0x034e
        L_0x034d:
            r8 = 0
        L_0x034e:
            if (r8 == 0) goto L_0x0356
            r8 = 1
            r0 = r25
            goto L_0x03b4
        L_0x0354:
            r20 = r13
        L_0x0356:
            if (r14 == 0) goto L_0x03ad
            if (r10 == 0) goto L_0x035c
            r7 = r7 | 2
        L_0x035c:
            d2.v r0 = r25.getScrollingChildHelper()
            r1 = 1
            r0.g(r7, r1)
            int r0 = -r2
            int r1 = java.lang.Math.min(r3, r2)
            int r8 = java.lang.Math.max(r0, r1)
            int r1 = java.lang.Math.min(r4, r2)
            int r9 = java.lang.Math.max(r0, r1)
            r0 = r25
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r0.A0
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
            r3 = 2
            r2.setScrollState(r3)
            r3 = 0
            r1.f2434b = r3
            r1.f2433a = r3
            android.view.animation.Interpolator r3 = r1.f2436d
            androidx.recyclerview.widget.RecyclerView$c r4 = Y0
            if (r3 == r4) goto L_0x0397
            r1.f2436d = r4
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2, r4)
            r1.f2435c = r3
        L_0x0397:
            android.widget.OverScroller r5 = r1.f2435c
            r6 = 0
            r7 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = 2147483647(0x7fffffff, float:NaN)
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.a()
            r8 = 1
            goto L_0x03b4
        L_0x03ad:
            r0 = r25
            goto L_0x03b3
        L_0x03b0:
            r0 = r6
            r20 = r13
        L_0x03b3:
            r8 = 0
        L_0x03b4:
            if (r8 != 0) goto L_0x03ba
            r1 = 0
        L_0x03b7:
            r0.setScrollState(r1)
        L_0x03ba:
            r25.X()
            r8 = 1
            goto L_0x03ea
        L_0x03bf:
            r0 = r6
            r1 = r8
            r20 = r13
            int r2 = r7.getPointerId(r1)
            r0.f2419n0 = r2
            float r1 = r26.getX()
            float r1 = r1 + r4
            int r1 = (int) r1
            r0.f2423r0 = r1
            r0.f2421p0 = r1
            float r1 = r26.getY()
            float r1 = r1 + r4
            int r1 = (int) r1
            r0.f2424s0 = r1
            r0.f2422q0 = r1
            if (r11 == 0) goto L_0x03e1
            r10 = r10 | 2
        L_0x03e1:
            d2.v r1 = r25.getScrollingChildHelper()
            r2 = 0
            r1.g(r10, r2)
        L_0x03e9:
            r8 = 0
        L_0x03ea:
            if (r8 != 0) goto L_0x03f4
            android.view.VelocityTracker r1 = r0.f2420o0
            r2 = r20
            r1.addMovement(r2)
            goto L_0x03f6
        L_0x03f4:
            r2 = r20
        L_0x03f6:
            r2.recycle()
            r1 = 1
            return r1
        L_0x03fb:
            r0 = r6
            r1 = r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0353, code lost:
        if (r0.f2409e.j(getFocusedChild()) == false) goto L_0x0409;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r17 = this;
            r0 = r17
            androidx.recyclerview.widget.RecyclerView$e r1 = r0.H
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.w(r2, r1)
            return
        L_0x000e:
            androidx.recyclerview.widget.RecyclerView$m r1 = r0.I
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView$y r1 = r0.D0
            r3 = 0
            r1.f2534i = r3
            boolean r4 = r0.S0
            r5 = 1
            if (r4 == 0) goto L_0x0034
            int r4 = r0.T0
            int r6 = r17.getWidth()
            if (r4 != r6) goto L_0x0032
            int r4 = r0.U0
            int r6 = r17.getHeight()
            if (r4 == r6) goto L_0x0034
        L_0x0032:
            r4 = r5
            goto L_0x0035
        L_0x0034:
            r4 = r3
        L_0x0035:
            r0.T0 = r3
            r0.U0 = r3
            r0.S0 = r3
            int r6 = r1.f2529d
            if (r6 != r5) goto L_0x004b
            r17.q()
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.I
            r3.s0(r0)
            r17.r()
            goto L_0x0085
        L_0x004b:
            androidx.recyclerview.widget.a r6 = r0.f2407d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r7 = r6.f2578c
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x005e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r6.f2577b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x005e
            r3 = r5
        L_0x005e:
            if (r3 != 0) goto L_0x007d
            if (r4 != 0) goto L_0x007d
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.I
            int r3 = r3.f2483n
            int r4 = r17.getWidth()
            if (r3 != r4) goto L_0x007d
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.I
            int r3 = r3.f2484o
            int r4 = r17.getHeight()
            if (r3 == r4) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.I
            r3.s0(r0)
            goto L_0x0085
        L_0x007d:
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.I
            r3.s0(r0)
            r17.r()
        L_0x0085:
            r3 = 4
            r1.a(r3)
            r17.d0()
            r17.P()
            r1.f2529d = r5
            boolean r4 = r1.f2535j
            r6 = 0
            androidx.recyclerview.widget.RecyclerView$t r7 = r0.f2403b
            androidx.recyclerview.widget.d0 r8 = r0.B
            if (r4 == 0) goto L_0x02c3
            androidx.recyclerview.widget.d r4 = r0.f2409e
            int r4 = r4.e()
            int r4 = r4 - r5
        L_0x00a1:
            if (r4 < 0) goto L_0x01cf
            androidx.recyclerview.widget.d r9 = r0.f2409e
            android.view.View r9 = r9.d(r4)
            androidx.recyclerview.widget.RecyclerView$b0 r9 = J(r9)
            boolean r10 = r9.p()
            if (r10 == 0) goto L_0x00b5
            goto L_0x01ca
        L_0x00b5:
            long r10 = r0.H(r9)
            androidx.recyclerview.widget.RecyclerView$j r12 = r0.f2417l0
            r12.getClass()
            androidx.recyclerview.widget.RecyclerView$j$c r12 = new androidx.recyclerview.widget.RecyclerView$j$c
            r12.<init>()
            r12.a(r9)
            o.d<androidx.recyclerview.widget.RecyclerView$b0> r13 = r8.f2610b
            java.lang.Object r13 = r13.g(r6, r10)
            androidx.recyclerview.widget.RecyclerView$b0 r13 = (androidx.recyclerview.widget.RecyclerView.b0) r13
            if (r13 == 0) goto L_0x01c7
            boolean r14 = r13.p()
            if (r14 != 0) goto L_0x01c7
            o.f<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.d0$a> r14 = r8.f2609a
            java.lang.Object r15 = r14.getOrDefault(r13, r6)
            androidx.recyclerview.widget.d0$a r15 = (androidx.recyclerview.widget.d0.a) r15
            if (r15 == 0) goto L_0x00e7
            int r15 = r15.f2612a
            r15 = r15 & r5
            if (r15 == 0) goto L_0x00e7
            r15 = r5
            goto L_0x00e8
        L_0x00e7:
            r15 = 0
        L_0x00e8:
            java.lang.Object r14 = r14.getOrDefault(r9, r6)
            androidx.recyclerview.widget.d0$a r14 = (androidx.recyclerview.widget.d0.a) r14
            if (r14 == 0) goto L_0x00f6
            int r14 = r14.f2612a
            r14 = r14 & r5
            if (r14 == 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r5 = 0
        L_0x00f7:
            if (r15 == 0) goto L_0x0100
            if (r13 != r9) goto L_0x0100
            r8.a(r9, r12)
            goto L_0x01ca
        L_0x0100:
            androidx.recyclerview.widget.RecyclerView$j$c r14 = r8.b(r13, r3)
            r8.a(r9, r12)
            r12 = 8
            androidx.recyclerview.widget.RecyclerView$j$c r12 = r8.b(r9, r12)
            if (r14 != 0) goto L_0x019d
            androidx.recyclerview.widget.d r5 = r0.f2409e
            int r5 = r5.e()
            r12 = 0
        L_0x0116:
            if (r12 >= r5) goto L_0x017c
            androidx.recyclerview.widget.d r14 = r0.f2409e
            android.view.View r14 = r14.d(r12)
            androidx.recyclerview.widget.RecyclerView$b0 r14 = J(r14)
            if (r14 != r9) goto L_0x0125
            goto L_0x0179
        L_0x0125:
            long r15 = r0.H(r14)
            int r15 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r15 != 0) goto L_0x0179
            androidx.recyclerview.widget.RecyclerView$e r1 = r0.H
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x0158
            boolean r1 = r1.f2460b
            if (r1 == 0) goto L_0x0158
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r17.z()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0158:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r17.z()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0179:
            int r12 = r12 + 1
            goto L_0x0116
        L_0x017c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r5.<init>(r10)
            r5.append(r13)
            java.lang.String r10 = " cannot be found but it is necessary for "
            r5.append(r10)
            r5.append(r9)
            java.lang.String r9 = r17.z()
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L_0x01ca
        L_0x019d:
            r10 = 0
            r13.o(r10)
            if (r15 == 0) goto L_0x01a6
            r0.f(r13)
        L_0x01a6:
            if (r13 == r9) goto L_0x01bb
            if (r5 == 0) goto L_0x01ad
            r0.f(r9)
        L_0x01ad:
            r13.f2447h = r9
            r0.f(r13)
            r7.j(r13)
            r5 = 0
            r9.o(r5)
            r9.f2448i = r13
        L_0x01bb:
            androidx.recyclerview.widget.RecyclerView$j r5 = r0.f2417l0
            boolean r5 = r5.b(r13, r9, r14, r12)
            if (r5 == 0) goto L_0x01ca
            r17.S()
            goto L_0x01ca
        L_0x01c7:
            r8.a(r9, r12)
        L_0x01ca:
            int r4 = r4 + -1
            r5 = 1
            goto L_0x00a1
        L_0x01cf:
            o.f<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.d0$a> r2 = r8.f2609a
            int r3 = r2.f12032c
        L_0x01d3:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x02c3
            java.lang.Object r4 = r2.i(r3)
            androidx.recyclerview.widget.RecyclerView$b0 r4 = (androidx.recyclerview.widget.RecyclerView.b0) r4
            java.lang.Object r5 = r2.k(r3)
            androidx.recyclerview.widget.d0$a r5 = (androidx.recyclerview.widget.d0.a) r5
            int r9 = r5.f2612a
            r10 = r9 & 3
            r11 = 3
            androidx.recyclerview.widget.RecyclerView$d r12 = r0.V0
            if (r10 != r11) goto L_0x01f9
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$m r10 = r9.I
            android.view.View r4 = r4.f2440a
            androidx.recyclerview.widget.RecyclerView$t r9 = r9.f2403b
            r10.l0(r4, r9)
            goto L_0x02b5
        L_0x01f9:
            r10 = r9 & 1
            if (r10 == 0) goto L_0x022b
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r5.f2613b
            if (r9 != 0) goto L_0x020e
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$m r10 = r9.I
            android.view.View r4 = r4.f2440a
            androidx.recyclerview.widget.RecyclerView$t r9 = r9.f2403b
            r10.l0(r4, r9)
            goto L_0x02b5
        L_0x020e:
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r5.f2614c
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$t r12 = r11.f2403b
            r12.j(r4)
            r11.f(r4)
            r12 = 0
            r4.o(r12)
            androidx.recyclerview.widget.RecyclerView$j r12 = r11.f2417l0
            boolean r4 = r12.c(r4, r9, r10)
            if (r4 == 0) goto L_0x02b5
            r11.S()
            goto L_0x02b5
        L_0x022b:
            r10 = r9 & 14
            r11 = 14
            if (r10 != r11) goto L_0x024a
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r5.f2613b
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r5.f2614c
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            r11.getClass()
            r12 = 0
            r4.o(r12)
            androidx.recyclerview.widget.RecyclerView$j r12 = r11.f2417l0
            boolean r4 = r12.a(r4, r9, r10)
            if (r4 == 0) goto L_0x02b5
            r11.S()
            goto L_0x02b5
        L_0x024a:
            r10 = r9 & 12
            r11 = 12
            if (r10 != r11) goto L_0x0279
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r5.f2613b
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r5.f2614c
            r12.getClass()
            r11 = 0
            r4.o(r11)
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            boolean r12 = r11.f2406c0
            if (r12 == 0) goto L_0x026d
            androidx.recyclerview.widget.RecyclerView$j r12 = r11.f2417l0
            boolean r4 = r12.b(r4, r4, r9, r10)
            if (r4 == 0) goto L_0x02b5
            r11.S()
            goto L_0x02b5
        L_0x026d:
            androidx.recyclerview.widget.RecyclerView$j r12 = r11.f2417l0
            boolean r4 = r12.d(r4, r9, r10)
            if (r4 == 0) goto L_0x02b5
            r11.S()
            goto L_0x02b5
        L_0x0279:
            r10 = r9 & 4
            if (r10 == 0) goto L_0x0299
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r5.f2613b
            androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$t r11 = r10.f2403b
            r11.j(r4)
            r10.f(r4)
            r11 = 0
            r4.o(r11)
            androidx.recyclerview.widget.RecyclerView$j r11 = r10.f2417l0
            boolean r4 = r11.c(r4, r9, r6)
            if (r4 == 0) goto L_0x02b5
            r10.S()
            goto L_0x02b5
        L_0x0299:
            r9 = r9 & 8
            if (r9 == 0) goto L_0x02b5
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r5.f2613b
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r5.f2614c
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            r11.getClass()
            r12 = 0
            r4.o(r12)
            androidx.recyclerview.widget.RecyclerView$j r12 = r11.f2417l0
            boolean r4 = r12.a(r4, r9, r10)
            if (r4 == 0) goto L_0x02b5
            r11.S()
        L_0x02b5:
            r4 = 0
            r5.f2612a = r4
            r5.f2613b = r6
            r5.f2614c = r6
            c2.e r4 = androidx.recyclerview.widget.d0.a.f2611d
            r4.a(r5)
            goto L_0x01d3
        L_0x02c3:
            androidx.recyclerview.widget.RecyclerView$m r2 = r0.I
            r2.k0(r7)
            int r2 = r1.f2530e
            r1.f2527b = r2
            r2 = 0
            r0.f2406c0 = r2
            r0.f2408d0 = r2
            r1.f2535j = r2
            r1.f2536k = r2
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.I
            r3.f2476f = r2
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r3 = r7.f2502b
            if (r3 == 0) goto L_0x02e0
            r3.clear()
        L_0x02e0:
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.I
            boolean r4 = r3.f2481k
            if (r4 == 0) goto L_0x02ed
            r3.f2480j = r2
            r3.f2481k = r2
            r7.k()
        L_0x02ed:
            androidx.recyclerview.widget.RecyclerView$m r3 = r0.I
            r3.e0(r1)
            r3 = 1
            r0.Q(r3)
            r0.e0(r2)
            o.f<androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.d0$a> r4 = r8.f2609a
            r4.clear()
            o.d<androidx.recyclerview.widget.RecyclerView$b0> r4 = r8.f2610b
            r4.a()
            int[] r4 = r0.L0
            r5 = r4[r2]
            r7 = r4[r3]
            r0.D(r4)
            r8 = r4[r2]
            if (r8 != r5) goto L_0x0316
            r4 = r4[r3]
            if (r4 == r7) goto L_0x0315
            goto L_0x0316
        L_0x0315:
            r3 = r2
        L_0x0316:
            if (r3 == 0) goto L_0x031b
            r0.u(r2, r2)
        L_0x031b:
            boolean r3 = r0.f2431z0
            r4 = -1
            if (r3 == 0) goto L_0x0409
            androidx.recyclerview.widget.RecyclerView$e r3 = r0.H
            if (r3 == 0) goto L_0x0409
            boolean r3 = r17.hasFocus()
            if (r3 == 0) goto L_0x0409
            int r3 = r17.getDescendantFocusability()
            r7 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r7) goto L_0x0409
            int r3 = r17.getDescendantFocusability()
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r7) goto L_0x0343
            boolean r3 = r17.isFocused()
            if (r3 == 0) goto L_0x0343
            goto L_0x0409
        L_0x0343:
            boolean r3 = r17.isFocused()
            if (r3 != 0) goto L_0x0357
            android.view.View r3 = r17.getFocusedChild()
            androidx.recyclerview.widget.d r7 = r0.f2409e
            boolean r3 = r7.j(r3)
            if (r3 != 0) goto L_0x0357
            goto L_0x0409
        L_0x0357:
            long r7 = r1.m
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0399
            androidx.recyclerview.widget.RecyclerView$e r3 = r0.H
            boolean r3 = r3.f2460b
            if (r3 == 0) goto L_0x0399
            if (r3 != 0) goto L_0x0367
            r10 = r6
            goto L_0x0397
        L_0x0367:
            androidx.recyclerview.widget.d r3 = r0.f2409e
            int r3 = r3.h()
            r9 = r2
            r10 = r6
        L_0x036f:
            if (r9 >= r3) goto L_0x0397
            androidx.recyclerview.widget.d r11 = r0.f2409e
            android.view.View r11 = r11.g(r9)
            androidx.recyclerview.widget.RecyclerView$b0 r11 = J(r11)
            if (r11 == 0) goto L_0x0394
            boolean r12 = r11.j()
            if (r12 != 0) goto L_0x0394
            long r12 = r11.f2444e
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x0394
            androidx.recyclerview.widget.d r10 = r0.f2409e
            android.view.View r12 = r11.f2440a
            boolean r10 = r10.j(r12)
            if (r10 == 0) goto L_0x039a
            r10 = r11
        L_0x0394:
            int r9 = r9 + 1
            goto L_0x036f
        L_0x0397:
            r11 = r10
            goto L_0x039a
        L_0x0399:
            r11 = r6
        L_0x039a:
            if (r11 == 0) goto L_0x03af
            androidx.recyclerview.widget.d r3 = r0.f2409e
            android.view.View r7 = r11.f2440a
            boolean r3 = r3.j(r7)
            if (r3 != 0) goto L_0x03af
            boolean r3 = r7.hasFocusable()
            if (r3 != 0) goto L_0x03ad
            goto L_0x03af
        L_0x03ad:
            r6 = r7
            goto L_0x03f0
        L_0x03af:
            androidx.recyclerview.widget.d r3 = r0.f2409e
            int r3 = r3.e()
            if (r3 <= 0) goto L_0x03f0
            int r3 = r1.f2537l
            r7 = -1
            if (r3 == r7) goto L_0x03bd
            r2 = r3
        L_0x03bd:
            int r3 = r1.b()
            r7 = r2
        L_0x03c2:
            if (r7 >= r3) goto L_0x03d8
            androidx.recyclerview.widget.RecyclerView$b0 r8 = r0.F(r7)
            if (r8 != 0) goto L_0x03cb
            goto L_0x03d8
        L_0x03cb:
            android.view.View r8 = r8.f2440a
            boolean r9 = r8.hasFocusable()
            if (r9 == 0) goto L_0x03d5
            r6 = r8
            goto L_0x03f0
        L_0x03d5:
            int r7 = r7 + 1
            goto L_0x03c2
        L_0x03d8:
            int r2 = java.lang.Math.min(r3, r2)
        L_0x03dc:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x03f0
            androidx.recyclerview.widget.RecyclerView$b0 r3 = r0.F(r2)
            if (r3 != 0) goto L_0x03e7
            goto L_0x03f0
        L_0x03e7:
            android.view.View r3 = r3.f2440a
            boolean r7 = r3.hasFocusable()
            if (r7 == 0) goto L_0x03dc
            r6 = r3
        L_0x03f0:
            if (r6 == 0) goto L_0x0409
            int r2 = r1.f2538n
            long r7 = (long) r2
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0406
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L_0x0406
            boolean r3 = r2.isFocusable()
            if (r3 == 0) goto L_0x0406
            r6 = r2
        L_0x0406:
            r6.requestFocus()
        L_0x0409:
            r1.m = r4
            r2 = -1
            r1.f2537l = r2
            r1.f2538n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void q() {
        View B2;
        y yVar = this.D0;
        yVar.a(1);
        A(yVar);
        yVar.f2534i = false;
        d0();
        d0 d0Var = this.B;
        d0Var.f2609a.clear();
        d0Var.f2610b.a();
        P();
        T();
        View focusedChild = (!this.f2431z0 || !hasFocus() || this.H == null) ? null : getFocusedChild();
        b0 I2 = (focusedChild == null || (B2 = B(focusedChild)) == null) ? null : I(B2);
        long j10 = -1;
        if (I2 == null) {
            yVar.m = -1;
            yVar.f2537l = -1;
            yVar.f2538n = -1;
        } else {
            if (this.H.f2460b) {
                j10 = I2.f2444e;
            }
            yVar.m = j10;
            yVar.f2537l = this.f2406c0 ? -1 : I2.j() ? I2.f2443d : I2.c();
            View view = I2.f2440a;
            int id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id2 = view.getId();
                }
            }
            yVar.f2538n = id2;
        }
        yVar.f2533h = yVar.f2535j && this.H0;
        this.H0 = false;
        this.G0 = false;
        yVar.f2532g = yVar.f2536k;
        yVar.f2530e = this.H.d();
        D(this.L0);
        boolean z10 = yVar.f2535j;
        o.f<b0, d0.a> fVar = d0Var.f2609a;
        if (z10) {
            int e10 = this.f2409e.e();
            for (int i8 = 0; i8 < e10; i8++) {
                b0 J2 = J(this.f2409e.d(i8));
                if (!J2.p() && (!J2.h() || this.H.f2460b)) {
                    j jVar = this.f2417l0;
                    j.e(J2);
                    J2.e();
                    jVar.getClass();
                    j.c cVar = new j.c();
                    cVar.a(J2);
                    d0.a orDefault = fVar.getOrDefault(J2, null);
                    if (orDefault == null) {
                        orDefault = d0.a.a();
                        fVar.put(J2, orDefault);
                    }
                    orDefault.f2613b = cVar;
                    orDefault.f2612a |= 4;
                    if (yVar.f2533h) {
                        if (((J2.f2449j & 2) != 0) && !J2.j() && !J2.p() && !J2.h()) {
                            d0Var.f2610b.i(J2, H(J2));
                        }
                    }
                }
            }
        }
        if (yVar.f2536k) {
            int h3 = this.f2409e.h();
            for (int i10 = 0; i10 < h3; i10++) {
                b0 J3 = J(this.f2409e.g(i10));
                if (!J3.p() && J3.f2443d == -1) {
                    J3.f2443d = J3.f2442c;
                }
            }
            boolean z11 = yVar.f2531f;
            yVar.f2531f = false;
            this.I.d0(this.f2403b, yVar);
            yVar.f2531f = z11;
            for (int i11 = 0; i11 < this.f2409e.e(); i11++) {
                b0 J4 = J(this.f2409e.d(i11));
                if (!J4.p()) {
                    d0.a orDefault2 = fVar.getOrDefault(J4, null);
                    if (!((orDefault2 == null || (orDefault2.f2612a & 4) == 0) ? false : true)) {
                        j.e(J4);
                        boolean z12 = (J4.f2449j & 8192) != 0;
                        j jVar2 = this.f2417l0;
                        J4.e();
                        jVar2.getClass();
                        j.c cVar2 = new j.c();
                        cVar2.a(J4);
                        if (z12) {
                            V(J4, cVar2);
                        } else {
                            d0.a orDefault3 = fVar.getOrDefault(J4, null);
                            if (orDefault3 == null) {
                                orDefault3 = d0.a.a();
                                fVar.put(J4, orDefault3);
                            }
                            orDefault3.f2612a |= 2;
                            orDefault3.f2613b = cVar2;
                        }
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        e0(false);
        yVar.f2529d = 2;
    }

    public final void r() {
        d0();
        P();
        y yVar = this.D0;
        yVar.a(6);
        this.f2407d.c();
        yVar.f2530e = this.H.d();
        yVar.f2528c = 0;
        if (this.f2405c != null) {
            e eVar = this.H;
            int c3 = q.g.c(eVar.f2461c);
            if (c3 == 1 ? eVar.d() > 0 : c3 != 2) {
                Parcelable parcelable = this.f2405c.f2510c;
                if (parcelable != null) {
                    this.I.f0(parcelable);
                }
                this.f2405c = null;
            }
        }
        yVar.f2532g = false;
        this.I.d0(this.f2403b, yVar);
        yVar.f2531f = false;
        yVar.f2535j = yVar.f2535j && this.f2417l0 != null;
        yVar.f2529d = 4;
        Q(true);
        e0(false);
    }

    public final void removeDetachedView(View view, boolean z10) {
        b0 J2 = J(view);
        if (J2 != null) {
            if (J2.l()) {
                J2.f2449j &= -257;
            } else if (!J2.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + J2 + z());
            }
        }
        view.clearAnimation();
        o(view);
        super.removeDetachedView(view, z10);
    }

    public final void requestChildFocus(View view, View view2) {
        x xVar = this.I.f2475e;
        boolean z10 = true;
        if (!(xVar != null && xVar.f2515e) && !L()) {
            z10 = false;
        }
        if (!z10 && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.I.n0(this, view, rect, z10, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList<q> arrayList = this.M;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).b();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void requestLayout() {
        if (this.R != 0 || this.T) {
            this.S = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s(int i8, int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i8, i10, i11, iArr, iArr2);
    }

    public final void scrollBy(int i8, int i10) {
        m mVar = this.I;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.T) {
            boolean d10 = mVar.d();
            boolean e10 = this.I.e();
            if (d10 || e10) {
                if (!d10) {
                    i8 = 0;
                }
                if (!e10) {
                    i10 = 0;
                }
                Y(i8, i10, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i8, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i8 = 0;
        if (L()) {
            int a10 = accessibilityEvent != null ? e2.b.a(accessibilityEvent) : 0;
            if (a10 != 0) {
                i8 = a10;
            }
            this.V |= i8;
            i8 = 1;
        }
        if (i8 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(y yVar) {
        this.K0 = yVar;
        i0.n(this, yVar);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.H;
        v vVar = this.f2401a;
        if (eVar2 != null) {
            eVar2.f2459a.unregisterObserver(vVar);
            this.H.k(this);
        }
        j jVar = this.f2417l0;
        if (jVar != null) {
            jVar.i();
        }
        m mVar = this.I;
        t tVar = this.f2403b;
        if (mVar != null) {
            mVar.j0(tVar);
            this.I.k0(tVar);
        }
        tVar.f2501a.clear();
        tVar.d();
        a aVar = this.f2407d;
        aVar.l(aVar.f2577b);
        aVar.l(aVar.f2578c);
        aVar.f2581f = 0;
        e eVar3 = this.H;
        this.H = eVar;
        if (eVar != null) {
            eVar.o(vVar);
            eVar.h(this);
        }
        m mVar2 = this.I;
        if (mVar2 != null) {
            mVar2.R();
        }
        e eVar4 = this.H;
        tVar.f2501a.clear();
        tVar.d();
        s c3 = tVar.c();
        if (eVar3 != null) {
            c3.f2496b--;
        }
        if (c3.f2496b == 0) {
            int i8 = 0;
            while (true) {
                SparseArray<s.a> sparseArray = c3.f2495a;
                if (i8 >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i8).f2497a.clear();
                i8++;
            }
        }
        if (eVar4 != null) {
            c3.f2496b++;
        }
        this.D0.f2531f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.C) {
            this.f2416k0 = null;
            this.f2414i0 = null;
            this.f2415j0 = null;
            this.f2413h0 = null;
        }
        this.C = z10;
        super.setClipToPadding(z10);
        if (this.Q) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        iVar.getClass();
        this.f2412g0 = iVar;
        this.f2416k0 = null;
        this.f2414i0 = null;
        this.f2415j0 = null;
        this.f2413h0 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.P = z10;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.f2417l0;
        if (jVar2 != null) {
            jVar2.i();
            this.f2417l0.f2462a = null;
        }
        this.f2417l0 = jVar;
        if (jVar != null) {
            jVar.f2462a = this.I0;
        }
    }

    public void setItemViewCacheSize(int i8) {
        t tVar = this.f2403b;
        tVar.f2505e = i8;
        tVar.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(m mVar) {
        d.b bVar;
        RecyclerView recyclerView;
        x xVar;
        if (mVar != this.I) {
            int i8 = 0;
            setScrollState(0);
            a0 a0Var = this.A0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f2435c.abortAnimation();
            m mVar2 = this.I;
            if (!(mVar2 == null || (xVar = mVar2.f2475e) == null)) {
                xVar.d();
            }
            m mVar3 = this.I;
            t tVar = this.f2403b;
            if (mVar3 != null) {
                j jVar = this.f2417l0;
                if (jVar != null) {
                    jVar.i();
                }
                this.I.j0(tVar);
                this.I.k0(tVar);
                tVar.f2501a.clear();
                tVar.d();
                if (this.O) {
                    m mVar4 = this.I;
                    mVar4.f2477g = false;
                    mVar4.S(this);
                }
                this.I.w0((RecyclerView) null);
                this.I = null;
            } else {
                tVar.f2501a.clear();
                tVar.d();
            }
            d dVar = this.f2409e;
            dVar.f2605b.g();
            ArrayList arrayList = dVar.f2606c;
            int size = arrayList.size();
            while (true) {
                size--;
                bVar = dVar.f2604a;
                if (size < 0) {
                    break;
                }
                w wVar = (w) bVar;
                wVar.getClass();
                b0 J2 = J((View) arrayList.get(size));
                if (J2 != null) {
                    int i10 = J2.f2454p;
                    RecyclerView recyclerView2 = wVar.f2755a;
                    if (recyclerView2.L()) {
                        J2.f2455q = i10;
                        recyclerView2.Q0.add(J2);
                    } else {
                        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                        i0.d.s(J2.f2440a, i10);
                    }
                    J2.f2454p = 0;
                }
                arrayList.remove(size);
            }
            w wVar2 = (w) bVar;
            int a10 = wVar2.a();
            while (true) {
                recyclerView = wVar2.f2755a;
                if (i8 >= a10) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i8);
                recyclerView.o(childAt);
                childAt.clearAnimation();
                i8++;
            }
            recyclerView.removeAllViews();
            this.I = mVar;
            if (mVar != null) {
                if (mVar.f2472b == null) {
                    mVar.w0(this);
                    if (this.O) {
                        this.I.f2477g = true;
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + mVar + " is already attached to a RecyclerView:" + mVar.f2472b.z());
                }
            }
            tVar.k();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        d2.v scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f7283d) {
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i0.i.z(scrollingChildHelper.f7282c);
        }
        scrollingChildHelper.f7283d = z10;
    }

    public void setOnFlingListener(p pVar) {
        this.f2426u0 = pVar;
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.E0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2431z0 = z10;
    }

    public void setRecycledViewPool(s sVar) {
        t tVar = this.f2403b;
        s sVar2 = tVar.f2507g;
        if (sVar2 != null) {
            sVar2.f2496b--;
        }
        tVar.f2507g = sVar;
        if (sVar != null && RecyclerView.this.getAdapter() != null) {
            tVar.f2507g.f2496b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(u uVar) {
        this.J = uVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i8) {
        x xVar;
        if (i8 != this.f2418m0) {
            this.f2418m0 = i8;
            if (i8 != 2) {
                a0 a0Var = this.A0;
                RecyclerView.this.removeCallbacks(a0Var);
                a0Var.f2435c.abortAnimation();
                m mVar = this.I;
                if (!(mVar == null || (xVar = mVar.f2475e) == null)) {
                    xVar.d();
                }
            }
            m mVar2 = this.I;
            if (mVar2 != null) {
                mVar2.h0(i8);
            }
            r rVar = this.E0;
            if (rVar != null) {
                rVar.a(i8, this);
            }
            ArrayList arrayList = this.F0;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((r) this.F0.get(size)).a(i8, this);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i8) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i8 != 0) {
            if (i8 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i8 + "; using default value");
            } else {
                this.f2425t0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f2425t0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(z zVar) {
        this.f2403b.getClass();
    }

    public final boolean startNestedScroll(int i8) {
        return getScrollingChildHelper().g(i8, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void suppressLayout(boolean z10) {
        x xVar;
        if (z10 != this.T) {
            i("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.T = false;
                if (!(!this.S || this.I == null || this.H == null)) {
                    requestLayout();
                }
                this.S = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.T = true;
            this.U = true;
            setScrollState(0);
            a0 a0Var = this.A0;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f2435c.abortAnimation();
            m mVar = this.I;
            if (mVar != null && (xVar = mVar.f2475e) != null) {
                xVar.d();
            }
        }
    }

    public final void t(int i8, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().e(i8, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void u(int i8, int i10) {
        this.f2411f0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i8, scrollY - i10);
        r rVar = this.E0;
        if (rVar != null) {
            rVar.b(this, i8, i10);
        }
        ArrayList arrayList = this.F0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((r) this.F0.get(size)).b(this, i8, i10);
            }
        }
        this.f2411f0--;
    }

    public final void v() {
        if (this.f2416k0 == null) {
            this.f2412g0.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f2416k0 = edgeEffect;
            if (this.C) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void w() {
        if (this.f2413h0 == null) {
            this.f2412g0.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f2413h0 = edgeEffect;
            if (this.C) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void x() {
        if (this.f2415j0 == null) {
            this.f2412g0.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f2415j0 = edgeEffect;
            if (this.C) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void y() {
        if (this.f2414i0 == null) {
            this.f2412g0.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f2414i0 = edgeEffect;
            if (this.C) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final String z() {
        return " " + super.toString() + ", adapter:" + this.H + ", layout:" + this.I + ", context:" + getContext();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i10 = i8;
        this.f2401a = new v();
        this.f2403b = new t();
        this.B = new d0();
        this.D = new a();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        this.K = new ArrayList();
        this.L = new ArrayList<>();
        this.M = new ArrayList<>();
        this.R = 0;
        this.f2406c0 = false;
        this.f2408d0 = false;
        this.f2410e0 = 0;
        this.f2411f0 = 0;
        this.f2412g0 = new i();
        this.f2417l0 = new e();
        this.f2418m0 = 0;
        this.f2419n0 = -1;
        this.f2429x0 = Float.MIN_VALUE;
        this.f2430y0 = Float.MIN_VALUE;
        this.f2431z0 = true;
        this.A0 = new a0();
        this.C0 = new m.b();
        this.D0 = new y();
        this.G0 = false;
        this.H0 = false;
        k kVar = new k();
        this.I0 = kVar;
        this.J0 = false;
        char c3 = 2;
        this.L0 = new int[2];
        this.N0 = new int[2];
        this.O0 = new int[2];
        this.P0 = new int[2];
        this.Q0 = new ArrayList();
        this.R0 = new b();
        this.T0 = 0;
        this.U0 = 0;
        this.V0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2425t0 = viewConfiguration.getScaledTouchSlop();
        this.f2429x0 = v0.a(viewConfiguration);
        this.f2430y0 = v0.b(viewConfiguration);
        this.f2427v0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2428w0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2417l0.f2462a = kVar;
        this.f2407d = new a(new x(this));
        this.f2409e = new d(new w(this));
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.l.b(this) == 0) {
            i0.l.l(this, 8);
        }
        if (i0.d.c(this) == 0) {
            i0.d.s(this, 1);
        }
        this.f2402a0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new y(this));
        int[] iArr = b3.f1264d;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i10, 0);
        i0.m(this, context, iArr, attributeSet, obtainStyledAttributes, i8);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.C = obtainStyledAttributes.getBoolean(1, true);
        int i11 = 4;
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + z());
            }
            Resources resources = getContext().getResources();
            new l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            i11 = 4;
            c3 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(m.class);
                    try {
                        constructor = asSubclass.getConstructor(X0);
                        objArr = new Object[i11];
                        objArr[0] = context2;
                        objArr[1] = attributeSet2;
                        objArr[c3] = Integer.valueOf(i8);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e10) {
                        noSuchMethodException = e10;
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e16);
                }
            }
        }
        int[] iArr2 = W0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i10, 0);
        i0.m(this, context, iArr2, attributeSet, obtainStyledAttributes2, i8);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    public static class w extends k2.a {
        public static final Parcelable.Creator<w> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Parcelable f2510c;

        public class a implements Parcelable.ClassLoaderCreator<w> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new w(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new w[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new w(parcel, (ClassLoader) null);
            }
        }

        public w(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2510c = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeParcelable(this.f2510c, 0);
        }

        public w(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public b0 f2491a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f2492b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f2493c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2494d = false;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int a() {
            return this.f2491a.d();
        }

        public final boolean b() {
            return (this.f2491a.f2449j & 2) != 0;
        }

        public final boolean c() {
            return this.f2491a.j();
        }

        public n(int i8, int i10) {
            super(i8, i10);
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public n(n nVar) {
            super(nVar);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.I;
        if (mVar != null) {
            return mVar.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }
}
