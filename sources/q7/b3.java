package q7;

import android.content.SharedPreferences;
import u6.q;

public final class b3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f12915a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12916b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12917c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12918d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g3 f12919e;

    public b3(g3 g3Var, String str, boolean z10) {
        this.f12919e = g3Var;
        q.f(str);
        this.f12915a = str;
        this.f12916b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f12919e.m().edit();
        edit.putBoolean(this.f12915a, z10);
        edit.apply();
        this.f12918d = z10;
    }

    public final boolean b() {
        if (!this.f12917c) {
            this.f12917c = true;
            this.f12918d = this.f12919e.m().getBoolean(this.f12915a, this.f12916b);
        }
        return this.f12918d;
    }
}
