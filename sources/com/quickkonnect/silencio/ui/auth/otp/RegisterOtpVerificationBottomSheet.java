package com.quickkonnect.silencio.ui.auth.otp;

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
import nc.r0;
import rf.l;
import sf.j;
import sf.w;
import x2.a;
import zc.k;

public final class RegisterOtpVerificationBottomSheet extends zc.a {
    public static final /* synthetic */ int V0 = 0;
    public r0 Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(w.a(k.class), new b(this));
    public boolean T0;
    public androidx.appcompat.app.b U0;

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6811a;

        public a(l lVar) {
            this.f6811a = lVar;
        }

        public final ff.a<?> a() {
            return this.f6811a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6811a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6811a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6811a.hashCode();
        }
    }

    public static final class b extends sf.k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6812a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6812a = pVar;
        }

        public final Object d() {
            p pVar = this.f6812a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends sf.k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6813a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f6813a = pVar;
        }

        public final Object d() {
            return this.f6813a;
        }
    }

    public static final class d extends sf.k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6814a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f6814a = cVar;
        }

        public final Object d() {
            return (p0) this.f6814a.d();
        }
    }

    public static final class e extends sf.k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6815a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6815a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6815a, "owner.viewModelStore");
        }
    }

    public static final class f extends sf.k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6816a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f6816a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6816a);
            x2.a aVar = null;
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar != null) {
                aVar = hVar.l();
            }
            return aVar == null ? a.C0311a.f16912b : aVar;
        }
    }

    public static final class g extends sf.k implements rf.a<m0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6817a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6818b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p pVar, ff.d dVar) {
            super(0);
            this.f6817a = pVar;
            this.f6818b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6818b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6817a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public RegisterOtpVerificationBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, w.a(RegisterOtpVerficationViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = r0.Y;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (r0) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_register_otp_verification, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        r0 r0Var = this.Q0;
        j.c(r0Var);
        r0Var.w(v0());
        r0 r0Var2 = this.Q0;
        j.c(r0Var2);
        r0Var2.v(z());
        r0 r0Var3 = this.Q0;
        j.c(r0Var3);
        r0Var3.W.setText(y(R.string.verification_code_send_to, u0().f17937a.getCountryCode(), u0().f17937a.getPhone()));
        r0 r0Var4 = this.Q0;
        j.c(r0Var4);
        r0Var4.S.setOnClickListener(new sc.a(this, 2));
        r0 r0Var5 = this.Q0;
        j.c(r0Var5);
        r0Var5.T.setOnClickListener(new sc.b(3, this));
        r0 r0Var6 = this.Q0;
        j.c(r0Var6);
        r0Var6.V.setOnClickListener(new t8.a(this, 9));
        this.U0 = zd.d.a(this);
        r0 r0Var7 = this.Q0;
        j.c(r0Var7);
        return r0Var7.G;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new zc.d(this, (jf.d<? super zc.d>) null), 3);
        v0().f6804j.e(z(), new a(new zc.g(this)));
        v0().f6805k.e(z(), new a(new zc.j(this)));
    }

    public final k u0() {
        return (k) this.S0.getValue();
    }

    public final RegisterOtpVerficationViewModel v0() {
        return (RegisterOtpVerficationViewModel) this.R0.getValue();
    }
}
