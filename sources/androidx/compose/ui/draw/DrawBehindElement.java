package androidx.compose.ui.draw;

import d0.g;
import f0.a;
import ff.m;
import k0.e;
import rf.l;
import s0.n0;
import sf.j;

final class DrawBehindElement extends n0<a> {

    /* renamed from: a  reason: collision with root package name */
    public final l<e, m> f1177a;

    public DrawBehindElement(l<? super e, m> lVar) {
        j.f(lVar, "onDraw");
        this.f1177a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && j.a(this.f1177a, ((DrawBehindElement) obj).f1177a);
    }

    public final int hashCode() {
        return this.f1177a.hashCode();
    }

    public final g.c s() {
        return new a(this.f1177a);
    }

    public final g.c t(g.c cVar) {
        a aVar = (a) cVar;
        j.f(aVar, "node");
        l<e, m> lVar = this.f1177a;
        j.f(lVar, "<set-?>");
        aVar.G = lVar;
        return aVar;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f1177a + ')';
    }
}
