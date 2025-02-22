package s1;

import android.app.Notification;
import android.os.Bundle;

public final class r extends t {

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f14510b;

    public static class a {
        public static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.bigText(charSequence);
        }

        public static Notification.BigTextStyle b(Notification.Builder builder) {
            return new Notification.BigTextStyle(builder);
        }

        public static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.setBigContentTitle(charSequence);
        }

        public static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.setSummaryText(charSequence);
        }
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    public final void b(u uVar) {
        a.a(a.c(a.b(uVar.f14532b), (CharSequence) null), this.f14510b);
    }

    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
