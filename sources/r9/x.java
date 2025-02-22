package r9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.m0;
import com.google.firebase.auth.FirebaseAuth;
import s9.f0;
import s9.l;
import u6.q;

public final class x implements f0, l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f14156a;

    public x(FirebaseAuth firebaseAuth) {
        this.f14156a = firebaseAuth;
    }

    public final void a(m0 m0Var, m mVar) {
        q.i(m0Var);
        q.i(mVar);
        mVar.H(m0Var);
        FirebaseAuth.d(this.f14156a, mVar, m0Var, true, true);
    }

    public final void b(Status status) {
        int i8 = status.f4176b;
        if (i8 == 17011 || i8 == 17021 || i8 == 17005 || i8 == 17091) {
            this.f14156a.a();
        }
    }
}
