package t;

import ag.m;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.p000firebaseauthapi.bh;
import com.google.android.gms.internal.p000firebaseauthapi.ci;
import com.google.android.gms.internal.p000firebaseauthapi.dh;
import com.google.android.gms.internal.p000firebaseauthapi.ec;
import com.google.android.gms.internal.p000firebaseauthapi.s0;
import com.google.android.gms.internal.p000firebaseauthapi.wb;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f9.c;
import java.lang.reflect.Field;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import k7.r;
import org.json.JSONArray;
import org.json.JSONException;

public final class x2 implements s0, ec, bh, OnCompleteListener, g5, c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15277a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15278b;

    public /* synthetic */ x2(dh dhVar) {
        this.f15277a = 5;
        this.f15278b = dhVar;
    }

    public static boolean n(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String r(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final /* synthetic */ Iterator a(w2 w2Var, CharSequence charSequence) {
        return new ci(this, w2Var, charSequence);
    }

    public final void b() {
        int i8 = this.f15277a;
        Object obj = this.f15278b;
        switch (i8) {
            case 0:
                ((ArrayList) obj).clear();
                return;
            default:
                ((SparseArray) obj).clear();
                return;
        }
    }

    public final boolean c(String str) {
        String l10 = l(str);
        return "1".equals(l10) || Boolean.parseBoolean(l10);
    }

    public final Integer d(String str) {
        String l10 = l(str);
        if (TextUtils.isEmpty(l10)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(l10));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + r(str) + "(" + l10 + ") into an int");
            return null;
        }
    }

    public final JSONArray e(String str) {
        String l10 = l(str);
        if (TextUtils.isEmpty(l10)) {
            return null;
        }
        try {
            return new JSONArray(l10);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + r(str) + ": " + l10 + ", falling back to default");
            return null;
        }
    }

    public final int[] f() {
        JSONArray e10 = e("gcm.n.light_settings");
        if (e10 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (e10.length() == 3) {
                int parseColor = Color.parseColor(e10.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = e10.optInt(1);
                    iArr[2] = e10.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + e10 + ". Skipping setting LightSettings");
            return null;
        } catch (IllegalArgumentException e11) {
            Log.w("NotificationParams", "LightSettings is invalid: " + e10 + ". " + e11.getMessage() + ". Skipping setting LightSettings");
            return null;
        }
    }

    public final Uri g() {
        String l10 = l("gcm.n.link_android");
        if (TextUtils.isEmpty(l10)) {
            l10 = l("gcm.n.link");
        }
        if (!TextUtils.isEmpty(l10)) {
            return Uri.parse(l10);
        }
        return null;
    }

    public final Object[] h(String str) {
        JSONArray e10 = e(str.concat("_loc_args"));
        if (e10 == null) {
            return null;
        }
        int length = e10.length();
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            strArr[i8] = e10.optString(i8);
        }
        return strArr;
    }

    public final String i(String str) {
        return l(str.concat("_loc_key"));
    }

    public final Long j() {
        String l10 = l("gcm.n.event_time");
        if (TextUtils.isEmpty(l10)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(l10));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + r("gcm.n.event_time") + "(" + l10 + ") into a long");
            return null;
        }
    }

    public final String k(Resources resources, String str, String str2) {
        String l10 = l(str2);
        if (!TextUtils.isEmpty(l10)) {
            return l10;
        }
        String i8 = i(str2);
        if (!TextUtils.isEmpty(i8)) {
            int identifier = resources.getIdentifier(i8, "string", str);
            if (identifier == 0) {
                Log.w("NotificationParams", r(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            } else {
                Object[] h3 = h(str2);
                if (h3 == null) {
                    return resources.getString(identifier);
                }
                try {
                    return resources.getString(identifier, h3);
                } catch (MissingFormatArgumentException e10) {
                    Log.w("NotificationParams", "Missing format argument for " + r(str2) + ": " + Arrays.toString(h3) + " Default value will be used.", e10);
                }
            }
        }
        return null;
    }

    public final String l(String str) {
        Bundle bundle = (Bundle) this.f15278b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final long[] m() {
        JSONArray e10 = e("gcm.n.vibrate_timings");
        if (e10 == null) {
            return null;
        }
        try {
            if (e10.length() > 1) {
                int length = e10.length();
                long[] jArr = new long[length];
                for (int i8 = 0; i8 < length; i8++) {
                    jArr[i8] = e10.optLong(i8);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + e10 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public final Bundle o() {
        Object obj = this.f15278b;
        Bundle bundle = new Bundle((Bundle) obj);
        for (String next : ((Bundle) obj).keySet()) {
            if (!(next.startsWith("google.c.a.") || next.equals("from"))) {
                bundle.remove(next);
            }
        }
        return bundle;
    }

    public final void onComplete(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15278b;
        int i8 = r.E;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            exception.getClass();
            taskCompletionSource.trySetException(exception);
        }
    }

    public final Object p() {
        Object obj = this.f15278b;
        return ((ArrayList) obj).remove(((ArrayList) obj).size() - 1);
    }

    public final void q(Object obj) {
        ((ArrayList) this.f15278b).add(obj);
    }

    public final String toString() {
        switch (this.f15277a) {
            case ModuleDescriptor.MODULE_VERSION:
                return ((Field) this.f15278b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:66|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0160 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza() {
        /*
            r15 = this;
            int r0 = r15.f15277a
            r1 = 1
            r2 = 0
            switch(r0) {
                case 7: goto L_0x017b;
                case 8: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x01cf
        L_0x0009:
            java.lang.Object r0 = r15.f15278b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r3 = com.google.android.gms.internal.measurement.z4.f5617f
            java.lang.Class<com.google.android.gms.internal.measurement.o4> r3 = com.google.android.gms.internal.measurement.o4.class
            monitor-enter(r3)
            com.google.android.gms.internal.measurement.c5 r4 = com.google.android.gms.internal.measurement.o4.f5444a     // Catch:{ all -> 0x0178 }
            if (r4 != 0) goto L_0x0176
            java.lang.String r4 = android.os.Build.TYPE     // Catch:{ all -> 0x0178 }
            java.lang.String r5 = android.os.Build.TAGS     // Catch:{ all -> 0x0178 }
            java.lang.String r6 = "eng"
            boolean r6 = r4.equals(r6)     // Catch:{ all -> 0x0178 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "userdebug"
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x003b
        L_0x002a:
            java.lang.String r4 = "dev-keys"
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x0178 }
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = "test-keys"
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x0178 }
            if (r4 == 0) goto L_0x003b
            goto L_0x0040
        L_0x003b:
            com.google.android.gms.internal.measurement.b5 r0 = com.google.android.gms.internal.measurement.b5.f5163a     // Catch:{ all -> 0x0178 }
            r4 = r0
            goto L_0x016e
        L_0x0040:
            boolean r4 = r0.isDeviceProtectedStorage()     // Catch:{ all -> 0x0178 }
            if (r4 != 0) goto L_0x004a
            android.content.Context r0 = r0.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0178 }
        L_0x004a:
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0178 }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0171 }
            java.io.File r5 = new java.io.File     // Catch:{ RuntimeException -> 0x006d }
            java.lang.String r6 = "phenotype_hermetic"
            java.io.File r6 = r0.getDir(r6, r2)     // Catch:{ RuntimeException -> 0x006d }
            java.lang.String r7 = "overrides.txt"
            r5.<init>(r6, r7)     // Catch:{ RuntimeException -> 0x006d }
            boolean r6 = r5.exists()     // Catch:{ all -> 0x0171 }
            if (r6 == 0) goto L_0x006a
            com.google.android.gms.internal.measurement.e5 r6 = new com.google.android.gms.internal.measurement.e5     // Catch:{ all -> 0x0171 }
            r6.<init>(r5)     // Catch:{ all -> 0x0171 }
            goto L_0x0077
        L_0x006a:
            com.google.android.gms.internal.measurement.b5 r6 = com.google.android.gms.internal.measurement.b5.f5163a     // Catch:{ all -> 0x0171 }
            goto L_0x0077
        L_0x006d:
            r5 = move-exception
            java.lang.String r6 = "HermeticFileOverrides"
            java.lang.String r7 = "no data dir"
            android.util.Log.e(r6, r7, r5)     // Catch:{ all -> 0x0171 }
            com.google.android.gms.internal.measurement.b5 r6 = com.google.android.gms.internal.measurement.b5.f5163a     // Catch:{ all -> 0x0171 }
        L_0x0077:
            boolean r5 = r6.b()     // Catch:{ all -> 0x0171 }
            if (r5 == 0) goto L_0x0168
            java.lang.Object r5 = r6.a()     // Catch:{ all -> 0x0171 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x0171 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0161 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0161 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0161 }
            r8.<init>(r5)     // Catch:{ IOException -> 0x0161 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0161 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0161 }
            o.f r7 = new o.f     // Catch:{ all -> 0x0145 }
            r7.<init>()     // Catch:{ all -> 0x0145 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0145 }
            r8.<init>()     // Catch:{ all -> 0x0145 }
        L_0x009c:
            java.lang.String r9 = r6.readLine()     // Catch:{ all -> 0x0145 }
            if (r9 == 0) goto L_0x0111
            java.lang.String r10 = " "
            r11 = 3
            java.lang.String[] r10 = r9.split(r10, r11)     // Catch:{ all -> 0x0145 }
            int r12 = r10.length     // Catch:{ all -> 0x0145 }
            if (r12 == r11) goto L_0x00c3
            java.lang.String r10 = "HermeticFileOverrides"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            r11.<init>()     // Catch:{ all -> 0x0145 }
            java.lang.String r12 = "Invalid: "
            r11.append(r12)     // Catch:{ all -> 0x0145 }
            r11.append(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0145 }
            android.util.Log.e(r10, r9)     // Catch:{ all -> 0x0145 }
            goto L_0x009c
        L_0x00c3:
            r9 = r10[r2]     // Catch:{ all -> 0x0145 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0145 }
            r11.<init>(r9)     // Catch:{ all -> 0x0145 }
            r9 = r10[r1]     // Catch:{ all -> 0x0145 }
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0145 }
            r12.<init>(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = android.net.Uri.decode(r12)     // Catch:{ all -> 0x0145 }
            r12 = 2
            r13 = r10[r12]     // Catch:{ all -> 0x0145 }
            java.lang.Object r13 = r8.get(r13)     // Catch:{ all -> 0x0145 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0145 }
            if (r13 != 0) goto L_0x00f8
            r10 = r10[r12]     // Catch:{ all -> 0x0145 }
            java.lang.String r12 = new java.lang.String     // Catch:{ all -> 0x0145 }
            r12.<init>(r10)     // Catch:{ all -> 0x0145 }
            java.lang.String r13 = android.net.Uri.decode(r12)     // Catch:{ all -> 0x0145 }
            int r10 = r13.length()     // Catch:{ all -> 0x0145 }
            r14 = 1024(0x400, float:1.435E-42)
            if (r10 < r14) goto L_0x00f5
            if (r13 != r12) goto L_0x00f8
        L_0x00f5:
            r8.put(r12, r13)     // Catch:{ all -> 0x0145 }
        L_0x00f8:
            boolean r10 = r7.containsKey(r11)     // Catch:{ all -> 0x0145 }
            if (r10 != 0) goto L_0x0106
            o.f r10 = new o.f     // Catch:{ all -> 0x0145 }
            r10.<init>()     // Catch:{ all -> 0x0145 }
            r7.put(r11, r10)     // Catch:{ all -> 0x0145 }
        L_0x0106:
            r10 = 0
            java.lang.Object r10 = r7.getOrDefault(r11, r10)     // Catch:{ all -> 0x0145 }
            o.f r10 = (o.f) r10     // Catch:{ all -> 0x0145 }
            r10.put(r9, r13)     // Catch:{ all -> 0x0145 }
            goto L_0x009c
        L_0x0111:
            java.lang.String r8 = "HermeticFileOverrides"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            r9.<init>()     // Catch:{ all -> 0x0145 }
            java.lang.String r10 = "Parsed "
            r9.append(r10)     // Catch:{ all -> 0x0145 }
            r9.append(r5)     // Catch:{ all -> 0x0145 }
            java.lang.String r5 = " for Android package "
            r9.append(r5)     // Catch:{ all -> 0x0145 }
            r9.append(r0)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0145 }
            android.util.Log.w(r8, r0)     // Catch:{ all -> 0x0145 }
            com.google.android.gms.internal.measurement.m4 r0 = new com.google.android.gms.internal.measurement.m4     // Catch:{ all -> 0x0145 }
            r0.<init>(r7)     // Catch:{ all -> 0x0145 }
            r6.close()     // Catch:{ IOException -> 0x0161 }
            com.google.android.gms.internal.measurement.e5 r1 = new com.google.android.gms.internal.measurement.e5     // Catch:{ all -> 0x0171 }
            r1.<init>(r0)     // Catch:{ all -> 0x0171 }
            goto L_0x016a
        L_0x0145:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x014a }
            goto L_0x0160
        L_0x014a:
            r5 = move-exception
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0160 }
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            r8[r2] = r9     // Catch:{ Exception -> 0x0160 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x0160 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0160 }
            r1[r2] = r5     // Catch:{ Exception -> 0x0160 }
            r6.invoke(r0, r1)     // Catch:{ Exception -> 0x0160 }
        L_0x0160:
            throw r0     // Catch:{ IOException -> 0x0161 }
        L_0x0161:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0171 }
            r1.<init>(r0)     // Catch:{ all -> 0x0171 }
            throw r1     // Catch:{ all -> 0x0171 }
        L_0x0168:
            com.google.android.gms.internal.measurement.b5 r1 = com.google.android.gms.internal.measurement.b5.f5163a     // Catch:{ all -> 0x0171 }
        L_0x016a:
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ all -> 0x0178 }
            r4 = r1
        L_0x016e:
            com.google.android.gms.internal.measurement.o4.f5444a = r4     // Catch:{ all -> 0x0178 }
            goto L_0x0176
        L_0x0171:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)     // Catch:{ all -> 0x0178 }
            throw r0     // Catch:{ all -> 0x0178 }
        L_0x0176:
            monitor-exit(r3)     // Catch:{ all -> 0x0178 }
            return r4
        L_0x0178:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0178 }
            throw r0
        L_0x017b:
            java.lang.Object r0 = r15.f15278b
            com.google.android.gms.internal.measurement.k4 r0 = (com.google.android.gms.internal.measurement.k4) r0
            android.content.ContentResolver r3 = r0.f5350a
            android.net.Uri r4 = r0.f5351b
            java.lang.String[] r5 = com.google.android.gms.internal.measurement.k4.f5349i
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8)
            if (r0 != 0) goto L_0x0193
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L_0x01c9
        L_0x0193:
            int r3 = r0.getCount()     // Catch:{ all -> 0x01ca }
            if (r3 != 0) goto L_0x01a2
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x01ca }
            r0.close()
            r0 = r1
            goto L_0x01c9
        L_0x01a2:
            r4 = 256(0x100, float:3.59E-43)
            if (r3 > r4) goto L_0x01ac
            o.a r4 = new o.a     // Catch:{ all -> 0x01ca }
            r4.<init>((int) r3)     // Catch:{ all -> 0x01ca }
            goto L_0x01b3
        L_0x01ac:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x01ca }
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r5)     // Catch:{ all -> 0x01ca }
        L_0x01b3:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x01ca }
            if (r3 == 0) goto L_0x01c5
            java.lang.String r3 = r0.getString(r2)     // Catch:{ all -> 0x01ca }
            java.lang.String r5 = r0.getString(r1)     // Catch:{ all -> 0x01ca }
            r4.put(r3, r5)     // Catch:{ all -> 0x01ca }
            goto L_0x01b3
        L_0x01c5:
            r0.close()
            r0 = r4
        L_0x01c9:
            return r0
        L_0x01ca:
            r1 = move-exception
            r0.close()
            throw r1
        L_0x01cf:
            java.lang.Object r0 = r15.f15278b
            f9.c r0 = (f9.c) r0
            e9.f r0 = (e9.f) r0
            androidx.lifecycle.u r0 = r0.f7882a
            java.lang.Object r0 = r0.f2324b
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L_0x01e3
            e9.d r1 = new e9.d
            r1.<init>(r0)
            return r1
        L_0x01e3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Cannot return null from a non-@Nullable @Provides method"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.x2.zza():java.lang.Object");
    }

    public /* synthetic */ x2(Object obj, int i8) {
        this.f15277a = i8;
        this.f15278b = obj;
    }

    public x2(wb wbVar) {
        this.f15277a = 3;
        if (m.y(1)) {
            this.f15278b = wbVar;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public x2() {
        this.f15277a = 0;
        this.f15278b = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public x2(int i8) {
        this(new SparseArray(i8), 1);
        this.f15277a = 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj) {
        this(10);
        this.f15277a = 1;
    }

    public x2(Bundle bundle) {
        this.f15277a = 10;
        if (bundle != null) {
            this.f15278b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public final Object zza(String str) {
        return ((dh) this.f15278b).b(str, (Provider) null);
    }
}
