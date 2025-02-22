package com.google.android.gms.internal.measurement;

import b3.w;
import j1.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final o2 f5435a;

    /* renamed from: b  reason: collision with root package name */
    public c f5436b;

    /* renamed from: c  reason: collision with root package name */
    public final w f5437c = new w();

    /* renamed from: d  reason: collision with root package name */
    public final od f5438d = new od();

    public o0() {
        o2 o2Var = new o2();
        this.f5435a = o2Var;
        this.f5436b = o2Var.f5441b.l();
        a aVar = new a(this);
        q5 q5Var = o2Var.f5443d;
        q5Var.f5482a.put("internal.registerCallback", aVar);
        q5Var.f5482a.put("internal.eventLogger", new y(this));
    }

    public final void a(b4 b4Var) {
        i iVar;
        o2 o2Var = this.f5435a;
        try {
            this.f5436b = o2Var.f5441b.l();
            if (!(o2Var.a(this.f5436b, (d4[]) b4Var.v().toArray(new d4[0])) instanceof g)) {
                for (a4 a4Var : b4Var.t().w()) {
                    l7 v3 = a4Var.v();
                    String u7 = a4Var.u();
                    Iterator it = v3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            o a10 = o2Var.a(this.f5436b, (d4) it.next());
                            if (a10 instanceof l) {
                                c cVar = this.f5436b;
                                if (!cVar.r(u7)) {
                                    iVar = null;
                                } else {
                                    o o10 = cVar.o(u7);
                                    if (o10 instanceof i) {
                                        iVar = (i) o10;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(u7)));
                                    }
                                }
                                if (iVar != null) {
                                    iVar.e(this.f5436b, Collections.singletonList(a10));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(u7)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new i1(th);
        }
    }

    public final boolean b(b bVar) {
        w wVar = this.f5437c;
        try {
            wVar.f3197b = bVar;
            wVar.f3198c = bVar.clone();
            ((List) wVar.f3199d).clear();
            this.f5435a.f5442c.q("runtime.counter", new h(Double.valueOf(0.0d)));
            this.f5438d.a(this.f5436b.l(), wVar);
            return (((b) wVar.f3198c).equals((b) wVar.f3197b) ^ true) || (((List) wVar.f3199d).isEmpty() ^ true);
        } catch (Throwable th) {
            throw new i1(th);
        }
    }
}
