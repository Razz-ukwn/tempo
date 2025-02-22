package ng;

import ff.m;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import jg.a;
import jg.f0;
import kg.b;
import mg.c;
import mg.d;
import ng.d;
import rg.h;
import sf.j;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f11978a = 5;

    /* renamed from: b  reason: collision with root package name */
    public final long f11979b;

    /* renamed from: c  reason: collision with root package name */
    public final c f11980c;

    /* renamed from: d  reason: collision with root package name */
    public final h f11981d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentLinkedQueue<e> f11982e;

    public i(d dVar, TimeUnit timeUnit) {
        j.f(dVar, "taskRunner");
        j.f(timeUnit, "timeUnit");
        this.f11979b = timeUnit.toNanos(5);
        this.f11980c = dVar.f();
        this.f11981d = new h(this, j.k(" ConnectionPool", b.f10480g));
        this.f11982e = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(a aVar, d dVar, List<f0> list, boolean z10) {
        j.f(aVar, "address");
        j.f(dVar, "call");
        Iterator<e> it = this.f11982e.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                return false;
            }
            e next = it.next();
            j.e(next, "connection");
            synchronized (next) {
                if (z10) {
                    if (next.f11962g != null) {
                        z11 = true;
                    }
                    if (!z11) {
                        m mVar = m.f8717a;
                    }
                }
                if (next.h(aVar, list)) {
                    dVar.b(next);
                    return true;
                }
                m mVar2 = m.f8717a;
            }
        }
    }

    public final int b(e eVar, long j10) {
        byte[] bArr = b.f10474a;
        ArrayList arrayList = eVar.f11970p;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i8);
            if (reference.get() != null) {
                i8++;
            } else {
                h hVar = h.f14273a;
                h.f14273a.k(((d.b) reference).f11955a, "A connection to " + eVar.f11957b.f10079a.f10023i + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i8);
                eVar.f11965j = true;
                if (arrayList.isEmpty()) {
                    eVar.f11971q = j10 - this.f11979b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
