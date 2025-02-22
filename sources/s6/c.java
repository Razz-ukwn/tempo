package s6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import i7.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o.f;

public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static int f14749h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f14750i;

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f14751j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a  reason: collision with root package name */
    public final f<String, TaskCompletionSource<Bundle>> f14752a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f14753b;

    /* renamed from: c  reason: collision with root package name */
    public final v f14754c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14755d;

    /* renamed from: e  reason: collision with root package name */
    public final Messenger f14756e;

    /* renamed from: f  reason: collision with root package name */
    public Messenger f14757f;

    /* renamed from: g  reason: collision with root package name */
    public h f14758g;

    public c(Context context) {
        this.f14753b = context;
        this.f14754c = new v(context);
        this.f14756e = new Messenger(new e(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14755d = scheduledThreadPoolExecutor;
    }

    public final Task<Bundle> a(Bundle bundle) {
        String num;
        synchronized (c.class) {
            int i8 = f14749h;
            f14749h = i8 + 1;
            num = Integer.toString(i8);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f14752a) {
            this.f14752a.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f14754c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f14753b;
        synchronized (c.class) {
            if (f14750i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f14750i = PendingIntent.getBroadcast(context, 0, intent2, a.f9617a);
            }
            intent.putExtra("app", f14750i);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(num).length() + 5);
        sb2.append("|ID|");
        sb2.append(num);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f14756e);
        if (!(this.f14757f == null && this.f14758g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f14757f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f14758g.f14760a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            taskCompletionSource.getTask().addOnCompleteListener((Executor) x.f14798a, new f3.a((Object) this, (Object) num, (Object) this.f14755d.schedule(new w(taskCompletionSource, 0), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        if (this.f14754c.a() == 2) {
            this.f14753b.sendBroadcast(intent);
        } else {
            this.f14753b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener((Executor) x.f14798a, new f3.a((Object) this, (Object) num, (Object) this.f14755d.schedule(new w(taskCompletionSource, 0), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.f14752a) {
            TaskCompletionSource remove = this.f14752a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.setResult(bundle);
        }
    }
}
