package q7;

import android.content.SharedPreferences;
import android.util.Pair;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import u6.q;

public final class g3 extends j4 {
    public static final Pair T = new Pair("", 0L);
    public final f3 B;
    public String C;
    public boolean D;
    public long E;
    public final d3 F = new d3(this, "session_timeout", 1800000);
    public final b3 G = new b3(this, "start_new_session", true);
    public final f3 H = new f3(this, "non_personalized_ads");
    public final b3 I = new b3(this, "allow_remote_dynamite", false);
    public final d3 J = new d3(this, "last_pause_time", 0);
    public final d3 K = new d3(this, "session_id", 0);
    public boolean L;
    public final b3 M;
    public final b3 N;
    public final d3 O;
    public final f3 P;
    public final f3 Q;
    public final d3 R;
    public final c3 S;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f13072c;

    /* renamed from: d  reason: collision with root package name */
    public e3 f13073d;

    /* renamed from: e  reason: collision with root package name */
    public final d3 f13074e = new d3(this, "first_open_time", 0);

    public g3(x3 x3Var) {
        super(x3Var);
        q.f("app_install_time");
        this.B = new f3(this, "app_instance_id");
        this.M = new b3(this, "app_backgrounded", false);
        this.N = new b3(this, "deep_link_retrieval_complete", false);
        this.O = new d3(this, "deep_link_retrieval_attempts", 0);
        this.P = new f3(this, "firebase_feature_rollouts");
        this.Q = new f3(this, "deferred_attribution_cache");
        this.R = new d3(this, "deferred_attribution_cache_timestamp", 0);
        this.S = new c3(this);
    }

    public final boolean j() {
        return true;
    }

    public final SharedPreferences m() {
        i();
        k();
        q.i(this.f13072c);
        return this.f13072c;
    }

    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void n() {
        x3 x3Var = (x3) this.f13121a;
        SharedPreferences sharedPreferences = x3Var.f13419a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f13072c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.L = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f13072c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        x3Var.getClass();
        this.f13073d = new e3(this, Math.max(0, ((Long) g2.f13030e.a((Object) null)).longValue()));
    }

    public final h o() {
        i();
        return h.b(m().getString("consent_settings", "G1"));
    }

    public final Boolean p() {
        i();
        if (m().contains("measurement_enabled")) {
            return Boolean.valueOf(m().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final void q(Boolean bool) {
        i();
        SharedPreferences.Editor edit = m().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void r(boolean z10) {
        i();
        s2 s2Var = ((x3) this.f13121a).E;
        x3.l(s2Var);
        s2Var.J.c(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = m().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean s(long j10) {
        return j10 - this.F.a() > this.J.a();
    }

    public final boolean t(int i8) {
        int i10 = m().getInt("consent_source", 100);
        h hVar = h.f13093b;
        return i8 <= i10;
    }
}
