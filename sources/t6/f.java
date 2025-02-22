package t6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.atomic.AtomicBoolean;
import z6.c;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15395a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    public static final f f15396b = new f();

    static {
        AtomicBoolean atomicBoolean = i.f15402a;
    }

    public Intent a(int i8, Context context, String str) {
        if (i8 == 1 || i8 == 2) {
            if (context == null || !c.a(context)) {
                StringBuilder sb2 = new StringBuilder("gcore_");
                sb2.append(f15395a);
                sb2.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                }
                sb2.append("-");
                if (context != null) {
                    sb2.append(context.getPackageName());
                }
                sb2.append("-");
                if (context != null) {
                    try {
                        sb2.append(b7.c.a(context).b(0, context.getPackageName()).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb3 = sb2.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb3)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i8 != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    @ResultIgnorabilityUnspecified
    public int b(Context context) {
        return c(context, f15395a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(android.content.Context r9, int r10) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = t6.i.f15402a
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x000d }
            r1 = 2131951734(0x7f130076, float:1.953989E38)
            r0.getString(r1)     // Catch:{ all -> 0x000d }
            goto L_0x0014
        L_0x000d:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0014:
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0079
            java.util.concurrent.atomic.AtomicBoolean r0 = t6.i.f15405d
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x002a
            goto L_0x0079
        L_0x002a:
            java.lang.Object r0 = u6.s0.f15860a
            monitor-enter(r0)
            boolean r2 = u6.s0.f15861b     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0033
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0060
        L_0x0033:
            u6.s0.f15861b = r1     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = r9.getPackageName()     // Catch:{ all -> 0x0076 }
            b7.b r3 = b7.c.a(r9)     // Catch:{ all -> 0x0076 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.a(r4, r2)     // Catch:{ NameNotFoundException -> 0x0057 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0057 }
            if (r2 != 0) goto L_0x0049
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0060
        L_0x0049:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0057 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0057 }
            u6.s0.f15862c = r2     // Catch:{ NameNotFoundException -> 0x0057 }
            goto L_0x005f
        L_0x0057:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0076 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
        L_0x0060:
            int r0 = u6.s0.f15862c
            if (r0 == 0) goto L_0x0070
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x006a
            goto L_0x0079
        L_0x006a:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r9.<init>(r0)
            throw r9
        L_0x0070:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L_0x0076:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            throw r9
        L_0x0079:
            boolean r0 = z6.c.a(r9)
            r2 = 0
            if (r0 != 0) goto L_0x00b0
            java.lang.Boolean r0 = z6.c.f17771c
            if (r0 != 0) goto L_0x00a6
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x009f
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r0 = r2
            goto L_0x00a0
        L_0x009f:
            r0 = r1
        L_0x00a0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            z6.c.f17771c = r0
        L_0x00a6:
            java.lang.Boolean r0 = z6.c.f17771c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b0
            r0 = r1
            goto L_0x00b1
        L_0x00b0:
            r0 = r2
        L_0x00b1:
            if (r10 < 0) goto L_0x00b5
            r3 = r1
            goto L_0x00b6
        L_0x00b5:
            r3 = r2
        L_0x00b6:
            u6.q.a(r3)
            java.lang.String r3 = r9.getPackageName()
            android.content.pm.PackageManager r4 = r9.getPackageManager()
            if (r0 == 0) goto L_0x00dc
            java.lang.String r5 = "com.android.vending"
            r6 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r5 = r4.getPackageInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x00cc }
            goto L_0x00dd
        L_0x00cc:
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r3, r10)
            goto L_0x013a
        L_0x00dc:
            r5 = 0
        L_0x00dd:
            java.lang.String r6 = "com.google.android.gms"
            r7 = 64
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x0197 }
            t6.j.a(r9)
            boolean r7 = t6.j.d(r6, r1)
            if (r7 != 0) goto L_0x00fe
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r3, r10)
            goto L_0x013a
        L_0x00fe:
            if (r0 == 0) goto L_0x0119
            u6.q.i(r5)
            boolean r7 = t6.j.d(r5, r1)
            if (r7 != 0) goto L_0x0119
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r3, r10)
            goto L_0x013a
        L_0x0119:
            if (r0 == 0) goto L_0x013e
            if (r5 == 0) goto L_0x013e
            android.content.pm.Signature[] r0 = r5.signatures
            r0 = r0[r2]
            android.content.pm.Signature[] r5 = r6.signatures
            r5 = r5[r2]
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x013e
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r3, r10)
        L_0x013a:
            r10 = 9
            goto L_0x01a7
        L_0x013e:
            int r0 = r6.versionCode
            r5 = -1
            if (r0 != r5) goto L_0x0145
            r7 = r5
            goto L_0x0147
        L_0x0145:
            int r7 = r0 / 1000
        L_0x0147:
            if (r10 != r5) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            int r5 = r10 / 1000
        L_0x014c:
            if (r7 >= r5) goto L_0x0173
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Google Play services out of date for "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = ".  Requires "
            r4.append(r3)
            r4.append(r10)
            java.lang.String r10 = " but found "
            r4.append(r10)
            r4.append(r0)
            java.lang.String r10 = r4.toString()
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.util.Log.w(r0, r10)
            r10 = 2
            goto L_0x01a7
        L_0x0173:
            android.content.pm.ApplicationInfo r10 = r6.applicationInfo
            if (r10 != 0) goto L_0x018f
            java.lang.String r10 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r10 = r4.getApplicationInfo(r10, r2)     // Catch:{ NameNotFoundException -> 0x017e }
            goto L_0x018f
        L_0x017e:
            r10 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r3 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r4 = "GooglePlayServicesUtil"
            java.lang.String r0 = r0.concat(r3)
            android.util.Log.wtf(r4, r0, r10)
            goto L_0x01a6
        L_0x018f:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0195
            r10 = 3
            goto L_0x01a7
        L_0x0195:
            r10 = r2
            goto L_0x01a7
        L_0x0197:
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r3, r10)
        L_0x01a6:
            r10 = r1
        L_0x01a7:
            r0 = 18
            if (r10 != r0) goto L_0x01ac
            goto L_0x01b4
        L_0x01ac:
            if (r10 != r1) goto L_0x01b3
            boolean r1 = t6.i.b(r9)
            goto L_0x01b4
        L_0x01b3:
            r1 = r2
        L_0x01b4:
            if (r1 == 0) goto L_0x01b7
            return r0
        L_0x01b7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.f.c(android.content.Context, int):int");
    }
}
