package u9;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u9.j;

public final /* synthetic */ class b implements j.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f15900a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f15901b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f15902c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f15903d;

    public /* synthetic */ b(i iVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f15900a = iVar;
        this.f15901b = callable;
        this.f15902c = j10;
        this.f15903d = timeUnit;
    }

    public final ScheduledFuture a(j.a aVar) {
        i iVar = this.f15900a;
        iVar.getClass();
        return iVar.f15928b.schedule(new h(iVar, this.f15901b, aVar), this.f15902c, this.f15903d);
    }
}
