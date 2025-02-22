package e5;

import android.content.Context;
import com.bumptech.glide.m;
import e5.b;
import e5.o;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7808a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f7809b;

    public d(Context context, m.b bVar) {
        this.f7808a = context.getApplicationContext();
        this.f7809b = bVar;
    }

    public final void a() {
        o a10 = o.a(this.f7808a);
        b.a aVar = this.f7809b;
        synchronized (a10) {
            a10.f7828b.add(aVar);
            a10.b();
        }
    }

    public final void e() {
    }

    public final void h() {
        o a10 = o.a(this.f7808a);
        b.a aVar = this.f7809b;
        synchronized (a10) {
            a10.f7828b.remove(aVar);
            if (a10.f7829c) {
                if (a10.f7828b.isEmpty()) {
                    o.c cVar = a10.f7827a;
                    cVar.f7834c.get().unregisterNetworkCallback(cVar.f7835d);
                    a10.f7829c = false;
                }
            }
        }
    }
}
