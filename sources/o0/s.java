package o0;

import s0.a0;
import s0.m1;
import s0.q;
import sf.j;
import t.w2;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f12097a;

    /* renamed from: b  reason: collision with root package name */
    public final w2 f12098b;

    /* renamed from: c  reason: collision with root package name */
    public final p f12099c = new p();

    /* renamed from: d  reason: collision with root package name */
    public final q<m1> f12100d = new q<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f12101e;

    public s(a0 a0Var) {
        j.f(a0Var, "root");
        this.f12097a = a0Var;
        this.f12098b = new w2(a0Var.V.f14401b);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0055 A[Catch:{ all -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0057 A[Catch:{ all -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c A[SYNTHETIC, Splitter:B:33:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c8 A[Catch:{ all -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c9 A[Catch:{ all -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0050 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00a8 A[EDGE_INSN: B:84:0x00a8->B:50:0x00a8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0116 A[EDGE_INSN: B:89:0x0116->B:71:0x0116 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(o0.q r18, o0.v r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            s0.q<s0.m1> r2 = r1.f12100d
            java.lang.String r3 = "positionCalculator"
            sf.j.f(r0, r3)
            boolean r3 = r1.f12101e
            r4 = 0
            if (r3 == 0) goto L_0x0011
            return r4
        L_0x0011:
            r3 = 1
            r1.f12101e = r3     // Catch:{ all -> 0x011f }
            o0.p r5 = r1.f12099c     // Catch:{ all -> 0x011f }
            r6 = r18
            o0.e r0 = r5.a(r6, r0)     // Catch:{ all -> 0x011f }
            java.util.Map<o0.n, o0.o> r5 = r0.f12044a
            java.util.Collection r6 = r5.values()     // Catch:{ all -> 0x011f }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x011f }
            boolean r7 = r6 instanceof java.util.Collection     // Catch:{ all -> 0x011f }
            if (r7 == 0) goto L_0x0032
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x011f }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x011f }
            if (r7 == 0) goto L_0x0032
            goto L_0x0052
        L_0x0032:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x011f }
        L_0x0036:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x011f }
            if (r7 == 0) goto L_0x0052
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x011f }
            o0.o r7 = (o0.o) r7     // Catch:{ all -> 0x011f }
            boolean r8 = r7.f12072d     // Catch:{ all -> 0x011f }
            if (r8 != 0) goto L_0x004d
            boolean r7 = r7.f12075g     // Catch:{ all -> 0x011f }
            if (r7 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r7 = r4
            goto L_0x004e
        L_0x004d:
            r7 = r3
        L_0x004e:
            if (r7 == 0) goto L_0x0036
            r6 = r3
            goto L_0x0053
        L_0x0052:
            r6 = r4
        L_0x0053:
            if (r6 != 0) goto L_0x0057
            r6 = r3
            goto L_0x0058
        L_0x0057:
            r6 = r4
        L_0x0058:
            java.util.Collection r7 = r5.values()     // Catch:{ all -> 0x011f }
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch:{ all -> 0x011f }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x011f }
        L_0x0062:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x011f }
            java.lang.String r9 = "<this>"
            t.w2 r10 = r1.f12098b
            if (r8 == 0) goto L_0x00a8
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x011f }
            o0.o r8 = (o0.o) r8     // Catch:{ all -> 0x011f }
            if (r6 != 0) goto L_0x0084
            sf.j.f(r8, r9)     // Catch:{ all -> 0x011f }
            boolean r9 = r8.f12075g     // Catch:{ all -> 0x011f }
            if (r9 != 0) goto L_0x0081
            boolean r9 = r8.f12072d     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x0081
            r9 = r3
            goto L_0x0082
        L_0x0081:
            r9 = r4
        L_0x0082:
            if (r9 == 0) goto L_0x0062
        L_0x0084:
            int r9 = r8.f12076h     // Catch:{ all -> 0x011f }
            if (r9 != r3) goto L_0x008a
            r15 = r3
            goto L_0x008b
        L_0x008a:
            r15 = r4
        L_0x008b:
            s0.a0 r11 = r1.f12097a     // Catch:{ all -> 0x011f }
            long r12 = r8.f12071c     // Catch:{ all -> 0x011f }
            s0.q<s0.m1> r14 = r1.f12100d     // Catch:{ all -> 0x011f }
            s0.a0$c r9 = s0.a0.f14306e0     // Catch:{ all -> 0x011f }
            r16 = 1
            r11.t(r12, r14, r15, r16)     // Catch:{ all -> 0x011f }
            boolean r9 = r2.isEmpty()     // Catch:{ all -> 0x011f }
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x0062
            long r8 = r8.f12069a     // Catch:{ all -> 0x011f }
            r10.b(r8, r2)     // Catch:{ all -> 0x011f }
            r2.clear()     // Catch:{ all -> 0x011f }
            goto L_0x0062
        L_0x00a8:
            java.lang.Object r2 = r10.f15269b     // Catch:{ all -> 0x011f }
            o0.i r2 = (o0.i) r2     // Catch:{ all -> 0x011f }
            r2.f()     // Catch:{ all -> 0x011f }
            r2 = r20
            boolean r0 = r10.e(r0, r2)     // Catch:{ all -> 0x011f }
            java.util.Collection r2 = r5.values()     // Catch:{ all -> 0x011f }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x011f }
            boolean r5 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x011f }
            if (r5 == 0) goto L_0x00c9
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x011f }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x011f }
            if (r5 == 0) goto L_0x00c9
            goto L_0x0115
        L_0x00c9:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x011f }
        L_0x00cd:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x011f }
            if (r5 == 0) goto L_0x0115
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x011f }
            o0.o r5 = (o0.o) r5     // Catch:{ all -> 0x011f }
            sf.j.f(r5, r9)     // Catch:{ all -> 0x011f }
            long r6 = r5.f12071c     // Catch:{ all -> 0x011f }
            float r8 = h0.c.b(r6)     // Catch:{ all -> 0x011f }
            long r10 = r5.f12074f     // Catch:{ all -> 0x011f }
            float r12 = h0.c.b(r10)     // Catch:{ all -> 0x011f }
            float r8 = r8 - r12
            float r6 = h0.c.c(r6)     // Catch:{ all -> 0x011f }
            float r7 = h0.c.c(r10)     // Catch:{ all -> 0x011f }
            float r6 = r6 - r7
            long r6 = d2.f1.f(r8, r6)     // Catch:{ all -> 0x011f }
            long r10 = h0.c.f9068b     // Catch:{ all -> 0x011f }
            boolean r6 = h0.c.a(r6, r10)     // Catch:{ all -> 0x011f }
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0111
            o0.c r5 = r5.f12080l     // Catch:{ all -> 0x011f }
            boolean r6 = r5.f12041b     // Catch:{ all -> 0x011f }
            if (r6 != 0) goto L_0x010c
            boolean r5 = r5.f12040a     // Catch:{ all -> 0x011f }
            if (r5 == 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r5 = r4
            goto L_0x010d
        L_0x010c:
            r5 = r3
        L_0x010d:
            if (r5 == 0) goto L_0x0111
            r5 = r3
            goto L_0x0112
        L_0x0111:
            r5 = r4
        L_0x0112:
            if (r5 == 0) goto L_0x00cd
            goto L_0x0116
        L_0x0115:
            r3 = r4
        L_0x0116:
            if (r3 == 0) goto L_0x011a
            r2 = 2
            goto L_0x011b
        L_0x011a:
            r2 = r4
        L_0x011b:
            r0 = r0 | r2
            r1.f12101e = r4
            return r0
        L_0x011f:
            r0 = move-exception
            r1.f12101e = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.s.a(o0.q, o0.v, boolean):int");
    }

    public final void b() {
        if (!this.f12101e) {
            this.f12099c.f12081a.clear();
            w2 w2Var = this.f12098b;
            ((i) w2Var.f15269b).c();
            ((i) w2Var.f15269b).f12061a.f();
        }
    }
}
