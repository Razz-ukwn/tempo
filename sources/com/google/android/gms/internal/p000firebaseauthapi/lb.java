package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.lb  reason: invalid package */
public final class lb implements nb {
    public final Integer B;

    /* renamed from: a  reason: collision with root package name */
    public final String f4712a;

    /* renamed from: b  reason: collision with root package name */
    public final lh f4713b;

    /* renamed from: c  reason: collision with root package name */
    public final q1 f4714c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4715d;

    /* renamed from: e  reason: collision with root package name */
    public final mg f4716e;

    public lb(String str, q1 q1Var, int i8, mg mgVar, Integer num) {
        this.f4712a = str;
        this.f4713b = tb.b(str);
        this.f4714c = q1Var;
        this.f4715d = i8;
        this.f4716e = mgVar;
        this.B = num;
    }

    public static lb a(String str, q1 q1Var, int i8, mg mgVar, Integer num) {
        if (mgVar == mg.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new lb(str, q1Var, i8, mgVar, num);
    }
}
