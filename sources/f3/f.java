package f3;

import ag.c0;
import ag.f2;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.p;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.l0;
import pd.j;

public final class f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final k.e<T> f8177a;

    /* renamed from: b  reason: collision with root package name */
    public final p f8178b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f8179c;

    /* renamed from: d  reason: collision with root package name */
    public final e f8180d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8181e;

    /* renamed from: f  reason: collision with root package name */
    public final d f8182f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicInteger f8183g = new AtomicInteger(0);

    /* renamed from: h  reason: collision with root package name */
    public final d0 f8184h;

    /* renamed from: i  reason: collision with root package name */
    public final l0 f8185i;

    public f(j.a aVar, b bVar, c0 c0Var, c0 c0Var2) {
        sf.j.f(aVar, "diffCallback");
        this.f8177a = aVar;
        this.f8178b = bVar;
        this.f8179c = c0Var2;
        e eVar = new e(this);
        this.f8180d = eVar;
        d dVar = new d(this, eVar, c0Var);
        this.f8182f = dVar;
        this.f8184h = dVar.f8175k;
        this.f8185i = new l0(dVar.f8176l, (f2) null);
    }
}
