package z1;

import android.os.Handler;
import java.util.concurrent.Callable;

public final class n<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final Callable<T> f17660a;

    /* renamed from: b  reason: collision with root package name */
    public final c2.a<T> f17661b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f17662c;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c2.a f17663a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f17664b;

        public a(c2.a aVar, Object obj) {
            this.f17663a = aVar;
            this.f17664b = obj;
        }

        public final void run() {
            this.f17663a.accept(this.f17664b);
        }
    }

    public n(Handler handler, h hVar, i iVar) {
        this.f17660a = hVar;
        this.f17661b = iVar;
        this.f17662c = handler;
    }

    public final void run() {
        T t2;
        try {
            t2 = this.f17660a.call();
        } catch (Exception unused) {
            t2 = null;
        }
        this.f17662c.post(new a(this.f17661b, t2));
    }
}
