package db;

import ab.a0;
import ab.b0;
import ab.i;
import gb.a;

public final class s implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f7491a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f7492b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a0 f7493c;

    public s(Class cls, Class cls2, a0 a0Var) {
        this.f7491a = cls;
        this.f7492b = cls2;
        this.f7493c = a0Var;
    }

    public final <T> a0<T> a(i iVar, a<T> aVar) {
        Class<? super T> cls = aVar.f8928a;
        if (cls == this.f7491a || cls == this.f7492b) {
            return this.f7493c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f7492b.getName() + "+" + this.f7491a.getName() + ",adapter=" + this.f7493c + "]";
    }
}
