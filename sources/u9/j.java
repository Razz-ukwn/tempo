package u9;

import android.annotation.SuppressLint;
import i1.a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
public final class j<V> extends i1.a<V> implements ScheduledFuture<V> {
    public final ScheduledFuture<?> D;

    public class a implements b<V> {
        public a() {
        }

        public final void a(Exception exc) {
            j jVar = j.this;
            jVar.getClass();
            if (i1.a.B.b(jVar, (Object) null, new a.c(exc))) {
                i1.a.c(jVar);
            }
        }
    }

    public interface b<T> {
    }

    public interface c<T> {
        ScheduledFuture a(a aVar);
    }

    public j(c<V> cVar) {
        this.D = cVar.a(new a());
    }

    public final void b() {
        ScheduledFuture<?> scheduledFuture = this.D;
        Object obj = this.f9398a;
        scheduledFuture.cancel((obj instanceof a.b) && ((a.b) obj).f9403a);
    }

    public final int compareTo(Object obj) {
        return this.D.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.D.getDelay(timeUnit);
    }
}
