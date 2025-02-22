package jg;

import androidx.fragment.app.z;
import gf.m;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import rf.a;
import sf.k;

public final class g extends k implements a<List<? extends X509Certificate>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10082a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f10083b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10084c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f fVar, List<? extends Certificate> list, String str) {
        super(0);
        this.f10082a = fVar;
        this.f10083b = list;
        this.f10084c = str;
    }

    public final Object d() {
        z zVar = this.f10082a.f10078b;
        List<Certificate> list = this.f10083b;
        List<Certificate> h3 = zVar == null ? null : zVar.h(this.f10084c, list);
        if (h3 != null) {
            list = h3;
        }
        Iterable<Certificate> iterable = list;
        ArrayList arrayList = new ArrayList(m.n0(iterable));
        for (Certificate certificate : iterable) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
