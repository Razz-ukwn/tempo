package oa;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import m9.d;
import qa.b;
import y1.l;
import ya.g;

public final class e implements g, h {

    /* renamed from: a  reason: collision with root package name */
    public final b<i> f12254a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f12255b;

    /* renamed from: c  reason: collision with root package name */
    public final b<g> f12256c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<f> f12257d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f12258e;

    public e() {
        throw null;
    }

    public e(Context context, String str, Set<f> set, b<g> bVar, Executor executor) {
        this.f12254a = new d(context, str);
        this.f12257d = set;
        this.f12258e = executor;
        this.f12256c = bVar;
        this.f12255b = context;
    }

    public final Task<String> a() {
        if (!l.a(this.f12255b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f12258e, new b(this));
    }

    public final synchronized int b() {
        boolean g10;
        long currentTimeMillis = System.currentTimeMillis();
        i iVar = this.f12254a.get();
        synchronized (iVar) {
            g10 = iVar.g(currentTimeMillis);
        }
        if (!g10) {
            return 1;
        }
        synchronized (iVar) {
            String d10 = iVar.d(System.currentTimeMillis());
            iVar.f12259a.edit().putString("last-used-date", d10).commit();
            iVar.f(d10);
        }
        return 3;
    }

    public final void c() {
        if (this.f12257d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!l.a(this.f12255b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f12258e, new c(this));
        }
    }
}
