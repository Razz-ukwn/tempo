package com.google.firebase.messaging;

import android.content.Intent;
import java.util.ArrayDeque;
import wa.i;
import wa.v;
import wa.z;

public class FirebaseMessagingService extends i {
    public static final ArrayDeque C = new ArrayDeque(10);

    public final Intent b(Intent intent) {
        return (Intent) z.a().f16660d.poll();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r0 = r27.getAction()
            java.lang.String r3 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r3 = r3.equals(r0)
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r5 = "FirebaseMessaging"
            if (r3 != 0) goto L_0x0045
            boolean r3 = r4.equals(r0)
            if (r3 == 0) goto L_0x001b
            goto L_0x0045
        L_0x001b:
            java.lang.String r3 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "token"
            java.lang.String r0 = r2.getStringExtra(r0)
            r1.e(r0)
            goto L_0x033b
        L_0x002e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown intent action: "
            r0.<init>(r3)
            java.lang.String r2 = r27.getAction()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
            goto L_0x033b
        L_0x0045:
            java.lang.String r0 = "google.message_id"
            java.lang.String r3 = r2.getStringExtra(r0)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r7 = 0
            r8 = 1
            r9 = 3
            if (r6 == 0) goto L_0x0055
            goto L_0x0084
        L_0x0055:
            java.util.ArrayDeque r6 = C
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto L_0x0076
            boolean r6 = android.util.Log.isLoggable(r5, r9)
            if (r6 == 0) goto L_0x0074
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "Received duplicate message: "
            r6.<init>(r10)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            android.util.Log.d(r5, r3)
        L_0x0074:
            r3 = r8
            goto L_0x0085
        L_0x0076:
            int r10 = r6.size()
            r11 = 10
            if (r10 < r11) goto L_0x0081
            r6.remove()
        L_0x0081:
            r6.add(r3)
        L_0x0084:
            r3 = r7
        L_0x0085:
            if (r3 != 0) goto L_0x033b
            java.lang.String r3 = "message_type"
            java.lang.String r3 = r2.getStringExtra(r3)
            java.lang.String r6 = "gcm"
            if (r3 != 0) goto L_0x0092
            r3 = r6
        L_0x0092:
            int r10 = r3.hashCode()
            r11 = 2
            switch(r10) {
                case -2062414158: goto L_0x00ba;
                case 102161: goto L_0x00b1;
                case 814694033: goto L_0x00a6;
                case 814800675: goto L_0x009b;
                default: goto L_0x009a;
            }
        L_0x009a:
            goto L_0x00c5
        L_0x009b:
            java.lang.String r6 = "send_event"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x00a4
            goto L_0x00c5
        L_0x00a4:
            r6 = r9
            goto L_0x00c6
        L_0x00a6:
            java.lang.String r6 = "send_error"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x00af
            goto L_0x00c5
        L_0x00af:
            r6 = r11
            goto L_0x00c6
        L_0x00b1:
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x00b8
            goto L_0x00c5
        L_0x00b8:
            r6 = r8
            goto L_0x00c6
        L_0x00ba:
            java.lang.String r6 = "deleted_messages"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r6 = r7
            goto L_0x00c6
        L_0x00c5:
            r6 = -1
        L_0x00c6:
            if (r6 == 0) goto L_0x033b
            java.lang.String r10 = "message_id"
            if (r6 == r8) goto L_0x00f6
            if (r6 == r11) goto L_0x00e0
            if (r6 == r9) goto L_0x00db
            java.lang.String r0 = "Received message with unknown type: "
            java.lang.String r0 = r0.concat(r3)
            android.util.Log.w(r5, r0)
            goto L_0x033b
        L_0x00db:
            r2.getStringExtra(r0)
            goto L_0x033b
        L_0x00e0:
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 != 0) goto L_0x00e9
            r2.getStringExtra(r10)
        L_0x00e9:
            wa.y r0 = new wa.y
            java.lang.String r3 = "error"
            java.lang.String r2 = r2.getStringExtra(r3)
            r0.<init>(r2)
            goto L_0x033b
        L_0x00f6:
            boolean r3 = wa.r.b(r27)
            if (r3 == 0) goto L_0x0105
            java.lang.String r3 = "_nr"
            android.os.Bundle r6 = r27.getExtras()
            wa.r.a(r6, r3)
        L_0x0105:
            java.lang.String r3 = r27.getAction()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0110
            goto L_0x0159
        L_0x0110:
            java.lang.String r3 = "delivery_metrics_exported_to_big_query_enabled"
            m9.f.d()     // Catch:{ IllegalStateException -> 0x0154 }
            m9.f r4 = m9.f.d()
            r4.a()
            java.lang.String r6 = "com.google.firebase.messaging"
            android.content.Context r4 = r4.f11331a
            android.content.SharedPreferences r6 = r4.getSharedPreferences(r6, r7)
            java.lang.String r9 = "export_to_big_query"
            boolean r12 = r6.contains(r9)
            if (r12 == 0) goto L_0x0131
            boolean r3 = r6.getBoolean(r9, r7)
            goto L_0x015a
        L_0x0131:
            android.content.pm.PackageManager r6 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0159 }
            if (r6 == 0) goto L_0x0159
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0159 }
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r6.getApplicationInfo(r4, r9)     // Catch:{ NameNotFoundException -> 0x0159 }
            if (r4 == 0) goto L_0x0159
            android.os.Bundle r6 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0159 }
            if (r6 == 0) goto L_0x0159
            boolean r6 = r6.containsKey(r3)     // Catch:{ NameNotFoundException -> 0x0159 }
            if (r6 == 0) goto L_0x0159
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0159 }
            boolean r3 = r4.getBoolean(r3, r7)     // Catch:{ NameNotFoundException -> 0x0159 }
            goto L_0x015a
        L_0x0154:
            java.lang.String r3 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r5, r3)
        L_0x0159:
            r3 = r7
        L_0x015a:
            if (r3 == 0) goto L_0x02e5
            xa.a$a r23 = xa.a.C0316a.MESSAGE_DELIVERED
            a6.g r3 = com.google.firebase.messaging.FirebaseMessaging.f6329n
            if (r3 != 0) goto L_0x0169
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r5, r0)
            goto L_0x02e5
        L_0x0169:
            android.os.Bundle r4 = r27.getExtras()
            if (r4 != 0) goto L_0x0171
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x0171:
            java.lang.String r6 = "google.ttl"
            java.lang.Object r6 = r4.get(r6)
            boolean r9 = r6 instanceof java.lang.Integer
            if (r9 == 0) goto L_0x0182
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
            goto L_0x019f
        L_0x0182:
            boolean r9 = r6 instanceof java.lang.String
            if (r9 == 0) goto L_0x019f
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x018e }
            int r7 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x018e }
            goto L_0x019f
        L_0x018e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = "Invalid TTL: "
            r9.<init>(r12)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            android.util.Log.w(r5, r6)
        L_0x019f:
            r21 = r7
            java.lang.String r6 = "google.to"
            java.lang.String r6 = r4.getString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x01b0
        L_0x01ad:
            r16 = r6
            goto L_0x01c9
        L_0x01b0:
            m9.f r6 = m9.f.d()     // Catch:{ ExecutionException -> 0x02de, InterruptedException -> 0x02dc }
            java.lang.Object r7 = ra.e.m     // Catch:{ ExecutionException -> 0x02de, InterruptedException -> 0x02dc }
            java.lang.Class<ra.f> r7 = ra.f.class
            java.lang.Object r6 = r6.b(r7)     // Catch:{ ExecutionException -> 0x02de, InterruptedException -> 0x02dc }
            ra.e r6 = (ra.e) r6     // Catch:{ ExecutionException -> 0x02de, InterruptedException -> 0x02dc }
            com.google.android.gms.tasks.Task r6 = r6.getId()     // Catch:{ ExecutionException -> 0x02de, InterruptedException -> 0x02dc }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6)     // Catch:{ ExecutionException -> 0x02de, InterruptedException -> 0x02dc }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ExecutionException -> 0x02de, InterruptedException -> 0x02dc }
            goto L_0x01ad
        L_0x01c9:
            m9.f r6 = m9.f.d()
            r6.a()
            android.content.Context r6 = r6.f11331a
            java.lang.String r19 = r6.getPackageName()
            xa.a$c r18 = xa.a.c.ANDROID
            boolean r6 = t.x2.n(r4)
            if (r6 == 0) goto L_0x01e1
            xa.a$b r6 = xa.a.b.DISPLAY_NOTIFICATION
            goto L_0x01e3
        L_0x01e1:
            xa.a$b r6 = xa.a.b.DATA_MESSAGE
        L_0x01e3:
            r17 = r6
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x01ef
            java.lang.String r0 = r4.getString(r10)
        L_0x01ef:
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x01f5
            r15 = r0
            goto L_0x01f6
        L_0x01f5:
            r15 = r6
        L_0x01f6:
            java.lang.String r0 = "from"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x0207
            java.lang.String r7 = "/topics/"
            boolean r7 = r0.startsWith(r7)
            if (r7 == 0) goto L_0x0207
            goto L_0x0208
        L_0x0207:
            r0 = 0
        L_0x0208:
            if (r0 == 0) goto L_0x020d
            r22 = r0
            goto L_0x020f
        L_0x020d:
            r22 = r6
        L_0x020f:
            java.lang.String r0 = "collapse_key"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x021a
            r20 = r0
            goto L_0x021c
        L_0x021a:
            r20 = r6
        L_0x021c:
            java.lang.String r0 = "google.c.a.m_l"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x0227
            r24 = r0
            goto L_0x0229
        L_0x0227:
            r24 = r6
        L_0x0229:
            java.lang.String r0 = "google.c.a.c_l"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x0234
            r25 = r0
            goto L_0x0236
        L_0x0234:
            r25 = r6
        L_0x0236:
            java.lang.String r0 = "google.c.sender.id"
            boolean r6 = r4.containsKey(r0)
            r9 = 0
            if (r6 == 0) goto L_0x024f
            java.lang.String r0 = r4.getString(r0)     // Catch:{ NumberFormatException -> 0x0249 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0249 }
            goto L_0x02a0
        L_0x0249:
            r0 = move-exception
            java.lang.String r4 = "error parsing project number"
            android.util.Log.w(r5, r4, r0)
        L_0x024f:
            m9.f r4 = m9.f.d()
            r4.a()
            m9.i r6 = r4.f11333c
            java.lang.String r0 = r6.f11347e
            if (r0 == 0) goto L_0x0268
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0261 }
            goto L_0x02a0
        L_0x0261:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "error parsing sender ID"
            android.util.Log.w(r5, r0, r7)
        L_0x0268:
            r4.a()
            java.lang.String r0 = "1:"
            java.lang.String r4 = r6.f11344b
            boolean r0 = r4.startsWith(r0)
            java.lang.String r6 = "error parsing app ID"
            if (r0 != 0) goto L_0x0282
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x027c }
            goto L_0x02a0
        L_0x027c:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r5, r6, r4)
            goto L_0x029f
        L_0x0282:
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r4.split(r0)
            int r4 = r0.length
            if (r4 >= r11) goto L_0x028c
            goto L_0x029f
        L_0x028c:
            r0 = r0[r8]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0295
            goto L_0x029f
        L_0x0295:
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x029a }
            goto L_0x02a0
        L_0x029a:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r5, r6, r4)
        L_0x029f:
            r6 = r9
        L_0x02a0:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a6
            r13 = r6
            goto L_0x02a7
        L_0x02a6:
            r13 = r9
        L_0x02a7:
            xa.a r0 = new xa.a
            r12 = r0
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r4 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.String r6 = "proto"
            a6.b r7 = new a6.b     // Catch:{ RuntimeException -> 0x02d5 }
            r7.<init>(r6)     // Catch:{ RuntimeException -> 0x02d5 }
            k6.q r6 = new k6.q     // Catch:{ RuntimeException -> 0x02d5 }
            r8 = 6
            r6.<init>(r8)     // Catch:{ RuntimeException -> 0x02d5 }
            d6.u r3 = r3.a(r4, r7, r6)     // Catch:{ RuntimeException -> 0x02d5 }
            xa.b r4 = new xa.b     // Catch:{ RuntimeException -> 0x02d5 }
            r4.<init>(r0)     // Catch:{ RuntimeException -> 0x02d5 }
            a6.a r0 = new a6.a     // Catch:{ RuntimeException -> 0x02d5 }
            a6.d r6 = a6.d.f118a     // Catch:{ RuntimeException -> 0x02d5 }
            r0.<init>(r4, r6)     // Catch:{ RuntimeException -> 0x02d5 }
            j0.e r4 = new j0.e     // Catch:{ RuntimeException -> 0x02d5 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x02d5 }
            r3.a(r0, r4)     // Catch:{ RuntimeException -> 0x02d5 }
            goto L_0x02e5
        L_0x02d5:
            r0 = move-exception
            java.lang.String r3 = "Failed to send big query analytics payload."
            android.util.Log.w(r5, r3, r0)
            goto L_0x02e5
        L_0x02dc:
            r0 = move-exception
            goto L_0x02df
        L_0x02de:
            r0 = move-exception
        L_0x02df:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x02e5:
            android.os.Bundle r0 = r27.getExtras()
            if (r0 != 0) goto L_0x02f0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x02f0:
            java.lang.String r3 = "androidx.content.wakelockid"
            r0.remove(r3)
            boolean r3 = t.x2.n(r0)
            if (r3 == 0) goto L_0x0333
            t.x2 r3 = new t.x2
            r3.<init>((android.os.Bundle) r0)
            a7.b r4 = new a7.b
            java.lang.String r5 = "Firebase-Messaging-Network-Io"
            r4.<init>(r5)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r4)
            wa.g r5 = new wa.g
            r5.<init>(r1, r3, r4)
            boolean r3 = r5.a()     // Catch:{ all -> 0x032d }
            if (r3 == 0) goto L_0x031a
            r4.shutdown()
            goto L_0x033b
        L_0x031a:
            r4.shutdown()
            boolean r3 = wa.r.b(r27)
            if (r3 == 0) goto L_0x0333
            java.lang.String r3 = "_nf"
            android.os.Bundle r2 = r27.getExtras()
            wa.r.a(r2, r3)
            goto L_0x0333
        L_0x032d:
            r0 = move-exception
            r2 = r0
            r4.shutdown()
            throw r2
        L_0x0333:
            wa.v r2 = new wa.v
            r2.<init>(r0)
            r1.d(r2)
        L_0x033b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }

    public void d(v vVar) {
    }

    public void e(String str) {
    }
}
