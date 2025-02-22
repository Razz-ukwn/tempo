package ze;

import androidx.fragment.app.z;
import java.util.concurrent.Callable;
import sb.f;
import se.b;
import te.c;

public final class a<T> extends z {

    /* renamed from: b  reason: collision with root package name */
    public final Callable<? extends T> f17955b;

    public a(f fVar) {
        this.f17955b = fVar;
    }

    public final void D(b<? super T> bVar) {
        c cVar = new c(xe.a.f17070a);
        bVar.b(cVar);
        if (!cVar.b()) {
            try {
                Object call = this.f17955b.call();
                if (call == null) {
                    throw new NullPointerException("The callable returned a null value");
                } else if (!cVar.b()) {
                    bVar.onSuccess(call);
                }
            } catch (Throwable th) {
                e9.c.m(th);
                if (!cVar.b()) {
                    bVar.onError(th);
                } else {
                    cf.a.b(th);
                }
            }
        }
    }
}
