package a3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f86f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static a f87g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f88a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f89b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f90c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f91d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final C0005a f92e;

    /* renamed from: a3.a$a  reason: collision with other inner class name */
    public class C0005a extends Handler {
        public C0005a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r3 >= r1) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r4 = r2[r3];
            r5 = r4.f95b.size();
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
            if (r6 >= r5) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r7 = r4.f95b.get(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            if (r7.f99d != false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
            r7.f97b.onReceive(r11.f88a, r4.f94a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r11) {
            /*
                r10 = this;
                int r0 = r11.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r11)
                goto L_0x0017
            L_0x0009:
                a3.a r11 = a3.a.this
            L_0x000b:
                java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<a3.a$c>> r0 = r11.f89b
                monitor-enter(r0)
                java.util.ArrayList<a3.a$b> r1 = r11.f91d     // Catch:{ all -> 0x004f }
                int r1 = r1.size()     // Catch:{ all -> 0x004f }
                if (r1 > 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
            L_0x0017:
                return
            L_0x0018:
                a3.a$b[] r2 = new a3.a.b[r1]     // Catch:{ all -> 0x004f }
                java.util.ArrayList<a3.a$b> r3 = r11.f91d     // Catch:{ all -> 0x004f }
                r3.toArray(r2)     // Catch:{ all -> 0x004f }
                java.util.ArrayList<a3.a$b> r3 = r11.f91d     // Catch:{ all -> 0x004f }
                r3.clear()     // Catch:{ all -> 0x004f }
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                r0 = 0
                r3 = r0
            L_0x0027:
                if (r3 >= r1) goto L_0x000b
                r4 = r2[r3]
                java.util.ArrayList<a3.a$c> r5 = r4.f95b
                int r5 = r5.size()
                r6 = r0
            L_0x0032:
                if (r6 >= r5) goto L_0x004c
                java.util.ArrayList<a3.a$c> r7 = r4.f95b
                java.lang.Object r7 = r7.get(r6)
                a3.a$c r7 = (a3.a.c) r7
                boolean r8 = r7.f99d
                if (r8 != 0) goto L_0x0049
                android.content.BroadcastReceiver r7 = r7.f97b
                android.content.Context r8 = r11.f88a
                android.content.Intent r9 = r4.f94a
                r7.onReceive(r8, r9)
            L_0x0049:
                int r6 = r6 + 1
                goto L_0x0032
            L_0x004c:
                int r3 = r3 + 1
                goto L_0x0027
            L_0x004f:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: a3.a.C0005a.handleMessage(android.os.Message):void");
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f94a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<c> f95b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f94a = intent;
            this.f95b = arrayList;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f96a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f97b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f98c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f99d;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f96a = intentFilter;
            this.f97b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f97b);
            sb2.append(" filter=");
            sb2.append(this.f96a);
            if (this.f99d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f88a = context;
        this.f92e = new C0005a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f86f) {
            if (f87g == null) {
                f87g = new a(context.getApplicationContext());
            }
            aVar = f87g;
        }
        return aVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f89b) {
            c cVar = new c(broadcastReceiver, intentFilter);
            ArrayList arrayList = this.f89b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f89b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i8 = 0; i8 < intentFilter.countActions(); i8++) {
                String action = intentFilter.getAction(i8);
                ArrayList arrayList2 = this.f90c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f90c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0165, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0167, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "Action list: "
            java.lang.String r3 = "Resolving type "
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<a3.a$c>> r4 = r1.f89b
            monitor-enter(r4)
            java.lang.String r12 = r23.getAction()     // Catch:{ all -> 0x0169 }
            android.content.Context r5 = r1.f88a     // Catch:{ all -> 0x0169 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x0169 }
            java.lang.String r13 = r0.resolveTypeIfNeeded(r5)     // Catch:{ all -> 0x0169 }
            android.net.Uri r14 = r23.getData()     // Catch:{ all -> 0x0169 }
            java.lang.String r15 = r23.getScheme()     // Catch:{ all -> 0x0169 }
            java.util.Set r16 = r23.getCategories()     // Catch:{ all -> 0x0169 }
            int r5 = r23.getFlags()     // Catch:{ all -> 0x0169 }
            r5 = r5 & 8
            r11 = 1
            r10 = 0
            if (r5 == 0) goto L_0x0032
            r17 = r11
            goto L_0x0034
        L_0x0032:
            r17 = r10
        L_0x0034:
            if (r17 == 0) goto L_0x0057
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r6.<init>(r3)     // Catch:{ all -> 0x0169 }
            r6.append(r13)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = " scheme "
            r6.append(r3)     // Catch:{ all -> 0x0169 }
            r6.append(r15)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = " of intent "
            r6.append(r3)     // Catch:{ all -> 0x0169 }
            r6.append(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r5, r3)     // Catch:{ all -> 0x0169 }
        L_0x0057:
            java.util.HashMap<java.lang.String, java.util.ArrayList<a3.a$c>> r3 = r1.f90c     // Catch:{ all -> 0x0169 }
            java.lang.String r5 = r23.getAction()     // Catch:{ all -> 0x0169 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0169 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0169 }
            if (r3 == 0) goto L_0x0166
            if (r17 == 0) goto L_0x0078
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r6.<init>(r2)     // Catch:{ all -> 0x0169 }
            r6.append(r3)     // Catch:{ all -> 0x0169 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r5, r2)     // Catch:{ all -> 0x0169 }
        L_0x0078:
            r2 = 0
            r9 = r10
        L_0x007a:
            int r5 = r3.size()     // Catch:{ all -> 0x0169 }
            if (r9 >= r5) goto L_0x0137
            java.lang.Object r5 = r3.get(r9)     // Catch:{ all -> 0x0169 }
            r8 = r5
            a3.a$c r8 = (a3.a.c) r8     // Catch:{ all -> 0x0169 }
            if (r17 == 0) goto L_0x00a1
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r6.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r7 = "Matching against filter "
            r6.append(r7)     // Catch:{ all -> 0x0169 }
            android.content.IntentFilter r7 = r8.f96a     // Catch:{ all -> 0x0169 }
            r6.append(r7)     // Catch:{ all -> 0x0169 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x0169 }
        L_0x00a1:
            boolean r5 = r8.f98c     // Catch:{ all -> 0x0169 }
            if (r5 == 0) goto L_0x00b7
            if (r17 == 0) goto L_0x00ae
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.String r6 = "  Filter's target already added"
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x0169 }
        L_0x00ae:
            r19 = r3
            r20 = r9
            r21 = r12
            r12 = r11
            goto L_0x012d
        L_0x00b7:
            android.content.IntentFilter r5 = r8.f96a     // Catch:{ all -> 0x0169 }
            java.lang.String r18 = "LocalBroadcastManager"
            r6 = r12
            r7 = r13
            r19 = r3
            r3 = r8
            r8 = r15
            r20 = r9
            r9 = r14
            r21 = r12
            r12 = r10
            r10 = r16
            r12 = r11
            r11 = r18
            int r5 = r5.match(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0169 }
            if (r5 < 0) goto L_0x00fb
            if (r17 == 0) goto L_0x00ee
            java.lang.String r6 = "LocalBroadcastManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r7.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r8 = "  Filter matched!  match=0x"
            r7.append(r8)     // Catch:{ all -> 0x0169 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0169 }
            r7.append(r5)     // Catch:{ all -> 0x0169 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r6, r5)     // Catch:{ all -> 0x0169 }
        L_0x00ee:
            if (r2 != 0) goto L_0x00f5
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0169 }
            r2.<init>()     // Catch:{ all -> 0x0169 }
        L_0x00f5:
            r2.add(r3)     // Catch:{ all -> 0x0169 }
            r3.f98c = r12     // Catch:{ all -> 0x0169 }
            goto L_0x012d
        L_0x00fb:
            if (r17 == 0) goto L_0x012d
            r3 = -4
            if (r5 == r3) goto L_0x0115
            r3 = -3
            if (r5 == r3) goto L_0x0112
            r3 = -2
            if (r5 == r3) goto L_0x010f
            r3 = -1
            if (r5 == r3) goto L_0x010c
            java.lang.String r3 = "unknown reason"
            goto L_0x0117
        L_0x010c:
            java.lang.String r3 = "type"
            goto L_0x0117
        L_0x010f:
            java.lang.String r3 = "data"
            goto L_0x0117
        L_0x0112:
            java.lang.String r3 = "action"
            goto L_0x0117
        L_0x0115:
            java.lang.String r3 = "category"
        L_0x0117:
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r6.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r7 = "  Filter did not match: "
            r6.append(r7)     // Catch:{ all -> 0x0169 }
            r6.append(r3)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r5, r3)     // Catch:{ all -> 0x0169 }
        L_0x012d:
            int r9 = r20 + 1
            r11 = r12
            r3 = r19
            r12 = r21
            r10 = 0
            goto L_0x007a
        L_0x0137:
            r12 = r11
            if (r2 == 0) goto L_0x0166
            r10 = 0
        L_0x013b:
            int r3 = r2.size()     // Catch:{ all -> 0x0169 }
            if (r10 >= r3) goto L_0x014d
            java.lang.Object r3 = r2.get(r10)     // Catch:{ all -> 0x0169 }
            a3.a$c r3 = (a3.a.c) r3     // Catch:{ all -> 0x0169 }
            r5 = 0
            r3.f98c = r5     // Catch:{ all -> 0x0169 }
            int r10 = r10 + 1
            goto L_0x013b
        L_0x014d:
            java.util.ArrayList<a3.a$b> r3 = r1.f91d     // Catch:{ all -> 0x0169 }
            a3.a$b r5 = new a3.a$b     // Catch:{ all -> 0x0169 }
            r5.<init>(r0, r2)     // Catch:{ all -> 0x0169 }
            r3.add(r5)     // Catch:{ all -> 0x0169 }
            a3.a$a r0 = r1.f92e     // Catch:{ all -> 0x0169 }
            boolean r0 = r0.hasMessages(r12)     // Catch:{ all -> 0x0169 }
            if (r0 != 0) goto L_0x0164
            a3.a$a r0 = r1.f92e     // Catch:{ all -> 0x0169 }
            r0.sendEmptyMessage(r12)     // Catch:{ all -> 0x0169 }
        L_0x0164:
            monitor-exit(r4)     // Catch:{ all -> 0x0169 }
            return r12
        L_0x0166:
            monitor-exit(r4)     // Catch:{ all -> 0x0169 }
            r0 = 0
            return r0
        L_0x0169:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0169 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.a.c(android.content.Intent):boolean");
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f89b) {
            ArrayList remove = this.f89b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    c cVar = (c) remove.get(size);
                    cVar.f99d = true;
                    for (int i8 = 0; i8 < cVar.f96a.countActions(); i8++) {
                        String action = cVar.f96a.getAction(i8);
                        ArrayList arrayList = this.f90c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList.get(size2);
                                if (cVar2.f97b == broadcastReceiver) {
                                    cVar2.f99d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f90c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }
}
