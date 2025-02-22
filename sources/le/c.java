package le;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.i0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import java.util.Comparator;
import je.e;
import ke.m;
import ne.d;
import oe.f;
import sf.j;

public final class c extends a {
    public a A0;

    /* renamed from: w0  reason: collision with root package name */
    public TabLayout f11067w0;

    /* renamed from: x0  reason: collision with root package name */
    public f f11068x0;

    /* renamed from: y0  reason: collision with root package name */
    public ViewPager f11069y0;

    /* renamed from: z0  reason: collision with root package name */
    public ProgressBar f11070z0;

    public interface a {
    }

    public final void I(Context context) {
        j.f(context, "context");
        super.I(context);
        if (context instanceof a) {
            this.A0 = (a) context;
            return;
        }
        throw new RuntimeException(context + " must implement DocPickerFragmentListener");
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        i0(true);
        this.f11068x0 = (f) new m0((p0) this, (m0.b) new m0.a(d0().getApplication())).a(f.class);
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_doc_picker, viewGroup, false);
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
        this.f11067w0 = (TabLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.viewPager);
        j.e(findViewById2, "view.findViewById(R.id.viewPager)");
        this.f11069y0 = (ViewPager) findViewById2;
        this.f11070z0 = (ProgressBar) view.findViewById(R.id.progress_bar);
        TabLayout tabLayout = this.f11067w0;
        if (tabLayout != null) {
            tabLayout.setTabGravity(0);
            TabLayout tabLayout2 = this.f11067w0;
            if (tabLayout2 != null) {
                tabLayout2.setTabMode(0);
                i0 p10 = p();
                j.e(p10, "childFragmentManager");
                m mVar = new m(p10);
                int i8 = e.f9993a;
                ArrayList arrayList = new ArrayList(e.f9996d);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = arrayList.get(i10);
                    j.e(obj, "supportedTypes[index]");
                    b bVar = new b();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("FILE_TYPE", (me.c) obj);
                    bVar.h0(bundle);
                    mVar.k(bVar, ((me.c) arrayList.get(i10)).f11468a);
                }
                ViewPager viewPager = this.f11069y0;
                if (viewPager != null) {
                    viewPager.setOffscreenPageLimit(arrayList.size());
                    ViewPager viewPager2 = this.f11069y0;
                    if (viewPager2 != null) {
                        viewPager2.setAdapter(mVar);
                        TabLayout tabLayout3 = this.f11067w0;
                        if (tabLayout3 != null) {
                            ViewPager viewPager3 = this.f11069y0;
                            if (viewPager3 != null) {
                                tabLayout3.setupWithViewPager(viewPager3);
                                TabLayout tabLayout4 = this.f11067w0;
                                if (tabLayout4 != null) {
                                    ViewPager viewPager4 = this.f11069y0;
                                    if (viewPager4 != null) {
                                        d dVar = new d(tabLayout4, viewPager4);
                                        if (!dVar.f11908g) {
                                            dVar.f11908g = true;
                                            dVar.a(-1);
                                        }
                                        f fVar = this.f11068x0;
                                        if (fVar != null) {
                                            fVar.f12333h.e(z(), new d(this));
                                            f fVar2 = this.f11068x0;
                                            if (fVar2 != null) {
                                                int i11 = e.f9993a;
                                                fVar2.f(new oe.c(fVar2, new ArrayList(e.f9996d), (Comparator) null, (jf.d) null));
                                                return;
                                            }
                                            j.l("viewModel");
                                            throw null;
                                        }
                                        j.l("viewModel");
                                        throw null;
                                    }
                                    j.l("viewPager");
                                    throw null;
                                }
                                j.l("tabLayout");
                                throw null;
                            }
                            j.l("viewPager");
                            throw null;
                        }
                        j.l("tabLayout");
                        throw null;
                    }
                    j.l("viewPager");
                    throw null;
                }
                j.l("viewPager");
                throw null;
            }
            j.l("tabLayout");
            throw null;
        }
        j.l("tabLayout");
        throw null;
    }

    public final void n0() {
    }
}
