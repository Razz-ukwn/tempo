package r4;

import ag.b1;
import ag.i0;
import android.os.SystemClock;
import android.util.Log;
import f3.v;
import h5.i;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import l5.i;
import m5.a;
import p4.f;
import r4.c;
import r4.j;
import r4.r;
import t4.a;
import t4.e;
import t4.g;
import t4.h;

public final class n implements p, h.a, r.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f13933h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final v f13934a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f13935b;

    /* renamed from: c  reason: collision with root package name */
    public final h f13936c;

    /* renamed from: d  reason: collision with root package name */
    public final b f13937d;

    /* renamed from: e  reason: collision with root package name */
    public final z f13938e;

    /* renamed from: f  reason: collision with root package name */
    public final a f13939f;

    /* renamed from: g  reason: collision with root package name */
    public final c f13940g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.d f13941a;

        /* renamed from: b  reason: collision with root package name */
        public final a.c f13942b = m5.a.a(150, new C0262a());

        /* renamed from: c  reason: collision with root package name */
        public int f13943c;

        /* renamed from: r4.n$a$a  reason: collision with other inner class name */
        public class C0262a implements a.b<j<?>> {
            public C0262a() {
            }

            public final Object a() {
                a aVar = a.this;
                return new j(aVar.f13941a, aVar.f13942b);
            }
        }

        public a(c cVar) {
            this.f13941a = cVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final u4.a f13945a;

        /* renamed from: b  reason: collision with root package name */
        public final u4.a f13946b;

        /* renamed from: c  reason: collision with root package name */
        public final u4.a f13947c;

        /* renamed from: d  reason: collision with root package name */
        public final u4.a f13948d;

        /* renamed from: e  reason: collision with root package name */
        public final p f13949e;

        /* renamed from: f  reason: collision with root package name */
        public final r.a f13950f;

        /* renamed from: g  reason: collision with root package name */
        public final a.c f13951g = m5.a.a(150, new a());

        public class a implements a.b<o<?>> {
            public a() {
            }

            public final Object a() {
                b bVar = b.this;
                return new o(bVar.f13945a, bVar.f13946b, bVar.f13947c, bVar.f13948d, bVar.f13949e, bVar.f13950f, bVar.f13951g);
            }
        }

        public b(u4.a aVar, u4.a aVar2, u4.a aVar3, u4.a aVar4, p pVar, r.a aVar5) {
            this.f13945a = aVar;
            this.f13946b = aVar2;
            this.f13947c = aVar3;
            this.f13948d = aVar4;
            this.f13949e = pVar;
            this.f13950f = aVar5;
        }
    }

    public static class c implements j.d {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0284a f13953a;

        /* renamed from: b  reason: collision with root package name */
        public volatile t4.a f13954b;

        public c(a.C0284a aVar) {
            this.f13953a = aVar;
        }

        public final t4.a a() {
            if (this.f13954b == null) {
                synchronized (this) {
                    if (this.f13954b == null) {
                        t4.c cVar = (t4.c) this.f13953a;
                        e eVar = (e) cVar.f15347b;
                        File cacheDir = eVar.f15353a.getCacheDir();
                        t4.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = eVar.f15354b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                dVar = new t4.d(cacheDir, cVar.f15346a);
                            }
                        }
                        this.f13954b = dVar;
                    }
                    if (this.f13954b == null) {
                        this.f13954b = new cb.b();
                    }
                }
            }
            return this.f13954b;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final o<?> f13955a;

        /* renamed from: b  reason: collision with root package name */
        public final h5.h f13956b;

        public d(h5.h hVar, o<?> oVar) {
            this.f13956b = hVar;
            this.f13955a = oVar;
        }
    }

    public n(h hVar, a.C0284a aVar, u4.a aVar2, u4.a aVar3, u4.a aVar4, u4.a aVar5) {
        this.f13936c = hVar;
        c cVar = new c(aVar);
        c cVar2 = new c();
        this.f13940g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f13879d = this;
            }
        }
        this.f13935b = new i0();
        this.f13934a = new v();
        this.f13937d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f13939f = new a(cVar);
        this.f13938e = new z();
        ((g) hVar).f15355d = this;
    }

    public static void d(String str, long j10, f fVar) {
        StringBuilder b10 = d.a.b(str, " in ");
        b10.append(l5.h.a(j10));
        b10.append("ms, key: ");
        b10.append(fVar);
        Log.v("Engine", b10.toString());
    }

    public static void e(w wVar) {
        if (wVar instanceof r) {
            ((r) wVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final void a(f fVar, r<?> rVar) {
        c cVar = this.f13940g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f13877b.remove(fVar);
            if (aVar != null) {
                aVar.f13882c = null;
                aVar.clear();
            }
        }
        if (rVar.f13979a) {
            w wVar = (w) ((g) this.f13936c).d(fVar, rVar);
        } else {
            this.f13938e.a(rVar, false);
        }
    }

    public final d b(com.bumptech.glide.h hVar, Object obj, f fVar, int i8, int i10, Class cls, Class cls2, com.bumptech.glide.j jVar, m mVar, l5.b bVar, boolean z10, boolean z11, p4.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, h5.h hVar3, Executor executor) {
        long j10;
        if (f13933h) {
            int i11 = l5.h.f10997b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        this.f13935b.getClass();
        q qVar = new q(obj, fVar, i8, i10, bVar, cls, cls2, hVar2);
        synchronized (this) {
            try {
                r<?> c3 = c(qVar, z12, j11);
                if (c3 == null) {
                    d f10 = f(hVar, obj, fVar, i8, i10, cls, cls2, jVar, mVar, bVar, z10, z11, hVar2, z12, z13, z14, z15, hVar3, executor, qVar, j11);
                    return f10;
                }
                ((i) hVar3).n(c3, p4.a.f12450e, false);
                return null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final r<?> c(q qVar, boolean z10, long j10) {
        r<?> rVar;
        Y y10;
        if (!z10) {
            return null;
        }
        c cVar = this.f13940g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f13877b.get(qVar);
            if (aVar == null) {
                rVar = null;
            } else {
                rVar = (r) aVar.get();
                if (rVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (rVar != null) {
            rVar.b();
        }
        if (rVar != null) {
            if (f13933h) {
                d("Loaded resource from active resources", j10, qVar);
            }
            return rVar;
        }
        g gVar = (g) this.f13936c;
        synchronized (gVar) {
            i.a aVar2 = (i.a) gVar.f10998a.remove(qVar);
            if (aVar2 == null) {
                y10 = null;
            } else {
                gVar.f11000c -= (long) aVar2.f11002b;
                y10 = aVar2.f11001a;
            }
        }
        w wVar = (w) y10;
        r<?> rVar2 = wVar == null ? null : wVar instanceof r ? (r) wVar : new r<>(wVar, true, true, qVar, this);
        if (rVar2 != null) {
            rVar2.b();
            this.f13940g.a(qVar, rVar2);
        }
        if (rVar2 == null) {
            return null;
        }
        if (f13933h) {
            d("Loaded resource from cache", j10, qVar);
        }
        return rVar2;
    }

    public final d f(com.bumptech.glide.h hVar, Object obj, f fVar, int i8, int i10, Class cls, Class cls2, com.bumptech.glide.j jVar, m mVar, l5.b bVar, boolean z10, boolean z11, p4.h hVar2, boolean z12, boolean z13, boolean z14, boolean z15, h5.h hVar3, Executor executor, q qVar, long j10) {
        com.bumptech.glide.h hVar4 = hVar;
        Object obj2 = obj;
        f fVar2 = fVar;
        int i11 = i8;
        int i12 = i10;
        com.bumptech.glide.j jVar2 = jVar;
        m mVar2 = mVar;
        p4.h hVar5 = hVar2;
        boolean z16 = z15;
        h5.h hVar6 = hVar3;
        Executor executor2 = executor;
        q qVar2 = qVar;
        long j11 = j10;
        v vVar = this.f13934a;
        o oVar = (o) ((Map) (z16 ? vVar.f8517b : vVar.f8516a)).get(qVar2);
        if (oVar != null) {
            oVar.a(hVar6, executor2);
            if (f13933h) {
                d("Added to existing load", j11, qVar2);
            }
            return new d(hVar6, oVar);
        }
        o oVar2 = (o) this.f13937d.f13951g.b();
        b1.b(oVar2);
        synchronized (oVar2) {
            oVar2.H = qVar2;
            oVar2.I = z12;
            oVar2.J = z13;
            oVar2.K = z14;
            oVar2.L = z16;
        }
        a aVar = this.f13939f;
        j<R> jVar3 = (j) aVar.f13942b.b();
        b1.b(jVar3);
        int i13 = aVar.f13943c;
        aVar.f13943c = i13 + 1;
        i<R> iVar = jVar3.f13910a;
        iVar.f13895c = hVar4;
        iVar.f13896d = obj2;
        iVar.f13905n = fVar2;
        iVar.f13897e = i11;
        iVar.f13898f = i12;
        iVar.f13907p = mVar2;
        iVar.f13899g = cls;
        iVar.f13900h = jVar3.f13915d;
        iVar.f13903k = cls2;
        iVar.f13906o = jVar2;
        iVar.f13901i = hVar5;
        iVar.f13902j = bVar;
        iVar.f13908q = z10;
        iVar.f13909r = z11;
        jVar3.D = hVar4;
        jVar3.E = fVar2;
        jVar3.F = jVar2;
        jVar3.G = qVar2;
        jVar3.H = i11;
        jVar3.I = i12;
        jVar3.J = mVar2;
        jVar3.Q = z16;
        jVar3.K = hVar5;
        jVar3.L = oVar2;
        jVar3.M = i13;
        boolean z17 = true;
        jVar3.O = 1;
        jVar3.R = obj2;
        v vVar2 = this.f13934a;
        vVar2.getClass();
        ((Map) (oVar2.L ? vVar2.f8517b : vVar2.f8516a)).put(qVar2, oVar2);
        h5.h hVar7 = hVar3;
        oVar2.a(hVar7, executor);
        synchronized (oVar2) {
            oVar2.S = jVar3;
            int i14 = jVar3.i(1);
            if (i14 != 2) {
                if (i14 != 3) {
                    z17 = false;
                }
            }
            (z17 ? oVar2.C : oVar2.J ? oVar2.E : oVar2.K ? oVar2.F : oVar2.D).execute(jVar3);
        }
        if (f13933h) {
            d("Started new load", j10, qVar2);
        }
        return new d(hVar7, oVar2);
    }
}
