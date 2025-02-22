package com.quickkonnect.silencio.ui.tabs.home.ask;

import a9.v;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.quickkonnect.silencio.R;
import jf.f;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class AskSilencioBottomSheet extends com.google.android.material.bottomsheet.c {
    public static final /* synthetic */ int N0 = 0;
    public nc.b L0;
    public final k0 M0;

    public static final class a extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7119a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(0);
            this.f7119a = pVar;
        }

        public final Object d() {
            return this.f7119a;
        }
    }

    public static final class b extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7120a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f7120a = aVar;
        }

        public final Object d() {
            return (p0) this.f7120a.d();
        }
    }

    public static final class c extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7121a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ff.d dVar) {
            super(0);
            this.f7121a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7121a, "owner.viewModelStore");
        }
    }

    public static final class d extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7122a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f7122a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7122a);
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
        public final /* synthetic */ p f7123a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7124b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p pVar, ff.d dVar) {
            super(0);
            this.f7123a = pVar;
            this.f7124b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7124b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7123a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public AskSilencioBottomSheet() {
        ff.d w10 = b7.a.w(new b(new a(this)));
        this.M0 = z0.e(this, w.a(AskSilencioViewModel.class), new c(w10), new d(w10), new e(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = nc.b.W;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.L0 = (nc.b) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_ask_silencio, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        nc.b bVar2 = this.L0;
        j.c(bVar2);
        bVar2.w((AskSilencioViewModel) this.M0.getValue());
        nc.b bVar3 = this.L0;
        j.c(bVar3);
        bVar3.v(z());
        nc.b bVar4 = this.L0;
        j.c(bVar4);
        bVar4.T.setOnClickListener(new t8.a(this, 16));
        nc.b bVar5 = this.L0;
        j.c(bVar5);
        bVar5.S.setOnClickListener(new v(this, 14));
        nc.b bVar6 = this.L0;
        j.c(bVar6);
        View view = bVar6.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.L0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new ud.a(this, (jf.d<? super ud.a>) null), 3);
    }
}
