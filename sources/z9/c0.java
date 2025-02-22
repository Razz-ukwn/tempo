package z9;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import m9.f;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f17802a;

    /* renamed from: b  reason: collision with root package name */
    public final f f17803b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f17804c;

    /* renamed from: d  reason: collision with root package name */
    public TaskCompletionSource<Void> f17805d = new TaskCompletionSource<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f17806e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17807f = false;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f17808g;

    /* renamed from: h  reason: collision with root package name */
    public final TaskCompletionSource<Void> f17809h = new TaskCompletionSource<>();

    public c0(f fVar) {
        Boolean bool;
        Object obj = new Object();
        this.f17804c = obj;
        fVar.a();
        Context context = fVar.f11331a;
        this.f17803b = fVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f17802a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f17807f = false;
            bool = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            bool = null;
        }
        this.f17808g = bool == null ? a(context) : bool;
        synchronized (obj) {
            if (b()) {
                this.f17805d.trySetResult(null);
                this.f17806e = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002a }
            if (r2 == 0) goto L_0x0032
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x002a }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x002a }
            if (r5 == 0) goto L_0x0032
            android.os.Bundle r2 = r5.metaData     // Catch:{ NameNotFoundException -> 0x002a }
            if (r2 == 0) goto L_0x0032
            boolean r2 = r2.containsKey(r0)     // Catch:{ NameNotFoundException -> 0x002a }
            if (r2 == 0) goto L_0x0032
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x002a }
            boolean r5 = r5.getBoolean(r0)     // Catch:{ NameNotFoundException -> 0x002a }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ NameNotFoundException -> 0x002a }
            goto L_0x0033
        L_0x002a:
            r5 = move-exception
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r0, r2, r5)
        L_0x0032:
            r5 = r1
        L_0x0033:
            if (r5 != 0) goto L_0x0039
            r5 = 0
            r4.f17807f = r5
            return r1
        L_0x0039:
            r0 = 1
            r4.f17807f = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r5 = r0.equals(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.c0.a(android.content.Context):java.lang.Boolean");
    }

    public final synchronized boolean b() {
        boolean booleanValue;
        Boolean bool = this.f17808g;
        booleanValue = bool != null ? bool.booleanValue() : this.f17803b.j();
        c(booleanValue);
        return booleanValue;
    }

    public final void c(boolean z10) {
        boolean z11 = false;
        String format = String.format("Crashlytics automatic data collection %s by %s.", new Object[]{z10 ? "ENABLED" : "DISABLED", this.f17808g == null ? "global Firebase setting" : this.f17807f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"});
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z11 = true;
        }
        if (z11) {
            Log.d("FirebaseCrashlytics", format, (Throwable) null);
        }
    }
}
