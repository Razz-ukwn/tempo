package com.quickkonnect.silencio.ui.auth.phonenumber;

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
import nc.j0;
import rf.l;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class PhoneNumberBottomSheet extends bd.a {
    public static final /* synthetic */ int V0 = 0;
    public j0 Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(w.a(bd.f.class), new b(this));
    public boolean T0;
    public androidx.appcompat.app.b U0;

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6837a;

        public a(bd.e eVar) {
            this.f6837a = eVar;
        }

        public final ff.a<?> a() {
            return this.f6837a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6837a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6837a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6837a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6838a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6838a = pVar;
        }

        public final Object d() {
            p pVar = this.f6838a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6839a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f6839a = pVar;
        }

        public final Object d() {
            return this.f6839a;
        }
    }

    public static final class d extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6840a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f6840a = cVar;
        }

        public final Object d() {
            return (p0) this.f6840a.d();
        }
    }

    public static final class e extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6841a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6841a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6841a, "owner.viewModelStore");
        }
    }

    public static final class f extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6842a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f6842a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6842a);
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
        public final /* synthetic */ p f6843a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6844b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p pVar, ff.d dVar) {
            super(0);
            this.f6843a = pVar;
            this.f6844b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6844b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6843a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public PhoneNumberBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, w.a(PhoneNumberViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = j0.Y;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (j0) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_phone_number, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        j0 j0Var = this.Q0;
        j.c(j0Var);
        j0Var.w(u0());
        j0 j0Var2 = this.Q0;
        j.c(j0Var2);
        j0Var2.v(z());
        j0 j0Var3 = this.Q0;
        j.c(j0Var3);
        j0Var3.T.setOnClickListener(new v(this, 7));
        j0 j0Var4 = this.Q0;
        j.c(j0Var4);
        j0Var4.U.setOnClickListener(new a9.h(this, 5));
        j0 j0Var5 = this.Q0;
        j.c(j0Var5);
        j0Var5.S.setOnClickListener(new sc.a(this, 4));
        this.U0 = zd.d.a(this);
        j0 j0Var6 = this.Q0;
        j.c(j0Var6);
        View view = j0Var6.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new bd.b(this, (jf.d<? super bd.b>) null), 3);
        u0().f6848j.e(z(), new a(new bd.e(this)));
    }

    public final PhoneNumberViewModel u0() {
        return (PhoneNumberViewModel) this.R0.getValue();
    }
}
