package r9;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.a;
import com.google.android.gms.internal.p000firebaseauthapi.di;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import s9.t;
import u6.q;

public final class m0 extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f14136a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f14137b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f14138c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f14139d;

    public m0(FirebaseAuth firebaseAuth, boolean z10, m mVar, c cVar) {
        this.f14139d = firebaseAuth;
        this.f14136a = z10;
        this.f14137b = mVar;
        this.f14138c = cVar;
    }

    public final Task a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        boolean z10 = this.f14136a;
        c cVar = this.f14138c;
        FirebaseAuth firebaseAuth = this.f14139d;
        if (z10) {
            a aVar = firebaseAuth.f6309e;
            m mVar = this.f14137b;
            q.i(mVar);
            x xVar = new x(firebaseAuth);
            aVar.getClass();
            di diVar = new di(cVar, str, 0);
            diVar.d(firebaseAuth.f6305a);
            diVar.f4929d = mVar;
            diVar.f4930e = xVar;
            diVar.f4931f = xVar;
            return aVar.a(diVar);
        }
        a aVar2 = firebaseAuth.f6309e;
        w wVar = new w(firebaseAuth);
        aVar2.getClass();
        di diVar2 = new di(cVar, str, 1);
        diVar2.d(firebaseAuth.f6305a);
        diVar2.f4930e = wVar;
        return aVar2.a(diVar2);
    }
}
