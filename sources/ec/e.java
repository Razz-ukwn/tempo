package ec;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.fragment.app.o;
import androidx.fragment.app.y0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bc.c;
import cb.d;
import com.quickkonnect.silencio.R;
import ff.j;
import ff.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import mb.a;
import rf.l;
import sf.k;

public final class e extends yb.e<g> {
    public static final /* synthetic */ int G0 = 0;
    public final ArrayList A0 = d.Q("android.permission.READ_MEDIA_VIDEO");
    public final ArrayList B0 = d.Q("android.permission.READ_MEDIA_AUDIO");
    public final o C0 = ((o) c0(new c(this, 1), new c.e()));
    public final o D0 = ((o) c0(new a(this), new c.c()));
    public final j E0 = b7.a.x(new a(this));
    public final LinkedHashMap F0 = new LinkedHashMap();

    /* renamed from: y0  reason: collision with root package name */
    public boolean f7913y0 = true;

    /* renamed from: z0  reason: collision with root package name */
    public final ArrayList f7914z0 = d.Q("android.permission.READ_MEDIA_IMAGES");

    public static final class a extends k implements rf.a<fc.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f7915a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f7915a = eVar;
        }

        public final Object d() {
            return new fc.b(new d(this.f7915a));
        }
    }

    public static final class b extends k implements l<mb.a<ArrayList<nb.a>>, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f7916a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar) {
            super(1);
            this.f7916a = eVar;
        }

        public final Object invoke(Object obj) {
            mb.a aVar = (mb.a) obj;
            sf.j.f(aVar, "response");
            boolean z10 = aVar instanceof a.b;
            e eVar = this.f7916a;
            if (z10) {
                ((TextView) eVar.u0(R.id.tvNoDataFound)).setVisibility(8);
                ProgressBar progressBar = (ProgressBar) eVar.u0(R.id.progressBar);
                sf.j.e(progressBar, "progressBar");
                progressBar.setVisibility(0);
            } else if (!(aVar instanceof a.c) && (aVar instanceof a.C0215a)) {
                ProgressBar progressBar2 = (ProgressBar) eVar.u0(R.id.progressBar);
                sf.j.e(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                ((a.C0215a) aVar).f11371a.printStackTrace();
            }
            return m.f8717a;
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
        int i8;
        sf.j.f(menu, "menu");
        MenuItem findItem = menu.findItem(R.id.menuCamera);
        if (findItem != null) {
            rb.a aVar = rb.a.V;
            int i10 = aVar.F;
            boolean z10 = true;
            if (!((i10 == 1 || i10 == 2) && ((i8 = aVar.I) == 3 || i8 == 1))) {
                z10 = false;
            }
            findItem.setVisible(z10);
        }
    }

    public final void n0() {
        this.F0.clear();
    }

    public final int p0() {
        return R.layout.fragment_media_picker;
    }

    public final void q0() {
        rb.a aVar = rb.a.V;
        ((RecyclerView) u0(R.id.rvMedia)).setBackgroundColor(aVar.f14190e);
        q();
        ((RecyclerView) u0(R.id.rvMedia)).setLayoutManager(new GridLayoutManager(aVar.H));
        ((RecyclerView) u0(R.id.rvMedia)).setAdapter((fc.b) this.E0.getValue());
        ((RecyclerView) u0(R.id.rvMedia)).g(new zb.a(aVar.H));
        ((ProgressBar) u0(R.id.progressBar)).getIndeterminateDrawable().setColorFilter(v1.a.a(aVar.f14189d));
        v0();
    }

    public final yb.c r0() {
        return (g) new m0((p0) d0(), (m0.b) new i(d0())).a(g.class);
    }

    public final void t0() {
        qb.c cVar = ((g) s0()).f7923g;
        y0 z10 = z();
        b bVar = new b(this);
        sf.j.f(cVar, "<this>");
        cVar.e(z10, new kb.b(bVar));
        ((g) s0()).f7924h.e(z(), new b(this));
        ((g) s0()).f7925i.e(z(), new c(this));
    }

    public final View u0(int i8) {
        View findViewById;
        Integer valueOf = Integer.valueOf(i8);
        LinkedHashMap linkedHashMap = this.F0;
        View view = (View) linkedHashMap.get(valueOf);
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

    public final void v0() {
        int i8 = Build.VERSION.SDK_INT;
        o oVar = this.D0;
        if (i8 >= 33) {
            int i10 = rb.a.V.F;
            boolean z10 = true;
            if (i10 == 1) {
                if (!this.f7913y0 || t1.a.a(e0(), "android.permission.READ_MEDIA_IMAGES") == 0) {
                    z10 = false;
                }
                this.f7913y0 = z10;
                Object[] array = this.f7914z0.toArray(new String[0]);
                sf.j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                oVar.a(array);
            } else if (i10 == 2) {
                if (!this.f7913y0 || t1.a.a(e0(), "android.permission.READ_MEDIA_VIDEO") == 0) {
                    z10 = false;
                }
                this.f7913y0 = z10;
                Object[] array2 = this.A0.toArray(new String[0]);
                sf.j.d(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                oVar.a(array2);
            } else if (i10 == 3) {
                if (!this.f7913y0 || t1.a.a(e0(), "android.permission.READ_MEDIA_AUDIO") == 0) {
                    z10 = false;
                }
                this.f7913y0 = z10;
                Object[] array3 = this.B0.toArray(new String[0]);
                sf.j.d(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                oVar.a(array3);
            }
        } else if (i8 >= 29) {
            oVar.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
        } else {
            oVar.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        }
    }

    public final void w0(String str) {
        b.a aVar = new b.a(e0(), R.style.dialogTheme);
        AlertController.b bVar = aVar.f681a;
        bVar.f666f = str;
        bVar.f671k = false;
        sb.c cVar = new sb.c(this, 1);
        bVar.f667g = bVar.f661a.getText(R.string.ok);
        bVar.f668h = cVar;
        sb.d dVar = new sb.d(this, 1);
        bVar.f669i = bVar.f661a.getText(R.string.cancel);
        bVar.f670j = dVar;
        androidx.appcompat.app.b a10 = aVar.a();
        a10.setCancelable(false);
        a10.show();
    }
}
