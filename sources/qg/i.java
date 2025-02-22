package qg;

import java.io.IOException;
import mg.a;

public final class i extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f13679e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f13680f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f13681g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, f fVar, int i8, int i10) {
        super(str, true);
        this.f13679e = fVar;
        this.f13680f = i8;
        this.f13681g = i10;
    }

    public final long a() {
        int i8 = this.f13680f;
        int i10 = this.f13681g;
        f fVar = this.f13679e;
        fVar.getClass();
        try {
            fVar.U.p(i8, i10, true);
            return -1;
        } catch (IOException e10) {
            fVar.d(e10);
            return -1;
        }
    }
}
