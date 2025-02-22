package u9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u9.j;

public final /* synthetic */ class e implements j.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f15913a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f15914b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f15915c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f15916d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f15917e;

    public /* synthetic */ e(i iVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f15913a = iVar;
        this.f15914b = runnable;
        this.f15915c = j10;
        this.f15916d = j11;
        this.f15917e = timeUnit;
    }

    public final ScheduledFuture a(j.a aVar) {
        long j10 = this.f15915c;
        long j11 = this.f15916d;
        TimeUnit timeUnit = this.f15917e;
        i iVar = this.f15913a;
        return iVar.f15928b.scheduleAtFixedRate(new f(iVar, this.f15914b, aVar), j10, j11, timeUnit);
    }
}
