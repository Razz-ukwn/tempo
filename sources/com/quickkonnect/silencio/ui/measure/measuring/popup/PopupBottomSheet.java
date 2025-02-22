package com.quickkonnect.silencio.ui.measure.measuring.popup;

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
import b3.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.quickkonnect.silencio.R;
import jf.f;
import nc.l0;
import sf.j;
import sf.k;
import sf.w;
import x2.a;

public final class PopupBottomSheet extends nd.a {
    public static final /* synthetic */ int T0 = 0;
    public l0 Q0;
    public final k0 R0;
    public final g S0 = new g(w.a(nd.c.class), new a(this));

    public static final class a extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7048a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(0);
            this.f7048a = pVar;
        }

        public final Object d() {
            p pVar = this.f7048a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public static final class b extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7049a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f7049a = pVar;
        }

        public final Object d() {
            return this.f7049a;
        }
    }

    public static final class c extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7050a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f7050a = bVar;
        }

        public final Object d() {
            return (p0) this.f7050a.d();
        }
    }

    public static final class d extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7051a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f7051a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7051a, "owner.viewModelStore");
        }
    }

    public static final class e extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7052a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f7052a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7052a);
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
        public final /* synthetic */ p f7053a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7054b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f7053a = pVar;
            this.f7054b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7054b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7053a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public PopupBottomSheet() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.R0 = z0.e(this, w.a(PopupViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        int i8 = l0.X;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.e.f1771a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
        this.Q0 = (l0) ViewDataBinding.p(layoutInflater, R.layout.bottom_sheet_popup, viewGroup, false, (Object) null);
        Dialog dialog = this.G0;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar != null) {
            bottomSheetBehavior = bVar.h();
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.C(3);
        }
        l0 l0Var = this.Q0;
        j.c(l0Var);
        l0Var.w((PopupViewModel) this.R0.getValue());
        l0 l0Var2 = this.Q0;
        j.c(l0Var2);
        l0Var2.v(z());
        g gVar = this.S0;
        if (((nd.c) gVar.getValue()).f11893a) {
            l0 l0Var3 = this.Q0;
            j.c(l0Var3);
            l0Var3.U.setText(x(R.string.congratulations));
            l0 l0Var4 = this.Q0;
            j.c(l0Var4);
            l0Var4.T.setText(x(R.string.popup_subtext));
        }
        if (((nd.c) gVar.getValue()).f11894b) {
            l0 l0Var5 = this.Q0;
            j.c(l0Var5);
            l0Var5.U.setText(x(R.string.interrupted_by_microphone));
            l0 l0Var6 = this.Q0;
            j.c(l0Var6);
            l0Var6.T.setText(x(R.string.interrupted_by_microphone_message));
        }
        if (((nd.c) gVar.getValue()).f11895c) {
            l0 l0Var7 = this.Q0;
            j.c(l0Var7);
            l0Var7.U.setText(x(R.string.hey_there_speedster));
            l0 l0Var8 = this.Q0;
            j.c(l0Var8);
            l0Var8.T.setText(x(R.string.speed_limit_popup_message));
        }
        l0 l0Var9 = this.Q0;
        j.c(l0Var9);
        l0Var9.S.setOnClickListener(new sc.b(13, this));
        this.B0 = false;
        Dialog dialog2 = this.G0;
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        l0 l0Var10 = this.Q0;
        j.c(l0Var10);
        View view = l0Var10.G;
        j.e(view, "binding.root");
        return view;
    }

    public final void N() {
        super.N();
        this.Q0 = null;
    }

    public final void Z(View view) {
        j.f(view, "view");
        cb.b.D(cb.d.I(this), (f.b) null, 0, new nd.b(this, (jf.d<? super nd.b>) null), 3);
    }
}
