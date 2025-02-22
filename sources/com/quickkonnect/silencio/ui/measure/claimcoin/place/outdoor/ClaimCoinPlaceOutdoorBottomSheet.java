package com.quickkonnect.silencio.ui.measure.claimcoin.place.outdoor;

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
import androidx.fragment.app.q;
import androidx.fragment.app.z0;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import b3.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.quickkonnect.silencio.R;
import jf.f;
import nc.l;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class ClaimCoinPlaceOutdoorBottomSheet extends id.f {
    public static final /* synthetic */ int T0 = 0;
    public l Q0;
    public final k0 R0;
    public final g S0 = new g(w.a(id.c.class), new a(this));

    public static final class a extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6924a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(0);
            this.f6924a = pVar;
        }

        public final Object d() {
            p pVar = this.f6924a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class b extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6925a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6925a = pVar;
        }

        public final Object d() {
            return this.f6925a;
        }
    }

    public static final class c extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6926a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f6926a = bVar;
        }

        public final Object d() {
            return (p0) this.f6926a.d();
        }
    }

    public static final class d extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6927a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f6927a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6927a, "owner.viewModelStore");
        }
    }

    public static final class e extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6928a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6928a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6928a);
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
        public final /* synthetic */ p f6929a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6930b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f6929a = pVar;
            this.f6930b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6930b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6929a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ClaimCoinPlaceOutdoorBottomSheet() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.R0 = z0.e(this, w.a(ClaimCoinPlaceOutdoorViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = l.f11749h0;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (l) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_claim_coin_place_outdoor, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        l lVar = this.Q0;
        j.c(lVar);
        lVar.w(u0());
        l lVar2 = this.Q0;
        j.c(lVar2);
        lVar2.v(z());
        l lVar3 = this.Q0;
        j.c(lVar3);
        lVar3.S.setOnClickListener(new sc.b(8, this));
        l lVar4 = this.Q0;
        j.c(lVar4);
        lVar4.T.setOnClickListener(new t8.a(this, 12));
        l lVar5 = this.Q0;
        j.c(lVar5);
        return lVar5.G;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new id.a(this, (jf.d<? super id.a>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new id.b(this, (jf.d<? super id.b>) null), 3);
    }

    public final ClaimCoinPlaceOutdoorViewModel u0() {
        return (ClaimCoinPlaceOutdoorViewModel) this.R0.getValue();
    }
}
