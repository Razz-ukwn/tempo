package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h3  reason: invalid package */
public final class h3 {

    /* renamed from: b  reason: collision with root package name */
    public static final f3 f4608b = new f3();

    /* renamed from: a  reason: collision with root package name */
    public final g3 f4609a;

    public h3() {
        n3 n3Var;
        n3[] n3VarArr = new n3[2];
        n3VarArr[0] = l2.f4701a;
        try {
            n3Var = (n3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            n3Var = f4608b;
        }
        n3VarArr[1] = n3Var;
        g3 g3Var = new g3(n3VarArr);
        Charset charset = u2.f4974a;
        this.f4609a = g3Var;
    }
}
