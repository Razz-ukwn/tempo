package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.ArrayList;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5552a = new ArrayList();

    public abstract o a(String str, c cVar, ArrayList arrayList);

    public final void b(String str) {
        if (this.f5552a.contains(f4.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
