package com.quickkonnect.silencio.ui.auth.chosepassword;

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
import rc.j;
import rf.l;
import sf.k;
import sf.w;
import x2.a;

public final class ChoosePasswordBottomSheet extends j {
    public static final /* synthetic */ int V0 = 0;
    public nc.g Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(w.a(rc.f.class), new b(this));
    public boolean T0;
    public androidx.appcompat.app.b U0;

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6688a;

        public a(rc.e eVar) {
            this.f6688a = eVar;
        }

        public final ff.a<?> a() {
            return this.f6688a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6688a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return sf.j.a(this.f6688a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6688a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6689a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6689a = pVar;
        }

        public final Object d() {
            p pVar = this.f6689a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6690a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f6690a = pVar;
        }

        public final Object d() {
            return this.f6690a;
        }
    }

    public static final class d extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6691a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f6691a = cVar;
        }

        public final Object d() {
            return (p0) this.f6691a.d();
        }
    }

    public static final class e extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6692a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6692a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6692a, "owner.viewModelStore");
        }
    }

    public static final class f extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6693a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f6693a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6693a);
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
        public final /* synthetic */ p f6694a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6695b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p pVar, ff.d dVar) {
            super(0);
            this.f6694a = pVar;
            this.f6695b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6695b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6694a.k();
            }
            sf.j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ChoosePasswordBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, w.a(ChoosePasswordViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sf.j.f(layoutInflater, "inflater");
        int i8 = nc.g.Y;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (nc.g) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_choose_password, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        nc.g gVar = this.Q0;
        sf.j.c(gVar);
        gVar.w(u0());
        nc.g gVar2 = this.Q0;
        sf.j.c(gVar2);
        gVar2.v(z());
        nc.g gVar3 = this.Q0;
        sf.j.c(gVar3);
        gVar3.U.setOnClickListener(new t8.a(this, 2));
        nc.g gVar4 = this.Q0;
        sf.j.c(gVar4);
        gVar4.T.setOnClickListener(new v(this, 1));
        nc.g gVar5 = this.Q0;
        sf.j.c(gVar5);
        gVar5.S.setOnClickListener(new a9.h(this, 1));
        this.U0 = zd.d.a(this);
        nc.g gVar6 = this.Q0;
        sf.j.c(gVar6);
        return gVar6.G;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        sf.j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new rc.a(this, (jf.d<? super rc.a>) null), 3);
        u0().f6701l.e(z(), new a(new rc.e(this)));
    }

    public final ChoosePasswordViewModel u0() {
        return (ChoosePasswordViewModel) this.R0.getValue();
    }
}
