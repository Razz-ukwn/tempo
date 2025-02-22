package d6;

import android.content.Context;
import d6.o;
import e6.j;
import e6.l;
import ef.a;
import f6.c;
import i6.d;
import i6.f;
import i6.g;
import j6.q;
import java.util.concurrent.Executor;
import k6.a0;
import k6.s;
import k6.t;
import m6.b;

public final class k extends x {
    public a<s> B;
    public a<w> C;

    /* renamed from: a  reason: collision with root package name */
    public a<Executor> f7348a = f6.a.a(o.a.f7355a);

    /* renamed from: b  reason: collision with root package name */
    public c f7349b;

    /* renamed from: c  reason: collision with root package name */
    public a f7350c;

    /* renamed from: d  reason: collision with root package name */
    public a0 f7351d;

    /* renamed from: e  reason: collision with root package name */
    public a<String> f7352e;

    public k(Context context) {
        if (context != null) {
            c cVar = new c(context);
            this.f7349b = cVar;
            b bVar = b.a.f11219a;
            this.f7350c = f6.a.a(new l(cVar, new j(cVar)));
            c cVar2 = this.f7349b;
            this.f7351d = new a0(cVar2);
            a<String> a10 = f6.a.a(new f(cVar2, 1));
            this.f7352e = a10;
            a<s> a11 = f6.a.a(new t(this.f7351d, a10));
            this.B = a11;
            f fVar = new f(bVar, 0);
            c cVar3 = this.f7349b;
            g gVar = new g(cVar3, a11, fVar);
            a<Executor> aVar = this.f7348a;
            a aVar2 = this.f7350c;
            this.C = f6.a.a(new y(new d(aVar, aVar2, gVar, a11, a11), new j6.o(cVar3, aVar2, a11, gVar, aVar, a11, a11), new q(aVar, a11, gVar, a11)));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
