package q7;

import android.os.Handler;
import com.google.android.gms.internal.measurement.m0;
import s6.n;
import u6.q;

public abstract class m {

    /* renamed from: d  reason: collision with root package name */
    public static volatile m0 f13194d;

    /* renamed from: a  reason: collision with root package name */
    public final k4 f13195a;

    /* renamed from: b  reason: collision with root package name */
    public final n f13196b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f13197c;

    public m(k4 k4Var) {
        q.i(k4Var);
        this.f13195a = k4Var;
        this.f13196b = new n((Object) this, (Object) k4Var, 2);
    }

    public final void a() {
        this.f13197c = 0;
        d().removeCallbacks(this.f13196b);
    }

    public abstract void b();

    public final void c(long j10) {
        a();
        if (j10 >= 0) {
            ((ag.m) this.f13195a.a()).getClass();
            this.f13197c = System.currentTimeMillis();
            if (!d().postDelayed(this.f13196b, j10)) {
                this.f13195a.e().B.c(Long.valueOf(j10), "Failed to schedule delayed post. time");
            }
        }
    }

    public final Handler d() {
        m0 m0Var;
        if (f13194d != null) {
            return f13194d;
        }
        synchronized (m.class) {
            if (f13194d == null) {
                f13194d = new m0(this.f13195a.d().getMainLooper());
            }
            m0Var = f13194d;
        }
        return m0Var;
    }
}
