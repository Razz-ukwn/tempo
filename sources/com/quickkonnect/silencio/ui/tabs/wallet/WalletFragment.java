package com.quickkonnect.silencio.ui.tabs.wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.a1;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.p;
import androidx.fragment.app.z0;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.BaseResponse;
import jf.f;
import nc.i1;
import rf.l;
import sf.j;
import sf.k;
import x2.a;
import yd.i;
import yd.m;
import yd.o;
import zd.g;

public final class WalletFragment extends yd.a {
    public static final /* synthetic */ int F0 = 0;
    public i1 A0;
    public final k0 B0;
    public androidx.appcompat.app.b C0;
    public yd.b D0;
    public boolean E0;

    public static final class a implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f7148a;

        public a(l lVar) {
            j.f(lVar, "function");
            this.f7148a = lVar;
        }

        public final ff.a<?> a() {
            return this.f7148a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7148a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f7148a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f7148a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7149a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f7149a = pVar;
        }

        public final Object d() {
            return this.f7149a;
        }
    }

    public static final class c extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7150a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f7150a = bVar;
        }

        public final Object d() {
            return (p0) this.f7150a.d();
        }
    }

    public static final class d extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7151a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f7151a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7151a, "owner.viewModelStore");
        }
    }

    public static final class e extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7152a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f7152a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7152a);
            x2.a aVar = null;
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar != null) {
                aVar = hVar.l();
            }
            return aVar == null ? a.C0311a.f16912b : aVar;
        }
    }

    public static final class f extends k implements rf.a<m0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7153a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7154b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f7153a = pVar;
            this.f7154b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7154b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7153a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public WalletFragment() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.B0 = z0.e(this, sf.w.a(WalletViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = i1.f11716a0;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        this.A0 = (i1) ViewDataBinding.p(layoutInflater, R.layout.fragment_wallet, viewGroup, false, (Object) null);
        WalletViewModel o02 = o0();
        o02.getClass();
        cb.b.D(gc.b.o(o02), (f.b) null, 0, new o(o02, (jf.d<? super o>) null), 3);
        WalletViewModel o03 = o0();
        o03.getClass();
        cb.b.D(gc.b.o(o03), (f.b) null, 0, new yd.p(o03, (jf.d<? super yd.p>) null), 3);
        this.D0 = new yd.b();
        i1 i1Var = this.A0;
        j.c(i1Var);
        e0();
        i1Var.T.setLayoutManager(new LinearLayoutManager(1));
        i1 i1Var2 = this.A0;
        j.c(i1Var2);
        yd.b bVar = this.D0;
        if (bVar != null) {
            i1Var2.T.setAdapter(bVar);
            i1 i1Var3 = this.A0;
            j.c(i1Var3);
            i1Var3.Y.setOnClickListener(new sc.b(17, this));
            i1 i1Var4 = this.A0;
            j.c(i1Var4);
            i1Var4.S.setOnClickListener(new t8.a(this, 18));
            this.C0 = zd.d.a(this);
            i1 i1Var5 = this.A0;
            j.c(i1Var5);
            return i1Var5.G;
        }
        j.l("adapter");
        throw null;
    }

    public final void N() {
        this.f2062b0 = true;
        this.A0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        o0().f7158j.e(z(), new a(new yd.f(this)));
        o0().f7159k.e(z(), new a(new i(this)));
        v<g<BaseResponse>> vVar = o0().f7160l;
        j.c(vVar);
        vVar.e(z(), new a(new yd.l(this)));
        o0().f7157i.e(z(), new a(m.f17358a));
    }

    public final WalletViewModel o0() {
        return (WalletViewModel) this.B0.getValue();
    }
}
