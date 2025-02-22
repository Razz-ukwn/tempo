package ee;

import androidx.lifecycle.a;
import androidx.lifecycle.b0;
import androidx.lifecycle.j0;
import ee.d;
import java.util.LinkedHashSet;
import jc.h;
import jc.i;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ de.a f7980d;

    public c(de.a aVar) {
        this.f7980d = aVar;
    }

    public final <T extends j0> T d(String str, Class<T> cls, b0 b0Var) {
        e eVar = new e();
        h hVar = (h) this.f7980d;
        hVar.getClass();
        b0Var.getClass();
        hVar.getClass();
        hVar.getClass();
        ef.a aVar = ((d.a) cb.d.E(d.a.class, new i(hVar.f9925a, hVar.f9926b))).a().get(cls.getName());
        if (aVar != null) {
            T t2 = (j0) aVar.get();
            b bVar = new b(eVar);
            LinkedHashSet linkedHashSet = t2.f2283b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    t2.f2283b.add(bVar);
                }
            }
            return t2;
        }
        throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
    }
}
