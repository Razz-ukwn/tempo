package r6;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import h0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q6.c;
import u6.q;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f14070c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public static b f14071d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f14072a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f14073b;

    public b(Context context) {
        this.f14073b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        q.i(context);
        ReentrantLock reentrantLock = f14070c;
        reentrantLock.lock();
        try {
            if (f14071d == null) {
                f14071d = new b(context.getApplicationContext());
            }
            return f14071d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String g(String str, String str2) {
        return e.b(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e11) && (e10 = e(g("googleSignInAccount", e11))) != null) {
            try {
                return GoogleSignInAccount.x(e10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions c() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = e(g("googleSignInOptions", e11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.w(e10);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        q.i(googleSignInOptions);
        String str = googleSignInAccount.E;
        f("defaultGoogleSignInAccount", str);
        String g10 = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f4148b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f4149c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f4150d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f4151e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.G;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.H;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.B;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.C;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.D);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.F;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, c.f12885a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f4174b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(g10, jSONObject.toString());
            String g11 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.D;
            String str10 = googleSignInOptions.C;
            ArrayList arrayList = googleSignInOptions.f4153b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.N);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f4174b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f4154c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f4155d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.B);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f4156e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(g11, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f14072a;
        reentrantLock.lock();
        try {
            return this.f14073b.getString(str, (String) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f14072a;
        reentrantLock.lock();
        try {
            this.f14073b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
