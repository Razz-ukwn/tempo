package r6;

import android.content.Context;
import android.os.Parcel;
import cb.f;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.k;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.b;
import q6.a;
import u6.g0;
import u6.q;

public abstract class o extends b {
    public o() {
        super(0, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public final boolean a(int i8, Parcel parcel, Parcel parcel2) {
        k kVar;
        boolean z10 = false;
        if (i8 == 1) {
            s sVar = (s) this;
            sVar.c();
            Context context = sVar.f14084b;
            b a10 = b.a(context);
            GoogleSignInAccount b10 = a10.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.H;
            if (b10 != null) {
                googleSignInOptions = a10.c();
            }
            q.i(googleSignInOptions);
            a aVar = new a(context, googleSignInOptions);
            if (b10 != null) {
                boolean z11 = aVar.f() == 3;
                m.f14081a.a("Revoking access", new Object[0]);
                Context context2 = aVar.f4183a;
                String e10 = b.a(context2).e("refreshToken");
                m.b(context2);
                if (!z11) {
                    f0 f0Var = aVar.f4190h;
                    k kVar2 = new k(f0Var);
                    f0Var.a(kVar2);
                    kVar = kVar2;
                } else if (e10 == null) {
                    x6.a aVar2 = e.f14074c;
                    Status status = new Status(4, (String) null);
                    if (status.f4176b <= 0) {
                        z10 = true;
                    }
                    q.b(!z10, "Status code must not be SUCCESS");
                    k kVar3 = new k(status);
                    kVar3.e(status);
                    kVar = kVar3;
                } else {
                    e eVar = new e(e10);
                    new Thread(eVar).start();
                    kVar = eVar.f14076b;
                }
                f fVar = new f();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                kVar.a(new g0(kVar, taskCompletionSource, fVar));
                taskCompletionSource.getTask();
            } else {
                aVar.e();
            }
        } else if (i8 != 2) {
            return false;
        } else {
            s sVar2 = (s) this;
            sVar2.c();
            n.a(sVar2.f14084b).b();
        }
        return true;
    }
}
