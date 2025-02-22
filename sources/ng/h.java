package ng;

import ff.m;
import java.net.Socket;
import java.util.Iterator;
import kg.b;
import mg.a;
import sf.j;

public final class h extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f11977e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str) {
        super(str, true);
        this.f11977e = iVar;
    }

    public final long a() {
        i iVar = this.f11977e;
        long nanoTime = System.nanoTime();
        Iterator<e> it = iVar.f11982e.iterator();
        int i8 = 0;
        long j10 = Long.MIN_VALUE;
        e eVar = null;
        int i10 = 0;
        while (it.hasNext()) {
            e next = it.next();
            j.e(next, "connection");
            synchronized (next) {
                if (iVar.b(next, nanoTime) > 0) {
                    i10++;
                } else {
                    i8++;
                    long j11 = nanoTime - next.f11971q;
                    if (j11 > j10) {
                        eVar = next;
                        j10 = j11;
                    }
                    m mVar = m.f8717a;
                }
            }
        }
        long j12 = iVar.f11979b;
        if (j10 >= j12 || i8 > iVar.f11978a) {
            j.c(eVar);
            synchronized (eVar) {
                if (!(!eVar.f11970p.isEmpty())) {
                    if (eVar.f11971q + j10 == nanoTime) {
                        eVar.f11965j = true;
                        iVar.f11982e.remove(eVar);
                        Socket socket = eVar.f11959d;
                        j.c(socket);
                        b.e(socket);
                        if (iVar.f11982e.isEmpty()) {
                            iVar.f11980c.a();
                        }
                    }
                }
            }
            return 0;
        } else if (i8 > 0) {
            return j12 - j10;
        } else {
            if (i10 > 0) {
                return j12;
            }
            return -1;
        }
    }
}
