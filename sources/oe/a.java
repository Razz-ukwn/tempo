package oe;

import ag.d0;
import ag.g2;
import ag.s0;
import ag.x1;
import android.app.Application;
import androidx.lifecycle.b;
import androidx.lifecycle.v;
import cb.d;
import d2.f1;
import java.util.concurrent.CancellationException;
import jf.f;
import kotlinx.coroutines.internal.e;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.scheduling.c;
import rf.p;
import sf.j;

public class a extends b {

    /* renamed from: e  reason: collision with root package name */
    public final g2 f12310e;

    /* renamed from: f  reason: collision with root package name */
    public final e f12311f;

    /* renamed from: g  reason: collision with root package name */
    public final v<Exception> f12312g = new v<>();

    /* renamed from: oe.a$a  reason: collision with other inner class name */
    public static final class C0237a extends jf.a implements d0 {
        public C0237a() {
            super(d0.a.f411a);
        }

        public final void T(f fVar, Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        j.f(application, "application");
        g2 f10 = d.f();
        this.f12310e = f10;
        C0237a aVar = new C0237a();
        c cVar = s0.f480a;
        x1 x1Var = m.f10728a;
        x1Var.getClass();
        this.f12311f = f1.e(f.a.a(x1Var, f10).n0(aVar));
    }

    public void c() {
        this.f12310e.e((CancellationException) null);
    }

    public final void f(p pVar) {
        cb.b.D(this.f12311f, (f.b) null, 0, new b(this, pVar, (jf.d) null), 3);
    }
}
