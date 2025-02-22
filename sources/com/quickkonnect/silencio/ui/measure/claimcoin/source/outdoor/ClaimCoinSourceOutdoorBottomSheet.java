package com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.a1;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.q;
import androidx.fragment.app.z0;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.quickkonnect.silencio.R;
import jf.f;
import kd.i;
import nc.p;
import rf.l;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class ClaimCoinSourceOutdoorBottomSheet extends i {
    public static final /* synthetic */ int U0 = 0;
    public p Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(w.a(kd.f.class), new b(this));
    public androidx.appcompat.app.b T0;

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6961a;

        public a(kd.e eVar) {
            this.f6961a = eVar;
        }

        public final ff.a<?> a() {
            return this.f6961a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6961a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6961a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6961a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.p f6962a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.p pVar) {
            super(0);
            this.f6962a = pVar;
        }

        public final Object d() {
            androidx.fragment.app.p pVar = this.f6962a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends k implements rf.a<androidx.fragment.app.p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.p f6963a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.p pVar) {
            super(0);
            this.f6963a = pVar;
        }

        public final Object d() {
            return this.f6963a;
        }
    }

    public static final class d extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6964a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f6964a = cVar;
        }

        public final Object d() {
            return (p0) this.f6964a.d();
        }
    }

    public static final class e extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6965a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6965a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6965a, "owner.viewModelStore");
        }
    }

    public static final class f extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6966a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f6966a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6966a);
            x2.a aVar = null;
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar != null) {
                aVar = hVar.l();
            }
            return aVar == null ? a.C0311a.f16912b : aVar;
        }
    }

    public static final class g extends k implements rf.a<m0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.p f6967a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6968b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.p pVar, ff.d dVar) {
            super(0);
            this.f6967a = pVar;
            this.f6968b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6968b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6967a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ClaimCoinSourceOutdoorBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, w.a(ClaimCoinSourceOutdoorViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = p.f11800j0;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (p) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_claim_coin_source_outdoor, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        p pVar = this.Q0;
        j.c(pVar);
        pVar.w(u0());
        p pVar2 = this.Q0;
        j.c(pVar2);
        pVar2.v(z());
        p pVar3 = this.Q0;
        j.c(pVar3);
        pVar3.S.setOnClickListener(new sc.a(this, 9));
        p pVar4 = this.Q0;
        j.c(pVar4);
        pVar4.T.setOnClickListener(new sc.b(10, this));
        this.T0 = zd.d.a(this);
        p pVar5 = this.Q0;
        j.c(pVar5);
        View view = pVar5.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new kd.a(this, (jf.d<? super kd.a>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new kd.b(this, (jf.d<? super kd.b>) null), 3);
        u0().f6973k.e(z(), new a(new kd.e(this)));
    }

    public final ClaimCoinSourceOutdoorViewModel u0() {
        return (ClaimCoinSourceOutdoorViewModel) this.R0.getValue();
    }
}
