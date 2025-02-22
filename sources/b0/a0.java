package b0;

import b0.w;
import ff.m;
import rf.a;
import sf.k;
import u.c;
import u.d;

public final class a0 extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f2886a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(w wVar) {
        super(0);
        this.f2886a = wVar;
    }

    /* JADX INFO: finally extract failed */
    public final Object d() {
        do {
            w wVar = this.f2886a;
            synchronized (wVar.f2969f) {
                if (!wVar.f2966c) {
                    wVar.f2966c = true;
                    try {
                        d<w.a> dVar = wVar.f2969f;
                        int i8 = dVar.f15640c;
                        if (i8 > 0) {
                            T[] tArr = dVar.f15638a;
                            int i10 = 0;
                            do {
                                w.a aVar = (w.a) tArr[i10];
                                c<Object> cVar = aVar.f2979g;
                                int i11 = cVar.f15634a;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    aVar.f2973a.invoke(cVar.get(i12));
                                }
                                cVar.clear();
                                i10++;
                            } while (i10 < i8);
                        }
                        wVar.f2966c = false;
                    } catch (Throwable th) {
                        wVar.f2966c = false;
                        throw th;
                    }
                }
                m mVar = m.f8717a;
            }
        } while (w.a(this.f2886a));
        return m.f8717a;
    }
}
