package ze;

import androidx.fragment.app.z;
import java.util.concurrent.atomic.AtomicReference;
import we.e;

public final class b<T> extends z {

    /* renamed from: b  reason: collision with root package name */
    public final z f17956b;

    /* renamed from: c  reason: collision with root package name */
    public final se.a f17957c;

    public static final class a<T> extends AtomicReference<te.b> implements se.b<T>, te.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final se.b<? super T> f17958a;

        /* renamed from: b  reason: collision with root package name */
        public final e f17959b = new e();

        /* renamed from: c  reason: collision with root package name */
        public final z f17960c;

        public a(z zVar, se.b bVar) {
            this.f17958a = bVar;
            this.f17960c = zVar;
        }

        public final void a() {
            we.b.b(this);
            e eVar = this.f17959b;
            eVar.getClass();
            we.b.b(eVar);
        }

        public final void b(te.b bVar) {
            we.b.c(this, bVar);
        }

        public final void onError(Throwable th) {
            this.f17958a.onError(th);
        }

        public final void onSuccess(T t2) {
            this.f17958a.onSuccess(t2);
        }

        public final void run() {
            this.f17960c.A(this);
        }
    }

    public b(a aVar, se.a aVar2) {
        this.f17956b = aVar;
        this.f17957c = aVar2;
    }

    public final void D(se.b<? super T> bVar) {
        boolean z10;
        a aVar = new a(this.f17956b, bVar);
        bVar.b(aVar);
        te.b b10 = this.f17957c.b(aVar);
        do {
            e eVar = aVar.f17959b;
            te.b bVar2 = (te.b) eVar.get();
            if (bVar2 != we.b.f16706a) {
                while (true) {
                    if (!eVar.compareAndSet(bVar2, b10)) {
                        if (eVar.get() != bVar2) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else if (b10 != null) {
                b10.a();
                return;
            } else {
                return;
            }
        } while (!z10);
    }
}
