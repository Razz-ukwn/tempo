package com.google.android.gms.internal.p000firebaseauthapi;

import t.w2;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r  reason: invalid package */
public final class r extends i0 {
    public final /* synthetic */ jf B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(w2 w2Var, CharSequence charSequence, jf jfVar) {
        super(w2Var, charSequence);
        this.B = jfVar;
    }

    public final int d(int i8) {
        return this.B.f4672a.end();
    }

    public final int e(int i8) {
        jf jfVar = this.B;
        if (jfVar.f4672a.find(i8)) {
            return jfVar.f4672a.start();
        }
        return -1;
    }
}
