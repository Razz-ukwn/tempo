package u6;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Set;

public abstract class g<T extends IInterface> extends b<T> implements a.e {
    public final Account A;

    /* renamed from: y  reason: collision with root package name */
    public final d f15805y;

    /* renamed from: z  reason: collision with root package name */
    public final Set f15806z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(android.content.Context r10, android.os.Looper r11, int r12, u6.d r13, com.google.android.gms.common.api.internal.d r14, com.google.android.gms.common.api.internal.k r15) {
        /*
            r9 = this;
            u6.h1 r3 = u6.h.a(r10)
            t6.e r4 = t6.e.f15393d
            u6.q.i(r14)
            u6.q.i(r15)
            u6.c0 r6 = new u6.c0
            r6.<init>(r14)
            u6.d0 r7 = new u6.d0
            r7.<init>(r15)
            java.lang.String r8 = r13.f15774f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f15805y = r13
            android.accounts.Account r10 = r13.f15769a
            r9.A = r10
            java.util.Set r10 = r13.f15771c
            java.util.Iterator r11 = r10.iterator()
        L_0x002b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0046
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x003e
            goto L_0x002b
        L_0x003e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L_0x0046:
            r9.f15806z = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.g.<init>(android.content.Context, android.os.Looper, int, u6.d, com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.k):void");
    }

    public final Set<Scope> a() {
        return m() ? this.f15806z : Collections.emptySet();
    }

    public final Account s() {
        return this.A;
    }

    public final void u() {
    }

    public final Set<Scope> w() {
        return this.f15806z;
    }
}
