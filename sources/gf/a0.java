package gf;

import ff.m;
import java.util.Iterator;
import java.util.List;
import jf.d;
import lf.e;
import lf.h;
import rf.p;
import yf.i;

@e(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
public final class a0 extends h implements p<i<? super List<Object>>, d<? super m>, Object> {
    public /* synthetic */ Object B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Iterator<Object> E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;

    /* renamed from: b  reason: collision with root package name */
    public Object f8957b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f8958c;

    /* renamed from: d  reason: collision with root package name */
    public int f8959d;

    /* renamed from: e  reason: collision with root package name */
    public int f8960e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(int i8, int i10, Iterator<Object> it, boolean z10, boolean z11, d<? super a0> dVar) {
        super(dVar);
        this.C = i8;
        this.D = i10;
        this.E = it;
        this.F = z10;
        this.G = z11;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        a0 a0Var = new a0(this.C, this.D, this.E, this.F, this.G, dVar);
        a0Var.B = obj;
        return a0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((i) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00b6 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f8960e
            r3 = 0
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L_0x005a
            if (r2 == r9) goto L_0x0047
            if (r2 == r8) goto L_0x0042
            if (r2 == r7) goto L_0x0031
            if (r2 == r6) goto L_0x0022
            if (r2 != r5) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0022:
            java.lang.Object r2 = r0.f8957b
            gf.z r2 = (gf.z) r2
            java.lang.Object r4 = r0.B
            yf.i r4 = (yf.i) r4
            cb.b.J(r18)
            r11 = r0
            r12 = r1
            goto L_0x018d
        L_0x0031:
            java.util.Iterator r2 = r0.f8958c
            java.lang.Object r8 = r0.f8957b
            gf.z r8 = (gf.z) r8
            java.lang.Object r10 = r0.B
            yf.i r10 = (yf.i) r10
            cb.b.J(r18)
            r11 = r0
            r12 = r1
            goto L_0x0159
        L_0x0042:
            cb.b.J(r18)
            goto L_0x01a8
        L_0x0047:
            int r2 = r0.f8959d
            java.util.Iterator r4 = r0.f8958c
            java.lang.Object r5 = r0.f8957b
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r0.B
            yf.i r6 = (yf.i) r6
            cb.b.J(r18)
            r7 = r0
            r10 = r1
            r12 = r2
            goto L_0x00a4
        L_0x005a:
            cb.b.J(r18)
            java.lang.Object r2 = r0.B
            yf.i r2 = (yf.i) r2
            int r10 = r0.C
            r11 = 1024(0x400, float:1.435E-42)
            if (r10 <= r11) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r11 = r10
        L_0x0069:
            int r12 = r0.D
            int r12 = r12 - r10
            java.util.Iterator<java.lang.Object> r10 = r0.E
            if (r12 < 0) goto L_0x00d5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r11)
            r7 = r0
            r6 = r2
            r2 = r4
            r4 = r10
            r10 = r1
        L_0x007a:
            boolean r11 = r4.hasNext()
            int r13 = r7.C
            if (r11 == 0) goto L_0x00b6
            java.lang.Object r11 = r4.next()
            if (r2 <= 0) goto L_0x008b
            int r2 = r2 + -1
            goto L_0x007a
        L_0x008b:
            r5.add(r11)
            int r11 = r5.size()
            if (r11 != r13) goto L_0x007a
            r7.B = r6
            r7.f8957b = r5
            r7.f8958c = r4
            r7.f8959d = r12
            r7.f8960e = r9
            r6.c(r5, r7)
            if (r1 != r10) goto L_0x00a4
            return r10
        L_0x00a4:
            boolean r2 = r7.F
            if (r2 == 0) goto L_0x00ac
            r5.clear()
            goto L_0x00b4
        L_0x00ac:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r7.C
            r2.<init>(r5)
            r5 = r2
        L_0x00b4:
            r2 = r12
            goto L_0x007a
        L_0x00b6:
            boolean r2 = r5.isEmpty()
            r2 = r2 ^ r9
            if (r2 == 0) goto L_0x01a8
            boolean r2 = r7.G
            if (r2 != 0) goto L_0x00c7
            int r2 = r5.size()
            if (r2 != r13) goto L_0x01a8
        L_0x00c7:
            r7.B = r3
            r7.f8957b = r3
            r7.f8958c = r3
            r7.f8960e = r8
            r6.c(r5, r7)
            if (r1 != r10) goto L_0x01a8
            return r10
        L_0x00d5:
            gf.z r8 = new gf.z
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r8.<init>(r4, r11)
            r11 = r0
            r12 = r1
            r16 = r10
            r10 = r2
            r2 = r16
        L_0x00e3:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x0168
            java.lang.Object r13 = r2.next()
            int r14 = r8.a()
            int r15 = r8.f8984b
            if (r14 != r15) goto L_0x00f7
            r14 = r9
            goto L_0x00f8
        L_0x00f7:
            r14 = r4
        L_0x00f8:
            if (r14 != 0) goto L_0x0160
            int r14 = r8.f8985c
            int r4 = r8.f8986d
            int r14 = r14 + r4
            int r14 = r14 % r15
            java.lang.Object[] r15 = r8.f8983a
            r15[r14] = r13
            int r4 = r4 + 1
            r8.f8986d = r4
            int r4 = r8.a()
            int r13 = r8.f8984b
            if (r4 != r13) goto L_0x0112
            r4 = r9
            goto L_0x0113
        L_0x0112:
            r4 = 0
        L_0x0113:
            if (r4 == 0) goto L_0x015e
            int r4 = r8.f8986d
            int r14 = r11.C
            if (r4 >= r14) goto L_0x0140
            int r4 = r13 >> 1
            int r13 = r13 + r4
            int r13 = r13 + r9
            if (r13 <= r14) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r14 = r13
        L_0x0123:
            int r4 = r8.f8985c
            if (r4 != 0) goto L_0x0131
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r15, r14)
            java.lang.String r13 = "copyOf(this, newSize)"
            sf.j.e(r4, r13)
            goto L_0x0137
        L_0x0131:
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.Object[] r4 = r8.toArray(r4)
        L_0x0137:
            gf.z r13 = new gf.z
            int r8 = r8.f8986d
            r13.<init>(r8, r4)
            r8 = r13
            goto L_0x015e
        L_0x0140:
            boolean r4 = r11.F
            if (r4 == 0) goto L_0x0146
            r4 = r8
            goto L_0x014b
        L_0x0146:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r8)
        L_0x014b:
            r11.B = r10
            r11.f8957b = r8
            r11.f8958c = r2
            r11.f8960e = r7
            r10.c(r4, r11)
            if (r1 != r12) goto L_0x0159
            return r12
        L_0x0159:
            int r4 = r11.D
            r8.b(r4)
        L_0x015e:
            r4 = 0
            goto L_0x00e3
        L_0x0160:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ring buffer is full"
            r1.<init>(r2)
            throw r1
        L_0x0168:
            boolean r2 = r11.G
            if (r2 == 0) goto L_0x01a8
            r2 = r8
            r4 = r10
        L_0x016e:
            int r7 = r2.f8986d
            int r8 = r11.D
            if (r7 <= r8) goto L_0x0193
            boolean r7 = r11.F
            if (r7 == 0) goto L_0x017a
            r7 = r2
            goto L_0x017f
        L_0x017a:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
        L_0x017f:
            r11.B = r4
            r11.f8957b = r2
            r11.f8958c = r3
            r11.f8960e = r6
            r4.c(r7, r11)
            if (r1 != r12) goto L_0x018d
            return r12
        L_0x018d:
            int r7 = r11.D
            r2.b(r7)
            goto L_0x016e
        L_0x0193:
            boolean r6 = r2.isEmpty()
            r6 = r6 ^ r9
            if (r6 == 0) goto L_0x01a8
            r11.B = r3
            r11.f8957b = r3
            r11.f8958c = r3
            r11.f8960e = r5
            r4.c(r2, r11)
            if (r1 != r12) goto L_0x01a8
            return r12
        L_0x01a8:
            ff.m r1 = ff.m.f8717a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
