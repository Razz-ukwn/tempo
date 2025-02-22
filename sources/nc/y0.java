package nc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f11873a;

    /* renamed from: b  reason: collision with root package name */
    public final View f11874b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f11875c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f11876d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f11877e;

    public /* synthetic */ y0(DrawerLayout drawerLayout, a aVar, DrawerLayout drawerLayout2, NavigationView navigationView, z0 z0Var) {
        this.f11873a = drawerLayout;
        this.f11875c = aVar;
        this.f11874b = drawerLayout2;
        this.f11876d = navigationView;
        this.f11877e = z0Var;
    }

    public /* synthetic */ y0(ConstraintLayout constraintLayout, MaterialButton materialButton, Guideline guideline, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f11873a = constraintLayout;
        this.f11874b = materialButton;
        this.f11875c = guideline;
        this.f11876d = tabLayout;
        this.f11877e = viewPager2;
    }
}
