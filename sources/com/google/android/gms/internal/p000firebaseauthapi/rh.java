package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import androidx.compose.ui.platform.j3;
import androidx.lifecycle.u;
import r9.g0;
import s9.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.rh  reason: invalid package */
public final class rh implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j3 f4886b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f4887c;

    public /* synthetic */ rh(u uVar, j3 j3Var, int i8) {
        this.f4885a = i8;
        this.f4887c = uVar;
        this.f4886b = j3Var;
    }

    public final void d(n nVar) {
        switch (this.f4885a) {
            case 0:
                f0 f0Var = (f0) nVar;
                if (!TextUtils.isEmpty(f0Var.B)) {
                    this.f4886b.h(new qh(f0Var.B, f0Var.f4534e, (g0) null));
                    return;
                }
                m0 m0Var = new m0(f0Var.f4531b, f0Var.f4530a, Long.valueOf(f0Var.f4533d), "Bearer");
                this.f4887c.g(m0Var, (String) null, (String) null, Boolean.valueOf(f0Var.f4532c), (g0) null, this.f4886b, this);
                return;
            default:
                b1 b1Var = (b1) nVar;
                m0 m0Var2 = new m0(b1Var.f4411b, b1Var.f4410a, Long.valueOf(b1Var.f4412c), "Bearer");
                this.f4887c.g(m0Var2, (String) null, (String) null, Boolean.valueOf(b1Var.f4413d), (g0) null, this.f4886b, this);
                return;
        }
    }

    public final void zza(String str) {
        int i8 = this.f4885a;
        j3 j3Var = this.f4886b;
        switch (i8) {
            case 0:
                j3Var.i(j.a(str));
                return;
            default:
                j3Var.i(j.a(str));
                return;
        }
    }
}
