package z9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.q9;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import ra.f;

public final class g0 implements h0 {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f17832g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f17833h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final q9 f17834a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f17835b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17836c;

    /* renamed from: d  reason: collision with root package name */
    public final f f17837d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f17838e;

    /* renamed from: f  reason: collision with root package name */
    public String f17839f;

    public g0(Context context, String str, f fVar, c0 c0Var) {
        if (str != null) {
            this.f17835b = context;
            this.f17836c = str;
            this.f17837d = fVar;
            this.f17838e = c0Var;
            this.f17834a = new q9();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        lowerCase = uuid == null ? null : f17832g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, (Throwable) null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized String c() {
        String str;
        String str2 = this.f17839f;
        if (str2 != null) {
            return str2;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", (Throwable) null);
        }
        boolean z10 = false;
        SharedPreferences sharedPreferences = this.f17835b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", (String) null);
        String str3 = "Cached Firebase Installation ID: " + string;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str3, (Throwable) null);
        }
        if (this.f17838e.b()) {
            try {
                str = (String) j0.a(this.f17837d.getId());
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e10);
                str = null;
            }
            String str4 = "Fetched Firebase Installation ID: " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str4, (Throwable) null);
            }
            if (str == null) {
                str = string == null ? b() : string;
            }
            if (str.equals(string)) {
                this.f17839f = sharedPreferences.getString("crashlytics.installation.id", (String) null);
            } else {
                this.f17839f = a(str, sharedPreferences);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                z10 = true;
            }
            if (z10) {
                this.f17839f = sharedPreferences.getString("crashlytics.installation.id", (String) null);
            } else {
                this.f17839f = a(b(), sharedPreferences);
            }
        }
        if (this.f17839f == null) {
            Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", (Throwable) null);
            this.f17839f = a(b(), sharedPreferences);
        }
        String str5 = "Crashlytics installation ID: " + this.f17839f;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str5, (Throwable) null);
        }
        return this.f17839f;
    }

    public final String d() {
        String str;
        q9 q9Var = this.f17834a;
        Context context = this.f17835b;
        synchronized (q9Var) {
            if (q9Var.f4842a == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                q9Var.f4842a = installerPackageName;
            }
            str = "".equals(q9Var.f4842a) ? null : q9Var.f4842a;
        }
        return str;
    }
}
