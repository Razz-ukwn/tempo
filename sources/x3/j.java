package x3;

import ag.g0;
import android.graphics.Bitmap;
import cb.b;
import ff.m;
import h4.h;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;

@e(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {193}, m = "invokeSuspend")
public final class j extends i implements p<g0, d<? super h4.i>, Object> {
    public final /* synthetic */ Bitmap B;

    /* renamed from: a  reason: collision with root package name */
    public int f16949a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f16950b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f16951c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i4.e f16952d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f16953e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(h hVar, h hVar2, i4.e eVar, b bVar, Bitmap bitmap, d<? super j> dVar) {
        super(2, dVar);
        this.f16950b = hVar;
        this.f16951c = hVar2;
        this.f16952d = eVar;
        this.f16953e = bVar;
        this.B = bitmap;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new j(this.f16950b, this.f16951c, this.f16952d, this.f16953e, this.B, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f16949a;
        if (i8 == 0) {
            b.J(obj);
            h hVar = this.f16950b;
            c4.j jVar = new c4.j(hVar, this.f16951c.f16940h, 0, hVar, this.f16952d, this.f16953e, this.B != null);
            this.f16949a = 1;
            obj = jVar.c(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
