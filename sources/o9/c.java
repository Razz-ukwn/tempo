package o9;

import com.google.android.gms.internal.measurement.r1;
import com.google.android.gms.internal.measurement.y1;
import java.util.concurrent.ConcurrentHashMap;
import p7.a;
import p9.e;
import u6.q;
import v9.b;

public final class c implements a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f12244c;

    /* renamed from: a  reason: collision with root package name */
    public final a f12245a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f12246b = new ConcurrentHashMap();

    public c(a aVar) {
        q.i(aVar);
        this.f12245a = aVar;
    }

    public final b a(String str, b bVar) {
        boolean z10 = true;
        if (!(!p9.a.f12522c.contains(str))) {
            return null;
        }
        boolean isEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f12246b;
        if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        boolean equals = "fiam".equals(str);
        a aVar = this.f12245a;
        Object cVar = equals ? new p9.c(aVar, bVar) : "clx".equals(str) ? new e(aVar, bVar) : null;
        if (cVar == null) {
            return null;
        }
        concurrentHashMap.put(str, cVar);
        return new b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r6 = this;
            com.google.android.gms.internal.measurement.u5 r0 = p9.a.f12522c
            boolean r0 = r0.contains(r7)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            com.google.android.gms.internal.measurement.u5 r0 = p9.a.f12521b
            boolean r0 = r0.contains(r8)
            r2 = 0
            if (r0 == 0) goto L_0x0015
            goto L_0x002a
        L_0x0015:
            com.google.android.gms.internal.measurement.u5 r0 = p9.a.f12523d
            int r3 = r0.f5544d
            r4 = r2
        L_0x001a:
            if (r4 >= r3) goto L_0x002c
            java.lang.Object r5 = r0.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r9.containsKey(r5)
            int r4 = r4 + 1
            if (r5 == 0) goto L_0x001a
        L_0x002a:
            r0 = r2
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            if (r0 != 0) goto L_0x0030
            return
        L_0x0030:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x003a
            goto L_0x00a9
        L_0x003a:
            com.google.android.gms.internal.measurement.u5 r0 = p9.a.f12522c
            boolean r0 = r0.contains(r7)
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0044
            goto L_0x0096
        L_0x0044:
            com.google.android.gms.internal.measurement.u5 r0 = p9.a.f12523d
            int r3 = r0.f5544d
            r4 = r2
        L_0x0049:
            if (r4 >= r3) goto L_0x005a
            java.lang.Object r5 = r0.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r9.containsKey(r5)
            int r4 = r4 + 1
            if (r5 == 0) goto L_0x0049
            goto L_0x0096
        L_0x005a:
            int r0 = r7.hashCode()
            r3 = 101200(0x18b50, float:1.41811E-40)
            r4 = 2
            if (r0 == r3) goto L_0x0083
            r3 = 101230(0x18b6e, float:1.41853E-40)
            if (r0 == r3) goto L_0x0079
            r3 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r0 == r3) goto L_0x006f
            goto L_0x008d
        L_0x006f:
            java.lang.String r0 = "fiam"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x008d
            r0 = r4
            goto L_0x008e
        L_0x0079:
            java.lang.String r0 = "fdl"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x008d
            r0 = r1
            goto L_0x008e
        L_0x0083:
            java.lang.String r0 = "fcm"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x008d
            r0 = r2
            goto L_0x008e
        L_0x008d:
            r0 = -1
        L_0x008e:
            java.lang.String r3 = "_cis"
            if (r0 == 0) goto L_0x00a4
            if (r0 == r1) goto L_0x009e
            if (r0 == r4) goto L_0x0098
        L_0x0096:
            r1 = r2
            goto L_0x00a9
        L_0x0098:
            java.lang.String r0 = "fiam_integration"
            r9.putString(r3, r0)
            goto L_0x00a9
        L_0x009e:
            java.lang.String r0 = "fdl_integration"
            r9.putString(r3, r0)
            goto L_0x00a9
        L_0x00a4:
            java.lang.String r0 = "fcm_integration"
            r9.putString(r3, r0)
        L_0x00a9:
            if (r1 == 0) goto L_0x00d1
            java.lang.String r0 = "clx"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "_r"
            r1 = 1
            r9.putLong(r0, r1)
        L_0x00c2:
            p7.a r0 = r6.f12245a
            com.google.android.gms.internal.measurement.y1 r0 = r0.f12474a
            r0.getClass()
            com.google.android.gms.internal.measurement.q1 r1 = new com.google.android.gms.internal.measurement.q1
            r1.<init>(r0, r7, r8, r9)
            r0.b(r1)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.c.b(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public final void c(String str) {
        if (!p9.a.f12522c.contains("fcm")) {
            y1 y1Var = this.f12245a.f12474a;
            y1Var.getClass();
            y1Var.b(new r1(y1Var, str));
        }
    }
}
