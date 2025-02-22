package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class c extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public ViewPager2.e f2862a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f2863b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f2864c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f2865d;

    /* renamed from: e  reason: collision with root package name */
    public int f2866e;

    /* renamed from: f  reason: collision with root package name */
    public int f2867f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2868g = new a();

    /* renamed from: h  reason: collision with root package name */
    public int f2869h;

    /* renamed from: i  reason: collision with root package name */
    public int f2870i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2871j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2872k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2873l;
    public boolean m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2874a;

        /* renamed from: b  reason: collision with root package name */
        public float f2875b;

        /* renamed from: c  reason: collision with root package name */
        public int f2876c;
    }

    public c(ViewPager2 viewPager2) {
        this.f2863b = viewPager2;
        ViewPager2.i iVar = viewPager2.F;
        this.f2864c = iVar;
        this.f2865d = (LinearLayoutManager) iVar.getLayoutManager();
        e();
    }

    public final void a(int i8, RecyclerView recyclerView) {
        ViewPager2.e eVar;
        int i10 = this.f2866e;
        boolean z10 = true;
        if (!(i10 == 1 && this.f2867f == 1) && i8 == 1) {
            this.m = false;
            this.f2866e = 1;
            int i11 = this.f2870i;
            if (i11 != -1) {
                this.f2869h = i11;
                this.f2870i = -1;
            } else if (this.f2869h == -1) {
                this.f2869h = this.f2865d.N0();
            }
            d(1);
            return;
        }
        if (!(i10 == 1 || i10 == 4) || i8 != 2) {
            boolean z11 = i10 == 1 || i10 == 4;
            a aVar = this.f2868g;
            if (z11 && i8 == 0) {
                f();
                if (!this.f2872k) {
                    int i12 = aVar.f2874a;
                    if (!(i12 == -1 || (eVar = this.f2862a) == null)) {
                        eVar.b(0.0f, i12, 0);
                    }
                } else if (aVar.f2876c == 0) {
                    int i13 = this.f2869h;
                    int i14 = aVar.f2874a;
                    if (i13 != i14) {
                        c(i14);
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    d(0);
                    e();
                }
            }
            if (this.f2866e == 2 && i8 == 0 && this.f2873l) {
                f();
                if (aVar.f2876c == 0) {
                    int i15 = this.f2870i;
                    int i16 = aVar.f2874a;
                    if (i15 != i16) {
                        if (i16 == -1) {
                            i16 = 0;
                        }
                        c(i16);
                    }
                    d(0);
                    e();
                }
            }
        } else if (this.f2872k) {
            d(2);
            this.f2871j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if ((r7 < 0) == (r5.f2863b.C.A() == 1)) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f2872k = r6
            r5.f()
            boolean r0 = r5.f2871j
            r1 = -1
            androidx.viewpager2.widget.c$a r2 = r5.f2868g
            r3 = 0
            if (r0 == 0) goto L_0x0042
            r5.f2871j = r3
            if (r8 > 0) goto L_0x002b
            if (r8 != 0) goto L_0x0029
            if (r7 >= 0) goto L_0x0018
            r7 = r6
            goto L_0x0019
        L_0x0018:
            r7 = r3
        L_0x0019:
            androidx.viewpager2.widget.ViewPager2 r8 = r5.f2863b
            androidx.viewpager2.widget.ViewPager2$d r8 = r8.C
            int r8 = r8.A()
            if (r8 != r6) goto L_0x0025
            r8 = r6
            goto L_0x0026
        L_0x0025:
            r8 = r3
        L_0x0026:
            if (r7 != r8) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r7 = r3
            goto L_0x002c
        L_0x002b:
            r7 = r6
        L_0x002c:
            if (r7 == 0) goto L_0x0036
            int r7 = r2.f2876c
            if (r7 == 0) goto L_0x0036
            int r7 = r2.f2874a
            int r7 = r7 + r6
            goto L_0x0038
        L_0x0036:
            int r7 = r2.f2874a
        L_0x0038:
            r5.f2870i = r7
            int r8 = r5.f2869h
            if (r8 == r7) goto L_0x004e
            r5.c(r7)
            goto L_0x004e
        L_0x0042:
            int r7 = r5.f2866e
            if (r7 != 0) goto L_0x004e
            int r7 = r2.f2874a
            if (r7 != r1) goto L_0x004b
            r7 = r3
        L_0x004b:
            r5.c(r7)
        L_0x004e:
            int r7 = r2.f2874a
            if (r7 != r1) goto L_0x0053
            r7 = r3
        L_0x0053:
            float r8 = r2.f2875b
            int r0 = r2.f2876c
            androidx.viewpager2.widget.ViewPager2$e r4 = r5.f2862a
            if (r4 == 0) goto L_0x005e
            r4.b(r8, r7, r0)
        L_0x005e:
            int r7 = r2.f2874a
            int r8 = r5.f2870i
            if (r7 == r8) goto L_0x0066
            if (r8 != r1) goto L_0x0074
        L_0x0066:
            int r7 = r2.f2876c
            if (r7 != 0) goto L_0x0074
            int r7 = r5.f2867f
            if (r7 == r6) goto L_0x0074
            r5.d(r3)
            r5.e()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i8) {
        ViewPager2.e eVar = this.f2862a;
        if (eVar != null) {
            eVar.c(i8);
        }
    }

    public final void d(int i8) {
        if ((this.f2866e != 3 || this.f2867f != 0) && this.f2867f != i8) {
            this.f2867f = i8;
            ViewPager2.e eVar = this.f2862a;
            if (eVar != null) {
                eVar.a(i8);
            }
        }
    }

    public final void e() {
        this.f2866e = 0;
        this.f2867f = 0;
        a aVar = this.f2868g;
        aVar.f2874a = -1;
        aVar.f2875b = 0.0f;
        aVar.f2876c = 0;
        this.f2869h = -1;
        this.f2870i = -1;
        this.f2871j = false;
        this.f2872k = false;
        this.m = false;
        this.f2873l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011e, code lost:
        if (r5[r1 - 1][1] >= r6) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0142 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r13 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r13.f2865d
            int r1 = r0.N0()
            androidx.viewpager2.widget.c$a r2 = r13.f2868g
            r2.f2874a = r1
            r3 = 0
            r4 = 0
            r5 = -1
            if (r1 != r5) goto L_0x0016
            r2.f2874a = r5
            r2.f2875b = r3
            r2.f2876c = r4
            return
        L_0x0016:
            android.view.View r1 = r0.q(r1)
            if (r1 != 0) goto L_0x0023
            r2.f2874a = r5
            r2.f2875b = r3
            r2.f2876c = r4
            return
        L_0x0023:
            int r5 = androidx.recyclerview.widget.RecyclerView.m.B(r1)
            int r6 = androidx.recyclerview.widget.RecyclerView.m.I(r1)
            int r7 = androidx.recyclerview.widget.RecyclerView.m.K(r1)
            int r8 = androidx.recyclerview.widget.RecyclerView.m.u(r1)
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            boolean r10 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x0049
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r10 = r9.leftMargin
            int r5 = r5 + r10
            int r10 = r9.rightMargin
            int r6 = r6 + r10
            int r10 = r9.topMargin
            int r7 = r7 + r10
            int r9 = r9.bottomMargin
            int r8 = r8 + r9
        L_0x0049:
            int r9 = r1.getHeight()
            int r9 = r9 + r7
            int r9 = r9 + r8
            int r8 = r1.getWidth()
            int r8 = r8 + r5
            int r8 = r8 + r6
            int r6 = r0.f2366p
            r10 = 1
            if (r6 != 0) goto L_0x005c
            r6 = r10
            goto L_0x005d
        L_0x005c:
            r6 = r4
        L_0x005d:
            androidx.recyclerview.widget.RecyclerView r11 = r13.f2864c
            if (r6 == 0) goto L_0x007d
            int r1 = r1.getLeft()
            int r1 = r1 - r5
            int r5 = r11.getPaddingLeft()
            int r1 = r1 - r5
            androidx.viewpager2.widget.ViewPager2 r5 = r13.f2863b
            androidx.viewpager2.widget.ViewPager2$d r5 = r5.C
            int r5 = r5.A()
            if (r5 != r10) goto L_0x0077
            r5 = r10
            goto L_0x0078
        L_0x0077:
            r5 = r4
        L_0x0078:
            if (r5 == 0) goto L_0x007b
            int r1 = -r1
        L_0x007b:
            r9 = r8
            goto L_0x0087
        L_0x007d:
            int r1 = r1.getTop()
            int r1 = r1 - r7
            int r5 = r11.getPaddingTop()
            int r1 = r1 - r5
        L_0x0087:
            int r1 = -r1
            r2.f2876c = r1
            if (r1 >= 0) goto L_0x016a
            w3.b r1 = new w3.b
            int r1 = r0.w()
            if (r1 != 0) goto L_0x0096
            goto L_0x0121
        L_0x0096:
            int r3 = r0.f2366p
            if (r3 != 0) goto L_0x009c
            r3 = r10
            goto L_0x009d
        L_0x009c:
            r3 = r4
        L_0x009d:
            r5 = 2
            int[] r6 = new int[r5]
            r6[r10] = r5
            r6[r4] = r1
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r6)
            int[][] r5 = (int[][]) r5
            r6 = r4
        L_0x00ad:
            if (r6 >= r1) goto L_0x00f5
            android.view.View r7 = r0.v(r6)
            if (r7 == 0) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x00c0
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L_0x00c2
        L_0x00c0:
            android.view.ViewGroup$MarginLayoutParams r8 = w3.b.f16471a
        L_0x00c2:
            r9 = r5[r6]
            if (r3 == 0) goto L_0x00cd
            int r11 = r7.getLeft()
            int r12 = r8.leftMargin
            goto L_0x00d3
        L_0x00cd:
            int r11 = r7.getTop()
            int r12 = r8.topMargin
        L_0x00d3:
            int r11 = r11 - r12
            r9[r4] = r11
            r9 = r5[r6]
            if (r3 == 0) goto L_0x00e1
            int r7 = r7.getRight()
            int r8 = r8.rightMargin
            goto L_0x00e7
        L_0x00e1:
            int r7 = r7.getBottom()
            int r8 = r8.bottomMargin
        L_0x00e7:
            int r7 = r7 + r8
            r9[r10] = r7
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            w3.a r3 = new w3.a
            r3.<init>()
            java.util.Arrays.sort(r5, r3)
            r3 = r10
        L_0x00fe:
            if (r3 >= r1) goto L_0x0110
            int r6 = r3 + -1
            r6 = r5[r6]
            r6 = r6[r10]
            r7 = r5[r3]
            r7 = r7[r4]
            if (r6 == r7) goto L_0x010d
            goto L_0x0123
        L_0x010d:
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x0110:
            r3 = r5[r4]
            r6 = r3[r10]
            r3 = r3[r4]
            int r6 = r6 - r3
            if (r3 > 0) goto L_0x0123
            int r1 = r1 - r10
            r1 = r5[r1]
            r1 = r1[r10]
            if (r1 >= r6) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r1 = r10
            goto L_0x0124
        L_0x0123:
            r1 = r4
        L_0x0124:
            if (r1 == 0) goto L_0x012c
            int r1 = r0.w()
            if (r1 > r10) goto L_0x0147
        L_0x012c:
            int r1 = r0.w()
            r3 = r4
        L_0x0131:
            if (r3 >= r1) goto L_0x0142
            android.view.View r5 = r0.v(r3)
            boolean r5 = w3.b.a(r5)
            if (r5 == 0) goto L_0x013f
            r0 = r10
            goto L_0x0143
        L_0x013f:
            int r3 = r3 + 1
            goto L_0x0131
        L_0x0142:
            r0 = r4
        L_0x0143:
            if (r0 == 0) goto L_0x0147
            r0 = r10
            goto L_0x0148
        L_0x0147:
            r0 = r4
        L_0x0148:
            if (r0 == 0) goto L_0x0152
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L_0x0152:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r10]
            int r2 = r2.f2876c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r4] = r2
            java.lang.String r2 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r1 = java.lang.String.format(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x016a:
            if (r9 != 0) goto L_0x016d
            goto L_0x0171
        L_0x016d:
            float r0 = (float) r1
            float r1 = (float) r9
            float r3 = r0 / r1
        L_0x0171:
            r2.f2875b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.c.f():void");
    }
}
