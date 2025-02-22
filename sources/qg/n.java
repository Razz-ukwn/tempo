package qg;

import ff.m;
import gc.b;
import mg.a;
import sf.j;

public final class n extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f13695e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f13696f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f13697g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(String str, f fVar, int i8, b bVar) {
        super(str, true);
        this.f13695e = fVar;
        this.f13696f = i8;
        this.f13697g = bVar;
    }

    public final long a() {
        b bVar = this.f13695e.H;
        b bVar2 = this.f13697g;
        bVar.getClass();
        j.f(bVar2, "errorCode");
        synchronized (this.f13695e) {
            this.f13695e.W.remove(Integer.valueOf(this.f13696f));
            m mVar = m.f8717a;
        }
        return -1;
    }
}
