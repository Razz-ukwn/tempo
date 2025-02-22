package androidx.compose.ui.draw;

import d0.g;
import ff.m;
import k0.e;
import rf.l;
import sf.j;

public final class a {
    public static final g a(g gVar, l<? super e, m> lVar) {
        j.f(gVar, "<this>");
        j.f(lVar, "onDraw");
        return gVar.k(new DrawBehindElement(lVar));
    }
}
