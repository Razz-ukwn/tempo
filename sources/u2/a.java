package u2;

import androidx.fragment.app.p;
import sf.j;

public final class a extends f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(p pVar, String str) {
        super(pVar, "Attempting to reuse fragment " + pVar + " with previous ID " + str);
        j.f(pVar, "fragment");
        j.f(str, "previousFragmentId");
    }
}
