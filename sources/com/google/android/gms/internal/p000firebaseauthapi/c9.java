package com.google.android.gms.internal.p000firebaseauthapi;

import cb.b;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c9  reason: invalid package */
public final class c9 {

    /* renamed from: a  reason: collision with root package name */
    public static final ab f4455a = new ab(b9.class);

    /* renamed from: b  reason: collision with root package name */
    public static final ya f4456b;

    /* renamed from: c  reason: collision with root package name */
    public static final na f4457c = new na(x8.class);

    /* renamed from: d  reason: collision with root package name */
    public static final ja f4458d;

    /* renamed from: e  reason: collision with root package name */
    public static final Map f4459e;

    /* renamed from: f  reason: collision with root package name */
    public static final Map f4460f;

    static {
        lh b10 = tb.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        f4456b = new ya(b10);
        f4458d = new ja(b.f3880a, b10);
        HashMap hashMap = new HashMap();
        a9 a9Var = a9.f4384d;
        mg mgVar = mg.RAW;
        hashMap.put(a9Var, mgVar);
        a9 a9Var2 = a9.f4382b;
        mg mgVar2 = mg.TINK;
        hashMap.put(a9Var2, mgVar2);
        a9 a9Var3 = a9.f4383c;
        mg mgVar3 = mg.CRUNCHY;
        hashMap.put(a9Var3, mgVar3);
        f4459e = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(mg.class);
        enumMap.put(mgVar, a9Var);
        enumMap.put(mgVar2, a9Var2);
        enumMap.put(mgVar3, a9Var3);
        enumMap.put(mg.LEGACY, a9Var3);
        f4460f = Collections.unmodifiableMap(enumMap);
    }
}
