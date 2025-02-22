package androidx.fragment.app;

import androidx.activity.result.c;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2051a;

    public o(AtomicReference atomicReference) {
        this.f2051a = atomicReference;
    }

    public final void a(Object obj) {
        c cVar = (c) this.f2051a.get();
        if (cVar != null) {
            cVar.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
