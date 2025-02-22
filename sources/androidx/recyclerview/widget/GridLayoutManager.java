package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import b3.x;
import d2.d1;
import d2.i0;
import e2.i;
import java.util.Arrays;
import java.util.WeakHashMap;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public final a K = new a();
    public final Rect L = new Rect();

    public static final class a extends c {
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f2364a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f2365b = new SparseIntArray();

        public static int a(int i8, int i10) {
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                i11++;
                if (i11 == i10) {
                    i12++;
                    i11 = 0;
                } else if (i11 > i10) {
                    i12++;
                    i11 = 1;
                }
            }
            return i11 + 1 > i10 ? i12 + 1 : i12;
        }

        public final void b() {
            this.f2364a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i8, int i10) {
        super(context, attributeSet, i8, i10);
        o1(RecyclerView.m.H(context, attributeSet, i8, i10).f2488b);
    }

    public final boolean C0() {
        return this.f2376z == null && !this.E;
    }

    public final void E0(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        int i8 = this.F;
        int i10 = 0;
        while (i10 < this.F) {
            int i11 = cVar.f2389d;
            if ((i11 >= 0 && i11 < yVar.b()) && i8 > 0) {
                ((m.b) cVar2).a(cVar.f2389d, Math.max(0, cVar.f2392g));
                this.K.getClass();
                i8--;
                cVar.f2389d += cVar.f2390e;
                i10++;
            } else {
                return;
            }
        }
    }

    public final int J(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2366p == 0) {
            return this.F;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return k1(yVar.b() - 1, tVar, yVar) + 1;
    }

    public final View R0(RecyclerView.t tVar, RecyclerView.y yVar, boolean z10, boolean z11) {
        int i8;
        int i10;
        int w10 = w();
        int i11 = 1;
        if (z11) {
            i10 = w() - 1;
            i8 = -1;
            i11 = -1;
        } else {
            i8 = w10;
            i10 = 0;
        }
        int b10 = yVar.b();
        J0();
        int k10 = this.f2368r.k();
        int g10 = this.f2368r.g();
        View view = null;
        View view2 = null;
        while (i10 != i8) {
            View v3 = v(i10);
            int G2 = RecyclerView.m.G(v3);
            if (G2 >= 0 && G2 < b10 && l1(G2, tVar, yVar) == 0) {
                if (((RecyclerView.n) v3.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = v3;
                    }
                } else if (this.f2368r.e(v3) < g10 && this.f2368r.b(v3) >= k10) {
                    return v3;
                } else {
                    if (view == null) {
                        view = v3;
                    }
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e1, code lost:
        if (r13 == (r2 > r15)) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0111, code lost:
        if (r13 == (r2 > r9)) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0.f2471a.j(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View T(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.t r25, androidx.recyclerview.widget.RecyclerView.y r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f2472b
            r4 = 0
            if (r3 != 0) goto L_0x000f
            r5 = r23
        L_0x000d:
            r3 = r4
            goto L_0x0021
        L_0x000f:
            r5 = r23
            android.view.View r3 = r3.B(r5)
            if (r3 != 0) goto L_0x0018
        L_0x0017:
            goto L_0x000d
        L_0x0018:
            androidx.recyclerview.widget.d r6 = r0.f2471a
            boolean r6 = r6.j(r3)
            if (r6 == 0) goto L_0x0021
            goto L_0x0017
        L_0x0021:
            if (r3 != 0) goto L_0x0024
            return r4
        L_0x0024:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r6 = (androidx.recyclerview.widget.GridLayoutManager.b) r6
            int r7 = r6.f2362e
            int r6 = r6.f2363f
            int r6 = r6 + r7
            android.view.View r5 = super.T(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0036
            return r4
        L_0x0036:
            r5 = r24
            int r5 = r0.I0(r5)
            r8 = 1
            if (r5 != r8) goto L_0x0041
            r5 = r8
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            boolean r10 = r0.f2371u
            if (r5 == r10) goto L_0x0048
            r5 = r8
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            r10 = -1
            if (r5 == 0) goto L_0x0054
            int r5 = r22.w()
            int r5 = r5 - r8
            r11 = r10
            r12 = r11
            goto L_0x005b
        L_0x0054:
            int r5 = r22.w()
            r11 = r5
            r12 = r8
            r5 = 0
        L_0x005b:
            int r13 = r0.f2366p
            if (r13 != r8) goto L_0x0067
            boolean r13 = r22.W0()
            if (r13 == 0) goto L_0x0067
            r13 = r8
            goto L_0x0068
        L_0x0067:
            r13 = 0
        L_0x0068:
            int r14 = r0.k1(r5, r1, r2)
            r9 = r10
            r15 = r9
            r16 = r12
            r8 = 0
            r12 = 0
            r10 = r5
            r5 = r4
        L_0x0074:
            if (r10 == r11) goto L_0x0155
            r17 = r11
            int r11 = r0.k1(r10, r1, r2)
            android.view.View r1 = r0.v(r10)
            if (r1 != r3) goto L_0x0084
            goto L_0x0155
        L_0x0084:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x009a
            if (r11 == r14) goto L_0x009a
            if (r4 == 0) goto L_0x0090
            goto L_0x0155
        L_0x0090:
            r18 = r3
            r21 = r5
            r19 = r8
            r20 = 1
            goto L_0x0145
        L_0x009a:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.b) r11
            int r2 = r11.f2362e
            r18 = r3
            int r3 = r11.f2363f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b2
            if (r2 != r7) goto L_0x00b2
            if (r3 != r6) goto L_0x00b2
            return r1
        L_0x00b2:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00ba
            if (r4 == 0) goto L_0x00c2
        L_0x00ba:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c5
            if (r5 != 0) goto L_0x00c5
        L_0x00c2:
            r21 = r5
            goto L_0x00e3
        L_0x00c5:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e9
            if (r5 <= r8) goto L_0x00da
            goto L_0x00e3
        L_0x00da:
            if (r5 != r8) goto L_0x0116
            if (r2 <= r15) goto L_0x00e0
            r5 = 1
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            if (r13 != r5) goto L_0x0116
        L_0x00e3:
            r19 = r8
            r5 = 1
            r20 = 1
            goto L_0x011b
        L_0x00e9:
            if (r4 != 0) goto L_0x0116
            r19 = r8
            androidx.recyclerview.widget.c0 r8 = r0.f2473c
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00ff
            androidx.recyclerview.widget.c0 r8 = r0.f2474d
            boolean r8 = r8.b(r1)
            if (r8 == 0) goto L_0x00ff
            r8 = 1
            goto L_0x0100
        L_0x00ff:
            r8 = 0
        L_0x0100:
            r20 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x011a
            if (r5 <= r12) goto L_0x0109
            goto L_0x0113
        L_0x0109:
            if (r5 != r12) goto L_0x011a
            if (r2 <= r9) goto L_0x0110
            r5 = r20
            goto L_0x0111
        L_0x0110:
            r5 = 0
        L_0x0111:
            if (r13 != r5) goto L_0x011a
        L_0x0113:
            r5 = r20
            goto L_0x011b
        L_0x0116:
            r19 = r8
            r20 = 1
        L_0x011a:
            r5 = 0
        L_0x011b:
            if (r5 == 0) goto L_0x0145
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x0134
            int r4 = r11.f2362e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r8 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0149
        L_0x0134:
            int r5 = r11.f2362e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r9 = r5
            r8 = r19
            r5 = r1
            goto L_0x0149
        L_0x0145:
            r8 = r19
            r5 = r21
        L_0x0149:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            goto L_0x0074
        L_0x0155:
            r21 = r5
            if (r4 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r4 = r21
        L_0x015c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.T(android.view.View, int, androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    public final void X(RecyclerView.t tVar, RecyclerView.y yVar, View view, i iVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            W(view, iVar);
            return;
        }
        b bVar = (b) layoutParams;
        int k12 = k1(bVar.a(), tVar, yVar);
        if (this.f2366p == 0) {
            iVar.l(i.d.a(bVar.f2362e, bVar.f2363f, k12, 1, false, false));
            return;
        }
        iVar.l(i.d.a(k12, 1, bVar.f2362e, bVar.f2363f, false, false));
    }

    public final void X0(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        View b10;
        RecyclerView.t tVar2 = tVar;
        RecyclerView.y yVar2 = yVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int j10 = this.f2368r.j();
        int i20 = 1;
        boolean z11 = j10 != 1073741824;
        int i21 = w() > 0 ? this.G[this.F] : 0;
        if (z11) {
            p1();
        }
        boolean z12 = cVar2.f2390e == 1;
        int i22 = this.F;
        if (!z12) {
            i22 = l1(cVar2.f2389d, tVar2, yVar2) + m1(cVar2.f2389d, tVar2, yVar2);
        }
        int i23 = 0;
        while (i23 < this.F) {
            int i24 = cVar2.f2389d;
            if (!(i24 >= 0 && i24 < yVar.b()) || i22 <= 0) {
                break;
            }
            int i25 = cVar2.f2389d;
            int m12 = m1(i25, tVar2, yVar2);
            if (m12 <= this.F) {
                i22 -= m12;
                if (i22 < 0 || (b10 = cVar2.b(tVar2)) == null) {
                    break;
                }
                this.H[i23] = b10;
                i23++;
            } else {
                StringBuilder sb2 = new StringBuilder("Item at position ");
                sb2.append(i25);
                sb2.append(" requires ");
                sb2.append(m12);
                sb2.append(" spans but GridLayoutManager has only ");
                throw new IllegalArgumentException(x.b(sb2, this.F, " spans."));
            }
        }
        if (i23 == 0) {
            bVar2.f2383b = true;
            return;
        }
        if (z12) {
            i10 = 0;
            i8 = i23;
        } else {
            i10 = i23 - 1;
            i20 = -1;
            i8 = -1;
        }
        int i26 = 0;
        while (i10 != i8) {
            View view = this.H[i10];
            b bVar3 = (b) view.getLayoutParams();
            int m13 = m1(RecyclerView.m.G(view), tVar2, yVar2);
            bVar3.f2363f = m13;
            bVar3.f2362e = i26;
            i26 += m13;
            i10 += i20;
        }
        float f10 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i23; i28++) {
            View view2 = this.H[i28];
            if (cVar2.f2396k != null) {
                z10 = false;
                if (z12) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z12) {
                z10 = false;
                b(view2, -1, false);
            } else {
                z10 = false;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f2472b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(z10 ? 1 : 0, z10, z10, z10);
            } else {
                rect.set(recyclerView.K(view2));
            }
            n1(view2, j10, z10);
            int c3 = this.f2368r.c(view2);
            if (c3 > i27) {
                i27 = c3;
            }
            float d10 = (((float) this.f2368r.d(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f2363f);
            if (d10 > f10) {
                f10 = d10;
            }
        }
        if (z11) {
            i1(Math.max(Math.round(f10 * ((float) this.F)), i21));
            i27 = 0;
            for (int i29 = 0; i29 < i23; i29++) {
                View view3 = this.H[i29];
                n1(view3, 1073741824, true);
                int c10 = this.f2368r.c(view3);
                if (c10 > i27) {
                    i27 = c10;
                }
            }
        }
        for (int i30 = 0; i30 < i23; i30++) {
            View view4 = this.H[i30];
            if (this.f2368r.c(view4) != i27) {
                b bVar4 = (b) view4.getLayoutParams();
                Rect rect2 = bVar4.f2492b;
                int i31 = rect2.top + rect2.bottom + bVar4.topMargin + bVar4.bottomMargin;
                int i32 = rect2.left + rect2.right + bVar4.leftMargin + bVar4.rightMargin;
                int j12 = j1(bVar4.f2362e, bVar4.f2363f);
                if (this.f2366p == 1) {
                    i19 = RecyclerView.m.x(false, j12, 1073741824, i32, bVar4.width);
                    i18 = View.MeasureSpec.makeMeasureSpec(i27 - i31, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i32, 1073741824);
                    i18 = RecyclerView.m.x(false, j12, 1073741824, i31, bVar4.height);
                    i19 = makeMeasureSpec;
                }
                if (z0(view4, i19, i18, (RecyclerView.n) view4.getLayoutParams())) {
                    view4.measure(i19, i18);
                }
            }
        }
        bVar2.f2382a = i27;
        if (this.f2366p == 1) {
            if (cVar2.f2391f == -1) {
                i17 = cVar2.f2387b;
                i16 = i17 - i27;
            } else {
                i16 = cVar2.f2387b;
                i17 = i27 + i16;
            }
            i12 = 0;
            i11 = i16;
            i13 = i17;
            i14 = 0;
        } else {
            if (cVar2.f2391f == -1) {
                i14 = cVar2.f2387b;
                i15 = i14 - i27;
            } else {
                i15 = cVar2.f2387b;
                i14 = i27 + i15;
            }
            i11 = 0;
            i12 = i15;
            i13 = 0;
        }
        for (int i33 = 0; i33 < i23; i33++) {
            View view5 = this.H[i33];
            b bVar5 = (b) view5.getLayoutParams();
            if (this.f2366p != 1) {
                int F2 = F() + this.G[bVar5.f2362e];
                i11 = F2;
                i13 = this.f2368r.d(view5) + F2;
            } else if (W0()) {
                i14 = D() + this.G[this.F - bVar5.f2362e];
                i12 = i14 - this.f2368r.d(view5);
            } else {
                i12 = this.G[bVar5.f2362e] + D();
                i14 = this.f2368r.d(view5) + i12;
            }
            RecyclerView.m.O(view5, i12, i11, i14, i13);
            if (bVar5.c() || bVar5.b()) {
                bVar2.f2384c = true;
            }
            bVar2.f2385d = view5.hasFocusable() | bVar2.f2385d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    public final void Y(int i8, int i10) {
        a aVar = this.K;
        aVar.b();
        aVar.f2365b.clear();
    }

    public final void Y0(RecyclerView.t tVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i8) {
        p1();
        if (yVar.b() > 0 && !yVar.f2532g) {
            boolean z10 = i8 == 1;
            int l12 = l1(aVar.f2378b, tVar, yVar);
            if (z10) {
                while (l12 > 0) {
                    int i10 = aVar.f2378b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    aVar.f2378b = i11;
                    l12 = l1(i11, tVar, yVar);
                }
            } else {
                int b10 = yVar.b() - 1;
                int i12 = aVar.f2378b;
                while (i12 < b10) {
                    int i13 = i12 + 1;
                    int l13 = l1(i13, tVar, yVar);
                    if (l13 <= l12) {
                        break;
                    }
                    i12 = i13;
                    l12 = l13;
                }
                aVar.f2378b = i12;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final void Z() {
        a aVar = this.K;
        aVar.b();
        aVar.f2365b.clear();
    }

    public final void a0(int i8, int i10) {
        a aVar = this.K;
        aVar.b();
        aVar.f2365b.clear();
    }

    public final void b0(int i8, int i10) {
        a aVar = this.K;
        aVar.b();
        aVar.f2365b.clear();
    }

    public final void c0(int i8, int i10) {
        a aVar = this.K;
        aVar.b();
        aVar.f2365b.clear();
    }

    public final void d0(RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f2532g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z10) {
            int w10 = w();
            for (int i8 = 0; i8 < w10; i8++) {
                b bVar = (b) v(i8).getLayoutParams();
                int a10 = bVar.a();
                sparseIntArray2.put(a10, bVar.f2363f);
                sparseIntArray.put(a10, bVar.f2362e);
            }
        }
        super.d0(tVar, yVar);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void e0(RecyclerView.y yVar) {
        super.e0(yVar);
        this.E = false;
    }

    public final void e1(boolean z10) {
        if (!z10) {
            super.e1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final boolean f(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    public final void i1(int i8) {
        int i10;
        int[] iArr = this.G;
        int i11 = this.F;
        if (!(iArr != null && iArr.length == i11 + 1 && iArr[iArr.length - 1] == i8)) {
            iArr = new int[(i11 + 1)];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i8 / i11;
        int i14 = i8 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.G = iArr;
    }

    public final int j1(int i8, int i10) {
        if (this.f2366p != 1 || !W0()) {
            int[] iArr = this.G;
            return iArr[i10 + i8] - iArr[i8];
        }
        int[] iArr2 = this.G;
        int i11 = this.F;
        return iArr2[i11 - i8] - iArr2[(i11 - i8) - i10];
    }

    public final int k(RecyclerView.y yVar) {
        return G0(yVar);
    }

    public final int k1(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f2532g;
        a aVar = this.K;
        if (!z10) {
            int i10 = this.F;
            aVar.getClass();
            return c.a(i8, i10);
        }
        int b10 = tVar.b(i8);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i8);
            return 0;
        }
        int i11 = this.F;
        aVar.getClass();
        return c.a(b10, i11);
    }

    public final int l(RecyclerView.y yVar) {
        return H0(yVar);
    }

    public final int l1(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f2532g;
        a aVar = this.K;
        if (!z10) {
            int i10 = this.F;
            aVar.getClass();
            return i8 % i10;
        }
        int i11 = this.J.get(i8, -1);
        if (i11 != -1) {
            return i11;
        }
        int b10 = tVar.b(i8);
        if (b10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i8);
            return 0;
        }
        int i12 = this.F;
        aVar.getClass();
        return b10 % i12;
    }

    public final int m1(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        boolean z10 = yVar.f2532g;
        a aVar = this.K;
        if (!z10) {
            aVar.getClass();
            return 1;
        }
        int i10 = this.I.get(i8, -1);
        if (i10 != -1) {
            return i10;
        }
        if (tVar.b(i8) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i8);
            return 1;
        }
        aVar.getClass();
        return 1;
    }

    public final int n(RecyclerView.y yVar) {
        return G0(yVar);
    }

    public final void n1(View view, int i8, boolean z10) {
        int i10;
        int i11;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2492b;
        int i12 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i13 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int j12 = j1(bVar.f2362e, bVar.f2363f);
        if (this.f2366p == 1) {
            i10 = RecyclerView.m.x(false, j12, i8, i13, bVar.width);
            i11 = RecyclerView.m.x(true, this.f2368r.l(), this.m, i12, bVar.height);
        } else {
            int x10 = RecyclerView.m.x(false, j12, i8, i12, bVar.height);
            int x11 = RecyclerView.m.x(true, this.f2368r.l(), this.f2482l, i13, bVar.width);
            i11 = x10;
            i10 = x11;
        }
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z10 ? z0(view, i10, i11, nVar) : x0(view, i10, i11, nVar)) {
            view.measure(i10, i11);
        }
    }

    public final int o(RecyclerView.y yVar) {
        return H0(yVar);
    }

    public final void o1(int i8) {
        if (i8 != this.F) {
            this.E = true;
            if (i8 >= 1) {
                this.F = i8;
                this.K.b();
                o0();
                return;
            }
            throw new IllegalArgumentException(q.a("Span count should be at least 1. Provided ", i8));
        }
    }

    public final int p0(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        p1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.p0(i8, tVar, yVar);
    }

    public final void p1() {
        int i8;
        int i10;
        if (this.f2366p == 1) {
            i10 = this.f2483n - E();
            i8 = D();
        } else {
            i10 = this.f2484o - C();
            i8 = F();
        }
        i1(i10 - i8);
    }

    public final RecyclerView.n r() {
        return this.f2366p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public final int r0(int i8, RecyclerView.t tVar, RecyclerView.y yVar) {
        p1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.r0(i8, tVar, yVar);
    }

    public final RecyclerView.n s(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public final RecyclerView.n t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public final void u0(Rect rect, int i8, int i10) {
        int i11;
        int i12;
        if (this.G == null) {
            super.u0(rect, i8, i10);
        }
        int E2 = E() + D();
        int C = C() + F();
        if (this.f2366p == 1) {
            int height = rect.height() + C;
            RecyclerView recyclerView = this.f2472b;
            WeakHashMap<View, d1> weakHashMap = i0.f7217a;
            i12 = RecyclerView.m.g(i10, height, i0.d.d(recyclerView));
            int[] iArr = this.G;
            i11 = RecyclerView.m.g(i8, iArr[iArr.length - 1] + E2, i0.d.e(this.f2472b));
        } else {
            int width = rect.width() + E2;
            RecyclerView recyclerView2 = this.f2472b;
            WeakHashMap<View, d1> weakHashMap2 = i0.f7217a;
            i11 = RecyclerView.m.g(i8, width, i0.d.e(recyclerView2));
            int[] iArr2 = this.G;
            i12 = RecyclerView.m.g(i10, iArr2[iArr2.length - 1] + C, i0.d.d(this.f2472b));
        }
        this.f2472b.setMeasuredDimension(i11, i12);
    }

    public final int y(RecyclerView.t tVar, RecyclerView.y yVar) {
        if (this.f2366p == 1) {
            return this.F;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return k1(yVar.b() - 1, tVar, yVar) + 1;
    }

    public static class b extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public int f2362e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2363f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i8, int i10) {
            super(i8, i10);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(int i8, int i10) {
        super(1);
        o1(i8);
    }

    public GridLayoutManager(int i8) {
        super(1);
        o1(i8);
    }
}
