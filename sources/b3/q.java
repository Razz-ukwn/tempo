package b3;

import android.os.Bundle;
import ff.m;
import gf.s;
import rf.l;
import sf.j;
import sf.k;
import sf.r;

public final class q extends k implements l<j, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f3161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f3162b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z f3163c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f3164d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(r rVar, m mVar, z zVar, Bundle bundle) {
        super(1);
        this.f3161a = rVar;
        this.f3162b = mVar;
        this.f3163c = zVar;
        this.f3164d = bundle;
    }

    public final Object invoke(Object obj) {
        j jVar = (j) obj;
        j.f(jVar, "it");
        this.f3161a.f14953a = true;
        s sVar = s.f8978a;
        this.f3162b.a(this.f3163c, this.f3164d, jVar, sVar);
        return m.f8717a;
    }
}
