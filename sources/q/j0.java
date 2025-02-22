package q;

import androidx.compose.ui.platform.s1;
import d0.h;
import ff.m;
import jf.d;
import jf.f;
import rf.l;
import sf.j;
import t.f1;

public final class j0 {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db A[Catch:{ CancellationException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0105 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(q.k r24, q.f r25, long r26, q.a.C0249a r28, jf.d r29) {
        /*
            r9 = r24
            r0 = r25
            r1 = r29
            boolean r2 = r1 instanceof q.d0
            if (r2 == 0) goto L_0x0019
            r2 = r1
            q.d0 r2 = (q.d0) r2
            int r3 = r2.B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.B = r3
            goto L_0x001e
        L_0x0019:
            q.d0 r2 = new q.d0
            r2.<init>(r1)
        L_0x001e:
            r10 = r2
            java.lang.Object r1 = r10.f12682e
            kf.a r11 = kf.a.f10464a
            int r2 = r10.B
            r12 = 2
            r13 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r13) goto L_0x0036
            if (r2 != r12) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            sf.v r0 = r10.f12681d
            rf.l r2 = r10.f12680c
            q.f r3 = r10.f12679b
            q.k r4 = r10.f12678a
            r5 = r0
            cb.b.J(r1)     // Catch:{ CancellationException -> 0x0045 }
            r0 = r3
            goto L_0x00c6
        L_0x0045:
            r0 = move-exception
            goto L_0x0108
        L_0x0048:
            cb.b.J(r1)
            r1 = 0
            java.lang.Object r15 = r0.f(r1)
            q.p r17 = r0.d(r1)
            sf.v r14 = new sf.v
            r14.<init>()
            r1 = -9223372036854775808
            int r1 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x008f
            jf.f r1 = r10.getContext()     // Catch:{ CancellationException -> 0x008c }
            float r7 = d(r1)     // Catch:{ CancellationException -> 0x008c }
            q.f0 r8 = new q.f0     // Catch:{ CancellationException -> 0x008c }
            r1 = r8
            r2 = r14
            r3 = r15
            r4 = r25
            r5 = r17
            r6 = r24
            r15 = r8
            r8 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x008c }
            r10.f12678a = r9     // Catch:{ CancellationException -> 0x008c }
            r10.f12679b = r0     // Catch:{ CancellationException -> 0x008c }
            r8 = r28
            r10.f12680c = r8     // Catch:{ CancellationException -> 0x008c }
            r10.f12681d = r14     // Catch:{ CancellationException -> 0x008c }
            r10.B = r13     // Catch:{ CancellationException -> 0x008c }
            java.lang.Object r1 = b(r0, r15, r10)     // Catch:{ CancellationException -> 0x008c }
            if (r1 != r11) goto L_0x00c3
            return r11
        L_0x008c:
            r0 = move-exception
            goto L_0x010c
        L_0x008f:
            r8 = r28
            q.i r7 = new q.i     // Catch:{ CancellationException -> 0x008c }
            q.l0 r16 = r25.c()     // Catch:{ CancellationException -> 0x008c }
            java.lang.Object r20 = r25.g()     // Catch:{ CancellationException -> 0x008c }
            q.g0 r1 = new q.g0     // Catch:{ CancellationException -> 0x008c }
            r1.<init>(r9)     // Catch:{ CancellationException -> 0x008c }
            r6 = r14
            r14 = r7
            r18 = r26
            r21 = r26
            r23 = r1
            r14.<init>(r15, r16, r17, r18, r20, r21, r23)     // Catch:{ CancellationException -> 0x010a }
            jf.f r1 = r10.getContext()     // Catch:{ CancellationException -> 0x010a }
            float r4 = d(r1)     // Catch:{ CancellationException -> 0x010a }
            r1 = r7
            r2 = r26
            r5 = r25
            r14 = r6
            r6 = r24
            r15 = r7
            r7 = r28
            c(r1, r2, r4, r5, r6, r7)     // Catch:{ CancellationException -> 0x008c }
            r14.f14957a = r15     // Catch:{ CancellationException -> 0x008c }
        L_0x00c3:
            r2 = r8
            r4 = r9
            r5 = r14
        L_0x00c6:
            T r1 = r5.f14957a     // Catch:{ CancellationException -> 0x0045 }
            sf.j.c(r1)     // Catch:{ CancellationException -> 0x0045 }
            q.i r1 = (q.i) r1     // Catch:{ CancellationException -> 0x0045 }
            t.n1 r1 = r1.f12707i     // Catch:{ CancellationException -> 0x0045 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x0045 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ CancellationException -> 0x0045 }
            boolean r1 = r1.booleanValue()     // Catch:{ CancellationException -> 0x0045 }
            if (r1 == 0) goto L_0x0105
            jf.f r1 = r10.getContext()     // Catch:{ CancellationException -> 0x0045 }
            float r1 = d(r1)     // Catch:{ CancellationException -> 0x0045 }
            q.h0 r3 = new q.h0     // Catch:{ CancellationException -> 0x0045 }
            r24 = r3
            r25 = r5
            r26 = r1
            r27 = r0
            r28 = r4
            r29 = r2
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ CancellationException -> 0x0045 }
            r10.f12678a = r4     // Catch:{ CancellationException -> 0x0045 }
            r10.f12679b = r0     // Catch:{ CancellationException -> 0x0045 }
            r10.f12680c = r2     // Catch:{ CancellationException -> 0x0045 }
            r10.f12681d = r5     // Catch:{ CancellationException -> 0x0045 }
            r10.B = r12     // Catch:{ CancellationException -> 0x0045 }
            java.lang.Object r1 = b(r0, r3, r10)     // Catch:{ CancellationException -> 0x0045 }
            if (r1 != r11) goto L_0x00c6
            return r11
        L_0x0105:
            ff.m r0 = ff.m.f8717a
            return r0
        L_0x0108:
            r14 = r5
            goto L_0x010d
        L_0x010a:
            r0 = move-exception
            r14 = r6
        L_0x010c:
            r4 = r9
        L_0x010d:
            T r1 = r14.f14957a
            q.i r1 = (q.i) r1
            if (r1 != 0) goto L_0x0114
            goto L_0x011b
        L_0x0114:
            t.n1 r1 = r1.f12707i
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
        L_0x011b:
            T r1 = r14.f14957a
            q.i r1 = (q.i) r1
            r2 = 0
            if (r1 == 0) goto L_0x012b
            long r5 = r1.f12705g
            long r7 = r4.f12712d
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r13 = r2
        L_0x012c:
            if (r13 == 0) goto L_0x0130
            r4.B = r2
        L_0x0130:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.j0.a(q.k, q.f, long, q.a$a, jf.d):java.lang.Object");
    }

    public static final Object b(f fVar, l lVar, d0 d0Var) {
        if (fVar.a()) {
            s1 s1Var = (s1) d0Var.getContext().d(s1.a.f1459a);
            if (s1Var == null) {
                return f1.a(d0Var.getContext()).Y(lVar, d0Var);
            }
            new u(lVar, (d<? super u>) null);
            return s1Var.X();
        }
        return f1.a(d0Var.getContext()).Y(new i0(lVar), d0Var);
    }

    public static final <T, V extends p> void c(i<T, V> iVar, long j10, float f10, f<T, V> fVar, k<T, V> kVar, l<? super i<T, V>, m> lVar) {
        long b10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1)) == 0 ? fVar.b() : (long) (((float) (j10 - iVar.f12701c)) / f10);
        iVar.f12705g = j10;
        iVar.f12703e.setValue(fVar.f(b10));
        V d10 = fVar.d(b10);
        j.f(d10, "<set-?>");
        iVar.f12704f = d10;
        if (fVar.e(b10)) {
            iVar.f12706h = iVar.f12705g;
            iVar.f12707i.setValue(Boolean.FALSE);
        }
        e(iVar, kVar);
        lVar.invoke(iVar);
    }

    public static final float d(f fVar) {
        j.f(fVar, "<this>");
        int i8 = h.f7182r;
        h hVar = (h) fVar.d(h.a.f7183a);
        float L = hVar != null ? hVar.L() : 1.0f;
        if (L >= 0.0f) {
            return L;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends p> void e(i<T, V> iVar, k<T, V> kVar) {
        j.f(iVar, "<this>");
        j.f(kVar, "state");
        kVar.f12710b.setValue(iVar.f12703e.getValue());
        V v3 = kVar.f12711c;
        V v10 = iVar.f12704f;
        j.f(v3, "<this>");
        j.f(v10, "source");
        int b10 = v3.b();
        for (int i8 = 0; i8 < b10; i8++) {
            v3.e(i8, v10.a(i8));
        }
        kVar.f12713e = iVar.f12706h;
        kVar.f12712d = iVar.f12705g;
        kVar.B = ((Boolean) iVar.f12707i.getValue()).booleanValue();
    }
}
