package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class t7 extends v7 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f5527c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public final void a(Object obj, long j10) {
        Object obj2;
        List list = (List) n9.j(obj, j10);
        if (list instanceof s7) {
            obj2 = ((s7) list).zze();
        } else {
            if (!f5527c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof o8) || !(list instanceof l7)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    l7 l7Var = (l7) list;
                    if (l7Var.zzc()) {
                        l7Var.zzb();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        n9.r(obj, j10, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.measurement.r7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.measurement.r7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.measurement.r7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.Object r5, long r6, java.lang.Object r8) {
        /*
            r4 = this;
            java.lang.Object r8 = com.google.android.gms.internal.measurement.n9.j(r8, r6)
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.n9.j(r5, r6)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.s7
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.r7 r1 = new com.google.android.gms.internal.measurement.r7
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.o8
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.l7
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.l7 r1 = (com.google.android.gms.internal.measurement.l7) r1
            com.google.android.gms.internal.measurement.l7 r0 = r1.zzd(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.measurement.n9.r(r5, r6, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class r2 = r1.getClass()
            java.lang.Class r3 = f5527c
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.measurement.n9.r(r5, r6, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.i9
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.measurement.r7 r2 = new com.google.android.gms.internal.measurement.r7
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.measurement.i9 r1 = (com.google.android.gms.internal.measurement.i9) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.measurement.n9.r(r5, r6, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.o8
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.l7
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.measurement.l7 r2 = (com.google.android.gms.internal.measurement.l7) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.l7 r1 = r2.zzd(r1)
            com.google.android.gms.internal.measurement.n9.r(r5, r6, r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r8.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r8)
        L_0x009e:
            if (r0 > 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r8 = r1
        L_0x00a2:
            com.google.android.gms.internal.measurement.n9.r(r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.t7.b(java.lang.Object, long, java.lang.Object):void");
    }
}
