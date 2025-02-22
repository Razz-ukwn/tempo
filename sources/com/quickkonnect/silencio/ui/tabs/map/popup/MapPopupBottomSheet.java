package com.quickkonnect.silencio.ui.tabs.map.popup;

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
import com.quickkonnect.silencio.R;
import jf.f;
import nc.g0;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class MapPopupBottomSheet extends com.google.android.material.bottomsheet.c {
    public static final /* synthetic */ int N0 = 0;
    public g0 L0;
    public final k0 M0;

    public static final class a extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7133a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(0);
            this.f7133a = pVar;
        }

        public final Object d() {
            return this.f7133a;
        }
    }

    public static final class b extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7134a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f7134a = aVar;
        }

        public final Object d() {
            return (p0) this.f7134a.d();
        }
    }

    public static final class c extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7135a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ff.d dVar) {
            super(0);
            this.f7135a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7135a, "owner.viewModelStore");
        }
    }

    public static final class d extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7136a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f7136a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7136a);
            x2.a aVar = null;
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar != null) {
                aVar = hVar.l();
            }
            return aVar == null ? a.C0311a.f16912b : aVar;
        }
    }

    public static final class e extends k implements rf.a<m0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7137a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7138b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p pVar, ff.d dVar) {
            super(0);
            this.f7137a = pVar;
            this.f7138b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7138b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7137a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public MapPopupBottomSheet() {
        ff.d w10 = b7.a.w(new b(new a(this)));
        this.M0 = z0.e(this, w.a(wd.b.class), new c(w10), new d(w10), new e(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = g0.W;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        g0 g0Var = (g0) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_map_popup, viewGroup, false, (Object) null);
        this.L0 = g0Var;
        j.c(g0Var);
        g0Var.w((wd.b) this.M0.getValue());
        g0 g0Var2 = this.L0;
        j.c(g0Var2);
        g0Var2.v(z());
        g0 g0Var3 = this.L0;
        j.c(g0Var3);
        g0Var3.S.setOnClickListener(new a9.h(this, 14));
        g0 g0Var4 = this.L0;
        j.c(g0Var4);
        g0Var4.T.setOnClickListener(new sc.a(this, 15));
        cb.b.D(cb.d.I(this), (f.b) null, 0, new wd.a(this, (jf.d<? super wd.a>) null), 3);
        g0 g0Var5 = this.L0;
        j.c(g0Var5);
        View view = g0Var5.G;
        j.e(view, "binding.root");
        return view;
    }
}
