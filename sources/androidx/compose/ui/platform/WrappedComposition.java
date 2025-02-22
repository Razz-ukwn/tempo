package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import com.quickkonnect.silencio.R;
import ff.m;
import rf.l;
import rf.p;
import sf.k;
import t.f0;
import t.h;
import t.i0;
import z.b;

final class WrappedComposition implements f0, n {

    /* renamed from: a  reason: collision with root package name */
    public final AndroidComposeView f1241a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f1242b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1243c;

    /* renamed from: d  reason: collision with root package name */
    public j f1244d;

    /* renamed from: e  reason: collision with root package name */
    public p<? super h, ? super Integer, m> f1245e = g1.f1289a;

    public static final class a extends k implements l<AndroidComposeView.b, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WrappedComposition f1246a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p<h, Integer, m> f1247b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(WrappedComposition wrappedComposition, p<? super h, ? super Integer, m> pVar) {
            super(1);
            this.f1246a = wrappedComposition;
            this.f1247b = pVar;
        }

        public final Object invoke(Object obj) {
            AndroidComposeView.b bVar = (AndroidComposeView.b) obj;
            sf.j.f(bVar, "it");
            WrappedComposition wrappedComposition = this.f1246a;
            if (!wrappedComposition.f1243c) {
                j b10 = bVar.f1212a.b();
                p<h, Integer, m> pVar = this.f1247b;
                wrappedComposition.f1245e = pVar;
                if (wrappedComposition.f1244d == null) {
                    wrappedComposition.f1244d = b10;
                    b10.a(wrappedComposition);
                } else {
                    if (b10.b().compareTo(j.b.f2279c) >= 0) {
                        wrappedComposition.f1242b.x(b.c(-2000640158, new w3(wrappedComposition, pVar), true));
                    }
                }
            }
            return m.f8717a;
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, i0 i0Var) {
        this.f1241a = androidComposeView;
        this.f1242b = i0Var;
    }

    public final void a() {
        if (!this.f1243c) {
            this.f1243c = true;
            this.f1241a.getView().setTag(R.id.wrapped_composition_tag, (Object) null);
            j jVar = this.f1244d;
            if (jVar != null) {
                jVar.c(this);
            }
        }
        this.f1242b.a();
    }

    public final void d(androidx.lifecycle.p pVar, j.a aVar) {
        if (aVar == j.a.ON_DESTROY) {
            a();
        } else if (aVar == j.a.ON_CREATE && !this.f1243c) {
            x(this.f1245e);
        }
    }

    public final void x(p<? super h, ? super Integer, m> pVar) {
        sf.j.f(pVar, "content");
        this.f1241a.setOnViewTreeOwnersAvailable(new a(this, pVar));
    }
}
