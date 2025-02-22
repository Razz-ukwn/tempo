package wa;

import a7.b;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.activity.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j0.m;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class j0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16613a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f16614b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f16615c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f16616d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public i0 f16617e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16618f = false;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f16619a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<Void> f16620b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f16619a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public j0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new b("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f16613a = applicationContext;
        this.f16614b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f16615c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f16616d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            i0 i0Var = this.f16617e;
            if (i0Var == null || !i0Var.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f16617e.a((a) this.f16616d.poll());
        }
    }

    public final synchronized Task<Void> b(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f16615c;
        aVar.f16620b.getTask().addOnCompleteListener((Executor) scheduledExecutorService, new m(scheduledExecutorService.schedule(new j(aVar, 13), (aVar.f16619a.getFlags() & 268435456) != 0 ? h0.f16602a : 9000, TimeUnit.MILLISECONDS), 7));
        this.f16616d.add(aVar);
        a();
        return aVar.f16620b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f16618f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (!this.f16618f) {
            this.f16618f = true;
            try {
                if (!y6.a.b().a(this.f16613a, this.f16614b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f16618f = false;
                    while (true) {
                        ArrayDeque arrayDeque = this.f16616d;
                        if (!arrayDeque.isEmpty()) {
                            ((a) arrayDeque.poll()).f16620b.trySetResult(null);
                        } else {
                            return;
                        }
                    }
                }
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f16618f = false;
        if (!(iBinder instanceof i0)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f16616d;
                if (!arrayDeque.isEmpty()) {
                    ((a) arrayDeque.poll()).f16620b.trySetResult(null);
                } else {
                    return;
                }
            }
        } else {
            this.f16617e = (i0) iBinder;
            a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
