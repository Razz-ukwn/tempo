package com.google.android.gms.internal.p000firebaseauthapi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.Executors;
import u6.i;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a0  reason: invalid package */
public final class a0 {
    static {
        if (r1 != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str : new String[]{"SmsRetrieverHelper"}) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
            sb2.append("] ");
        }
        new i("FirebaseAuth", (String) null);
        int i8 = 2;
        while (i8 <= 7 && !Log.isLoggable("FirebaseAuth", i8)) {
            i8++;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public a0(Context context) {
        new HashMap();
        Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
