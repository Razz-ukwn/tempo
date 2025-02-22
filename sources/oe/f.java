package oe;

import android.app.Application;
import androidx.lifecycle.v;
import java.util.HashMap;
import java.util.List;
import me.b;
import me.c;
import sf.j;

public final class f extends a {

    /* renamed from: h  reason: collision with root package name */
    public final v<HashMap<c, List<b>>> f12333h = new v<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Application application) {
        super(application);
        j.f(application, "application");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable g(java.util.List r12, java.util.Comparator r13, jf.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof oe.d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            oe.d r0 = (oe.d) r0
            int r1 = r0.f12324b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12324b = r1
            goto L_0x0018
        L_0x0013:
            oe.d r0 = new oe.d
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f12323a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f12324b
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            sf.v r12 = r0.f12327e
            java.util.List r13 = r0.f12326d
            java.util.List r13 = (java.util.List) r13
            cb.b.J(r14)
            goto L_0x0067
        L_0x002d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0035:
            cb.b.J(r14)
            sf.v r14 = new sf.v
            r14.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r14.f14957a = r2
            kotlinx.coroutines.scheduling.b r2 = ag.s0.f481b
            oe.e r10 = new oe.e
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.getClass()
            java.util.List r12 = (java.util.List) r12
            r0.f12326d = r12
            r0.getClass()
            r0.f12327e = r14
            r0.f12324b = r3
            java.lang.Object r12 = cb.b.M(r2, r10, r0)
            if (r12 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r12 = r14
        L_0x0067:
            T r12 = r12.f14957a
            java.util.HashMap r12 = (java.util.HashMap) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.f.g(java.util.List, java.util.Comparator, jf.d):java.io.Serializable");
    }
}
