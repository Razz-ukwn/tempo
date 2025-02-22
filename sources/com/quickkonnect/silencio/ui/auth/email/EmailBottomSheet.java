package com.quickkonnect.silencio.ui.auth.email;

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
import com.google.android.recaptcha.RecaptchaClient;
import com.quickkonnect.silencio.R;
import jf.f;
import nc.v;
import rf.l;
import sf.j;
import sf.k;
import sf.w;
import uc.i;
import uc.m;
import x2.a;

public final class EmailBottomSheet extends m {
    public static final /* synthetic */ int W0 = 0;
    public v Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(w.a(i.class), new b(this));
    public boolean T0;
    public androidx.appcompat.app.b U0;
    public RecaptchaClient V0;

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6735a;

        public a(uc.g gVar) {
            this.f6735a = gVar;
        }

        public final ff.a<?> a() {
            return this.f6735a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6735a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6735a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6735a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6736a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6736a = pVar;
        }

        public final Object d() {
            p pVar = this.f6736a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6737a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f6737a = pVar;
        }

        public final Object d() {
            return this.f6737a;
        }
    }

    public static final class d extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6738a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f6738a = cVar;
        }

        public final Object d() {
            return (p0) this.f6738a.d();
        }
    }

    public static final class e extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6739a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6739a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6739a, "owner.viewModelStore");
        }
    }

    public static final class f extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6740a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f6740a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6740a);
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
        public final /* synthetic */ p f6741a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6742b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p pVar, ff.d dVar) {
            super(0);
            this.f6741a = pVar;
            this.f6742b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6742b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6741a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public EmailBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, w.a(EmailViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public static final void u0(EmailBottomSheet emailBottomSheet) {
        String x10 = emailBottomSheet.x(R.string.alert_title);
        j.e(x10, "getString(R.string.alert_title)");
        zd.d.d(emailBottomSheet, x10, "We are facing some technical issue. Please try again later.", "OK", (String) null, false, new uc.a(emailBottomSheet), new uc.b(emailBottomSheet));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = v.X;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        this.Q0 = (v) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_email, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        BottomSheetBehavior<FrameLayout> h3 = bVar != null ? bVar.h() : null;
        if (h3 != null) {
            h3.C(3);
        }
        v vVar = this.Q0;
        j.c(vVar);
        vVar.w(v0());
        v vVar2 = this.Q0;
        j.c(vVar2);
        vVar2.v(z());
        cb.b.D(cb.d.I(this), (f.b) null, 0, new uc.c(this, (jf.d<? super uc.c>) null), 3);
        v vVar3 = this.Q0;
        j.c(vVar3);
        vVar3.T.setOnClickListener(new t8.a(this, 5));
        v vVar4 = this.Q0;
        j.c(vVar4);
        vVar4.U.setOnClickListener(new a9.v(this, 4));
        v vVar5 = this.Q0;
        j.c(vVar5);
        vVar5.S.setOnClickListener(new a9.h(this, 4));
        this.U0 = zd.d.a(this);
        v vVar6 = this.Q0;
        j.c(vVar6);
        View view = vVar6.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new uc.d(this, (jf.d<? super uc.d>) null), 3);
        v0().f6746j.e(z(), new a(new uc.g(this)));
    }

    public final EmailViewModel v0() {
        return (EmailViewModel) this.R0.getValue();
    }
}
