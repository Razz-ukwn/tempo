package q7;

import ag.m;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.common.api.internal.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import s6.n;
import s6.o;
import t6.i;
import t6.j;
import u6.q;
import z6.g;

public final class h4 extends i2 {

    /* renamed from: a  reason: collision with root package name */
    public final t6 f13101a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f13102b;

    /* renamed from: c  reason: collision with root package name */
    public String f13103c = null;

    public h4(t6 t6Var) {
        q.i(t6Var);
        this.f13101a = t6Var;
    }

    public final void D(Bundle bundle, c7 c7Var) {
        L(c7Var);
        String str = c7Var.f12948a;
        q.i(str);
        c(new y3(this, str, bundle, 0));
    }

    public final String G(c7 c7Var) {
        L(c7Var);
        t6 t6Var = this.f13101a;
        try {
            return (String) t6Var.h().o(new q6(t6Var, c7Var)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            s2 e11 = t6Var.e();
            e11.B.d(s2.r(c7Var.f12948a), e10, "Failed to get app instance id. appId");
            return null;
        }
    }

    public final void H(c7 c7Var) {
        q.f(c7Var.f12948a);
        M(c7Var.f12948a, false);
        c(new z3(1, this, c7Var));
    }

    public final void L(c7 c7Var) {
        q.i(c7Var);
        String str = c7Var.f12948a;
        q.f(str);
        M(str, false);
        this.f13101a.P().J(c7Var.f12949b, c7Var.M);
    }

    public final void M(String str, boolean z10) {
        boolean z11;
        boolean isEmpty = TextUtils.isEmpty(str);
        t6 t6Var = this.f13101a;
        if (!isEmpty) {
            if (z10) {
                try {
                    if (this.f13102b == null) {
                        if (!"com.google.android.gms".equals(this.f13103c) && !g.a(t6Var.H.f13419a, Binder.getCallingUid())) {
                            if (!j.a(t6Var.H.f13419a).b(Binder.getCallingUid())) {
                                z11 = false;
                                this.f13102b = Boolean.valueOf(z11);
                            }
                        }
                        z11 = true;
                        this.f13102b = Boolean.valueOf(z11);
                    }
                    if (this.f13102b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    t6Var.e().B.c(s2.r(str), "Measurement Service called with invalid calling package. appId");
                    throw e10;
                }
            }
            if (this.f13103c == null) {
                Context context = t6Var.H.f13419a;
                int callingUid = Binder.getCallingUid();
                AtomicBoolean atomicBoolean = i.f15402a;
                if (g.b(callingUid, context, str)) {
                    this.f13103c = str;
                }
            }
            if (!str.equals(this.f13103c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        t6Var.e().B.b("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void b(s sVar, c7 c7Var) {
        t6 t6Var = this.f13101a;
        t6Var.b();
        t6Var.i(sVar, c7Var);
    }

    public final void c(Runnable runnable) {
        t6 t6Var = this.f13101a;
        if (t6Var.h().s()) {
            runnable.run();
        } else {
            t6Var.h().q(runnable);
        }
    }

    public final List d(String str, String str2, String str3, boolean z10) {
        M(str, true);
        t6 t6Var = this.f13101a;
        try {
            List<y6> list = (List) t6Var.h().o(new b4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (y6 y6Var : list) {
                if (z10 || !a7.W(y6Var.f13452c)) {
                    arrayList.add(new w6(y6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            s2 e11 = t6Var.e();
            e11.B.d(s2.r(str), e10, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }

    public final void e(w6 w6Var, c7 c7Var) {
        q.i(w6Var);
        L(c7Var);
        c(new h3(1, this, w6Var, c7Var));
    }

    public final void g(c7 c7Var) {
        q.f(c7Var.f12948a);
        q.i(c7Var.R);
        n nVar = new n((Object) this, (Object) c7Var, 4);
        t6 t6Var = this.f13101a;
        if (t6Var.h().s()) {
            nVar.run();
        } else {
            t6Var.h().r(nVar);
        }
    }

    public final List m(String str, String str2, boolean z10, c7 c7Var) {
        L(c7Var);
        String str3 = c7Var.f12948a;
        q.i(str3);
        t6 t6Var = this.f13101a;
        try {
            List<y6> list = (List) t6Var.h().o(new a4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (y6 y6Var : list) {
                if (z10 || !a7.W(y6Var.f13452c)) {
                    arrayList.add(new w6(y6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            s2 e11 = t6Var.e();
            e11.B.d(s2.r(str3), e10, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    public final void n(s sVar, c7 c7Var) {
        q.i(sVar);
        L(c7Var);
        c(new y3(this, sVar, c7Var, 1));
    }

    public final List o(String str, String str2, String str3) {
        M(str, true);
        t6 t6Var = this.f13101a;
        try {
            return (List) t6Var.h().o(new d4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            t6Var.e().B.c(e10, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    public final void r(c cVar, c7 c7Var) {
        q.i(cVar);
        q.i(cVar.f12928c);
        L(c7Var);
        c cVar2 = new c(cVar);
        cVar2.f12926a = c7Var.f12948a;
        c(new g1(1, this, cVar2, c7Var));
    }

    public final byte[] s(s sVar, String str) {
        q.f(str);
        q.i(sVar);
        M(str, true);
        t6 t6Var = this.f13101a;
        s2 e10 = t6Var.e();
        x3 x3Var = t6Var.H;
        n2 n2Var = x3Var.I;
        String str2 = sVar.f13311a;
        e10.I.c(n2Var.d(str2), "Log and bundle. event");
        ((m) t6Var.a()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        w3 h3 = t6Var.h();
        e4 e4Var = new e4(this, sVar, str);
        h3.k();
        u3 u3Var = new u3(h3, e4Var, true);
        if (Thread.currentThread() == h3.f13398c) {
            u3Var.run();
        } else {
            h3.t(u3Var);
        }
        try {
            byte[] bArr = (byte[]) u3Var.get();
            if (bArr == null) {
                t6Var.e().B.c(s2.r(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((m) t6Var.a()).getClass();
            t6Var.e().I.e("Log and bundle processed. event, size, time_ms", x3Var.I.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e11) {
            s2 e12 = t6Var.e();
            e12.B.e("Failed to log and bundle. appId, event, error", s2.r(str), x3Var.I.d(str2), e11);
            return null;
        }
    }

    public final List t(String str, String str2, c7 c7Var) {
        L(c7Var);
        String str3 = c7Var.f12948a;
        q.i(str3);
        t6 t6Var = this.f13101a;
        try {
            return (List) t6Var.h().o(new c4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            t6Var.e().B.c(e10, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    public final void v(c7 c7Var) {
        L(c7Var);
        c(new o(2, this, c7Var));
    }

    public final void x(c7 c7Var) {
        L(c7Var);
        c(new i0((Object) this, (Object) c7Var, 1));
    }

    public final void z(long j10, String str, String str2, String str3) {
        c(new g4(this, str2, str3, str, j10));
    }
}
