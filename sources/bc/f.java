package bc;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ProgressBar;
import androidx.fragment.app.o;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cc.d;
import com.quickkonnect.silencio.R;
import ff.j;
import ff.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jf.f;
import mb.a;
import rf.l;
import sf.i;
import sf.k;
import yb.e;

public final class f extends e<i> {
    public static final /* synthetic */ int F0 = 0;
    public final j A0 = b7.a.x(new c(this));
    public final o B0 = ((o) c0(new sb.b(this, 1), new c.e()));
    public final o C0 = ((o) c0(new b(this), new c.e()));
    public final o D0 = ((o) c0(new c(this, 0), new c.c()));
    public final LinkedHashMap E0 = new LinkedHashMap();

    /* renamed from: y0  reason: collision with root package name */
    public final j f3616y0 = b7.a.x(new b(this));

    /* renamed from: z0  reason: collision with root package name */
    public final rb.a f3617z0 = rb.a.V;

    public /* synthetic */ class a extends i implements l<mb.a<ArrayList<nb.b>>, m> {
        public a(Object obj) {
            super(1, obj, f.class, "handleDocs", "handleDocs(Lcom/lassi/data/common/Response;)V");
        }

        public final Object invoke(Object obj) {
            mb.a aVar = (mb.a) obj;
            sf.j.f(aVar, "p0");
            f fVar = (f) this.f14944b;
            int i8 = f.F0;
            fVar.getClass();
            if (aVar instanceof a.c) {
                ProgressBar progressBar = (ProgressBar) fVar.u0(R.id.progressBar);
                sf.j.e(progressBar, "progressBar");
                progressBar.setVisibility(8);
                dc.b bVar = (dc.b) fVar.f3616y0.getValue();
                ArrayList arrayList = (ArrayList) ((a.c) aVar).f11372a;
                if (arrayList != null) {
                    ArrayList<nb.b> arrayList2 = bVar.B;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                bVar.g();
            } else if (aVar instanceof a.b) {
                ProgressBar progressBar2 = (ProgressBar) fVar.u0(R.id.progressBar);
                sf.j.e(progressBar2, "progressBar");
                progressBar2.setVisibility(0);
            } else if (aVar instanceof a.C0215a) {
                ProgressBar progressBar3 = (ProgressBar) fVar.u0(R.id.progressBar);
                sf.j.e(progressBar3, "progressBar");
                progressBar3.setVisibility(8);
            }
            return m.f8717a;
        }
    }

    public static final class b extends k implements rf.a<dc.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f3618a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar) {
            super(0);
            this.f3618a = fVar;
        }

        public final Object d() {
            return new dc.b(new g(this.f3618a));
        }
    }

    public static final class c extends k implements rf.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f3619a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f fVar) {
            super(0);
            this.f3619a = fVar;
        }

        public final Object d() {
            return (d) new m0(this.f3619a.d0()).a(d.class);
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
        this.E0.clear();
    }

    public final int p0() {
        return R.layout.fragment_media_picker;
    }

    public final void q0() {
        q();
        rb.a aVar = this.f3617z0;
        ((RecyclerView) u0(R.id.rvMedia)).setLayoutManager(new GridLayoutManager(aVar.H));
        ((RecyclerView) u0(R.id.rvMedia)).setAdapter((dc.b) this.f3616y0.getValue());
        ((RecyclerView) u0(R.id.rvMedia)).g(new zb.a(aVar.H));
        ((ProgressBar) u0(R.id.progressBar)).getIndeterminateDrawable().setColorFilter(v1.a.a(aVar.f14189d));
        v0();
    }

    public final yb.c r0() {
        return (i) new m0((p0) d0(), (m0.b) new j(e0(), 0)).a(i.class);
    }

    public final void t0() {
        ((i) s0()).f3625f.e(z(), new qb.a(new a(this)));
    }

    public final View u0(int i8) {
        View findViewById;
        Integer valueOf = Integer.valueOf(i8);
        LinkedHashMap linkedHashMap = this.E0;
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
        if (i8 >= 30) {
            if (Environment.isExternalStorageManager()) {
                i iVar = (i) s0();
                iVar.getClass();
                cb.b.D(gc.b.o(iVar), (f.b) null, 0, new h(iVar, (jf.d<? super h>) null), 3);
            }
        } else if (i8 == 29) {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            ArrayList arrayList = new ArrayList();
            for (String mimeTypeFromExtension : rb.a.V.M) {
                String mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mimeTypeFromExtension);
                if (mimeTypeFromExtension2 != null) {
                    arrayList.add(mimeTypeFromExtension2);
                }
            }
            Object[] array = arrayList.toArray(new String[arrayList.size()]);
            sf.j.e(array, "mimeTypesList.toArray(mMimeTypeArray)");
            intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) array);
            intent.addFlags(1);
            this.B0.a(intent);
        } else {
            this.D0.a(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        }
    }
}
