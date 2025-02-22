package f3;

import ag.f2;
import ag.g0;
import androidx.compose.ui.platform.b3;
import cb.b;
import cg.e;
import ff.m;
import jf.d;
import jf.f;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.p0;
import sf.j;

public final class k<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b0<T> f8291a = new b0<>();

    /* renamed from: b  reason: collision with root package name */
    public final p0 f8292b;

    /* renamed from: c  reason: collision with root package name */
    public final b1 f8293c;

    /* renamed from: d  reason: collision with root package name */
    public final f2 f8294d;

    /* renamed from: e  reason: collision with root package name */
    public final n0 f8295e;

    public k(n nVar, g0 g0Var) {
        j.f(g0Var, "scope");
        p0 a10 = b3.a(1, Integer.MAX_VALUE, e.f4020a);
        this.f8292b = a10;
        this.f8293c = new b1(a10, new j(this, (d<? super j>) null));
        f2 D = b.D(g0Var, (f.b) null, 2, new h(nVar, this, (d<? super h>) null), 1);
        D.k0(new i(this));
        m mVar = m.f8717a;
        this.f8294d = D;
        this.f8295e = new n0(new g(this, (d<? super g>) null));
    }
}
