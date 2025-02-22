package u9;

import androidx.emoji2.text.g;
import ba.d0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import qa.a;
import qa.b;
import u9.j;

public final /* synthetic */ class c implements j.c, a.C0253a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f15904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15905b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15906c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f15907d;

    public /* synthetic */ c(Object obj, Object obj2, long j10, Object obj3) {
        this.f15905b = obj;
        this.f15906c = obj2;
        this.f15904a = j10;
        this.f15907d = obj3;
    }

    public final ScheduledFuture a(j.a aVar) {
        i iVar = (i) this.f15905b;
        iVar.getClass();
        g gVar = new g(2, iVar, (Runnable) this.f15906c, aVar);
        return iVar.f15928b.schedule(gVar, this.f15904a, (TimeUnit) this.f15907d);
    }

    public final void d(b bVar) {
        ((w9.a) bVar.get()).d((String) this.f15905b, (String) this.f15906c, this.f15904a, (d0) this.f15907d);
    }
}
