package rc;

import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.q;

@e(c = "com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel$isValid$1", f = "ChoosePasswordViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends i implements q<String, String, d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ String f14202a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ String f14203b;

    public h(d<? super h> dVar) {
        super(3, dVar);
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        h hVar = new h((d) obj3);
        hVar.f14202a = (String) obj;
        hVar.f14203b = (String) obj2;
        return hVar.invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r0.length() > 0) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            cb.b.J(r4)
            java.lang.String r4 = r3.f14202a
            java.lang.String r0 = r3.f14203b
            int r4 = r4.length()
            r1 = 1
            r2 = 0
            if (r4 <= 0) goto L_0x0011
            r4 = r1
            goto L_0x0012
        L_0x0011:
            r4 = r2
        L_0x0012:
            if (r4 == 0) goto L_0x0020
            int r4 = r0.length()
            if (r4 <= 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r2
        L_0x001d:
            if (r4 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
