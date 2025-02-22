package androidx.compose.ui.input.key;

import androidx.compose.ui.platform.AndroidComposeView;
import d0.g;
import n0.b;
import n0.c;
import rf.l;
import s0.n0;
import sf.j;

public final class OnKeyEventElement extends n0<c> {

    /* renamed from: a  reason: collision with root package name */
    public final l<b, Boolean> f1179a;

    public OnKeyEventElement(AndroidComposeView.f fVar) {
        this.f1179a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnKeyEventElement) && j.a(this.f1179a, ((OnKeyEventElement) obj).f1179a);
    }

    public final int hashCode() {
        return this.f1179a.hashCode();
    }

    public final g.c s() {
        return new c(this.f1179a);
    }

    public final g.c t(g.c cVar) {
        c cVar2 = (c) cVar;
        j.f(cVar2, "node");
        cVar2.G = this.f1179a;
        cVar2.H = null;
        return cVar2;
    }

    public final String toString() {
        return "OnKeyEventElement(onKeyEvent=" + this.f1179a + ')';
    }
}
