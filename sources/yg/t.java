package yg;

import androidx.appcompat.widget.a1;
import d2.f1;
import java.io.IOException;
import java.util.ArrayList;
import jg.a0;
import jg.c0;
import jg.d;
import jg.d0;
import jg.e;
import jg.e0;
import jg.o;
import jg.q;
import jg.r;
import jg.u;
import jg.x;
import sf.j;
import wg.h;
import wg.o;
import yg.z;

public final class t<T> implements b<T> {
    public d B;
    public Throwable C;
    public boolean D;

    /* renamed from: a  reason: collision with root package name */
    public final a0 f17501a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f17502b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f17503c;

    /* renamed from: d  reason: collision with root package name */
    public final f<d0, T> f17504d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f17505e;

    public class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f17506a;

        public a(d dVar) {
            this.f17506a = dVar;
        }

        public final void a(c0 c0Var) {
            d dVar = this.f17506a;
            t tVar = t.this;
            try {
                try {
                    dVar.a(tVar, tVar.f(c0Var));
                } catch (Throwable th) {
                    g0.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                g0.m(th2);
                th2.printStackTrace();
            }
        }

        public final void b(ng.d dVar, IOException iOException) {
            try {
                this.f17506a.b(t.this, iOException);
            } catch (Throwable th) {
                g0.m(th);
                th.printStackTrace();
            }
        }
    }

    public static final class b extends d0 {

        /* renamed from: b  reason: collision with root package name */
        public final d0 f17508b;

        /* renamed from: c  reason: collision with root package name */
        public final wg.c0 f17509c;

        /* renamed from: d  reason: collision with root package name */
        public IOException f17510d;

        public class a extends o {
            public a(h hVar) {
                super(hVar);
            }

            public final long a0(wg.e eVar, long j10) {
                try {
                    return super.a0(eVar, j10);
                } catch (IOException e10) {
                    b.this.f17510d = e10;
                    throw e10;
                }
            }
        }

        public b(d0 d0Var) {
            this.f17508b = d0Var;
            this.f17509c = f1.j(new a(d0Var.e()));
        }

        public final long c() {
            return this.f17508b.c();
        }

        public final void close() {
            this.f17508b.close();
        }

        public final jg.t d() {
            return this.f17508b.d();
        }

        public final h e() {
            return this.f17509c;
        }
    }

    public static final class c extends d0 {

        /* renamed from: b  reason: collision with root package name */
        public final jg.t f17512b;

        /* renamed from: c  reason: collision with root package name */
        public final long f17513c;

        public c(jg.t tVar, long j10) {
            this.f17512b = tVar;
            this.f17513c = j10;
        }

        public final long c() {
            return this.f17513c;
        }

        public final jg.t d() {
            return this.f17512b;
        }

        public final h e() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public t(a0 a0Var, Object[] objArr, d.a aVar, f<d0, T> fVar) {
        this.f17501a = a0Var;
        this.f17502b = objArr;
        this.f17503c = aVar;
        this.f17504d = fVar;
    }

    public final d a() {
        r rVar;
        r.a aVar;
        a0 a0Var = this.f17501a;
        a0Var.getClass();
        Object[] objArr = this.f17502b;
        int length = objArr.length;
        x<?>[] xVarArr = a0Var.f17419j;
        if (length == xVarArr.length) {
            z zVar = new z(a0Var.f17412c, a0Var.f17411b, a0Var.f17413d, a0Var.f17414e, a0Var.f17415f, a0Var.f17416g, a0Var.f17417h, a0Var.f17418i);
            if (a0Var.f17420k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i8 = 0; i8 < length; i8++) {
                arrayList.add(objArr[i8]);
                xVarArr[i8].a(zVar, objArr[i8]);
            }
            r.a aVar2 = zVar.f17565d;
            if (aVar2 != null) {
                rVar = aVar2.a();
            } else {
                String str = zVar.f17564c;
                r rVar2 = zVar.f17563b;
                rVar2.getClass();
                j.f(str, "link");
                try {
                    aVar = new r.a();
                    aVar.d(rVar2, str);
                } catch (IllegalArgumentException unused) {
                    aVar = null;
                }
                rVar = aVar == null ? null : aVar.a();
                if (rVar == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + rVar2 + ", Relative: " + zVar.f17564c);
                }
            }
            z.a aVar3 = zVar.f17572k;
            if (aVar3 == null) {
                o.a aVar4 = zVar.f17571j;
                if (aVar4 != null) {
                    aVar3 = new jg.o(aVar4.f10142b, aVar4.f10143c);
                } else {
                    u.a aVar5 = zVar.f17570i;
                    if (aVar5 != null) {
                        aVar3 = aVar5.b();
                    } else if (zVar.f17569h) {
                        long j10 = (long) 0;
                        kg.b.c(j10, j10, j10);
                        aVar3 = new a0((jg.t) null, new byte[0], 0, 0);
                    }
                }
            }
            jg.t tVar = zVar.f17568g;
            q.a aVar6 = zVar.f17567f;
            if (tVar != null) {
                if (aVar3 != null) {
                    aVar3 = new z.a(aVar3, tVar);
                } else {
                    aVar6.a("Content-Type", tVar.f10173a);
                }
            }
            x.a aVar7 = zVar.f17566e;
            aVar7.getClass();
            aVar7.f10225a = rVar;
            aVar7.f10227c = aVar6.c().d();
            aVar7.d(zVar.f17562a, aVar3);
            aVar7.e(l.class, new l(a0Var.f17410a, arrayList));
            ng.d a10 = this.f17503c.a(aVar7.a());
            if (a10 != null) {
                return a10;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(b3.x.b(a1.b("Argument count (", length, ") doesn't match expected count ("), xVarArr.length, ")"));
    }

    public final d b() {
        d dVar = this.B;
        if (dVar != null) {
            return dVar;
        }
        Throwable th = this.C;
        if (th == null) {
            try {
                d a10 = a();
                this.B = a10;
                return a10;
            } catch (IOException | Error | RuntimeException e10) {
                g0.m(e10);
                this.C = e10;
                throw e10;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public final boolean c() {
        boolean z10 = true;
        if (this.f17505e) {
            return true;
        }
        synchronized (this) {
            d dVar = this.B;
            if (dVar == null || !dVar.c()) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void cancel() {
        d dVar;
        this.f17505e = true;
        synchronized (this) {
            dVar = this.B;
        }
        if (dVar != null) {
            dVar.cancel();
        }
    }

    public final Object clone() {
        return new t(this.f17501a, this.f17502b, this.f17503c, this.f17504d);
    }

    public final synchronized x d() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().d();
    }

    public final void e(d<T> dVar) {
        d dVar2;
        Throwable th;
        synchronized (this) {
            if (!this.D) {
                this.D = true;
                dVar2 = this.B;
                th = this.C;
                if (dVar2 == null && th == null) {
                    try {
                        d a10 = a();
                        this.B = a10;
                        dVar2 = a10;
                    } catch (Throwable th2) {
                        th = th2;
                        g0.m(th);
                        this.C = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.b(this, th);
            return;
        }
        if (this.f17505e) {
            dVar2.cancel();
        }
        dVar2.s(new a(dVar));
    }

    public final b0<T> f(c0 c0Var) {
        c0.a aVar = new c0.a(c0Var);
        d0 d0Var = c0Var.C;
        aVar.f10062g = new c(d0Var.d(), d0Var.c());
        c0 a10 = aVar.a();
        int i8 = a10.f10054d;
        if (i8 < 200 || i8 >= 300) {
            try {
                wg.e eVar = new wg.e();
                d0Var.e().r(eVar);
                e0 e0Var = new e0(d0Var.d(), d0Var.c(), eVar);
                if (!a10.e()) {
                    return new b0<>(a10, (Object) null, e0Var);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                d0Var.close();
            }
        } else if (i8 == 204 || i8 == 205) {
            d0Var.close();
            if (a10.e()) {
                return new b0<>(a10, (Object) null, (e0) null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } else {
            b bVar = new b(d0Var);
            try {
                T a11 = this.f17504d.a(bVar);
                if (a10.e()) {
                    return new b0<>(a10, a11, (e0) null);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            } catch (RuntimeException e10) {
                IOException iOException = bVar.f17510d;
                if (iOException == null) {
                    throw e10;
                }
                throw iOException;
            }
        }
    }

    /* renamed from: clone  reason: collision with other method in class */
    public final b m22clone() {
        return new t(this.f17501a, this.f17502b, this.f17503c, this.f17504d);
    }
}
