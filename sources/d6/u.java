package d6;

import a6.a;
import a6.b;
import a6.c;
import a6.e;
import a6.f;
import a6.h;
import d6.h;
import java.util.HashMap;
import k6.q;

public final class u<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s f7362a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7363b;

    /* renamed from: c  reason: collision with root package name */
    public final b f7364c;

    /* renamed from: d  reason: collision with root package name */
    public final e<T, byte[]> f7365d;

    /* renamed from: e  reason: collision with root package name */
    public final v f7366e;

    public u(s sVar, String str, b bVar, q qVar, v vVar) {
        this.f7362a = sVar;
        this.f7363b = str;
        this.f7364c = bVar;
        this.f7365d = qVar;
        this.f7366e = vVar;
    }

    public final void a(a aVar, h hVar) {
        s sVar = this.f7362a;
        if (sVar != null) {
            String str = this.f7363b;
            if (str != null) {
                e<T, byte[]> eVar = this.f7365d;
                if (eVar != null) {
                    b bVar = this.f7364c;
                    if (bVar != null) {
                        i iVar = new i(sVar, str, aVar, eVar, bVar);
                        w wVar = (w) this.f7366e;
                        wVar.getClass();
                        c<?> cVar = iVar.f7339c;
                        j e10 = iVar.f7337a.e(cVar.c());
                        h.a aVar2 = new h.a();
                        aVar2.f7336f = new HashMap();
                        aVar2.f7334d = Long.valueOf(wVar.f7368a.a());
                        aVar2.f7335e = Long.valueOf(wVar.f7369b.a());
                        aVar2.d(iVar.f7338b);
                        Object b10 = cVar.b();
                        aVar2.c(new m(iVar.f7341e, (byte[]) ((q) iVar.f7340d).apply(b10)));
                        aVar2.f7332b = cVar.a();
                        wVar.f7370c.a(hVar, aVar2.b(), e10);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
