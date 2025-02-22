package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import b7.a;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.recaptcha.RecaptchaDefinitions;
import h7.i;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.b;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import u6.e0;
import u6.h;
import u6.r;
import u6.s;
import u6.t;
import w6.c;

public final class e implements Handler.Callback {

    /* renamed from: o  reason: collision with root package name */
    public static final Status f4236o = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: p  reason: collision with root package name */
    public static final Status f4237p = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: q  reason: collision with root package name */
    public static final Object f4238q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static e f4239r;

    /* renamed from: a  reason: collision with root package name */
    public long f4240a = RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4241b = false;

    /* renamed from: c  reason: collision with root package name */
    public t f4242c;

    /* renamed from: d  reason: collision with root package name */
    public c f4243d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f4244e;

    /* renamed from: f  reason: collision with root package name */
    public final t6.e f4245f;

    /* renamed from: g  reason: collision with root package name */
    public final e0 f4246g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f4247h = new AtomicInteger(1);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f4248i = new AtomicInteger(0);

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f4249j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k  reason: collision with root package name */
    public final b f4250k = new b();

    /* renamed from: l  reason: collision with root package name */
    public final b f4251l = new b();
    @NotOnlyInitialized
    public final i m;

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f4252n = true;

    public e(Context context, Looper looper) {
        t6.e eVar = t6.e.f15393d;
        this.f4244e = context;
        i iVar = new i(looper, this);
        this.m = iVar;
        this.f4245f = eVar;
        this.f4246g = new e0();
        PackageManager packageManager = context.getPackageManager();
        if (z6.c.f17772d == null) {
            z6.c.f17772d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (z6.c.f17772d.booleanValue()) {
            this.f4252n = false;
        }
        iVar.sendMessage(iVar.obtainMessage(6));
    }

    public static Status c(a aVar, t6.b bVar) {
        String str = aVar.f4208b.f4181b;
        String valueOf = String.valueOf(bVar);
        return new Status(1, 17, "API: " + str + " is not available on this device. Connection failed with: " + valueOf, bVar.f15380c, bVar);
    }

    public static e f(Context context) {
        e eVar;
        HandlerThread handlerThread;
        synchronized (f4238q) {
            try {
                if (f4239r == null) {
                    synchronized (h.f15811a) {
                        handlerThread = h.f15813c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            h.f15813c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = h.f15813c;
                        }
                    }
                    Looper looper = handlerThread.getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = t6.e.f15392c;
                    f4239r = new e(applicationContext, looper);
                }
                eVar = f4239r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final boolean a() {
        if (this.f4241b) {
            return false;
        }
        s sVar = r.a().f15854a;
        if (sVar != null && !sVar.f15856b) {
            return false;
        }
        int i8 = this.f4246g.f15787a.get(203400000, -1);
        return i8 == -1 || i8 == 0;
    }

    public final boolean b(t6.b bVar, int i8) {
        PendingIntent pendingIntent;
        t6.e eVar = this.f4245f;
        eVar.getClass();
        Context context = this.f4244e;
        if (a.v(context)) {
            return false;
        }
        int i10 = bVar.f15379b;
        if ((i10 == 0 || bVar.f15380c == null) ? false : true) {
            pendingIntent = bVar.f15380c;
        } else {
            pendingIntent = null;
            Intent a10 = eVar.a(i10, context, (String) null);
            if (a10 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a10, 201326592);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i11 = GoogleApiActivity.f4171b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i8);
        intent.putExtra("notify_manager", true);
        eVar.g(context, i10, PendingIntent.getActivity(context, 0, intent, h7.h.f9277a | 134217728));
        return true;
    }

    public final b0 d(com.google.android.gms.common.api.c cVar) {
        a aVar = cVar.f4187e;
        ConcurrentHashMap concurrentHashMap = this.f4249j;
        b0 b0Var = (b0) concurrentHashMap.get(aVar);
        if (b0Var == null) {
            b0Var = new b0(this, cVar);
            concurrentHashMap.put(aVar, b0Var);
        }
        if (b0Var.f4218b.m()) {
            this.f4251l.add(aVar);
        }
        b0Var.o();
        return b0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, com.google.android.gms.common.api.c r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x007c
            com.google.android.gms.common.api.internal.a r3 = r11.f4187e
            boolean r11 = r8.a()
            if (r11 != 0) goto L_0x000b
            goto L_0x0041
        L_0x000b:
            u6.r r11 = u6.r.a()
            u6.s r11 = r11.f15854a
            r0 = 1
            if (r11 == 0) goto L_0x004d
            boolean r1 = r11.f15856b
            if (r1 != 0) goto L_0x0019
            goto L_0x0041
        L_0x0019:
            java.util.concurrent.ConcurrentHashMap r1 = r8.f4249j
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.common.api.internal.b0 r1 = (com.google.android.gms.common.api.internal.b0) r1
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.common.api.a$e r2 = r1.f4218b
            boolean r4 = r2 instanceof u6.b
            if (r4 != 0) goto L_0x002a
            goto L_0x0041
        L_0x002a:
            u6.b r2 = (u6.b) r2
            u6.a1 r4 = r2.f15763v
            if (r4 == 0) goto L_0x0032
            r4 = r0
            goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            if (r4 == 0) goto L_0x004b
            boolean r4 = r2.e()
            if (r4 != 0) goto L_0x004b
            u6.e r11 = com.google.android.gms.common.api.internal.j0.a(r1, r2, r10)
            if (r11 != 0) goto L_0x0043
        L_0x0041:
            r10 = 0
            goto L_0x0069
        L_0x0043:
            int r2 = r1.m
            int r2 = r2 + r0
            r1.m = r2
            boolean r0 = r11.f15784c
            goto L_0x004d
        L_0x004b:
            boolean r0 = r11.f15857c
        L_0x004d:
            com.google.android.gms.common.api.internal.j0 r11 = new com.google.android.gms.common.api.internal.j0
            r1 = 0
            if (r0 == 0) goto L_0x0058
            long r4 = java.lang.System.currentTimeMillis()
            goto L_0x0059
        L_0x0058:
            r4 = r1
        L_0x0059:
            if (r0 == 0) goto L_0x0061
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6 = r0
            goto L_0x0062
        L_0x0061:
            r6 = r1
        L_0x0062:
            r0 = r11
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r11
        L_0x0069:
            if (r10 == 0) goto L_0x007c
            com.google.android.gms.tasks.Task r9 = r9.getTask()
            h7.i r11 = r8.m
            r11.getClass()
            com.google.android.gms.common.api.internal.w r0 = new com.google.android.gms.common.api.internal.w
            r0.<init>(r11)
            r9.addOnCompleteListener((java.util.concurrent.Executor) r0, r10)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.e.e(com.google.android.gms.tasks.TaskCompletionSource, int, com.google.android.gms.common.api.c):void");
    }

    public final void g(t6.b bVar, int i8) {
        if (!b(bVar, i8)) {
            i iVar = this.m;
            iVar.sendMessage(iVar.obtainMessage(5, i8, 0, bVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0152, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r13) {
        /*
            r12 = this;
            int r0 = r13.what
            java.lang.String r1 = "GoogleApiManager"
            h7.i r2 = r12.m
            java.util.concurrent.ConcurrentHashMap r3 = r12.f4249j
            r4 = 300000(0x493e0, double:1.482197E-318)
            r6 = 17
            r7 = 0
            r8 = 0
            r9 = 1
            switch(r0) {
                case 1: goto L_0x03a4;
                case 2: goto L_0x039c;
                case 3: goto L_0x037b;
                case 4: goto L_0x0344;
                case 5: goto L_0x02d4;
                case 6: goto L_0x0280;
                case 7: goto L_0x0277;
                case 8: goto L_0x0344;
                case 9: goto L_0x0257;
                case 10: goto L_0x0230;
                case 11: goto L_0x01d4;
                case 12: goto L_0x01bf;
                case 13: goto L_0x0344;
                case 14: goto L_0x01a7;
                case 15: goto L_0x0173;
                case 16: goto L_0x00e9;
                case 17: goto L_0x00c5;
                case 18: goto L_0x0029;
                case 19: goto L_0x0025;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown message id: "
            r13.<init>(r2)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r1, r13)
            return r7
        L_0x0025:
            r12.f4241b = r7
            goto L_0x03d6
        L_0x0029:
            java.lang.Object r13 = r13.obj
            com.google.android.gms.common.api.internal.k0 r13 = (com.google.android.gms.common.api.internal.k0) r13
            long r0 = r13.f4295c
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            u6.n r1 = r13.f4293a
            int r3 = r13.f4294b
            if (r0 != 0) goto L_0x005a
            u6.t r13 = new u6.t
            u6.n[] r0 = new u6.n[r9]
            r0[r7] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            r13.<init>(r3, r0)
            w6.c r0 = r12.f4243d
            if (r0 != 0) goto L_0x0053
            w6.c r0 = new w6.c
            android.content.Context r1 = r12.f4244e
            r0.<init>(r1)
            r12.f4243d = r0
        L_0x0053:
            w6.c r0 = r12.f4243d
            r0.d(r13)
            goto L_0x03d6
        L_0x005a:
            u6.t r0 = r12.f4242c
            if (r0 == 0) goto L_0x00a7
            java.util.List r4 = r0.f15864b
            int r0 = r0.f15863a
            if (r0 != r3) goto L_0x0082
            if (r4 == 0) goto L_0x006f
            int r0 = r4.size()
            int r4 = r13.f4296d
            if (r0 < r4) goto L_0x006f
            goto L_0x0082
        L_0x006f:
            u6.t r0 = r12.f4242c
            java.util.List r4 = r0.f15864b
            if (r4 != 0) goto L_0x007c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f15864b = r4
        L_0x007c:
            java.util.List r0 = r0.f15864b
            r0.add(r1)
            goto L_0x00a7
        L_0x0082:
            r2.removeMessages(r6)
            u6.t r0 = r12.f4242c
            if (r0 == 0) goto L_0x00a7
            int r4 = r0.f15863a
            if (r4 > 0) goto L_0x0093
            boolean r4 = r12.a()
            if (r4 == 0) goto L_0x00a5
        L_0x0093:
            w6.c r4 = r12.f4243d
            if (r4 != 0) goto L_0x00a0
            w6.c r4 = new w6.c
            android.content.Context r5 = r12.f4244e
            r4.<init>(r5)
            r12.f4243d = r4
        L_0x00a0:
            w6.c r4 = r12.f4243d
            r4.d(r0)
        L_0x00a5:
            r12.f4242c = r8
        L_0x00a7:
            u6.t r0 = r12.f4242c
            if (r0 != 0) goto L_0x03d6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            u6.t r1 = new u6.t
            r1.<init>(r3, r0)
            r12.f4242c = r1
            android.os.Message r0 = r2.obtainMessage(r6)
            long r3 = r13.f4295c
            r2.sendMessageDelayed(r0, r3)
            goto L_0x03d6
        L_0x00c5:
            u6.t r13 = r12.f4242c
            if (r13 == 0) goto L_0x03d6
            int r0 = r13.f15863a
            if (r0 > 0) goto L_0x00d3
            boolean r0 = r12.a()
            if (r0 == 0) goto L_0x00e5
        L_0x00d3:
            w6.c r0 = r12.f4243d
            if (r0 != 0) goto L_0x00e0
            w6.c r0 = new w6.c
            android.content.Context r1 = r12.f4244e
            r0.<init>(r1)
            r12.f4243d = r0
        L_0x00e0:
            w6.c r0 = r12.f4243d
            r0.d(r13)
        L_0x00e5:
            r12.f4242c = r8
            goto L_0x03d6
        L_0x00e9:
            java.lang.Object r13 = r13.obj
            com.google.android.gms.common.api.internal.c0 r13 = (com.google.android.gms.common.api.internal.c0) r13
            com.google.android.gms.common.api.internal.a r0 = r13.f4231a
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x03d6
            com.google.android.gms.common.api.internal.a r0 = r13.f4231a
            java.lang.Object r0 = r3.get(r0)
            com.google.android.gms.common.api.internal.b0 r0 = (com.google.android.gms.common.api.internal.b0) r0
            java.util.ArrayList r1 = r0.f4226k
            boolean r1 = r1.remove(r13)
            if (r1 == 0) goto L_0x03d6
            com.google.android.gms.common.api.internal.e r1 = r0.f4228n
            h7.i r2 = r1.m
            r3 = 15
            r2.removeMessages(r3, r13)
            h7.i r1 = r1.m
            r2 = 16
            r1.removeMessages(r2, r13)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.LinkedList r2 = r0.f4217a
            int r3 = r2.size()
            r1.<init>(r3)
            java.util.Iterator r3 = r2.iterator()
        L_0x0124:
            boolean r4 = r3.hasNext()
            t6.d r5 = r13.f4232b
            if (r4 == 0) goto L_0x0159
            java.lang.Object r4 = r3.next()
            com.google.android.gms.common.api.internal.z0 r4 = (com.google.android.gms.common.api.internal.z0) r4
            boolean r6 = r4 instanceof com.google.android.gms.common.api.internal.h0
            if (r6 == 0) goto L_0x0124
            r6 = r4
            com.google.android.gms.common.api.internal.h0 r6 = (com.google.android.gms.common.api.internal.h0) r6
            t6.d[] r6 = r6.g(r0)
            if (r6 == 0) goto L_0x0124
            int r8 = r6.length
            r10 = r7
        L_0x0141:
            if (r10 >= r8) goto L_0x0152
            r11 = r6[r10]
            boolean r11 = u6.o.a(r11, r5)
            if (r11 == 0) goto L_0x014f
            if (r10 < 0) goto L_0x0152
            r5 = r9
            goto L_0x0153
        L_0x014f:
            int r10 = r10 + 1
            goto L_0x0141
        L_0x0152:
            r5 = r7
        L_0x0153:
            if (r5 == 0) goto L_0x0124
            r1.add(r4)
            goto L_0x0124
        L_0x0159:
            int r13 = r1.size()
        L_0x015d:
            if (r7 >= r13) goto L_0x03d6
            java.lang.Object r0 = r1.get(r7)
            com.google.android.gms.common.api.internal.z0 r0 = (com.google.android.gms.common.api.internal.z0) r0
            r2.remove(r0)
            com.google.android.gms.common.api.j r3 = new com.google.android.gms.common.api.j
            r3.<init>(r5)
            r0.b(r3)
            int r7 = r7 + 1
            goto L_0x015d
        L_0x0173:
            java.lang.Object r13 = r13.obj
            com.google.android.gms.common.api.internal.c0 r13 = (com.google.android.gms.common.api.internal.c0) r13
            com.google.android.gms.common.api.internal.a r0 = r13.f4231a
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x03d6
            com.google.android.gms.common.api.internal.a r0 = r13.f4231a
            java.lang.Object r0 = r3.get(r0)
            com.google.android.gms.common.api.internal.b0 r0 = (com.google.android.gms.common.api.internal.b0) r0
            java.util.ArrayList r1 = r0.f4226k
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L_0x0191
            goto L_0x03d6
        L_0x0191:
            boolean r13 = r0.f4225j
            if (r13 != 0) goto L_0x03d6
            com.google.android.gms.common.api.a$e r13 = r0.f4218b
            boolean r13 = r13.h()
            if (r13 != 0) goto L_0x01a2
            r0.o()
            goto L_0x03d6
        L_0x01a2:
            r0.h()
            goto L_0x03d6
        L_0x01a7:
            java.lang.Object r13 = r13.obj
            com.google.android.gms.common.api.internal.u r13 = (com.google.android.gms.common.api.internal.u) r13
            r13.getClass()
            boolean r13 = r3.containsKey(r8)
            if (r13 != 0) goto L_0x01b5
            throw r8
        L_0x01b5:
            java.lang.Object r13 = r3.get(r8)
            com.google.android.gms.common.api.internal.b0 r13 = (com.google.android.gms.common.api.internal.b0) r13
            r13.n(r7)
            throw r8
        L_0x01bf:
            java.lang.Object r0 = r13.obj
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x03d6
            java.lang.Object r13 = r13.obj
            java.lang.Object r13 = r3.get(r13)
            com.google.android.gms.common.api.internal.b0 r13 = (com.google.android.gms.common.api.internal.b0) r13
            r13.n(r9)
            goto L_0x03d6
        L_0x01d4:
            java.lang.Object r0 = r13.obj
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x03d6
            java.lang.Object r13 = r13.obj
            java.lang.Object r13 = r3.get(r13)
            com.google.android.gms.common.api.internal.b0 r13 = (com.google.android.gms.common.api.internal.b0) r13
            com.google.android.gms.common.api.internal.e r0 = r13.f4228n
            h7.i r1 = r0.m
            u6.q.d(r1)
            boolean r1 = r13.f4225j
            if (r1 == 0) goto L_0x03d6
            if (r1 == 0) goto L_0x0205
            com.google.android.gms.common.api.internal.e r1 = r13.f4228n
            h7.i r2 = r1.m
            com.google.android.gms.common.api.internal.a r3 = r13.f4219c
            r4 = 11
            r2.removeMessages(r4, r3)
            h7.i r1 = r1.m
            r2 = 9
            r1.removeMessages(r2, r3)
            r13.f4225j = r7
        L_0x0205:
            t6.e r1 = r0.f4245f
            android.content.Context r0 = r0.f4244e
            int r0 = r1.b(r0)
            r1 = 18
            if (r0 != r1) goto L_0x021b
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 21
            java.lang.String r2 = "Connection timed out waiting for Google Play services update to complete."
            r0.<init>(r1, r2)
            goto L_0x0224
        L_0x021b:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 22
            java.lang.String r2 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r1, r2)
        L_0x0224:
            r13.f(r0)
            com.google.android.gms.common.api.a$e r13 = r13.f4218b
            java.lang.String r0 = "Timing out connection while resuming."
            r13.b(r0)
            goto L_0x03d6
        L_0x0230:
            o.b r13 = r12.f4251l
            r13.getClass()
            o.b$a r0 = new o.b$a
            r0.<init>()
        L_0x023a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0252
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.a r1 = (com.google.android.gms.common.api.internal.a) r1
            java.lang.Object r1 = r3.remove(r1)
            com.google.android.gms.common.api.internal.b0 r1 = (com.google.android.gms.common.api.internal.b0) r1
            if (r1 == 0) goto L_0x023a
            r1.r()
            goto L_0x023a
        L_0x0252:
            r13.clear()
            goto L_0x03d6
        L_0x0257:
            java.lang.Object r0 = r13.obj
            boolean r0 = r3.containsKey(r0)
            if (r0 == 0) goto L_0x03d6
            java.lang.Object r13 = r13.obj
            java.lang.Object r13 = r3.get(r13)
            com.google.android.gms.common.api.internal.b0 r13 = (com.google.android.gms.common.api.internal.b0) r13
            com.google.android.gms.common.api.internal.e r0 = r13.f4228n
            h7.i r0 = r0.m
            u6.q.d(r0)
            boolean r0 = r13.f4225j
            if (r0 == 0) goto L_0x03d6
            r13.o()
            goto L_0x03d6
        L_0x0277:
            java.lang.Object r13 = r13.obj
            com.google.android.gms.common.api.c r13 = (com.google.android.gms.common.api.c) r13
            r12.d(r13)
            goto L_0x03d6
        L_0x0280:
            android.content.Context r13 = r12.f4244e
            android.content.Context r0 = r13.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L_0x03d6
            android.content.Context r13 = r13.getApplicationContext()
            android.app.Application r13 = (android.app.Application) r13
            com.google.android.gms.common.api.internal.b.a(r13)
            com.google.android.gms.common.api.internal.b r13 = com.google.android.gms.common.api.internal.b.f4212e
            com.google.android.gms.common.api.internal.x r0 = new com.google.android.gms.common.api.internal.x
            r0.<init>(r12)
            r13.getClass()
            monitor-enter(r13)
            java.util.ArrayList r1 = r13.f4215c     // Catch:{ all -> 0x02d1 }
            r1.add(r0)     // Catch:{ all -> 0x02d1 }
            monitor-exit(r13)     // Catch:{ all -> 0x02d1 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.f4214b
            boolean r1 = r0.get()
            if (r1 != 0) goto L_0x02c5
            android.app.ActivityManager$RunningAppProcessInfo r1 = new android.app.ActivityManager$RunningAppProcessInfo
            r1.<init>()
            android.app.ActivityManager.getMyMemoryState(r1)
            boolean r0 = r0.getAndSet(r9)
            if (r0 != 0) goto L_0x02c5
            int r0 = r1.importance
            r1 = 100
            if (r0 <= r1) goto L_0x02c5
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.f4213a
            r0.set(r9)
        L_0x02c5:
            java.util.concurrent.atomic.AtomicBoolean r13 = r13.f4213a
            boolean r13 = r13.get()
            if (r13 != 0) goto L_0x03d6
            r12.f4240a = r4
            goto L_0x03d6
        L_0x02d1:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x02d1 }
            throw r0
        L_0x02d4:
            int r0 = r13.arg1
            java.lang.Object r13 = r13.obj
            t6.b r13 = (t6.b) r13
            java.util.Collection r2 = r3.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x02e2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02f3
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.api.internal.b0 r3 = (com.google.android.gms.common.api.internal.b0) r3
            int r4 = r3.f4223h
            if (r4 != r0) goto L_0x02e2
            r8 = r3
        L_0x02f3:
            if (r8 == 0) goto L_0x032e
            int r0 = r13.f15379b
            r1 = 13
            if (r0 != r1) goto L_0x0323
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            t6.e r1 = r12.f4245f
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = t6.i.f15402a
            int r1 = r13.f15379b
            java.lang.String r1 = t6.b.w(r1)
            java.lang.String r2 = "Error resolution was canceled by the user, original error message: "
            java.lang.String r3 = ": "
            java.lang.StringBuilder r1 = androidx.activity.result.d.c(r2, r1, r3)
            java.lang.String r13 = r13.f15381d
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r6, r13)
            r8.f(r0)
            goto L_0x03d6
        L_0x0323:
            com.google.android.gms.common.api.internal.a r0 = r8.f4219c
            com.google.android.gms.common.api.Status r13 = c(r0, r13)
            r8.f(r13)
            goto L_0x03d6
        L_0x032e:
            java.lang.String r13 = "Could not find API instance "
            java.lang.String r2 = " while trying to fail enqueued calls."
            java.lang.StringBuilder r13 = androidx.appcompat.widget.a1.b(r13, r0, r2)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r13 = r13.toString()
            android.util.Log.wtf(r1, r13, r0)
            goto L_0x03d6
        L_0x0344:
            java.lang.Object r13 = r13.obj
            com.google.android.gms.common.api.internal.l0 r13 = (com.google.android.gms.common.api.internal.l0) r13
            com.google.android.gms.common.api.c r0 = r13.f4302c
            com.google.android.gms.common.api.internal.a r0 = r0.f4187e
            java.lang.Object r0 = r3.get(r0)
            com.google.android.gms.common.api.internal.b0 r0 = (com.google.android.gms.common.api.internal.b0) r0
            if (r0 != 0) goto L_0x035a
            com.google.android.gms.common.api.c r0 = r13.f4302c
            com.google.android.gms.common.api.internal.b0 r0 = r12.d(r0)
        L_0x035a:
            com.google.android.gms.common.api.a$e r1 = r0.f4218b
            boolean r1 = r1.m()
            com.google.android.gms.common.api.internal.z0 r2 = r13.f4300a
            if (r1 == 0) goto L_0x0377
            java.util.concurrent.atomic.AtomicInteger r1 = r12.f4248i
            int r1 = r1.get()
            int r13 = r13.f4301b
            if (r1 == r13) goto L_0x0377
            com.google.android.gms.common.api.Status r13 = f4236o
            r2.a(r13)
            r0.r()
            goto L_0x03d6
        L_0x0377:
            r0.p(r2)
            goto L_0x03d6
        L_0x037b:
            java.util.Collection r13 = r3.values()
            java.util.Iterator r13 = r13.iterator()
        L_0x0383:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x03d6
            java.lang.Object r0 = r13.next()
            com.google.android.gms.common.api.internal.b0 r0 = (com.google.android.gms.common.api.internal.b0) r0
            com.google.android.gms.common.api.internal.e r1 = r0.f4228n
            h7.i r1 = r1.m
            u6.q.d(r1)
            r0.f4227l = r8
            r0.o()
            goto L_0x0383
        L_0x039c:
            java.lang.Object r13 = r13.obj
            com.google.android.gms.common.api.internal.a1 r13 = (com.google.android.gms.common.api.internal.a1) r13
            r13.getClass()
            throw r8
        L_0x03a4:
            java.lang.Object r13 = r13.obj
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r9 == r13) goto L_0x03af
            goto L_0x03b1
        L_0x03af:
            r4 = 10000(0x2710, double:4.9407E-320)
        L_0x03b1:
            r12.f4240a = r4
            r13 = 12
            r2.removeMessages(r13)
            java.util.Set r0 = r3.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x03c0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03d6
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.a r1 = (com.google.android.gms.common.api.internal.a) r1
            android.os.Message r1 = r2.obtainMessage(r13, r1)
            long r3 = r12.f4240a
            r2.sendMessageDelayed(r1, r3)
            goto L_0x03c0
        L_0x03d6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.e.handleMessage(android.os.Message):boolean");
    }
}
