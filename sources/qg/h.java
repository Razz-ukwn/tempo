package qg;

import java.io.IOException;
import mg.a;
import sf.j;

public final class h extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f13677e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r f13678f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str, f fVar, r rVar) {
        super(str, true);
        this.f13677e = fVar;
        this.f13678f = rVar;
    }

    public final long a() {
        try {
            this.f13677e.f13651b.b(this.f13678f);
            return -1;
        } catch (IOException e10) {
            rg.h hVar = rg.h.f14273a;
            rg.h hVar2 = rg.h.f14273a;
            String k10 = j.k(this.f13677e.f13653d, "Http2Connection.Listener failure for ");
            hVar2.getClass();
            rg.h.i(4, k10, e10);
            try {
                this.f13678f.c(b.PROTOCOL_ERROR, e10);
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        }
    }
}
