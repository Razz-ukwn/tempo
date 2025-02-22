package sd;

import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.q;

@e(c = "com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel$isValid$1", f = "ChangePasswordViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends i implements q<String, String, d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ String f14933a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ String f14934b;

    public h(d<? super h> dVar) {
        super(3, dVar);
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        h hVar = new h((d) obj3);
        hVar.f14933a = (String) obj;
        hVar.f14934b = (String) obj2;
        return hVar.invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (sf.j.a(r5, r0) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            cb.b.J(r5)
            java.lang.String r5 = r4.f14933a
            java.lang.String r0 = r4.f14934b
            int r1 = r5.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x0011
            r1 = r2
            goto L_0x0012
        L_0x0011:
            r1 = r3
        L_0x0012:
            if (r1 == 0) goto L_0x0026
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x001c
            r1 = r2
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            if (r1 == 0) goto L_0x0026
            boolean r5 = sf.j.a(r5, r0)
            if (r5 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
