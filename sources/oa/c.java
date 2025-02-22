package oa;

import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12252a;

    public /* synthetic */ c(e eVar) {
        this.f12252a = eVar;
    }

    public final Object call() {
        e eVar = this.f12252a;
        synchronized (eVar) {
            eVar.f12254a.get().h(eVar.f12256c.get().a(), System.currentTimeMillis());
        }
        return null;
    }
}
