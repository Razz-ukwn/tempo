package f3;

import android.util.Log;
import androidx.fragment.app.z0;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.p000firebaseauthapi.lh;
import com.google.android.gms.internal.p000firebaseauthapi.w9;
import ff.g;
import i3.p;
import j1.c;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.y0;
import sf.j;

public final class v implements w9, a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8516a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8517b;

    public /* synthetic */ v(Object obj, Object obj2) {
        this.f8516a = obj;
        this.f8517b = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[SYNTHETIC, Splitter:B:15:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[SYNTHETIC, Splitter:B:19:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f3.v b(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ IOException -> 0x0033, Error -> 0x0031, OverlappingFileLockException -> 0x002f }
            java.nio.channels.FileLock r0 = r5.lock()     // Catch:{ IOException -> 0x002b, Error -> 0x0029, OverlappingFileLockException -> 0x0027 }
            f3.v r2 = new f3.v     // Catch:{ IOException -> 0x0025, Error -> 0x0023, OverlappingFileLockException -> 0x0021 }
            r2.<init>((java.lang.Object) r5, (java.lang.Object) r0)     // Catch:{ IOException -> 0x0025, Error -> 0x0023, OverlappingFileLockException -> 0x0021 }
            return r2
        L_0x0021:
            r2 = move-exception
            goto L_0x0037
        L_0x0023:
            r2 = move-exception
            goto L_0x0037
        L_0x0025:
            r2 = move-exception
            goto L_0x0037
        L_0x0027:
            r0 = move-exception
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            r2 = r0
            r0 = r1
            goto L_0x0037
        L_0x002f:
            r5 = move-exception
            goto L_0x0034
        L_0x0031:
            r5 = move-exception
            goto L_0x0034
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            r2 = r5
            r5 = r1
            r0 = r5
        L_0x0037:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L_0x0043
            r0.release()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.v.b(android.content.Context):f3.v");
    }

    public final c a(o oVar) {
        c l10 = ((c) this.f8516a).l();
        String str = (String) this.f8517b;
        l10.p(str, oVar);
        ((Map) l10.f9758d).put(str, Boolean.TRUE);
        return l10;
    }

    public final void c() {
        try {
            ((FileLock) this.f8517b).release();
            ((FileChannel) this.f8516a).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public final void d(Boolean bool) {
        j.f(bool, "data");
        k0 k0Var = (k0) this.f8516a;
        k0Var.setValue(new g(Integer.valueOf(((Number) ((g) k0Var.getValue()).f8706a).intValue() + 1), bool));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        r0 = r2.query(com.google.android.gms.internal.measurement.g4.f5284a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r1}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        if (r0 != null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r0.moveToFirst() != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r2 = com.google.android.gms.internal.measurement.g4.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        if (r9 != com.google.android.gms.internal.measurement.g4.f5293j) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        com.google.android.gms.internal.measurement.g4.f5288e.put(r1, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        r2 = r0.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00af, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if (r2 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r2.equals((java.lang.Object) null) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bb, code lost:
        r3 = com.google.android.gms.internal.measurement.g4.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r9 != com.google.android.gms.internal.measurement.g4.f5293j) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c2, code lost:
        com.google.android.gms.internal.measurement.g4.f5288e.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c7, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c8, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cf, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d0, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f8516a
            com.google.android.gms.internal.measurement.n4 r0 = (com.google.android.gms.internal.measurement.n4) r0
            java.lang.Object r1 = r11.f8517b
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r0 = r0.f5415a
            android.content.ContentResolver r2 = r0.getContentResolver()
            android.net.Uri r0 = com.google.android.gms.internal.measurement.g4.f5284a
            java.lang.Class<com.google.android.gms.internal.measurement.g4> r0 = com.google.android.gms.internal.measurement.g4.class
            monitor-enter(r0)
            java.util.HashMap r3 = com.google.android.gms.internal.measurement.g4.f5288e     // Catch:{ all -> 0x00d4 }
            r4 = 0
            r8 = 1
            if (r3 != 0) goto L_0x003b
            java.util.concurrent.atomic.AtomicBoolean r3 = com.google.android.gms.internal.measurement.g4.f5287d     // Catch:{ all -> 0x00d4 }
            r3.set(r4)     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x00d4 }
            r5 = 16
            r6 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r5, r6)     // Catch:{ all -> 0x00d4 }
            com.google.android.gms.internal.measurement.g4.f5288e = r3     // Catch:{ all -> 0x00d4 }
            java.lang.Object r3 = new java.lang.Object     // Catch:{ all -> 0x00d4 }
            r3.<init>()     // Catch:{ all -> 0x00d4 }
            com.google.android.gms.internal.measurement.g4.f5293j = r3     // Catch:{ all -> 0x00d4 }
            android.net.Uri r3 = com.google.android.gms.internal.measurement.g4.f5284a     // Catch:{ all -> 0x00d4 }
            com.google.android.gms.internal.measurement.e4 r5 = new com.google.android.gms.internal.measurement.e4     // Catch:{ all -> 0x00d4 }
            r5.<init>(r4)     // Catch:{ all -> 0x00d4 }
            r2.registerContentObserver(r3, r8, r5)     // Catch:{ all -> 0x00d4 }
            goto L_0x0063
        L_0x003b:
            java.util.concurrent.atomic.AtomicBoolean r3 = com.google.android.gms.internal.measurement.g4.f5287d     // Catch:{ all -> 0x00d4 }
            boolean r3 = r3.getAndSet(r4)     // Catch:{ all -> 0x00d4 }
            if (r3 == 0) goto L_0x0063
            java.util.HashMap r3 = com.google.android.gms.internal.measurement.g4.f5288e     // Catch:{ all -> 0x00d4 }
            r3.clear()     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r3 = com.google.android.gms.internal.measurement.g4.f5289f     // Catch:{ all -> 0x00d4 }
            r3.clear()     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r3 = com.google.android.gms.internal.measurement.g4.f5290g     // Catch:{ all -> 0x00d4 }
            r3.clear()     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r3 = com.google.android.gms.internal.measurement.g4.f5291h     // Catch:{ all -> 0x00d4 }
            r3.clear()     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r3 = com.google.android.gms.internal.measurement.g4.f5292i     // Catch:{ all -> 0x00d4 }
            r3.clear()     // Catch:{ all -> 0x00d4 }
            java.lang.Object r3 = new java.lang.Object     // Catch:{ all -> 0x00d4 }
            r3.<init>()     // Catch:{ all -> 0x00d4 }
            com.google.android.gms.internal.measurement.g4.f5293j = r3     // Catch:{ all -> 0x00d4 }
        L_0x0063:
            java.lang.Object r9 = com.google.android.gms.internal.measurement.g4.f5293j     // Catch:{ all -> 0x00d4 }
            java.util.HashMap r3 = com.google.android.gms.internal.measurement.g4.f5288e     // Catch:{ all -> 0x00d4 }
            boolean r3 = r3.containsKey(r1)     // Catch:{ all -> 0x00d4 }
            r10 = 0
            if (r3 == 0) goto L_0x007c
            java.util.HashMap r2 = com.google.android.gms.internal.measurement.g4.f5288e     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00d4 }
            if (r1 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r10 = r1
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            goto L_0x00cb
        L_0x007c:
            java.lang.String[] r3 = com.google.android.gms.internal.measurement.g4.f5294k     // Catch:{ all -> 0x00d4 }
            int r3 = r3.length     // Catch:{ all -> 0x00d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            android.net.Uri r3 = com.google.android.gms.internal.measurement.g4.f5284a
            r0 = 0
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[r8]
            r6[r4] = r1
            r7 = 0
            r4 = r0
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0091
            goto L_0x00cb
        L_0x0091:
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x00cf }
            if (r2 != 0) goto L_0x00ab
            java.lang.Class<com.google.android.gms.internal.measurement.g4> r2 = com.google.android.gms.internal.measurement.g4.class
            monitor-enter(r2)     // Catch:{ all -> 0x00cf }
            java.lang.Object r3 = com.google.android.gms.internal.measurement.g4.f5293j     // Catch:{ all -> 0x00a8 }
            if (r9 != r3) goto L_0x00a3
            java.util.HashMap r3 = com.google.android.gms.internal.measurement.g4.f5288e     // Catch:{ all -> 0x00a8 }
            r3.put(r1, r10)     // Catch:{ all -> 0x00a8 }
        L_0x00a3:
            monitor-exit(r2)     // Catch:{ all -> 0x00a8 }
            r0.close()
            goto L_0x00cb
        L_0x00a8:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a8 }
            throw r1     // Catch:{ all -> 0x00cf }
        L_0x00ab:
            java.lang.String r2 = r0.getString(r8)     // Catch:{ all -> 0x00cf }
            r0.close()
            if (r2 == 0) goto L_0x00bb
            boolean r0 = r2.equals(r10)
            if (r0 == 0) goto L_0x00bb
            r2 = r10
        L_0x00bb:
            java.lang.Class<com.google.android.gms.internal.measurement.g4> r3 = com.google.android.gms.internal.measurement.g4.class
            monitor-enter(r3)
            java.lang.Object r0 = com.google.android.gms.internal.measurement.g4.f5293j     // Catch:{ all -> 0x00cc }
            if (r9 != r0) goto L_0x00c7
            java.util.HashMap r0 = com.google.android.gms.internal.measurement.g4.f5288e     // Catch:{ all -> 0x00cc }
            r0.put(r1, r2)     // Catch:{ all -> 0x00cc }
        L_0x00c7:
            monitor-exit(r3)     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00cb
            r10 = r2
        L_0x00cb:
            return r10
        L_0x00cc:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00cc }
            throw r0
        L_0x00cf:
            r1 = move-exception
            r0.close()
            throw r1
        L_0x00d4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.v.e():java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [r9.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r18, com.google.android.gms.common.api.Status r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            java.lang.Object r2 = r0.f8517b
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2
            java.lang.String r3 = "completion source cannot be null"
            u6.q.j(r2, r3)
            if (r1 == 0) goto L_0x013f
            java.lang.Object r3 = r0.f8516a
            com.google.android.gms.internal.firebase-auth-api.t r3 = (com.google.android.gms.internal.p000firebaseauthapi.t) r3
            com.google.android.gms.internal.firebase-auth-api.qh r4 = r3.f4936k
            if (r4 == 0) goto L_0x00fa
            m9.f r1 = r3.f4928c
            com.google.firebase.auth.FirebaseAuth r1 = com.google.firebase.auth.FirebaseAuth.getInstance(r1)
            com.google.android.gms.internal.firebase-auth-api.qh r4 = r3.f4936k
            java.lang.String r5 = r3.a()
            java.lang.String r6 = "reauthenticateWithCredential"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x003a
            java.lang.String r5 = r3.a()
            java.lang.String r6 = "reauthenticateWithCredentialWithData"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x003c
        L_0x003a:
            r9.m r3 = r3.f4929d
        L_0x003c:
            android.util.SparseArray r5 = com.google.android.gms.internal.p000firebaseauthapi.d.f4476a
            r1.getClass()
            r4.getClass()
            android.util.SparseArray r5 = com.google.android.gms.internal.p000firebaseauthapi.d.f4476a
            r6 = 17078(0x42b6, float:2.3931E-41)
            java.lang.Object r5 = r5.get(r6)
            android.util.Pair r5 = (android.util.Pair) r5
            r9.j r6 = new r9.j
            java.lang.Object r7 = r5.first
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r5.second
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r4.f4847b
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r9 = ag.m.B(r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x006a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0080
            java.lang.Object r10 = r9.next()
            r9.p r10 = (r9.p) r10
            boolean r12 = r10 instanceof r9.s
            if (r12 == 0) goto L_0x006a
            r9.s r10 = (r9.s) r10
            r11.add(r10)
            goto L_0x006a
        L_0x0080:
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            java.util.ArrayList r9 = ag.m.B(r9)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0090:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00a6
            java.lang.Object r10 = r9.next()
            r9.p r10 = (r9.p) r10
            boolean r12 = r10 instanceof r9.d0
            if (r12 == 0) goto L_0x0090
            r9.d0 r10 = (r9.d0) r10
            r15.add(r10)
            goto L_0x0090
        L_0x00a6:
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r8 = ag.m.B(r8)
            java.lang.String r9 = r4.f4846a
            u6.q.f(r9)
            s9.h r12 = new s9.h
            r12.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r12.f14832c = r10
            java.util.Iterator r8 = r8.iterator()
        L_0x00c1:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00d9
            java.lang.Object r10 = r8.next()
            r9.p r10 = (r9.p) r10
            boolean r13 = r10 instanceof r9.s
            if (r13 == 0) goto L_0x00c1
            java.util.List r13 = r12.f14832c
            r9.s r10 = (r9.s) r10
            r13.add(r10)
            goto L_0x00c1
        L_0x00d9:
            r12.f14831b = r9
            s9.f r10 = new s9.f
            m9.f r1 = r1.f6305a
            r1.a()
            java.lang.String r13 = r1.f11332b
            java.lang.Object r1 = r4.f4848c
            r14 = r1
            r9.g0 r14 = (r9.g0) r14
            r1 = r3
            s9.p0 r1 = (s9.p0) r1
            r3 = r15
            r15 = r1
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r6.<init>(r7, r5)
            r2.setException(r6)
            return
        L_0x00fa:
            r9.b r3 = r3.f4935j
            if (r3 == 0) goto L_0x0137
            android.util.SparseArray r3 = com.google.android.gms.internal.p000firebaseauthapi.d.f4476a
            r3 = 17012(0x4274, float:2.3839E-41)
            int r4 = r1.f4176b
            if (r4 == r3) goto L_0x0114
            r3 = 17007(0x426f, float:2.3832E-41)
            if (r4 == r3) goto L_0x0114
            r3 = 17025(0x4281, float:2.3857E-41)
            if (r4 != r3) goto L_0x010f
            goto L_0x0114
        L_0x010f:
            m9.g r1 = com.google.android.gms.internal.p000firebaseauthapi.d.a(r19)
            goto L_0x0133
        L_0x0114:
            android.util.SparseArray r3 = com.google.android.gms.internal.p000firebaseauthapi.d.f4476a
            java.lang.Object r3 = r3.get(r4)
            android.util.Pair r3 = (android.util.Pair) r3
            if (r3 == 0) goto L_0x0123
            java.lang.Object r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0125
        L_0x0123:
            java.lang.String r3 = "An internal error has occurred."
        L_0x0125:
            java.lang.String r1 = com.google.android.gms.internal.p000firebaseauthapi.d.c(r3, r1)
            r9.k r3 = new r9.k
            java.lang.String r4 = com.google.android.gms.internal.p000firebaseauthapi.d.b(r4)
            r3.<init>(r4, r1)
            r1 = r3
        L_0x0133:
            r2.setException(r1)
            return
        L_0x0137:
            m9.g r1 = com.google.android.gms.internal.p000firebaseauthapi.d.a(r19)
            r2.setException(r1)
            return
        L_0x013f:
            r1 = r18
            r2.setResult(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.v.f(java.lang.Object, com.google.android.gms.common.api.Status):void");
    }

    public final lh zza() {
        return (lh) this.f8516a;
    }

    public final lh zzb() {
        return (lh) this.f8517b;
    }

    public /* synthetic */ v(byte[] bArr, byte[] bArr2) {
        this.f8516a = lh.a(bArr);
        this.f8517b = lh.a(bArr2);
    }

    public /* synthetic */ v() {
        this.f8516a = new HashMap();
        this.f8517b = new HashMap();
    }

    public /* synthetic */ v(int i8) {
        y0 a10 = z0.a(new g(Integer.MIN_VALUE, null));
        this.f8516a = a10;
        this.f8517b = new u(a10);
    }

    public /* synthetic */ v(p pVar) {
        j.f(pVar, "database");
        this.f8516a = pVar;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        j.e(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f8517b = newSetFromMap;
    }
}
