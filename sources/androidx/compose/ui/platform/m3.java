package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.p;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import d0.h;
import d2.f1;
import ff.j;
import ff.m;
import java.util.LinkedHashMap;
import jf.f;
import jf.g;
import kotlinx.coroutines.internal.e;
import sf.v;
import t.b1;
import t.e1;
import t.o1;
import t.z1;
import yf.k;
import yf.o;

public interface m3 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1351a = a.f1352a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f1352a = new a();

        /* renamed from: androidx.compose.ui.platform.m3$a$a  reason: collision with other inner class name */
        public static final class C0016a implements m3 {

            /* renamed from: b  reason: collision with root package name */
            public static final C0016a f1353b = new C0016a();

            public final z1 a(View view) {
                f fVar;
                o1 o1Var;
                LinkedHashMap linkedHashMap = t3.f1471a;
                g gVar = g.f10014a;
                e1.a aVar = e1.a.f15037a;
                j jVar = w0.I;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    fVar = (f) w0.I.getValue();
                } else {
                    fVar = (f) w0.J.get();
                    if (fVar == null) {
                        throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                    }
                }
                f n02 = fVar.n0(gVar);
                e1 e1Var = (e1) n02.d(aVar);
                androidx.lifecycle.j jVar2 = null;
                if (e1Var != null) {
                    o1Var = new o1(e1Var);
                    b1 b1Var = o1Var.f15173b;
                    synchronized (b1Var.f14992a) {
                        b1Var.f14995d = false;
                        m mVar = m.f8717a;
                    }
                } else {
                    o1Var = null;
                }
                v vVar = new v();
                T t2 = (h) n02.d(h.a.f7183a);
                if (t2 == null) {
                    t2 = new x1();
                    vVar.f14957a = t2;
                }
                if (o1Var != null) {
                    gVar = o1Var;
                }
                f n03 = n02.n0(gVar).n0(t2);
                z1 z1Var = new z1(n03);
                e e10 = f1.e(n03);
                p pVar = (p) o.p0(o.q0(k.o0(view, q0.f2312a), r0.f2313a));
                if (pVar != null) {
                    jVar2 = pVar.b();
                }
                androidx.lifecycle.j jVar3 = jVar2;
                if (jVar3 != null) {
                    view.addOnAttachStateChangeListener(new q3(view, z1Var));
                    jVar3.a(new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(e10, o1Var, z1Var, vVar, view));
                    return z1Var;
                }
                throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
            }
        }
    }

    z1 a(View view);
}
