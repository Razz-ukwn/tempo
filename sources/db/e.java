package db;

import ab.a0;
import ab.b0;
import ab.i;
import ab.m;
import ab.t;
import ab.z;
import cb.h;
import gb.a;

public final class e implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final h f7420a;

    public e(h hVar) {
        this.f7420a = hVar;
    }

    public static a0 b(h hVar, i iVar, a aVar, bb.a aVar2) {
        a0 a0Var;
        Object g10 = hVar.a(new a(aVar2.value())).g();
        if (g10 instanceof a0) {
            a0Var = (a0) g10;
        } else if (g10 instanceof b0) {
            a0Var = ((b0) g10).a(iVar, aVar);
        } else {
            boolean z10 = g10 instanceof t;
            if (z10 || (g10 instanceof m)) {
                m mVar = null;
                t tVar = z10 ? (t) g10 : null;
                if (g10 instanceof m) {
                    mVar = (m) g10;
                }
                a0Var = new o(tVar, mVar, iVar, aVar);
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + g10.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (a0Var == null || !aVar2.nullSafe()) ? a0Var : new z(a0Var);
    }

    public final <T> a0<T> a(i iVar, a<T> aVar) {
        bb.a aVar2 = (bb.a) aVar.f8928a.getAnnotation(bb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f7420a, iVar, aVar, aVar2);
    }
}
