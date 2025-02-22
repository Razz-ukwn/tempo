package com.quickkonnect.silencio.ui.auth.createaccount;

import a9.v;
import android.app.Dialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.LinkMovementMethod;
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
import kotlinx.coroutines.flow.y0;
import nc.t;
import rf.l;
import sf.j;
import sf.k;
import tc.n;
import tc.o;
import tc.w;
import x2.a;

public final class CreateAccountBottomSheet extends w {
    public static final /* synthetic */ int W0 = 0;
    public t Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(sf.w.a(o.class), new b(this));
    public boolean T0;
    public androidx.appcompat.app.b U0;
    public final String V0 = "'";

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6718a;

        public a(l lVar) {
            this.f6718a = lVar;
        }

        public final ff.a<?> a() {
            return this.f6718a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6718a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6718a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6718a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6719a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6719a = pVar;
        }

        public final Object d() {
            p pVar = this.f6719a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6720a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f6720a = pVar;
        }

        public final Object d() {
            return this.f6720a;
        }
    }

    public static final class d extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6721a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f6721a = cVar;
        }

        public final Object d() {
            return (p0) this.f6721a.d();
        }
    }

    public static final class e extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6722a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6722a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6722a, "owner.viewModelStore");
        }
    }

    public static final class f extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6723a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f6723a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6723a);
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
        public final /* synthetic */ p f6724a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6725b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p pVar, ff.d dVar) {
            super(0);
            this.f6724a = pVar;
            this.f6725b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6725b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6724a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public CreateAccountBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, sf.w.a(CreateAccountViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = t.f11837b0;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (t) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_create_account, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        t tVar = this.Q0;
        j.c(tVar);
        tVar.w(v0());
        t tVar2 = this.Q0;
        j.c(tVar2);
        tVar2.v(z());
        t tVar3 = this.Q0;
        j.c(tVar3);
        tVar3.Z.setMovementMethod(LinkMovementMethod.getInstance());
        t tVar4 = this.Q0;
        j.c(tVar4);
        tVar4.V.setFilters(new InputFilter[]{new tc.a(this)});
        t tVar5 = this.Q0;
        j.c(tVar5);
        tVar5.W.setFilters(new InputFilter[]{new tc.b(this)});
        t tVar6 = this.Q0;
        j.c(tVar6);
        tVar6.X.setFilters(new InputFilter[]{new tc.c(this)});
        if (u0().f15593c) {
            y0 y0Var = v0().f6728i;
            String firstName = u0().f15591a.getFirstName();
            String str = "";
            if (firstName == null) {
                firstName = str;
            }
            y0Var.setValue(firstName);
            y0 y0Var2 = v0().f6729j;
            String lastName = u0().f15591a.getLastName();
            if (lastName == null) {
                lastName = str;
            }
            y0Var2.setValue(lastName);
            y0 y0Var3 = v0().f6730k;
            String nickName = u0().f15591a.getNickName();
            if (nickName != null) {
                str = nickName;
            }
            y0Var3.setValue(str);
        }
        t tVar7 = this.Q0;
        j.c(tVar7);
        tVar7.T.setOnClickListener(new t8.a(this, 4));
        t tVar8 = this.Q0;
        j.c(tVar8);
        tVar8.U.setOnClickListener(new v(this, 3));
        t tVar9 = this.Q0;
        j.c(tVar9);
        tVar9.S.setOnClickListener(new a9.h(this, 3));
        this.U0 = zd.d.a(this);
        t tVar10 = this.Q0;
        j.c(tVar10);
        View view = tVar10.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new tc.d(this, (jf.d<? super tc.d>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new tc.g(this, (jf.d<? super tc.g>) null), 3);
        v0().f6732n.e(z(), new a(new tc.j(this)));
        v0().f6734p.e(z(), new a(new n(this)));
    }

    public final o u0() {
        return (o) this.S0.getValue();
    }

    public final CreateAccountViewModel v0() {
        return (CreateAccountViewModel) this.R0.getValue();
    }
}
