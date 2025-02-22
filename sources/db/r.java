package db;

import ab.a0;
import ab.b0;
import ab.i;
import gb.a;

public final class r implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f7489a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f7490b;

    public r(Class cls, a0 a0Var) {
        this.f7489a = cls;
        this.f7490b = a0Var;
    }

    public final <T> a0<T> a(i iVar, a<T> aVar) {
        if (aVar.f8928a == this.f7489a) {
            return this.f7490b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f7489a.getName() + ",adapter=" + this.f7490b + "]";
    }
}
