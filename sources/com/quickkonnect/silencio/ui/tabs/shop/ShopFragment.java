package com.quickkonnect.silencio.ui.tabs.shop;

import a9.v;
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
import androidx.lifecycle.w;
import com.quickkonnect.silencio.R;
import jf.f;
import nc.g1;
import rf.l;
import sf.j;
import sf.k;
import x2.a;

public final class ShopFragment extends xd.a {
    public static final /* synthetic */ int E0 = 0;
    public g1 A0;
    public a3.a B0;
    public a3.a C0;
    public final k0 D0;

    public static final class a implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f7139a;

        public a(xd.d dVar) {
            this.f7139a = dVar;
        }

        public final ff.a<?> a() {
            return this.f7139a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7139a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f7139a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f7139a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7140a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f7140a = pVar;
        }

        public final Object d() {
            return this.f7140a;
        }
    }

    public static final class c extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7141a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f7141a = bVar;
        }

        public final Object d() {
            return (p0) this.f7141a.d();
        }
    }

    public static final class d extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7142a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f7142a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7142a, "owner.viewModelStore");
        }
    }

    public static final class e extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7143a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f7143a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7143a);
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
        public final /* synthetic */ p f7144a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7145b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f7144a = pVar;
            this.f7145b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7145b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7144a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ShopFragment() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.D0 = z0.e(this, sf.w.a(ShopViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = g1.X;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        this.A0 = (g1) ViewDataBinding.p(layoutInflater, R.layout.fragment_shop, viewGroup, false, (Object) null);
        zd.d.c(this);
        g1 g1Var = this.A0;
        j.c(g1Var);
        g1Var.V.setGuidelineBegin(zd.d.b(this));
        this.B0 = a3.a.a(e0());
        this.C0 = a3.a.a(e0());
        g1 g1Var2 = this.A0;
        j.c(g1Var2);
        g1Var2.T.setOnClickListener(new sc.b(16, this));
        g1 g1Var3 = this.A0;
        j.c(g1Var3);
        g1Var3.U.setOnClickListener(new t8.a(this, 17));
        g1 g1Var4 = this.A0;
        j.c(g1Var4);
        g1Var4.S.setOnClickListener(new v(this, 16));
        ShopViewModel shopViewModel = (ShopViewModel) this.D0.getValue();
        shopViewModel.getClass();
        cb.b.D(gc.b.o(shopViewModel), (f.b) null, 0, new xd.f(shopViewModel, (jf.d<? super xd.f>) null), 3);
        g1 g1Var5 = this.A0;
        j.c(g1Var5);
        return g1Var5.G;
    }

    public final void N() {
        this.f2062b0 = true;
        this.A0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        ((ShopViewModel) this.D0.getValue()).f7147h.e(z(), new a(new xd.d(this)));
    }
}
