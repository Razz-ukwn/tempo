package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;

public final class d extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f2877a;

    public d(ViewPager2 viewPager2) {
        this.f2877a = viewPager2;
    }

    public final void a(int i8) {
        if (i8 == 0) {
            this.f2877a.c();
        }
    }

    public final void c(int i8) {
        ViewPager2 viewPager2 = this.f2877a;
        if (viewPager2.f2846d != i8) {
            viewPager2.f2846d = i8;
            viewPager2.P.b();
        }
    }
}
