package com.quickkonnect.silencio.ui.auth.register;

import a9.v;
import android.accounts.Account;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.a1;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.q;
import androidx.fragment.app.z0;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import cd.n;
import cd.o;
import cd.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jf.f;
import nc.n0;
import rf.l;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class RegisterBottomSheet extends cd.a {
    public static final /* synthetic */ int X0 = 0;
    public n0 Q0;
    public final k0 R0;
    public final b3.g S0 = new b3.g(w.a(p.class), new b(this));
    public q6.a T0;
    public final int U0 = 100;
    public androidx.appcompat.app.b V0;
    public Task<GoogleSignInAccount> W0;

    public static final class a implements androidx.lifecycle.w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6854a;

        public a(l lVar) {
            this.f6854a = lVar;
        }

        public final ff.a<?> a() {
            return this.f6854a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6854a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6854a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6854a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.p f6855a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.p pVar) {
            super(0);
            this.f6855a = pVar;
        }

        public final Object d() {
            androidx.fragment.app.p pVar = this.f6855a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class c extends k implements rf.a<androidx.fragment.app.p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.p f6856a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.p pVar) {
            super(0);
            this.f6856a = pVar;
        }

        public final Object d() {
            return this.f6856a;
        }
    }

    public static final class d extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6857a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f6857a = cVar;
        }

        public final Object d() {
            return (p0) this.f6857a.d();
        }
    }

    public static final class e extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6858a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6858a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6858a, "owner.viewModelStore");
        }
    }

    public static final class f extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6859a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f6859a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6859a);
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
        public final /* synthetic */ androidx.fragment.app.p f6860a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6861b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.p pVar, ff.d dVar) {
            super(0);
            this.f6860a = pVar;
            this.f6861b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6861b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6860a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public RegisterBottomSheet() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.R0 = z0.e(this, w.a(RegisterViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public final void G(int i8, int i10, Intent intent) {
        super.G(i8, i10, intent);
        if (i8 == this.U0) {
            com.google.android.gms.auth.api.signin.a.a(intent).addOnCompleteListener(new j0.p(this, 8));
        }
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = n0.X;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (n0) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_register, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        n0 n0Var = this.Q0;
        j.c(n0Var);
        n0Var.V.setOnClickListener(new v(this, 8));
        n0 n0Var2 = this.Q0;
        j.c(n0Var2);
        MaterialButton materialButton = n0Var2.T;
        j.e(materialButton, "binding.btnContinueWithEmail");
        zd.e.a(materialButton, new o(this));
        n0 n0Var3 = this.Q0;
        j.c(n0Var3);
        n0Var3.U.setOnClickListener(new a9.h(this, 6));
        n0 n0Var4 = this.Q0;
        j.c(n0Var4);
        n0Var4.S.setOnClickListener(new sc.a(this, 5));
        n0 n0Var5 = this.Q0;
        j.c(n0Var5);
        n0Var5.W.setOnClickListener(new sc.b(5, this));
        this.V0 = zd.d.a(this);
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.H;
        new HashSet();
        new HashMap();
        u6.q.i(googleSignInOptions);
        HashSet hashSet = new HashSet(googleSignInOptions.f4153b);
        boolean z10 = googleSignInOptions.f4156e;
        boolean z11 = googleSignInOptions.B;
        boolean z12 = googleSignInOptions.f4155d;
        String str = googleSignInOptions.C;
        Account account = googleSignInOptions.f4154c;
        String str2 = googleSignInOptions.D;
        HashMap x10 = GoogleSignInOptions.x(googleSignInOptions.E);
        String str3 = googleSignInOptions.F;
        hashSet.add(GoogleSignInOptions.J);
        hashSet.add(GoogleSignInOptions.I);
        if (hashSet.contains(GoogleSignInOptions.M)) {
            Scope scope = GoogleSignInOptions.L;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (z12 && (account == null || !hashSet.isEmpty())) {
            hashSet.add(GoogleSignInOptions.K);
        }
        this.T0 = new q6.a(e0(), new GoogleSignInOptions(3, new ArrayList(hashSet), account, z12, z10, z11, str, str2, x10, str3));
        n0 n0Var6 = this.Q0;
        j.c(n0Var6);
        View view = n0Var6.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        v0().f6864i.e(z(), new a(new cd.g(this)));
        v0().f6865j.e(z(), new a(new cd.j(this)));
        cb.b.D(cb.d.I(this), (f.b) null, 0, new cd.k(this, (jf.d<? super cd.k>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new n(this, (jf.d<? super n>) null), 3);
    }

    public final p u0() {
        return (p) this.S0.getValue();
    }

    public final RegisterViewModel v0() {
        return (RegisterViewModel) this.R0.getValue();
    }
}
