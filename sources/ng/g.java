package ng;

import gf.m;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import jg.p;
import rf.a;
import sf.j;
import sf.k;

public final class g extends k implements a<List<? extends X509Certificate>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11976a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(e eVar) {
        super(0);
        this.f11976a = eVar;
    }

    public final Object d() {
        p pVar = this.f11976a.f11960e;
        j.c(pVar);
        Iterable<Certificate> a10 = pVar.a();
        ArrayList arrayList = new ArrayList(m.n0(a10));
        for (Certificate certificate : a10) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
