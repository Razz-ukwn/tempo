package com.quickkonnect.silencio.ui.menu.history;

import ag.g0;
import android.app.Application;
import androidx.compose.ui.platform.b3;
import androidx.lifecycle.v;
import cg.e;
import com.quickkonnect.silencio.models.response.menu.AudioHistory;
import com.quickkonnect.silencio.models.response.menu.MeasurementResponse;
import f3.d0;
import f3.f0;
import f3.f2;
import f3.l;
import f3.m;
import f3.n;
import f3.p;
import f3.r2;
import f3.u1;
import f3.v1;
import f3.w1;
import f3.x1;
import f3.z0;
import gc.b;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.l0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.p0;
import kotlinx.coroutines.flow.t0;
import kotlinx.coroutines.flow.v0;
import mc.c;
import s6.u;
import sf.j;
import sf.k;
import zd.g;

public final class HistoryViewModel extends zd.a {

    /* renamed from: g  reason: collision with root package name */
    public final c f7074g;

    /* renamed from: h  reason: collision with root package name */
    public final v<g<MeasurementResponse>> f7075h = new v<>();

    /* renamed from: i  reason: collision with root package name */
    public final l0 f7076i;

    public static final class a extends k implements rf.a<f2<Integer, AudioHistory>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HistoryViewModel f7077a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HistoryViewModel historyViewModel) {
            super(0);
            this.f7077a = historyViewModel;
        }

        public final Object d() {
            return new pd.k(this.f7077a.f7074g);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistoryViewModel(Application application, c cVar) {
        super(application);
        j.f(cVar, "menuDataSource");
        this.f7074g = cVar;
        w1 w1Var = new w1();
        a aVar = new a(this);
        z0 z0Var = new z0(aVar instanceof r2 ? new u1(aVar) : new v1(aVar, (d<? super v1>) null), (Object) null, w1Var);
        g0 o10 = b.o(this);
        f<x1<Value>> fVar = z0Var.f8568f;
        j.f(fVar, "<this>");
        f<R> a10 = f0.a(fVar, new m((d) null, o10));
        n nVar = new n((d<? super n>) null);
        j.f(a10, "<this>");
        kotlinx.coroutines.flow.n nVar2 = new kotlinx.coroutines.flow.n(new o(new f3.o((d) null), new l(new n0(new d0(a10, nVar, (d<? super d0>) null)))), new p((d) null));
        v0 v0Var = t0.a.f10646b;
        u h3 = cb.c.h(nVar2);
        p0 a11 = b3.a(1, h3.f14789a, (e) h3.f14791c);
        this.f7076i = new l0(a11, cb.c.j(o10, (jf.f) h3.f14792d, (f) h3.f14790b, a11, v0Var, b3.f1265e));
    }
}
