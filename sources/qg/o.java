package qg;

import java.io.IOException;
import mg.a;

public final class o extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f13698e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(String str, f fVar) {
        super(str, true);
        this.f13698e = fVar;
    }

    public final long a() {
        f fVar = this.f13698e;
        fVar.getClass();
        try {
            fVar.U.p(2, 0, false);
            return -1;
        } catch (IOException e10) {
            fVar.d(e10);
            return -1;
        }
    }
}
