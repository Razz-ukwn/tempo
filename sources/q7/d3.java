package q7;

import android.content.SharedPreferences;
import u6.q;

public final class d3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f12956a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12957b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12958c;

    /* renamed from: d  reason: collision with root package name */
    public long f12959d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g3 f12960e;

    public d3(g3 g3Var, String str, long j10) {
        this.f12960e = g3Var;
        q.f(str);
        this.f12956a = str;
        this.f12957b = j10;
    }

    public final long a() {
        if (!this.f12958c) {
            this.f12958c = true;
            this.f12959d = this.f12960e.m().getLong(this.f12956a, this.f12957b);
        }
        return this.f12959d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f12960e.m().edit();
        edit.putLong(this.f12956a, j10);
        edit.apply();
        this.f12959d = j10;
    }
}
