package r9;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.a;
import com.google.android.gms.internal.p000firebaseauthapi.ei;
import com.google.android.gms.internal.p000firebaseauthapi.fi;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import s9.t;
import u6.q;

public final class l0 extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f14131b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f14132c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f14133d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f14134e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f14135f;

    public l0(FirebaseAuth firebaseAuth, String str, boolean z10, m mVar, String str2, String str3) {
        this.f14135f = firebaseAuth;
        this.f14130a = str;
        this.f14131b = z10;
        this.f14132c = mVar;
        this.f14133d = str2;
        this.f14134e = str3;
    }

    public final Task a(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = this.f14130a;
        if (isEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email ".concat(String.valueOf(str2)));
        }
        boolean z10 = this.f14131b;
        String str3 = this.f14134e;
        String str4 = this.f14133d;
        FirebaseAuth firebaseAuth = this.f14135f;
        if (z10) {
            a aVar = firebaseAuth.f6309e;
            m mVar = this.f14132c;
            q.i(mVar);
            x xVar = new x(firebaseAuth);
            aVar.getClass();
            ei eiVar = new ei(str2, str4, str3, str);
            eiVar.d(firebaseAuth.f6305a);
            eiVar.f4929d = mVar;
            eiVar.f4930e = xVar;
            eiVar.f4931f = xVar;
            return aVar.a(eiVar);
        }
        a aVar2 = firebaseAuth.f6309e;
        w wVar = new w(firebaseAuth);
        aVar2.getClass();
        fi fiVar = new fi(str2, str4, str3, str);
        fiVar.d(firebaseAuth.f6305a);
        fiVar.f4930e = wVar;
        return aVar2.a(fiVar);
    }
}
