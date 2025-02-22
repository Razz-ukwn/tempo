package androidx.compose.ui.input.rotary;

import androidx.compose.ui.platform.AndroidComposeView;
import d0.g;
import p0.b;
import p0.c;
import rf.l;
import s0.n0;
import sf.j;

public final class OnRotaryScrollEventElement extends n0<b> {

    /* renamed from: a  reason: collision with root package name */
    public final l<c, Boolean> f1180a;

    public OnRotaryScrollEventElement(AndroidComposeView.k kVar) {
        this.f1180a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnRotaryScrollEventElement) && j.a(this.f1180a, ((OnRotaryScrollEventElement) obj).f1180a);
    }

    public final int hashCode() {
        return this.f1180a.hashCode();
    }

    public final g.c s() {
        return new b(this.f1180a);
    }

    public final g.c t(g.c cVar) {
        b bVar = (b) cVar;
        j.f(bVar, "node");
        bVar.G = this.f1180a;
        bVar.H = null;
        return bVar;
    }

    public final String toString() {
        return "OnRotaryScrollEventElement(onRotaryScrollEvent=" + this.f1180a + ')';
    }
}
