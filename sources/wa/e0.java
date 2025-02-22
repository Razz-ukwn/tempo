package wa;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final /* synthetic */ class e0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16574a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f16575b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f16576c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s f16577d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f16578e;

    public /* synthetic */ e0(Context context, FirebaseMessaging firebaseMessaging, p pVar, s sVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f16574a = context;
        this.f16575b = scheduledThreadPoolExecutor;
        this.f16576c = firebaseMessaging;
        this.f16577d = sVar;
        this.f16578e = pVar;
    }

    public final Object call() {
        d0 d0Var;
        Context context = this.f16574a;
        ScheduledExecutorService scheduledExecutorService = this.f16575b;
        FirebaseMessaging firebaseMessaging = this.f16576c;
        s sVar = this.f16577d;
        p pVar = this.f16578e;
        synchronized (d0.class) {
            WeakReference<d0> weakReference = d0.f16571b;
            d0Var = weakReference != null ? weakReference.get() : null;
            if (d0Var == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                d0 d0Var2 = new d0(sharedPreferences, scheduledExecutorService);
                synchronized (d0Var2) {
                    d0Var2.f16572a = a0.a(sharedPreferences, scheduledExecutorService);
                }
                d0.f16571b = new WeakReference<>(d0Var2);
                d0Var = d0Var2;
            }
        }
        return new f0(firebaseMessaging, sVar, d0Var, pVar, context, scheduledExecutorService);
    }
}
