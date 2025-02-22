package le;

import ag.g0;
import ag.s0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.x;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bumptech.glide.m;
import com.quickkonnect.silencio.R;
import java.util.List;
import ke.i;
import oe.g;
import rf.p;
import sf.j;

public final class e extends a implements ke.a {
    public static final /* synthetic */ int H0 = 0;
    public i A0;
    public ne.c B0;
    public m C0;
    public int D0;
    public int E0 = Integer.MAX_VALUE;
    public int F0 = Integer.MAX_VALUE;
    public MenuItem G0;

    /* renamed from: w0  reason: collision with root package name */
    public RecyclerView f11072w0;

    /* renamed from: x0  reason: collision with root package name */
    public TextView f11073x0;

    /* renamed from: y0  reason: collision with root package name */
    public oe.i f11074y0;

    /* renamed from: z0  reason: collision with root package name */
    public l f11075z0;

    public static final class a extends RecyclerView.r {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f11076a;

        public a(e eVar) {
            this.f11076a = eVar;
        }

        public final void a(int i8, RecyclerView recyclerView) {
            j.f(recyclerView, "recyclerView");
            if (i8 == 0) {
                e.o0(this.f11076a);
            }
        }

        public final void b(RecyclerView recyclerView, int i8, int i10) {
            j.f(recyclerView, "recyclerView");
            int abs = Math.abs(i10);
            int i11 = e.H0;
            e eVar = this.f11076a;
            if (abs > 30) {
                m mVar = eVar.C0;
                if (mVar != null) {
                    mVar.m();
                } else {
                    j.l("mGlideRequestManager");
                    throw null;
                }
            } else {
                e.o0(eVar);
            }
        }
    }

    public static final class b<T> implements w<List<? extends me.d>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f11077a;

        public b(e eVar) {
            this.f11077a = eVar;
        }

        public final void b(Object obj) {
            List list = (List) obj;
            j.e(list, "data");
            int i8 = e.H0;
            e eVar = this.f11077a;
            if (eVar.f2066d0 != null) {
                if (!list.isEmpty()) {
                    TextView textView = eVar.f11073x0;
                    if (textView != null) {
                        textView.setVisibility(8);
                    } else {
                        j.l("emptyView");
                        throw null;
                    }
                } else {
                    TextView textView2 = eVar.f11073x0;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    } else {
                        j.l("emptyView");
                        throw null;
                    }
                }
                Context q10 = eVar.q();
                if (q10 != null) {
                    i iVar = eVar.A0;
                    if (iVar != null) {
                        iVar.r(list, je.e.f9994b);
                        return;
                    }
                    m mVar = eVar.C0;
                    if (mVar != null) {
                        i iVar2 = new i(q10, mVar, list, je.e.f9994b, eVar.D0 == 1 && je.e.f10001i, eVar);
                        eVar.A0 = iVar2;
                        RecyclerView recyclerView = eVar.f11072w0;
                        if (recyclerView != null) {
                            recyclerView.setAdapter(iVar2);
                            i iVar3 = eVar.A0;
                            if (iVar3 != null) {
                                iVar3.C = new f(eVar, list);
                                return;
                            }
                            return;
                        }
                        j.l("recyclerView");
                        throw null;
                    }
                    j.l("mGlideRequestManager");
                    throw null;
                }
            }
        }
    }

    public static final class c<T> implements w<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f11078a;

        public c(e eVar) {
            this.f11078a = eVar;
        }

        public final void b(Object obj) {
            Boolean bool = (Boolean) obj;
            e eVar = this.f11078a;
            oe.i iVar = eVar.f11074y0;
            if (iVar != null) {
                iVar.f(new g(iVar, (String) null, eVar.D0, eVar.E0, eVar.F0, (jf.d) null));
                return;
            }
            j.l("viewModel");
            throw null;
        }
    }

    @lf.e(c = "droidninja.filepicker.fragments.MediaDetailPickerFragment$onActivityResult$1", f = "MediaDetailPickerFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends lf.i implements p<g0, jf.d<? super ff.m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public g0 f11079a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f11080b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(e eVar, jf.d dVar) {
            super(2, dVar);
            this.f11080b = eVar;
        }

        public final jf.d<ff.m> create(Object obj, jf.d<?> dVar) {
            j.f(dVar, "completion");
            d dVar2 = new d(this.f11080b, dVar);
            dVar2.f11079a = (g0) obj;
            return dVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create(obj, (jf.d) obj2)).invokeSuspend(ff.m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            Uri uri;
            cb.b.J(obj);
            ne.c cVar = this.f11080b.B0;
            if (!(cVar == null || (uri = cVar.f11900a) == null)) {
                cVar.f11901b.getContentResolver().delete(uri, (String) null, (String[]) null);
            }
            return ff.m.f8717a;
        }
    }

    public static final void o0(e eVar) {
        x o10 = eVar.o();
        if (o10 == null || (!o10.isDestroyed() && !o10.isFinishing())) {
            m mVar = eVar.C0;
            if (mVar != null) {
                mVar.n();
            } else {
                j.l("mGlideRequestManager");
                throw null;
            }
        }
    }

    public final void G(int i8, int i10, Intent intent) {
        super.G(i8, i10, intent);
        if (i8 == 257) {
            Uri uri = null;
            if (i10 == -1) {
                ne.c cVar = this.B0;
                if (cVar != null) {
                    uri = cVar.f11900a;
                }
                if (uri != null && je.e.f9993a == 1) {
                    je.e.b(uri, 1);
                    l lVar = this.f11075z0;
                    if (lVar != null) {
                        lVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            cb.b.D(this.f11061v0, s0.f481b, 0, new d(this, (jf.d) null), 2);
        }
    }

    public final void I(Context context) {
        j.f(context, "context");
        super.I(context);
        if (context instanceof l) {
            this.f11075z0 = (l) context;
            return;
        }
        throw new RuntimeException(context + " must implement PhotoPickerFragmentListener");
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        int i8 = je.e.f9993a;
        i0(false);
        m e10 = com.bumptech.glide.b.e(this);
        j.e(e10, "Glide.with(this)");
        this.C0 = e10;
        this.f11074y0 = (oe.i) new m0((p0) this, (m0.b) new m0.a(d0().getApplication())).a(oe.i.class);
    }

    public final void K(Menu menu, MenuInflater menuInflater) {
        j.f(menu, "menu");
        j.f(menuInflater, "inflater");
        menuInflater.inflate(R.menu.select_menu, menu);
        this.G0 = menu.findItem(R.id.action_select);
        MenuItem findItem = menu.findItem(R.id.action_done);
        if (findItem != null) {
            int i8 = je.e.f9993a;
            boolean z10 = true;
            if (je.e.f9993a <= 1) {
                z10 = false;
            }
            findItem.setVisible(z10);
        }
        a();
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_photo_picker, viewGroup, false);
    }

    public final /* synthetic */ void N() {
        super.N();
    }

    public final void O() {
        this.f2062b0 = true;
        this.f11075z0 = null;
    }

    public final boolean R(MenuItem menuItem) {
        j.f(menuItem, "item");
        if (menuItem.getItemId() != R.id.action_select) {
            return false;
        }
        i iVar = this.A0;
        if (iVar != null) {
            iVar.q();
            MenuItem menuItem2 = this.G0;
            if (menuItem2 != null) {
                if (menuItem2.isChecked()) {
                    je.e.f9994b.clear();
                    je.e.f9995c.clear();
                    iVar.f10463e.clear();
                    iVar.g();
                    menuItem2.setIcon(R.drawable.ic_deselect_all);
                } else {
                    iVar.q();
                    int i8 = je.e.f9993a;
                    je.e.a(1, iVar.f10463e);
                    menuItem2.setIcon(R.drawable.ic_select_all);
                }
                MenuItem menuItem3 = this.G0;
                if (menuItem3 != null) {
                    menuItem3.setChecked(!menuItem2.isChecked());
                }
                l lVar = this.f11075z0;
                if (lVar != null) {
                    lVar.a();
                }
            }
        }
        return true;
    }

    public final void Z(View view) {
        j.f(view, "view");
        p0(view);
    }

    public final void a() {
        MenuItem menuItem;
        l lVar = this.f11075z0;
        if (lVar != null) {
            lVar.a();
        }
        i iVar = this.A0;
        if (iVar != null && (menuItem = this.G0) != null && iVar.d() == iVar.f10463e.size()) {
            menuItem.setIcon(R.drawable.ic_select_all);
            menuItem.setChecked(true);
        }
    }

    public final void n0() {
    }

    public final void p0(View view) {
        View findViewById = view.findViewById(R.id.recyclerview);
        j.e(findViewById, "view.findViewById(R.id.recyclerview)");
        this.f11072w0 = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.empty_view);
        j.e(findViewById2, "view.findViewById(R.id.empty_view)");
        this.f11073x0 = (TextView) findViewById2;
        Bundle bundle = this.C;
        if (bundle != null) {
            this.D0 = bundle.getInt("FILE_TYPE");
            this.E0 = bundle.getInt("EXTRA_IMAGE_FILE_SIZE");
            this.F0 = bundle.getInt("EXTRA__VIDEO_FILE_SIZE");
            x o10 = o();
            if (o10 != null) {
                this.B0 = new ne.c(o10);
            }
            Integer num = (Integer) je.e.f10002j.get(je.b.f9989b);
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(num != null ? num.intValue() : 3);
            staggeredGridLayoutManager.d1();
            RecyclerView recyclerView = this.f11072w0;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(staggeredGridLayoutManager);
                RecyclerView recyclerView2 = this.f11072w0;
                if (recyclerView2 != null) {
                    recyclerView2.setItemAnimator(new androidx.recyclerview.widget.e());
                    RecyclerView recyclerView3 = this.f11072w0;
                    if (recyclerView3 != null) {
                        recyclerView3.h(new a(this));
                    } else {
                        j.l("recyclerView");
                        throw null;
                    }
                } else {
                    j.l("recyclerView");
                    throw null;
                }
            } else {
                j.l("recyclerView");
                throw null;
            }
        }
        oe.i iVar = this.f11074y0;
        if (iVar != null) {
            iVar.f12345h.e(z(), new b(this));
            oe.i iVar2 = this.f11074y0;
            if (iVar2 != null) {
                iVar2.f12347j.e(z(), new c(this));
                oe.i iVar3 = this.f11074y0;
                if (iVar3 != null) {
                    iVar3.f(new g(iVar3, (String) null, this.D0, this.E0, this.F0, (jf.d) null));
                } else {
                    j.l("viewModel");
                    throw null;
                }
            } else {
                j.l("viewModel");
                throw null;
            }
        } else {
            j.l("viewModel");
            throw null;
        }
    }
}
