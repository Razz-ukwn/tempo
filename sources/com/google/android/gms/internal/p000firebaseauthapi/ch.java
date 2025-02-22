package com.google.android.gms.internal.p000firebaseauthapi;

import ag.v1;
import androidx.lifecycle.u;
import cb.c;
import q2.d;
import q4.a;
import r3.s;
import t.x2;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ch  reason: invalid package */
public final class ch {

    /* renamed from: b  reason: collision with root package name */
    public static final ch f4470b = new ch(new d(5));

    /* renamed from: c  reason: collision with root package name */
    public static final ch f4471c = new ch(new v1());

    /* renamed from: d  reason: collision with root package name */
    public static final ch f4472d = new ch(new a(6));

    /* renamed from: e  reason: collision with root package name */
    public static final ch f4473e = new ch(new mb());

    /* renamed from: f  reason: collision with root package name */
    public static final ch f4474f = new ch(new c());

    /* renamed from: a  reason: collision with root package name */
    public final bh f4475a;

    static {
        new ch(new a(7));
        new ch(new d(6));
    }

    public ch(dh dhVar) {
        if (v8.a()) {
            this.f4475a = new u(dhVar);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f4475a = new s(dhVar);
        } else {
            this.f4475a = new x2(dhVar);
        }
    }

    public final Object a(String str) {
        return this.f4475a.zza(str);
    }
}
