package com.quickkonnect.silencio.ui.tabs.home;

import a9.v;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.a1;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.p;
import androidx.fragment.app.z0;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.w;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.R;
import jf.f;
import nc.d1;
import rf.l;
import sf.j;
import sf.k;
import td.g;
import td.i;
import x2.a;

public final class HomeFragment extends td.a {
    public static final /* synthetic */ int E0 = 0;
    public d1 A0;
    public final k0 B0;
    public a3.a C0;
    public a3.a D0;

    public static final class a implements w, sf.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f7108a;

        public a(l lVar) {
            this.f7108a = lVar;
        }

        public final ff.a<?> a() {
            return this.f7108a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7108a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof sf.f)) {
                return false;
            }
            return j.a(this.f7108a, ((sf.f) obj).a());
        }

        public final int hashCode() {
            return this.f7108a.hashCode();
        }
    }

    public static final class b extends k implements rf.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f7109a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p pVar) {
            super(0);
            this.f7109a = pVar;
        }

        public final Object d() {
            return this.f7109a;
        }
    }

    public static final class c extends k implements rf.a<p0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf.a f7110a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f7110a = bVar;
        }

        public final Object d() {
            return (p0) this.f7110a.d();
        }
    }

    public static final class d extends k implements rf.a<o0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7111a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ff.d dVar) {
            super(0);
            this.f7111a = dVar;
        }

        public final Object d() {
            return a1.a(this.f7111a, "owner.viewModelStore");
        }
    }

    public static final class e extends k implements rf.a<x2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ff.d f7112a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(ff.d dVar) {
            super(0);
            this.f7112a = dVar;
        }

        public final Object d() {
            p0 b10 = z0.b(this.f7112a);
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
        public final /* synthetic */ p f7113a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ff.d f7114b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p pVar, ff.d dVar) {
            super(0);
            this.f7113a = pVar;
            this.f7114b = dVar;
        }

        public final Object d() {
            m0.b bVar;
            p0 b10 = z0.b(this.f7114b);
            h hVar = b10 instanceof h ? (h) b10 : null;
            if (hVar == null || (bVar = hVar.k()) == null) {
                bVar = this.f7113a.k();
            }
            j.e(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public HomeFragment() {
        ff.d w10 = b7.a.w(new c(new b(this)));
        this.B0 = z0.e(this, sf.w.a(HomeViewModel.class), new d(w10), new e(w10), new f(this, w10));
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        int i8 = R.id.ask_silencio_btn;
        MaterialButton materialButton = (MaterialButton) cb.b.x(inflate, R.id.ask_silencio_btn);
        if (materialButton != null) {
            i8 = R.id.card_home_hamburger_menu;
            MaterialCardView materialCardView = (MaterialCardView) cb.b.x(inflate, R.id.card_home_hamburger_menu);
            if (materialCardView != null) {
                i8 = R.id.card_home_noise_coin;
                MaterialCardView materialCardView2 = (MaterialCardView) cb.b.x(inflate, R.id.card_home_noise_coin);
                if (materialCardView2 != null) {
                    i8 = R.id.guidelineTop;
                    Guideline guideline = (Guideline) cb.b.x(inflate, R.id.guidelineTop);
                    if (guideline != null) {
                        i8 = R.id.home_coin_amount;
                        TextView textView = (TextView) cb.b.x(inflate, R.id.home_coin_amount);
                        if (textView != null) {
                            i8 = R.id.home_hours_upload;
                            TextView textView2 = (TextView) cb.b.x(inflate, R.id.home_hours_upload);
                            if (textView2 != null) {
                                i8 = R.id.home_hours_upload_card;
                                if (((MaterialCardView) cb.b.x(inflate, R.id.home_hours_upload_card)) != null) {
                                    i8 = R.id.home_members;
                                    TextView textView3 = (TextView) cb.b.x(inflate, R.id.home_members);
                                    if (textView3 != null) {
                                        i8 = R.id.home_members_card;
                                        if (((MaterialCardView) cb.b.x(inflate, R.id.home_members_card)) != null) {
                                            i8 = R.id.home_noise_coin;
                                            TextView textView4 = (TextView) cb.b.x(inflate, R.id.home_noise_coin);
                                            if (textView4 != null) {
                                                i8 = R.id.home_noise_coin_card;
                                                if (((MaterialCardView) cb.b.x(inflate, R.id.home_noise_coin_card)) != null) {
                                                    i8 = R.id.home_upload;
                                                    TextView textView5 = (TextView) cb.b.x(inflate, R.id.home_upload);
                                                    if (textView5 != null) {
                                                        i8 = R.id.home_uploads_card;
                                                        if (((MaterialCardView) cb.b.x(inflate, R.id.home_uploads_card)) != null) {
                                                            i8 = R.id.imageView2;
                                                            if (((ImageView) cb.b.x(inflate, R.id.imageView2)) != null) {
                                                                i8 = R.id.imageView3;
                                                                if (((ImageView) cb.b.x(inflate, R.id.imageView3)) != null) {
                                                                    i8 = R.id.textView4;
                                                                    if (((TextView) cb.b.x(inflate, R.id.textView4)) != null) {
                                                                        i8 = R.id.textView5;
                                                                        if (((TextView) cb.b.x(inflate, R.id.textView5)) != null) {
                                                                            this.A0 = new d1((NestedScrollView) inflate, materialButton, materialCardView, materialCardView2, guideline, textView, textView2, textView3, textView4, textView5);
                                                                            zd.d.c(this);
                                                                            d1 d1Var = this.A0;
                                                                            j.c(d1Var);
                                                                            d1Var.f11654e.setGuidelineBegin(zd.d.b(this));
                                                                            this.C0 = a3.a.a(e0());
                                                                            this.D0 = a3.a.a(e0());
                                                                            d1 d1Var2 = this.A0;
                                                                            j.c(d1Var2);
                                                                            d1Var2.f11652c.setOnClickListener(new t8.a(this, 15));
                                                                            d1 d1Var3 = this.A0;
                                                                            j.c(d1Var3);
                                                                            d1Var3.f11653d.setOnClickListener(new v(this, 13));
                                                                            d1 d1Var4 = this.A0;
                                                                            j.c(d1Var4);
                                                                            d1Var4.f11651b.setOnClickListener(new a9.h(this, 12));
                                                                            k0 k0Var = this.B0;
                                                                            HomeViewModel homeViewModel = (HomeViewModel) k0Var.getValue();
                                                                            homeViewModel.getClass();
                                                                            cb.b.D(gc.b.o(homeViewModel), (f.b) null, 0, new td.j(homeViewModel, (jf.d<? super td.j>) null), 3);
                                                                            HomeViewModel homeViewModel2 = (HomeViewModel) k0Var.getValue();
                                                                            homeViewModel2.getClass();
                                                                            cb.b.D(gc.b.o(homeViewModel2), (f.b) null, 0, new i(homeViewModel2, (jf.d<? super i>) null), 3);
                                                                            d1 d1Var5 = this.A0;
                                                                            j.c(d1Var5);
                                                                            NestedScrollView nestedScrollView = d1Var5.f11650a;
                                                                            j.e(nestedScrollView, "binding.root");
                                                                            return nestedScrollView;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    public final void V() {
        this.f2062b0 = true;
    }

    public final void Z(View view) {
        j.f(view, "view");
        k0 k0Var = this.B0;
        ((HomeViewModel) k0Var.getValue()).f7117i.e(z(), new a(new td.d(this)));
        ((HomeViewModel) k0Var.getValue()).f7118j.e(z(), new a(new g(this)));
    }
}
