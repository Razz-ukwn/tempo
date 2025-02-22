package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c1  reason: invalid package */
public final class c1 {
    public static xh a(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        Log.e(str, "Failed to parse " + str + " for string [" + str2 + "] with exception: " + message);
        return new xh("Failed to parse " + str + " for string [" + str2 + "]", exc);
    }
}
