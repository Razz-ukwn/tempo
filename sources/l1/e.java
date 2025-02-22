package l1;

import ag.m;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import j1.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import m1.b;

public final class e extends k {
    public int A0;
    public int B0 = 0;
    public int C0 = 0;
    public b[] D0 = new b[4];
    public b[] E0 = new b[4];
    public int F0 = 257;
    public boolean G0 = false;
    public boolean H0 = false;
    public WeakReference<c> I0 = null;
    public WeakReference<c> J0 = null;
    public WeakReference<c> K0 = null;
    public WeakReference<c> L0 = null;
    public final HashSet<d> M0 = new HashSet<>();
    public final b.a N0 = new b.a();

    /* renamed from: t0  reason: collision with root package name */
    public final b f10883t0 = new b(this);

    /* renamed from: u0  reason: collision with root package name */
    public final m1.e f10884u0 = new m1.e(this);

    /* renamed from: v0  reason: collision with root package name */
    public int f10885v0;

    /* renamed from: w0  reason: collision with root package name */
    public b.C0211b f10886w0 = null;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f10887x0 = false;

    /* renamed from: y0  reason: collision with root package name */
    public final d f10888y0 = new d();

    /* renamed from: z0  reason: collision with root package name */
    public int f10889z0;

    public static void V(d dVar, b.C0211b bVar, b.a aVar) {
        int i8;
        int i10;
        if (bVar != null) {
            if (dVar.f10859j0 == 8 || (dVar instanceof g) || (dVar instanceof a)) {
                aVar.f11126e = 0;
                aVar.f11127f = 0;
                return;
            }
            int[] iArr = dVar.V;
            aVar.f11122a = iArr[0];
            boolean z10 = true;
            aVar.f11123b = iArr[1];
            aVar.f11124c = dVar.r();
            aVar.f11125d = dVar.l();
            aVar.f11130i = false;
            aVar.f11131j = 0;
            boolean z11 = aVar.f11122a == 3;
            boolean z12 = aVar.f11123b == 3;
            boolean z13 = z11 && dVar.Z > 0.0f;
            boolean z14 = z12 && dVar.Z > 0.0f;
            if (z11 && dVar.u(0) && dVar.f10875s == 0 && !z13) {
                aVar.f11122a = 2;
                if (z12 && dVar.f10876t == 0) {
                    aVar.f11122a = 1;
                }
                z11 = false;
            }
            if (z12 && dVar.u(1) && dVar.f10876t == 0 && !z14) {
                aVar.f11123b = 2;
                if (z11 && dVar.f10875s == 0) {
                    aVar.f11123b = 1;
                }
                z12 = false;
            }
            if (dVar.B()) {
                aVar.f11122a = 1;
                z11 = false;
            }
            if (dVar.C()) {
                aVar.f11123b = 1;
                z12 = false;
            }
            int[] iArr2 = dVar.f10877u;
            if (z13) {
                if (iArr2[0] == 4) {
                    aVar.f11122a = 1;
                } else if (!z12) {
                    if (aVar.f11123b == 1) {
                        i10 = aVar.f11125d;
                    } else {
                        aVar.f11122a = 2;
                        ((ConstraintLayout.b) bVar).b(dVar, aVar);
                        i10 = aVar.f11127f;
                    }
                    aVar.f11122a = 1;
                    aVar.f11124c = (int) (dVar.Z * ((float) i10));
                }
            }
            if (z14) {
                if (iArr2[1] == 4) {
                    aVar.f11123b = 1;
                } else if (!z11) {
                    if (aVar.f11122a == 1) {
                        i8 = aVar.f11124c;
                    } else {
                        aVar.f11123b = 2;
                        ((ConstraintLayout.b) bVar).b(dVar, aVar);
                        i8 = aVar.f11126e;
                    }
                    aVar.f11123b = 1;
                    if (dVar.f10841a0 == -1) {
                        aVar.f11125d = (int) (((float) i8) / dVar.Z);
                    } else {
                        aVar.f11125d = (int) (dVar.Z * ((float) i8));
                    }
                }
            }
            ((ConstraintLayout.b) bVar).b(dVar, aVar);
            dVar.O(aVar.f11126e);
            dVar.L(aVar.f11127f);
            dVar.F = aVar.f11129h;
            int i11 = aVar.f11128g;
            dVar.f10847d0 = i11;
            if (i11 <= 0) {
                z10 = false;
            }
            dVar.F = z10;
            aVar.f11131j = 0;
        }
    }

    public final void D() {
        this.f10888y0.t();
        this.f10889z0 = 0;
        this.A0 = 0;
        super.D();
    }

    public final void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        int size = this.f10925s0.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f10925s0.get(i8).P(z10, z11);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r6v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0647  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0678  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0683 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x06a2  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06bf  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x07ac  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x07f3  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x081c A[LOOP:34: B:500:0x081a->B:501:0x081c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0882  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x088e  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x08a1  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x08aa  */
    /* JADX WARNING: Removed duplicated region for block: B:520:0x08ae  */
    /* JADX WARNING: Removed duplicated region for block: B:532:0x08df  */
    /* JADX WARNING: Removed duplicated region for block: B:535:0x08e7  */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x08f4  */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x08e8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R() {
        /*
            r30 = this;
            r1 = r30
            r2 = 0
            r1.f10843b0 = r2
            r1.f10845c0 = r2
            r1.G0 = r2
            r1.H0 = r2
            java.util.ArrayList<l1.d> r0 = r1.f10925s0
            int r3 = r0.size()
            int r0 = r30.r()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r30.l()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.V
            r6 = 1
            r7 = r5[r6]
            r8 = r5[r2]
            int r9 = r1.f10885v0
            l1.c r12 = r1.L
            l1.c r13 = r1.K
            if (r9 != 0) goto L_0x0256
            int r9 = r1.F0
            boolean r9 = com.google.android.gms.internal.p000firebaseauthapi.gf.g(r9, r6)
            if (r9 == 0) goto L_0x0256
            m1.b$b r9 = r1.f10886w0
            r14 = r5[r2]
            r15 = r5[r6]
            r30.F()
            java.util.ArrayList<l1.d> r11 = r1.f10925s0
            int r10 = r11.size()
        L_0x0047:
            if (r2 >= r10) goto L_0x0055
            java.lang.Object r17 = r11.get(r2)
            l1.d r17 = (l1.d) r17
            r17.F()
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0055:
            boolean r2 = r1.f10887x0
            if (r14 != r6) goto L_0x0062
            int r14 = r30.r()
            r6 = 0
            r1.J(r6, r14)
            goto L_0x0068
        L_0x0062:
            r6 = 0
            r13.l(r6)
            r1.f10843b0 = r6
        L_0x0068:
            r6 = 0
            r14 = 0
            r18 = 0
        L_0x006c:
            r19 = 1056964608(0x3f000000, float:0.5)
            if (r6 >= r10) goto L_0x00d6
            java.lang.Object r20 = r11.get(r6)
            r21 = r13
            r13 = r20
            l1.d r13 = (l1.d) r13
            r20 = r4
            boolean r4 = r13 instanceof l1.g
            if (r4 == 0) goto L_0x00bd
            l1.g r13 = (l1.g) r13
            int r4 = r13.f10915w0
            r22 = r5
            r5 = 1
            if (r4 != r5) goto L_0x00cd
            int r4 = r13.f10912t0
            r5 = -1
            if (r4 == r5) goto L_0x0092
            r13.R(r4)
            goto L_0x00bb
        L_0x0092:
            int r4 = r13.f10913u0
            if (r4 == r5) goto L_0x00a7
            boolean r4 = r30.B()
            if (r4 == 0) goto L_0x00a7
            int r4 = r30.r()
            int r5 = r13.f10913u0
            int r4 = r4 - r5
            r13.R(r4)
            goto L_0x00bb
        L_0x00a7:
            boolean r4 = r30.B()
            if (r4 == 0) goto L_0x00bb
            float r4 = r13.f10911s0
            int r5 = r30.r()
            float r5 = (float) r5
            float r4 = r4 * r5
            float r4 = r4 + r19
            int r4 = (int) r4
            r13.R(r4)
        L_0x00bb:
            r14 = 1
            goto L_0x00cd
        L_0x00bd:
            r22 = r5
            boolean r4 = r13 instanceof l1.a
            if (r4 == 0) goto L_0x00cd
            l1.a r13 = (l1.a) r13
            int r4 = r13.T()
            if (r4 != 0) goto L_0x00cd
            r18 = 1
        L_0x00cd:
            int r6 = r6 + 1
            r4 = r20
            r13 = r21
            r5 = r22
            goto L_0x006c
        L_0x00d6:
            r20 = r4
            r22 = r5
            r21 = r13
            if (r14 == 0) goto L_0x00fb
            r4 = 0
        L_0x00df:
            if (r4 >= r10) goto L_0x00fb
            java.lang.Object r5 = r11.get(r4)
            l1.d r5 = (l1.d) r5
            boolean r6 = r5 instanceof l1.g
            if (r6 == 0) goto L_0x00f7
            l1.g r5 = (l1.g) r5
            int r6 = r5.f10915w0
            r13 = 1
            if (r6 != r13) goto L_0x00f7
            r6 = 0
            m1.h.b(r6, r5, r9, r2)
            goto L_0x00f8
        L_0x00f7:
            r6 = 0
        L_0x00f8:
            int r4 = r4 + 1
            goto L_0x00df
        L_0x00fb:
            r6 = 0
            m1.h.b(r6, r1, r9, r2)
            if (r18 == 0) goto L_0x0123
            r4 = 0
        L_0x0102:
            if (r4 >= r10) goto L_0x0123
            java.lang.Object r5 = r11.get(r4)
            l1.d r5 = (l1.d) r5
            boolean r6 = r5 instanceof l1.a
            if (r6 == 0) goto L_0x0120
            l1.a r5 = (l1.a) r5
            int r6 = r5.T()
            if (r6 != 0) goto L_0x0120
            boolean r6 = r5.S()
            if (r6 == 0) goto L_0x0120
            r6 = 1
            m1.h.b(r6, r5, r9, r2)
        L_0x0120:
            int r4 = r4 + 1
            goto L_0x0102
        L_0x0123:
            r4 = 1
            if (r15 != r4) goto L_0x012f
            int r4 = r30.l()
            r5 = 0
            r1.K(r5, r4)
            goto L_0x0135
        L_0x012f:
            r5 = 0
            r12.l(r5)
            r1.f10845c0 = r5
        L_0x0135:
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0138:
            if (r4 >= r10) goto L_0x018f
            java.lang.Object r13 = r11.get(r4)
            l1.d r13 = (l1.d) r13
            boolean r14 = r13 instanceof l1.g
            if (r14 == 0) goto L_0x017e
            l1.g r13 = (l1.g) r13
            int r14 = r13.f10915w0
            if (r14 != 0) goto L_0x018c
            int r5 = r13.f10912t0
            r14 = -1
            if (r5 == r14) goto L_0x0153
            r13.R(r5)
            goto L_0x017c
        L_0x0153:
            int r5 = r13.f10913u0
            if (r5 == r14) goto L_0x0168
            boolean r5 = r30.C()
            if (r5 == 0) goto L_0x0168
            int r5 = r30.l()
            int r14 = r13.f10913u0
            int r5 = r5 - r14
            r13.R(r5)
            goto L_0x017c
        L_0x0168:
            boolean r5 = r30.C()
            if (r5 == 0) goto L_0x017c
            float r5 = r13.f10911s0
            int r14 = r30.l()
            float r14 = (float) r14
            float r5 = r5 * r14
            float r5 = r5 + r19
            int r5 = (int) r5
            r13.R(r5)
        L_0x017c:
            r5 = 1
            goto L_0x018c
        L_0x017e:
            boolean r14 = r13 instanceof l1.a
            if (r14 == 0) goto L_0x018c
            l1.a r13 = (l1.a) r13
            int r13 = r13.T()
            r14 = 1
            if (r13 != r14) goto L_0x018c
            r6 = 1
        L_0x018c:
            int r4 = r4 + 1
            goto L_0x0138
        L_0x018f:
            if (r5 == 0) goto L_0x01ab
            r4 = 0
        L_0x0192:
            if (r4 >= r10) goto L_0x01ab
            java.lang.Object r5 = r11.get(r4)
            l1.d r5 = (l1.d) r5
            boolean r13 = r5 instanceof l1.g
            if (r13 == 0) goto L_0x01a8
            l1.g r5 = (l1.g) r5
            int r13 = r5.f10915w0
            if (r13 != 0) goto L_0x01a8
            r13 = 1
            m1.h.g(r13, r5, r9)
        L_0x01a8:
            int r4 = r4 + 1
            goto L_0x0192
        L_0x01ab:
            r4 = 0
            m1.h.g(r4, r1, r9)
            if (r6 == 0) goto L_0x01d3
            r4 = 0
        L_0x01b2:
            if (r4 >= r10) goto L_0x01d3
            java.lang.Object r5 = r11.get(r4)
            l1.d r5 = (l1.d) r5
            boolean r6 = r5 instanceof l1.a
            if (r6 == 0) goto L_0x01d0
            l1.a r5 = (l1.a) r5
            int r6 = r5.T()
            r13 = 1
            if (r6 != r13) goto L_0x01d0
            boolean r6 = r5.S()
            if (r6 == 0) goto L_0x01d0
            m1.h.g(r13, r5, r9)
        L_0x01d0:
            int r4 = r4 + 1
            goto L_0x01b2
        L_0x01d3:
            r4 = 0
        L_0x01d4:
            if (r4 >= r10) goto L_0x020c
            java.lang.Object r5 = r11.get(r4)
            l1.d r5 = (l1.d) r5
            boolean r6 = r5.A()
            if (r6 == 0) goto L_0x0209
            boolean r6 = m1.h.a(r5)
            if (r6 == 0) goto L_0x0209
            m1.b$a r6 = m1.h.f11154a
            V(r5, r9, r6)
            boolean r6 = r5 instanceof l1.g
            if (r6 == 0) goto L_0x0202
            r6 = r5
            l1.g r6 = (l1.g) r6
            int r6 = r6.f10915w0
            if (r6 != 0) goto L_0x01fd
            r6 = 0
            m1.h.g(r6, r5, r9)
            goto L_0x0209
        L_0x01fd:
            r6 = 0
            m1.h.b(r6, r5, r9, r2)
            goto L_0x0209
        L_0x0202:
            r6 = 0
            m1.h.b(r6, r5, r9, r2)
            m1.h.g(r6, r5, r9)
        L_0x0209:
            int r4 = r4 + 1
            goto L_0x01d4
        L_0x020c:
            r2 = 0
        L_0x020d:
            if (r2 >= r3) goto L_0x025c
            java.util.ArrayList<l1.d> r4 = r1.f10925s0
            java.lang.Object r4 = r4.get(r2)
            l1.d r4 = (l1.d) r4
            boolean r5 = r4.A()
            if (r5 == 0) goto L_0x0253
            boolean r5 = r4 instanceof l1.g
            if (r5 != 0) goto L_0x0253
            boolean r5 = r4 instanceof l1.a
            if (r5 != 0) goto L_0x0253
            boolean r5 = r4 instanceof l1.j
            if (r5 != 0) goto L_0x0253
            boolean r5 = r4.H
            if (r5 != 0) goto L_0x0253
            r5 = 0
            int r6 = r4.k(r5)
            r5 = 1
            int r9 = r4.k(r5)
            r10 = 3
            if (r6 != r10) goto L_0x0246
            int r6 = r4.f10875s
            if (r6 == r5) goto L_0x0246
            if (r9 != r10) goto L_0x0246
            int r6 = r4.f10876t
            if (r6 == r5) goto L_0x0246
            r5 = 1
            goto L_0x0247
        L_0x0246:
            r5 = 0
        L_0x0247:
            if (r5 != 0) goto L_0x0253
            m1.b$a r5 = new m1.b$a
            r5.<init>()
            m1.b$b r6 = r1.f10886w0
            V(r4, r6, r5)
        L_0x0253:
            int r2 = r2 + 1
            goto L_0x020d
        L_0x0256:
            r20 = r4
            r22 = r5
            r21 = r13
        L_0x025c:
            j1.d r2 = r1.f10888y0
            r4 = 2
            if (r3 <= r4) goto L_0x0657
            if (r8 == r4) goto L_0x0265
            if (r7 != r4) goto L_0x0657
        L_0x0265:
            int r6 = r1.F0
            r9 = 1024(0x400, float:1.435E-42)
            boolean r6 = com.google.android.gms.internal.p000firebaseauthapi.gf.g(r6, r9)
            if (r6 == 0) goto L_0x0657
            m1.b$b r6 = r1.f10886w0
            java.util.ArrayList<l1.d> r9 = r1.f10925s0
            int r10 = r9.size()
            r11 = 0
        L_0x0278:
            if (r11 >= r10) goto L_0x02ac
            java.lang.Object r13 = r9.get(r11)
            l1.d r13 = (l1.d) r13
            r14 = 0
            r15 = r22[r14]
            r17 = 1
            r4 = r22[r17]
            int[] r5 = r13.V
            r23 = r12
            r12 = r5[r14]
            r5 = r5[r17]
            boolean r4 = m1.i.b(r15, r4, r12, r5)
            if (r4 != 0) goto L_0x0296
            goto L_0x029a
        L_0x0296:
            boolean r4 = r13 instanceof l1.f
            if (r4 == 0) goto L_0x02a6
        L_0x029a:
            r26 = r0
            r25 = r3
            r24 = r7
            r27 = r8
            r0 = 0
            r8 = r2
            goto L_0x060c
        L_0x02a6:
            int r11 = r11 + 1
            r12 = r23
            r4 = 2
            goto L_0x0278
        L_0x02ac:
            r23 = r12
            r4 = 0
            r5 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x02b5:
            if (r4 >= r10) goto L_0x0398
            java.lang.Object r24 = r9.get(r4)
            r25 = r3
            r3 = r24
            l1.d r3 = (l1.d) r3
            r24 = r7
            r16 = 0
            r7 = r22[r16]
            r26 = r0
            r17 = 1
            r0 = r22[r17]
            r27 = r8
            int[] r8 = r3.V
            r28 = r2
            r2 = r8[r16]
            r8 = r8[r17]
            boolean r0 = m1.i.b(r7, r0, r2, r8)
            if (r0 != 0) goto L_0x02e2
            m1.b$a r0 = r1.N0
            V(r3, r6, r0)
        L_0x02e2:
            boolean r0 = r3 instanceof l1.g
            if (r0 == 0) goto L_0x0307
            r2 = r3
            l1.g r2 = (l1.g) r2
            int r7 = r2.f10915w0
            if (r7 != 0) goto L_0x02f8
            if (r12 != 0) goto L_0x02f5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r12 = r7
        L_0x02f5:
            r12.add(r2)
        L_0x02f8:
            int r7 = r2.f10915w0
            r8 = 1
            if (r7 != r8) goto L_0x0307
            if (r5 != 0) goto L_0x0304
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0304:
            r5.add(r2)
        L_0x0307:
            boolean r2 = r3 instanceof l1.i
            if (r2 == 0) goto L_0x034c
            boolean r2 = r3 instanceof l1.a
            if (r2 == 0) goto L_0x0335
            r2 = r3
            l1.a r2 = (l1.a) r2
            int r7 = r2.T()
            if (r7 != 0) goto L_0x0323
            if (r11 != 0) goto L_0x0320
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r11 = r7
        L_0x0320:
            r11.add(r2)
        L_0x0323:
            int r7 = r2.T()
            r8 = 1
            if (r7 != r8) goto L_0x034c
            if (r13 != 0) goto L_0x0331
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0331:
            r13.add(r2)
            goto L_0x034c
        L_0x0335:
            r2 = r3
            l1.i r2 = (l1.i) r2
            if (r11 != 0) goto L_0x033f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x033f:
            r11.add(r2)
            if (r13 != 0) goto L_0x0349
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0349:
            r13.add(r2)
        L_0x034c:
            l1.c r2 = r3.K
            l1.c r2 = r2.f10831f
            if (r2 != 0) goto L_0x0368
            l1.c r2 = r3.M
            l1.c r2 = r2.f10831f
            if (r2 != 0) goto L_0x0368
            if (r0 != 0) goto L_0x0368
            boolean r2 = r3 instanceof l1.a
            if (r2 != 0) goto L_0x0368
            if (r14 != 0) goto L_0x0365
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0365:
            r14.add(r3)
        L_0x0368:
            l1.c r2 = r3.L
            l1.c r2 = r2.f10831f
            if (r2 != 0) goto L_0x038a
            l1.c r2 = r3.N
            l1.c r2 = r2.f10831f
            if (r2 != 0) goto L_0x038a
            l1.c r2 = r3.O
            l1.c r2 = r2.f10831f
            if (r2 != 0) goto L_0x038a
            if (r0 != 0) goto L_0x038a
            boolean r0 = r3 instanceof l1.a
            if (r0 != 0) goto L_0x038a
            if (r15 != 0) goto L_0x0387
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0387:
            r15.add(r3)
        L_0x038a:
            int r4 = r4 + 1
            r7 = r24
            r3 = r25
            r0 = r26
            r8 = r27
            r2 = r28
            goto L_0x02b5
        L_0x0398:
            r26 = r0
            r28 = r2
            r25 = r3
            r24 = r7
            r27 = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L_0x03bf
            java.util.Iterator r2 = r5.iterator()
        L_0x03ad:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03bf
            java.lang.Object r3 = r2.next()
            l1.g r3 = (l1.g) r3
            r4 = 0
            r5 = 0
            m1.i.a(r3, r5, r0, r4)
            goto L_0x03ad
        L_0x03bf:
            r4 = 0
            r5 = 0
            if (r11 == 0) goto L_0x03e0
            java.util.Iterator r2 = r11.iterator()
        L_0x03c7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03e0
            java.lang.Object r3 = r2.next()
            l1.i r3 = (l1.i) r3
            m1.o r6 = m1.i.a(r3, r5, r0, r4)
            r3.R(r5, r6, r0)
            r6.a(r0)
            r4 = 0
            r5 = 0
            goto L_0x03c7
        L_0x03e0:
            l1.c$a r2 = l1.c.a.f10835a
            l1.c r2 = r1.j(r2)
            java.util.HashSet<l1.c> r2 = r2.f10826a
            if (r2 == 0) goto L_0x0402
            java.util.Iterator r2 = r2.iterator()
        L_0x03ee:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0402
            java.lang.Object r3 = r2.next()
            l1.c r3 = (l1.c) r3
            l1.d r3 = r3.f10829d
            r4 = 0
            r5 = 0
            m1.i.a(r3, r5, r0, r4)
            goto L_0x03ee
        L_0x0402:
            l1.c$a r2 = l1.c.a.f10837c
            l1.c r2 = r1.j(r2)
            java.util.HashSet<l1.c> r2 = r2.f10826a
            if (r2 == 0) goto L_0x0424
            java.util.Iterator r2 = r2.iterator()
        L_0x0410:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0424
            java.lang.Object r3 = r2.next()
            l1.c r3 = (l1.c) r3
            l1.d r3 = r3.f10829d
            r4 = 0
            r5 = 0
            m1.i.a(r3, r5, r0, r4)
            goto L_0x0410
        L_0x0424:
            l1.c$a r2 = l1.c.a.B
            l1.c r3 = r1.j(r2)
            java.util.HashSet<l1.c> r3 = r3.f10826a
            if (r3 == 0) goto L_0x0446
            java.util.Iterator r3 = r3.iterator()
        L_0x0432:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0446
            java.lang.Object r4 = r3.next()
            l1.c r4 = (l1.c) r4
            l1.d r4 = r4.f10829d
            r5 = 0
            r6 = 0
            m1.i.a(r4, r6, r0, r5)
            goto L_0x0432
        L_0x0446:
            r5 = 0
            r6 = 0
            if (r14 == 0) goto L_0x045e
            java.util.Iterator r3 = r14.iterator()
        L_0x044e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x045e
            java.lang.Object r4 = r3.next()
            l1.d r4 = (l1.d) r4
            m1.i.a(r4, r6, r0, r5)
            goto L_0x044e
        L_0x045e:
            if (r12 == 0) goto L_0x0475
            java.util.Iterator r3 = r12.iterator()
        L_0x0464:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0475
            java.lang.Object r4 = r3.next()
            l1.g r4 = (l1.g) r4
            r6 = 1
            m1.i.a(r4, r6, r0, r5)
            goto L_0x0464
        L_0x0475:
            r6 = 1
            if (r13 == 0) goto L_0x0495
            java.util.Iterator r3 = r13.iterator()
        L_0x047c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0495
            java.lang.Object r4 = r3.next()
            l1.i r4 = (l1.i) r4
            m1.o r7 = m1.i.a(r4, r6, r0, r5)
            r4.R(r6, r7, r0)
            r7.a(r0)
            r5 = 0
            r6 = 1
            goto L_0x047c
        L_0x0495:
            l1.c$a r3 = l1.c.a.f10836b
            l1.c r3 = r1.j(r3)
            java.util.HashSet<l1.c> r3 = r3.f10826a
            if (r3 == 0) goto L_0x04b7
            java.util.Iterator r3 = r3.iterator()
        L_0x04a3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b7
            java.lang.Object r4 = r3.next()
            l1.c r4 = (l1.c) r4
            l1.d r4 = r4.f10829d
            r5 = 0
            r6 = 1
            m1.i.a(r4, r6, r0, r5)
            goto L_0x04a3
        L_0x04b7:
            l1.c$a r3 = l1.c.a.f10839e
            l1.c r3 = r1.j(r3)
            java.util.HashSet<l1.c> r3 = r3.f10826a
            if (r3 == 0) goto L_0x04d9
            java.util.Iterator r3 = r3.iterator()
        L_0x04c5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04d9
            java.lang.Object r4 = r3.next()
            l1.c r4 = (l1.c) r4
            l1.d r4 = r4.f10829d
            r5 = 0
            r6 = 1
            m1.i.a(r4, r6, r0, r5)
            goto L_0x04c5
        L_0x04d9:
            l1.c$a r3 = l1.c.a.f10838d
            l1.c r3 = r1.j(r3)
            java.util.HashSet<l1.c> r3 = r3.f10826a
            if (r3 == 0) goto L_0x04fb
            java.util.Iterator r3 = r3.iterator()
        L_0x04e7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04fb
            java.lang.Object r4 = r3.next()
            l1.c r4 = (l1.c) r4
            l1.d r4 = r4.f10829d
            r5 = 0
            r6 = 1
            m1.i.a(r4, r6, r0, r5)
            goto L_0x04e7
        L_0x04fb:
            l1.c r2 = r1.j(r2)
            java.util.HashSet<l1.c> r2 = r2.f10826a
            if (r2 == 0) goto L_0x051b
            java.util.Iterator r2 = r2.iterator()
        L_0x0507:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x051b
            java.lang.Object r3 = r2.next()
            l1.c r3 = (l1.c) r3
            l1.d r3 = r3.f10829d
            r4 = 0
            r5 = 1
            m1.i.a(r3, r5, r0, r4)
            goto L_0x0507
        L_0x051b:
            r4 = 0
            r5 = 1
            if (r15 == 0) goto L_0x0533
            java.util.Iterator r2 = r15.iterator()
        L_0x0523:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0533
            java.lang.Object r3 = r2.next()
            l1.d r3 = (l1.d) r3
            m1.i.a(r3, r5, r0, r4)
            goto L_0x0523
        L_0x0533:
            r2 = 0
        L_0x0534:
            if (r2 >= r10) goto L_0x058f
            java.lang.Object r3 = r9.get(r2)
            l1.d r3 = (l1.d) r3
            int[] r4 = r3.V
            r6 = 0
            r7 = r4[r6]
            r6 = 3
            if (r7 != r6) goto L_0x054a
            r4 = r4[r5]
            if (r4 != r6) goto L_0x054a
            r4 = 1
            goto L_0x054b
        L_0x054a:
            r4 = 0
        L_0x054b:
            if (r4 == 0) goto L_0x058b
            int r4 = r3.f10872q0
            int r5 = r0.size()
            r7 = 0
        L_0x0554:
            if (r7 >= r5) goto L_0x0564
            java.lang.Object r8 = r0.get(r7)
            m1.o r8 = (m1.o) r8
            int r11 = r8.f11162b
            if (r4 != r11) goto L_0x0561
            goto L_0x0565
        L_0x0561:
            int r7 = r7 + 1
            goto L_0x0554
        L_0x0564:
            r8 = 0
        L_0x0565:
            int r3 = r3.f10874r0
            int r4 = r0.size()
            r5 = 0
        L_0x056c:
            if (r5 >= r4) goto L_0x057c
            java.lang.Object r7 = r0.get(r5)
            m1.o r7 = (m1.o) r7
            int r11 = r7.f11162b
            if (r3 != r11) goto L_0x0579
            goto L_0x057d
        L_0x0579:
            int r5 = r5 + 1
            goto L_0x056c
        L_0x057c:
            r7 = 0
        L_0x057d:
            if (r8 == 0) goto L_0x058b
            if (r7 == 0) goto L_0x058b
            r3 = 0
            r8.c(r3, r7)
            r3 = 2
            r7.f11163c = r3
            r0.remove(r8)
        L_0x058b:
            int r2 = r2 + 1
            r5 = 1
            goto L_0x0534
        L_0x058f:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x059a
            r8 = r28
            goto L_0x0609
        L_0x059a:
            r2 = 0
            r4 = r22[r2]
            r5 = 2
            if (r4 != r5) goto L_0x05d2
            java.util.Iterator r4 = r0.iterator()
            r5 = r2
            r6 = 0
        L_0x05a6:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x05c7
            java.lang.Object r7 = r4.next()
            m1.o r7 = (m1.o) r7
            int r8 = r7.f11163c
            if (r8 != r3) goto L_0x05b9
            r8 = r28
            goto L_0x05c3
        L_0x05b9:
            r8 = r28
            int r9 = r7.b(r8, r2)
            if (r9 <= r5) goto L_0x05c3
            r6 = r7
            r5 = r9
        L_0x05c3:
            r28 = r8
            r2 = 0
            goto L_0x05a6
        L_0x05c7:
            r8 = r28
            if (r6 == 0) goto L_0x05d4
            r1.M(r3)
            r1.O(r5)
            goto L_0x05d5
        L_0x05d2:
            r8 = r28
        L_0x05d4:
            r6 = 0
        L_0x05d5:
            r2 = r22[r3]
            r4 = 2
            if (r2 != r4) goto L_0x0603
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r4 = 0
        L_0x05e0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05fa
            java.lang.Object r5 = r0.next()
            m1.o r5 = (m1.o) r5
            int r7 = r5.f11163c
            if (r7 != 0) goto L_0x05f1
            goto L_0x05e0
        L_0x05f1:
            int r7 = r5.b(r8, r3)
            if (r7 <= r2) goto L_0x05e0
            r4 = r5
            r2 = r7
            goto L_0x05e0
        L_0x05fa:
            if (r4 == 0) goto L_0x0603
            r1.N(r3)
            r1.L(r2)
            goto L_0x0604
        L_0x0603:
            r4 = 0
        L_0x0604:
            if (r6 != 0) goto L_0x060b
            if (r4 == 0) goto L_0x0609
            goto L_0x060b
        L_0x0609:
            r0 = 0
            goto L_0x060c
        L_0x060b:
            r0 = 1
        L_0x060c:
            if (r0 == 0) goto L_0x064e
            r2 = r27
            r3 = 2
            if (r2 != r3) goto L_0x0629
            int r0 = r30.r()
            r3 = r26
            if (r3 >= r0) goto L_0x0624
            if (r3 <= 0) goto L_0x0624
            r1.O(r3)
            r4 = 1
            r1.G0 = r4
            goto L_0x062b
        L_0x0624:
            int r0 = r30.r()
            goto L_0x062c
        L_0x0629:
            r3 = r26
        L_0x062b:
            r0 = r3
        L_0x062c:
            r4 = r24
            r3 = 2
            if (r4 != r3) goto L_0x0647
            int r3 = r30.l()
            r5 = r20
            if (r5 >= r3) goto L_0x0642
            if (r5 <= 0) goto L_0x0642
            r1.L(r5)
            r3 = 1
            r1.H0 = r3
            goto L_0x0649
        L_0x0642:
            int r3 = r30.l()
            goto L_0x064a
        L_0x0647:
            r5 = r20
        L_0x0649:
            r3 = r5
        L_0x064a:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L_0x0665
        L_0x064e:
            r5 = r20
            r4 = r24
            r3 = r26
            r2 = r27
            goto L_0x0664
        L_0x0657:
            r25 = r3
            r4 = r7
            r23 = r12
            r5 = r20
            r3 = r0
            r29 = r8
            r8 = r2
            r2 = r29
        L_0x0664:
            r0 = 0
        L_0x0665:
            r6 = 64
            boolean r7 = r1.W(r6)
            if (r7 != 0) goto L_0x0678
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.W(r7)
            if (r7 == 0) goto L_0x0676
            goto L_0x0678
        L_0x0676:
            r7 = 0
            goto L_0x0679
        L_0x0678:
            r7 = 1
        L_0x0679:
            r8.getClass()
            r9 = 0
            r8.f9767g = r9
            int r10 = r1.F0
            if (r10 == 0) goto L_0x0689
            if (r7 == 0) goto L_0x0689
            r7 = 1
            r8.f9767g = r7
            goto L_0x068a
        L_0x0689:
            r7 = 1
        L_0x068a:
            java.util.ArrayList<l1.d> r10 = r1.f10925s0
            r11 = r22[r9]
            r12 = 2
            if (r11 == r12) goto L_0x0698
            r11 = r22[r7]
            if (r11 != r12) goto L_0x0696
            goto L_0x0698
        L_0x0696:
            r7 = r9
            goto L_0x0699
        L_0x0698:
            r7 = 1
        L_0x0699:
            r1.B0 = r9
            r1.C0 = r9
            r11 = r25
            r9 = 0
        L_0x06a0:
            if (r9 >= r11) goto L_0x06b6
            java.util.ArrayList<l1.d> r12 = r1.f10925s0
            java.lang.Object r12 = r12.get(r9)
            l1.d r12 = (l1.d) r12
            boolean r13 = r12 instanceof l1.k
            if (r13 == 0) goto L_0x06b3
            l1.k r12 = (l1.k) r12
            r12.R()
        L_0x06b3:
            int r9 = r9 + 1
            goto L_0x06a0
        L_0x06b6:
            boolean r9 = r1.W(r6)
            r12 = r0
            r0 = 0
            r13 = 1
        L_0x06bd:
            if (r13 == 0) goto L_0x08ee
            r14 = 1
            int r15 = r0 + 1
            r8.t()     // Catch:{ Exception -> 0x078e }
            r14 = 0
            r1.B0 = r14     // Catch:{ Exception -> 0x078e }
            r1.C0 = r14     // Catch:{ Exception -> 0x078e }
            r1.h(r8)     // Catch:{ Exception -> 0x078e }
            r0 = 0
        L_0x06ce:
            if (r0 >= r11) goto L_0x06de
            java.util.ArrayList<l1.d> r14 = r1.f10925s0     // Catch:{ Exception -> 0x078e }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ Exception -> 0x078e }
            l1.d r14 = (l1.d) r14     // Catch:{ Exception -> 0x078e }
            r14.h(r8)     // Catch:{ Exception -> 0x078e }
            int r0 = r0 + 1
            goto L_0x06ce
        L_0x06de:
            r1.T(r8)     // Catch:{ Exception -> 0x078e }
            java.lang.ref.WeakReference<l1.c> r0 = r1.I0     // Catch:{ Exception -> 0x0782 }
            r13 = 5
            if (r0 == 0) goto L_0x070e
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0708 }
            if (r0 == 0) goto L_0x070e
            java.lang.ref.WeakReference<l1.c> r0 = r1.I0     // Catch:{ Exception -> 0x0708 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0708 }
            l1.c r0 = (l1.c) r0     // Catch:{ Exception -> 0x0708 }
            r14 = r23
            j1.g r6 = r8.k(r14)     // Catch:{ Exception -> 0x070a }
            j1.g r0 = r8.k(r0)     // Catch:{ Exception -> 0x070a }
            r23 = r14
            r14 = 0
            r8.f(r0, r6, r14, r13)     // Catch:{ Exception -> 0x0708 }
            r6 = 0
            r1.I0 = r6     // Catch:{ Exception -> 0x0708 }
            goto L_0x070e
        L_0x0708:
            r0 = move-exception
            goto L_0x0732
        L_0x070a:
            r0 = move-exception
            r23 = r14
            goto L_0x0732
        L_0x070e:
            java.lang.ref.WeakReference<l1.c> r0 = r1.K0     // Catch:{ Exception -> 0x0782 }
            if (r0 == 0) goto L_0x0734
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0708 }
            if (r0 == 0) goto L_0x0734
            java.lang.ref.WeakReference<l1.c> r0 = r1.K0     // Catch:{ Exception -> 0x0708 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0708 }
            l1.c r0 = (l1.c) r0     // Catch:{ Exception -> 0x0708 }
            l1.c r6 = r1.N     // Catch:{ Exception -> 0x0708 }
            j1.g r6 = r8.k(r6)     // Catch:{ Exception -> 0x0708 }
            j1.g r0 = r8.k(r0)     // Catch:{ Exception -> 0x0708 }
            r14 = 0
            r8.f(r6, r0, r14, r13)     // Catch:{ Exception -> 0x0708 }
            r6 = 0
            r1.K0 = r6     // Catch:{ Exception -> 0x0708 }
            goto L_0x0734
        L_0x0732:
            r6 = 0
            goto L_0x078c
        L_0x0734:
            java.lang.ref.WeakReference<l1.c> r0 = r1.J0     // Catch:{ Exception -> 0x0782 }
            if (r0 == 0) goto L_0x075e
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0782 }
            if (r0 == 0) goto L_0x075e
            java.lang.ref.WeakReference<l1.c> r0 = r1.J0     // Catch:{ Exception -> 0x0782 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0782 }
            l1.c r0 = (l1.c) r0     // Catch:{ Exception -> 0x0782 }
            r6 = r21
            j1.g r14 = r8.k(r6)     // Catch:{ Exception -> 0x075a }
            j1.g r0 = r8.k(r0)     // Catch:{ Exception -> 0x075a }
            r21 = r6
            r6 = 0
            r8.f(r0, r14, r6, r13)     // Catch:{ Exception -> 0x0782 }
            r6 = 0
            r1.J0 = r6     // Catch:{ Exception -> 0x078b }
            goto L_0x075e
        L_0x075a:
            r0 = move-exception
            r21 = r6
            goto L_0x0732
        L_0x075e:
            java.lang.ref.WeakReference<l1.c> r0 = r1.L0     // Catch:{ Exception -> 0x0782 }
            if (r0 == 0) goto L_0x0784
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0782 }
            if (r0 == 0) goto L_0x0784
            java.lang.ref.WeakReference<l1.c> r0 = r1.L0     // Catch:{ Exception -> 0x0782 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0782 }
            l1.c r0 = (l1.c) r0     // Catch:{ Exception -> 0x0782 }
            l1.c r6 = r1.M     // Catch:{ Exception -> 0x0782 }
            j1.g r6 = r8.k(r6)     // Catch:{ Exception -> 0x0782 }
            j1.g r0 = r8.k(r0)     // Catch:{ Exception -> 0x0782 }
            r14 = 0
            r8.f(r6, r0, r14, r13)     // Catch:{ Exception -> 0x0782 }
            r6 = 0
            r1.L0 = r6     // Catch:{ Exception -> 0x078b }
            goto L_0x0785
        L_0x0782:
            r0 = move-exception
            goto L_0x0732
        L_0x0784:
            r6 = 0
        L_0x0785:
            r8.p()     // Catch:{ Exception -> 0x078b }
            r20 = 1
            goto L_0x07a8
        L_0x078b:
            r0 = move-exception
        L_0x078c:
            r13 = 1
            goto L_0x0790
        L_0x078e:
            r0 = move-exception
            r6 = 0
        L_0x0790:
            r0.printStackTrace()
            java.io.PrintStream r14 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r20 = r13
            java.lang.String r13 = "EXCEPTION : "
            r6.<init>(r13)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r14.println(r0)
        L_0x07a8:
            boolean[] r0 = com.google.android.gms.internal.p000firebaseauthapi.gf.f4582a
            if (r20 == 0) goto L_0x07f3
            r6 = 2
            r13 = 0
            r0[r6] = r13
            r6 = 64
            boolean r13 = r1.W(r6)
            r1.Q(r8, r13)
            java.util.ArrayList<l1.d> r14 = r1.f10925s0
            int r14 = r14.size()
            r6 = 0
            r20 = 0
        L_0x07c2:
            if (r6 >= r14) goto L_0x07ef
            r24 = r14
            java.util.ArrayList<l1.d> r14 = r1.f10925s0
            java.lang.Object r14 = r14.get(r6)
            l1.d r14 = (l1.d) r14
            r14.Q(r8, r13)
            r25 = r13
            int r13 = r14.f10856i
            r26 = r12
            r12 = -1
            if (r13 != r12) goto L_0x07e1
            int r13 = r14.f10858j
            if (r13 == r12) goto L_0x07df
            goto L_0x07e1
        L_0x07df:
            r13 = 0
            goto L_0x07e2
        L_0x07e1:
            r13 = 1
        L_0x07e2:
            if (r13 == 0) goto L_0x07e6
            r20 = 1
        L_0x07e6:
            int r6 = r6 + 1
            r14 = r24
            r13 = r25
            r12 = r26
            goto L_0x07c2
        L_0x07ef:
            r26 = r12
            r12 = -1
            goto L_0x080c
        L_0x07f3:
            r26 = r12
            r12 = -1
            r1.Q(r8, r9)
            r6 = 0
        L_0x07fa:
            if (r6 >= r11) goto L_0x080a
            java.util.ArrayList<l1.d> r13 = r1.f10925s0
            java.lang.Object r13 = r13.get(r6)
            l1.d r13 = (l1.d) r13
            r13.Q(r8, r9)
            int r6 = r6 + 1
            goto L_0x07fa
        L_0x080a:
            r20 = 0
        L_0x080c:
            r6 = 8
            if (r7 == 0) goto L_0x0872
            if (r15 >= r6) goto L_0x0872
            r13 = 2
            boolean r0 = r0[r13]
            if (r0 == 0) goto L_0x0872
            r0 = 0
            r13 = 0
            r14 = 0
        L_0x081a:
            if (r0 >= r11) goto L_0x0841
            java.util.ArrayList<l1.d> r12 = r1.f10925s0
            java.lang.Object r12 = r12.get(r0)
            l1.d r12 = (l1.d) r12
            int r6 = r12.f10843b0
            int r25 = r12.r()
            int r6 = r25 + r6
            int r13 = java.lang.Math.max(r13, r6)
            int r6 = r12.f10845c0
            int r12 = r12.l()
            int r12 = r12 + r6
            int r14 = java.lang.Math.max(r14, r12)
            int r0 = r0 + 1
            r6 = 8
            r12 = -1
            goto L_0x081a
        L_0x0841:
            int r0 = r1.f10849e0
            int r0 = java.lang.Math.max(r0, r13)
            int r6 = r1.f10851f0
            int r6 = java.lang.Math.max(r6, r14)
            r12 = 2
            if (r2 != r12) goto L_0x0860
            int r13 = r30.r()
            if (r13 >= r0) goto L_0x0860
            r1.O(r0)
            r13 = 0
            r22[r13] = r12
            r20 = 1
            r26 = 1
        L_0x0860:
            if (r4 != r12) goto L_0x0872
            int r0 = r30.l()
            if (r0 >= r6) goto L_0x0872
            r1.L(r6)
            r6 = 1
            r22[r6] = r12
            r20 = 1
            r26 = 1
        L_0x0872:
            int r0 = r1.f10849e0
            int r6 = r30.r()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r30.r()
            if (r0 <= r6) goto L_0x088e
            r1.O(r0)
            r6 = 1
            r12 = 0
            r22[r12] = r6
            r17 = r6
            r20 = r17
            goto L_0x0891
        L_0x088e:
            r6 = 1
            r17 = r26
        L_0x0891:
            int r0 = r1.f10851f0
            int r12 = r30.l()
            int r0 = java.lang.Math.max(r0, r12)
            int r12 = r30.l()
            if (r0 <= r12) goto L_0x08aa
            r1.L(r0)
            r22[r6] = r6
            r0 = r6
            r20 = r0
            goto L_0x08ac
        L_0x08aa:
            r0 = r17
        L_0x08ac:
            if (r0 != 0) goto L_0x08df
            r12 = 0
            r13 = r22[r12]
            r14 = 2
            if (r13 != r14) goto L_0x08c6
            if (r3 <= 0) goto L_0x08c6
            int r13 = r30.r()
            if (r13 <= r3) goto L_0x08c6
            r1.G0 = r6
            r22[r12] = r6
            r1.O(r3)
            r0 = r6
            r20 = r0
        L_0x08c6:
            r12 = r22[r6]
            r13 = 2
            if (r12 != r13) goto L_0x08e0
            if (r5 <= 0) goto L_0x08e0
            int r12 = r30.l()
            if (r12 <= r5) goto L_0x08e0
            r1.H0 = r6
            r22[r6] = r6
            r1.L(r5)
            r0 = 8
            r6 = 1
            r12 = 1
            goto L_0x08e5
        L_0x08df:
            r13 = 2
        L_0x08e0:
            r12 = r0
            r6 = r20
            r0 = 8
        L_0x08e5:
            if (r15 <= r0) goto L_0x08e8
            r6 = 0
        L_0x08e8:
            r13 = r6
            r0 = r15
            r6 = 64
            goto L_0x06bd
        L_0x08ee:
            r26 = r12
            r1.f10925s0 = r10
            if (r26 == 0) goto L_0x08fa
            r3 = 0
            r22[r3] = r2
            r2 = 1
            r22[r2] = r4
        L_0x08fa:
            j1.c r0 = r8.f9772l
            r1.G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.e.R():void");
    }

    public final void S(int i8, d dVar) {
        if (i8 == 0) {
            int i10 = this.B0 + 1;
            b[] bVarArr = this.E0;
            if (i10 >= bVarArr.length) {
                this.E0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.E0;
            int i11 = this.B0;
            bVarArr2[i11] = new b(dVar, 0, this.f10887x0);
            this.B0 = i11 + 1;
        } else if (i8 == 1) {
            int i12 = this.C0 + 1;
            b[] bVarArr3 = this.D0;
            if (i12 >= bVarArr3.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.D0;
            int i13 = this.C0;
            bVarArr4[i13] = new b(dVar, 1, this.f10887x0);
            this.C0 = i13 + 1;
        }
    }

    public final void T(d dVar) {
        boolean z10;
        boolean W = W(64);
        c(dVar, W);
        int size = this.f10925s0.size();
        boolean z11 = false;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar2 = this.f10925s0.get(i8);
            boolean[] zArr = dVar2.U;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i10 = 0; i10 < size; i10++) {
                d dVar3 = this.f10925s0.get(i10);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i11 = 0; i11 < aVar.f10918t0; i11++) {
                        d dVar4 = aVar.f10917s0[i11];
                        if (aVar.f10807v0 || dVar4.d()) {
                            int i12 = aVar.f10806u0;
                            if (i12 == 0 || i12 == 1) {
                                dVar4.U[0] = true;
                            } else if (i12 == 2 || i12 == 3) {
                                dVar4.U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<d> hashSet = this.M0;
        hashSet.clear();
        for (int i13 = 0; i13 < size; i13++) {
            d dVar5 = this.f10925s0.get(i13);
            dVar5.getClass();
            if ((dVar5 instanceof j) || (dVar5 instanceof g)) {
                if (dVar5 instanceof j) {
                    hashSet.add(dVar5);
                } else {
                    dVar5.c(dVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<d> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j jVar = (j) it.next();
                int i14 = 0;
                while (true) {
                    if (i14 >= jVar.f10918t0) {
                        z10 = false;
                        continue;
                        break;
                    } else if (hashSet.contains(jVar.f10917s0[i14])) {
                        z10 = true;
                        continue;
                        break;
                    } else {
                        i14++;
                    }
                }
                if (z10) {
                    jVar.c(dVar, W);
                    hashSet.remove(jVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<d> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().c(dVar, W);
                }
                hashSet.clear();
            }
        }
        if (d.f9759p) {
            HashSet hashSet2 = new HashSet();
            for (int i15 = 0; i15 < size; i15++) {
                d dVar6 = this.f10925s0.get(i15);
                dVar6.getClass();
                if (!((dVar6 instanceof j) || (dVar6 instanceof g))) {
                    hashSet2.add(dVar6);
                }
            }
            b(this, dVar, hashSet2, this.V[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d dVar7 = (d) it3.next();
                gf.e(this, dVar, dVar7);
                dVar7.c(dVar, W);
            }
        } else {
            for (int i16 = 0; i16 < size; i16++) {
                d dVar8 = this.f10925s0.get(i16);
                if (dVar8 instanceof e) {
                    int[] iArr = dVar8.V;
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    if (i17 == 2) {
                        dVar8.M(1);
                    }
                    if (i18 == 2) {
                        dVar8.N(1);
                    }
                    dVar8.c(dVar, W);
                    if (i17 == 2) {
                        dVar8.M(i17);
                    }
                    if (i18 == 2) {
                        dVar8.N(i18);
                    }
                } else {
                    gf.e(this, dVar, dVar8);
                    if (!((dVar8 instanceof j) || (dVar8 instanceof g))) {
                        dVar8.c(dVar, W);
                    }
                }
            }
        }
        if (this.B0 > 0) {
            m.a(this, dVar, (ArrayList) null, 0);
        }
        if (this.C0 > 0) {
            m.a(this, dVar, (ArrayList) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0108 A[EDGE_INSN: B:75:0x0108->B:59:0x0108 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean U(int r14, boolean r15) {
        /*
            r13 = this;
            r0 = 1
            r15 = r15 & r0
            m1.e r1 = r13.f10884u0
            l1.e r2 = r1.f11134a
            r3 = 0
            int r4 = r2.k(r3)
            int r5 = r2.k(r0)
            int r6 = r2.s()
            int r7 = r2.t()
            java.util.ArrayList<m1.p> r8 = r1.f11138e
            if (r15 == 0) goto L_0x0070
            r9 = 2
            if (r4 == r9) goto L_0x0020
            if (r5 != r9) goto L_0x0070
        L_0x0020:
            java.util.Iterator r10 = r8.iterator()
        L_0x0024:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x003b
            java.lang.Object r11 = r10.next()
            m1.p r11 = (m1.p) r11
            int r12 = r11.f11171f
            if (r12 != r14) goto L_0x0024
            boolean r11 = r11.k()
            if (r11 != 0) goto L_0x0024
            r15 = r3
        L_0x003b:
            if (r14 != 0) goto L_0x0057
            if (r15 == 0) goto L_0x0070
            if (r4 != r9) goto L_0x0070
            r2.M(r0)
            int r15 = r1.d(r2, r3)
            r2.O(r15)
            m1.l r15 = r2.f10846d
            m1.g r15 = r15.f11170e
            int r9 = r2.r()
            r15.d(r9)
            goto L_0x0070
        L_0x0057:
            if (r15 == 0) goto L_0x0070
            if (r5 != r9) goto L_0x0070
            r2.N(r0)
            int r15 = r1.d(r2, r0)
            r2.L(r15)
            m1.n r15 = r2.f10848e
            m1.g r15 = r15.f11170e
            int r9 = r2.l()
            r15.d(r9)
        L_0x0070:
            r15 = 4
            int[] r9 = r2.V
            if (r14 != 0) goto L_0x0090
            r7 = r9[r3]
            if (r7 == r0) goto L_0x007b
            if (r7 != r15) goto L_0x0097
        L_0x007b:
            int r15 = r2.r()
            int r15 = r15 + r6
            m1.l r7 = r2.f10846d
            m1.f r7 = r7.f11174i
            r7.d(r15)
            m1.l r7 = r2.f10846d
            m1.g r7 = r7.f11170e
            int r15 = r15 - r6
            r7.d(r15)
            goto L_0x00ad
        L_0x0090:
            r6 = r9[r0]
            if (r6 == r0) goto L_0x0099
            if (r6 != r15) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r15 = r3
            goto L_0x00ae
        L_0x0099:
            int r15 = r2.l()
            int r15 = r15 + r7
            m1.n r6 = r2.f10848e
            m1.f r6 = r6.f11174i
            r6.d(r15)
            m1.n r6 = r2.f10848e
            m1.g r6 = r6.f11170e
            int r15 = r15 - r7
            r6.d(r15)
        L_0x00ad:
            r15 = r0
        L_0x00ae:
            r1.g()
            java.util.Iterator r1 = r8.iterator()
        L_0x00b5:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00d3
            java.lang.Object r6 = r1.next()
            m1.p r6 = (m1.p) r6
            int r7 = r6.f11171f
            if (r7 == r14) goto L_0x00c6
            goto L_0x00b5
        L_0x00c6:
            l1.d r7 = r6.f11167b
            if (r7 != r2) goto L_0x00cf
            boolean r7 = r6.f11172g
            if (r7 != 0) goto L_0x00cf
            goto L_0x00b5
        L_0x00cf:
            r6.e()
            goto L_0x00b5
        L_0x00d3:
            java.util.Iterator r1 = r8.iterator()
        L_0x00d7:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0108
            java.lang.Object r6 = r1.next()
            m1.p r6 = (m1.p) r6
            int r7 = r6.f11171f
            if (r7 == r14) goto L_0x00e8
            goto L_0x00d7
        L_0x00e8:
            if (r15 != 0) goto L_0x00ef
            l1.d r7 = r6.f11167b
            if (r7 != r2) goto L_0x00ef
            goto L_0x00d7
        L_0x00ef:
            m1.f r7 = r6.f11173h
            boolean r7 = r7.f11151j
            if (r7 != 0) goto L_0x00f6
            goto L_0x0107
        L_0x00f6:
            m1.f r7 = r6.f11174i
            boolean r7 = r7.f11151j
            if (r7 != 0) goto L_0x00fd
            goto L_0x0107
        L_0x00fd:
            boolean r7 = r6 instanceof m1.c
            if (r7 != 0) goto L_0x00d7
            m1.g r6 = r6.f11170e
            boolean r6 = r6.f11151j
            if (r6 != 0) goto L_0x00d7
        L_0x0107:
            r0 = r3
        L_0x0108:
            r2.M(r4)
            r2.N(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.e.U(int, boolean):boolean");
    }

    public final boolean W(int i8) {
        return (this.F0 & i8) == i8;
    }

    public final void o(StringBuilder sb2) {
        sb2.append(this.f10860k + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Y);
        sb2.append("\n");
        Iterator<d> it = this.f10925s0.iterator();
        while (it.hasNext()) {
            it.next().o(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
