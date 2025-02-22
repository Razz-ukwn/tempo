package cc;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.quickkonnect.silencio.R;
import ff.j;
import ff.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jf.d;
import jf.f;
import mb.a;
import rf.l;
import sf.i;
import sf.k;
import yb.c;
import yb.e;

public final class a extends e<d> {
    public static final /* synthetic */ int C0 = 0;
    public final rb.a A0 = rb.a.V;
    public final LinkedHashMap B0 = new LinkedHashMap();

    /* renamed from: y0  reason: collision with root package name */
    public final j f3956y0 = b7.a.x(new b(this));

    /* renamed from: z0  reason: collision with root package name */
    public nb.a f3957z0;

    /* renamed from: cc.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0063a extends i implements l<mb.a<ArrayList<nb.b>>, m> {
        public C0063a(Object obj) {
            super(1, obj, a.class, "handleFetchedData", "handleFetchedData(Lcom/lassi/data/common/Response;)V");
        }

        public final Object invoke(Object obj) {
            mb.a aVar = (mb.a) obj;
            a aVar2 = (a) this.f14944b;
            int i8 = a.C0;
            aVar2.q();
            rb.a aVar3 = aVar2.A0;
            ((RecyclerView) aVar2.u0(R.id.rvMedia)).setLayoutManager(new GridLayoutManager(aVar3.H));
            j jVar = aVar2.f3956y0;
            ((RecyclerView) aVar2.u0(R.id.rvMedia)).setAdapter((dc.b) jVar.getValue());
            ((RecyclerView) aVar2.u0(R.id.rvMedia)).g(new zb.a(aVar3.H));
            if (aVar instanceof a.c) {
                a.c cVar = (a.c) aVar;
                ((ArrayList) cVar.f11372a).size();
                dc.b bVar = (dc.b) jVar.getValue();
                ArrayList arrayList = (ArrayList) cVar.f11372a;
                if (arrayList != null) {
                    ArrayList<nb.b> arrayList2 = bVar.B;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                bVar.g();
            } else {
                boolean z10 = aVar instanceof a.C0215a;
            }
            return m.f8717a;
        }
    }

    public static final class b extends k implements rf.a<dc.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f3958a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f3958a = aVar;
        }

        public final Object d() {
            return new dc.b(new b(this.f3958a));
        }
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        i0(true);
    }

    public final /* synthetic */ void N() {
        super.N();
        n0();
    }

    public final void T(Menu menu) {
        sf.j.f(menu, "menu");
        MenuItem findItem = menu.findItem(R.id.menuCamera);
        if (findItem != null) {
            findItem.setVisible(false);
        }
    }

    public final void n0() {
        this.B0.clear();
    }

    public final void o0() {
        Bundle bundle = this.C;
        if (bundle != null) {
            this.f3957z0 = (nb.a) bundle.getParcelable("selectedFolder");
        }
    }

    public final int p0() {
        return R.layout.fragment_media_picker;
    }

    public final void q0() {
        String str;
        ((RecyclerView) u0(R.id.rvMedia)).setBackgroundColor(rb.a.V.f14190e);
        nb.a aVar = this.f3957z0;
        if (!(aVar == null || (str = aVar.f11615a) == null)) {
            d dVar = (d) s0();
            dVar.getClass();
            cb.b.D(gc.b.o(dVar), (f.b) null, 0, new c(dVar, str, (d<? super c>) null), 3);
        }
        ((ProgressBar) u0(R.id.progressBar)).getIndeterminateDrawable().setColorFilter(v1.a.a(this.A0.f14189d));
    }

    public final c r0() {
        return (d) new m0((p0) d0(), (m0.b) new bc.j(d0(), 1)).a(d.class);
    }

    public final void t0() {
        ((d) s0()).f3967h.e(z(), new qb.a(new C0063a(this)));
    }

    public final View u0(int i8) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B0;
        View view = (View) linkedHashMap.get(Integer.valueOf(i8));
        if (view != null) {
            return view;
        }
        View view2 = this.f2066d0;
        if (view2 == null || (findViewById = view2.findViewById(i8)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i8), findViewById);
        return findViewById;
    }
}
