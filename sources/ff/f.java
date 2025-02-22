package ff;

import sf.j;

public final class f extends Error {
    public /* synthetic */ f() {
        this("An operation is not implemented.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(str);
        j.f(str, "message");
    }
}
