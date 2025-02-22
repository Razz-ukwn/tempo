package le;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.quickkonnect.silencio.R;
import je.e;
import ke.m;
import sf.j;

public final class k extends a {

    /* renamed from: w0  reason: collision with root package name */
    public TabLayout f11104w0;

    /* renamed from: x0  reason: collision with root package name */
    public ViewPager f11105x0;

    /* renamed from: y0  reason: collision with root package name */
    public a f11106y0;

    public interface a {
    }

    public final void I(Context context) {
        j.f(context, "context");
        super.I(context);
        if (context instanceof a) {
            this.f11106y0 = (a) context;
            return;
        }
        throw new RuntimeException(context + " must implement MediaPickerFragment");
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_media_picker, viewGroup, false);
    }

    public final /* synthetic */ void N() {
        super.N();
    }

    public final void O() {
        this.f2062b0 = true;
    }

    public final void Z(View view) {
        j.f(view, "view");
        View findViewById = view.findViewById(R.id.tabs);
        j.e(findViewById, "view.findViewById(R.id.tabs)");
        this.f11104w0 = (TabLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.viewPager);
        j.e(findViewById2, "view.findViewById(R.id.viewPager)");
        this.f11105x0 = (ViewPager) findViewById2;
        TabLayout tabLayout = this.f11104w0;
        if (tabLayout != null) {
            tabLayout.setTabGravity(0);
            TabLayout tabLayout2 = this.f11104w0;
            if (tabLayout2 != null) {
                tabLayout2.setTabMode(1);
                i0 p10 = p();
                j.e(p10, "childFragmentManager");
                m mVar = new m(p10);
                if (e.f10004l) {
                    int i8 = e.f9998f;
                    int i10 = e.f9999g;
                    j jVar = new j();
                    Bundle bundle = new Bundle();
                    bundle.putInt("FILE_TYPE", 1);
                    bundle.putInt("EXTRA_IMAGE_FILE_SIZE", i8);
                    bundle.putInt("EXTRA__VIDEO_FILE_SIZE", i10);
                    bundle.putInt("FILE_TYPE", 1);
                    jVar.h0(bundle);
                    String x10 = x(R.string.images);
                    j.e(x10, "getString(R.string.images)");
                    mVar.k(jVar, x10);
                } else {
                    int i11 = e.f9998f;
                    int i12 = e.f9999g;
                    e eVar = new e();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("FILE_TYPE", 1);
                    bundle2.putInt("EXTRA_IMAGE_FILE_SIZE", i11);
                    bundle2.putInt("EXTRA__VIDEO_FILE_SIZE", i12);
                    eVar.h0(bundle2);
                    String x11 = x(R.string.images);
                    j.e(x11, "getString(R.string.images)");
                    mVar.k(eVar, x11);
                }
                TabLayout tabLayout3 = this.f11104w0;
                if (tabLayout3 != null) {
                    tabLayout3.setVisibility(8);
                    ViewPager viewPager = this.f11105x0;
                    if (viewPager != null) {
                        viewPager.setAdapter(mVar);
                        TabLayout tabLayout4 = this.f11104w0;
                        if (tabLayout4 != null) {
                            ViewPager viewPager2 = this.f11105x0;
                            if (viewPager2 != null) {
                                tabLayout4.setupWithViewPager(viewPager2);
                            } else {
                                j.l("viewPager");
                                throw null;
                            }
                        } else {
                            j.l("tabLayout");
                            throw null;
                        }
                    } else {
                        j.l("viewPager");
                        throw null;
                    }
                } else {
                    j.l("tabLayout");
                    throw null;
                }
            } else {
                j.l("tabLayout");
                throw null;
            }
        } else {
            j.l("tabLayout");
            throw null;
        }
    }

    public final void n0() {
    }
}
