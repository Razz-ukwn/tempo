package t9;

import j0.f;
import j6.i;
import qa.a;
import qa.b;

public final class t<T> implements b<T>, a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final f f15491c = new f(7);

    /* renamed from: d  reason: collision with root package name */
    public static final s f15492d = new s();

    /* renamed from: a  reason: collision with root package name */
    public a.C0253a<T> f15493a;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f15494b;

    public t(f fVar, b bVar) {
        this.f15493a = fVar;
        this.f15494b = bVar;
    }

    public final void a(a.C0253a<T> aVar) {
        b<T> bVar;
        b<T> bVar2;
        b<T> bVar3 = this.f15494b;
        s sVar = f15492d;
        if (bVar3 != sVar) {
            aVar.d(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f15494b;
            if (bVar != sVar) {
                bVar2 = bVar;
            } else {
                this.f15493a = new i(this.f15493a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.d(bVar);
        }
    }

    public final T get() {
        return this.f15494b.get();
    }
}
