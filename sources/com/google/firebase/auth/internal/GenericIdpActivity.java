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
import android.util.Base64;
import android.util.Log;
import androidx.compose.ui.platform.j3;
import androidx.fragment.app.x;
import androidx.lifecycle.u;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.b0;
import com.google.android.gms.internal.p000firebaseauthapi.e6;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import com.google.android.gms.internal.p000firebaseauthapi.h;
import com.google.android.gms.internal.p000firebaseauthapi.nh;
import com.google.android.gms.internal.p000firebaseauthapi.v0;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import m9.f;
import org.json.JSONException;
import org.json.JSONObject;
import q2.d;
import qa.b;
import s9.c0;
import s9.d0;
import s9.g0;
import s9.h0;
import s9.j;
import u6.q;

@KeepName
public class GenericIdpActivity extends x implements h {
    public static long W;
    public static final d0 X = d0.f14821b;
    @SuppressLint({"ThreadPoolCreation"})
    public final ExecutorService U = d.a();
    public boolean V = false;

    public final void K() {
        W = 0;
        this.V = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        boolean c3 = a.a(this).c(intent);
        d0 d0Var = X;
        if (!c3) {
            Status a10 = j.a("WEB_CONTEXT_CANCELED");
            d0Var.getClass();
            d0.b(this, a10);
        } else {
            d0Var.a(this);
        }
        finish();
    }

    public final void L(Status status) {
        W = 0;
        this.V = false;
        Intent intent = new Intent();
        HashMap hashMap = c0.f14818a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        boolean c3 = a.a(this).c(intent);
        d0 d0Var = X;
        if (!c3) {
            Context applicationContext = getApplicationContext();
            d0Var.getClass();
            d0.b(applicationContext, status);
        } else {
            d0Var.a(this);
        }
        finish();
    }

    /* JADX INFO: finally extract failed */
    public final Uri.Builder c(Intent intent, String str, String str2) {
        String str3;
        String str4;
        Intent intent2 = intent;
        String str5 = str;
        Uri.Builder appendPath = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler");
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str3 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String next : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(next, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            str3 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        try {
            str4 = new String(MessageDigest.getInstance("SHA-256").digest(UUID.randomUUID().toString().getBytes()));
            int length = str4.length();
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                char charAt = str4.charAt(i8);
                if (charAt >= 'A' && charAt <= 'Z') {
                    char[] charArray = str4.toCharArray();
                    while (i8 < length) {
                        char c3 = charArray[i8];
                        if (c3 >= 'A' && c3 <= 'Z') {
                            charArray[i8] = (char) (c3 ^ ' ');
                        }
                        i8++;
                    }
                    str4 = String.valueOf(charArray);
                } else {
                    i8++;
                }
            }
        } catch (NoSuchAlgorithmException unused2) {
            h.f4591i.c("Failed to get SHA-256 MessageDigest", new Object[0]);
            str4 = null;
        }
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        g0 g0Var = g0.f14829a;
        Context applicationContext = getApplicationContext();
        synchronized (g0Var) {
            try {
                q.f(str);
                q.f(uuid);
                q.f(str4);
                q.f(stringExtra4);
                SharedPreferences b10 = g0.b(applicationContext, str5);
                g0.a(b10);
                SharedPreferences.Editor edit = b10.edit();
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{uuid}), str4);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), action);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{uuid}), stringExtra2);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra4);
                edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        String c10 = h0.a(getApplicationContext(), f.e(stringExtra4).f()).c();
        if (TextUtils.isEmpty(c10)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            L(j.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
        } else {
            if (str4 != null) {
                appendPath.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", str4).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str5).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
                if (!TextUtils.isEmpty(join)) {
                    appendPath.appendQueryParameter("scopes", join);
                }
                if (!TextUtils.isEmpty(str3)) {
                    appendPath.appendQueryParameter("customParameters", str3);
                }
                if (TextUtils.isEmpty(stringExtra3)) {
                    return appendPath;
                }
                appendPath.appendQueryParameter("tid", stringExtra3);
                return appendPath;
            }
        }
        return null;
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    public final void j(Uri uri, String str, b bVar) {
        nh nhVar = (nh) bVar.get();
        (nhVar != null ? nhVar.zza().continueWith(new u(uri, 12)) : Tasks.forResult(uri)).addOnCompleteListener(new j3((Object) this, (Object) str));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - W < 30000) {
                Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
            W = currentTimeMillis;
            if (bundle != null) {
                this.V = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
        K();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        b0 b0Var;
        e6 e6Var;
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
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (g0.f14829a) {
                    q.f(packageName);
                    q.f(stringExtra2);
                    SharedPreferences b10 = g0.b(this, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{stringExtra2});
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{stringExtra2});
                    String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    String string = b10.getString(format, (String) null);
                    String string2 = b10.getString(format2, (String) null);
                    String string3 = b10.getString(format3, (String) null);
                    String string4 = b10.getString("com.google.firebase.auth.api.gms.config.tenant.id", (String) null);
                    String string5 = b10.getString(format4, (String) null);
                    SharedPreferences.Editor edit = b10.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.remove(format3);
                    edit.remove(format4);
                    edit.apply();
                    e6Var = (string == null || string2 == null || string3 == null) ? null : new e6((Object) string, (Object) string2, (Object) string3, (Object) string4, (Object) string5);
                }
                if (e6Var == null) {
                    K();
                }
                if (booleanExtra) {
                    stringExtra = h0.a(getApplicationContext(), f.e((String) e6Var.f4514e).f()).b(stringExtra);
                }
                v0 v0Var = new v0(e6Var, stringExtra);
                String str2 = (String) e6Var.f4513d;
                String str3 = (String) e6Var.f4511b;
                v0Var.J = str2;
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str3)) {
                    W = 0;
                    this.V = false;
                    Intent intent2 = new Intent();
                    Parcel obtain = Parcel.obtain();
                    v0Var.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str3);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!a.a(this).c(intent2)) {
                        SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        Parcel obtain2 = Parcel.obtain();
                        v0Var.writeToParcel(obtain2, 0);
                        byte[] marshall2 = obtain2.marshall();
                        obtain2.recycle();
                        if (marshall2 != null) {
                            str = Base64.encodeToString(marshall2, 10);
                        }
                        edit2.putString("verifyAssertionRequest", str);
                        edit2.putString("operation", str3);
                        edit2.putString("tenantId", str2);
                        edit2.putLong("timestamp", System.currentTimeMillis());
                        edit2.commit();
                    } else {
                        X.a(this);
                    }
                    finish();
                    return;
                }
                Log.e("GenericIdpActivity", "unsupported operation: ".concat(str3));
                K();
            }
        } else if (!this.V) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = gf.d(z6.a.a(this, packageName2)).toLowerCase(Locale.US);
                f e10 = f.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                o.a aVar = com.google.android.gms.internal.p000firebaseauthapi.c0.f4437a;
                e10.a();
                if (!aVar.containsKey(e10.f11333c.f11343a)) {
                    new com.google.android.gms.internal.p000firebaseauthapi.f(packageName2, lowerCase, getIntent(), e10, this).executeOnExecutor(this.U, new Void[0]);
                    this.V = true;
                    return;
                }
                e10.a();
                String str4 = e10.f11333c.f11343a;
                synchronized (aVar) {
                    b0Var = (b0) aVar.getOrDefault(str4, null);
                }
                if (b0Var == null) {
                    throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
                }
                throw null;
            } catch (PackageManager.NameNotFoundException e11) {
                String obj = e11.toString();
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + obj);
                f((Status) null);
            }
        } else {
            K();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.V);
    }

    public final Context zza() {
        return getApplicationContext();
    }
}
