package com.quickkonnect.silencio.ui.menu.history;

import ag.m;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.n;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.p;
import androidx.fragment.app.x;
import androidx.fragment.app.z0;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.quickkonnect.silencio.R;
import jf.f;
import nc.a1;
import pd.j;
import rf.l;
import sf.k;
import x2.a;

public final class HistoryFragment extends pd.a {
    public static final /* synthetic */ int E0 = 0;
    public a1 A0;
    public j B0;
    public final k0 C0;
    public a3.a D0;

    public static final class a extends n {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ HistoryFragment f7066d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HistoryFragment historyFragment) {
            super(true);
            this.f7066d = historyFragment;
        }

        public final void a() {
            int i8 = HistoryFragment.E0;
            HistoryFragment historyFragment = this.f7066d;
            a3.a aVar = historyFragment.D0;
            if (aVar != null) {
                aVar.c(new Intent("com.quickkonnect.silencio.side_menu"));
            }
            m.c(historyFragment).o();
        }
    }

    public static final class b implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f7067a;

        public b(pd.e eVar) {
            this.f7067a = eVar;
        }

        public final ff.a<?> a() {
            return this.f7067a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7067a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return sf.j.a(this.f7067a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f7067a.hashCode();
        }
    }

    public static final class c extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7068a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p pVar) {
            super(0);
            this.f7068a = pVar;
        }

        public final Object d() {
            return this.f7068a;
        }
    }

    public static final class d extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7069a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f7069a = cVar;
        }

        public final Object d() {
            return (p0) this.f7069a.d();
        }
    }

    public static final class e extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7070a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f7070a = dVar;
        }

        public final Object d() {
            return androidx.appcompat.widget.a1.a(this.f7070a, "owner.viewModelStore");
        }
    }

    public static final class f extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7071a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ff.d dVar) {
            super(0);
            this.f7071a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7071a);
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
        public final /* synthetic */ p f7072a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7073b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p pVar, ff.d dVar) {
            super(0);
            this.f7072a = pVar;
            this.f7073b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7073b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7072a.k();
            }
            sf.j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public HistoryFragment() {
        ff.d w10 = b7.a.w(new d(new c(this)));
        this.C0 = z0.e(this, sf.w.a(HistoryViewModel.class), new e(w10), new f(w10), new g(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        sf.j.f(layoutInflater, "inflater");
        int i8 = a1.Z;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        a1 a1Var = (a1) ViewDataBinding.p(layoutInflater, R.layout.fragment_history, viewGroup, false, (Object) null);
        this.A0 = a1Var;
        sf.j.c(a1Var);
        a1Var.T.setGuidelineBegin(zd.d.b(this));
        HistoryViewModel historyViewModel = (HistoryViewModel) this.C0.getValue();
        historyViewModel.getClass();
        cb.b.D(gc.b.o(historyViewModel), (f.b) null, 0, new pd.l(historyViewModel, (jf.d<? super pd.l>) null), 3);
        this.B0 = new j(new pd.f(this));
        a1 a1Var2 = this.A0;
        sf.j.c(a1Var2);
        e0();
        a1Var2.U.setLayoutManager(new LinearLayoutManager(1));
        a1 a1Var3 = this.A0;
        sf.j.c(a1Var3);
        j jVar = this.B0;
        if (jVar != null) {
            a1Var3.U.setAdapter(jVar);
            this.D0 = a3.a.a(e0());
            j jVar2 = this.B0;
            if (jVar2 != null) {
                jVar2.q(new pd.g(this));
                a1 a1Var4 = this.A0;
                sf.j.c(a1Var4);
                a1Var4.S.setOnClickListener(new sc.b(14, this));
                zd.d.a(this);
                x o10 = o();
                if (!(o10 == null || (onBackPressedDispatcher = o10.D) == null)) {
                    onBackPressedDispatcher.a(z(), new a(this));
                }
                a1 a1Var5 = this.A0;
                sf.j.c(a1Var5);
                View view = a1Var5.G;
                sf.j.e(view, "binding.root");
                return view;
            }
            sf.j.l("adapter");
            throw null;
        }
        sf.j.l("adapter");
        throw null;
    }

    public final void N() {
        this.f2062b0 = true;
        this.A0 = null;
    }

    public final void Z(View view) {
        sf.j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new pd.b(this, (jf.d<? super pd.b>) null), 3);
        ((HistoryViewModel) this.C0.getValue()).f7075h.e(z(), new b(new pd.e(this)));
    }
}
