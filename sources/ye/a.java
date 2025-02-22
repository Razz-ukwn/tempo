package ye;

import e9.c;
import j0.o;
import j6.i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import te.b;

public final class a<T> extends AtomicReference<b> implements se.b<T>, b {

    /* renamed from: a  reason: collision with root package name */
    public final ve.a<? super T> f17365a;

    /* renamed from: b  reason: collision with root package name */
    public final ve.a<? super Throwable> f17366b;

    public a(i iVar, o oVar) {
        this.f17365a = iVar;
        this.f17366b = oVar;
    }

    public final void a() {
        we.b.b(this);
    }

    public final void b(b bVar) {
        we.b.c(this, bVar);
    }

    public final void onError(Throwable th) {
        lazySet(we.b.f16706a);
        try {
            this.f17366b.accept(th);
        } catch (Throwable th2) {
            c.m(th2);
            cf.a.b(new ue.a(Arrays.asList(new Throwable[]{th, th2})));
        }
    }

    public final void onSuccess(T t2) {
        lazySet(we.b.f16706a);
        try {
            this.f17365a.accept(t2);
        } catch (Throwable th) {
            c.m(th);
            cf.a.b(th);
        }
    }
}
