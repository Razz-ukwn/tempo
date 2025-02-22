package a1;

import a1.r;
import rf.a;
import sf.k;

public final class s extends k implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.b<Object> f54a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(r.b<Object> bVar) {
        super(0);
        this.f54a = bVar;
    }

    public final Object d() {
        r.b<Object> bVar = this.f54a;
        bVar.f52b.setValue(Integer.valueOf(bVar.a() - 1));
        boolean z10 = true;
        if (bVar.a() >= 0) {
            if (bVar.a() == 0) {
                r.this.getClass();
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
        throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + bVar.a() + ')').toString());
    }
}
