package com.google.android.material.bottomsheet;

import ag.n2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.q;
import com.quickkonnect.silencio.R;
import d2.a;
import d2.d1;
import d2.i0;
import e2.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l2.c;
import m8.v;
import v8.f;
import v8.i;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public final BottomSheetBehavior<V>.e A = new e();
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F = 0.5f;
    public int G;
    public final float H = -1.0f;
    public boolean I;
    public boolean J;
    public boolean K = true;
    public int L = 4;
    public l2.c M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q = 0.1f;
    public int R;
    public int S;
    public int T;
    public WeakReference<V> U;
    public WeakReference<View> V;
    public final ArrayList<c> W = new ArrayList<>();
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f5746a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f5747a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5748b = true;

    /* renamed from: b0  reason: collision with root package name */
    public HashMap f5749b0;

    /* renamed from: c  reason: collision with root package name */
    public final float f5750c;

    /* renamed from: c0  reason: collision with root package name */
    public final SparseIntArray f5751c0 = new SparseIntArray();

    /* renamed from: d  reason: collision with root package name */
    public int f5752d;

    /* renamed from: d0  reason: collision with root package name */
    public final b f5753d0 = new b();

    /* renamed from: e  reason: collision with root package name */
    public int f5754e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5755f;

    /* renamed from: g  reason: collision with root package name */
    public int f5756g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5757h;

    /* renamed from: i  reason: collision with root package name */
    public f f5758i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f5759j;

    /* renamed from: k  reason: collision with root package name */
    public int f5760k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f5761l = -1;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5762n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5763o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5764p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f5765q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f5766r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f5767s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f5768t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f5769u;

    /* renamed from: v  reason: collision with root package name */
    public int f5770v;

    /* renamed from: w  reason: collision with root package name */
    public int f5771w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f5772x;

    /* renamed from: y  reason: collision with root package name */
    public final i f5773y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5774z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f5775a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f5776b;

        public a(View view, int i8) {
            this.f5775a = view;
            this.f5776b = i8;
        }

        public final void run() {
            BottomSheetBehavior.this.F(this.f5775a, this.f5776b, false);
        }
    }

    public class b extends c.C0205c {
        public b() {
        }

        public final int a(View view, int i8) {
            return view.getLeft();
        }

        public final int b(View view, int i8) {
            return b7.a.r(i8, BottomSheetBehavior.this.y(), d());
        }

        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
        }

        public final void h(int i8) {
            if (i8 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K) {
                    bottomSheetBehavior.D(1);
                }
            }
        }

        public final void i(View view, int i8, int i10) {
            BottomSheetBehavior.this.u(i10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
            if (java.lang.Math.abs(r5.getTop() - r3.y()) < java.lang.Math.abs(r5.getTop() - r3.E)) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
            if (java.lang.Math.abs(r6 - r3.E) < java.lang.Math.abs(r6 - r3.G)) goto L_0x00d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
            if (java.lang.Math.abs(r6 - r3.D) < java.lang.Math.abs(r6 - r3.G)) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
            if (r6 < java.lang.Math.abs(r6 - r3.G)) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
            if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r3.G)) goto L_0x00d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
            if (r6 > r3.E) goto L_0x00d5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 0
                int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                if (r1 >= 0) goto L_0x001b
                boolean r6 = r3.f5748b
                if (r6 == 0) goto L_0x000e
                goto L_0x00c4
            L_0x000e:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                int r7 = r3.E
                if (r6 <= r7) goto L_0x00c4
                goto L_0x00d5
            L_0x001b:
                boolean r1 = r3.I
                if (r1 == 0) goto L_0x0070
                boolean r1 = r3.E(r5, r7)
                if (r1 == 0) goto L_0x0070
                float r6 = java.lang.Math.abs(r6)
                float r0 = java.lang.Math.abs(r7)
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0038
                int r6 = r3.f5752d
                float r6 = (float) r6
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L_0x004c
            L_0x0038:
                int r6 = r5.getTop()
                int r7 = r3.T
                int r0 = r3.y()
                int r0 = r0 + r7
                int r0 = r0 / 2
                if (r6 <= r0) goto L_0x0049
                r6 = r2
                goto L_0x004a
            L_0x0049:
                r6 = 0
            L_0x004a:
                if (r6 == 0) goto L_0x004f
            L_0x004c:
                r6 = 5
                goto L_0x00d8
            L_0x004f:
                boolean r6 = r3.f5748b
                if (r6 == 0) goto L_0x0055
                goto L_0x00c4
            L_0x0055:
                int r6 = r5.getTop()
                int r7 = r3.y()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                int r0 = r3.E
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00d5
                goto L_0x00c4
            L_0x0070:
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x009c
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0081
                goto L_0x009c
            L_0x0081:
                boolean r6 = r3.f5748b
                if (r6 == 0) goto L_0x0086
                goto L_0x00d7
            L_0x0086:
                int r6 = r5.getTop()
                int r7 = r3.E
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00d7
                goto L_0x00d5
            L_0x009c:
                int r6 = r5.getTop()
                boolean r7 = r3.f5748b
                if (r7 == 0) goto L_0x00b6
                int r7 = r3.D
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00d7
                goto L_0x00c4
            L_0x00b6:
                int r7 = r3.E
                if (r6 >= r7) goto L_0x00c6
                int r7 = r3.G
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00d5
            L_0x00c4:
                r6 = 3
                goto L_0x00d8
            L_0x00c6:
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00d7
            L_0x00d5:
                r6 = 6
                goto L_0x00d8
            L_0x00d7:
                r6 = 4
            L_0x00d8:
                r3.getClass()
                r3.F(r5, r6, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.j(android.view.View, float, float):void");
        }

        public final boolean k(View view, int i8) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i10 = bottomSheetBehavior.L;
            if (i10 == 1 || bottomSheetBehavior.f5747a0) {
                return false;
            }
            if (i10 == 3 && bottomSheetBehavior.Y == i8) {
                WeakReference<View> weakReference = bottomSheetBehavior.V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class c {
        public void a(View view) {
        }

        public abstract void b(View view);

        public abstract void c(View view, int i8);
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f5782a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5783b;

        /* renamed from: c  reason: collision with root package name */
        public final a f5784c = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                e eVar = e.this;
                eVar.f5783b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                l2.c cVar = bottomSheetBehavior.M;
                if (cVar != null && cVar.g()) {
                    eVar.a(eVar.f5782a);
                } else if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.D(eVar.f5782a);
                }
            }
        }

        public e() {
        }

        public final void a(int i8) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.U;
            if (weakReference != null && weakReference.get() != null) {
                this.f5782a = i8;
                if (!this.f5783b) {
                    WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                    i0.d.m((View) bottomSheetBehavior.U.get(), this.f5784c);
                    this.f5783b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View v3 = v(viewGroup.getChildAt(i8));
                if (v3 != null) {
                    return v3;
                }
            }
        }
        return null;
    }

    public static BottomSheetBehavior w(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f1716a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void A(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.L == 5) {
                C(4);
            }
            G();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(int r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = -1
            r2 = 1
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f5755f
            if (r4 != 0) goto L_0x001d
            r3.f5755f = r2
            goto L_0x001c
        L_0x000c:
            boolean r1 = r3.f5755f
            if (r1 != 0) goto L_0x0014
            int r1 = r3.f5754e
            if (r1 == r4) goto L_0x001d
        L_0x0014:
            r3.f5755f = r0
            int r4 = java.lang.Math.max(r0, r4)
            r3.f5754e = r4
        L_0x001c:
            r0 = r2
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r3.J()
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.B(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (d2.i0.g.b(r5) != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L_0x0071
            r1 = 2
            if (r5 != r1) goto L_0x0008
            goto L_0x0071
        L_0x0008:
            boolean r1 = r4.I
            if (r1 != 0) goto L_0x0023
            r1 = 5
            if (r5 != r1) goto L_0x0023
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L_0x0023:
            r1 = 6
            if (r5 != r1) goto L_0x0034
            boolean r1 = r4.f5748b
            if (r1 == 0) goto L_0x0034
            int r1 = r4.z(r5)
            int r2 = r4.D
            if (r1 > r2) goto L_0x0034
            r1 = 3
            goto L_0x0035
        L_0x0034:
            r1 = r5
        L_0x0035:
            java.lang.ref.WeakReference<V> r2 = r4.U
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0040
            goto L_0x006d
        L_0x0040:
            java.lang.ref.WeakReference<V> r5 = r4.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r5, r1)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L_0x0062
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L_0x0062
            java.util.WeakHashMap<android.view.View, d2.d1> r1 = d2.i0.f7217a
            boolean r1 = d2.i0.g.b(r5)
            if (r1 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x0069
            r5.post(r2)
            goto L_0x0070
        L_0x0069:
            r2.run()
            goto L_0x0070
        L_0x006d:
            r4.D(r5)
        L_0x0070:
            return
        L_0x0071:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L_0x007f
            java.lang.String r5 = "DRAGGING"
            goto L_0x0081
        L_0x007f:
            java.lang.String r5 = "SETTLING"
        L_0x0081:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = androidx.activity.g.a(r2, r5, r0)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(int):void");
    }

    public final void D(int i8) {
        View view;
        if (this.L != i8) {
            this.L = i8;
            WeakReference<V> weakReference = this.U;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                int i10 = 0;
                if (i8 == 3) {
                    I(true);
                } else if (i8 == 6 || i8 == 5 || i8 == 4) {
                    I(false);
                }
                H(i8, true);
                while (true) {
                    ArrayList<c> arrayList = this.W;
                    if (i10 < arrayList.size()) {
                        arrayList.get(i10).c(view, i8);
                        i10++;
                    } else {
                        G();
                        return;
                    }
                }
            }
        }
    }

    public final boolean E(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f10 * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) t()) > 0.5f;
    }

    public final void F(View view, int i8, boolean z10) {
        int z11 = z(i8);
        l2.c cVar = this.M;
        if (cVar != null && (!z10 ? cVar.s(view, view.getLeft(), z11) : cVar.q(view.getLeft(), z11))) {
            D(2);
            H(i8, true);
            this.A.a(i8);
            return;
        }
        D(i8);
    }

    public final void G() {
        View view;
        int i8;
        WeakReference<V> weakReference = this.U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            i0.k(view, 524288);
            i0.h(view, 0);
            i0.k(view, 262144);
            i0.h(view, 0);
            i0.k(view, 1048576);
            i0.h(view, 0);
            SparseIntArray sparseIntArray = this.f5751c0;
            int i10 = sparseIntArray.get(0, -1);
            if (i10 != -1) {
                i0.k(view, i10);
                i0.h(view, 0);
                sparseIntArray.delete(0);
            }
            int i11 = 6;
            if (!this.f5748b && this.L != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                a8.c cVar = new a8.c(this, 6);
                ArrayList f10 = i0.f(view);
                int i12 = 0;
                while (true) {
                    if (i12 >= f10.size()) {
                        int i13 = 0;
                        int i14 = -1;
                        while (true) {
                            int[] iArr = i0.f7220d;
                            if (i13 >= iArr.length || i14 != -1) {
                                i8 = i14;
                            } else {
                                int i15 = iArr[i13];
                                boolean z10 = true;
                                for (int i16 = 0; i16 < f10.size(); i16++) {
                                    z10 &= ((i.a) f10.get(i16)).a() != i15;
                                }
                                if (z10) {
                                    i14 = i15;
                                }
                                i13++;
                            }
                        }
                        i8 = i14;
                    } else if (TextUtils.equals(string, ((i.a) f10.get(i12)).b())) {
                        i8 = ((i.a) f10.get(i12)).a();
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i8 != -1) {
                    i.a aVar = new i.a((Object) null, i8, string, cVar, (Class) null);
                    View.AccessibilityDelegate d10 = i0.d(view);
                    d2.a aVar2 = d10 == null ? null : d10 instanceof a.C0112a ? ((a.C0112a) d10).f7188a : new d2.a(d10);
                    if (aVar2 == null) {
                        aVar2 = new d2.a();
                    }
                    i0.n(view, aVar2);
                    i0.k(view, aVar.a());
                    i0.f(view).add(aVar);
                    i0.h(view, 0);
                }
                sparseIntArray.put(0, i8);
            }
            if (this.I && this.L != 5) {
                i0.l(view, i.a.f7790n, new a8.c(this, 5));
            }
            int i17 = this.L;
            if (i17 == 3) {
                if (this.f5748b) {
                    i11 = 4;
                }
                i0.l(view, i.a.m, new a8.c(this, i11));
            } else if (i17 == 4) {
                if (this.f5748b) {
                    i11 = 3;
                }
                i0.l(view, i.a.f7789l, new a8.c(this, i11));
            } else if (i17 == 6) {
                i0.l(view, i.a.m, new a8.c(this, 4));
                i0.l(view, i.a.f7789l, new a8.c(this, 3));
            }
        }
    }

    public final void H(int i8, boolean z10) {
        ValueAnimator valueAnimator;
        if (i8 != 2) {
            boolean z11 = this.L == 3 && (this.f5772x || y() == 0);
            if (this.f5774z != z11 && this.f5758i != null) {
                this.f5774z = z11;
                float f10 = 0.0f;
                if (!z10 || (valueAnimator = this.B) == null) {
                    ValueAnimator valueAnimator2 = this.B;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        this.B.cancel();
                    }
                    f fVar = this.f5758i;
                    if (!this.f5774z) {
                        f10 = 1.0f;
                    }
                    fVar.n(f10);
                } else if (valueAnimator.isRunning()) {
                    this.B.reverse();
                } else {
                    if (!z11) {
                        f10 = 1.0f;
                    }
                    this.B.setFloatValues(new float[]{1.0f - f10, f10});
                    this.B.start();
                }
            }
        }
    }

    public final void I(boolean z10) {
        WeakReference<V> weakReference = this.U;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.f5749b0 == null) {
                        this.f5749b0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i8 = 0; i8 < childCount; i8++) {
                    V childAt = coordinatorLayout.getChildAt(i8);
                    if (childAt != this.U.get() && z10) {
                        this.f5749b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z10) {
                    this.f5749b0 = null;
                }
            }
        }
    }

    public final void J() {
        View view;
        if (this.U != null) {
            s();
            if (this.L == 4 && (view = (View) this.U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(CoordinatorLayout.f fVar) {
        this.U = null;
        this.M = null;
    }

    public final void f() {
        this.U = null;
        this.M = null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        l2.c cVar;
        if (!v3.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference<View> weakReference = this.V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.i(view2, x10, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f5747a0 = true;
                }
            }
            this.N = this.Y == -1 && !coordinatorLayout.i(v3, x10, this.Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5747a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (!this.N && (cVar = this.M) != null && cVar.r(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.V;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.N && this.L != 1 && !coordinatorLayout.i(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.M != null && Math.abs(((float) this.Z) - motionEvent.getY()) > ((float) this.M.f10945b);
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v3, int i8) {
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        if (i0.d.b(coordinatorLayout) && !i0.d.b(v3)) {
            v3.setFitsSystemWindows(true);
        }
        int i10 = 0;
        if (this.U == null) {
            this.f5756g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z10 = Build.VERSION.SDK_INT >= 29 && !this.f5762n && !this.f5755f;
            if (this.f5763o || this.f5764p || this.f5765q || this.f5767s || this.f5768t || this.f5769u || z10) {
                v.a(v3, new a8.b(this, z10));
            }
            this.U = new WeakReference<>(v3);
            f fVar = this.f5758i;
            if (fVar != null) {
                i0.d.q(v3, fVar);
                f fVar2 = this.f5758i;
                float f10 = this.H;
                if (f10 == -1.0f) {
                    f10 = i0.i.i(v3);
                }
                fVar2.l(f10);
            } else {
                ColorStateList colorStateList = this.f5759j;
                if (colorStateList != null) {
                    i0.i.q(v3, colorStateList);
                }
            }
            G();
            if (i0.d.c(v3) == 0) {
                i0.d.s(v3, 1);
            }
        }
        if (this.M == null) {
            this.M = new l2.c(coordinatorLayout.getContext(), coordinatorLayout, this.f5753d0);
        }
        int top = v3.getTop();
        coordinatorLayout.q(v3, i8);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = v3.getHeight();
        this.R = height;
        int i11 = this.T;
        int i12 = i11 - height;
        int i13 = this.f5771w;
        if (i12 < i13) {
            if (this.f5766r) {
                this.R = i11;
            } else {
                this.R = i11 - i13;
            }
        }
        this.D = Math.max(0, i11 - this.R);
        this.E = (int) ((1.0f - this.F) * ((float) this.T));
        s();
        int i14 = this.L;
        if (i14 == 3) {
            v3.offsetTopAndBottom(y());
        } else if (i14 == 6) {
            v3.offsetTopAndBottom(this.E);
        } else if (this.I && i14 == 5) {
            v3.offsetTopAndBottom(this.T);
        } else if (i14 == 4) {
            v3.offsetTopAndBottom(this.G);
        } else if (i14 == 1 || i14 == 2) {
            v3.offsetTopAndBottom(top - v3.getTop());
        }
        H(this.L, false);
        this.V = new WeakReference<>(v(v3));
        while (true) {
            ArrayList<c> arrayList = this.W;
            if (i10 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i10).a(v3);
            i10++;
        }
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i8, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i8, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, this.f5760k, marginLayoutParams.width), x(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f5761l, marginLayoutParams.height));
        return true;
    }

    public final boolean j(View view) {
        WeakReference<View> weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    public final void k(CoordinatorLayout coordinatorLayout, V v3, View view, int i8, int i10, int[] iArr, int i11) {
        if (i11 != 1) {
            WeakReference<View> weakReference = this.V;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v3.getTop();
                int i12 = top - i10;
                if (i10 > 0) {
                    if (i12 < y()) {
                        int y10 = top - y();
                        iArr[1] = y10;
                        int i13 = -y10;
                        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                        v3.offsetTopAndBottom(i13);
                        D(3);
                    } else if (this.K) {
                        iArr[1] = i10;
                        WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
                        v3.offsetTopAndBottom(-i10);
                        D(1);
                    } else {
                        return;
                    }
                } else if (i10 < 0 && !view.canScrollVertically(-1)) {
                    int i14 = this.G;
                    if (i12 > i14 && !this.I) {
                        int i15 = top - i14;
                        iArr[1] = i15;
                        int i16 = -i15;
                        WeakHashMap<View, d1> weakHashMap3 = i0.f7217a;
                        v3.offsetTopAndBottom(i16);
                        D(4);
                    } else if (this.K) {
                        iArr[1] = i10;
                        WeakHashMap<View, d1> weakHashMap4 = i0.f7217a;
                        v3.offsetTopAndBottom(-i10);
                        D(1);
                    } else {
                        return;
                    }
                }
                u(v3.getTop());
                this.O = i10;
                this.P = true;
            }
        }
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i8, int i10, int i11, int[] iArr) {
    }

    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i8 = this.f5746a;
        if (i8 != 0) {
            if (i8 == -1 || (i8 & 1) == 1) {
                this.f5754e = dVar.f5780d;
            }
            if (i8 == -1 || (i8 & 2) == 2) {
                this.f5748b = dVar.f5781e;
            }
            if (i8 == -1 || (i8 & 4) == 4) {
                this.I = dVar.B;
            }
            if (i8 == -1 || (i8 & 8) == 8) {
                this.J = dVar.C;
            }
        }
        int i10 = dVar.f5779c;
        if (i10 == 1 || i10 == 2) {
            this.L = 4;
        } else {
            this.L = i10;
        }
    }

    public final Parcelable o(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean p(CoordinatorLayout coordinatorLayout, V v3, View view, View view2, int i8, int i10) {
        this.O = 0;
        this.P = false;
        return (i8 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r3.getTop() <= r1.E) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (java.lang.Math.abs(r2 - r1.D) < java.lang.Math.abs(r2 - r1.G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.G)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.G)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if (java.lang.Math.abs(r2 - r1.E) < java.lang.Math.abs(r2 - r1.G)) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.y()
            r0 = 3
            if (r2 != r5) goto L_0x000f
            r1.D(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.V
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto L_0x00b4
            boolean r2 = r1.P
            if (r2 != 0) goto L_0x001f
            goto L_0x00b4
        L_0x001f:
            int r2 = r1.O
            if (r2 <= 0) goto L_0x0033
            boolean r2 = r1.f5748b
            if (r2 == 0) goto L_0x0029
            goto L_0x00ae
        L_0x0029:
            int r2 = r3.getTop()
            int r4 = r1.E
            if (r2 <= r4) goto L_0x00ae
            goto L_0x00ab
        L_0x0033:
            boolean r2 = r1.I
            if (r2 == 0) goto L_0x0054
            android.view.VelocityTracker r2 = r1.X
            if (r2 != 0) goto L_0x003d
            r2 = 0
            goto L_0x004c
        L_0x003d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f5750c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.X
            int r4 = r1.Y
            float r2 = r2.getYVelocity(r4)
        L_0x004c:
            boolean r2 = r1.E(r3, r2)
            if (r2 == 0) goto L_0x0054
            r0 = 5
            goto L_0x00ae
        L_0x0054:
            int r2 = r1.O
            if (r2 != 0) goto L_0x0091
            int r2 = r3.getTop()
            boolean r4 = r1.f5748b
            if (r4 == 0) goto L_0x0072
            int r4 = r1.D
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00ad
            goto L_0x00ae
        L_0x0072:
            int r4 = r1.E
            if (r2 >= r4) goto L_0x0081
            int r4 = r1.G
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto L_0x00ab
            goto L_0x00ae
        L_0x0081:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00ad
            goto L_0x00ab
        L_0x0091:
            boolean r2 = r1.f5748b
            if (r2 == 0) goto L_0x0096
            goto L_0x00ad
        L_0x0096:
            int r2 = r3.getTop()
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00ad
        L_0x00ab:
            r0 = 6
            goto L_0x00ae
        L_0x00ad:
            r0 = 4
        L_0x00ae:
            r2 = 0
            r1.F(r3, r0, r2)
            r1.P = r2
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v3, MotionEvent motionEvent) {
        boolean z10 = false;
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i8 = this.L;
        if (i8 == 1 && actionMasked == 0) {
            return true;
        }
        l2.c cVar = this.M;
        if (cVar != null && (this.K || i8 == 1)) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z10 = true;
        }
        if (z10 && actionMasked == 2 && !this.N) {
            float abs = Math.abs(((float) this.Z) - motionEvent.getY());
            l2.c cVar2 = this.M;
            if (abs > ((float) cVar2.f10945b)) {
                cVar2.b(v3, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void s() {
        int t2 = t();
        if (this.f5748b) {
            this.G = Math.max(this.T - t2, this.D);
        } else {
            this.G = this.T - t2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.m;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t() {
        /*
            r3 = this;
            boolean r0 = r3.f5755f
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f5756g
            int r1 = r3.T
            int r2 = r3.S
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.R
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f5770v
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f5762n
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f5763o
            if (r0 != 0) goto L_0x0033
            int r0 = r3.m
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f5754e
            int r2 = r3.f5757h
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f5754e
            int r1 = r3.f5770v
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():int");
    }

    public final void u(int i8) {
        View view = (View) this.U.get();
        if (view != null) {
            ArrayList<c> arrayList = this.W;
            if (!arrayList.isEmpty()) {
                int i10 = this.G;
                if (i8 <= i10 && i10 != y()) {
                    y();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    arrayList.get(i11).b(view);
                }
            }
        }
    }

    public final int x(int i8, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = Math.min(size, i11);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public final int y() {
        if (this.f5748b) {
            return this.D;
        }
        return Math.max(this.C, this.f5766r ? 0 : this.f5771w);
    }

    public final int z(int i8) {
        if (i8 == 3) {
            return y();
        }
        if (i8 == 4) {
            return this.G;
        }
        if (i8 == 5) {
            return this.T;
        }
        if (i8 == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(q.a("Invalid state to get top offset: ", i8));
    }

    public static class d extends k2.a {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public final boolean B;
        public final boolean C;

        /* renamed from: c  reason: collision with root package name */
        public final int f5779c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5780d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f5781e;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new d[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5779c = parcel.readInt();
            this.f5780d = parcel.readInt();
            boolean z10 = false;
            this.f5781e = parcel.readInt() == 1;
            this.B = parcel.readInt() == 1;
            this.C = parcel.readInt() == 1 ? true : z10;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeInt(this.f5779c);
            parcel.writeInt(this.f5780d);
            parcel.writeInt(this.f5781e ? 1 : 0);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeInt(this.C ? 1 : 0);
        }

        public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f5779c = bottomSheetBehavior.L;
            this.f5780d = bottomSheetBehavior.f5754e;
            this.f5781e = bottomSheetBehavior.f5748b;
            this.B = bottomSheetBehavior.I;
            this.C = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i8;
        this.f5757h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.F);
        int i10 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f5759j = r8.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f5773y = new v8.i(v8.i.b(context, attributeSet, R.attr.bottomSheetStyle, 2132018000));
        }
        v8.i iVar = this.f5773y;
        if (iVar != null) {
            f fVar = new f(iVar);
            this.f5758i = fVar;
            fVar.j(context);
            ColorStateList colorStateList = this.f5759j;
            if (colorStateList != null) {
                this.f5758i.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f5758i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.B = ofFloat;
        ofFloat.setDuration(500);
        this.B.addUpdateListener(new a8.a(this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f5760k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f5761l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i8 = peekValue.data) != -1) {
            B(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            B(i8);
        }
        A(obtainStyledAttributes.getBoolean(8, false));
        this.f5762n = obtainStyledAttributes.getBoolean(13, false);
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f5748b != z10) {
            this.f5748b = z10;
            if (this.U != null) {
                s();
            }
            D((!this.f5748b || this.L != 6) ? this.L : i10);
            H(this.L, true);
            G();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f5746a = obtainStyledAttributes.getInt(10, 0);
        float f10 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.F = f10;
        if (this.U != null) {
            this.E = (int) ((1.0f - f10) * ((float) this.T));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.C = dimensionPixelOffset;
                H(this.L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i11 = peekValue2.data;
            if (i11 >= 0) {
                this.C = i11;
                H(this.L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f5752d = obtainStyledAttributes.getInt(11, 500);
        this.f5763o = obtainStyledAttributes.getBoolean(17, false);
        this.f5764p = obtainStyledAttributes.getBoolean(18, false);
        this.f5765q = obtainStyledAttributes.getBoolean(19, false);
        this.f5766r = obtainStyledAttributes.getBoolean(20, true);
        this.f5767s = obtainStyledAttributes.getBoolean(14, false);
        this.f5768t = obtainStyledAttributes.getBoolean(15, false);
        this.f5769u = obtainStyledAttributes.getBoolean(16, false);
        this.f5772x = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f5750c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
