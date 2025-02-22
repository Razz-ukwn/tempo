package le;

import ag.g0;
import ag.s0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.x;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.m;
import com.quickkonnect.silencio.R;
import droidninja.filepicker.MediaDetailsActivity;
import java.io.IOException;
import jf.d;
import jf.f;
import ke.f;
import lf.e;
import ne.c;
import oe.i;
import rf.p;

public final class j extends a implements f.a {
    public static final /* synthetic */ int G0 = 0;
    public f A0;
    public c B0;
    public m C0;
    public int D0;
    public int E0 = Integer.MAX_VALUE;
    public int F0 = Integer.MAX_VALUE;

    /* renamed from: w0  reason: collision with root package name */
    public RecyclerView f11092w0;

    /* renamed from: x0  reason: collision with root package name */
    public TextView f11093x0;

    /* renamed from: y0  reason: collision with root package name */
    public i f11094y0;

    /* renamed from: z0  reason: collision with root package name */
    public l f11095z0;

    @e(c = "droidninja.filepicker.fragments.MediaFolderPickerFragment$onActivityResult$1", f = "MediaFolderPickerFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends lf.i implements p<g0, d<? super ff.m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public g0 f11096a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j f11097b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, d dVar) {
            super(2, dVar);
            this.f11097b = jVar;
        }

        public final d<ff.m> create(Object obj, d<?> dVar) {
            sf.j.f(dVar, "completion");
            a aVar = new a(this.f11097b, dVar);
            aVar.f11096a = (g0) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create(obj, (d) obj2)).invokeSuspend(ff.m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            Uri uri;
            cb.b.J(obj);
            c cVar = this.f11097b.B0;
            if (!(cVar == null || (uri = cVar.f11900a) == null)) {
                cVar.f11901b.getContentResolver().delete(uri, (String) null, (String[]) null);
            }
            return ff.m.f8717a;
        }
    }

    @e(c = "droidninja.filepicker.fragments.MediaFolderPickerFragment$onCameraClicked$1", f = "MediaFolderPickerFragment.kt", l = {154}, m = "invokeSuspend")
    public static final class b extends lf.i implements p<g0, d<? super ff.m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public g0 f11098a;

        /* renamed from: b  reason: collision with root package name */
        public g0 f11099b;

        /* renamed from: c  reason: collision with root package name */
        public int f11100c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j f11101d;

        @e(c = "droidninja.filepicker.fragments.MediaFolderPickerFragment$onCameraClicked$1$intent$1", f = "MediaFolderPickerFragment.kt", l = {}, m = "invokeSuspend")
        public static final class a extends lf.i implements p<g0, d<? super Intent>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public g0 f11102a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ b f11103b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, d dVar) {
                super(2, dVar);
                this.f11103b = bVar;
            }

            public final d<ff.m> create(Object obj, d<?> dVar) {
                sf.j.f(dVar, "completion");
                a aVar = new a(this.f11103b, dVar);
                aVar.f11102a = (g0) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((a) create(obj, (d) obj2)).invokeSuspend(ff.m.f8717a);
            }

            public final Object invokeSuspend(Object obj) {
                cb.b.J(obj);
                c cVar = this.f11103b.f11101d.B0;
                if (cVar != null) {
                    return cVar.a();
                }
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j jVar, d dVar) {
            super(2, dVar);
            this.f11101d = jVar;
        }

        public final d<ff.m> create(Object obj, d<?> dVar) {
            sf.j.f(dVar, "completion");
            b bVar = new b(this.f11101d, dVar);
            bVar.f11098a = (g0) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create(obj, (d) obj2)).invokeSuspend(ff.m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f11100c;
            if (i8 == 0) {
                cb.b.J(obj);
                g0 g0Var = this.f11098a;
                kotlinx.coroutines.scheduling.b bVar = s0.f481b;
                a aVar2 = new a(this, (d) null);
                this.f11099b = g0Var;
                this.f11100c = 1;
                obj = cb.b.M(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Intent intent = (Intent) obj;
            j jVar = this.f11101d;
            if (intent != null) {
                jVar.startActivityForResult(intent, 257);
            } else {
                Toast.makeText(jVar.e0(), R.string.no_camera_exists, 0).show();
            }
            return ff.m.f8717a;
        }
    }

    public static final void o0(j jVar) {
        x o10 = jVar.o();
        if (o10 == null || (!o10.isDestroyed() && !o10.isFinishing())) {
            m mVar = jVar.C0;
            if (mVar != null) {
                mVar.n();
            } else {
                sf.j.l("mGlideRequestManager");
                throw null;
            }
        }
    }

    public final void G(int i8, int i10, Intent intent) {
        super.G(i8, i10, intent);
        if (i8 == 257) {
            Uri uri = null;
            if (i10 == -1) {
                c cVar = this.B0;
                if (cVar != null) {
                    uri = cVar.f11900a;
                }
                if (uri != null && je.e.f9993a == 1) {
                    je.e.b(uri, 1);
                    l lVar = this.f11095z0;
                    if (lVar != null) {
                        lVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            cb.b.D(this.f11061v0, s0.f481b, 0, new a(this, (d) null), 2);
        }
    }

    public final void I(Context context) {
        sf.j.f(context, "context");
        super.I(context);
        if (context instanceof l) {
            this.f11095z0 = (l) context;
            return;
        }
        throw new RuntimeException(context + " must implement PhotoPickerFragmentListener");
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        m e10 = com.bumptech.glide.b.e(this);
        sf.j.e(e10, "Glide.with(this)");
        this.C0 = e10;
        this.f11094y0 = (i) new m0((p0) this, (m0.b) new m0.a(d0().getApplication())).a(i.class);
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sf.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_media_folder_picker, viewGroup, false);
    }

    public final /* synthetic */ void N() {
        super.N();
    }

    public final void O() {
        this.f2062b0 = true;
        this.f11095z0 = null;
    }

    public final void Z(View view) {
        sf.j.f(view, "view");
        View findViewById = view.findViewById(R.id.recyclerview);
        sf.j.e(findViewById, "view.findViewById(R.id.recyclerview)");
        this.f11092w0 = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.empty_view);
        sf.j.e(findViewById2, "view.findViewById(R.id.empty_view)");
        this.f11093x0 = (TextView) findViewById2;
        Bundle bundle = this.C;
        if (bundle != null) {
            this.D0 = bundle.getInt("FILE_TYPE");
            this.E0 = bundle.getInt("EXTRA_IMAGE_FILE_SIZE");
            this.F0 = bundle.getInt("EXTRA__VIDEO_FILE_SIZE");
            this.D0 = bundle.getInt("FILE_TYPE");
            this.B0 = new c(e0());
            Integer num = (Integer) je.e.f10002j.get(je.b.f9988a);
            int intValue = num != null ? num.intValue() : 2;
            o();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(intValue);
            RecyclerView recyclerView = this.f11092w0;
            if (recyclerView != null) {
                recyclerView.g(new ne.b(intValue));
                RecyclerView recyclerView2 = this.f11092w0;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutManager(gridLayoutManager);
                    RecyclerView recyclerView3 = this.f11092w0;
                    if (recyclerView3 != null) {
                        recyclerView3.setItemAnimator(new androidx.recyclerview.widget.e());
                        RecyclerView recyclerView4 = this.f11092w0;
                        if (recyclerView4 != null) {
                            recyclerView4.h(new g(this));
                            i iVar = this.f11094y0;
                            if (iVar != null) {
                                iVar.f12346i.e(z(), new h(this));
                                i iVar2 = this.f11094y0;
                                if (iVar2 != null) {
                                    iVar2.f12347j.e(z(), new i(this));
                                    i iVar3 = this.f11094y0;
                                    if (iVar3 != null) {
                                        i.h(iVar3, this.D0, this.E0, this.F0);
                                    } else {
                                        sf.j.l("viewModel");
                                        throw null;
                                    }
                                } else {
                                    sf.j.l("viewModel");
                                    throw null;
                                }
                            } else {
                                sf.j.l("viewModel");
                                throw null;
                            }
                        } else {
                            sf.j.l("recyclerView");
                            throw null;
                        }
                    } else {
                        sf.j.l("recyclerView");
                        throw null;
                    }
                } else {
                    sf.j.l("recyclerView");
                    throw null;
                }
            } else {
                sf.j.l("recyclerView");
                throw null;
            }
        }
    }

    public final void e(me.e eVar) {
        sf.j.f(eVar, "photoDirectory");
        Intent intent = new Intent(o(), MediaDetailsActivity.class);
        String simpleName = me.e.class.getSimpleName();
        eVar.B.clear();
        ff.m mVar = ff.m.f8717a;
        intent.putExtra(simpleName, eVar);
        intent.putExtra("EXTRA_FILE_TYPE", this.D0);
        intent.putExtra("EXTRA_IMAGE_FILE_SIZE", this.E0);
        intent.putExtra("EXTRA__VIDEO_FILE_SIZE", this.F0);
        x o10 = o();
        if (o10 != null) {
            o10.startActivityForResult(intent, 235);
        }
    }

    public final void h() {
        try {
            cb.b.D(this.f11061v0, (f.b) null, 0, new b(this, (d) null), 3);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final void n0() {
    }
}
