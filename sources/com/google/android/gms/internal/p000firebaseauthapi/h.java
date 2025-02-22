package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import qa.b;
import x6.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h  reason: invalid package */
public interface h {

    /* renamed from: i  reason: collision with root package name */
    public static final a f4591i = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Uri.Builder c(Intent intent, String str, String str2);

    String e(String str);

    void f(Status status);

    HttpURLConnection h(URL url);

    void j(Uri uri, String str, b bVar);

    Context zza();
}
