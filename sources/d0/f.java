package d0;

import d0.g;
import rf.p;
import sf.j;
import sf.k;
import t.h;

public final class f extends k implements p<g, g.b, g> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f7175a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(h hVar) {
        super(2);
        this.f7175a = hVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) obj;
        g.b bVar = (g.b) obj2;
        j.f(gVar, "acc");
        j.f(bVar, "element");
        if (!(bVar instanceof d)) {
            return gVar.k(bVar);
        }
        d dVar = (d) bVar;
        j.d((Object) null, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
        throw null;
    }
}
