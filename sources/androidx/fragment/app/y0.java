package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q;
import java.util.LinkedHashMap;
import l3.a;
import l3.b;
import x2.c;

public final class y0 implements h, b, p0 {

    /* renamed from: a  reason: collision with root package name */
    public final p f2169a;

    /* renamed from: b  reason: collision with root package name */
    public final o0 f2170b;

    /* renamed from: c  reason: collision with root package name */
    public m0.b f2171c;

    /* renamed from: d  reason: collision with root package name */
    public q f2172d = null;

    /* renamed from: e  reason: collision with root package name */
    public a f2173e = null;

    public y0(p pVar, o0 o0Var) {
        this.f2169a = pVar;
        this.f2170b = o0Var;
    }

    public final void a(j.a aVar) {
        this.f2172d.f(aVar);
    }

    public final j b() {
        c();
        return this.f2172d;
    }

    public final void c() {
        if (this.f2172d == null) {
            this.f2172d = new q(this);
            a aVar = new a(this);
            this.f2173e = aVar;
            aVar.a();
            c0.b(this);
        }
    }

    public final m0.b k() {
        Application application;
        p pVar = this.f2169a;
        m0.b k10 = pVar.k();
        if (!k10.equals(pVar.f2078o0)) {
            this.f2171c = k10;
            return k10;
        }
        if (this.f2171c == null) {
            Context applicationContext = pVar.e0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f2171c = new f0(application, this, pVar.C);
        }
        return this.f2171c;
    }

    public final x2.a l() {
        Application application;
        p pVar = this.f2169a;
        Context applicationContext = pVar.e0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        c cVar = new c(0);
        LinkedHashMap linkedHashMap = cVar.f16911a;
        if (application != null) {
            linkedHashMap.put(l0.f2292a, application);
        }
        linkedHashMap.put(c0.f2254a, this);
        linkedHashMap.put(c0.f2255b, this);
        Bundle bundle = pVar.C;
        if (bundle != null) {
            linkedHashMap.put(c0.f2256c, bundle);
        }
        return cVar;
    }

    public final o0 s() {
        c();
        return this.f2170b;
    }

    public final androidx.savedstate.a w() {
        c();
        return this.f2173e.f10968b;
    }
}
