package bg;

import ag.l;
import ag.n1;
import ag.s0;
import ag.u0;
import ag.x1;
import ag.z1;
import android.os.Handler;
import android.os.Looper;
import h4.a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.scheduling.c;
import sf.j;

public final class f extends g {
    public final f B;
    private volatile f _immediate;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f3650c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3651d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3652e;

    public f() {
        throw null;
    }

    public f(Handler handler, String str, boolean z10) {
        this.f3650c = handler;
        this.f3651d = str;
        this.f3652e = z10;
        this._immediate = z10 ? this : null;
        f fVar = this._immediate;
        if (fVar == null) {
            fVar = new f(handler, str, true);
            this._immediate = fVar;
        }
        this.B = fVar;
    }

    public final void F0(jf.f fVar, Runnable runnable) {
        if (!this.f3650c.post(runnable)) {
            K0(fVar, runnable);
        }
    }

    public final boolean H0() {
        return !this.f3652e || !j.a(Looper.myLooper(), this.f3650c.getLooper());
    }

    public final x1 J0() {
        return this.B;
    }

    public final void K0(jf.f fVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        n1 n1Var = (n1) fVar.d(n1.b.f447a);
        if (n1Var != null) {
            n1Var.e(cancellationException);
        }
        s0.f481b.F0(fVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && ((f) obj).f3650c == this.f3650c;
    }

    public final void f0(long j10, l lVar) {
        d dVar = new d(lVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f3650c.postDelayed(dVar, j10)) {
            lVar.v(new e(this, dVar));
        } else {
            K0(lVar.f435e, dVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3650c);
    }

    public final u0 m0(long j10, Runnable runnable, jf.f fVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f3650c.postDelayed(runnable, j10)) {
            return new c(this, runnable);
        }
        K0(fVar, runnable);
        return z1.f519a;
    }

    public final String toString() {
        String str;
        x1 x1Var;
        c cVar = s0.f480a;
        x1 x1Var2 = m.f10728a;
        if (this == x1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                x1Var = x1Var2.J0();
            } catch (UnsupportedOperationException unused) {
                x1Var = null;
            }
            str = this == x1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f3651d;
        if (str2 == null) {
            str2 = this.f3650c.toString();
        }
        return this.f3652e ? a.c(str2, ".immediate") : str2;
    }

    public f(Handler handler) {
        this(handler, (String) null, false);
    }
}
