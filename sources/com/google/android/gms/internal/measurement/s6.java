package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class s6 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile s6 f5516b;

    /* renamed from: c  reason: collision with root package name */
    public static final s6 f5517c = new s6(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map f5518a;

    public s6() {
        this.f5518a = new HashMap();
    }

    public final e7 a(h8 h8Var, int i8) {
        return (e7) this.f5518a.get(new r6(h8Var, i8));
    }

    public s6(int i8) {
        this.f5518a = Collections.emptyMap();
    }
}
