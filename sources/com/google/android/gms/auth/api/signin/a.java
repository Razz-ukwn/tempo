package com.google.android.gms.auth.api.signin;

import ag.d;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import q6.b;
import r6.m;

public final class a {
    public static Task<GoogleSignInAccount> a(Intent intent) {
        b bVar;
        GoogleSignInAccount googleSignInAccount;
        x6.a aVar = m.f14081a;
        if (intent == null) {
            bVar = new b((GoogleSignInAccount) null, Status.D);
        } else {
            Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status == null) {
                    status = Status.D;
                }
                bVar = new b((GoogleSignInAccount) null, status);
            } else {
                bVar = new b(googleSignInAccount2, Status.B);
            }
        }
        Status status2 = bVar.f12883a;
        return (!(status2.f4176b <= 0) || (googleSignInAccount = bVar.f12884b) == null) ? Tasks.forException(d.f(status2)) : Tasks.forResult(googleSignInAccount);
    }
}
