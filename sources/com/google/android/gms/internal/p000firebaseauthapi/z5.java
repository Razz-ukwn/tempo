package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z5  reason: invalid package */
public final class z5 {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList f5123a = new CopyOnWriteArrayList();

    public static y5 a(String str) {
        Iterator it = f5123a.iterator();
        while (it.hasNext()) {
            y5 y5Var = (y5) it.next();
            if (y5Var.a(str)) {
                return y5Var;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
