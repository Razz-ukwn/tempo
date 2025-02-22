package com.quickkonnect.silencio.ui.auth.forgotpassword;

import a9.v;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.recaptcha.RecaptchaClient;
import com.quickkonnect.silencio.R;
import jf.f;
import nc.x;
import rf.l;
import sf.j;
import sf.k;
import vc.g;
import vc.m;
import x2.a;

public final class ForgotPasswordBottomSheet extends m {
    public static final /* synthetic */ int V0 = 0;
    public x Q0;
    public final k0 R0;
    public RecaptchaClient S0;
    public androidx.appcompat.app.b T0;
    public boolean U0;

    public static final class a implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6752a;

        public a(g gVar) {
            this.f6752a = gVar;
        }

        public final ff.a<?> a() {
            return this.f6752a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6752a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6752a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6752a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6753a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6753a = pVar;
        }

        public final Object d() {
            return this.f6753a;
        }
    }

    public static final class c extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6754a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f6754a = bVar;
        }

        public final Object d() {
            return (p0) this.f6754a.d();
        }
    }

    public static final class d extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6755a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f6755a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6755a, "owner.viewModelStore");
        }
    }

    public static final class e extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6756a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6756a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6756a);
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
        public final /* synthetic */ p f6757a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6758b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f6757a = pVar;
            this.f6758b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6758b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6757a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ForgotPasswordBottomSheet() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.R0 = z0.e(this, sf.w.a(ForgotPasswordViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public static final void u0(ForgotPasswordBottomSheet forgotPasswordBottomSheet) {
        String x10 = forgotPasswordBottomSheet.x(R.string.alert_title);
        j.e(x10, "getString(R.string.alert_title)");
        zd.d.d(forgotPasswordBottomSheet, x10, "We are facing some technical issue. Please try again later.", "OK", (String) null, false, new vc.a(forgotPasswordBottomSheet), new vc.b(forgotPasswordBottomSheet));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = x.Y;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        this.Q0 = (x) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_forgot_password, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        BottomSheetBehavior<FrameLayout> h3 = bVar != null ? bVar.h() : null;
        if (h3 != null) {
            h3.C(3);
        }
        x xVar = this.Q0;
        j.c(xVar);
        xVar.w(v0());
        x xVar2 = this.Q0;
        j.c(xVar2);
        xVar2.v(z());
        cb.b.D(cb.d.I(this), (f.b) null, 0, new vc.c(this, (jf.d<? super vc.c>) null), 3);
        x xVar3 = this.Q0;
        j.c(xVar3);
        xVar3.S.setOnClickListener(new t8.a(this, 6));
        x xVar4 = this.Q0;
        j.c(xVar4);
        TextView textView = xVar4.W;
        j.e(textView, "binding.getCodeWithEmail");
        zd.e.a(textView, new vc.h(this));
        x xVar5 = this.Q0;
        j.c(xVar5);
        xVar5.T.setOnClickListener(new v(this, 5));
        this.T0 = zd.d.a(this);
        x xVar6 = this.Q0;
        j.c(xVar6);
        View view = xVar6.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new vc.d(this, (jf.d<? super vc.d>) null), 3);
        v0().f6762j.e(z(), new a(new g(this)));
    }

    public final ForgotPasswordViewModel v0() {
        return (ForgotPasswordViewModel) this.R0.getValue();
    }
}
