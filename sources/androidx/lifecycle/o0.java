package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f2301a = new LinkedHashMap();

    public final void a() {
        for (j0 j0Var : this.f2301a.values()) {
            j0Var.f2284c = true;
            HashMap hashMap = j0Var.f2282a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object b10 : j0Var.f2282a.values()) {
                        j0.b(b10);
                    }
                }
            }
            LinkedHashSet linkedHashSet = j0Var.f2283b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable b11 : j0Var.f2283b) {
                        j0.b(b11);
                    }
                }
            }
            j0Var.c();
        }
        this.f2301a.clear();
    }
}
