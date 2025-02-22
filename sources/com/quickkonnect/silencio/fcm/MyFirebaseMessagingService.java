package com.quickkonnect.silencio.fcm;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.quickkonnect.silencio.MainActivity;
import com.quickkonnect.silencio.R;
import java.util.Random;
import s1.s;
import sf.j;
import t1.a;
import wa.v;

public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    public final void d(v vVar) {
        String str;
        String str2;
        if (vVar.w() != null) {
            v.a w10 = vVar.w();
            String str3 = "";
            if (w10 == null || (str = w10.f16652a) == null) {
                str = str3;
            }
            v.a w11 = vVar.w();
            if (!(w11 == null || (str2 = w11.f16653b) == null)) {
                str3 = str2;
            }
            int nextInt = new Random().nextInt(10000);
            Intent intent = new Intent(this, MainActivity.class);
            intent.setAction("ACTION_NOTIFICATION");
            intent.setFlags(603979776);
            PendingIntent activity = PendingIntent.getActivity(this, nextInt, intent, 33554432);
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            s sVar = new s(this, "NOTIFICATION_CHANNEL_ID_NOTIFY");
            sVar.f14524o = 16777215;
            Notification notification = sVar.f14528s;
            notification.icon = R.drawable.ic_app_icon;
            sVar.f14515e = s.b(str3);
            Object obj = a.f15323a;
            sVar.f14524o = a.d.a(this, R.color.color_primary);
            sVar.f14516f = s.b(str);
            sVar.c(true);
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = s.a.a(s.a.e(s.a.c(s.a.b(), 4), 5));
            sVar.f14517g = activity;
            Object systemService = getSystemService("notification");
            j.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            notificationManager.createNotificationChannel(new NotificationChannel("NOTIFICATION_CHANNEL_ID_NOTIFY", getResources().getString(R.string.app_name), 4));
            notificationManager.notify(nextInt, sVar.a());
        }
    }

    public final void e(String str) {
        j.f(str, "token");
    }
}
