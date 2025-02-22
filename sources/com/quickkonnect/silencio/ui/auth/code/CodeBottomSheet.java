package com.quickkonnect.silencio.ui.auth.code;

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
import nc.r;
import rf.l;
import sc.k;
import sf.j;
import x2.a;

public final class CodeBottomSheet extends k {
    public static final /* synthetic */ int U0 = 0;
    public r Q0;
    public final k0 R0;
    public boolean S0;
    public androidx.appcompat.app.b T0;

    public static final class a implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6702a;

        public a(sc.f fVar) {
            this.f6702a = fVar;
        }

        public final ff.a<?> a() {
            return this.f6702a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6702a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6702a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6702a.hashCode();
        }
    }

    public static final class b extends sf.k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6703a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6703a = pVar;
        }

        public final Object d() {
            return this.f6703a;
        }
    }

    public static final class c extends sf.k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6704a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f6704a = bVar;
        }

        public final Object d() {
            return (p0) this.f6704a.d();
        }
    }

    public static final class d extends sf.k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6705a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f6705a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6705a, "owner.viewModelStore");
        }
    }

    public static final class e extends sf.k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6706a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6706a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6706a);
            x2.a aVar = null;
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar != null) {
                aVar = hVar.l();
            }
            return aVar == null ? a.C0311a.f16912b : aVar;
        }
    }

    public static final class f extends sf.k implements rf.a<m0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6707a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6708b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f6707a = pVar;
            this.f6708b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6708b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6707a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public CodeBottomSheet() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.R0 = z0.e(this, sf.w.a(CodeViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = r.Z;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (r) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_code, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        r rVar = this.Q0;
        j.c(rVar);
        rVar.w(u0());
        r rVar2 = this.Q0;
        j.c(rVar2);
        rVar2.v(this);
        r rVar3 = this.Q0;
        j.c(rVar3);
        rVar3.T.setOnClickListener(new t8.a(this, 3));
        r rVar4 = this.Q0;
        j.c(rVar4);
        rVar4.U.setOnClickListener(new v(this, 2));
        r rVar5 = this.Q0;
        j.c(rVar5);
        rVar5.V.setOnClickListener(new a9.h(this, 2));
        r rVar6 = this.Q0;
        j.c(rVar6);
        rVar6.S.setOnClickListener(new sc.a(this, 0));
        r rVar7 = this.Q0;
        j.c(rVar7);
        rVar7.W.setOnClickListener(new sc.b(0, this));
        r rVar8 = this.Q0;
        j.c(rVar8);
        View view = rVar8.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        this.T0 = zd.d.a(this);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new sc.c(this, (jf.d<? super sc.c>) null), 3);
        u0().f6712j.e(z(), new a(new sc.f(this)));
    }

    public final CodeViewModel u0() {
        return (CodeViewModel) this.R0.getValue();
    }
}
