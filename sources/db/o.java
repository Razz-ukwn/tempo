package db;

import ab.a0;
import ab.b0;
import ab.i;
import ab.m;
import ab.t;
import hb.b;
import java.lang.reflect.Type;

public final class o<T> extends a0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final t<T> f7451a;

    /* renamed from: b  reason: collision with root package name */
    public final m<T> f7452b;

    /* renamed from: c  reason: collision with root package name */
    public final i f7453c;

    /* renamed from: d  reason: collision with root package name */
    public final gb.a<T> f7454d;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f7455e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile a0<T> f7456f;

    public final class a {
    }

    public o(t tVar, m mVar, i iVar, gb.a aVar) {
        new a();
        this.f7451a = tVar;
        this.f7452b = mVar;
        this.f7453c = iVar;
        this.f7454d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new ab.u((java.lang.Exception) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw new ab.o((java.lang.Exception) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw new ab.u((java.lang.Exception) r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ExcHandler: NumberFormatException (r4v12 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[ExcHandler: IOException (r4v11 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[ExcHandler: c (r4v10 'e' hb.c A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T a(hb.a r4) {
        /*
            r3 = this;
            ab.m<T> r0 = r3.f7452b
            if (r0 != 0) goto L_0x001a
            ab.a0<T> r0 = r3.f7456f
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            ab.i r0 = r3.f7453c
            ab.b0 r1 = r3.f7455e
            gb.a<T> r2 = r3.f7454d
            ab.a0 r0 = r0.d(r1, r2)
            r3.f7456f = r0
        L_0x0015:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L_0x001a:
            r4.k0()     // Catch:{ EOFException -> 0x003e, c -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            db.q$t r1 = db.q.f7484z     // Catch:{ EOFException -> 0x0026, c -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            java.lang.Object r4 = r1.a(r4)     // Catch:{ EOFException -> 0x0026, c -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            ab.n r4 = (ab.n) r4     // Catch:{ EOFException -> 0x0026, c -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            goto L_0x0044
        L_0x0026:
            r4 = move-exception
            r1 = 0
            goto L_0x0040
        L_0x0029:
            r4 = move-exception
            ab.u r0 = new ab.u
            r0.<init>((java.lang.Exception) r4)
            throw r0
        L_0x0030:
            r4 = move-exception
            ab.o r0 = new ab.o
            r0.<init>((java.lang.Exception) r4)
            throw r0
        L_0x0037:
            r4 = move-exception
            ab.u r0 = new ab.u
            r0.<init>((java.lang.Exception) r4)
            throw r0
        L_0x003e:
            r4 = move-exception
            r1 = 1
        L_0x0040:
            if (r1 == 0) goto L_0x0056
            ab.p r4 = ab.p.f274a
        L_0x0044:
            r4.getClass()
            boolean r4 = r4 instanceof ab.p
            if (r4 == 0) goto L_0x004d
            r4 = 0
            return r4
        L_0x004d:
            gb.a<T> r4 = r3.f7454d
            java.lang.reflect.Type r4 = r4.f8929b
            java.lang.Object r4 = r0.a()
            return r4
        L_0x0056:
            ab.u r0 = new ab.u
            r0.<init>((java.lang.Exception) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: db.o.a(hb.a):java.lang.Object");
    }

    public final void b(b bVar, T t2) {
        t<T> tVar = this.f7451a;
        if (tVar == null) {
            a0<T> a0Var = this.f7456f;
            if (a0Var == null) {
                a0Var = this.f7453c.d(this.f7455e, this.f7454d);
                this.f7456f = a0Var;
            }
            a0Var.b(bVar, t2);
        } else if (t2 == null) {
            bVar.z();
        } else {
            Type type = this.f7454d.f8929b;
            q.f7484z.b(bVar, tVar.a());
        }
    }
}
