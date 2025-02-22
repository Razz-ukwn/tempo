package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l1.c;
import l1.d;
import l1.j;
import m1.b;
import o1.e;
import o1.f;
import q.g;

public class ConstraintLayout extends ViewGroup {
    public static e L;
    public int B = Integer.MAX_VALUE;
    public int C = Integer.MAX_VALUE;
    public boolean D = true;
    public int E = 257;
    public b F = null;
    public o1.b G = null;
    public int H = -1;
    public HashMap<String, Integer> I = new HashMap<>();
    public final SparseArray<d> J = new SparseArray<>();
    public final b K = new b(this);

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<View> f1542a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<a> f1543b = new ArrayList<>(4);

    /* renamed from: c  reason: collision with root package name */
    public final l1.e f1544c = new l1.e();

    /* renamed from: d  reason: collision with root package name */
    public int f1545d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f1546e = 0;

    public class b implements b.C0211b {

        /* renamed from: a  reason: collision with root package name */
        public final ConstraintLayout f1590a;

        /* renamed from: b  reason: collision with root package name */
        public int f1591b;

        /* renamed from: c  reason: collision with root package name */
        public int f1592c;

        /* renamed from: d  reason: collision with root package name */
        public int f1593d;

        /* renamed from: e  reason: collision with root package name */
        public int f1594e;

        /* renamed from: f  reason: collision with root package name */
        public int f1595f;

        /* renamed from: g  reason: collision with root package name */
        public int f1596g;

        public b(ConstraintLayout constraintLayout) {
            this.f1590a = constraintLayout;
        }

        public static boolean a(int i8, int i10, int i11) {
            if (i8 == i10) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i8);
            View.MeasureSpec.getSize(i8);
            int mode2 = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i11 == size;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        public final void b(d dVar, b.a aVar) {
            int i8;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            boolean z10;
            int i15;
            int i16;
            d dVar2 = dVar;
            b.a aVar2 = aVar;
            if (dVar2 != null) {
                if (dVar2.f10859j0 == 8 && !dVar2.G) {
                    aVar2.f11126e = 0;
                    aVar2.f11127f = 0;
                    aVar2.f11128g = 0;
                } else if (dVar2.W != null) {
                    int i17 = aVar2.f11122a;
                    int i18 = aVar2.f11123b;
                    int i19 = aVar2.f11124c;
                    int i20 = aVar2.f11125d;
                    int i21 = this.f1591b + this.f1592c;
                    int i22 = this.f1593d;
                    View view = (View) dVar2.f10857i0;
                    int c3 = g.c(i17);
                    c cVar = dVar2.M;
                    c cVar2 = dVar2.K;
                    if (c3 == 0) {
                        i8 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    } else if (c3 == 1) {
                        i8 = ViewGroup.getChildMeasureSpec(this.f1595f, i22, -2);
                    } else if (c3 == 2) {
                        i8 = ViewGroup.getChildMeasureSpec(this.f1595f, i22, -2);
                        boolean z11 = dVar2.f10875s == 1;
                        int i23 = aVar2.f11131j;
                        if (i23 == 1 || i23 == 2) {
                            if (aVar2.f11131j == 2 || !z11 || (z11 && (view.getMeasuredHeight() == dVar.l())) || (view instanceof d) || dVar.B()) {
                                i8 = View.MeasureSpec.makeMeasureSpec(dVar.r(), 1073741824);
                            }
                        }
                    } else if (c3 != 3) {
                        i8 = 0;
                    } else {
                        int i24 = this.f1595f;
                        int i25 = cVar2 != null ? cVar2.f10832g + 0 : 0;
                        if (cVar != null) {
                            i25 += cVar.f10832g;
                        }
                        i8 = ViewGroup.getChildMeasureSpec(i24, i22 + i25, -1);
                    }
                    int c10 = g.c(i18);
                    if (c10 == 0) {
                        i10 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                    } else if (c10 == 1) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f1596g, i21, -2);
                    } else if (c10 == 2) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f1596g, i21, -2);
                        boolean z12 = dVar2.f10876t == 1;
                        int i26 = aVar2.f11131j;
                        if (i26 == 1 || i26 == 2) {
                            if (aVar2.f11131j == 2 || !z12 || (z12 && (view.getMeasuredWidth() == dVar.r())) || (view instanceof d) || dVar.C()) {
                                i10 = View.MeasureSpec.makeMeasureSpec(dVar.l(), 1073741824);
                            }
                        }
                    } else if (c10 != 3) {
                        i10 = 0;
                    } else {
                        int i27 = this.f1596g;
                        int i28 = cVar2 != null ? dVar2.L.f10832g + 0 : 0;
                        if (cVar != null) {
                            i28 += dVar2.N.f10832g;
                        }
                        i10 = ViewGroup.getChildMeasureSpec(i27, i21 + i28, -1);
                    }
                    l1.e eVar = (l1.e) dVar2.W;
                    ConstraintLayout constraintLayout = ConstraintLayout.this;
                    if (eVar != null && gf.g(constraintLayout.E, 256) && view.getMeasuredWidth() == dVar.r() && view.getMeasuredWidth() < eVar.r() && view.getMeasuredHeight() == dVar.l() && view.getMeasuredHeight() < eVar.l() && view.getBaseline() == dVar2.f10847d0 && !dVar.A()) {
                        if (a(dVar2.I, i8, dVar.r()) && a(dVar2.J, i10, dVar.l())) {
                            aVar2.f11126e = dVar.r();
                            aVar2.f11127f = dVar.l();
                            aVar2.f11128g = dVar2.f10847d0;
                            return;
                        }
                    }
                    boolean z13 = i17 == 3;
                    boolean z14 = i18 == 3;
                    boolean z15 = i18 == 4 || i18 == 1;
                    boolean z16 = i17 == 4 || i17 == 1;
                    boolean z17 = z13 && dVar2.Z > 0.0f;
                    boolean z18 = z14 && dVar2.Z > 0.0f;
                    if (view != null) {
                        a aVar3 = (a) view.getLayoutParams();
                        int i29 = aVar2.f11131j;
                        if (i29 == 1 || i29 == 2 || !z13 || dVar2.f10875s != 0 || !z14 || dVar2.f10876t != 0) {
                            if (!(view instanceof f) || !(dVar2 instanceof j)) {
                                view.measure(i8, i10);
                            } else {
                                ((f) view).l((j) dVar2, i8, i10);
                            }
                            dVar2.I = i8;
                            dVar2.J = i10;
                            dVar2.f10852g = false;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            int baseline = view.getBaseline();
                            int i30 = dVar2.f10878v;
                            i12 = i30 > 0 ? Math.max(i30, measuredWidth) : measuredWidth;
                            int i31 = dVar2.f10879w;
                            if (i31 > 0) {
                                i12 = Math.min(i31, i12);
                            }
                            int i32 = dVar2.f10881y;
                            if (i32 > 0) {
                                i11 = Math.max(i32, measuredHeight);
                                i15 = i10;
                            } else {
                                i15 = i10;
                                i11 = measuredHeight;
                            }
                            int i33 = dVar2.f10882z;
                            if (i33 > 0) {
                                i11 = Math.min(i33, i11);
                            }
                            if (!gf.g(constraintLayout.E, 1)) {
                                if (z17 && z15) {
                                    i12 = (int) ((((float) i11) * dVar2.Z) + 0.5f);
                                } else if (z18 && z16) {
                                    i11 = (int) ((((float) i12) / dVar2.Z) + 0.5f);
                                }
                            }
                            if (measuredWidth == i12 && measuredHeight == i11) {
                                i13 = baseline;
                                z10 = false;
                            } else {
                                if (measuredWidth != i12) {
                                    i16 = 1073741824;
                                    i8 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                                } else {
                                    i16 = 1073741824;
                                }
                                int makeMeasureSpec = measuredHeight != i11 ? View.MeasureSpec.makeMeasureSpec(i11, i16) : i15;
                                view.measure(i8, makeMeasureSpec);
                                dVar2.I = i8;
                                dVar2.J = makeMeasureSpec;
                                z10 = false;
                                dVar2.f10852g = false;
                                int measuredWidth2 = view.getMeasuredWidth();
                                int measuredHeight2 = view.getMeasuredHeight();
                                i13 = view.getBaseline();
                                i11 = measuredHeight2;
                                i12 = measuredWidth2;
                            }
                            i14 = -1;
                        } else {
                            z10 = false;
                            i14 = -1;
                            i13 = 0;
                            i12 = 0;
                            i11 = 0;
                        }
                        boolean z19 = i13 != i14 ? true : z10;
                        aVar2.f11130i = (i12 == aVar2.f11124c && i11 == aVar2.f11125d) ? z10 : true;
                        boolean z20 = aVar3.f1552c0 ? true : z19;
                        if (!(!z20 || i13 == -1 || dVar2.f10847d0 == i13)) {
                            aVar2.f11130i = true;
                        }
                        aVar2.f11126e = i12;
                        aVar2.f11127f = i11;
                        aVar2.f11129h = z20;
                        aVar2.f11128g = i13;
                    }
                }
            }
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static e getSharedValues() {
        if (L == null) {
            L = new e();
        }
        return L;
    }

    public final d b(View view) {
        if (view == this) {
            return this.f1544c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f1579q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f1579q0;
        }
        return null;
    }

    public final void c(AttributeSet attributeSet, int i8) {
        l1.e eVar = this.f1544c;
        eVar.f10857i0 = this;
        b bVar = this.K;
        eVar.f10886w0 = bVar;
        eVar.f10884u0.f11139f = bVar;
        this.f1542a.put(getId(), this);
        this.F = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gf.f4584c, i8, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f1545d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1545d);
                } else if (index == 17) {
                    this.f1546e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1546e);
                } else if (index == 14) {
                    this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                } else if (index == 15) {
                    this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                } else if (index == 113) {
                    this.E = obtainStyledAttributes.getInt(index, this.E);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            e(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.G = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        b bVar2 = new b();
                        this.F = bVar2;
                        bVar2.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.F = null;
                    }
                    this.H = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.F0 = this.E;
        j1.d.f9759p = eVar.W(512);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<a> arrayList = this.f1543b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.get(i8).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i12 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i11;
                        float f11 = (float) i12;
                        float f12 = (float) (i11 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f13 = f11;
                        float f14 = f11;
                        float f15 = f12;
                        float f16 = f10;
                        Paint paint2 = paint;
                        canvas2.drawLine(f10, f13, f15, f14, paint);
                        float parseInt4 = (float) (i12 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f12;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f14, f15, f18, paint);
                        float f19 = parseInt4;
                        float f20 = f16;
                        canvas2.drawLine(f17, f19, f20, f18, paint);
                        float f21 = f16;
                        canvas2.drawLine(f21, f19, f20, f14, paint);
                        paint.setColor(-16711936);
                        float f22 = f12;
                        Paint paint3 = paint;
                        canvas2.drawLine(f21, f14, f22, parseInt4, paint);
                        canvas2.drawLine(f21, parseInt4, f22, f14, paint);
                    }
                }
            }
        }
    }

    public void e(int i8) {
        this.G = new o1.b(getContext(), this, i8);
    }

    public final void f(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.I == null) {
                this.I = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.I.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void forceLayout() {
        this.D = true;
        super.forceLayout();
    }

    public final void g(d dVar, a aVar, SparseArray<d> sparseArray, int i8, c.a aVar2) {
        View view = this.f1542a.get(i8);
        d dVar2 = sparseArray.get(i8);
        if (dVar2 != null && view != null && (view.getLayoutParams() instanceof a)) {
            aVar.f1552c0 = true;
            c.a aVar3 = c.a.f10839e;
            if (aVar2 == aVar3) {
                a aVar4 = (a) view.getLayoutParams();
                aVar4.f1552c0 = true;
                aVar4.f1579q0.F = true;
            }
            dVar.j(aVar3).b(dVar2.j(aVar2), aVar.D, aVar.C, true);
            dVar.F = true;
            dVar.j(c.a.f10836b).j();
            dVar.j(c.a.f10838d).j();
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.C;
    }

    public int getMaxWidth() {
        return this.B;
    }

    public int getMinHeight() {
        return this.f1546e;
    }

    public int getMinWidth() {
        return this.f1545d;
    }

    public int getOptimizationLevel() {
        return this.f1544c.F0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        l1.e eVar = this.f1544c;
        if (eVar.f10860k == null) {
            int id3 = getId();
            if (id3 != -1) {
                eVar.f10860k = getContext().getResources().getResourceEntryName(id3);
            } else {
                eVar.f10860k = "parent";
            }
        }
        if (eVar.f10861k0 == null) {
            eVar.f10861k0 = eVar.f10860k;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f10861k0);
        }
        Iterator<d> it = eVar.f10925s0.iterator();
        while (it.hasNext()) {
            d next = it.next();
            View view = (View) next.f10857i0;
            if (view != null) {
                if (next.f10860k == null && (id2 = view.getId()) != -1) {
                    next.f10860k = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f10861k0 == null) {
                    next.f10861k0 = next.f10860k;
                    Log.v("ConstraintLayout", " setDebugName " + next.f10861k0);
                }
            }
        }
        eVar.o(sb2);
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010a, code lost:
        r0 = java.lang.Integer.valueOf(r0);
        r7 = r5.D;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02fc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r28 = this;
            r6 = r28
            int r0 = r28.getChildCount()
            r7 = 0
            r1 = r7
        L_0x0008:
            r8 = 1
            if (r1 >= r0) goto L_0x001a
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x0017
            r9 = r8
            goto L_0x001b
        L_0x0017:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x001a:
            r9 = r7
        L_0x001b:
            if (r9 == 0) goto L_0x0571
            boolean r10 = r28.isInEditMode()
            int r11 = r28.getChildCount()
            r0 = r7
        L_0x0026:
            if (r0 >= r11) goto L_0x0039
            android.view.View r1 = r6.getChildAt(r0)
            l1.d r1 = r6.b(r1)
            if (r1 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r1.D()
        L_0x0036:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0039:
            r0 = 0
            android.util.SparseArray<android.view.View> r1 = r6.f1542a
            r12 = -1
            l1.e r13 = r6.f1544c
            if (r10 == 0) goto L_0x00a2
            r2 = r7
        L_0x0042:
            if (r2 >= r11) goto L_0x00a2
            android.view.View r3 = r6.getChildAt(r2)
            android.content.res.Resources r4 = r28.getResources()     // Catch:{ NotFoundException -> 0x009f }
            int r5 = r3.getId()     // Catch:{ NotFoundException -> 0x009f }
            java.lang.String r4 = r4.getResourceName(r5)     // Catch:{ NotFoundException -> 0x009f }
            int r5 = r3.getId()     // Catch:{ NotFoundException -> 0x009f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NotFoundException -> 0x009f }
            r6.f(r4, r5)     // Catch:{ NotFoundException -> 0x009f }
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch:{ NotFoundException -> 0x009f }
            if (r5 == r12) goto L_0x006d
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch:{ NotFoundException -> 0x009f }
        L_0x006d:
            int r3 = r3.getId()     // Catch:{ NotFoundException -> 0x009f }
            if (r3 != 0) goto L_0x0074
            goto L_0x008f
        L_0x0074:
            java.lang.Object r5 = r1.get(r3)     // Catch:{ NotFoundException -> 0x009f }
            android.view.View r5 = (android.view.View) r5     // Catch:{ NotFoundException -> 0x009f }
            if (r5 != 0) goto L_0x008d
            android.view.View r5 = r6.findViewById(r3)     // Catch:{ NotFoundException -> 0x009f }
            if (r5 == 0) goto L_0x008d
            if (r5 == r6) goto L_0x008d
            android.view.ViewParent r3 = r5.getParent()     // Catch:{ NotFoundException -> 0x009f }
            if (r3 != r6) goto L_0x008d
            r6.onViewAdded(r5)     // Catch:{ NotFoundException -> 0x009f }
        L_0x008d:
            if (r5 != r6) goto L_0x0091
        L_0x008f:
            r3 = r13
            goto L_0x009d
        L_0x0091:
            if (r5 != 0) goto L_0x0095
            r3 = r0
            goto L_0x009d
        L_0x0095:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()     // Catch:{ NotFoundException -> 0x009f }
            androidx.constraintlayout.widget.ConstraintLayout$a r3 = (androidx.constraintlayout.widget.ConstraintLayout.a) r3     // Catch:{ NotFoundException -> 0x009f }
            l1.d r3 = r3.f1579q0     // Catch:{ NotFoundException -> 0x009f }
        L_0x009d:
            r3.f10861k0 = r4     // Catch:{ NotFoundException -> 0x009f }
        L_0x009f:
            int r2 = r2 + 1
            goto L_0x0042
        L_0x00a2:
            int r2 = r6.H
            if (r2 == r12) goto L_0x00c4
            r2 = r7
        L_0x00a7:
            if (r2 >= r11) goto L_0x00c4
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getId()
            int r5 = r6.H
            if (r4 != r5) goto L_0x00c1
            boolean r4 = r3 instanceof androidx.constraintlayout.widget.c
            if (r4 == 0) goto L_0x00c1
            androidx.constraintlayout.widget.c r3 = (androidx.constraintlayout.widget.c) r3
            androidx.constraintlayout.widget.b r3 = r3.getConstraintSet()
            r6.F = r3
        L_0x00c1:
            int r2 = r2 + 1
            goto L_0x00a7
        L_0x00c4:
            androidx.constraintlayout.widget.b r2 = r6.F
            if (r2 == 0) goto L_0x00cb
            r2.a(r6)
        L_0x00cb:
            java.util.ArrayList<l1.d> r2 = r13.f10925s0
            r2.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.a> r2 = r6.f1543b
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x0171
            r4 = r7
        L_0x00d9:
            if (r4 >= r3) goto L_0x0171
            java.lang.Object r5 = r2.get(r4)
            androidx.constraintlayout.widget.a r5 = (androidx.constraintlayout.widget.a) r5
            boolean r15 = r5.isInEditMode()
            if (r15 == 0) goto L_0x00ec
            java.lang.String r15 = r5.f1603e
            r5.setIds(r15)
        L_0x00ec:
            l1.i r15 = r5.f1602d
            if (r15 != 0) goto L_0x00f2
            goto L_0x0169
        L_0x00f2:
            r15.f10918t0 = r7
            l1.d[] r15 = r15.f10917s0
            java.util.Arrays.fill(r15, r0)
            r15 = r7
        L_0x00fa:
            int r0 = r5.f1600b
            if (r15 >= r0) goto L_0x0164
            int[] r0 = r5.f1599a
            r0 = r0[r15]
            java.lang.Object r17 = r1.get(r0)
            android.view.View r17 = (android.view.View) r17
            if (r17 != 0) goto L_0x012f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap<java.lang.Integer, java.lang.String> r7 = r5.D
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r12 = r5.h(r6, r0)
            if (r12 == 0) goto L_0x012f
            int[] r14 = r5.f1599a
            r14[r15] = r12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r7.put(r14, r0)
            java.lang.Object r0 = r1.get(r12)
            r17 = r0
            android.view.View r17 = (android.view.View) r17
        L_0x012f:
            r0 = r17
            if (r0 == 0) goto L_0x015e
            l1.i r7 = r5.f1602d
            l1.d r0 = r6.b(r0)
            r7.getClass()
            if (r0 == r7) goto L_0x015e
            if (r0 != 0) goto L_0x0141
            goto L_0x015e
        L_0x0141:
            int r12 = r7.f10918t0
            int r12 = r12 + r8
            l1.d[] r14 = r7.f10917s0
            int r8 = r14.length
            if (r12 <= r8) goto L_0x0154
            int r8 = r14.length
            r12 = 2
            int r8 = r8 * r12
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r14, r8)
            l1.d[] r8 = (l1.d[]) r8
            r7.f10917s0 = r8
        L_0x0154:
            l1.d[] r8 = r7.f10917s0
            int r12 = r7.f10918t0
            r8[r12] = r0
            r0 = 1
            int r12 = r12 + r0
            r7.f10918t0 = r12
        L_0x015e:
            int r15 = r15 + 1
            r7 = 0
            r8 = 1
            r12 = -1
            goto L_0x00fa
        L_0x0164:
            l1.i r0 = r5.f1602d
            r0.a()
        L_0x0169:
            int r4 = r4 + 1
            r0 = 0
            r7 = 0
            r8 = 1
            r12 = -1
            goto L_0x00d9
        L_0x0171:
            r0 = 0
        L_0x0172:
            if (r0 >= r11) goto L_0x01af
            android.view.View r1 = r6.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.d
            if (r2 == 0) goto L_0x01ab
            androidx.constraintlayout.widget.d r1 = (androidx.constraintlayout.widget.d) r1
            int r2 = r1.f1706a
            r3 = -1
            if (r2 != r3) goto L_0x018e
            boolean r2 = r1.isInEditMode()
            if (r2 != 0) goto L_0x018e
            int r2 = r1.f1708c
            r1.setVisibility(r2)
        L_0x018e:
            int r2 = r1.f1706a
            android.view.View r2 = r6.findViewById(r2)
            r1.f1707b = r2
            if (r2 == 0) goto L_0x01ab
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = (androidx.constraintlayout.widget.ConstraintLayout.a) r2
            r3 = 1
            r2.f1558f0 = r3
            android.view.View r2 = r1.f1707b
            r3 = 0
            r2.setVisibility(r3)
            r1.setVisibility(r3)
            goto L_0x01ac
        L_0x01ab:
            r3 = 0
        L_0x01ac:
            int r0 = r0 + 1
            goto L_0x0172
        L_0x01af:
            r3 = 0
            android.util.SparseArray<l1.d> r7 = r6.J
            r7.clear()
            r7.put(r3, r13)
            int r0 = r28.getId()
            r7.put(r0, r13)
            r0 = 0
        L_0x01c0:
            if (r0 >= r11) goto L_0x01d4
            android.view.View r1 = r6.getChildAt(r0)
            l1.d r2 = r6.b(r1)
            int r1 = r1.getId()
            r7.put(r1, r2)
            int r0 = r0 + 1
            goto L_0x01c0
        L_0x01d4:
            r8 = 0
        L_0x01d5:
            if (r8 >= r11) goto L_0x0571
            android.view.View r0 = r6.getChildAt(r8)
            l1.d r12 = r6.b(r0)
            if (r12 != 0) goto L_0x01e3
            goto L_0x0252
        L_0x01e3:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r14 = r1
            androidx.constraintlayout.widget.ConstraintLayout$a r14 = (androidx.constraintlayout.widget.ConstraintLayout.a) r14
            java.util.ArrayList<l1.d> r1 = r13.f10925s0
            r1.add(r12)
            l1.d r1 = r12.W
            if (r1 == 0) goto L_0x01fd
            l1.k r1 = (l1.k) r1
            java.util.ArrayList<l1.d> r1 = r1.f10925s0
            r1.remove(r12)
            r12.D()
        L_0x01fd:
            r12.W = r13
            r14.a()
            int r1 = r0.getVisibility()
            r12.f10859j0 = r1
            boolean r1 = r14.f1558f0
            if (r1 == 0) goto L_0x0213
            r1 = 1
            r12.G = r1
            r1 = 8
            r12.f10859j0 = r1
        L_0x0213:
            r12.f10857i0 = r0
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.a
            if (r1 == 0) goto L_0x0220
            androidx.constraintlayout.widget.a r0 = (androidx.constraintlayout.widget.a) r0
            boolean r1 = r13.f10887x0
            r0.j(r12, r1)
        L_0x0220:
            boolean r0 = r14.f1554d0
            if (r0 == 0) goto L_0x0262
            l1.g r12 = (l1.g) r12
            int r0 = r14.f1573n0
            int r1 = r14.f1575o0
            float r2 = r14.f1577p0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x023c
            if (r4 <= 0) goto L_0x0252
            r12.f10911s0 = r2
            r2 = -1
            r12.f10912t0 = r2
            r12.f10913u0 = r2
            goto L_0x0252
        L_0x023c:
            r2 = -1
            if (r0 == r2) goto L_0x0248
            if (r0 <= r2) goto L_0x0252
            r12.f10911s0 = r3
            r12.f10912t0 = r0
            r12.f10913u0 = r2
            goto L_0x0252
        L_0x0248:
            if (r1 == r2) goto L_0x0252
            if (r1 <= r2) goto L_0x0252
            r12.f10911s0 = r3
            r12.f10912t0 = r2
            r12.f10913u0 = r1
        L_0x0252:
            r26 = r8
            r25 = r9
            r27 = r10
            r16 = r11
            r24 = r13
            r0 = 2
            r3 = 0
            r4 = -1
            r5 = 1
            goto L_0x0563
        L_0x0262:
            int r0 = r14.f1560g0
            int r1 = r14.f1562h0
            int r2 = r14.f1564i0
            int r3 = r14.f1566j0
            int r4 = r14.f1568k0
            int r5 = r14.f1570l0
            float r15 = r14.f1571m0
            int r6 = r14.f1576p
            r16 = r11
            l1.c$a r11 = l1.c.a.f10837c
            r24 = r13
            l1.c$a r13 = l1.c.a.f10835a
            r25 = r9
            l1.c$a r9 = l1.c.a.f10838d
            r26 = r8
            l1.c$a r8 = l1.c.a.f10836b
            r27 = r10
            r10 = -1
            if (r6 == r10) goto L_0x02a6
            java.lang.Object r0 = r7.get(r6)
            r20 = r0
            l1.d r20 = (l1.d) r20
            if (r20 == 0) goto L_0x03d3
            float r0 = r14.f1580r
            int r1 = r14.f1578q
            l1.c$a r21 = l1.c.a.B
            r23 = 0
            r18 = r12
            r19 = r21
            r22 = r1
            r18.w(r19, r20, r21, r22, r23)
            r12.E = r0
            goto L_0x03d3
        L_0x02a6:
            r6 = r10
            if (r0 == r6) goto L_0x02c3
            java.lang.Object r0 = r7.get(r0)
            r20 = r0
            l1.d r20 = (l1.d) r20
            if (r20 == 0) goto L_0x02df
            int r0 = r14.leftMargin
            r18 = r12
            r19 = r13
            r21 = r13
            r22 = r0
            r23 = r4
            r18.w(r19, r20, r21, r22, r23)
            goto L_0x02df
        L_0x02c3:
            r0 = r6
            if (r1 == r0) goto L_0x02e0
            java.lang.Object r0 = r7.get(r1)
            r20 = r0
            l1.d r20 = (l1.d) r20
            if (r20 == 0) goto L_0x02df
            int r0 = r14.leftMargin
            r18 = r12
            r19 = r13
            r21 = r11
            r22 = r0
            r23 = r4
            r18.w(r19, r20, r21, r22, r23)
        L_0x02df:
            r0 = -1
        L_0x02e0:
            if (r2 == r0) goto L_0x02fc
            java.lang.Object r0 = r7.get(r2)
            r20 = r0
            l1.d r20 = (l1.d) r20
            if (r20 == 0) goto L_0x0317
            int r0 = r14.rightMargin
            r18 = r12
            r19 = r11
            r21 = r13
            r22 = r0
            r23 = r5
            r18.w(r19, r20, r21, r22, r23)
            goto L_0x0317
        L_0x02fc:
            if (r3 == r0) goto L_0x0317
            java.lang.Object r0 = r7.get(r3)
            r20 = r0
            l1.d r20 = (l1.d) r20
            if (r20 == 0) goto L_0x0317
            int r0 = r14.rightMargin
            r18 = r12
            r19 = r11
            r21 = r11
            r22 = r0
            r23 = r5
            r18.w(r19, r20, r21, r22, r23)
        L_0x0317:
            int r0 = r14.f1563i
            r1 = -1
            if (r0 == r1) goto L_0x0338
            java.lang.Object r0 = r7.get(r0)
            r20 = r0
            l1.d r20 = (l1.d) r20
            if (r20 == 0) goto L_0x0358
            int r0 = r14.topMargin
            int r1 = r14.f1586x
            r18 = r12
            r19 = r8
            r21 = r8
            r22 = r0
            r23 = r1
            r18.w(r19, r20, r21, r22, r23)
            goto L_0x0358
        L_0x0338:
            int r0 = r14.f1565j
            r1 = -1
            if (r0 == r1) goto L_0x0358
            java.lang.Object r0 = r7.get(r0)
            r20 = r0
            l1.d r20 = (l1.d) r20
            if (r20 == 0) goto L_0x0358
            int r0 = r14.topMargin
            int r1 = r14.f1586x
            r18 = r12
            r19 = r8
            r21 = r9
            r22 = r0
            r23 = r1
            r18.w(r19, r20, r21, r22, r23)
        L_0x0358:
            int r0 = r14.f1567k
            r1 = -1
            if (r0 == r1) goto L_0x0379
            java.lang.Object r0 = r7.get(r0)
            r20 = r0
            l1.d r20 = (l1.d) r20
            if (r20 == 0) goto L_0x0399
            int r0 = r14.bottomMargin
            int r1 = r14.f1588z
            r18 = r12
            r19 = r9
            r21 = r8
            r22 = r0
            r23 = r1
            r18.w(r19, r20, r21, r22, r23)
            goto L_0x0399
        L_0x0379:
            int r0 = r14.f1569l
            r1 = -1
            if (r0 == r1) goto L_0x0399
            java.lang.Object r0 = r7.get(r0)
            r20 = r0
            l1.d r20 = (l1.d) r20
            if (r20 == 0) goto L_0x0399
            int r0 = r14.bottomMargin
            int r1 = r14.f1588z
            r18 = r12
            r19 = r9
            r21 = r9
            r22 = r0
            r23 = r1
            r18.w(r19, r20, r21, r22, r23)
        L_0x0399:
            int r4 = r14.m
            r6 = -1
            if (r4 == r6) goto L_0x03a9
            l1.c$a r5 = l1.c.a.f10839e
            r0 = r28
            r1 = r12
            r2 = r14
            r3 = r7
            r0.g(r1, r2, r3, r4, r5)
            goto L_0x03c4
        L_0x03a9:
            int r4 = r14.f1572n
            if (r4 == r6) goto L_0x03b7
            r0 = r28
            r1 = r12
            r2 = r14
            r3 = r7
            r5 = r8
            r0.g(r1, r2, r3, r4, r5)
            goto L_0x03c4
        L_0x03b7:
            int r4 = r14.f1574o
            if (r4 == r6) goto L_0x03c4
            r0 = r28
            r1 = r12
            r2 = r14
            r3 = r7
            r5 = r9
            r0.g(r1, r2, r3, r4, r5)
        L_0x03c4:
            r0 = 0
            int r1 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x03cb
            r12.f10853g0 = r15
        L_0x03cb:
            float r1 = r14.F
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x03d3
            r12.f10855h0 = r1
        L_0x03d3:
            if (r27 == 0) goto L_0x03e4
            int r0 = r14.T
            r1 = -1
            if (r0 != r1) goto L_0x03de
            int r2 = r14.U
            if (r2 == r1) goto L_0x03e4
        L_0x03de:
            int r1 = r14.U
            r12.f10843b0 = r0
            r12.f10845c0 = r1
        L_0x03e4:
            boolean r0 = r14.f1548a0
            r1 = 3
            r2 = 4
            r3 = -2
            if (r0 != 0) goto L_0x0414
            int r0 = r14.width
            r4 = -1
            if (r0 != r4) goto L_0x040c
            boolean r0 = r14.W
            if (r0 == 0) goto L_0x03f8
            r12.M(r1)
            goto L_0x03fb
        L_0x03f8:
            r12.M(r2)
        L_0x03fb:
            l1.c r0 = r12.j(r13)
            int r4 = r14.leftMargin
            r0.f10832g = r4
            l1.c r0 = r12.j(r11)
            int r4 = r14.rightMargin
            r0.f10832g = r4
            goto L_0x0425
        L_0x040c:
            r12.M(r1)
            r0 = 0
            r12.O(r0)
            goto L_0x0425
        L_0x0414:
            r0 = 1
            r12.M(r0)
            int r0 = r14.width
            r12.O(r0)
            int r0 = r14.width
            if (r0 != r3) goto L_0x0425
            r0 = 2
            r12.M(r0)
        L_0x0425:
            boolean r0 = r14.f1550b0
            if (r0 != 0) goto L_0x0452
            int r0 = r14.height
            r4 = -1
            if (r0 != r4) goto L_0x044a
            boolean r0 = r14.X
            if (r0 == 0) goto L_0x0436
            r12.N(r1)
            goto L_0x0439
        L_0x0436:
            r12.N(r2)
        L_0x0439:
            l1.c r0 = r12.j(r8)
            int r2 = r14.topMargin
            r0.f10832g = r2
            l1.c r0 = r12.j(r9)
            int r2 = r14.bottomMargin
            r0.f10832g = r2
            goto L_0x0464
        L_0x044a:
            r12.N(r1)
            r0 = 0
            r12.L(r0)
            goto L_0x0464
        L_0x0452:
            r0 = 1
            r4 = -1
            r12.N(r0)
            int r0 = r14.height
            r12.L(r0)
            int r0 = r14.height
            if (r0 != r3) goto L_0x0464
            r0 = 2
            r12.N(r0)
        L_0x0464:
            java.lang.String r0 = r14.G
            if (r0 == 0) goto L_0x04fb
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0470
            goto L_0x04fb
        L_0x0470:
            int r2 = r0.length()
            r3 = 44
            int r3 = r0.indexOf(r3)
            if (r3 <= 0) goto L_0x049d
            int r5 = r2 + -1
            if (r3 >= r5) goto L_0x049d
            r5 = 0
            java.lang.String r6 = r0.substring(r5, r3)
            java.lang.String r5 = "W"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x048f
            r5 = 0
            goto L_0x049a
        L_0x048f:
            java.lang.String r5 = "H"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0499
            r5 = 1
            goto L_0x049a
        L_0x0499:
            r5 = r4
        L_0x049a:
            int r3 = r3 + 1
            goto L_0x049f
        L_0x049d:
            r5 = r4
            r3 = 0
        L_0x049f:
            r6 = 58
            int r6 = r0.indexOf(r6)
            if (r6 < 0) goto L_0x04e1
            int r2 = r2 + -1
            if (r6 >= r2) goto L_0x04e1
            java.lang.String r2 = r0.substring(r3, r6)
            int r6 = r6 + 1
            java.lang.String r0 = r0.substring(r6)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x04f0
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x04f0
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x04f0 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04f0 }
            r3 = 0
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x04f0
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x04f0
            r3 = 1
            if (r5 != r3) goto L_0x04db
            float r0 = r0 / r2
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x04f0 }
            goto L_0x04f1
        L_0x04db:
            float r2 = r2 / r0
            float r0 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x04f0 }
            goto L_0x04f1
        L_0x04e1:
            java.lang.String r0 = r0.substring(r3)
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x04f0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04f0 }
            goto L_0x04f1
        L_0x04f0:
            r0 = 0
        L_0x04f1:
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x04fe
            r12.Z = r0
            r12.f10841a0 = r5
            goto L_0x04fe
        L_0x04fb:
            r2 = 0
            r12.Z = r2
        L_0x04fe:
            float r0 = r14.H
            float[] r2 = r12.f10866n0
            r3 = 0
            r2[r3] = r0
            float r0 = r14.I
            r5 = 1
            r2[r5] = r0
            int r0 = r14.J
            r12.f10863l0 = r0
            int r0 = r14.K
            r12.f10864m0 = r0
            int r0 = r14.Z
            if (r0 < 0) goto L_0x051a
            if (r0 > r1) goto L_0x051a
            r12.f10873r = r0
        L_0x051a:
            int r0 = r14.L
            int r1 = r14.N
            int r2 = r14.P
            float r6 = r14.R
            r12.f10875s = r0
            r12.f10878v = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x052c
            r2 = r3
        L_0x052c:
            r12.f10879w = r2
            r12.f10880x = r6
            r2 = 0
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r8 <= 0) goto L_0x0540
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0540
            if (r0 != 0) goto L_0x0540
            r0 = 2
            r12.f10875s = r0
        L_0x0540:
            int r0 = r14.M
            int r6 = r14.O
            int r8 = r14.Q
            float r9 = r14.S
            r12.f10876t = r0
            r12.f10881y = r6
            if (r8 != r1) goto L_0x054f
            r8 = r3
        L_0x054f:
            r12.f10882z = r8
            r12.A = r9
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0562
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0562
            if (r0 != 0) goto L_0x0562
            r0 = 2
            r12.f10876t = r0
            goto L_0x0563
        L_0x0562:
            r0 = 2
        L_0x0563:
            int r8 = r26 + 1
            r6 = r28
            r11 = r16
            r13 = r24
            r9 = r25
            r10 = r27
            goto L_0x01d5
        L_0x0571:
            r25 = r9
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.h():boolean");
    }

    public void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            a aVar = (a) childAt.getLayoutParams();
            d dVar = aVar.f1579q0;
            if ((childAt.getVisibility() != 8 || aVar.f1554d0 || aVar.f1556e0 || isInEditMode) && !aVar.f1558f0) {
                int s10 = dVar.s();
                int t2 = dVar.t();
                int r10 = dVar.r() + s10;
                int l10 = dVar.l() + t2;
                childAt.layout(s10, t2, r10, l10);
                if ((childAt instanceof d) && (content = ((d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s10, t2, r10, l10);
                }
            }
        }
        ArrayList<a> arrayList = this.f1543b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.get(i14).getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x078a  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x078d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0197  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            boolean r3 = r0.D
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0023
            int r3 = r26.getChildCount()
            r6 = r5
        L_0x0011:
            if (r6 >= r3) goto L_0x0023
            android.view.View r7 = r0.getChildAt(r6)
            boolean r7 = r7.isLayoutRequested()
            if (r7 == 0) goto L_0x0020
            r0.D = r4
            goto L_0x0023
        L_0x0020:
            int r6 = r6 + 1
            goto L_0x0011
        L_0x0023:
            boolean r3 = r26.d()
            l1.e r4 = r0.f1544c
            r4.f10887x0 = r3
            boolean r3 = r0.D
            m1.b r6 = r4.f10883t0
            if (r3 == 0) goto L_0x003c
            r0.D = r5
            boolean r3 = r26.h()
            if (r3 == 0) goto L_0x003c
            r6.c(r4)
        L_0x003c:
            int r3 = r0.E
            int r7 = android.view.View.MeasureSpec.getMode(r27)
            int r8 = android.view.View.MeasureSpec.getSize(r27)
            int r9 = android.view.View.MeasureSpec.getMode(r28)
            int r10 = android.view.View.MeasureSpec.getSize(r28)
            int r11 = r26.getPaddingTop()
            int r11 = java.lang.Math.max(r5, r11)
            int r12 = r26.getPaddingBottom()
            int r12 = java.lang.Math.max(r5, r12)
            int r13 = r11 + r12
            int r14 = r26.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$b r15 = r0.K
            r15.f1591b = r11
            r15.f1592c = r12
            r15.f1593d = r14
            r15.f1594e = r13
            r15.f1595f = r1
            r15.f1596g = r2
            int r12 = r26.getPaddingStart()
            int r12 = java.lang.Math.max(r5, r12)
            int r2 = r26.getPaddingEnd()
            int r2 = java.lang.Math.max(r5, r2)
            if (r12 > 0) goto L_0x0090
            if (r2 <= 0) goto L_0x0087
            goto L_0x0090
        L_0x0087:
            int r2 = r26.getPaddingLeft()
            int r12 = java.lang.Math.max(r5, r2)
            goto L_0x0097
        L_0x0090:
            boolean r5 = r26.d()
            if (r5 == 0) goto L_0x0097
            r12 = r2
        L_0x0097:
            int r8 = r8 - r14
            int r10 = r10 - r13
            int r2 = r15.f1594e
            int r5 = r15.f1593d
            int r13 = r26.getChildCount()
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 == r14) goto L_0x00ca
            if (r7 == 0) goto L_0x00be
            if (r7 == r1) goto L_0x00ae
            r1 = 1
            r14 = 0
            goto L_0x00d7
        L_0x00ae:
            int r1 = r0.B
            int r1 = r1 - r5
            int r1 = java.lang.Math.min(r1, r8)
            r16 = 1
            r25 = r16
            r16 = r15
            r15 = r25
            goto L_0x00e1
        L_0x00be:
            if (r13 != 0) goto L_0x00c8
            int r1 = r0.f1545d
            r14 = 0
            int r1 = java.lang.Math.max(r14, r1)
            goto L_0x00d3
        L_0x00c8:
            r1 = 0
            goto L_0x00d3
        L_0x00ca:
            r1 = 0
            if (r13 != 0) goto L_0x00d5
            int r14 = r0.f1545d
            int r1 = java.lang.Math.max(r1, r14)
        L_0x00d3:
            r14 = r1
            goto L_0x00d6
        L_0x00d5:
            r14 = r8
        L_0x00d6:
            r1 = 2
        L_0x00d7:
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r25 = r15
            r15 = r1
            r1 = r14
            r14 = r16
            r16 = r25
        L_0x00e1:
            if (r9 == r14) goto L_0x0109
            if (r9 == 0) goto L_0x00f5
            r13 = 1073741824(0x40000000, float:2.0)
            if (r9 == r13) goto L_0x00ec
            r13 = 1
            r14 = 0
            goto L_0x0101
        L_0x00ec:
            int r13 = r0.C
            int r13 = r13 - r2
            int r13 = java.lang.Math.min(r13, r10)
            r14 = 1
            goto L_0x0115
        L_0x00f5:
            if (r13 != 0) goto L_0x00ff
            int r13 = r0.f1546e
            r14 = 0
            int r13 = java.lang.Math.max(r14, r13)
            goto L_0x0114
        L_0x00ff:
            r14 = 0
            r13 = 2
        L_0x0101:
            r17 = r10
            r25 = r14
            r14 = r13
            r13 = r25
            goto L_0x0117
        L_0x0109:
            r14 = 0
            if (r13 != 0) goto L_0x0113
            int r13 = r0.f1546e
            int r13 = java.lang.Math.max(r14, r13)
            goto L_0x0114
        L_0x0113:
            r13 = r10
        L_0x0114:
            r14 = 2
        L_0x0115:
            r17 = r10
        L_0x0117:
            int r10 = r4.r()
            r18 = r8
            m1.e r8 = r4.f10884u0
            if (r1 != r10) goto L_0x0127
            int r10 = r4.l()
            if (r13 == r10) goto L_0x012a
        L_0x0127:
            r10 = 1
            r8.f11136c = r10
        L_0x012a:
            r10 = 0
            r4.f10843b0 = r10
            r4.f10845c0 = r10
            int r10 = r0.B
            int r10 = r10 - r5
            r19 = r8
            int[] r8 = r4.D
            r20 = r9
            r9 = 0
            r8[r9] = r10
            int r10 = r0.C
            int r10 = r10 - r2
            r21 = 1
            r8[r21] = r10
            r4.f10849e0 = r9
            r4.f10851f0 = r9
            r4.M(r15)
            r4.O(r1)
            r4.N(r14)
            r4.L(r13)
            int r1 = r0.f1545d
            int r1 = r1 - r5
            if (r1 >= 0) goto L_0x015b
            r1 = 0
            r4.f10849e0 = r1
            goto L_0x015f
        L_0x015b:
            r5 = 0
            r4.f10849e0 = r1
            r1 = r5
        L_0x015f:
            int r5 = r0.f1546e
            int r5 = r5 - r2
            if (r5 >= 0) goto L_0x0167
            r4.f10851f0 = r1
            goto L_0x0169
        L_0x0167:
            r4.f10851f0 = r5
        L_0x0169:
            r4.f10889z0 = r12
            r4.A0 = r11
            r6.getClass()
            m1.b$b r1 = r4.f10886w0
            java.util.ArrayList<l1.d> r2 = r4.f10925s0
            int r2 = r2.size()
            int r5 = r4.r()
            int r9 = r4.l()
            r10 = 128(0x80, float:1.794E-43)
            boolean r10 = com.google.android.gms.internal.p000firebaseauthapi.gf.g(r3, r10)
            r11 = 64
            if (r10 != 0) goto L_0x0193
            boolean r3 = com.google.android.gms.internal.p000firebaseauthapi.gf.g(r3, r11)
            if (r3 == 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            r3 = 0
            goto L_0x0194
        L_0x0193:
            r3 = 1
        L_0x0194:
            r11 = 3
            if (r3 == 0) goto L_0x01eb
            r12 = 0
        L_0x0198:
            if (r12 >= r2) goto L_0x01eb
            java.util.ArrayList<l1.d> r13 = r4.f10925s0
            java.lang.Object r13 = r13.get(r12)
            l1.d r13 = (l1.d) r13
            int[] r14 = r13.V
            r15 = 0
            r15 = r14[r15]
            if (r15 != r11) goto L_0x01ab
            r15 = 1
            goto L_0x01ac
        L_0x01ab:
            r15 = 0
        L_0x01ac:
            r21 = 1
            r14 = r14[r21]
            if (r14 != r11) goto L_0x01b4
            r14 = 1
            goto L_0x01b5
        L_0x01b4:
            r14 = 0
        L_0x01b5:
            if (r15 == 0) goto L_0x01c2
            if (r14 == 0) goto L_0x01c2
            float r14 = r13.Z
            r15 = 0
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x01c2
            r14 = 1
            goto L_0x01c3
        L_0x01c2:
            r14 = 0
        L_0x01c3:
            boolean r15 = r13.y()
            if (r15 == 0) goto L_0x01cc
            if (r14 == 0) goto L_0x01cc
            goto L_0x01ea
        L_0x01cc:
            boolean r15 = r13.z()
            if (r15 == 0) goto L_0x01d5
            if (r14 == 0) goto L_0x01d5
            goto L_0x01ea
        L_0x01d5:
            boolean r14 = r13 instanceof l1.j
            if (r14 == 0) goto L_0x01da
            goto L_0x01ea
        L_0x01da:
            boolean r14 = r13.y()
            if (r14 != 0) goto L_0x01ea
            boolean r13 = r13.z()
            if (r13 == 0) goto L_0x01e7
            goto L_0x01ea
        L_0x01e7:
            int r12 = r12 + 1
            goto L_0x0198
        L_0x01ea:
            r3 = 0
        L_0x01eb:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = r20
            if (r7 != r11) goto L_0x01f3
            if (r12 == r11) goto L_0x01f5
        L_0x01f3:
            if (r10 == 0) goto L_0x01f7
        L_0x01f5:
            r11 = 1
            goto L_0x01f8
        L_0x01f7:
            r11 = 0
        L_0x01f8:
            r3 = r3 & r11
            if (r3 == 0) goto L_0x0455
            r11 = 0
            r11 = r8[r11]
            r13 = r18
            int r11 = java.lang.Math.min(r11, r13)
            r13 = 1
            r8 = r8[r13]
            r14 = r17
            int r8 = java.lang.Math.min(r8, r14)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r7 != r14) goto L_0x021f
            int r15 = r4.r()
            if (r15 == r11) goto L_0x021f
            r4.O(r11)
            r11 = r19
            r11.f11135b = r13
            goto L_0x0221
        L_0x021f:
            r11 = r19
        L_0x0221:
            if (r12 != r14) goto L_0x022e
            int r15 = r4.l()
            if (r15 == r8) goto L_0x022e
            r4.L(r8)
            r11.f11135b = r13
        L_0x022e:
            if (r7 != r14) goto L_0x03b4
            if (r12 != r14) goto L_0x03b4
            r8 = r10 & 1
            boolean r10 = r11.f11135b
            l1.e r13 = r11.f11134a
            if (r10 != 0) goto L_0x0241
            boolean r10 = r11.f11136c
            if (r10 == 0) goto L_0x023f
            goto L_0x0241
        L_0x023f:
            r10 = 0
            goto L_0x0276
        L_0x0241:
            java.util.ArrayList<l1.d> r10 = r13.f10925s0
            java.util.Iterator r10 = r10.iterator()
        L_0x0247:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x0264
            java.lang.Object r14 = r10.next()
            l1.d r14 = (l1.d) r14
            r14.i()
            r15 = 0
            r14.f10840a = r15
            m1.l r15 = r14.f10846d
            r15.n()
            m1.n r14 = r14.f10848e
            r14.m()
            goto L_0x0247
        L_0x0264:
            r13.i()
            r10 = 0
            r13.f10840a = r10
            m1.l r14 = r13.f10846d
            r14.n()
            m1.n r14 = r13.f10848e
            r14.m()
            r11.f11136c = r10
        L_0x0276:
            l1.e r14 = r11.f11137d
            r11.b(r14)
            r13.f10843b0 = r10
            r13.f10845c0 = r10
            int r10 = r13.k(r10)
            r14 = 1
            int r14 = r13.k(r14)
            boolean r15 = r11.f11135b
            if (r15 == 0) goto L_0x028f
            r11.c()
        L_0x028f:
            int r15 = r13.s()
            int r0 = r13.t()
            r17 = r3
            m1.l r3 = r13.f10846d
            m1.f r3 = r3.f11173h
            r3.d(r15)
            m1.n r3 = r13.f10848e
            m1.f r3 = r3.f11173h
            r3.d(r0)
            r11.g()
            java.util.ArrayList<m1.p> r3 = r11.f11138e
            r18 = r1
            r1 = 2
            if (r10 == r1) goto L_0x02b7
            if (r14 != r1) goto L_0x02b4
            goto L_0x02b7
        L_0x02b4:
            r19 = r5
            goto L_0x030c
        L_0x02b7:
            if (r8 == 0) goto L_0x02d0
            java.util.Iterator r1 = r3.iterator()
        L_0x02bd:
            boolean r19 = r1.hasNext()
            if (r19 == 0) goto L_0x02d0
            java.lang.Object r19 = r1.next()
            m1.p r19 = (m1.p) r19
            boolean r19 = r19.k()
            if (r19 != 0) goto L_0x02bd
            r8 = 0
        L_0x02d0:
            if (r8 == 0) goto L_0x02ef
            r1 = 2
            if (r10 != r1) goto L_0x02ef
            r1 = 1
            r13.M(r1)
            r1 = 0
            int r1 = r11.d(r13, r1)
            r13.O(r1)
            m1.l r1 = r13.f10846d
            m1.g r1 = r1.f11170e
            r19 = r5
            int r5 = r13.r()
            r1.d(r5)
            goto L_0x02f1
        L_0x02ef:
            r19 = r5
        L_0x02f1:
            if (r8 == 0) goto L_0x030c
            r1 = 2
            if (r14 != r1) goto L_0x030c
            r1 = 1
            r13.N(r1)
            int r1 = r11.d(r13, r1)
            r13.L(r1)
            m1.n r1 = r13.f10848e
            m1.g r1 = r1.f11170e
            int r5 = r13.l()
            r1.d(r5)
        L_0x030c:
            int[] r1 = r13.V
            r5 = 0
            r5 = r1[r5]
            r8 = 4
            r20 = r9
            r9 = 1
            if (r5 == r9) goto L_0x031c
            if (r5 != r8) goto L_0x031a
            goto L_0x031c
        L_0x031a:
            r0 = 0
            goto L_0x0352
        L_0x031c:
            int r5 = r13.r()
            int r5 = r5 + r15
            m1.l r9 = r13.f10846d
            m1.f r9 = r9.f11174i
            r9.d(r5)
            m1.l r9 = r13.f10846d
            m1.g r9 = r9.f11170e
            int r5 = r5 - r15
            r9.d(r5)
            r11.g()
            r5 = 1
            r1 = r1[r5]
            if (r1 == r5) goto L_0x033a
            if (r1 != r8) goto L_0x034e
        L_0x033a:
            int r1 = r13.l()
            int r1 = r1 + r0
            m1.n r5 = r13.f10848e
            m1.f r5 = r5.f11174i
            r5.d(r1)
            m1.n r5 = r13.f10848e
            m1.g r5 = r5.f11170e
            int r1 = r1 - r0
            r5.d(r1)
        L_0x034e:
            r11.g()
            r0 = 1
        L_0x0352:
            java.util.Iterator r1 = r3.iterator()
        L_0x0356:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x036f
            java.lang.Object r5 = r1.next()
            m1.p r5 = (m1.p) r5
            l1.d r8 = r5.f11167b
            if (r8 != r13) goto L_0x036b
            boolean r8 = r5.f11172g
            if (r8 != 0) goto L_0x036b
            goto L_0x0356
        L_0x036b:
            r5.e()
            goto L_0x0356
        L_0x036f:
            java.util.Iterator r1 = r3.iterator()
        L_0x0373:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x03a8
            java.lang.Object r3 = r1.next()
            m1.p r3 = (m1.p) r3
            if (r0 != 0) goto L_0x0386
            l1.d r5 = r3.f11167b
            if (r5 != r13) goto L_0x0386
            goto L_0x0373
        L_0x0386:
            m1.f r5 = r3.f11173h
            boolean r5 = r5.f11151j
            if (r5 != 0) goto L_0x038d
            goto L_0x03a6
        L_0x038d:
            m1.f r5 = r3.f11174i
            boolean r5 = r5.f11151j
            if (r5 != 0) goto L_0x0398
            boolean r5 = r3 instanceof m1.j
            if (r5 != 0) goto L_0x0398
            goto L_0x03a6
        L_0x0398:
            m1.g r5 = r3.f11170e
            boolean r5 = r5.f11151j
            if (r5 != 0) goto L_0x0373
            boolean r5 = r3 instanceof m1.c
            if (r5 != 0) goto L_0x0373
            boolean r3 = r3 instanceof m1.j
            if (r3 != 0) goto L_0x0373
        L_0x03a6:
            r0 = 0
            goto L_0x03a9
        L_0x03a8:
            r0 = 1
        L_0x03a9:
            r13.M(r10)
            r13.N(r14)
            r1 = 1073741824(0x40000000, float:2.0)
            r3 = 2
            goto L_0x0445
        L_0x03b4:
            r18 = r1
            r17 = r3
            r19 = r5
            r20 = r9
            boolean r0 = r11.f11135b
            l1.e r1 = r11.f11134a
            if (r0 == 0) goto L_0x0411
            java.util.ArrayList<l1.d> r0 = r1.f10925s0
            java.util.Iterator r0 = r0.iterator()
        L_0x03c8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03f1
            java.lang.Object r3 = r0.next()
            l1.d r3 = (l1.d) r3
            r3.i()
            r5 = 0
            r3.f10840a = r5
            m1.l r8 = r3.f10846d
            m1.g r9 = r8.f11170e
            r9.f11151j = r5
            r8.f11172g = r5
            r8.n()
            m1.n r3 = r3.f10848e
            m1.g r8 = r3.f11170e
            r8.f11151j = r5
            r3.f11172g = r5
            r3.m()
            goto L_0x03c8
        L_0x03f1:
            r0 = 0
            r1.i()
            r1.f10840a = r0
            m1.l r3 = r1.f10846d
            m1.g r5 = r3.f11170e
            r5.f11151j = r0
            r3.f11172g = r0
            r3.n()
            m1.n r3 = r1.f10848e
            m1.g r5 = r3.f11170e
            r5.f11151j = r0
            r3.f11172g = r0
            r3.m()
            r11.c()
            goto L_0x0412
        L_0x0411:
            r0 = 0
        L_0x0412:
            l1.e r3 = r11.f11137d
            r11.b(r3)
            r1.f10843b0 = r0
            r1.f10845c0 = r0
            m1.l r3 = r1.f10846d
            m1.f r3 = r3.f11173h
            r3.d(r0)
            m1.n r1 = r1.f10848e
            m1.f r1 = r1.f11173h
            r1.d(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L_0x0436
            boolean r0 = r4.U(r0, r10)
            r3 = 1
            r0 = r0 & 1
            r5 = r3
            goto L_0x043a
        L_0x0436:
            r3 = 1
            r0 = 0
            r5 = r0
            r0 = r3
        L_0x043a:
            if (r12 != r1) goto L_0x0444
            boolean r3 = r4.U(r3, r10)
            r0 = r0 & r3
            int r3 = r5 + 1
            goto L_0x0445
        L_0x0444:
            r3 = r5
        L_0x0445:
            if (r0 == 0) goto L_0x045f
            if (r7 != r1) goto L_0x044b
            r5 = 1
            goto L_0x044c
        L_0x044b:
            r5 = 0
        L_0x044c:
            if (r12 != r1) goto L_0x0450
            r1 = 1
            goto L_0x0451
        L_0x0450:
            r1 = 0
        L_0x0451:
            r4.P(r5, r1)
            goto L_0x045f
        L_0x0455:
            r18 = r1
            r17 = r3
            r19 = r5
            r20 = r9
            r0 = 0
            r3 = 0
        L_0x045f:
            if (r0 == 0) goto L_0x0468
            r0 = 2
            if (r3 == r0) goto L_0x0465
            goto L_0x0468
        L_0x0465:
            r1 = r4
            goto L_0x0752
        L_0x0468:
            int r0 = r4.F0
            r1 = 8
            if (r2 <= 0) goto L_0x0578
            java.util.ArrayList<l1.d> r3 = r4.f10925s0
            int r3 = r3.size()
            r5 = 64
            boolean r5 = r4.W(r5)
            m1.b$b r7 = r4.f10886w0
            r8 = 0
        L_0x047d:
            if (r8 >= r3) goto L_0x050c
            java.util.ArrayList<l1.d> r9 = r4.f10925s0
            java.lang.Object r9 = r9.get(r8)
            l1.d r9 = (l1.d) r9
            boolean r10 = r9 instanceof l1.g
            if (r10 == 0) goto L_0x048d
            goto L_0x0508
        L_0x048d:
            boolean r10 = r9 instanceof l1.a
            if (r10 == 0) goto L_0x0493
            goto L_0x0508
        L_0x0493:
            boolean r10 = r9.H
            if (r10 == 0) goto L_0x0499
            goto L_0x0508
        L_0x0499:
            if (r5 == 0) goto L_0x04b0
            m1.l r10 = r9.f10846d
            if (r10 == 0) goto L_0x04b0
            m1.n r11 = r9.f10848e
            if (r11 == 0) goto L_0x04b0
            m1.g r10 = r10.f11170e
            boolean r10 = r10.f11151j
            if (r10 == 0) goto L_0x04b0
            m1.g r10 = r11.f11170e
            boolean r10 = r10.f11151j
            if (r10 == 0) goto L_0x04b0
            goto L_0x0508
        L_0x04b0:
            r10 = 0
            int r10 = r9.k(r10)
            r11 = 1
            int r12 = r9.k(r11)
            r13 = 3
            if (r10 != r13) goto L_0x04c9
            int r14 = r9.f10875s
            if (r14 == r11) goto L_0x04c9
            if (r12 != r13) goto L_0x04c9
            int r13 = r9.f10876t
            if (r13 == r11) goto L_0x04c9
            r13 = r11
            goto L_0x04ca
        L_0x04c9:
            r13 = 0
        L_0x04ca:
            if (r13 != 0) goto L_0x0501
            boolean r11 = r4.W(r11)
            if (r11 == 0) goto L_0x0501
            boolean r11 = r9 instanceof l1.j
            if (r11 != 0) goto L_0x0501
            r11 = 3
            if (r10 != r11) goto L_0x04e6
            int r14 = r9.f10875s
            if (r14 != 0) goto L_0x04e6
            if (r12 == r11) goto L_0x04e6
            boolean r14 = r9.y()
            if (r14 != 0) goto L_0x04e6
            r13 = 1
        L_0x04e6:
            if (r12 != r11) goto L_0x04f5
            int r14 = r9.f10876t
            if (r14 != 0) goto L_0x04f5
            if (r10 == r11) goto L_0x04f5
            boolean r14 = r9.y()
            if (r14 != 0) goto L_0x04f5
            r13 = 1
        L_0x04f5:
            if (r10 == r11) goto L_0x04f9
            if (r12 != r11) goto L_0x0501
        L_0x04f9:
            float r10 = r9.Z
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0501
            r13 = 1
        L_0x0501:
            if (r13 == 0) goto L_0x0504
            goto L_0x0508
        L_0x0504:
            r10 = 0
            r6.a(r10, r9, r7)
        L_0x0508:
            int r8 = r8 + 1
            goto L_0x047d
        L_0x050c:
            androidx.constraintlayout.widget.ConstraintLayout$b r7 = (androidx.constraintlayout.widget.ConstraintLayout.b) r7
            androidx.constraintlayout.widget.ConstraintLayout r3 = r7.f1590a
            int r5 = r3.getChildCount()
            r7 = 0
        L_0x0515:
            if (r7 >= r5) goto L_0x0561
            android.view.View r8 = r3.getChildAt(r7)
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.d
            if (r9 == 0) goto L_0x055e
            androidx.constraintlayout.widget.d r8 = (androidx.constraintlayout.widget.d) r8
            android.view.View r9 = r8.f1707b
            if (r9 != 0) goto L_0x0526
            goto L_0x055e
        L_0x0526:
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r9 = (androidx.constraintlayout.widget.ConstraintLayout.a) r9
            android.view.View r8 = r8.f1707b
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            l1.d r10 = r8.f1579q0
            r11 = 0
            r10.f10859j0 = r11
            l1.d r12 = r9.f1579q0
            int[] r13 = r12.V
            r11 = r13[r11]
            r13 = 1
            if (r11 == r13) goto L_0x0549
            int r10 = r10.r()
            r12.O(r10)
        L_0x0549:
            l1.d r9 = r9.f1579q0
            int[] r10 = r9.V
            r10 = r10[r13]
            if (r10 == r13) goto L_0x055a
            l1.d r10 = r8.f1579q0
            int r10 = r10.l()
            r9.L(r10)
        L_0x055a:
            l1.d r8 = r8.f1579q0
            r8.f10859j0 = r1
        L_0x055e:
            int r7 = r7 + 1
            goto L_0x0515
        L_0x0561:
            java.util.ArrayList<androidx.constraintlayout.widget.a> r1 = r3.f1543b
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x0578
            r5 = 0
        L_0x056a:
            if (r5 >= r3) goto L_0x0578
            java.lang.Object r7 = r1.get(r5)
            androidx.constraintlayout.widget.a r7 = (androidx.constraintlayout.widget.a) r7
            r7.getClass()
            int r5 = r5 + 1
            goto L_0x056a
        L_0x0578:
            r6.c(r4)
            java.util.ArrayList<l1.d> r1 = r6.f11119a
            int r3 = r1.size()
            if (r2 <= 0) goto L_0x058c
            r2 = 0
            r5 = r19
            r7 = r20
            r6.b(r4, r2, r5, r7)
            goto L_0x0591
        L_0x058c:
            r5 = r19
            r7 = r20
            r2 = 0
        L_0x0591:
            if (r3 <= 0) goto L_0x0747
            int[] r8 = r4.V
            r2 = r8[r2]
            r9 = 2
            if (r2 != r9) goto L_0x059c
            r2 = 1
            goto L_0x059d
        L_0x059c:
            r2 = 0
        L_0x059d:
            r10 = 1
            r8 = r8[r10]
            if (r8 != r9) goto L_0x05a4
            r8 = 1
            goto L_0x05a5
        L_0x05a4:
            r8 = 0
        L_0x05a5:
            int r9 = r4.r()
            l1.e r10 = r6.f11121c
            int r11 = r10.f10849e0
            int r9 = java.lang.Math.max(r9, r11)
            int r11 = r4.l()
            int r10 = r10.f10851f0
            int r10 = java.lang.Math.max(r11, r10)
            r11 = 0
            r12 = 0
        L_0x05bd:
            l1.c$a r13 = l1.c.a.f10838d
            l1.c$a r14 = l1.c.a.f10837c
            if (r11 >= r3) goto L_0x065c
            java.lang.Object r15 = r1.get(r11)
            l1.d r15 = (l1.d) r15
            r19 = r0
            boolean r0 = r15 instanceof l1.j
            if (r0 != 0) goto L_0x05d9
            r20 = r4
            r21 = r5
            r22 = r7
            r7 = r18
            goto L_0x064e
        L_0x05d9:
            int r0 = r15.r()
            r20 = r4
            int r4 = r15.l()
            r21 = r5
            r5 = 1
            r22 = r7
            r7 = r18
            boolean r5 = r6.a(r5, r15, r7)
            r5 = r5 | r12
            int r12 = r15.r()
            r18 = r5
            int r5 = r15.l()
            if (r12 == r0) goto L_0x0620
            r15.O(r12)
            if (r2 == 0) goto L_0x061e
            int r0 = r15.s()
            int r12 = r15.X
            int r0 = r0 + r12
            if (r0 <= r9) goto L_0x061e
            int r0 = r15.s()
            int r12 = r15.X
            int r0 = r0 + r12
            l1.c r12 = r15.j(r14)
            int r12 = r12.e()
            int r12 = r12 + r0
            int r0 = java.lang.Math.max(r9, r12)
            r9 = r0
        L_0x061e:
            r0 = 1
            goto L_0x0622
        L_0x0620:
            r0 = r18
        L_0x0622:
            if (r5 == r4) goto L_0x0648
            r15.L(r5)
            if (r8 == 0) goto L_0x0647
            int r0 = r15.t()
            int r4 = r15.Y
            int r0 = r0 + r4
            if (r0 <= r10) goto L_0x0647
            int r0 = r15.t()
            int r4 = r15.Y
            int r0 = r0 + r4
            l1.c r4 = r15.j(r13)
            int r4 = r4.e()
            int r4 = r4 + r0
            int r0 = java.lang.Math.max(r10, r4)
            r10 = r0
        L_0x0647:
            r0 = 1
        L_0x0648:
            l1.j r15 = (l1.j) r15
            boolean r4 = r15.A0
            r0 = r0 | r4
            r12 = r0
        L_0x064e:
            int r11 = r11 + 1
            r18 = r7
            r0 = r19
            r4 = r20
            r5 = r21
            r7 = r22
            goto L_0x05bd
        L_0x065c:
            r19 = r0
            r20 = r4
            r21 = r5
            r22 = r7
            r7 = r18
            r0 = 0
            r4 = 2
        L_0x0668:
            if (r0 >= r4) goto L_0x0742
            r4 = 0
        L_0x066b:
            if (r4 >= r3) goto L_0x0728
            java.lang.Object r5 = r1.get(r4)
            l1.d r5 = (l1.d) r5
            boolean r11 = r5 instanceof l1.h
            if (r11 == 0) goto L_0x067b
            boolean r11 = r5 instanceof l1.j
            if (r11 == 0) goto L_0x069e
        L_0x067b:
            boolean r11 = r5 instanceof l1.g
            if (r11 == 0) goto L_0x0680
            goto L_0x069e
        L_0x0680:
            int r11 = r5.f10859j0
            r15 = 8
            if (r11 != r15) goto L_0x0687
            goto L_0x069e
        L_0x0687:
            if (r17 == 0) goto L_0x069a
            m1.l r11 = r5.f10846d
            m1.g r11 = r11.f11170e
            boolean r11 = r11.f11151j
            if (r11 == 0) goto L_0x069a
            m1.n r11 = r5.f10848e
            m1.g r11 = r11.f11170e
            boolean r11 = r11.f11151j
            if (r11 == 0) goto L_0x069a
            goto L_0x069e
        L_0x069a:
            boolean r11 = r5 instanceof l1.j
            if (r11 == 0) goto L_0x06a4
        L_0x069e:
            r18 = r1
            r23 = r3
            goto L_0x0720
        L_0x06a4:
            int r11 = r5.r()
            int r15 = r5.l()
            r18 = r1
            int r1 = r5.f10847d0
            r23 = r3
            r3 = 1
            if (r0 != r3) goto L_0x06b6
            r3 = 2
        L_0x06b6:
            boolean r3 = r6.a(r3, r5, r7)
            r3 = r3 | r12
            int r12 = r5.r()
            r24 = r3
            int r3 = r5.l()
            if (r12 == r11) goto L_0x06ec
            r5.O(r12)
            if (r2 == 0) goto L_0x06e9
            int r11 = r5.s()
            int r12 = r5.X
            int r11 = r11 + r12
            if (r11 <= r9) goto L_0x06e9
            int r11 = r5.s()
            int r12 = r5.X
            int r11 = r11 + r12
            l1.c r12 = r5.j(r14)
            int r12 = r12.e()
            int r12 = r12 + r11
            int r9 = java.lang.Math.max(r9, r12)
        L_0x06e9:
            r11 = 1
            r24 = r11
        L_0x06ec:
            if (r3 == r15) goto L_0x0713
            r5.L(r3)
            if (r8 == 0) goto L_0x0711
            int r3 = r5.t()
            int r11 = r5.Y
            int r3 = r3 + r11
            if (r3 <= r10) goto L_0x0711
            int r3 = r5.t()
            int r11 = r5.Y
            int r3 = r3 + r11
            l1.c r11 = r5.j(r13)
            int r11 = r11.e()
            int r11 = r11 + r3
            int r3 = java.lang.Math.max(r10, r11)
            r10 = r3
        L_0x0711:
            r24 = 1
        L_0x0713:
            boolean r3 = r5.F
            if (r3 == 0) goto L_0x071e
            int r3 = r5.f10847d0
            if (r1 == r3) goto L_0x071e
            r1 = 1
            r12 = r1
            goto L_0x0720
        L_0x071e:
            r12 = r24
        L_0x0720:
            int r4 = r4 + 1
            r1 = r18
            r3 = r23
            goto L_0x066b
        L_0x0728:
            r18 = r1
            r23 = r3
            if (r12 == 0) goto L_0x0742
            int r0 = r0 + 1
            r1 = r20
            r3 = r21
            r4 = r22
            r6.b(r1, r0, r3, r4)
            r5 = 2
            r12 = 0
            r4 = r5
            r1 = r18
            r3 = r23
            goto L_0x0668
        L_0x0742:
            r1 = r20
            r0 = r19
            goto L_0x0748
        L_0x0747:
            r1 = r4
        L_0x0748:
            r1.F0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.W(r0)
            j1.d.f9759p = r0
        L_0x0752:
            int r0 = r1.r()
            int r2 = r1.l()
            boolean r3 = r1.G0
            boolean r1 = r1.H0
            r4 = r16
            int r5 = r4.f1594e
            int r4 = r4.f1593d
            int r0 = r0 + r4
            int r2 = r2 + r5
            r4 = 0
            r5 = r27
            int r0 = android.view.View.resolveSizeAndState(r0, r5, r4)
            r5 = r28
            int r2 = android.view.View.resolveSizeAndState(r2, r5, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r4
            r2 = r2 & r4
            r4 = r26
            int r5 = r4.B
            int r0 = java.lang.Math.min(r5, r0)
            int r5 = r4.C
            int r2 = java.lang.Math.min(r5, r2)
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r3 == 0) goto L_0x078b
            r0 = r0 | r5
        L_0x078b:
            if (r1 == 0) goto L_0x078e
            r2 = r2 | r5
        L_0x078e:
            r4.setMeasuredDimension(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        d b10 = b(view);
        if ((view instanceof Guideline) && !(b10 instanceof l1.g)) {
            a aVar = (a) view.getLayoutParams();
            l1.g gVar = new l1.g();
            aVar.f1579q0 = gVar;
            aVar.f1554d0 = true;
            gVar.S(aVar.V);
        }
        if (view instanceof a) {
            a aVar2 = (a) view;
            aVar2.k();
            ((a) view.getLayoutParams()).f1556e0 = true;
            ArrayList<a> arrayList = this.f1543b;
            if (!arrayList.contains(aVar2)) {
                arrayList.add(aVar2);
            }
        }
        this.f1542a.put(view.getId(), view);
        this.D = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1542a.remove(view.getId());
        d b10 = b(view);
        this.f1544c.f10925s0.remove(b10);
        b10.D();
        this.f1543b.remove(view);
        this.D = true;
    }

    public void requestLayout() {
        this.D = true;
        super.requestLayout();
    }

    public void setConstraintSet(b bVar) {
        this.F = bVar;
    }

    public void setId(int i8) {
        int id2 = getId();
        SparseArray<View> sparseArray = this.f1542a;
        sparseArray.remove(id2);
        super.setId(i8);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i8) {
        if (i8 != this.C) {
            this.C = i8;
            requestLayout();
        }
    }

    public void setMaxWidth(int i8) {
        if (i8 != this.B) {
            this.B = i8;
            requestLayout();
        }
    }

    public void setMinHeight(int i8) {
        if (i8 != this.f1546e) {
            this.f1546e = i8;
            requestLayout();
        }
    }

    public void setMinWidth(int i8) {
        if (i8 != this.f1545d) {
            this.f1545d = i8;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(o1.c cVar) {
        o1.b bVar = this.G;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i8) {
        this.E = i8;
        l1.e eVar = this.f1544c;
        eVar.F0 = i8;
        j1.d.f9759p = eVar.W(512);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        c(attributeSet, i8);
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public final int C = Integer.MIN_VALUE;
        public final int D = 0;
        public float E = 0.5f;
        public float F = 0.5f;
        public String G = null;
        public float H = -1.0f;
        public float I = -1.0f;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public float R = 1.0f;
        public float S = 1.0f;
        public int T = -1;
        public int U = -1;
        public int V = -1;
        public boolean W = false;
        public boolean X = false;
        public String Y = null;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public int f1547a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1548a0 = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1549b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1550b0 = true;

        /* renamed from: c  reason: collision with root package name */
        public float f1551c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f1552c0 = false;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1553d = true;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f1554d0 = false;

        /* renamed from: e  reason: collision with root package name */
        public int f1555e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f1556e0 = false;

        /* renamed from: f  reason: collision with root package name */
        public int f1557f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f1558f0 = false;

        /* renamed from: g  reason: collision with root package name */
        public int f1559g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f1560g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f1561h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1562h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f1563i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f1564i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1565j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f1566j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1567k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f1568k0 = Integer.MIN_VALUE;

        /* renamed from: l  reason: collision with root package name */
        public int f1569l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public int f1570l0 = Integer.MIN_VALUE;
        public int m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public float f1571m0 = 0.5f;

        /* renamed from: n  reason: collision with root package name */
        public int f1572n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public int f1573n0;

        /* renamed from: o  reason: collision with root package name */
        public int f1574o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public int f1575o0;

        /* renamed from: p  reason: collision with root package name */
        public int f1576p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public float f1577p0;

        /* renamed from: q  reason: collision with root package name */
        public int f1578q = 0;

        /* renamed from: q0  reason: collision with root package name */
        public d f1579q0 = new d();

        /* renamed from: r  reason: collision with root package name */
        public float f1580r = 0.0f;

        /* renamed from: s  reason: collision with root package name */
        public int f1581s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1582t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1583u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1584v = -1;

        /* renamed from: w  reason: collision with root package name */
        public final int f1585w = Integer.MIN_VALUE;

        /* renamed from: x  reason: collision with root package name */
        public int f1586x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public final int f1587y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f1588z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0017a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1589a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1589a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gf.f4584c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                int i10 = C0017a.f1589a.get(index);
                switch (i10) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1576p);
                        this.f1576p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f1576p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1578q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1578q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1580r) % 360.0f;
                        this.f1580r = f10;
                        if (f10 >= 0.0f) {
                            break;
                        } else {
                            this.f1580r = (360.0f - f10) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1547a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1547a);
                        break;
                    case 6:
                        this.f1549b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1549b);
                        break;
                    case 7:
                        this.f1551c = obtainStyledAttributes.getFloat(index, this.f1551c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1555e);
                        this.f1555e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1555e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1557f);
                        this.f1557f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1557f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1559g);
                        this.f1559g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f1559g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION /*11*/:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1561h);
                        this.f1561h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1561h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1563i);
                        this.f1563i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f1563i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1565j);
                        this.f1565j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f1565j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1567k);
                        this.f1567k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f1567k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1569l);
                        this.f1569l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f1569l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1581s);
                        this.f1581s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f1581s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1582t);
                        this.f1582t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f1582t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1583u);
                        this.f1583u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f1583u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1584v);
                        this.f1584v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f1584v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1585w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1585w);
                        break;
                    case 22:
                        this.f1586x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1586x);
                        break;
                    case 23:
                        this.f1587y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1587y);
                        break;
                    case 24:
                        this.f1588z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1588z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i11 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i11;
                        if (i11 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i12;
                        if (i12 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) != -2) {
                                break;
                            } else {
                                this.N = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) != -2) {
                                break;
                            } else {
                                this.P = -2;
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) != -2) {
                                break;
                            } else {
                                this.O = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) != -2) {
                                break;
                            } else {
                                this.Q = -2;
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i10) {
                            case 44:
                                b.h(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1572n);
                                this.f1572n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f1572n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1574o);
                                this.f1574o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f1574o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i10) {
                                    case 64:
                                        b.g(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        b.g(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.f1553d = obtainStyledAttributes.getBoolean(index, this.f1553d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f1554d0 = false;
            this.f1548a0 = true;
            this.f1550b0 = true;
            int i8 = this.width;
            if (i8 == -2 && this.W) {
                this.f1548a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i10 = this.height;
            if (i10 == -2 && this.X) {
                this.f1550b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f1548a0 = false;
                if (i8 == 0 && this.L == 1) {
                    this.width = -2;
                    this.W = true;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1550b0 = false;
                if (i10 == 0 && this.M == 1) {
                    this.height = -2;
                    this.X = true;
                }
            }
            if (this.f1551c != -1.0f || this.f1547a != -1 || this.f1549b != -1) {
                this.f1554d0 = true;
                this.f1548a0 = true;
                this.f1550b0 = true;
                if (!(this.f1579q0 instanceof l1.g)) {
                    this.f1579q0 = new l1.g();
                }
                ((l1.g) this.f1579q0).S(this.V);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f1564i0 = r4
                r10.f1566j0 = r4
                r10.f1560g0 = r4
                r10.f1562h0 = r4
                int r5 = r10.f1585w
                r10.f1568k0 = r5
                int r5 = r10.f1587y
                r10.f1570l0 = r5
                float r5 = r10.E
                r10.f1571m0 = r5
                int r6 = r10.f1547a
                r10.f1573n0 = r6
                int r7 = r10.f1549b
                r10.f1575o0 = r7
                float r8 = r10.f1551c
                r10.f1577p0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f1581s
                if (r11 == r4) goto L_0x003f
                r10.f1564i0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f1582t
                if (r11 == r4) goto L_0x0046
                r10.f1566j0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f1583u
                if (r11 == r4) goto L_0x004d
                r10.f1562h0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f1584v
                if (r11 == r4) goto L_0x0054
                r10.f1560g0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.A
                if (r11 == r9) goto L_0x005a
                r10.f1570l0 = r11
            L_0x005a:
                int r11 = r10.B
                if (r11 == r9) goto L_0x0060
                r10.f1568k0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f1571m0 = r2
            L_0x0068:
                boolean r2 = r10.f1554d0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.V
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f1553d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f1577p0 = r11
                r10.f1573n0 = r4
                r10.f1575o0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f1575o0 = r6
                r10.f1573n0 = r4
                r10.f1577p0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f1573n0 = r7
                r10.f1575o0 = r4
                r10.f1577p0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f1581s
                if (r11 == r4) goto L_0x009a
                r10.f1562h0 = r11
            L_0x009a:
                int r11 = r10.f1582t
                if (r11 == r4) goto L_0x00a0
                r10.f1560g0 = r11
            L_0x00a0:
                int r11 = r10.f1583u
                if (r11 == r4) goto L_0x00a6
                r10.f1564i0 = r11
            L_0x00a6:
                int r11 = r10.f1584v
                if (r11 == r4) goto L_0x00ac
                r10.f1566j0 = r11
            L_0x00ac:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b2
                r10.f1568k0 = r11
            L_0x00b2:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00b8
                r10.f1570l0 = r11
            L_0x00b8:
                int r11 = r10.f1583u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1584v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1582t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1581s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1559g
                if (r11 == r4) goto L_0x00d7
                r10.f1564i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f1561h
                if (r11 == r4) goto L_0x00e5
                r10.f1566j0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f1555e
                if (r11 == r4) goto L_0x00f4
                r10.f1560g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f1557f
                if (r11 == r4) goto L_0x0102
                r10.f1562h0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }

        public a() {
            super(-2, -2);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
