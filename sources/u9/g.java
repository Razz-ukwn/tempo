package u9;

import u9.j;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f15921a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f15922b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j.b f15923c;

    public /* synthetic */ g(i iVar, Runnable runnable, j.a aVar) {
        this.f15921a = iVar;
        this.f15922b = runnable;
        this.f15923c = aVar;
    }

    public final void run() {
        i iVar = this.f15921a;
        iVar.getClass();
        iVar.f15927a.execute(new u1.g(1, this.f15922b, this.f15923c));
    }
}
