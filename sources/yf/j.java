package yf;

import e9.c;
import java.util.Iterator;
import rf.p;

public final class j implements g<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f17388a;

    public j(p pVar) {
        this.f17388a = pVar;
    }

    public final Iterator<Object> iterator() {
        p pVar = this.f17388a;
        sf.j.f(pVar, "block");
        h hVar = new h();
        hVar.f17387c = c.e(hVar, hVar, pVar);
        return hVar;
    }
}
