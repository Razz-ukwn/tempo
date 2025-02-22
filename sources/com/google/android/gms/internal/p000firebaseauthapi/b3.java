package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b3  reason: invalid package */
public final class b3 extends d3 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f4417c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.firebase-auth-api.z2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.firebase-auth-api.z2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.firebase-auth-api.z2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List d(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.p000firebaseauthapi.u4.j(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof com.google.android.gms.internal.p000firebaseauthapi.a3
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.internal.firebase-auth-api.z2 r0 = new com.google.android.gms.internal.firebase-auth-api.z2
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p000firebaseauthapi.v3
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof com.google.android.gms.internal.p000firebaseauthapi.t2
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.firebase-auth-api.t2 r0 = (com.google.android.gms.internal.p000firebaseauthapi.t2) r0
            com.google.android.gms.internal.firebase-auth-api.t2 r6 = r0.zzd(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r3, r4, r0)
            goto L_0x0087
        L_0x002f:
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r2 = f4417c
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r3, r4, r1)
        L_0x004b:
            r0 = r1
            goto L_0x0087
        L_0x004d:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p000firebaseauthapi.p4
            if (r1 == 0) goto L_0x0068
            com.google.android.gms.internal.firebase-auth-api.z2 r1 = new com.google.android.gms.internal.firebase-auth-api.z2
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.firebase-auth-api.p4 r0 = (com.google.android.gms.internal.p000firebaseauthapi.p4) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r3, r4, r1)
            goto L_0x004b
        L_0x0068:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p000firebaseauthapi.v3
            if (r1 == 0) goto L_0x0087
            boolean r1 = r0 instanceof com.google.android.gms.internal.p000firebaseauthapi.t2
            if (r1 == 0) goto L_0x0087
            r1 = r0
            com.google.android.gms.internal.firebase-auth-api.t2 r1 = (com.google.android.gms.internal.p000firebaseauthapi.t2) r1
            boolean r2 = r1.zzc()
            if (r2 == 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.firebase-auth-api.t2 r6 = r1.zzd(r0)
            com.google.android.gms.internal.p000firebaseauthapi.u4.s(r3, r4, r6)
            return r6
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.b3.d(java.lang.Object, long, int):java.util.List");
    }

    public final List a(Object obj, long j10) {
        return d(obj, j10, 10);
    }

    public final void b(Object obj, long j10) {
        Object obj2;
        List list = (List) u4.j(obj, j10);
        if (list instanceof a3) {
            obj2 = ((a3) list).zze();
        } else {
            if (!f4417c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof v3) || !(list instanceof t2)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    t2 t2Var = (t2) list;
                    if (t2Var.zzc()) {
                        t2Var.zzb();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        u4.s(obj, j10, obj2);
    }

    public final void c(Object obj, Object obj2, long j10) {
        List list = (List) u4.j(obj2, j10);
        List d10 = d(obj, j10, list.size());
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        u4.s(obj, j10, list);
    }
}
