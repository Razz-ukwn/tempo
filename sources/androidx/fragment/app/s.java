package androidx.fragment.app;

import androidx.activity.result.b;
import androidx.activity.result.h;
import androidx.fragment.app.p;
import java.util.concurrent.atomic.AtomicReference;
import l.a;

public final class s extends p.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f2133a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2134b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.a f2135c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f2136d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f2137e;

    public s(p pVar, r rVar, AtomicReference atomicReference, c.a aVar, b bVar) {
        this.f2137e = pVar;
        this.f2133a = rVar;
        this.f2134b = atomicReference;
        this.f2135c = aVar;
        this.f2136d = bVar;
    }

    public final void a() {
        StringBuilder sb2 = new StringBuilder("fragment_");
        p pVar = this.f2137e;
        sb2.append(pVar.B);
        sb2.append("_rq#");
        sb2.append(pVar.f2081r0.getAndIncrement());
        String sb3 = sb2.toString();
        r rVar = (r) this.f2133a;
        rVar.getClass();
        p pVar2 = rVar.f2130a;
        c0<?> c0Var = pVar2.Q;
        this.f2134b.set((c0Var instanceof h ? ((h) c0Var).q() : pVar2.d0().H).c(sb3, pVar, this.f2135c, this.f2136d));
    }
}
