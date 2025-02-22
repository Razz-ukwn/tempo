package com.quickkonnect.silencio.ui.measure.howto;

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
import nc.b0;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class HowToMeasureBottomSheet extends ld.a {
    public static final /* synthetic */ int S0 = 0;
    public b0 Q0;
    public final k0 R0;

    public static final class a extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6981a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(0);
            this.f6981a = pVar;
        }

        public final Object d() {
            return this.f6981a;
        }
    }

    public static final class b extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6982a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f6982a = aVar;
        }

        public final Object d() {
            return (p0) this.f6982a.d();
        }
    }

    public static final class c extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6983a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ff.d dVar) {
            super(0);
            this.f6983a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6983a, "owner.viewModelStore");
        }
    }

    public static final class d extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6984a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f6984a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6984a);
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
        public final /* synthetic */ p f6985a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6986b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p pVar, ff.d dVar) {
            super(0);
            this.f6985a = pVar;
            this.f6986b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6986b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6985a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public HowToMeasureBottomSheet() {
        ff.d w10 = b7.a.w(new b(new a(this)));
        this.R0 = z0.e(this, w.a(HowToMeasureViewModel.class), new c(w10), new d(w10), new e(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = b0.X;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (b0) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_how_to_measure, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        b0 b0Var = this.Q0;
        j.c(b0Var);
        b0Var.w((HowToMeasureViewModel) this.R0.getValue());
        b0 b0Var2 = this.Q0;
        j.c(b0Var2);
        b0Var2.v(z());
        b0 b0Var3 = this.Q0;
        j.c(b0Var3);
        b0Var3.S.setOnClickListener(new a9.h(this, 9));
        b0 b0Var4 = this.Q0;
        j.c(b0Var4);
        b0Var4.T.setOnClickListener(new sc.a(this, 10));
        b0 b0Var5 = this.Q0;
        j.c(b0Var5);
        b0Var5.U.setOnClickListener(new sc.b(11, this));
        b0 b0Var6 = this.Q0;
        j.c(b0Var6);
        View view = b0Var6.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new ld.b(this, (jf.d<? super ld.b>) null), 3);
    }
}
