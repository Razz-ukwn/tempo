package z3;

import wg.i;
import wg.l;
import wg.u;
import wg.z;
import z3.a;
import z3.b;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final l f17716a;

    /* renamed from: b  reason: collision with root package name */
    public final b f17717b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b.a f17718a;

        public a(b.a aVar) {
            this.f17718a = aVar;
        }

        public final void a() {
            this.f17718a.a(false);
        }

        public final b b() {
            b.c j10;
            b.a aVar = this.f17718a;
            b bVar = b.this;
            synchronized (bVar) {
                aVar.a(true);
                j10 = bVar.j(aVar.f17696a.f17700a);
            }
            if (j10 != null) {
                return new b(j10);
            }
            return null;
        }

        public final z c() {
            return this.f17718a.b(1);
        }

        public final z d() {
            return this.f17718a.b(0);
        }
    }

    public static final class b implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final b.c f17719a;

        public b(b.c cVar) {
            this.f17719a = cVar;
        }

        public final z E() {
            return this.f17719a.c(0);
        }

        public final a V() {
            b.a e10;
            b.c cVar = this.f17719a;
            b bVar = b.this;
            synchronized (bVar) {
                cVar.close();
                e10 = bVar.e(cVar.f17709a.f17700a);
            }
            if (e10 != null) {
                return new a(e10);
            }
            return null;
        }

        public final void close() {
            this.f17719a.close();
        }

        public final z getData() {
            return this.f17719a.c(1);
        }
    }

    public f(long j10, z zVar, u uVar, kotlinx.coroutines.scheduling.b bVar) {
        this.f17716a = uVar;
        this.f17717b = new b(uVar, zVar, bVar, j10);
    }

    public final b a(String str) {
        i iVar = i.f16760d;
        b.c j10 = this.f17717b.j(i.a.b(str).c("SHA-256").e());
        if (j10 != null) {
            return new b(j10);
        }
        return null;
    }

    public final a b(String str) {
        i iVar = i.f16760d;
        b.a e10 = this.f17717b.e(i.a.b(str).c("SHA-256").e());
        if (e10 != null) {
            return new a(e10);
        }
        return null;
    }

    public final l getFileSystem() {
        return this.f17716a;
    }
}
