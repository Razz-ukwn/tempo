package k7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.k;
import n7.h;
import o.f;
import u6.d;
import u6.g;

public final class r extends g {
    public static final /* synthetic */ int E = 0;
    public final f B = new f();
    public final f C = new f();
    public final f D = new f();

    public r(Context context, Looper looper, d dVar, com.google.android.gms.common.api.internal.d dVar2, k kVar) {
        super(context, looper, 23, dVar, dVar2, kVar);
    }

    public final void B() {
        System.currentTimeMillis();
        synchronized (this.B) {
            this.B.clear();
        }
        synchronized (this.C) {
            this.C.clear();
        }
        synchronized (this.D) {
            this.D.clear();
        }
    }

    public final boolean C() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(com.google.android.gms.common.api.internal.i.a r10, boolean r11, com.google.android.gms.tasks.TaskCompletionSource r12) {
        /*
            r9 = this;
            o.f r0 = r9.C
            monitor-enter(r0)
            o.f r1 = r9.C     // Catch:{ all -> 0x006d }
            java.lang.Object r10 = r1.remove(r10)     // Catch:{ all -> 0x006d }
            r5 = r10
            k7.p r5 = (k7.p) r5     // Catch:{ all -> 0x006d }
            if (r5 != 0) goto L_0x0015
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x006d }
            r12.setResult(r10)     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x0015:
            k7.l r10 = r5.f10377c     // Catch:{ all -> 0x006d }
            com.google.android.gms.common.api.internal.i r10 = r10.zza()     // Catch:{ all -> 0x006d }
            r1 = 0
            r10.f4274b = r1     // Catch:{ all -> 0x006d }
            r10.f4275c = r1     // Catch:{ all -> 0x006d }
            if (r11 == 0) goto L_0x0066
            t6.d r10 = n7.h.f11610b     // Catch:{ all -> 0x006d }
            boolean r10 = r9.G(r10)     // Catch:{ all -> 0x006d }
            if (r10 == 0) goto L_0x004a
            android.os.IInterface r10 = r9.x()     // Catch:{ all -> 0x006d }
            k7.n0 r10 = (k7.n0) r10     // Catch:{ all -> 0x006d }
            k7.s r11 = new k7.s     // Catch:{ all -> 0x006d }
            r3 = 0
            r2 = 2
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r11
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006d }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x006d }
            k7.h r2 = new k7.h     // Catch:{ all -> 0x006d }
            r2.<init>(r1, r12)     // Catch:{ all -> 0x006d }
            r10.C(r11, r2)     // Catch:{ all -> 0x006d }
            goto L_0x006b
        L_0x004a:
            android.os.IInterface r10 = r9.x()     // Catch:{ all -> 0x006d }
            k7.n0 r10 = (k7.n0) r10     // Catch:{ all -> 0x006d }
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x006d }
            k7.j r7 = new k7.j     // Catch:{ all -> 0x006d }
            r7.<init>(r11, r12)     // Catch:{ all -> 0x006d }
            k7.w r11 = new k7.w     // Catch:{ all -> 0x006d }
            r2 = 2
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006d }
            r10.y(r11)     // Catch:{ all -> 0x006d }
            goto L_0x006b
        L_0x0066:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x006d }
            r12.setResult(r10)     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.r.F(com.google.android.gms.common.api.internal.i$a, boolean, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public final boolean G(t6.d dVar) {
        t6.d dVar2;
        t6.d[] k10 = k();
        if (k10 == null) {
            return false;
        }
        int length = k10.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                dVar2 = null;
                break;
            }
            dVar2 = k10[i8];
            if (dVar.f15389a.equals(dVar2.f15389a)) {
                break;
            }
            i8++;
        }
        return dVar2 != null && dVar2.w() >= dVar.w();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059 A[Catch:{ all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[Catch:{ all -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(k7.l r29, com.google.android.gms.location.LocationRequest r30, com.google.android.gms.tasks.TaskCompletionSource r31) {
        /*
            r28 = this;
            r1 = r28
            r0 = r30
            r2 = r31
            com.google.android.gms.common.api.internal.i r3 = r29.zza()
            com.google.android.gms.common.api.internal.i$a r4 = r3.f4275c
            r4.getClass()
            t6.d r5 = n7.h.f11610b
            boolean r5 = r1.G(r5)
            o.f r6 = r1.C
            monitor-enter(r6)
            o.f r7 = r1.C     // Catch:{ all -> 0x007a }
            r8 = 0
            java.lang.Object r7 = r7.getOrDefault(r4, r8)     // Catch:{ all -> 0x007a }
            k7.p r7 = (k7.p) r7     // Catch:{ all -> 0x007a }
            if (r7 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            k7.l r9 = r7.f10377c     // Catch:{ all -> 0x007a }
            r9.b(r3)     // Catch:{ all -> 0x007a }
            r13 = r7
            r7 = r8
            goto L_0x003b
        L_0x002e:
            k7.p r3 = new k7.p     // Catch:{ all -> 0x007a }
            r9 = r29
            r3.<init>(r9)     // Catch:{ all -> 0x007a }
            o.f r9 = r1.C     // Catch:{ all -> 0x007a }
            r9.put(r4, r3)     // Catch:{ all -> 0x007a }
            r13 = r3
        L_0x003b:
            java.lang.Object r3 = r4.f4276a     // Catch:{ all -> 0x007a }
            int r3 = java.lang.System.identityHashCode(r3)     // Catch:{ all -> 0x007a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r9.<init>()     // Catch:{ all -> 0x007a }
            java.lang.String r4 = r4.f4277b     // Catch:{ all -> 0x007a }
            r9.append(r4)     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "@"
            r9.append(r4)     // Catch:{ all -> 0x007a }
            r9.append(r3)     // Catch:{ all -> 0x007a }
            java.lang.String r16 = r9.toString()     // Catch:{ all -> 0x007a }
            if (r5 == 0) goto L_0x007c
            android.os.IInterface r3 = r28.x()     // Catch:{ all -> 0x007a }
            k7.n0 r3 = (k7.n0) r3     // Catch:{ all -> 0x007a }
            k7.s r4 = new k7.s     // Catch:{ all -> 0x007a }
            if (r7 != 0) goto L_0x0065
            r11 = r8
            goto L_0x0066
        L_0x0065:
            r11 = r7
        L_0x0066:
            r10 = 2
            r5 = 0
            r14 = 0
            r9 = r4
            r12 = r13
            r13 = r5
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x007a }
            k7.h r5 = new k7.h     // Catch:{ all -> 0x007a }
            r5.<init>(r8, r2)     // Catch:{ all -> 0x007a }
            r3.j(r4, r0, r5)     // Catch:{ all -> 0x007a }
            goto L_0x00be
        L_0x007a:
            r0 = move-exception
            goto L_0x00c0
        L_0x007c:
            android.os.IInterface r3 = r28.x()     // Catch:{ all -> 0x007a }
            k7.n0 r3 = (k7.n0) r3     // Catch:{ all -> 0x007a }
            com.google.android.gms.location.LocationRequest$a r4 = new com.google.android.gms.location.LocationRequest$a     // Catch:{ all -> 0x007a }
            r4.<init>(r0)     // Catch:{ all -> 0x007a }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007a }
            r5 = 30
            if (r0 >= r5) goto L_0x008f
            r4.f5656l = r8     // Catch:{ all -> 0x007a }
        L_0x008f:
            com.google.android.gms.location.LocationRequest r18 = r4.a()     // Catch:{ all -> 0x007a }
            k7.u r11 = new k7.u     // Catch:{ all -> 0x007a }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x007a }
            k7.k r15 = new k7.k     // Catch:{ all -> 0x007a }
            r15.<init>(r2, r13)     // Catch:{ all -> 0x007a }
            k7.w r0 = new k7.w     // Catch:{ all -> 0x007a }
            r10 = 1
            r12 = 0
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x007a }
            r3.y(r0)     // Catch:{ all -> 0x007a }
        L_0x00be:
            monitor-exit(r6)     // Catch:{ all -> 0x007a }
            return
        L_0x00c0:
            monitor-exit(r6)     // Catch:{ all -> 0x007a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.r.H(k7.l, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public final int j() {
        return 11717000;
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new m0(iBinder);
    }

    public final t6.d[] t() {
        return h.f11611c;
    }

    public final String y() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String z() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
