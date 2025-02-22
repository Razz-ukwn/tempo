package pb;

import ag.g0;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import mb.b;
import rf.p;

@e(c = "com.lassi.data.media.repository.MediaRepositoryImpl$insertAllMediaData$resultDeferred$1", f = "MediaRepositoryImpl.kt", l = {88}, m = "invokeSuspend")
public final class f extends i implements p<g0, d<? super b<? extends Boolean>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12557a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f12558b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(h hVar, d<? super f> dVar) {
        super(2, dVar);
        this.f12558b = hVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new f(this.f12558b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f12557a;
        if (i8 == 0) {
            cb.b.J(obj);
            h hVar = this.f12558b;
            this.f12557a = 1;
            obj = h.g(hVar, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            try {
                cb.b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                return new b.a(e10);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
