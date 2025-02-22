package s0;

import androidx.compose.ui.platform.AndroidComposeView;
import b0.w;
import ff.m;
import rf.a;
import rf.l;
import sf.j;
import sf.y;
import u.d;

public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public final w f14380a;

    /* renamed from: b  reason: collision with root package name */
    public final j1 f14381b = j1.f14377a;

    /* renamed from: c  reason: collision with root package name */
    public final e1 f14382c = e1.f14334a;

    /* renamed from: d  reason: collision with root package name */
    public final f1 f14383d = f1.f14355a;

    public k1(AndroidComposeView.m mVar) {
        this.f14380a = new w(mVar);
    }

    public final <T extends c1> void a(T t2, l<? super T, m> lVar, a<m> aVar) {
        T t10;
        w.a aVar2;
        j.f(t2, "target");
        j.f(lVar, "onChanged");
        w wVar = this.f14380a;
        wVar.getClass();
        synchronized (wVar.f2969f) {
            d<w.a> dVar = wVar.f2969f;
            int i8 = dVar.f15640c;
            if (i8 > 0) {
                T[] tArr = dVar.f15638a;
                int i10 = 0;
                while (true) {
                    t10 = tArr[i10];
                    if (!(((w.a) t10).f2973a == lVar)) {
                        i10++;
                        if (i10 >= i8) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                t10 = null;
            } else {
                t10 = null;
            }
            aVar2 = (w.a) t10;
            if (aVar2 == null) {
                y.c(1, lVar);
                aVar2 = new w.a(lVar);
                dVar.b(aVar2);
            }
        }
        boolean z10 = wVar.f2971h;
        w.a aVar3 = wVar.f2972i;
        try {
            wVar.f2971h = false;
            wVar.f2972i = aVar2;
            Object obj = aVar2.f2974b;
            u.a aVar4 = aVar2.f2975c;
            int i11 = aVar2.f2976d;
            aVar2.f2974b = t2;
            aVar2.f2975c = (u.a) aVar2.f2978f.c(t2);
            if (aVar2.f2976d == -1) {
                aVar2.f2976d = b0.m.i().d();
            }
            cb.d.U(aVar2.f2980h, aVar2.f2981i, new b0.y(wVar, aVar));
            Object obj2 = aVar2.f2974b;
            j.c(obj2);
            w.a.a(aVar2, obj2);
            aVar2.f2974b = obj;
            aVar2.f2975c = aVar4;
            aVar2.f2976d = i11;
        } finally {
            wVar.f2972i = aVar3;
            wVar.f2971h = z10;
        }
    }
}
