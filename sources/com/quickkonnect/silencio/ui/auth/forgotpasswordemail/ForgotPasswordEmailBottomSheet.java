package com.quickkonnect.silencio.ui.auth.forgotpasswordemail;

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
import nc.z;
import rf.l;
import sf.j;
import sf.k;
import wc.g;
import wc.m;
import x2.a;

public final class ForgotPasswordEmailBottomSheet extends m {
    public static final /* synthetic */ int V0 = 0;
    public z Q0;
    public final k0 R0;
    public RecaptchaClient S0;
    public androidx.appcompat.app.b T0;
    public boolean U0;

    public static final class a implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6768a;

        public a(g gVar) {
            this.f6768a = gVar;
        }

        public final ff.a<?> a() {
            return this.f6768a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6768a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6768a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6768a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6769a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6769a = pVar;
        }

        public final Object d() {
            return this.f6769a;
        }
    }

    public static final class c extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6770a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f6770a = bVar;
        }

        public final Object d() {
            return (p0) this.f6770a.d();
        }
    }

    public static final class d extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6771a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f6771a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6771a, "owner.viewModelStore");
        }
    }

    public static final class e extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6772a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6772a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6772a);
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
        public final /* synthetic */ p f6773a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6774b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f6773a = pVar;
            this.f6774b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6774b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6773a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ForgotPasswordEmailBottomSheet() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.R0 = z0.e(this, sf.w.a(ForgotPasswordEmailViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public static final void u0(ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet) {
        String x10 = forgotPasswordEmailBottomSheet.x(R.string.alert_title);
        j.e(x10, "getString(R.string.alert_title)");
        zd.d.d(forgotPasswordEmailBottomSheet, x10, "We are facing some technical issue. Please try again later.", "OK", (String) null, false, new wc.a(forgotPasswordEmailBottomSheet), new wc.b(forgotPasswordEmailBottomSheet));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = z.X;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        this.Q0 = (z) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_forgot_password_email, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        BottomSheetBehavior<FrameLayout> h3 = bVar != null ? bVar.h() : null;
        if (h3 != null) {
            h3.C(3);
        }
        z zVar = this.Q0;
        j.c(zVar);
        zVar.w(v0());
        z zVar2 = this.Q0;
        j.c(zVar2);
        zVar2.v(z());
        cb.b.D(cb.d.I(this), (f.b) null, 0, new wc.c(this, (jf.d<? super wc.c>) null), 3);
        z zVar3 = this.Q0;
        j.c(zVar3);
        zVar3.S.setOnClickListener(new sc.b(1, this));
        z zVar4 = this.Q0;
        j.c(zVar4);
        TextView textView = zVar4.V;
        j.e(textView, "binding.getCodeWithPhone");
        zd.e.a(textView, new wc.h(this));
        z zVar5 = this.Q0;
        j.c(zVar5);
        zVar5.T.setOnClickListener(new t8.a(this, 7));
        this.T0 = zd.d.a(this);
        z zVar6 = this.Q0;
        j.c(zVar6);
        View view = zVar6.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new wc.d(this, (jf.d<? super wc.d>) null), 3);
        v0().f6778j.e(z(), new a(new g(this)));
    }

    public final ForgotPasswordEmailViewModel v0() {
        return (ForgotPasswordEmailViewModel) this.R0.getValue();
    }
}
