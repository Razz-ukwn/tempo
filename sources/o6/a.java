package o6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import e7.c;
import e7.d;
import e7.e;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import t6.f;
import t6.g;
import u6.q;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public t6.a f12187a;

    /* renamed from: b  reason: collision with root package name */
    public e f12188b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12189c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12190d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public c f12191e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f12192f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12193g;

    /* renamed from: o6.a$a  reason: collision with other inner class name */
    public static final class C0231a {

        /* renamed from: a  reason: collision with root package name */
        public final String f12194a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12195b;

        @Deprecated
        public C0231a(String str, boolean z10) {
            this.f12194a = str;
            this.f12195b = z10;
        }

        public final String toString() {
            String str = this.f12194a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(this.f12195b);
            return sb2.toString();
        }
    }

    public a(Context context) {
        q.i(context);
        Context applicationContext = context.getApplicationContext();
        this.f12192f = applicationContext != null ? applicationContext : context;
        this.f12189c = false;
        this.f12193g = -1;
    }

    public static C0231a a(Context context) {
        a aVar = new a(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            C0231a e10 = aVar.e();
            d(e10, SystemClock.elapsedRealtime() - elapsedRealtime, (Throwable) null);
            aVar.b();
            return e10;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public static void d(C0231a aVar, long j10, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", str);
            if (aVar != null) {
                if (true != aVar.f12195b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = aVar.f12194a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j10));
            new b(hashMap).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            u6.q.h(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f12192f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            t6.a r0 = r3.f12187a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f12189c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            y6.a r0 = y6.a.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f12192f     // Catch:{ all -> 0x001f }
            t6.a r2 = r3.f12187a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f12189c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f12188b = r0     // Catch:{ all -> 0x0033 }
            r3.f12187a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.a.b():void");
    }

    public final void c() {
        q.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f12189c) {
                b();
            }
            Context context = this.f12192f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int c3 = f.f15396b.c(context, 12451000);
                if (c3 != 0) {
                    if (c3 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                t6.a aVar = new t6.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (y6.a.b().a(context, intent, aVar, 1)) {
                    this.f12187a = aVar;
                    IBinder a10 = aVar.a(TimeUnit.MILLISECONDS);
                    int i8 = d.f7869a;
                    IInterface queryLocalInterface = a10.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f12188b = queryLocalInterface instanceof e ? (e) queryLocalInterface : new c(a10);
                    this.f12189c = true;
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new g();
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    public final C0231a e() {
        C0231a aVar;
        q.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f12189c) {
                synchronized (this.f12190d) {
                    c cVar = this.f12191e;
                    if (cVar == null || !cVar.f12200d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    c();
                    if (!this.f12189c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                } catch (Exception e11) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                }
            }
            q.i(this.f12187a);
            q.i(this.f12188b);
            aVar = new C0231a(this.f12188b.zzc(), this.f12188b.zze());
        }
        f();
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12190d
            monitor-enter(r0)
            o6.c r1 = r5.f12191e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f12199c     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            o6.c r1 = r5.f12191e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.f12193g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0020
            o6.c r3 = new o6.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0022 }
            r5.f12191e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.a.f():void");
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
