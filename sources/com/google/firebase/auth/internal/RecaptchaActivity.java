package com.google.firebase.auth.internal;

import a3.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.l;
import androidx.fragment.app.x;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import com.google.android.gms.internal.p000firebaseauthapi.h;
import com.google.android.gms.internal.p000firebaseauthapi.nh;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import e.s;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import m9.f;
import q2.d;
import qa.b;
import s9.c0;
import s9.d0;
import s9.g0;
import s9.h0;
import s9.j;
import u6.q;

public class RecaptchaActivity extends x implements h {
    @SuppressLint({"ThreadPoolCreation"})
    public static final ExecutorService V = d.a();
    public static long W = 0;
    public static final d0 X = d0.f14821b;
    public boolean U = false;

    public final void K() {
        W = 0;
        this.U = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).c(intent);
        X.a(this);
        finish();
    }

    public final void L(Status status) {
        W = 0;
        this.U = false;
        Intent intent = new Intent();
        HashMap hashMap = c0.f14818a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).c(intent);
        X.a(this);
        finish();
    }

    public final Uri.Builder c(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        f e10 = f.e(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(e10);
        g0 g0Var = g0.f14829a;
        Context applicationContext = getApplicationContext();
        synchronized (g0Var) {
            q.f(str);
            q.f(uuid);
            SharedPreferences b10 = g0.b(applicationContext, str);
            g0.a(b10);
            SharedPreferences.Editor edit = b10.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra3);
            edit.apply();
        }
        String c3 = h0.a(getApplicationContext(), e10.f()).c();
        String str3 = null;
        if (TextUtils.isEmpty(c3)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            L(j.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (instance.f6311g) {
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            synchronized (instance.f6311g) {
            }
        } else {
            str3 = ag.d.l();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c3);
    }

    public final String e(String str) {
        return com.google.android.gms.internal.p000firebaseauthapi.c0.a(str);
    }

    public final void f(Status status) {
        if (status == null) {
            K();
        } else {
            L(status);
        }
    }

    public final HttpURLConnection h(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            h.f4591i.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void j(Uri uri, String str, b bVar) {
        nh nhVar = (nh) bVar.get();
        (nhVar != null ? nhVar.zza().continueWith(new s((Object) uri)) : Tasks.forResult(uri)).addOnCompleteListener(new l(13, (Object) this, (Object) str));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - W < 30000) {
                Log.e("RecaptchaActivity", "Could not start operation - already in progress");
                return;
            }
            W = currentTimeMillis;
            if (bundle != null) {
                this.U = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        Log.e("RecaptchaActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
        K();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        String string;
        boolean isEmpty;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                L(c0.a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                K();
            } else {
                String stringExtra = intent.getStringExtra("link");
                g0 g0Var = g0.f14829a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (g0Var) {
                    q.f(packageName);
                    q.f(stringExtra2);
                    SharedPreferences b10 = g0.b(applicationContext, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String string2 = b10.getString(format, (String) null);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    string = b10.getString(format2, (String) null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.apply();
                    isEmpty = TextUtils.isEmpty(string2);
                }
                if (!isEmpty) {
                    str = string;
                }
                if (TextUtils.isEmpty(str)) {
                    Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
                    L(j.a("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = h0.a(getApplicationContext(), f.e(str).f()).b(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                W = 0;
                this.U = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!a.a(this).c(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit2.putString("recaptchaToken", queryParameter);
                    edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit2.putLong("timestamp", System.currentTimeMillis());
                    edit2.commit();
                } else {
                    X.a(this);
                }
                finish();
            }
        } else if (!this.U) {
            Intent intent3 = getIntent();
            String packageName2 = getPackageName();
            try {
                new com.google.android.gms.internal.p000firebaseauthapi.f(packageName2, gf.d(z6.a.a(this, packageName2)).toLowerCase(Locale.US), intent3, f.e(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(V, new Void[0]);
            } catch (PackageManager.NameNotFoundException e10) {
                String obj = e10.toString();
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName2 + " " + obj);
                f((Status) null);
            }
            this.U = true;
        } else {
            K();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.U);
    }

    public final Context zza() {
        return getApplicationContext();
    }
}
