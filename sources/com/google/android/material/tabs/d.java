package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.quickkonnect.silencio.ui.auth.onboarding.OnBoardingFragment;
import j0.e;
import java.lang.ref.WeakReference;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final TabLayout f6160a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f6161b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6162c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.e<?> f6163d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6164e;

    public class a extends RecyclerView.g {
        public a() {
        }

        public final void a() {
            d.this.a();
        }

        public final void b() {
            d.this.a();
        }

        public final void c(Object obj, int i8, int i10) {
            d.this.a();
        }

        public final void d(int i8, int i10) {
            d.this.a();
        }

        public final void e(int i8, int i10) {
            d.this.a();
        }

        public final void f(int i8, int i10) {
            d.this.a();
        }
    }

    public interface b {
    }

    public static class c extends ViewPager2.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f6166a;

        /* renamed from: b  reason: collision with root package name */
        public int f6167b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f6168c = 0;

        public c(TabLayout tabLayout) {
            this.f6166a = new WeakReference<>(tabLayout);
        }

        public final void a(int i8) {
            this.f6167b = this.f6168c;
            this.f6168c = i8;
            TabLayout tabLayout = this.f6166a.get();
            if (tabLayout != null) {
                tabLayout.f6128t0 = this.f6168c;
            }
        }

        public final void b(float f10, int i8, int i10) {
            TabLayout tabLayout = this.f6166a.get();
            if (tabLayout != null) {
                int i11 = this.f6168c;
                boolean z10 = false;
                boolean z11 = i11 != 2 || this.f6167b == 1;
                if (!(i11 == 2 && this.f6167b == 0)) {
                    z10 = true;
                }
                tabLayout.n(i8, f10, z11, z10);
            }
        }

        public final void c(int i8) {
            TabLayout tabLayout = this.f6166a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i8 && i8 < tabLayout.getTabCount()) {
                int i10 = this.f6168c;
                tabLayout.l(tabLayout.h(i8), i10 == 0 || (i10 == 2 && this.f6167b == 0));
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d  reason: collision with other inner class name */
    public static class C0078d implements TabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager2 f6169a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6170b;

        public C0078d(ViewPager2 viewPager2, boolean z10) {
            this.f6169a = viewPager2;
            this.f6170b = z10;
        }

        public final void a() {
        }

        public final void b(TabLayout.g gVar) {
            int i8 = gVar.f6140d;
            ViewPager2 viewPager2 = this.f6169a;
            if (!((androidx.viewpager2.widget.c) viewPager2.J.f16473b).m) {
                viewPager2.b(i8, this.f6170b);
                return;
            }
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }

        public final void c() {
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, e eVar) {
        this.f6160a = tabLayout;
        this.f6161b = viewPager2;
        this.f6162c = eVar;
    }

    public final void a() {
        int min;
        TabLayout tabLayout = this.f6160a;
        tabLayout.k();
        RecyclerView.e<?> eVar = this.f6163d;
        if (eVar != null) {
            int d10 = eVar.d();
            for (int i8 = 0; i8 < d10; i8++) {
                TabLayout.g i10 = tabLayout.i();
                ((e) this.f6162c).getClass();
                int i11 = OnBoardingFragment.f6797y0;
                tabLayout.b(i10, false);
            }
            if (d10 > 0 && (min = Math.min(this.f6161b.getCurrentItem(), tabLayout.getTabCount() - 1)) != tabLayout.getSelectedTabPosition()) {
                tabLayout.l(tabLayout.h(min), true);
            }
        }
    }
}
