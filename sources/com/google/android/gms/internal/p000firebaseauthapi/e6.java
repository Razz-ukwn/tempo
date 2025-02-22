package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e6  reason: invalid package */
public final class e6 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4510a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4511b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4512c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4513d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4514e;

    public /* synthetic */ e6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f4510a = obj;
        this.f4511b = obj2;
        this.f4512c = obj3;
        this.f4513d = obj4;
        this.f4514e = obj5;
    }

    public /* synthetic */ e6(ConcurrentMap concurrentMap, ArrayList arrayList, c6 c6Var, uc ucVar, Class cls) {
        this.f4510a = concurrentMap;
        this.f4511b = arrayList;
        this.f4512c = c6Var;
        this.f4513d = cls;
        this.f4514e = ucVar;
    }

    public final List a(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f4510a).get(new d6(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean b() {
        return !((uc) this.f4514e).f4996a.isEmpty();
    }
}
