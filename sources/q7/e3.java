package q7;

import android.content.SharedPreferences;
import u6.q;

public final class e3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f12972a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12973b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12974c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12975d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g3 f12976e;

    public /* synthetic */ e3(g3 g3Var, long j10) {
        this.f12976e = g3Var;
        q.f("health_monitor");
        q.a(j10 > 0);
        this.f12972a = "health_monitor:start";
        this.f12973b = "health_monitor:count";
        this.f12974c = "health_monitor:value";
        this.f12975d = j10;
    }

    public final void a() {
        g3 g3Var = this.f12976e;
        g3Var.i();
        ((x3) g3Var.f13121a).J.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = g3Var.m().edit();
        edit.remove(this.f12973b);
        edit.remove(this.f12974c);
        edit.putLong(this.f12972a, currentTimeMillis);
        edit.apply();
    }
}
