package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a7  reason: invalid package */
public final class a7 extends gb {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4380b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(int i8, Class cls) {
        super(cls);
        this.f4380b = i8;
    }

    public final Object a(o3 o3Var) {
        boolean z10 = false;
        switch (this.f4380b) {
            case 0:
                kd kdVar = (kd) o3Var;
                return new sg(kdVar.z().m(), kdVar.y().t());
            case 1:
                qd qdVar = (qd) o3Var;
                return new tg(qdVar.y().m(), qdVar.x().t());
            case 2:
                return new ug(((wd) o3Var).x().m());
            case 3:
                return new wg(((je) o3Var).x().m(), 0);
            default:
                pf pfVar = (pf) o3Var;
                if (pfVar.z().c() == 0) {
                    z10 = true;
                }
                if (!z10) {
                    lf u7 = pfVar.u();
                    return new g7(pfVar, g.h(u7), g.i(u7), g.g(u7));
                }
                throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
    }
}
