package com.quickkonnect.silencio.ui.auth.login;

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
import androidx.fragment.app.p;
import androidx.fragment.app.z0;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.w;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.quickkonnect.silencio.R;
import j0.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jf.f;
import nc.e0;
import rf.l;
import sf.j;
import sf.k;
import u6.q;
import x2.a;

public final class LoginBottomSheet extends xc.a {
    public static final /* synthetic */ int W0 = 0;
    public e0 Q0;
    public final k0 R0;
    public q6.a S0;
    public final int T0 = 100;
    public boolean U0;
    public androidx.appcompat.app.b V0;

    public static final class a implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f6784a;

        public a(l lVar) {
            this.f6784a = lVar;
        }

        public final ff.a<?> a() {
            return this.f6784a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f6784a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f6784a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f6784a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6785a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f6785a = pVar;
        }

        public final Object d() {
            return this.f6785a;
        }
    }

    public static final class c extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f6786a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f6786a = bVar;
        }

        public final Object d() {
            return (p0) this.f6786a.d();
        }
    }

    public static final class d extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6787a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f6787a = dVar;
        }

        public final Object d() {
            return a1.a(this.f6787a, "owner.viewModelStore");
        }
    }

    public static final class e extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f6788a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f6788a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f6788a);
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
        public final /* synthetic */ p f6789a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f6790b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f6789a = pVar;
            this.f6790b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f6790b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f6789a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public LoginBottomSheet() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.R0 = z0.e(this, sf.w.a(LoginViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public final void G(int i8, int i10, Intent intent) {
        super.G(i8, i10, intent);
        if (i8 == this.T0) {
            com.google.android.gms.auth.api.signin.a.a(intent).addOnCompleteListener(new m(this, 8));
        }
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = e0.Z;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (e0) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_login, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        e0 e0Var = this.Q0;
        j.c(e0Var);
        e0Var.w(u0());
        e0 e0Var2 = this.Q0;
        j.c(e0Var2);
        e0Var2.v(z());
        e0 e0Var3 = this.Q0;
        j.c(e0Var3);
        e0Var3.S.setOnClickListener(new sc.a(this, 1));
        e0 e0Var4 = this.Q0;
        j.c(e0Var4);
        e0Var4.W.setOnClickListener(new sc.b(2, this));
        e0 e0Var5 = this.Q0;
        j.c(e0Var5);
        e0Var5.T.setOnClickListener(new t8.a(this, 8));
        e0 e0Var6 = this.Q0;
        j.c(e0Var6);
        e0Var6.X.setOnClickListener(new v(this, 6));
        this.V0 = zd.d.a(this);
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.H;
        new HashSet();
        new HashMap();
        q.i(googleSignInOptions);
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
        this.S0 = new q6.a(e0(), new GoogleSignInOptions(3, new ArrayList(hashSet), account, z12, z10, z11, str, str2, x10, str3));
        e0 e0Var7 = this.Q0;
        j.c(e0Var7);
        View view = e0Var7.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new xc.d(this, (jf.d<? super xc.d>) null), 3);
        u0().f6796l.e(z(), new a(new xc.h(this)));
        u0().m.e(z(), new a(new xc.l(this)));
    }

    public final LoginViewModel u0() {
        return (LoginViewModel) this.R0.getValue();
    }
}
