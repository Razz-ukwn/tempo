package i6;

import a6.h;
import d6.j;
import d6.w;
import e6.e;
import j6.r;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k6.d;
import l6.b;

public final class c implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f9600f = Logger.getLogger(w.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final r f9601a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f9602b;

    /* renamed from: c  reason: collision with root package name */
    public final e f9603c;

    /* renamed from: d  reason: collision with root package name */
    public final d f9604d;

    /* renamed from: e  reason: collision with root package name */
    public final b f9605e;

    public c(Executor executor, e eVar, r rVar, d dVar, b bVar) {
        this.f9602b = executor;
        this.f9603c = eVar;
        this.f9601a = rVar;
        this.f9604d = dVar;
        this.f9605e = bVar;
    }

    public final void a(h hVar, d6.h hVar2, j jVar) {
        this.f9602b.execute(new a(this, jVar, hVar, hVar2));
    }
}
