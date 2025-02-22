package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wc  reason: invalid package */
public final class wc {

    /* renamed from: a  reason: collision with root package name */
    public final s5 f5051a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5052b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5053c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5054d;

    public /* synthetic */ wc(s5 s5Var, int i8, String str, String str2) {
        this.f5051a = s5Var;
        this.f5052b = i8;
        this.f5053c = str;
        this.f5054d = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (com.google.android.gms.internal.p000firebaseauthapi.wc) r4;
        r0 = r4.f5051a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.p000firebaseauthapi.wc
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.internal.firebase-auth-api.wc r4 = (com.google.android.gms.internal.p000firebaseauthapi.wc) r4
            com.google.android.gms.internal.firebase-auth-api.s5 r0 = r4.f5051a
            com.google.android.gms.internal.firebase-auth-api.s5 r2 = r3.f5051a
            if (r2 != r0) goto L_0x002a
            int r0 = r3.f5052b
            int r2 = r4.f5052b
            if (r0 != r2) goto L_0x002a
            java.lang.String r0 = r3.f5053c
            java.lang.String r2 = r4.f5053c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r3.f5054d
            java.lang.String r4 = r4.f5054d
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x002a
            r4 = 1
            return r4
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.wc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5051a, Integer.valueOf(this.f5052b), this.f5053c, this.f5054d});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.f5051a, Integer.valueOf(this.f5052b), this.f5053c, this.f5054d});
    }
}
