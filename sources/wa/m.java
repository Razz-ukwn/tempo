package wa;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Intent> f16627a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ThreadPoolCreation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            android.content.Intent r5 = r5.getIntent()
            if (r5 == 0) goto L_0x00a0
            java.util.Set<android.content.Intent> r6 = r4.f16627a
            boolean r6 = r6.add(r5)
            if (r6 != 0) goto L_0x0010
            goto L_0x00a0
        L_0x0010:
            java.lang.String r6 = "FirebaseMessaging"
            android.os.Bundle r5 = r5.getExtras()     // Catch:{ RuntimeException -> 0x001f }
            if (r5 == 0) goto L_0x0025
            java.lang.String r0 = "gcm.n.analytics_data"
            android.os.Bundle r5 = r5.getBundle(r0)     // Catch:{ RuntimeException -> 0x001f }
            goto L_0x0026
        L_0x001f:
            r5 = move-exception
            java.lang.String r0 = "Failed trying to get analytics data from Intent extras."
            android.util.Log.w(r6, r0, r5)
        L_0x0025:
            r5 = 0
        L_0x0026:
            java.lang.String r0 = "1"
            if (r5 != 0) goto L_0x002c
            r1 = 0
            goto L_0x0036
        L_0x002c:
            java.lang.String r1 = "google.c.a.e"
            java.lang.String r1 = r5.getString(r1)
            boolean r1 = r0.equals(r1)
        L_0x0036:
            if (r1 == 0) goto L_0x00a0
            if (r5 != 0) goto L_0x003b
            goto L_0x009b
        L_0x003b:
            java.lang.String r1 = "google.c.a.tc"
            java.lang.String r1 = r5.getString(r1)
            boolean r0 = r0.equals(r1)
            r1 = 3
            if (r0 == 0) goto L_0x0090
            m9.f r0 = m9.f.d()
            java.lang.Class<o9.a> r2 = o9.a.class
            java.lang.Object r0 = r0.b(r2)
            o9.a r0 = (o9.a) r0
            boolean r1 = android.util.Log.isLoggable(r6, r1)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "Received event with track-conversion=true. Setting user property and reengagement event"
            android.util.Log.d(r6, r1)
        L_0x005f:
            if (r0 == 0) goto L_0x008a
            java.lang.String r6 = "google.c.a.c_id"
            java.lang.String r6 = r5.getString(r6)
            r0.c(r6)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "source"
            java.lang.String r3 = "Firebase"
            r1.putString(r2, r3)
            java.lang.String r2 = "medium"
            java.lang.String r3 = "notification"
            r1.putString(r2, r3)
            java.lang.String r2 = "campaign"
            r1.putString(r2, r6)
            java.lang.String r6 = "_cmp"
            java.lang.String r2 = "fcm"
            r0.b(r2, r6, r1)
            goto L_0x009b
        L_0x008a:
            java.lang.String r0 = "Unable to set user property for conversion tracking:  analytics library is missing"
            android.util.Log.w(r6, r0)
            goto L_0x009b
        L_0x0090:
            boolean r0 = android.util.Log.isLoggable(r6, r1)
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = "Received event with track-conversion=false. Do not set user property"
            android.util.Log.d(r6, r0)
        L_0x009b:
            java.lang.String r6 = "_no"
            wa.r.a(r5, r6)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.m.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f16627a.remove(activity.getIntent());
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
