package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import y1.k;

public final class m implements Runnable {
    public static final a B = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<m> f2718e = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<RecyclerView> f2719a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f2720b;

    /* renamed from: c  reason: collision with root package name */
    public long f2721c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<c> f2722d = new ArrayList<>();

    public class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.m.c) r7
                androidx.recyclerview.widget.m$c r8 = (androidx.recyclerview.widget.m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2730d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r3 = r2
                goto L_0x000d
            L_0x000c:
                r3 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2730d
                if (r4 != 0) goto L_0x0013
                r4 = r2
                goto L_0x0014
            L_0x0013:
                r4 = r1
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001d
                if (r0 != 0) goto L_0x001b
            L_0x0019:
                r1 = r2
                goto L_0x0037
            L_0x001b:
                r1 = r5
                goto L_0x0037
            L_0x001d:
                boolean r0 = r7.f2727a
                boolean r3 = r8.f2727a
                if (r0 == r3) goto L_0x0026
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r0 = r8.f2728b
                int r2 = r7.f2728b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0037
            L_0x002f:
                int r7 = r7.f2729c
                int r8 = r8.f2729c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0037
                r1 = r7
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.m.c {

        /* renamed from: a  reason: collision with root package name */
        public int f2723a;

        /* renamed from: b  reason: collision with root package name */
        public int f2724b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f2725c;

        /* renamed from: d  reason: collision with root package name */
        public int f2726d;

        public final void a(int i8, int i10) {
            if (i8 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i10 >= 0) {
                int i11 = this.f2726d * 2;
                int[] iArr = this.f2725c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2725c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i11 >= iArr.length) {
                    int[] iArr3 = new int[(i11 * 2)];
                    this.f2725c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2725c;
                iArr4[i11] = i8;
                iArr4[i11 + 1] = i10;
                this.f2726d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            boolean z11 = false;
            this.f2726d = 0;
            int[] iArr = this.f2725c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.I;
            if (recyclerView.H != null && mVar != null && mVar.f2479i) {
                if (!z10) {
                    if (!recyclerView.Q || recyclerView.f2406c0 || recyclerView.f2407d.g()) {
                        z11 = true;
                    }
                    if (!z11) {
                        mVar.h(this.f2723a, this.f2724b, recyclerView.D0, this);
                    }
                } else if (!recyclerView.f2407d.g()) {
                    mVar.i(recyclerView.H.d(), this);
                }
                int i8 = this.f2726d;
                if (i8 > mVar.f2480j) {
                    mVar.f2480j = i8;
                    mVar.f2481k = z10;
                    recyclerView.f2403b.k();
                }
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2727a;

        /* renamed from: b  reason: collision with root package name */
        public int f2728b;

        /* renamed from: c  reason: collision with root package name */
        public int f2729c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f2730d;

        /* renamed from: e  reason: collision with root package name */
        public int f2731e;
    }

    public static RecyclerView.b0 c(RecyclerView recyclerView, int i8, long j10) {
        boolean z10;
        int h3 = recyclerView.f2409e.h();
        int i10 = 0;
        while (true) {
            if (i10 >= h3) {
                z10 = false;
                break;
            }
            RecyclerView.b0 J = RecyclerView.J(recyclerView.f2409e.g(i10));
            if (J.f2442c == i8 && !J.h()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            return null;
        }
        RecyclerView.t tVar = recyclerView.f2403b;
        try {
            recyclerView.P();
            RecyclerView.b0 i11 = tVar.i(i8, j10);
            if (i11 != null) {
                if (!i11.g() || i11.h()) {
                    tVar.a(i11, false);
                } else {
                    tVar.f(i11.f2440a);
                }
            }
            return i11;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i8, int i10) {
        if (recyclerView.isAttachedToWindow() && this.f2720b == 0) {
            this.f2720b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.C0;
        bVar.f2723a = i8;
        bVar.f2724b = i10;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f2719a;
        int size = arrayList.size();
        int i8 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = arrayList.get(i10);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.C0;
                bVar.b(recyclerView3, false);
                i8 += bVar.f2726d;
            }
        }
        ArrayList<c> arrayList2 = this.f2722d;
        arrayList2.ensureCapacity(i8);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.C0;
                int abs = Math.abs(bVar2.f2724b) + Math.abs(bVar2.f2723a);
                for (int i13 = 0; i13 < bVar2.f2726d * 2; i13 += 2) {
                    if (i11 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i11);
                    }
                    int[] iArr = bVar2.f2725c;
                    int i14 = iArr[i13 + 1];
                    cVar2.f2727a = i14 <= abs;
                    cVar2.f2728b = abs;
                    cVar2.f2729c = i14;
                    cVar2.f2730d = recyclerView4;
                    cVar2.f2731e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList2, B);
        for (int i15 = 0; i15 < arrayList2.size() && (recyclerView = cVar.f2730d) != null; i15++) {
            RecyclerView.b0 c3 = c(recyclerView, (cVar = arrayList2.get(i15)).f2731e, cVar.f2727a ? Long.MAX_VALUE : j10);
            if (!(c3 == null || c3.f2441b == null || !c3.g() || c3.h() || (recyclerView2 = c3.f2441b.get()) == null)) {
                if (recyclerView2.f2406c0 && recyclerView2.f2409e.h() != 0) {
                    RecyclerView.j jVar = recyclerView2.f2417l0;
                    if (jVar != null) {
                        jVar.i();
                    }
                    RecyclerView.m mVar = recyclerView2.I;
                    RecyclerView.t tVar = recyclerView2.f2403b;
                    if (mVar != null) {
                        mVar.j0(tVar);
                        recyclerView2.I.k0(tVar);
                    }
                    tVar.f2501a.clear();
                    tVar.d();
                }
                b bVar3 = recyclerView2.C0;
                bVar3.b(recyclerView2, true);
                if (bVar3.f2726d != 0) {
                    try {
                        int i16 = k.f17122a;
                        k.a.a("RV Nested Prefetch");
                        RecyclerView.y yVar = recyclerView2.D0;
                        RecyclerView.e eVar = recyclerView2.H;
                        yVar.f2529d = 1;
                        yVar.f2530e = eVar.d();
                        yVar.f2532g = false;
                        yVar.f2533h = false;
                        yVar.f2534i = false;
                        for (int i17 = 0; i17 < bVar3.f2726d * 2; i17 += 2) {
                            c(recyclerView2, bVar3.f2725c[i17], j10);
                        }
                        long j11 = j10;
                        k.a.b();
                        cVar.f2727a = false;
                        cVar.f2728b = 0;
                        cVar.f2729c = 0;
                        cVar.f2730d = null;
                        cVar.f2731e = 0;
                    } catch (Throwable th) {
                        int i18 = k.f17122a;
                        k.a.b();
                        throw th;
                    }
                }
            }
            long j12 = j10;
            cVar.f2727a = false;
            cVar.f2728b = 0;
            cVar.f2729c = 0;
            cVar.f2730d = null;
            cVar.f2731e = 0;
        }
    }

    public final void run() {
        try {
            int i8 = k.f17122a;
            k.a.a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f2719a;
            if (arrayList.isEmpty()) {
                this.f2720b = 0;
                k.a.b();
                return;
            }
            int size = arrayList.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView recyclerView = arrayList.get(i10);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f2720b = 0;
                k.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f2721c);
            this.f2720b = 0;
            k.a.b();
        } catch (Throwable th) {
            this.f2720b = 0;
            int i11 = k.f17122a;
            k.a.b();
            throw th;
        }
    }
}
