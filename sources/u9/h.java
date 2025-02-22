package u9;

import java.util.concurrent.Callable;
import u2.b;
import u9.j;

public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f15924a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f15925b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j.b f15926c;

    public /* synthetic */ h(i iVar, Callable callable, j.a aVar) {
        this.f15924a = iVar;
        this.f15925b = callable;
        this.f15926c = aVar;
    }

    public final Object call() {
        i iVar = this.f15924a;
        iVar.getClass();
        return iVar.f15927a.submit(new b(4, this.f15925b, this.f15926c));
    }
}
