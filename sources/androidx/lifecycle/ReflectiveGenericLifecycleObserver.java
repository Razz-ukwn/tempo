package androidx.lifecycle;

import androidx.lifecycle.c;
import androidx.lifecycle.j;
import java.util.HashMap;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2205a;

    /* renamed from: b  reason: collision with root package name */
    public final c.a f2206b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2205a = obj;
        this.f2206b = c.f2247c.b(obj.getClass());
    }

    public final void d(p pVar, j.a aVar) {
        HashMap hashMap = this.f2206b.f2250a;
        Object obj = this.f2205a;
        c.a.a((List) hashMap.get(aVar), pVar, aVar, obj);
        c.a.a((List) hashMap.get(j.a.ON_ANY), pVar, aVar, obj);
    }
}
