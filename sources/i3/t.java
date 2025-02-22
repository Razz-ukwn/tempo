package i3;

import android.annotation.SuppressLint;
import androidx.activity.b;
import androidx.activity.j;
import androidx.lifecycle.LiveData;
import f3.v;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kc.d;

@SuppressLint({"RestrictedApi"})
public final class t<T> extends LiveData<T> {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f9547v = 0;

    /* renamed from: l  reason: collision with root package name */
    public final p f9548l;
    public final v m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f9549n = false;

    /* renamed from: o  reason: collision with root package name */
    public final Callable<T> f9550o;

    /* renamed from: p  reason: collision with root package name */
    public final s f9551p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f9552q;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicBoolean f9553r;

    /* renamed from: s  reason: collision with root package name */
    public final AtomicBoolean f9554s;

    /* renamed from: t  reason: collision with root package name */
    public final j f9555t;

    /* renamed from: u  reason: collision with root package name */
    public final b f9556u;

    public t(p pVar, v vVar, d dVar, String[] strArr) {
        sf.j.f(pVar, "database");
        this.f9548l = pVar;
        this.m = vVar;
        this.f9550o = dVar;
        this.f9551p = new s(strArr, this);
        this.f9552q = new AtomicBoolean(true);
        this.f9553r = new AtomicBoolean(false);
        this.f9554s = new AtomicBoolean(false);
        this.f9555t = new j(this, 7);
        this.f9556u = new b(this, 7);
    }

    public final void g() {
        Executor executor;
        v vVar = this.m;
        vVar.getClass();
        ((Set) vVar.f8517b).add(this);
        boolean z10 = this.f9549n;
        p pVar = this.f9548l;
        if (z10) {
            executor = pVar.f9509c;
            if (executor == null) {
                sf.j.l("internalTransactionExecutor");
                throw null;
            }
        } else {
            executor = pVar.f9508b;
            if (executor == null) {
                sf.j.l("internalQueryExecutor");
                throw null;
            }
        }
        executor.execute(this.f9555t);
    }

    public final void h() {
        v vVar = this.m;
        vVar.getClass();
        ((Set) vVar.f8517b).remove(this);
    }
}
