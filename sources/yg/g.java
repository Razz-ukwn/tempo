package yg;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import yg.i;

public final class g implements c<Object, b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f17465a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f17466b;

    public g(Type type, Executor executor) {
        this.f17465a = type;
        this.f17466b = executor;
    }

    public final Object a(t tVar) {
        Executor executor = this.f17466b;
        return executor == null ? tVar : new i.a(executor, tVar);
    }

    public final Type b() {
        return this.f17465a;
    }
}
