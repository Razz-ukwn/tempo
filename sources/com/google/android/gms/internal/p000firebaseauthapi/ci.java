package com.google.android.gms.internal.p000firebaseauthapi;

import t.w2;
import t.x2;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ci  reason: invalid package */
public final class ci extends i0 {
    public final /* synthetic */ x2 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ci(x2 x2Var, w2 w2Var, CharSequence charSequence) {
        super(w2Var, charSequence);
        this.B = x2Var;
    }

    public final int d(int i8) {
        return i8 + 1;
    }

    public final int e(int i8) {
        ic icVar = (ic) this.B.f15278b;
        CharSequence charSequence = this.f4630c;
        int length = charSequence.length();
        wh.b(i8, length);
        while (i8 < length) {
            if (icVar.a(charSequence.charAt(i8))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }
}
