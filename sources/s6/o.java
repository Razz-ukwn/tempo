package s6;

import ag.m;
import android.content.ComponentName;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import q7.a3;
import q7.a5;
import q7.b;
import q7.c7;
import q7.d3;
import q7.f;
import q7.g2;
import q7.h4;
import q7.j3;
import q7.k;
import q7.l6;
import q7.r3;
import q7.s2;
import q7.t6;
import q7.w5;
import q7.x3;
import q7.x5;
import q7.y2;
import q7.z5;
import u6.q;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14775a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14776b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14777c;

    public /* synthetic */ o(int i8, Object obj, Object obj2) {
        this.f14775a = i8;
        this.f14777c = obj;
        this.f14776b = obj2;
    }

    public final void run() {
        switch (this.f14775a) {
            case 0:
                p pVar = (p) this.f14776b;
                int i8 = ((r) this.f14777c).f14784a;
                synchronized (pVar) {
                    r rVar = pVar.f14782e.get(i8);
                    if (rVar != null) {
                        StringBuilder sb2 = new StringBuilder(31);
                        sb2.append("Timing out request: ");
                        sb2.append(i8);
                        Log.w("MessengerIpcClient", sb2.toString());
                        pVar.f14782e.remove(i8);
                        rVar.c(new s("Timed out waiting for response", (SecurityException) null));
                        pVar.c();
                    }
                }
                return;
            case 2:
                h4 h4Var = (h4) this.f14777c;
                h4Var.f13101a.b();
                h4Var.f13101a.m((c7) this.f14776b);
                return;
            case 3:
                synchronized (((AtomicReference) this.f14776b)) {
                    try {
                        Object obj = this.f14777c;
                        ((AtomicReference) this.f14776b).set(Long.valueOf(((x3) ((a5) obj).f13121a).C.o(((x3) ((a5) obj).f13121a).q().n(), g2.N)));
                        ((AtomicReference) this.f14776b).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f14776b).notify();
                        throw th;
                    }
                }
                return;
            case 4:
                x5.v(((w5) this.f14777c).f13408c, (ComponentName) this.f14776b);
                return;
            default:
                t6 t6Var = (t6) this.f14777c;
                t6Var.h().i();
                t6Var.G = new j3(t6Var);
                k kVar = new k(t6Var);
                kVar.k();
                t6Var.f13350c = kVar;
                f J = t6Var.J();
                r3 r3Var = t6Var.f13347a;
                q.i(r3Var);
                J.f12983c = r3Var;
                z5 z5Var = new z5(t6Var);
                z5Var.k();
                t6Var.E = z5Var;
                b bVar = new b(t6Var);
                bVar.k();
                t6Var.B = bVar;
                y2 y2Var = new y2(t6Var, 1);
                y2Var.k();
                t6Var.D = y2Var;
                l6 l6Var = new l6(t6Var);
                l6Var.k();
                t6Var.f13352e = l6Var;
                t6Var.f13351d = new a3(t6Var);
                if (t6Var.M != t6Var.N) {
                    s2 e10 = t6Var.e();
                    e10.B.d(Integer.valueOf(t6Var.M), Integer.valueOf(t6Var.N), "Not all upload components initialized");
                }
                t6Var.I = true;
                t6Var.h().i();
                k kVar2 = t6Var.f13350c;
                t6.H(kVar2);
                kVar2.R();
                if (t6Var.E.C.a() == 0) {
                    d3 d3Var = t6Var.E.C;
                    ((m) t6Var.a()).getClass();
                    d3Var.b(System.currentTimeMillis());
                }
                t6Var.C();
                return;
        }
    }

    public /* synthetic */ o(p pVar, r rVar) {
        this.f14775a = 0;
        this.f14776b = pVar;
        this.f14777c = rVar;
    }
}
