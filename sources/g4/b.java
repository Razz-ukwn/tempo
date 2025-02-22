package g4;

import java.util.regex.Pattern;
import jg.t;
import rf.a;
import sf.k;

public final class b extends k implements a<t> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f8832a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f8832a = cVar;
    }

    public final Object d() {
        String a10 = this.f8832a.f8838f.a("Content-Type");
        if (a10 == null) {
            return null;
        }
        Pattern pattern = t.f10171d;
        try {
            return t.a.a(a10);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
