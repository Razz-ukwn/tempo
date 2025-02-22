package s1;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final NotificationManager f14536a;

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static {
        new HashSet();
    }

    public w(Context context) {
        this.f14536a = (NotificationManager) context.getSystemService("notification");
    }
}
