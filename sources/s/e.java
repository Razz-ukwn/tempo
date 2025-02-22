package s;

import androidx.compose.ui.platform.u1;
import androidx.compose.ui.platform.y2;
import d0.a;
import d0.b;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class e extends k implements l<u1, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.c f14279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14280b = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(b.C0111b bVar) {
        super(1);
        this.f14279a = bVar;
    }

    public final Object invoke(Object obj) {
        u1 u1Var = (u1) obj;
        j.f(u1Var, "$this$$receiver");
        y2 y2Var = u1Var.f1475a;
        y2Var.b(this.f14279a, "align");
        y2Var.b(Boolean.valueOf(this.f14280b), "unbounded");
        return m.f8717a;
    }
}
