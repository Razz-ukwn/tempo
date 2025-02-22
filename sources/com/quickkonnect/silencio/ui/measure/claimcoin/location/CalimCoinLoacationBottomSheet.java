package com.quickkonnect.silencio.ui.measure.claimcoin.location;

import a9.h;
import a9.v;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.p;
import androidx.fragment.app.q;
import b3.g;
import cb.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.c;
import com.google.android.material.card.MaterialCardView;
import com.quickkonnect.silencio.R;
import nc.d;
import sf.j;
import sf.k;
import sf.w;

public final class CalimCoinLoacationBottomSheet extends c {
    public static final /* synthetic */ int N0 = 0;
    public d L0;
    public final g M0 = new g(w.a(gd.a.class), new a(this));

    public static final class a extends k implements rf.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f6906a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar) {
            super(0);
            this.f6906a = pVar;
        }

        public final Object d() {
            p pVar = this.f6906a;
            Bundle bundle = pVar.C;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(q.b("Fragment ", pVar, " has null arguments"));
        }
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_calim_coin_loacation, viewGroup, false);
        int i8 = R.id.btn_close_claim_yor_coin_location;
        ImageView imageView = (ImageView) b.x(inflate, R.id.btn_close_claim_yor_coin_location);
        if (imageView != null) {
            i8 = R.id.card_location_indoor;
            MaterialCardView materialCardView = (MaterialCardView) b.x(inflate, R.id.card_location_indoor);
            if (materialCardView != null) {
                i8 = R.id.card_location_outdoor;
                MaterialCardView materialCardView2 = (MaterialCardView) b.x(inflate, R.id.card_location_outdoor);
                if (materialCardView2 != null) {
                    i8 = R.id.imageView13;
                    if (((ImageView) b.x(inflate, R.id.imageView13)) != null) {
                        i8 = R.id.imageView14;
                        if (((ImageView) b.x(inflate, R.id.imageView14)) != null) {
                            i8 = R.id.textView62;
                            if (((TextView) b.x(inflate, R.id.textView62)) != null) {
                                i8 = R.id.textView66;
                                if (((TextView) b.x(inflate, R.id.textView66)) != null) {
                                    i8 = R.id.textView68;
                                    if (((TextView) b.x(inflate, R.id.textView68)) != null) {
                                        i8 = R.id.textView72;
                                        if (((TextView) b.x(inflate, R.id.textView72)) != null) {
                                            i8 = R.id.textView73;
                                            if (((TextView) b.x(inflate, R.id.textView73)) != null) {
                                                i8 = R.id.textView74;
                                                if (((TextView) b.x(inflate, R.id.textView74)) != null) {
                                                    this.L0 = new d((NestedScrollView) inflate, imageView, materialCardView, materialCardView2);
                                                    Dialog dialog = this.G0;
                                                    BottomSheetBehavior<FrameLayout> bottomSheetBehavior = null;
                                                    com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
                                                    if (bVar != null) {
                                                        bottomSheetBehavior = bVar.h();
                                                    }
                                                    if (bottomSheetBehavior != null) {
                                                        bottomSheetBehavior.C(3);
                                                    }
                                                    d dVar = this.L0;
                                                    j.c(dVar);
                                                    dVar.f11645b.setOnClickListener(new v(this, 9));
                                                    d dVar2 = this.L0;
                                                    j.c(dVar2);
                                                    dVar2.f11646c.setOnClickListener(new h(this, 8));
                                                    d dVar3 = this.L0;
                                                    j.c(dVar3);
                                                    dVar3.f11647d.setOnClickListener(new sc.a(this, 8));
                                                    d dVar4 = this.L0;
                                                    j.c(dVar4);
                                                    NestedScrollView nestedScrollView = dVar4.f11644a;
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    public final void N() {
        super.N();
        this.L0 = null;
    }
}
