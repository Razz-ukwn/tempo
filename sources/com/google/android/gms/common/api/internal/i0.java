package com.google.android.gms.common.api.internal;

import ag.c0;
import ag.k;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.i;
import ff.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import q7.a5;
import q7.a7;
import q7.c7;
import q7.f;
import q7.f2;
import q7.g2;
import q7.g3;
import q7.h3;
import q7.h4;
import q7.i4;
import q7.k4;
import q7.s2;
import q7.t6;
import q7.x3;
import q7.x5;
import u6.q;

public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4278a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4279b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4280c;

    public /* synthetic */ i0(int i8, Object obj, Object obj2) {
        this.f4278a = i8;
        this.f4279b = obj;
        this.f4280c = obj2;
    }

    public final void run() {
        String str;
        switch (this.f4278a) {
            case 0:
                i.b bVar = (i.b) this.f4280c;
                Object obj = ((i) this.f4279b).f4274b;
                if (obj == null) {
                    bVar.b();
                    return;
                }
                try {
                    bVar.a(obj);
                    return;
                } catch (RuntimeException e10) {
                    bVar.b();
                    throw e10;
                }
            case 1:
                h4 h4Var = (h4) this.f4280c;
                h4Var.f13101a.b();
                t6 t6Var = h4Var.f13101a;
                c7 c7Var = (c7) this.f4279b;
                t6Var.h().i();
                t6Var.f();
                q.f(c7Var.f12948a);
                t6Var.I(c7Var);
                return;
            case 2:
                a5 a5Var = (a5) this.f4279b;
                Bundle bundle = (Bundle) this.f4280c;
                k4 k4Var = a5Var.f13121a;
                if (bundle == null) {
                    g3 g3Var = ((x3) k4Var).D;
                    x3.j(g3Var);
                    g3Var.S.b(new Bundle());
                    return;
                }
                x3 x3Var = (x3) k4Var;
                g3 g3Var2 = x3Var.D;
                x3.j(g3Var2);
                Bundle a10 = g3Var2.S.a();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    i4 i4Var = a5Var.L;
                    int i8 = 100;
                    if (hasNext) {
                        String next = it.next();
                        Object obj2 = bundle.get(next);
                        if (obj2 != null && !(obj2 instanceof String) && !(obj2 instanceof Long) && !(obj2 instanceof Double)) {
                            a7 a7Var = x3Var.H;
                            x3.j(a7Var);
                            a7Var.getClass();
                            if (a7.T(obj2)) {
                                a7 a7Var2 = x3Var.H;
                                x3.j(a7Var2);
                                a7Var2.getClass();
                                a7.z(i4Var, (String) null, 27, (String) null, (String) null, 0);
                            }
                            s2 s2Var = x3Var.E;
                            x3.l(s2Var);
                            s2Var.G.d(next, obj2, "Invalid default event parameter type. Name, value");
                        } else if (a7.W(next)) {
                            s2 s2Var2 = x3Var.E;
                            x3.l(s2Var2);
                            s2Var2.G.c(next, "Invalid default event parameter name. Name");
                        } else if (obj2 == null) {
                            a10.remove(next);
                        } else {
                            a7 a7Var3 = x3Var.H;
                            x3.j(a7Var3);
                            if (a7Var3.O("param", next, 100, obj2)) {
                                a7 a7Var4 = x3Var.H;
                                x3.j(a7Var4);
                                a7Var4.A(a10, next, obj2);
                            }
                        }
                    } else {
                        x3.j(x3Var.H);
                        a7 a7Var5 = ((x3) x3Var.C.f13121a).H;
                        x3.j(a7Var5);
                        if (!a7Var5.V(201500000)) {
                            i8 = 25;
                        }
                        if (a10.size() > i8) {
                            Iterator it2 = new TreeSet(a10.keySet()).iterator();
                            int i10 = 0;
                            while (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                i10++;
                                if (i10 > i8) {
                                    a10.remove(str2);
                                }
                            }
                            a7 a7Var6 = x3Var.H;
                            x3.j(a7Var6);
                            a7Var6.getClass();
                            a7.z(i4Var, (String) null, 26, (String) null, (String) null, 0);
                            s2 s2Var3 = x3Var.E;
                            x3.l(s2Var3);
                            s2Var3.G.b("Too many default event parameters set. Discarding beyond event parameter limit");
                        }
                        g3 g3Var3 = x3Var.D;
                        x3.j(g3Var3);
                        g3Var3.S.b(a10);
                        x5 u7 = x3Var.u();
                        u7.i();
                        u7.j();
                        u7.u(new h3(2, u7, u7.r(false), a10));
                        return;
                    }
                }
                break;
            case 3:
                synchronized (((AtomicReference) this.f4279b)) {
                    try {
                        AtomicReference atomicReference = (AtomicReference) this.f4279b;
                        Object obj3 = this.f4280c;
                        f fVar = ((x3) ((a5) obj3).f13121a).C;
                        String n2 = ((x3) ((a5) obj3).f13121a).q().n();
                        f2 f2Var = g2.M;
                        if (n2 == null) {
                            fVar.getClass();
                            str = (String) f2Var.a((Object) null);
                        } else {
                            str = (String) f2Var.a(fVar.f12983c.f(n2, f2Var.f12988a));
                        }
                        atomicReference.set(str);
                        ((AtomicReference) this.f4279b).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f4279b).notify();
                        throw th;
                    }
                }
                return;
            case 4:
                ((a5) this.f4280c).z((Boolean) this.f4279b, true);
                return;
            case 5:
                t6 t6Var2 = (t6) this.f4279b;
                t6Var2.b();
                Runnable runnable = (Runnable) this.f4280c;
                t6Var2.h().i();
                if (t6Var2.L == null) {
                    t6Var2.L = new ArrayList();
                }
                t6Var2.L.add(runnable);
                t6Var2.t();
                return;
            default:
                ((k) this.f4280c).i((c0) this.f4279b, m.f8717a);
                return;
        }
    }

    public /* synthetic */ i0(Object obj, Object obj2, int i8) {
        this.f4278a = i8;
        this.f4280c = obj;
        this.f4279b = obj2;
    }

    public i0(t6 t6Var, Runnable runnable) {
        this.f4278a = 5;
        this.f4279b = t6Var;
        this.f4280c = runnable;
    }
}
