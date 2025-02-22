package u9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u9.j;

public final /* synthetic */ class d implements j.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f15908a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f15909b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f15910c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f15911d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f15912e;

    public /* synthetic */ d(i iVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f15908a = iVar;
        this.f15909b = runnable;
        this.f15910c = j10;
        this.f15911d = j11;
        this.f15912e = timeUnit;
    }

    public final ScheduledFuture a(j.a aVar) {
        long j10 = this.f15910c;
        long j11 = this.f15911d;
        TimeUnit timeUnit = this.f15912e;
        i iVar = this.f15908a;
        return iVar.f15928b.scheduleWithFixedDelay(new g(iVar, this.f15909b, aVar), j10, j11, timeUnit);
    }
}
