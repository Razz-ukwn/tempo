package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import s6.a;
import s6.b;
import wa.l;
import wa.r;

public final class FirebaseInstanceIdReceiver extends b {
    public final int a(Context context, a aVar) {
        try {
            return ((Integer) Tasks.await(new l(context).b(aVar.f14747a))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    public final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (r.b(putExtras)) {
            r.a(putExtras.getExtras(), "_nd");
        }
    }
}
