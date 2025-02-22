package q7;

import android.content.SharedPreferences;
import u6.q;

public final class f3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f12994a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12995b;

    /* renamed from: c  reason: collision with root package name */
    public String f12996c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g3 f12997d;

    public f3(g3 g3Var, String str) {
        this.f12997d = g3Var;
        q.f(str);
        this.f12994a = str;
    }

    public final String a() {
        if (!this.f12995b) {
            this.f12995b = true;
            this.f12996c = this.f12997d.m().getString(this.f12994a, (String) null);
        }
        return this.f12996c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f12997d.m().edit();
        edit.putString(this.f12994a, str);
        edit.apply();
        this.f12996c = str;
    }
}
