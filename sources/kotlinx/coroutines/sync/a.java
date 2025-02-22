package kotlinx.coroutines.sync;

import ag.i;
import ff.m;
import kotlinx.coroutines.internal.t;
import rb.b;

public final class a extends i {

    /* renamed from: a  reason: collision with root package name */
    public final i f10780a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10781b;

    public a(i iVar, int i8) {
        this.f10780a = iVar;
        this.f10781b = i8;
    }

    public final void a(Throwable th) {
        i iVar = this.f10780a;
        iVar.getClass();
        iVar.f10805e.set(this.f10781b, h.f10803e);
        if (t.f10735d.incrementAndGet(iVar) == h.f10804f && !iVar.c()) {
            iVar.d();
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return m.f8717a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CancelSemaphoreAcquisitionHandler[");
        sb2.append(this.f10780a);
        sb2.append(", ");
        return b.a(sb2, this.f10781b, ']');
    }
}
