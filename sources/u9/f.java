package u9;

import a2.a;
import u9.j;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f15918a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f15919b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j.b f15920c;

    public /* synthetic */ f(i iVar, Runnable runnable, j.a aVar) {
        this.f15918a = iVar;
        this.f15919b = runnable;
        this.f15920c = aVar;
    }

    public final void run() {
        i iVar = this.f15918a;
        iVar.getClass();
        iVar.f15927a.execute(new a(6, this.f15919b, this.f15920c));
    }
}
