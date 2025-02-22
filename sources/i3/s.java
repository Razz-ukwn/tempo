package i3;

import androidx.activity.b;
import i3.k;
import j.c;
import java.util.Set;
import sf.j;

public final class s extends k.c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t<Object> f9546b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(String[] strArr, t<Object> tVar) {
        super(strArr);
        this.f9546b = tVar;
    }

    public final void a(Set<String> set) {
        j.f(set, "tables");
        c F = c.F();
        b bVar = this.f9546b.f9556u;
        if (F.G()) {
            bVar.run();
        } else {
            F.H(bVar);
        }
    }
}
