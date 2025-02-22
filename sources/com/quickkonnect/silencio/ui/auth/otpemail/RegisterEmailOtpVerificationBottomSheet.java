package com.quickkonnect.silencio.ui.auth.otpemail;

import ad.m;
import ad.o;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.recaptcha.RecaptchaClient;
import com.quickkonnect.silencio.R;
import jf.f;
import nc.p0;
import rf.l;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class RegisterEmailOtpVerificationBottomSheet extends ad.a {
    public static final /* synthetic */ int W0 = 0;
    public p0 Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(w.a(o.class), new b(this));
    public boolean T0;
    public androidx.appcompat.app.b U0;
    public RecaptchaClient V0;

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6829a;

        public a(l lVar) {
            this.f6829a = lVar;
        }

        public final ff.a<?> a() {
            return this.f6829a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6829a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6829a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6829a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6830a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6830a = pVar;
        }

        public final Object d() {
            p pVar = this.f6830a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6831a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f6831a = pVar;
        }

        public final Object d() {
            return this.f6831a;
        }
    }

    public static final class d extends k implements rf.a<androidx.lifecycle.p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6832a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f6832a = cVar;
        }

        public final Object d() {
            return (androidx.lifecycle.p0) this.f6832a.d();
        }
    }

    public static final class e extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6833a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6833a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6833a, "owner.viewModelStore");
        }
    }

    public static final class f extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6834a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f6834a = dVar;
        }

        public final Object d() {
            androidx.lifecycle.p0 b10 = z0.b(this.f6834a);
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
        public final /* synthetic */ p f6835a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6836b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p pVar, ff.d dVar) {
            super(0);
            this.f6835a = pVar;
            this.f6836b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            androidx.lifecycle.p0 b10 = z0.b(this.f6836b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6835a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public RegisterEmailOtpVerificationBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, w.a(RegisterEmailOtpVerficationViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public static final void u0(RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet) {
        String x10 = registerEmailOtpVerificationBottomSheet.x(R.string.alert_title);
        j.e(x10, "getString(R.string.alert_title)");
        zd.d.d(registerEmailOtpVerificationBottomSheet, x10, "We are facing some technical issue. Please try again later.", "OK", (String) null, false, new ad.d(registerEmailOtpVerificationBottomSheet), new ad.e(registerEmailOtpVerificationBottomSheet));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = p0.Y;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        this.Q0 = (p0) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_register_email_otp_verification, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        BottomSheetBehavior<FrameLayout> h3 = bVar != null ? bVar.h() : null;
        if (h3 != null) {
            h3.C(3);
        }
        p0 p0Var = this.Q0;
        j.c(p0Var);
        p0Var.w(v0());
        p0 p0Var2 = this.Q0;
        j.c(p0Var2);
        p0Var2.v(z());
        cb.b.D(cb.d.I(this), (f.b) null, 0, new ad.f(this, (jf.d<? super ad.f>) null), 3);
        p0 p0Var3 = this.Q0;
        j.c(p0Var3);
        p0Var3.W.setText(y(R.string.verification_code_send_to_via_email, ((o) this.S0.getValue()).f315a.getEmail()));
        p0 p0Var4 = this.Q0;
        j.c(p0Var4);
        p0Var4.S.setOnClickListener(new sc.a(this, 3));
        p0 p0Var5 = this.Q0;
        j.c(p0Var5);
        p0Var5.T.setOnClickListener(new sc.b(4, this));
        p0 p0Var6 = this.Q0;
        j.c(p0Var6);
        p0Var6.V.setOnClickListener(new t8.a(this, 10));
        this.U0 = zd.d.a(this);
        p0 p0Var7 = this.Q0;
        j.c(p0Var7);
        return p0Var7.G;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new ad.g(this, (jf.d<? super ad.g>) null), 3);
        v0().f6822j.e(z(), new a(new ad.j(this)));
        v0().f6823k.e(z(), new a(new m(this)));
    }

    public final RegisterEmailOtpVerficationViewModel v0() {
        return (RegisterEmailOtpVerficationViewModel) this.R0.getValue();
    }
}
