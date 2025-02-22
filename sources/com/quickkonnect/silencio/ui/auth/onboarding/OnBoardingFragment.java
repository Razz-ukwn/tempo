package com.quickkonnect.silencio.ui.auth.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cb.b;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.quickkonnect.silencio.R;
import j0.e;
import java.util.ArrayList;
import nc.y0;
import sf.j;
import yc.a;
import yc.c;
import zd.d;

public final class OnBoardingFragment extends p {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f6797y0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public y0 f6798v0;

    /* renamed from: w0  reason: collision with root package name */
    public a f6799w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f6800x0;

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_on_boarding, viewGroup, false);
        int i8 = R.id.btn_on_boarding_continue;
        MaterialButton materialButton = (MaterialButton) b.x(inflate, R.id.btn_on_boarding_continue);
        if (materialButton != null) {
            i8 = R.id.guidelineTop;
            Guideline guideline = (Guideline) b.x(inflate, R.id.guidelineTop);
            if (guideline != null) {
                i8 = R.id.tl_on_boarding;
                TabLayout tabLayout = (TabLayout) b.x(inflate, R.id.tl_on_boarding);
                if (tabLayout != null) {
                    i8 = R.id.vp_on_boarding;
                    ViewPager2 viewPager2 = (ViewPager2) b.x(inflate, R.id.vp_on_boarding);
                    if (viewPager2 != null) {
                        this.f6798v0 = new y0((ConstraintLayout) inflate, materialButton, guideline, tabLayout, viewPager2);
                        guideline.setGuidelineBegin(d.b(this));
                        ArrayList arrayList = new ArrayList();
                        yc.d dVar = new yc.d();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("TITLE", x(R.string.on_boarding_title_1));
                        bundle2.putString("SUB_TITLE", x(R.string.on_boarding_sub_title_1));
                        bundle2.putInt("PAGE_NO", 1);
                        dVar.h0(bundle2);
                        arrayList.add(dVar);
                        yc.d dVar2 = new yc.d();
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("TITLE", x(R.string.on_boarding_title_2));
                        bundle3.putString("SUB_TITLE", x(R.string.on_boarding_sub_title_2));
                        bundle3.putInt("PAGE_NO", 2);
                        dVar2.h0(bundle3);
                        arrayList.add(dVar2);
                        yc.d dVar3 = new yc.d();
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("TITLE", x(R.string.on_boarding_title_3));
                        bundle4.putString("SUB_TITLE", x(R.string.on_boarding_sub_title_3));
                        bundle4.putInt("PAGE_NO", 3);
                        dVar3.h0(bundle4);
                        arrayList.add(dVar3);
                        yc.d dVar4 = new yc.d();
                        Bundle bundle5 = new Bundle();
                        bundle5.putString("TITLE", x(R.string.on_boarding_title_4));
                        bundle5.putString("SUB_TITLE", x(R.string.on_boarding_sub_title_4));
                        bundle5.putInt("PAGE_NO", 4);
                        dVar4.h0(bundle5);
                        arrayList.add(dVar4);
                        yc.d dVar5 = new yc.d();
                        Bundle bundle6 = new Bundle();
                        bundle6.putString("TITLE", x(R.string.on_boarding_title_5));
                        bundle6.putString("SUB_TITLE", x(R.string.on_boarding_sub_title_5));
                        bundle6.putInt("PAGE_NO", 5);
                        dVar5.h0(bundle6);
                        arrayList.add(dVar5);
                        this.f6799w0 = new a(d0(), arrayList);
                        y0 y0Var = this.f6798v0;
                        j.c(y0Var);
                        ViewPager2 viewPager22 = (ViewPager2) y0Var.f11877e;
                        a aVar = this.f6799w0;
                        if (aVar != null) {
                            viewPager22.setAdapter(aVar);
                            y0 y0Var2 = this.f6798v0;
                            j.c(y0Var2);
                            TabLayout tabLayout2 = (TabLayout) y0Var2.f11876d;
                            y0 y0Var3 = this.f6798v0;
                            j.c(y0Var3);
                            ViewPager2 viewPager23 = (ViewPager2) y0Var3.f11877e;
                            com.google.android.material.tabs.d dVar6 = new com.google.android.material.tabs.d(tabLayout2, viewPager23, new e());
                            if (!dVar6.f6164e) {
                                RecyclerView.e<?> adapter = viewPager23.getAdapter();
                                dVar6.f6163d = adapter;
                                if (adapter != null) {
                                    dVar6.f6164e = true;
                                    viewPager23.f2845c.f2861a.add(new d.c(tabLayout2));
                                    tabLayout2.a(new d.C0078d(viewPager23, true));
                                    dVar6.f6163d.o(new d.a());
                                    dVar6.a();
                                    tabLayout2.n(viewPager23.getCurrentItem(), 0.0f, true, true);
                                    y0 y0Var4 = this.f6798v0;
                                    j.c(y0Var4);
                                    ((ViewPager2) y0Var4.f11877e).f2845c.f2861a.add(new c(this));
                                    y0 y0Var5 = this.f6798v0;
                                    j.c(y0Var5);
                                    MaterialButton materialButton2 = (MaterialButton) y0Var5.f11874b;
                                    j.e(materialButton2, "binding.btnOnBoardingContinue");
                                    zd.e.a(materialButton2, new yc.b(this));
                                    y0 y0Var6 = this.f6798v0;
                                    j.c(y0Var6);
                                    ConstraintLayout constraintLayout = (ConstraintLayout) y0Var6.f11873a;
                                    j.e(constraintLayout, "binding.root");
                                    return constraintLayout;
                                }
                                throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
                            }
                            throw new IllegalStateException("TabLayoutMediator is already attached");
                        }
                        j.l("adapter");
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    public final void N() {
        this.f2062b0 = true;
        this.f6798v0 = null;
    }
}
