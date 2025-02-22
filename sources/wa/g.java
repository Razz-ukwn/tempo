package wa;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import t.x2;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f16590a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f16591b;

    /* renamed from: c  reason: collision with root package name */
    public final x2 f16592c;

    public g(Context context, x2 x2Var, ExecutorService executorService) {
        this.f16590a = executorService;
        this.f16591b = context;
        this.f16592c = x2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        if (r0 != null) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x036e A[SYNTHETIC, Splitter:B:146:0x036e] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0395 A[SYNTHETIC, Splitter:B:152:0x0395] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04ef A[SYNTHETIC, Splitter:B:219:0x04ef] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3 A[Catch:{ NameNotFoundException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r18 = this;
            r1 = r18
            t.x2 r0 = r1.f16592c
            java.lang.String r2 = "gcm.n.noui"
            boolean r0 = r0.c(r2)
            r2 = 1
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.Context r0 = r1.f16591b
            java.lang.String r3 = "keyguard"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3
            boolean r3 = r3.inKeyguardRestrictedInputMode()
            r4 = 0
            if (r3 == 0) goto L_0x0020
            goto L_0x004e
        L_0x0020:
            int r3 = android.os.Process.myPid()
            java.lang.String r5 = "activity"
            java.lang.Object r0 = r0.getSystemService(r5)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x004e
            java.util.Iterator r0 = r0.iterator()
        L_0x0036:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x004e
            java.lang.Object r5 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5
            int r6 = r5.pid
            if (r6 != r3) goto L_0x0036
            int r0 = r5.importance
            r3 = 100
            if (r0 != r3) goto L_0x004e
            r0 = r2
            goto L_0x004f
        L_0x004e:
            r0 = r4
        L_0x004f:
            if (r0 == 0) goto L_0x0052
            return r4
        L_0x0052:
            t.x2 r0 = r1.f16592c
            java.lang.String r3 = "gcm.n.image"
            java.lang.String r0 = r0.l(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r6 = "FirebaseMessaging"
            if (r3 == 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            wa.q r3 = new wa.q     // Catch:{ MalformedURLException -> 0x006e }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006e }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x006e }
            r3.<init>(r7)     // Catch:{ MalformedURLException -> 0x006e }
            goto L_0x0080
        L_0x006e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Not downloading image, bad URL: "
            r3.<init>(r7)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r6, r0)
        L_0x007f:
            r3 = 0
        L_0x0080:
            r7 = 4
            if (r3 == 0) goto L_0x009b
            java.util.concurrent.ExecutorService r0 = r1.f16590a
            com.google.android.gms.tasks.TaskCompletionSource r8 = new com.google.android.gms.tasks.TaskCompletionSource
            r8.<init>()
            e.q r9 = new e.q
            r9.<init>(r7, r3, r8)
            java.util.concurrent.Future r0 = r0.submit(r9)
            r3.f16639b = r0
            com.google.android.gms.tasks.Task r0 = r8.getTask()
            r3.f16640c = r0
        L_0x009b:
            android.content.Context r8 = r1.f16591b
            t.x2 r9 = r1.f16592c
            java.util.concurrent.atomic.AtomicInteger r0 = wa.e.f16573a
            java.lang.String r10 = "Couldn't get own application info: "
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r11 = r8.getPackageName()
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r11, r12)     // Catch:{ NameNotFoundException -> 0x00b8 }
            if (r0 == 0) goto L_0x00c8
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00b8 }
            if (r0 == 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00b8:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r6, r0)
        L_0x00c8:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
        L_0x00ca:
            r11 = r0
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r9.l(r0)
            r12 = 3
            android.content.pm.PackageManager r13 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x015e }
            java.lang.String r14 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x015e }
            android.content.pm.ApplicationInfo r13 = r13.getApplicationInfo(r14, r4)     // Catch:{ NameNotFoundException -> 0x015e }
            int r13 = r13.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x015e }
            r14 = 26
            if (r13 >= r14) goto L_0x00e6
            goto L_0x015e
        L_0x00e6:
            java.lang.Class<android.app.NotificationManager> r13 = android.app.NotificationManager.class
            java.lang.Object r13 = r8.getSystemService(r13)
            android.app.NotificationManager r13 = (android.app.NotificationManager) r13
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x0111
            android.app.NotificationChannel r14 = r13.getNotificationChannel(r0)
            if (r14 == 0) goto L_0x00fb
            goto L_0x015f
        L_0x00fb:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Notification Channel requested ("
            r14.<init>(r15)
            r14.append(r0)
            java.lang.String r0 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            android.util.Log.w(r6, r0)
        L_0x0111:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r0 = r11.getString(r0)
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x012a
            android.app.NotificationChannel r14 = r13.getNotificationChannel(r0)
            if (r14 == 0) goto L_0x0124
            goto L_0x015f
        L_0x0124:
            java.lang.String r0 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r6, r0)
            goto L_0x012f
        L_0x012a:
            java.lang.String r0 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r6, r0)
        L_0x012f:
            java.lang.String r0 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r14 = r13.getNotificationChannel(r0)
            if (r14 != 0) goto L_0x015f
            android.content.res.Resources r14 = r8.getResources()
            java.lang.String r15 = r8.getPackageName()
            java.lang.String r5 = "fcm_fallback_notification_channel_label"
            java.lang.String r2 = "string"
            int r2 = r14.getIdentifier(r5, r2, r15)
            if (r2 != 0) goto L_0x0151
            java.lang.String r2 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r6, r2)
            java.lang.String r2 = "Misc"
            goto L_0x0155
        L_0x0151:
            java.lang.String r2 = r8.getString(r2)
        L_0x0155:
            android.app.NotificationChannel r5 = new android.app.NotificationChannel
            r5.<init>(r0, r2, r12)
            r13.createNotificationChannel(r5)
            goto L_0x015f
        L_0x015e:
            r0 = 0
        L_0x015f:
            java.lang.String r2 = r8.getPackageName()
            android.content.res.Resources r5 = r8.getResources()
            android.content.pm.PackageManager r13 = r8.getPackageManager()
            s1.s r14 = new s1.s
            r14.<init>(r8, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r9.k(r5, r2, r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x0182
            java.lang.CharSequence r0 = s1.s.b(r0)
            r14.f14515e = r0
        L_0x0182:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r0 = r9.k(r5, r2, r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x01a2
            java.lang.CharSequence r15 = s1.s.b(r0)
            r14.f14516f = r15
            s1.r r15 = new s1.r
            r15.<init>()
            java.lang.CharSequence r0 = s1.s.b(r0)
            r15.f14510b = r0
            r14.e(r15)
        L_0x01a2:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = r9.l(r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x01e2
            java.lang.String r15 = "drawable"
            int r15 = r5.getIdentifier(r0, r15, r2)
            if (r15 == 0) goto L_0x01bd
            boolean r16 = wa.e.a(r5, r15)
            if (r16 == 0) goto L_0x01bd
            goto L_0x0214
        L_0x01bd:
            java.lang.String r15 = "mipmap"
            int r15 = r5.getIdentifier(r0, r15, r2)
            if (r15 == 0) goto L_0x01cc
            boolean r16 = wa.e.a(r5, r15)
            if (r16 == 0) goto L_0x01cc
            goto L_0x0214
        L_0x01cc:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r12 = "Icon resource "
            r15.<init>(r12)
            r15.append(r0)
            java.lang.String r0 = " not found. Notification will use default icon."
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            android.util.Log.w(r6, r0)
        L_0x01e2:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r12 = r11.getInt(r0, r4)
            if (r12 == 0) goto L_0x01f0
            boolean r0 = wa.e.a(r5, r12)
            if (r0 != 0) goto L_0x0208
        L_0x01f0:
            android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x01f8 }
            int r0 = r0.icon     // Catch:{ NameNotFoundException -> 0x01f8 }
            r15 = r0
            goto L_0x0209
        L_0x01f8:
            r0 = move-exception
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r10)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            android.util.Log.w(r6, r0)
        L_0x0208:
            r15 = r12
        L_0x0209:
            if (r15 == 0) goto L_0x0211
            boolean r0 = wa.e.a(r5, r15)
            if (r0 != 0) goto L_0x0214
        L_0x0211:
            r15 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0214:
            android.app.Notification r0 = r14.f14528s
            r0.icon = r15
            java.lang.String r10 = "gcm.n.sound2"
            java.lang.String r10 = r9.l(r10)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 == 0) goto L_0x022a
            java.lang.String r10 = "gcm.n.sound"
            java.lang.String r10 = r9.l(r10)
        L_0x022a:
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            r15 = 2
            if (r12 == 0) goto L_0x0233
            r5 = 0
            goto L_0x0262
        L_0x0233:
            java.lang.String r12 = "default"
            boolean r12 = r12.equals(r10)
            if (r12 != 0) goto L_0x025e
            java.lang.String r12 = "raw"
            int r5 = r5.getIdentifier(r10, r12, r2)
            if (r5 == 0) goto L_0x025e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r12 = "android.resource://"
            r5.<init>(r12)
            r5.append(r2)
            java.lang.String r12 = "/raw/"
            r5.append(r12)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            goto L_0x0262
        L_0x025e:
            android.net.Uri r5 = android.media.RingtoneManager.getDefaultUri(r15)
        L_0x0262:
            r10 = -1
            if (r5 == 0) goto L_0x027e
            android.app.Notification r12 = r14.f14528s
            r12.sound = r5
            r12.audioStreamType = r10
            android.media.AudioAttributes$Builder r5 = s1.s.a.b()
            android.media.AudioAttributes$Builder r5 = s1.s.a.c(r5, r7)
            r7 = 5
            android.media.AudioAttributes$Builder r5 = s1.s.a.e(r5, r7)
            android.media.AudioAttributes r5 = s1.s.a.a(r5)
            r12.audioAttributes = r5
        L_0x027e:
            java.lang.String r5 = "gcm.n.click_action"
            java.lang.String r5 = r9.l(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x0298
            android.content.Intent r7 = new android.content.Intent
            r7.<init>(r5)
            r7.setPackage(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r7.setFlags(r2)
            goto L_0x02b7
        L_0x0298:
            android.net.Uri r5 = r9.g()
            if (r5 == 0) goto L_0x02ac
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r12 = "android.intent.action.VIEW"
            r7.<init>(r12)
            r7.setPackage(r2)
            r7.setData(r5)
            goto L_0x02b7
        L_0x02ac:
            android.content.Intent r7 = r13.getLaunchIntentForPackage(r2)
            if (r7 != 0) goto L_0x02b7
            java.lang.String r2 = "No activity found to launch app"
            android.util.Log.w(r6, r2)
        L_0x02b7:
            r2 = 1140850688(0x44000000, float:512.0)
            java.lang.String r5 = "google.c.a.e"
            if (r7 != 0) goto L_0x02bf
            r7 = 0
            goto L_0x0323
        L_0x02bf:
            r12 = 67108864(0x4000000, float:1.5046328E-36)
            r7.addFlags(r12)
            android.os.Bundle r12 = new android.os.Bundle
            java.lang.Object r13 = r9.f15278b
            android.os.Bundle r13 = (android.os.Bundle) r13
            r12.<init>(r13)
            java.util.Set r13 = r13.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x02d5:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x0307
            java.lang.Object r17 = r13.next()
            r10 = r17
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r15 = "google.c."
            boolean r15 = r10.startsWith(r15)
            if (r15 != 0) goto L_0x02fe
            java.lang.String r15 = "gcm.n."
            boolean r15 = r10.startsWith(r15)
            if (r15 != 0) goto L_0x02fe
            java.lang.String r15 = "gcm.notification."
            boolean r15 = r10.startsWith(r15)
            if (r15 == 0) goto L_0x02fc
            goto L_0x02fe
        L_0x02fc:
            r15 = r4
            goto L_0x02ff
        L_0x02fe:
            r15 = 1
        L_0x02ff:
            if (r15 == 0) goto L_0x0304
            r12.remove(r10)
        L_0x0304:
            r10 = -1
            r15 = 2
            goto L_0x02d5
        L_0x0307:
            r7.putExtras(r12)
            boolean r10 = r9.c(r5)
            if (r10 == 0) goto L_0x0319
            android.os.Bundle r10 = r9.o()
            java.lang.String r12 = "gcm.n.analytics_data"
            r7.putExtra(r12, r10)
        L_0x0319:
            java.util.concurrent.atomic.AtomicInteger r10 = wa.e.f16573a
            int r10 = r10.incrementAndGet()
            android.app.PendingIntent r7 = android.app.PendingIntent.getActivity(r8, r10, r7, r2)
        L_0x0323:
            r14.f14517g = r7
            boolean r5 = r9.c(r5)
            if (r5 != 0) goto L_0x032d
            r2 = 0
            goto L_0x035e
        L_0x032d:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r7 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r5.<init>(r7)
            android.os.Bundle r7 = r9.o()
            android.content.Intent r5 = r5.putExtras(r7)
            java.util.concurrent.atomic.AtomicInteger r7 = wa.e.f16573a
            int r7 = r7.incrementAndGet()
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r12 = "com.google.firebase.MESSAGING_EVENT"
            r10.<init>(r12)
            android.content.ComponentName r12 = new android.content.ComponentName
            java.lang.String r13 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            r12.<init>(r8, r13)
            android.content.Intent r10 = r10.setComponent(r12)
            java.lang.String r12 = "wrapped_intent"
            android.content.Intent r5 = r10.putExtra(r12, r5)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r8, r7, r5, r2)
        L_0x035e:
            if (r2 == 0) goto L_0x0362
            r0.deleteIntent = r2
        L_0x0362:
            java.lang.String r2 = "gcm.n.color"
            java.lang.String r2 = r9.l(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x038d
            int r5 = android.graphics.Color.parseColor(r2)     // Catch:{ IllegalArgumentException -> 0x0377 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x0377 }
            goto L_0x03a6
        L_0x0377:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Color is invalid: "
            r5.<init>(r7)
            r5.append(r2)
            java.lang.String r2 = ". Notification will use default color."
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.w(r6, r2)
        L_0x038d:
            java.lang.String r2 = "com.google.firebase.messaging.default_notification_color"
            int r2 = r11.getInt(r2, r4)
            if (r2 == 0) goto L_0x03a5
            java.lang.Object r5 = t1.a.f15323a     // Catch:{ NotFoundException -> 0x03a0 }
            int r2 = t1.a.d.a(r8, r2)     // Catch:{ NotFoundException -> 0x03a0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NotFoundException -> 0x03a0 }
            goto L_0x03a6
        L_0x03a0:
            java.lang.String r2 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r6, r2)
        L_0x03a5:
            r2 = 0
        L_0x03a6:
            if (r2 == 0) goto L_0x03ae
            int r2 = r2.intValue()
            r14.f14524o = r2
        L_0x03ae:
            java.lang.String r2 = "gcm.n.sticky"
            boolean r2 = r9.c(r2)
            r5 = 1
            r2 = r2 ^ r5
            r14.c(r2)
            java.lang.String r2 = "gcm.n.local_only"
            boolean r2 = r9.c(r2)
            r14.m = r2
            java.lang.String r2 = "gcm.n.ticker"
            java.lang.String r2 = r9.l(r2)
            if (r2 == 0) goto L_0x03d1
            android.app.Notification r5 = r14.f14528s
            java.lang.CharSequence r2 = s1.s.b(r2)
            r5.tickerText = r2
        L_0x03d1:
            java.lang.String r2 = "gcm.n.notification_priority"
            java.lang.Integer r2 = r9.d(r2)
            r5 = -2
            if (r2 != 0) goto L_0x03db
            goto L_0x03fe
        L_0x03db:
            int r7 = r2.intValue()
            if (r7 < r5) goto L_0x03e8
            int r7 = r2.intValue()
            r8 = 2
            if (r7 <= r8) goto L_0x03ff
        L_0x03e8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "notificationPriority is invalid "
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r2 = ". Skipping setting notificationPriority."
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            android.util.Log.w(r6, r2)
        L_0x03fe:
            r2 = 0
        L_0x03ff:
            if (r2 == 0) goto L_0x0407
            int r2 = r2.intValue()
            r14.f14520j = r2
        L_0x0407:
            java.lang.String r2 = "gcm.n.visibility"
            java.lang.Integer r2 = r9.d(r2)
            if (r2 != 0) goto L_0x0410
            goto L_0x0436
        L_0x0410:
            int r7 = r2.intValue()
            r8 = -1
            if (r7 < r8) goto L_0x041e
            int r7 = r2.intValue()
            r8 = 1
            if (r7 <= r8) goto L_0x0437
        L_0x041e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "visibility is invalid: "
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r2 = ". Skipping setting visibility."
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "NotificationParams"
            android.util.Log.w(r7, r2)
        L_0x0436:
            r2 = 0
        L_0x0437:
            if (r2 == 0) goto L_0x043f
            int r2 = r2.intValue()
            r14.f14525p = r2
        L_0x043f:
            java.lang.String r2 = "gcm.n.notification_count"
            java.lang.Integer r2 = r9.d(r2)
            if (r2 != 0) goto L_0x0448
            goto L_0x0464
        L_0x0448:
            int r7 = r2.intValue()
            if (r7 >= 0) goto L_0x0465
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "notificationCount is invalid: "
            r7.<init>(r8)
            r7.append(r2)
            java.lang.String r2 = ". Skipping setting notificationCount."
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            android.util.Log.w(r6, r2)
        L_0x0464:
            r2 = 0
        L_0x0465:
            if (r2 == 0) goto L_0x046d
            int r2 = r2.intValue()
            r14.f14519i = r2
        L_0x046d:
            java.lang.Long r2 = r9.j()
            if (r2 == 0) goto L_0x047c
            r7 = 1
            r14.f14521k = r7
            long r7 = r2.longValue()
            r0.when = r7
        L_0x047c:
            long[] r2 = r9.m()
            if (r2 == 0) goto L_0x0484
            r0.vibrate = r2
        L_0x0484:
            int[] r2 = r9.f()
            if (r2 == 0) goto L_0x04a5
            r7 = r2[r4]
            r8 = 1
            r10 = r2[r8]
            r8 = 2
            r2 = r2[r8]
            r0.ledARGB = r7
            r0.ledOnMS = r10
            r0.ledOffMS = r2
            if (r10 == 0) goto L_0x049e
            if (r2 == 0) goto L_0x049e
            r2 = 1
            goto L_0x049f
        L_0x049e:
            r2 = r4
        L_0x049f:
            int r7 = r0.flags
            r5 = r5 & r7
            r2 = r2 | r5
            r0.flags = r2
        L_0x04a5:
            java.lang.String r2 = "gcm.n.default_sound"
            boolean r2 = r9.c(r2)
            java.lang.String r5 = "gcm.n.default_vibrate_timings"
            boolean r5 = r9.c(r5)
            if (r5 == 0) goto L_0x04b5
            r2 = r2 | 2
        L_0x04b5:
            java.lang.String r5 = "gcm.n.default_light_settings"
            boolean r5 = r9.c(r5)
            if (r5 == 0) goto L_0x04bf
            r2 = r2 | 4
        L_0x04bf:
            r0.defaults = r2
            r5 = 4
            r2 = r2 & r5
            if (r2 == 0) goto L_0x04cb
            int r2 = r0.flags
            r5 = 1
            r2 = r2 | r5
            r0.flags = r2
        L_0x04cb:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r9.l(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x04d8
            goto L_0x04ea
        L_0x04d8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FCM-Notification:"
            r0.<init>(r2)
            long r7 = android.os.SystemClock.uptimeMillis()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
        L_0x04ea:
            r2 = r0
            if (r3 != 0) goto L_0x04ef
        L_0x04ed:
            r3 = 3
            goto L_0x054e
        L_0x04ef:
            com.google.android.gms.tasks.Task<android.graphics.Bitmap> r0 = r3.f16640c     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            u6.q.i(r0)     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            r7 = 5
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0, r7, r5)     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            r14.d(r0)     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            s1.n r5 = new s1.n     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            r5.<init>()     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            if (r0 != 0) goto L_0x050a
            r7 = 0
            goto L_0x0512
        L_0x050a:
            androidx.core.graphics.drawable.IconCompat r7 = new androidx.core.graphics.drawable.IconCompat     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            r8 = 1
            r7.<init>(r8)     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            r7.f1742b = r0     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
        L_0x0512:
            r5.f14507b = r7     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            r7 = 0
            r5.f14508c = r7     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            r7 = 1
            r5.f14509d = r7     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            r14.e(r5)     // Catch:{ ExecutionException -> 0x0537, InterruptedException -> 0x0527, TimeoutException -> 0x051e }
            goto L_0x04ed
        L_0x051e:
            java.lang.String r0 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r6, r0)
            r3.close()
            goto L_0x04ed
        L_0x0527:
            java.lang.String r0 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r6, r0)
            r3.close()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x04ed
        L_0x0537:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to download image: "
            r3.<init>(r5)
            java.lang.Throwable r0 = r0.getCause()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r6, r0)
            goto L_0x04ed
        L_0x054e:
            boolean r0 = android.util.Log.isLoggable(r6, r3)
            if (r0 == 0) goto L_0x0559
            java.lang.String r0 = "Showing notification"
            android.util.Log.d(r6, r0)
        L_0x0559:
            android.content.Context r0 = r1.f16591b
            java.lang.String r3 = "notification"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.Notification r3 = r14.a()
            r0.notify(r2, r4, r3)
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.g.a():boolean");
    }
}
