package u2;

import a6.d;
import a6.f;
import android.database.SQLException;
import android.util.Log;
import ba.b0;
import d6.u;
import d6.w;
import fa.c;
import i3.x;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import qa.a;
import sf.j;
import t9.t;
import u9.j;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15698a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15699b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15700c;

    public /* synthetic */ b(int i8, Object obj, Object obj2) {
        this.f15698a = i8;
        this.f15699b = obj;
        this.f15700c = obj2;
    }

    public final void run() {
        a.C0253a<T> aVar;
        switch (this.f15698a) {
            case 1:
                Runnable runnable = (Runnable) this.f15699b;
                x xVar = (x) this.f15700c;
                j.f(runnable, "$command");
                j.f(xVar, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                    xVar.a();
                }
            case 2:
                t tVar = (t) this.f15699b;
                qa.b<T> bVar = (qa.b) this.f15700c;
                if (tVar.f15494b == t.f15492d) {
                    synchronized (tVar) {
                        aVar = tVar.f15493a;
                        tVar.f15493a = null;
                        tVar.f15494b = bVar;
                    }
                    aVar.d(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 3:
                ((na.b) ((Map.Entry) this.f15699b).getKey()).a((na.a) this.f15700c);
                return;
            case 4:
                Callable callable = (Callable) this.f15699b;
                j.b bVar2 = (j.b) this.f15700c;
                try {
                    Object call = callable.call();
                    u9.j jVar = u9.j.this;
                    jVar.getClass();
                    if (call == null) {
                        call = i1.a.C;
                    }
                    if (i1.a.B.b(jVar, (Object) null, call)) {
                        i1.a.c(jVar);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    ((j.a) bVar2).a(e10);
                    return;
                }
            default:
                c cVar = (c) this.f15699b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f15700c;
                cVar.getClass();
                try {
                    f<b0> fVar = cVar.f8658h;
                    d dVar = d.f120c;
                    if (fVar instanceof u) {
                        w.a().f7371d.a(((u) fVar).f7362a.e(dVar), 1);
                    } else {
                        String c3 = h6.a.c("ForcedSender");
                        if (Log.isLoggable(c3, 5)) {
                            Log.w(c3, String.format("Expected instance of `TransportImpl`, got `%s`.", new Object[]{fVar}));
                        }
                    }
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
        }
    }
}
