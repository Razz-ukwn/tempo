package com.google.android.gms.internal.p000firebaseauthapi;

import w3.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a8  reason: invalid package */
public final class a8 extends gb {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4381b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a8(int i8, Class cls) {
        super(cls);
        this.f4381b = i8;
    }

    public final /* bridge */ /* synthetic */ Object a(o3 o3Var) {
        switch (this.f4381b) {
            case 0:
                String w10 = ((gg) o3Var).x().w();
                return z5.a(w10).zza(w10);
            case 1:
                return new vg(((fe) o3Var).x().m());
            default:
                ad adVar = (ad) o3Var;
                return new hh(new c(adVar.y().m()), adVar.x().t());
        }
    }
}
