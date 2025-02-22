package com.google.android.gms.internal.p000firebaseauthapi;

import o.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c0  reason: invalid package */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4437a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f4438b = new a();

    public static String a(String str) {
        b0 b0Var;
        a aVar = f4437a;
        synchronized (aVar) {
            b0Var = (b0) aVar.getOrDefault(str, null);
        }
        if (b0Var == null) {
            return "https://".concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
        }
        throw null;
    }
}
