package r9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.firebase.auth.FirebaseAuth;
import s9.f0;
import s9.l;

public final class k0 implements f0, l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f14129a;

    public k0(FirebaseAuth firebaseAuth) {
        this.f14129a = firebaseAuth;
    }

    public final void a(m0 m0Var, m mVar) {
        FirebaseAuth.d(this.f14129a, mVar, m0Var, true, true);
    }

    public final void b(Status status) {
        int i8 = status.f4176b;
        if (i8 == 17011 || i8 == 17021 || i8 == 17005) {
            this.f14129a.a();
        }
    }
}
