package m9;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.a;
import oa.e;
import t9.j;
import t9.p;
import u6.o;
import u6.q;
import y1.l;

public final class f {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f11329j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final o.a f11330k = new o.a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f11331a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11332b;

    /* renamed from: c  reason: collision with root package name */
    public final i f11333c;

    /* renamed from: d  reason: collision with root package name */
    public final j f11334d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f11335e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f11336f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final p<va.a> f11337g;

    /* renamed from: h  reason: collision with root package name */
    public final qa.b<e> f11338h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f11339i = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    @TargetApi(14)
    public static class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static final AtomicReference<b> f11340a = new AtomicReference<>();

        public final void a(boolean z10) {
            synchronized (f.f11329j) {
                Iterator it = new ArrayList(f.f11330k.values()).iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.f11335e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = fVar.f11339i.iterator();
                        while (it2.hasNext()) {
                            ((a) it2.next()).a(z10);
                        }
                    }
                }
            }
        }
    }

    @TargetApi(24)
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final AtomicReference<c> f11341b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f11342a;

        public c(Context context) {
            this.f11342a = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (f.f11329j) {
                Iterator it = ((a.e) f.f11330k.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).g();
                }
            }
            this.f11342a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be A[LOOP:1: B:23:0x00b8->B:25:0x00be, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r9, m9.i r10, java.lang.String r11) {
        /*
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r8.f11335e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.f11336f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f11339i = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f11331a = r9
            u6.q.f(r11)
            r8.f11332b = r11
            r8.f11333c = r10
            m9.a r11 = com.google.firebase.provider.FirebaseInitProvider.f6351a
            java.lang.String r0 = "Firebase"
            android.os.Trace.beginSection(r0)
            java.lang.String r0 = "ComponentDiscovery"
            android.os.Trace.beginSection(r0)
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r2 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006b }
            if (r4 != 0) goto L_0x0046
            java.lang.String r2 = "Context has no PackageManager."
            android.util.Log.w(r0, r2)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x0070
        L_0x0046:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x006b }
            r5.<init>(r9, r2)     // Catch:{ NameNotFoundException -> 0x006b }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r4 = r4.getServiceInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x006b }
            if (r4 != 0) goto L_0x0068
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x006b }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x006b }
            r4.append(r2)     // Catch:{ NameNotFoundException -> 0x006b }
            java.lang.String r2 = " has no service info."
            r4.append(r2)     // Catch:{ NameNotFoundException -> 0x006b }
            java.lang.String r2 = r4.toString()     // Catch:{ NameNotFoundException -> 0x006b }
            android.util.Log.w(r0, r2)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x0070
        L_0x0068:
            android.os.Bundle r2 = r4.metaData     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x0071
        L_0x006b:
            java.lang.String r2 = "Application info not found."
            android.util.Log.w(r0, r2)
        L_0x0070:
            r2 = 0
        L_0x0071:
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r0, r2)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00b4
        L_0x007d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r4 = r2.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x008a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b4
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r5)
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x008a
            java.lang.String r6 = "com.google.firebase.components:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x008a
            r6 = 31
            java.lang.String r5 = r5.substring(r6)
            r0.add(r5)
            goto L_0x008a
        L_0x00b4:
            java.util.Iterator r0 = r0.iterator()
        L_0x00b8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00cd
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            t9.d r4 = new t9.d
            r4.<init>(r2)
            r3.add(r4)
            goto L_0x00b8
        L_0x00cd:
            android.os.Trace.endSection()
            java.lang.String r0 = "Runtime"
            android.os.Trace.beginSection(r0)
            u9.p r0 = u9.p.f15939a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.addAll(r3)
            com.google.firebase.FirebaseCommonRegistrar r3 = new com.google.firebase.FirebaseCommonRegistrar
            r3.<init>()
            t9.i r5 = new t9.i
            r5.<init>(r3)
            r2.add(r5)
            com.google.firebase.concurrent.ExecutorsRegistrar r3 = new com.google.firebase.concurrent.ExecutorsRegistrar
            r3.<init>()
            t9.i r5 = new t9.i
            r5.<init>(r3)
            r2.add(r5)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            t9.b r3 = t9.b.b(r9, r3, r5)
            r4.add(r3)
            java.lang.Class<m9.f> r3 = m9.f.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            t9.b r3 = t9.b.b(r8, r3, r5)
            r4.add(r3)
            java.lang.Class<m9.i> r3 = m9.i.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            t9.b r10 = t9.b.b(r10, r3, r5)
            r4.add(r10)
            za.b r10 = new za.b
            r10.<init>()
            boolean r3 = y1.l.a(r9)
            if (r3 == 0) goto L_0x013d
            java.util.concurrent.atomic.AtomicBoolean r3 = com.google.firebase.provider.FirebaseInitProvider.f6352b
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x013d
            java.lang.Class<m9.j> r3 = m9.j.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            t9.b r11 = t9.b.b(r11, r3, r1)
            r4.add(r11)
        L_0x013d:
            t9.j r11 = new t9.j
            r11.<init>(r0, r2, r4, r10)
            r8.f11334d = r11
            android.os.Trace.endSection()
            t9.p r10 = new t9.p
            m9.d r0 = new m9.d
            r0.<init>((m9.f) r8, (android.content.Context) r9)
            r10.<init>(r0)
            r8.f11337g = r10
            java.lang.Class<oa.e> r9 = oa.e.class
            qa.b r9 = r11.e(r9)
            r8.f11338h = r9
            m9.e r9 = new m9.e
            r9.<init>(r8)
            r8.a()
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.f11335e
            boolean r10 = r10.get()
            if (r10 == 0) goto L_0x0179
            com.google.android.gms.common.api.internal.b r10 = com.google.android.gms.common.api.internal.b.f4212e
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.f4213a
            boolean r10 = r10.get()
            if (r10 == 0) goto L_0x0179
            r10 = 1
            r9.a(r10)
        L_0x0179:
            java.util.concurrent.CopyOnWriteArrayList r10 = r8.f11339i
            r10.add(r9)
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.f.<init>(android.content.Context, m9.i, java.lang.String):void");
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f11329j) {
            Iterator it = ((a.e) f11330k.values()).iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                fVar.a();
                arrayList.add(fVar.f11332b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static f d() {
        f fVar;
        synchronized (f11329j) {
            fVar = (f) f11330k.getOrDefault("[DEFAULT]", null);
            if (fVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + z6.e.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return fVar;
    }

    public static f e(String str) {
        f fVar;
        String str2;
        synchronized (f11329j) {
            fVar = (f) f11330k.getOrDefault(str.trim(), null);
            if (fVar != null) {
                fVar.f11338h.get().c();
            } else {
                ArrayList c3 = c();
                if (c3.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", c3);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return fVar;
    }

    public static f h(Context context) {
        synchronized (f11329j) {
            if (f11330k.containsKey("[DEFAULT]")) {
                f d10 = d();
                return d10;
            }
            i a10 = i.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            f i8 = i(context, a10);
            return i8;
        }
    }

    public static f i(Context context, i iVar) {
        f fVar;
        boolean z10;
        AtomicReference<b> atomicReference = b.f11340a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f11340a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, bVar)) {
                        if (atomicReference2.get() != null) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    com.google.android.gms.common.api.internal.b.a(application);
                    com.google.android.gms.common.api.internal.b bVar2 = com.google.android.gms.common.api.internal.b.f4212e;
                    bVar2.getClass();
                    synchronized (bVar2) {
                        bVar2.f4215c.add(bVar);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f11329j) {
            o.a aVar = f11330k;
            q.k(true ^ aVar.containsKey("[DEFAULT]"), "FirebaseApp name " + "[DEFAULT]" + " already exists!");
            q.j(context, "Application context cannot be null.");
            fVar = new f(context, iVar, "[DEFAULT]");
            aVar.put("[DEFAULT]", fVar);
        }
        fVar.g();
        return fVar;
    }

    public final void a() {
        q.k(!this.f11336f.get(), "FirebaseApp was deleted");
    }

    public final <T> T b(Class<T> cls) {
        a();
        return this.f11334d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.a();
        return this.f11332b.equals(fVar.f11332b);
    }

    public final String f() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f11332b.getBytes(Charset.defaultCharset());
        String str = null;
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f11333c.f11344b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void g() {
        HashMap hashMap;
        boolean z10 = true;
        if (!l.a(this.f11331a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f11332b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f11331a;
            AtomicReference<c> atomicReference = c.f11341b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, cVar)) {
                        if (atomicReference.get() != null) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f11332b);
        Log.i("FirebaseApp", sb3.toString());
        j jVar = this.f11334d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f11332b);
        AtomicReference<Boolean> atomicReference2 = jVar.f15472e;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    z10 = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            synchronized (jVar) {
                hashMap = new HashMap(jVar.f15468a);
            }
            jVar.h(hashMap, equals);
        }
        this.f11338h.get().c();
    }

    public final int hashCode() {
        return this.f11332b.hashCode();
    }

    public final boolean j() {
        boolean z10;
        a();
        va.a aVar = this.f11337g.get();
        synchronized (aVar) {
            z10 = aVar.f16351b;
        }
        return z10;
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f11332b, "name");
        aVar.a(this.f11333c, "options");
        return aVar.toString();
    }
}
