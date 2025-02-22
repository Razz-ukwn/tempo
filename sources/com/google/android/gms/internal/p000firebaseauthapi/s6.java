package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s6  reason: invalid package */
public final class s6 extends gb {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4905b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(int i8, Class cls) {
        super(cls);
        this.f4905b = i8;
    }

    public final /* bridge */ /* synthetic */ Object a(o3 o3Var) {
        switch (this.f4905b) {
            case 0:
                gd gdVar = (gd) o3Var;
                return new ah((eh) new u6(1).g(gdVar.x(), eh.class), (a6) new jc().g(gdVar.y(), a6.class), gdVar.y().y().t());
            case 1:
                return new u8(((ae) o3Var).x().m());
            case 2:
                return new wg(((qg) o3Var).x().m(), 1);
            default:
                te teVar = (te) o3Var;
                re u7 = teVar.x().u();
                xe x10 = u7.x();
                return new yg(zg.e(teVar.y().m(), m9.c(x10.y())), x10.w().m(), m9.b(x10.z()), m9.d(u7.A()), new n9(u7.t().w()));
        }
    }
}
