package s6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.appcompat.widget.l;
import i7.b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import y6.a;

public final class p implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public int f14778a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f14779b = new Messenger(new b(Looper.getMainLooper(), new j(this)));

    /* renamed from: c  reason: collision with root package name */
    public l f14780c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f14781d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<r<?>> f14782e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f14783f;

    public /* synthetic */ p(u uVar) {
        this.f14783f = uVar;
    }

    public final synchronized void a(int i8, String str) {
        b(i8, str, (SecurityException) null);
    }

    public final synchronized void b(int i8, String str, SecurityException securityException) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i10 = this.f14778a;
        if (i10 == 0) {
            throw new IllegalStateException();
        } else if (i10 == 1 || i10 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f14778a = 4;
            a.b().c((Context) this.f14783f.f14790b, this);
            s sVar = new s(str, securityException);
            Iterator it = this.f14781d.iterator();
            while (it.hasNext()) {
                ((r) it.next()).c(sVar);
            }
            this.f14781d.clear();
            for (int i11 = 0; i11 < this.f14782e.size(); i11++) {
                this.f14782e.valueAt(i11).c(sVar);
            }
            this.f14782e.clear();
        } else if (i10 == 3) {
            this.f14778a = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f14778a     // Catch:{ all -> 0x0039 }
            r1 = 2
            if (r0 != r1) goto L_0x0037
            java.util.ArrayDeque r0 = r2.f14781d     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.util.SparseArray<s6.r<?>> r0 = r2.f14782e     // Catch:{ all -> 0x0039 }
            int r0 = r0.size()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            r0 = 3
            r2.f14778a = r0     // Catch:{ all -> 0x0039 }
            y6.a r0 = y6.a.b()     // Catch:{ all -> 0x0039 }
            s6.u r1 = r2.f14783f     // Catch:{ all -> 0x0039 }
            java.lang.Object r1 = r1.f14790b     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0039 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.p.c():void");
    }

    public final synchronized boolean d(r<?> rVar) {
        int i8 = this.f14778a;
        if (i8 == 0) {
            this.f14781d.add(rVar);
            if (this.f14778a == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f14778a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!a.b().a((Context) this.f14783f.f14790b, intent, this, 1)) {
                        a(0, "Unable to bind to service");
                    } else {
                        ((ScheduledExecutorService) this.f14783f.f14791c).schedule(new m(this, 0), 30, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e10) {
                    b(0, "Unable to bind to service", e10);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (i8 == 1) {
            this.f14781d.add(rVar);
            return true;
        } else if (i8 != 2) {
            return false;
        } else {
            this.f14781d.add(rVar);
            ((ScheduledExecutorService) this.f14783f.f14791c).execute(new l(this));
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f14783f.f14791c).execute(new n(0, (Object) this, (Object) iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f14783f.f14791c).execute(new k(this, 0));
    }
}
