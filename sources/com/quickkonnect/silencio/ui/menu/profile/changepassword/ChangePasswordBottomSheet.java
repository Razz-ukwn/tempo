package com.quickkonnect.silencio.ui.menu.profile.changepassword;

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
import androidx.fragment.app.z0;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.w;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.quickkonnect.silencio.R;
import jf.f;
import rf.l;
import sd.j;
import sf.k;
import x2.a;

public final class ChangePasswordBottomSheet extends j {
    public static final /* synthetic */ int T0 = 0;
    public nc.e Q0;
    public final k0 R0;
    public androidx.appcompat.app.b S0;

    public static final class a implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f7095a;

        public a(sd.e eVar) {
            this.f7095a = eVar;
        }

        public final ff.a<?> a() {
            return this.f7095a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7095a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return sf.j.a(this.f7095a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f7095a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7096a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f7096a = pVar;
        }

        public final Object d() {
            return this.f7096a;
        }
    }

    public static final class c extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7097a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f7097a = bVar;
        }

        public final Object d() {
            return (p0) this.f7097a.d();
        }
    }

    public static final class d extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7098a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f7098a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7098a, "owner.viewModelStore");
        }
    }

    public static final class e extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7099a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f7099a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7099a);
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
        public final /* synthetic */ p f7100a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7101b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f7100a = pVar;
            this.f7101b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7101b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7100a.k();
            }
            sf.j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ChangePasswordBottomSheet() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.R0 = z0.e(this, sf.w.a(ChangePasswordViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sf.j.f(layoutInflater, "inflater");
        int i8 = nc.e.f11660b0;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (nc.e) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_change_password, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        nc.e eVar = this.Q0;
        sf.j.c(eVar);
        eVar.w(u0());
        nc.e eVar2 = this.Q0;
        sf.j.c(eVar2);
        eVar2.v(this);
        nc.e eVar3 = this.Q0;
        sf.j.c(eVar3);
        eVar3.S.setOnClickListener(new v(this, 12));
        nc.e eVar4 = this.Q0;
        sf.j.c(eVar4);
        eVar4.T.setOnClickListener(new a9.h(this, 11));
        this.S0 = zd.d.a(this);
        nc.e eVar5 = this.Q0;
        sf.j.c(eVar5);
        View view = eVar5.G;
        sf.j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        sf.j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new sd.a(this, (jf.d<? super sd.a>) null), 3);
        u0().m.e(z(), new a(new sd.e(this)));
    }

    public final ChangePasswordViewModel u0() {
        return (ChangePasswordViewModel) this.R0.getValue();
    }
}
