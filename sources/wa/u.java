package wa;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f16648b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f16649c;

    public /* synthetic */ u(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f16647a = context;
        this.f16648b = z10;
        this.f16649c = taskCompletionSource;
    }

    public final void run() {
        Context context = this.f16647a;
        TaskCompletionSource taskCompletionSource = this.f16649c;
        try {
            if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (this.f16648b) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }
}
