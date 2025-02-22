package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g7  reason: invalid package */
public final class g7 implements l5 {

    /* renamed from: a  reason: collision with root package name */
    public Object f4571a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4572b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4573c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4574d;

    public /* synthetic */ g7() {
        this.f4571a = null;
        this.f4572b = null;
        this.f4573c = null;
        this.f4574d = h7.f4619d;
    }

    public /* synthetic */ g7(pf pfVar, u9 u9Var, q9 q9Var, r9 r9Var) {
        this.f4571a = pfVar;
        this.f4572b = u9Var;
        this.f4574d = q9Var;
        this.f4573c = r9Var;
    }

    public final i7 a() {
        Integer num = (Integer) this.f4571a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (((Integer) this.f4572b) == null) {
            throw new GeneralSecurityException("IV size is not set");
        } else if (((h7) this.f4574d) == null) {
            throw new GeneralSecurityException("Variant is not set");
        } else if (((Integer) this.f4573c) != null) {
            int intValue = num.intValue();
            int intValue2 = ((Integer) this.f4572b).intValue();
            ((Integer) this.f4573c).intValue();
            return new i7(intValue, intValue2, (h7) this.f4574d);
        } else {
            throw new GeneralSecurityException("Tag size is not set");
        }
    }
}
