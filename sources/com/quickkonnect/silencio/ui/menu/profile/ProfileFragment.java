package com.quickkonnect.silencio.ui.menu.profile;

import a9.v;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.n;
import androidx.appcompat.widget.a1;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.p;
import androidx.fragment.app.x;
import androidx.fragment.app.z0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.w;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import d2.d1;
import d2.i0;
import ff.m;
import java.io.File;
import java.util.WeakHashMap;
import jf.f;
import nc.e1;
import rd.q;
import rf.l;
import sf.j;
import sf.k;
import x2.a;

public final class ProfileFragment extends rd.a {
    public static final /* synthetic */ int I0 = 0;
    public e1 A0;
    public androidx.activity.result.c<Intent> B0;
    public final k0 C0;
    public File D0;
    public String E0 = "";
    public final String F0 = "'";
    public androidx.appcompat.app.b G0;
    public a3.a H0;

    public static final class a extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ProfileFragment f7079a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ProfileFragment profileFragment) {
            super(0);
            this.f7079a = profileFragment;
        }

        public final Object d() {
            ProfileFragment profileFragment = this.f7079a;
            a3.a aVar = profileFragment.H0;
            if (aVar != null) {
                aVar.c(new Intent("com.quickkonnect.silencio.side_menu"));
            }
            ag.m.c(profileFragment).o();
            return m.f8717a;
        }
    }

    public static final class b extends k implements rf.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7080a = new b();

        public b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object d() {
            return m.f8717a;
        }
    }

    public static final class c extends n {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ProfileFragment f7081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ProfileFragment profileFragment) {
            super(true);
            this.f7081d = profileFragment;
        }

        public final void a() {
            int i8 = ProfileFragment.I0;
            this.f7081d.p0();
        }
    }

    public static final class d implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f7082a;

        public d(l lVar) {
            this.f7082a = lVar;
        }

        public final ff.a<?> a() {
            return this.f7082a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7082a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f7082a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f7082a.hashCode();
        }
    }

    public static final class e extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7083a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p pVar) {
            super(0);
            this.f7083a = pVar;
        }

        public final Object d() {
            return this.f7083a;
        }
    }

    public static final class f extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7084a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f7084a = eVar;
        }

        public final Object d() {
            return (p0) this.f7084a.d();
        }
    }

    public static final class g extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7085a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ff.d dVar) {
            super(0);
            this.f7085a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7085a, "owner.viewModelStore");
        }
    }

    public static final class h extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7086a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ff.d dVar) {
            super(0);
            this.f7086a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7086a);
            x2.a aVar = null;
            androidx.lifecycle.h hVar = b10 instanceof androidx.lifecycle.h ? (androidx.lifecycle.h) b10 : null;
            if (hVar != null) {
                aVar = hVar.l();
            }
            return aVar == null ? a.C0311a.f16912b : aVar;
        }
    }

    public static final class i extends k implements rf.a<m0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7087a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7088b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(p pVar, ff.d dVar) {
            super(0);
            this.f7087a = pVar;
            this.f7088b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7088b);
            androidx.lifecycle.h hVar = b10 instanceof androidx.lifecycle.h ? (androidx.lifecycle.h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7087a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public ProfileFragment() {
        ff.d w10 = b7.a.w(new f(new e(this)));
        this.C0 = z0.e(this, sf.w.a(ProfileViewModel.class), new g(w10), new h(w10), new i(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        j.f(layoutInflater, "inflater");
        int i8 = e1.f11662l0;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        this.A0 = (e1) ViewDataBinding.p(layoutInflater, R.layout.fragment_profile, viewGroup, false, (Object) null);
        View decorView = d0().getWindow().getDecorView();
        j6.m mVar = new j6.m(this);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.i.u(decorView, mVar);
        e1 e1Var = this.A0;
        j.c(e1Var);
        e1Var.x(o0());
        e1 e1Var2 = this.A0;
        j.c(e1Var2);
        e1Var2.v(z());
        e1 e1Var3 = this.A0;
        j.c(e1Var3);
        e1Var3.f11664b0.setGuidelineBegin(zd.d.b(this));
        this.H0 = a3.a.a(e0());
        e1 e1Var4 = this.A0;
        j.c(e1Var4);
        e1Var4.X.setFilters(new InputFilter[]{new rd.b(this)});
        e1 e1Var5 = this.A0;
        j.c(e1Var5);
        e1Var5.Y.setFilters(new InputFilter[]{new rd.c(this)});
        this.B0 = c0(new q(this), new c.e());
        e1 e1Var6 = this.A0;
        j.c(e1Var6);
        e1Var6.U.setOnClickListener(new a9.h(this, 10));
        e1 e1Var7 = this.A0;
        j.c(e1Var7);
        e1Var7.f11666d0.setOnClickListener(new sc.a(this, 12));
        e1 e1Var8 = this.A0;
        j.c(e1Var8);
        e1Var8.S.setOnClickListener(new sc.b(15, this));
        e1 e1Var9 = this.A0;
        j.c(e1Var9);
        e1Var9.T.setOnClickListener(new t8.a(this, 14));
        e1 e1Var10 = this.A0;
        j.c(e1Var10);
        e1Var10.f11667e0.setOnClickListener(new v(this, 11));
        this.G0 = zd.d.a(this);
        x o10 = o();
        if (!(o10 == null || (onBackPressedDispatcher = o10.D) == null)) {
            onBackPressedDispatcher.a(z(), new c(this));
        }
        e1 e1Var11 = this.A0;
        j.c(e1Var11);
        View view = e1Var11.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        this.f2062b0 = true;
        this.A0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        o0().f7091i.e(z(), new d(new rd.e(this)));
        o0().f7094l.e(z(), new d(new rd.i(this)));
        o0().m.e(z(), new d(new rd.l(this)));
        cb.b.D(cb.d.I(this), (f.b) null, 0, new rd.m(this, (jf.d<? super rd.m>) null), 3);
        cb.b.D(cb.d.I(this), (f.b) null, 0, new rd.n(this, (jf.d<? super rd.n>) null), 3);
    }

    public final ProfileViewModel o0() {
        return (ProfileViewModel) this.C0.getValue();
    }

    public final void p0() {
        e1 e1Var = this.A0;
        j.c(e1Var);
        UserModel userModel = e1Var.f11672j0;
        String str = null;
        if (j.a(userModel != null ? userModel.getFirstName() : null, o0().f7092j.getValue())) {
            e1 e1Var2 = this.A0;
            j.c(e1Var2);
            UserModel userModel2 = e1Var2.f11672j0;
            if (userModel2 != null) {
                str = userModel2.getLastName();
            }
            if (j.a(str, o0().f7093k.getValue()) && this.D0 == null) {
                a3.a aVar = this.H0;
                if (aVar != null) {
                    aVar.c(new Intent("com.quickkonnect.silencio.side_menu"));
                }
                ag.m.c(this).o();
                return;
            }
        }
        String x10 = x(R.string.alert_title);
        j.e(x10, "getString(R.string.alert_title)");
        zd.d.d(this, x10, "Are you sure you want to discard changes?", "Discard", "Keep", true, new a(this), b.f7080a);
    }
}
