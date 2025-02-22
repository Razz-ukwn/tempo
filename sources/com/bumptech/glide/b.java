package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import com.bumptech.glide.i;
import e5.c;
import e5.l;
import f5.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r4.n;
import s4.d;
import t4.f;
import t4.g;
import t4.h;
import t4.i;
import u4.a;

public final class b implements ComponentCallbacks2 {
    public static volatile b E;
    public static volatile boolean F;
    public final l B;
    public final c C;
    public final ArrayList D = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final s4.c f4054a;

    /* renamed from: b  reason: collision with root package name */
    public final h f4055b;

    /* renamed from: c  reason: collision with root package name */
    public final h f4056c;

    /* renamed from: d  reason: collision with root package name */
    public final k f4057d;

    /* renamed from: e  reason: collision with root package name */
    public final s4.b f4058e;

    public interface a {
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cd  */
    public b(android.content.Context r28, r4.n r29, t4.h r30, s4.c r31, s4.b r32, e5.l r33, e5.c r34, int r35, com.bumptech.glide.c r36, o.a r37, java.util.List r38, com.bumptech.glide.i r39) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r31
            r4 = r32
            r11 = r39
            r27.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.D = r3
            r1.f4054a = r2
            r1.f4058e = r4
            r3 = r30
            r1.f4055b = r3
            r3 = r33
            r1.B = r3
            r3 = r34
            r1.C = r3
            android.content.res.Resources r3 = r28.getResources()
            com.bumptech.glide.k r5 = new com.bumptech.glide.k
            r5.<init>()
            r1.f4057d = r5
            y4.j r6 = new y4.j
            r6.<init>()
            t.r1 r7 = r5.f4083g
            monitor-enter(r7)
            java.util.List r8 = r7.f15222a     // Catch:{ all -> 0x0369 }
            r8.add(r6)     // Catch:{ all -> 0x0369 }
            monitor-exit(r7)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 27
            if (r6 < r7) goto L_0x0055
            y4.o r7 = new y4.o
            r7.<init>()
            t.r1 r8 = r5.f4083g
            monitor-enter(r8)
            java.util.List r9 = r8.f15222a     // Catch:{ all -> 0x0052 }
            r9.add(r7)     // Catch:{ all -> 0x0052 }
            monitor-exit(r8)
            goto L_0x0055
        L_0x0052:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0055:
            java.util.List r7 = r5.d()
            c5.a r8 = new c5.a
            r8.<init>(r0, r7, r2, r4)
            y4.b0 r9 = new y4.b0
            y4.b0$g r10 = new y4.b0$g
            r10.<init>()
            r9.<init>(r2, r10)
            y4.l r10 = new y4.l
            java.util.List r12 = r5.d()
            android.util.DisplayMetrics r13 = r3.getDisplayMetrics()
            r10.<init>(r12, r13, r2, r4)
            r12 = 28
            if (r6 < r12) goto L_0x008e
            java.lang.Class<com.bumptech.glide.e> r13 = com.bumptech.glide.e.class
            java.util.Map<java.lang.Class<?>, java.lang.Object> r14 = r11.f4070a
            boolean r13 = r14.containsKey(r13)
            if (r13 == 0) goto L_0x008e
            y4.s r13 = new y4.s
            r13.<init>()
            y4.g r14 = new y4.g
            r14.<init>()
            goto L_0x0098
        L_0x008e:
            y4.f r14 = new y4.f
            r14.<init>(r10)
            y4.x r13 = new y4.x
            r13.<init>(r10, r4)
        L_0x0098:
            java.lang.String r15 = "Animation"
            java.lang.Class<android.graphics.drawable.Drawable> r12 = android.graphics.drawable.Drawable.class
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            r33 = r8
            java.lang.Class<java.io.InputStream> r8 = java.io.InputStream.class
            r2 = 28
            if (r6 < r2) goto L_0x00cd
            java.lang.Class<com.bumptech.glide.d> r2 = com.bumptech.glide.d.class
            r30 = r6
            java.util.Map<java.lang.Class<?>, java.lang.Object> r6 = r11.f4070a
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L_0x00cf
            a5.f$c r2 = new a5.f$c
            a5.f r6 = new a5.f
            r6.<init>(r7, r4)
            r2.<init>(r6)
            r5.c(r2, r8, r12, r15)
            a5.f$b r2 = new a5.f$b
            a5.f r6 = new a5.f
            r6.<init>(r7, r4)
            r2.<init>(r6)
            r5.c(r2, r1, r12, r15)
            goto L_0x00cf
        L_0x00cd:
            r30 = r6
        L_0x00cf:
            a5.k r2 = new a5.k
            r2.<init>(r0)
            v4.s$c r6 = new v4.s$c
            r6.<init>(r3)
            v4.s$d r11 = new v4.s$d
            r11.<init>(r3)
            v4.s$b r0 = new v4.s$b
            r0.<init>(r3)
            r34 = r11
            v4.s$a r11 = new v4.s$a
            r11.<init>(r3)
            r16 = r11
            y4.b r11 = new y4.b
            r11.<init>(r4)
            r17 = r0
            d5.a r0 = new d5.a
            r0.<init>()
            r18 = r0
            q4.a r0 = new q4.a
            r19 = r6
            r6 = 2
            r0.<init>(r6)
            android.content.ContentResolver r6 = r28.getContentResolver()
            r20 = r0
            cb.c r0 = new cb.c
            r0.<init>()
            r21 = r6
            g5.a r6 = r5.f4078b
            monitor-enter(r6)
            r22 = r2
            java.util.ArrayList r2 = r6.f8856a     // Catch:{ all -> 0x0364 }
            r23 = r12
            g5.a$a r12 = new g5.a$a     // Catch:{ all -> 0x0364 }
            r12.<init>(r1, r0)     // Catch:{ all -> 0x0364 }
            r2.add(r12)     // Catch:{ all -> 0x0364 }
            monitor-exit(r6)
            androidx.lifecycle.u r0 = new androidx.lifecycle.u
            r2 = 1
            r0.<init>(r4, r2)
            g5.a r6 = r5.f4078b
            monitor-enter(r6)
            java.util.ArrayList r12 = r6.f8856a     // Catch:{ all -> 0x035f }
            g5.a$a r2 = new g5.a$a     // Catch:{ all -> 0x035f }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x035f }
            r12.add(r2)     // Catch:{ all -> 0x035f }
            monitor-exit(r6)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.String r2 = "Bitmap"
            r5.c(r14, r1, r0, r2)
            r5.c(r13, r8, r0, r2)
            y4.u r6 = new y4.u
            r6.<init>(r10)
            java.lang.Class<android.os.ParcelFileDescriptor> r10 = android.os.ParcelFileDescriptor.class
            r5.c(r6, r10, r0, r2)
            r5.c(r9, r10, r0, r2)
            y4.b0 r6 = new y4.b0
            y4.b0$c r12 = new y4.b0$c
            r12.<init>()
            r24 = r15
            r15 = r31
            r6.<init>(r15, r12)
            java.lang.Class<android.content.res.AssetFileDescriptor> r12 = android.content.res.AssetFileDescriptor.class
            r5.c(r6, r12, r0, r2)
            v4.u$a<?> r6 = v4.u.a.f16219a
            r5.a(r0, r0, r6)
            r25 = r12
            y4.z r12 = new y4.z
            r12.<init>()
            r5.c(r12, r0, r0, r2)
            r5.b(r0, r11)
            y4.a r12 = new y4.a
            r12.<init>(r3, r14)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r14 = android.graphics.drawable.BitmapDrawable.class
            r26 = r0
            java.lang.String r0 = "BitmapDrawable"
            r5.c(r12, r1, r14, r0)
            y4.a r12 = new y4.a
            r12.<init>(r3, r13)
            r5.c(r12, r8, r14, r0)
            y4.a r12 = new y4.a
            r12.<init>(r3, r9)
            r5.c(r12, r10, r14, r0)
            androidx.compose.ui.platform.j3 r0 = new androidx.compose.ui.platform.j3
            r0.<init>((java.lang.Object) r15, (java.lang.Object) r11)
            r5.b(r14, r0)
            c5.h r0 = new c5.h
            r9 = r33
            r0.<init>(r7, r9, r4)
            java.lang.Class<c5.c> r7 = c5.c.class
            r11 = r24
            r5.c(r0, r8, r7, r11)
            r5.c(r9, r1, r7, r11)
            q4.a r0 = new q4.a
            r9 = 1
            r0.<init>(r9)
            r5.b(r7, r0)
            java.lang.Class<o4.a> r0 = o4.a.class
            r5.a(r0, r0, r6)
            c5.f r9 = new c5.f
            r9.<init>(r15)
            r11 = r26
            r5.c(r9, r0, r11, r2)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.String r2 = "legacy_append"
            r12 = r22
            r9 = r23
            r5.c(r12, r0, r9, r2)
            y4.w r13 = new y4.w
            r13.<init>(r12, r15)
            r5.c(r13, r0, r11, r2)
            z4.a$a r12 = new z4.a$a
            r12.<init>()
            r5.g(r12)
            v4.c$b r12 = new v4.c$b
            r12.<init>()
            java.lang.Class<java.io.File> r13 = java.io.File.class
            r5.a(r13, r1, r12)
            v4.e$e r12 = new v4.e$e
            r12.<init>()
            r5.a(r13, r8, r12)
            b5.a r12 = new b5.a
            r12.<init>()
            r5.c(r12, r13, r13, r2)
            v4.e$b r12 = new v4.e$b
            r12.<init>()
            r5.a(r13, r10, r12)
            r5.a(r13, r13, r6)
            com.bumptech.glide.load.data.k$a r12 = new com.bumptech.glide.load.data.k$a
            r12.<init>(r4)
            r5.g(r12)
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r12 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r12.<init>()
            r5.g(r12)
            java.lang.Class r12 = java.lang.Integer.TYPE
            r4 = r19
            r5.a(r12, r8, r4)
            r33 = r7
            r7 = r17
            r5.a(r12, r10, r7)
            java.lang.Class<java.lang.Integer> r15 = java.lang.Integer.class
            r5.a(r15, r8, r4)
            r5.a(r15, r10, r7)
            r4 = r34
            r5.a(r15, r0, r4)
            r7 = r16
            r11 = r25
            r5.a(r12, r11, r7)
            r5.a(r15, r11, r7)
            r5.a(r12, r0, r4)
            v4.d$c r4 = new v4.d$c
            r4.<init>()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r5.a(r7, r8, r4)
            v4.d$c r4 = new v4.d$c
            r4.<init>()
            r5.a(r0, r8, r4)
            v4.t$c r4 = new v4.t$c
            r4.<init>()
            r5.a(r7, r8, r4)
            v4.t$b r4 = new v4.t$b
            r4.<init>()
            r5.a(r7, r10, r4)
            v4.t$a r4 = new v4.t$a
            r4.<init>()
            r5.a(r7, r11, r4)
            v4.a$c r4 = new v4.a$c
            android.content.res.AssetManager r7 = r28.getAssets()
            r4.<init>(r7)
            r5.a(r0, r8, r4)
            v4.a$b r4 = new v4.a$b
            android.content.res.AssetManager r7 = r28.getAssets()
            r4.<init>(r7)
            r5.a(r0, r11, r4)
            w4.b$a r4 = new w4.b$a
            r7 = r28
            r4.<init>(r7)
            r5.a(r0, r8, r4)
            w4.c$a r4 = new w4.c$a
            r4.<init>(r7)
            r5.a(r0, r8, r4)
            r4 = 29
            r12 = r30
            if (r12 < r4) goto L_0x02a2
            w4.d$c r4 = new w4.d$c
            r4.<init>(r7)
            r5.a(r0, r8, r4)
            w4.d$b r4 = new w4.d$b
            r4.<init>(r7)
            r5.a(r0, r10, r4)
        L_0x02a2:
            v4.v$d r4 = new v4.v$d
            r12 = r21
            r4.<init>(r12)
            r5.a(r0, r8, r4)
            v4.v$b r4 = new v4.v$b
            r4.<init>(r12)
            r5.a(r0, r10, r4)
            v4.v$a r4 = new v4.v$a
            r4.<init>(r12)
            r5.a(r0, r11, r4)
            v4.w$a r4 = new v4.w$a
            r4.<init>()
            r5.a(r0, r8, r4)
            w4.e$a r4 = new w4.e$a
            r4.<init>()
            java.lang.Class<java.net.URL> r10 = java.net.URL.class
            r5.a(r10, r8, r4)
            v4.j$a r4 = new v4.j$a
            r4.<init>(r7)
            r5.a(r0, r13, r4)
            w4.a$a r4 = new w4.a$a
            r4.<init>()
            java.lang.Class<v4.f> r10 = v4.f.class
            r5.a(r10, r8, r4)
            v4.b$a r4 = new v4.b$a
            r4.<init>()
            java.lang.Class<byte[]> r10 = byte[].class
            r5.a(r10, r1, r4)
            v4.b$d r1 = new v4.b$d
            r1.<init>()
            r5.a(r10, r8, r1)
            r5.a(r0, r0, r6)
            r5.a(r9, r9, r6)
            a5.l r0 = new a5.l
            r0.<init>()
            r5.c(r0, r9, r9, r2)
            r3.s r0 = new r3.s
            r0.<init>((android.content.res.Resources) r3)
            r1 = r26
            r5.h(r1, r14, r0)
            r0 = r18
            r5.h(r1, r10, r0)
            b3.w r2 = new b3.w
            r4 = r31
            r6 = r20
            r8 = 1
            r2.<init>(r8, r4, r0, r6)
            r5.h(r9, r10, r2)
            r0 = r33
            r5.h(r0, r10, r6)
            y4.b0 r0 = new y4.b0
            y4.b0$d r2 = new y4.b0$d
            r2.<init>()
            r0.<init>(r4, r2)
            java.lang.Class<java.nio.ByteBuffer> r2 = java.nio.ByteBuffer.class
            java.lang.String r4 = "legacy_append"
            r5.c(r0, r2, r1, r4)
            y4.a r1 = new y4.a
            r1.<init>(r3, r0)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.String r2 = "legacy_append"
            r5.c(r1, r0, r14, r2)
            q2.d r6 = new q2.d
            r0 = 2
            r6.<init>((int) r0)
            com.bumptech.glide.h r0 = new com.bumptech.glide.h
            r2 = r0
            r3 = r28
            r4 = r32
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r29
            r11 = r39
            r12 = r35
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r27
            r1.f4056c = r0
            return
        L_0x035f:
            r0 = move-exception
            r1 = r27
            monitor-exit(r6)
            throw r0
        L_0x0364:
            r0 = move-exception
            r1 = r27
            monitor-exit(r6)
            throw r0
        L_0x0369:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.<init>(android.content.Context, r4.n, t4.h, s4.c, s4.b, e5.l, e5.c, int, com.bumptech.glide.c, o.a, java.util.List, com.bumptech.glide.i):void");
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        c cVar;
        s4.c cVar2;
        if (!F) {
            F = true;
            o.a aVar = new o.a();
            i.a aVar2 = new i.a();
            c cVar3 = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            arrayList.add(e.a(next));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + next);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c3 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f5.c cVar4 = (f5.c) it.next();
                        if (c3.contains(cVar4.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar4);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Log.d("Glide", "Discovered GlideModule from manifest: " + ((f5.c) it2.next()).getClass());
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((f5.c) it3.next()).b();
                }
                a.C0289a aVar3 = new a.C0289a();
                if (u4.a.f15715c == 0) {
                    u4.a.f15715c = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i8 = u4.a.f15715c;
                if (!TextUtils.isEmpty("source")) {
                    u4.a aVar4 = new u4.a(new ThreadPoolExecutor(i8, i8, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(aVar3, "source", false)));
                    int i10 = u4.a.f15715c;
                    a.C0289a aVar5 = new a.C0289a();
                    if (!TextUtils.isEmpty("disk-cache")) {
                        u4.a aVar6 = new u4.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(aVar5, "disk-cache", true)));
                        if (u4.a.f15715c == 0) {
                            u4.a.f15715c = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        int i11 = u4.a.f15715c >= 4 ? 2 : 1;
                        a.C0289a aVar7 = new a.C0289a();
                        if (!TextUtils.isEmpty("animation")) {
                            u4.a aVar8 = new u4.a(new ThreadPoolExecutor(i11, i11, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(aVar7, "animation", true)));
                            t4.i iVar = new t4.i(new i.a(applicationContext));
                            e5.e eVar = new e5.e();
                            int i12 = iVar.f15356a;
                            if (i12 > 0) {
                                cVar = cVar3;
                                cVar2 = new s4.i((long) i12);
                            } else {
                                cVar = cVar3;
                                cVar2 = new d();
                            }
                            s4.h hVar = new s4.h(iVar.f15358c);
                            g gVar = new g((long) iVar.f15357b);
                            n nVar = new n(gVar, new f(applicationContext), aVar6, aVar4, new u4.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, u4.a.f15714b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.b(new a.C0289a(), "source-unlimited", false))), aVar8);
                            List emptyList = Collections.emptyList();
                            i iVar2 = new i(aVar2);
                            b bVar = new b(applicationContext, nVar, gVar, cVar2, hVar, new l((l.b) null, iVar2), eVar, 4, cVar, aVar, emptyList, iVar2);
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                f5.c cVar5 = (f5.c) it4.next();
                                try {
                                    cVar5.a();
                                } catch (AbstractMethodError e10) {
                                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(cVar5.getClass().getName()), e10);
                                }
                            }
                            applicationContext.registerComponentCallbacks(bVar);
                            E = bVar;
                            F = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (E == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (E == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return E;
    }

    public static l c(Context context) {
        if (context != null) {
            return b(context).B;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public static m e(p pVar) {
        View view;
        l c3 = c(pVar.q());
        c3.getClass();
        if (pVar.q() != null) {
            char[] cArr = l5.l.f11007a;
            boolean z10 = false;
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                return c3.b(pVar.q().getApplicationContext());
            }
            if (pVar.o() != null) {
                pVar.o();
                c3.f7822f.d();
            }
            i0 p10 = pVar.p();
            Context q10 = pVar.q();
            if (pVar.C() && !pVar.D() && (view = pVar.f2066d0) != null && view.getWindowToken() != null && pVar.f2066d0.getVisibility() == 0) {
                z10 = true;
            }
            return c3.f(q10, p10, pVar, z10);
        }
        throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
    }

    public final void d(m mVar) {
        synchronized (this.D) {
            if (this.D.contains(mVar)) {
                this.D.remove(mVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        l5.l.a();
        ((l5.i) this.f4055b).e(0);
        this.f4054a.b();
        this.f4058e.b();
    }

    public final void onTrimMemory(int i8) {
        long j10;
        l5.l.a();
        synchronized (this.D) {
            Iterator it = this.D.iterator();
            while (it.hasNext()) {
                ((m) it.next()).getClass();
            }
        }
        g gVar = (g) this.f4055b;
        gVar.getClass();
        if (i8 >= 40) {
            gVar.e(0);
        } else if (i8 >= 20 || i8 == 15) {
            synchronized (gVar) {
                j10 = gVar.f10999b;
            }
            gVar.e(j10 / 2);
        }
        this.f4054a.a(i8);
        this.f4058e.a(i8);
    }
}
