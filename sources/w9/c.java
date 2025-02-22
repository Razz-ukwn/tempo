package w9;

import android.content.Context;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16533a;

    /* renamed from: b  reason: collision with root package name */
    public a f16534b = null;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16535a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16536b;

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(w9.c r6) {
            /*
                r5 = this;
                r5.<init>()
                android.content.Context r0 = r6.f16533a
                java.lang.String r1 = "com.google.firebase.crashlytics.unity_version"
                java.lang.String r2 = "string"
                int r0 = z9.f.f(r0, r1, r2)
                r1 = 2
                java.lang.String r2 = "FirebaseCrashlytics"
                r3 = 0
                android.content.Context r6 = r6.f16533a
                if (r0 == 0) goto L_0x0033
                java.lang.String r4 = "Unity"
                r5.f16535a = r4
                android.content.res.Resources r6 = r6.getResources()
                java.lang.String r6 = r6.getString(r0)
                r5.f16536b = r6
                java.lang.String r0 = "Unity Editor version is: "
                java.lang.String r6 = j0.t.a(r0, r6)
                boolean r0 = android.util.Log.isLoggable(r2, r1)
                if (r0 == 0) goto L_0x0064
                android.util.Log.v(r2, r6, r3)
                goto L_0x0064
            L_0x0033:
                java.lang.String r0 = "flutter_assets/NOTICES.Z"
                android.content.res.AssetManager r4 = r6.getAssets()
                if (r4 != 0) goto L_0x003c
                goto L_0x004b
            L_0x003c:
                android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ IOException -> 0x004b }
                java.io.InputStream r6 = r6.open(r0)     // Catch:{ IOException -> 0x004b }
                if (r6 == 0) goto L_0x0049
                r6.close()     // Catch:{ IOException -> 0x004b }
            L_0x0049:
                r6 = 1
                goto L_0x004c
            L_0x004b:
                r6 = 0
            L_0x004c:
                if (r6 == 0) goto L_0x0060
                java.lang.String r6 = "Flutter"
                r5.f16535a = r6
                r5.f16536b = r3
                boolean r6 = android.util.Log.isLoggable(r2, r1)
                if (r6 == 0) goto L_0x0064
                java.lang.String r6 = "Development platform is: Flutter"
                android.util.Log.v(r2, r6, r3)
                goto L_0x0064
            L_0x0060:
                r5.f16535a = r3
                r5.f16536b = r3
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w9.c.a.<init>(w9.c):void");
        }
    }

    public c(Context context) {
        this.f16533a = context;
    }
}
