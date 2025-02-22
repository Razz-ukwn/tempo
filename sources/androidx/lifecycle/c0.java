package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.j;
import androidx.lifecycle.m0;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import rf.l;
import sf.j;
import sf.k;
import sf.w;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2254a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f2255b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a f2256c = new a();

    public static final class a {
    }

    public static final class b {
    }

    public static final class c {
    }

    public static final class d extends k implements l<x2.a, e0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f2257a = new d();

        public d() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j.f((x2.a) obj, "$this$initializer");
            return new e0();
        }
    }

    public static final b0 a(x2.c cVar) {
        b bVar = f2254a;
        LinkedHashMap linkedHashMap = cVar.f16911a;
        l3.b bVar2 = (l3.b) linkedHashMap.get(bVar);
        if (bVar2 != null) {
            p0 p0Var = (p0) linkedHashMap.get(f2255b);
            if (p0Var != null) {
                Bundle bundle = (Bundle) linkedHashMap.get(f2256c);
                String str = (String) linkedHashMap.get(n0.f2300a);
                if (str != null) {
                    a.b b10 = bVar2.w().b();
                    d0 d0Var = b10 instanceof d0 ? (d0) b10 : null;
                    if (d0Var != null) {
                        LinkedHashMap linkedHashMap2 = c(p0Var).f2264d;
                        b0 b0Var = (b0) linkedHashMap2.get(str);
                        if (b0Var != null) {
                            return b0Var;
                        }
                        Class<? extends Object>[] clsArr = b0.f2241f;
                        boolean z10 = true;
                        if (!d0Var.f2260b) {
                            d0Var.f2261c = d0Var.f2259a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                            d0Var.f2260b = true;
                            e0 e0Var = (e0) d0Var.f2262d.getValue();
                        }
                        Bundle bundle2 = d0Var.f2261c;
                        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
                        Bundle bundle4 = d0Var.f2261c;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = d0Var.f2261c;
                        if (bundle5 == null || !bundle5.isEmpty()) {
                            z10 = false;
                        }
                        if (z10) {
                            d0Var.f2261c = null;
                        }
                        b0 a10 = b0.a.a(bundle3, bundle);
                        linkedHashMap2.put(str, a10);
                        return a10;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final <T extends l3.b & p0> void b(T t2) {
        j.f(t2, "<this>");
        j.b b10 = t2.b().b();
        if (!(b10 == j.b.f2278b || b10 == j.b.f2279c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t2.w().b() == null) {
            d0 d0Var = new d0(t2.w(), (p0) t2);
            t2.w().c("androidx.lifecycle.internal.SavedStateHandlesProvider", d0Var);
            t2.b().a(new SavedStateHandleAttacher(d0Var));
        }
    }

    public static final e0 c(p0 p0Var) {
        sf.j.f(p0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        Class<e0> cls = e0.class;
        sf.d a10 = w.a(cls);
        d dVar = d.f2257a;
        sf.j.f(dVar, "initializer");
        arrayList.add(new x2.d(cb.b.y(a10), dVar));
        x2.d[] dVarArr = (x2.d[]) arrayList.toArray(new x2.d[0]);
        return (e0) new m0(p0Var, (m0.b) new x2.b((x2.d[]) Arrays.copyOf(dVarArr, dVarArr.length))).b(cls, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
