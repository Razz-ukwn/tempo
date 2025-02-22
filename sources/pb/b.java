package pb;

import jf.d;
import lf.c;
import lf.e;

@e(c = "com.lassi.data.media.repository.MediaRepositoryImpl", f = "MediaRepositoryImpl.kt", l = {484}, m = "fetchAndInsertMediaHelper")
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f12534a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f12535b;

    /* renamed from: c  reason: collision with root package name */
    public int f12536c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(h hVar, d<? super b> dVar) {
        super(dVar);
        this.f12535b = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f12534a = obj;
        this.f12536c |= Integer.MIN_VALUE;
        return h.g(this.f12535b, 0, this);
    }
}
