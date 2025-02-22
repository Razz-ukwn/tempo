package com.quickkonnect.silencio.ui.auth.resetpassword;

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
import nc.t0;
import rf.l;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class ResetPasswordBottomSheet extends dd.a {
    public static final /* synthetic */ int V0 = 0;
    public t0 Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(w.a(dd.f.class), new b(this));
    public androidx.appcompat.app.b T0;
    public boolean U0;

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6868a;

        public a(dd.e eVar) {
            this.f6868a = eVar;
        }

        public final ff.a<?> a() {
            return this.f6868a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6868a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6868a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6868a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6869a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6869a = pVar;
        }

        public final Object d() {
            p pVar = this.f6869a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6870a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f6870a = pVar;
        }

        public final Object d() {
            return this.f6870a;
        }
    }

    public static final class d extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6871a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f6871a = cVar;
        }

        public final Object d() {
            return (p0) this.f6871a.d();
        }
    }

    public static final class e extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6872a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6872a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6872a, "owner.viewModelStore");
        }
    }

    public static final class f extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6873a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f6873a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6873a);
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
        public final /* synthetic */ p f6874a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6875b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p pVar, ff.d dVar) {
            super(0);
            this.f6874a = pVar;
            this.f6875b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6875b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6874a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ResetPasswordBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, w.a(ResetPasswordViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = t0.X;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (t0) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_reset_password, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        t0 t0Var = this.Q0;
        j.c(t0Var);
        t0Var.w(u0());
        t0 t0Var2 = this.Q0;
        j.c(t0Var2);
        t0Var2.v(z());
        t0 t0Var3 = this.Q0;
        j.c(t0Var3);
        t0Var3.S.setOnClickListener(new sc.a(this, 6));
        t0 t0Var4 = this.Q0;
        j.c(t0Var4);
        t0Var4.T.setOnClickListener(new sc.b(6, this));
        this.T0 = zd.d.a(this);
        t0 t0Var5 = this.Q0;
        j.c(t0Var5);
        View view = t0Var5.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new dd.b(this, (jf.d<? super dd.b>) null), 3);
        u0().f6880k.e(z(), new a(new dd.e(this)));
    }

    public final ResetPasswordViewModel u0() {
        return (ResetPasswordViewModel) this.R0.getValue();
    }
}
