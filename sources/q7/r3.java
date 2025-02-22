package q7;

import android.text.TextUtils;
import b1.b;
import cb.e;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.p2;
import com.google.android.gms.internal.measurement.q2;
import com.google.android.gms.internal.measurement.r2;
import com.google.android.gms.internal.measurement.s2;
import com.google.android.gms.internal.measurement.t2;
import com.google.android.gms.internal.measurement.w2;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import o.a;
import r3.s;
import u6.q;

public final class r3 extends n6 implements e {
    public final a B = new a();
    public final a C = new a();
    public final a D = new a();
    public final a E = new a();
    public final q3 F = new q3(this);
    public final s G = new s((Object) this);
    public final a H = new a();
    public final a I = new a();
    public final a J = new a();

    /* renamed from: d  reason: collision with root package name */
    public final a f13298d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final a f13299e = new a();

    public r3(t6 t6Var) {
        super(t6Var);
    }

    public static final a q(t2 t2Var) {
        a aVar = new a();
        for (w2 w2Var : t2Var.H()) {
            aVar.put(w2Var.u(), w2Var.v());
        }
        return aVar;
    }

    public final String f(String str, String str2) {
        i();
        o(str);
        Map map = (Map) this.f13298d.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean l() {
        return false;
    }

    public final t2 m(String str, byte[] bArr) {
        k4 k4Var = this.f13121a;
        if (bArr == null) {
            return t2.z();
        }
        try {
            t2 t2Var = (t2) ((s2) v6.A(t2.x(), bArr)).j();
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            q2 q2Var = s2Var.J;
            String str2 = null;
            Long valueOf = t2Var.M() ? Long.valueOf(t2Var.v()) : null;
            if (t2Var.L()) {
                str2 = t2Var.A();
            }
            q2Var.d(valueOf, str2, "Parsed config. version, gmp_app_id");
            return t2Var;
        } catch (o7 e10) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.E.d(s2.r(str), e10, "Unable to merge remote config. appId");
            return t2.z();
        } catch (RuntimeException e11) {
            s2 s2Var3 = ((x3) k4Var).E;
            x3.l(s2Var3);
            s2Var3.E.d(s2.r(str), e11, "Unable to merge remote config. appId");
            return t2.z();
        }
    }

    public final void n(String str, s2 s2Var) {
        HashSet hashSet = new HashSet();
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        for (p2 u7 : Collections.unmodifiableList(((t2) s2Var.f5179b).F())) {
            hashSet.add(u7.u());
        }
        for (int i8 = 0; i8 < ((t2) s2Var.f5179b).u(); i8++) {
            q2 q2Var = (q2) ((t2) s2Var.f5179b).w(i8).j();
            boolean isEmpty = q2Var.m().isEmpty();
            k4 k4Var = this.f13121a;
            if (isEmpty) {
                s2 s2Var2 = ((x3) k4Var).E;
                x3.l(s2Var2);
                s2Var2.E.b("EventConfig contained null event name");
            } else {
                String m = q2Var.m();
                String p10 = b.p(q2Var.m(), e.Y, e.f3894a0);
                if (!TextUtils.isEmpty(p10)) {
                    q2Var.l();
                    r2.w((r2) q2Var.f5179b, p10);
                    s2Var.l();
                    t2.I((t2) s2Var.f5179b, i8, (r2) q2Var.j());
                }
                if (((r2) q2Var.f5179b).z() && ((r2) q2Var.f5179b).x()) {
                    aVar.put(m, Boolean.TRUE);
                }
                if (((r2) q2Var.f5179b).A() && ((r2) q2Var.f5179b).y()) {
                    aVar2.put(q2Var.m(), Boolean.TRUE);
                }
                if (((r2) q2Var.f5179b).B()) {
                    if (((r2) q2Var.f5179b).t() < 2 || ((r2) q2Var.f5179b).t() > 65535) {
                        s2 s2Var3 = ((x3) k4Var).E;
                        x3.l(s2Var3);
                        s2Var3.E.d(q2Var.m(), Integer.valueOf(((r2) q2Var.f5179b).t()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        aVar3.put(q2Var.m(), Integer.valueOf(((r2) q2Var.f5179b).t()));
                    }
                }
            }
        }
        this.f13299e.put(str, hashSet);
        this.B.put(str, aVar);
        this.C.put(str, aVar2);
        this.E.put(str, aVar3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        if (r4 != null) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(java.lang.String r14) {
        /*
            r13 = this;
            r13.j()
            r13.i()
            u6.q.f(r14)
            o.a r0 = r13.D
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r14, r1)
            if (r2 != 0) goto L_0x0119
            q7.t6 r2 = r13.f13208b
            q7.k r2 = r2.f13350c
            q7.t6.H(r2)
            q7.k4 r3 = r2.f13121a
            u6.q.f(r14)
            r2.i()
            r2.j()
            android.database.sqlite.SQLiteDatabase r4 = r2.B()     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            java.lang.String r5 = "apps"
            java.lang.String r2 = "remote_config"
            java.lang.String r6 = "config_last_modified_time"
            java.lang.String r7 = "e_tag"
            java.lang.String[] r6 = new java.lang.String[]{r2, r6, r7}     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            java.lang.String r7 = "app_id=?"
            r2 = 1
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            r12 = 0
            r8[r12] = r14     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0081, all -> 0x007e }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x007c }
            if (r5 != 0) goto L_0x004a
            goto L_0x0097
        L_0x004a:
            byte[] r5 = r4.getBlob(r12)     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r2 = r4.getString(r2)     // Catch:{ SQLiteException -> 0x007c }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x007c }
            boolean r7 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x007c }
            if (r7 == 0) goto L_0x0070
            r7 = r3
            q7.x3 r7 = (q7.x3) r7     // Catch:{ SQLiteException -> 0x007c }
            q7.s2 r7 = r7.E     // Catch:{ SQLiteException -> 0x007c }
            q7.x3.l(r7)     // Catch:{ SQLiteException -> 0x007c }
            q7.q2 r7 = r7.B     // Catch:{ SQLiteException -> 0x007c }
            java.lang.String r8 = "Got multiple records for app config, expected one. appId"
            q7.r2 r9 = q7.s2.r(r14)     // Catch:{ SQLiteException -> 0x007c }
            r7.c(r9, r8)     // Catch:{ SQLiteException -> 0x007c }
        L_0x0070:
            if (r5 != 0) goto L_0x0073
            goto L_0x0097
        L_0x0073:
            com.google.android.gms.internal.firebase-auth-api.qh r7 = new com.google.android.gms.internal.firebase-auth-api.qh     // Catch:{ SQLiteException -> 0x007c }
            r7.<init>((java.lang.String) r2, (java.lang.String) r6, (byte[]) r5)     // Catch:{ SQLiteException -> 0x007c }
            r4.close()
            goto L_0x009b
        L_0x007c:
            r2 = move-exception
            goto L_0x0083
        L_0x007e:
            r14 = move-exception
            goto L_0x0113
        L_0x0081:
            r2 = move-exception
            r4 = r1
        L_0x0083:
            q7.x3 r3 = (q7.x3) r3     // Catch:{ all -> 0x0111 }
            q7.s2 r3 = r3.E     // Catch:{ all -> 0x0111 }
            q7.x3.l(r3)     // Catch:{ all -> 0x0111 }
            q7.q2 r3 = r3.B     // Catch:{ all -> 0x0111 }
            java.lang.String r5 = "Error querying remote config. appId"
            q7.r2 r6 = q7.s2.r(r14)     // Catch:{ all -> 0x0111 }
            r3.d(r6, r2, r5)     // Catch:{ all -> 0x0111 }
            if (r4 == 0) goto L_0x009a
        L_0x0097:
            r4.close()
        L_0x009a:
            r7 = r1
        L_0x009b:
            o.a r2 = r13.J
            o.a r3 = r13.I
            o.a r4 = r13.H
            o.a r5 = r13.f13298d
            if (r7 != 0) goto L_0x00c9
            r5.put(r14, r1)
            o.a r5 = r13.B
            r5.put(r14, r1)
            o.a r5 = r13.f13299e
            r5.put(r14, r1)
            o.a r5 = r13.C
            r5.put(r14, r1)
            r0.put(r14, r1)
            r4.put(r14, r1)
            r3.put(r14, r1)
            r2.put(r14, r1)
            o.a r0 = r13.E
            r0.put(r14, r1)
            return
        L_0x00c9:
            java.lang.Object r1 = r7.f4847b
            byte[] r1 = (byte[]) r1
            com.google.android.gms.internal.measurement.t2 r1 = r13.m(r14, r1)
            com.google.android.gms.internal.measurement.c7 r1 = r1.j()
            com.google.android.gms.internal.measurement.s2 r1 = (com.google.android.gms.internal.measurement.s2) r1
            r13.n(r14, r1)
            com.google.android.gms.internal.measurement.g7 r6 = r1.j()
            com.google.android.gms.internal.measurement.t2 r6 = (com.google.android.gms.internal.measurement.t2) r6
            o.a r6 = q(r6)
            r5.put(r14, r6)
            com.google.android.gms.internal.measurement.g7 r5 = r1.j()
            com.google.android.gms.internal.measurement.t2 r5 = (com.google.android.gms.internal.measurement.t2) r5
            r0.put(r14, r5)
            com.google.android.gms.internal.measurement.g7 r0 = r1.j()
            com.google.android.gms.internal.measurement.t2 r0 = (com.google.android.gms.internal.measurement.t2) r0
            r13.p(r14, r0)
            com.google.android.gms.internal.measurement.g7 r0 = r1.f5179b
            com.google.android.gms.internal.measurement.t2 r0 = (com.google.android.gms.internal.measurement.t2) r0
            java.lang.String r0 = r0.D()
            r4.put(r14, r0)
            java.lang.String r0 = r7.f4846a
            r3.put(r14, r0)
            java.lang.Object r0 = r7.f4848c
            java.lang.String r0 = (java.lang.String) r0
            r2.put(r14, r0)
            return
        L_0x0111:
            r14 = move-exception
            r1 = r4
        L_0x0113:
            if (r1 == 0) goto L_0x0118
            r1.close()
        L_0x0118:
            throw r14
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.r3.o(java.lang.String):void");
    }

    public final void p(String str, t2 t2Var) {
        int t2 = t2Var.t();
        q3 q3Var = this.F;
        if (t2 != 0) {
            k4 k4Var = this.f13121a;
            x3 x3Var = (x3) k4Var;
            s2 s2Var = x3Var.E;
            x3.l(s2Var);
            s2Var.J.c(Integer.valueOf(t2Var.t()), "EES programs found");
            b4 b4Var = (b4) t2Var.G().get(0);
            try {
                o0 o0Var = new o0();
                o2 o2Var = o0Var.f5435a;
                o2Var.f5443d.f5482a.put("internal.remoteConfig", new n3(this, str));
                o2Var.f5443d.f5482a.put("internal.appMetadata", new o3(this, str));
                o2Var.f5443d.f5482a.put("internal.logger", new p3(this));
                o0Var.a(b4Var);
                q3Var.d(str, o0Var);
                s2 s2Var2 = ((x3) k4Var).E;
                x3.l(s2Var2);
                s2Var2.J.d(str, Integer.valueOf(b4Var.t().t()), "EES program loaded for appId, activities");
                for (a4 u7 : b4Var.t().w()) {
                    s2 s2Var3 = ((x3) k4Var).E;
                    x3.l(s2Var3);
                    s2Var3.J.c(u7.u(), "EES program activity");
                }
            } catch (i1 unused) {
                s2 s2Var4 = x3Var.E;
                x3.l(s2Var4);
                s2Var4.B.c(str, "Failed to load EES program. appId");
            }
        } else {
            q3Var.e(str);
        }
    }

    public final int r(String str, String str2) {
        Integer num;
        i();
        o(str);
        Map map = (Map) this.E.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final t2 s(String str) {
        j();
        i();
        q.f(str);
        o(str);
        return (t2) this.D.getOrDefault(str, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r4 = (com.google.android.gms.internal.measurement.t2) r3.D.getOrDefault(r4, null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            o.a r0 = r3.D
            r2 = 0
            java.lang.Object r4 = r0.getOrDefault(r4, r2)
            com.google.android.gms.internal.measurement.t2 r4 = (com.google.android.gms.internal.measurement.t2) r4
            if (r4 != 0) goto L_0x0014
            return r1
        L_0x0014:
            int r4 = r4.t()
            if (r4 == 0) goto L_0x001c
            r4 = 1
            return r4
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.r3.t(java.lang.String):boolean");
    }

    public final boolean u(String str, String str2) {
        Boolean bool;
        i();
        o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.C.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean v(String str, String str2) {
        Boolean bool;
        i();
        o(str);
        if ("1".equals(f(str, "measurement.upload.blacklist_internal")) && a7.W(str2)) {
            return true;
        }
        if ("1".equals(f(str, "measurement.upload.blacklist_public")) && a7.X(str2)) {
            return true;
        }
        Map map = (Map) this.B.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x039f, code lost:
        if (r0.hasNext() == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03a1, code lost:
        r1 = (com.google.android.gms.internal.measurement.k2) r0.next();
        r8.j();
        r8.i();
        u6.q.f(r30);
        u6.q.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03bb, code lost:
        if (r1.x().isEmpty() == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03bd, code lost:
        r0 = ((q7.x3) r6).E;
        q7.x3.l(r0);
        r0 = r0.E;
        r4 = q7.s2.r(r30);
        r5 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03d4, code lost:
        if (r1.C() == false) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03d6, code lost:
        r1 = java.lang.Integer.valueOf(r1.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03df, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03e0, code lost:
        r0.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03e9, code lost:
        r10 = r1.e();
        r13 = new android.content.ContentValues();
        r13.put(r3, r2);
        r26 = r0;
        r13.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0402, code lost:
        if (r1.C() == false) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0404, code lost:
        r0 = java.lang.Integer.valueOf(r1.t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x040d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x040e, code lost:
        r13.put("filter_id", r0);
        r28 = r3;
        r13.put("property_name", r1.x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0420, code lost:
        if (r1.D() == false) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0422, code lost:
        r0 = java.lang.Boolean.valueOf(r1.B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x042b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x042c, code lost:
        r13.put("session_scoped", r0);
        r13.put("data", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0440, code lost:
        if (r8.B().insertWithOnConflict("property_filters", (java.lang.String) null, r13, 5) != -1) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0442, code lost:
        r0 = ((q7.x3) r6).E;
        q7.x3.l(r0);
        r0.B.c(q7.s2.r(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0456, code lost:
        r0 = r26;
        r3 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x045c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r1 = ((q7.x3) r6).E;
        q7.x3.l(r1);
        r1.B.d(q7.s2.r(r30), r0, "Error storing property filter. appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x049c, code lost:
        r5 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0638, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r10 = r0.A().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x027e, code lost:
        if (r10.hasNext() == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x028a, code lost:
        if (((com.google.android.gms.internal.measurement.k2) r10.next()).C() != false) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x028c, code lost:
        r0 = ((q7.x3) r6).E;
        q7.x3.l(r0);
        r0.E.d(q7.s2.r(r30), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r10 = r0.z().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02b0, code lost:
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02bc, code lost:
        if (r10.hasNext() == false) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r13 = (com.google.android.gms.internal.measurement.c2) r10.next();
        r8.j();
        r8.i();
        u6.q.f(r30);
        u6.q.i(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02d8, code lost:
        if (r13.z().isEmpty() == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r0 = ((q7.x3) r6).E;
        q7.x3.l(r0);
        r0 = r0.E;
        r4 = q7.s2.r(r30);
        r5 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02f1, code lost:
        if (r13.H() == false) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02f3, code lost:
        r6 = java.lang.Integer.valueOf(r13.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02fc, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02fd, code lost:
        r0.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r5, java.lang.String.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0304, code lost:
        r27 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0308, code lost:
        r26 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r10 = r13.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x030e, code lost:
        r27 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r1 = new android.content.ContentValues();
        r1.put(r3, r2);
        r1.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0323, code lost:
        if (r13.H() == false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0325, code lost:
        r3 = java.lang.Integer.valueOf(r13.u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x032e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x032f, code lost:
        r1.put("filter_id", r3);
        r1.put("event_name", r13.z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x033f, code lost:
        if (r13.I() == false) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0341, code lost:
        r3 = java.lang.Boolean.valueOf(r13.F());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x034a, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x034b, code lost:
        r1.put("session_scoped", r3);
        r1.put("data", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x035f, code lost:
        if (r8.B().insertWithOnConflict("event_filters", (java.lang.String) null, r1, 5) != -1) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0361, code lost:
        r1 = ((q7.x3) r6).E;
        q7.x3.l(r1);
        r1.B.c(q7.s2.r(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0374, code lost:
        r3 = r25;
        r10 = r26;
        r1 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x037c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r1 = ((q7.x3) r6).E;
        q7.x3.l(r1);
        r1.B.d(q7.s2.r(r30), r0, "Error storing event filter. appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0391, code lost:
        r27 = r1;
        r0 = r0.A().iterator();
     */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0605 A[Catch:{ SQLiteException -> 0x0619 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(java.lang.String r30, byte[] r31, java.lang.String r32, java.lang.String r33) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            r3 = r32
            r4 = r33
            r29.j()
            r29.i()
            u6.q.f(r30)
            com.google.android.gms.internal.measurement.t2 r0 = r29.m(r30, r31)
            com.google.android.gms.internal.measurement.c7 r0 = r0.j()
            r5 = r0
            com.google.android.gms.internal.measurement.s2 r5 = (com.google.android.gms.internal.measurement.s2) r5
            r1.n(r2, r5)
            com.google.android.gms.internal.measurement.g7 r0 = r5.j()
            com.google.android.gms.internal.measurement.t2 r0 = (com.google.android.gms.internal.measurement.t2) r0
            r1.p(r2, r0)
            o.a r6 = r1.D
            com.google.android.gms.internal.measurement.g7 r0 = r5.j()
            com.google.android.gms.internal.measurement.t2 r0 = (com.google.android.gms.internal.measurement.t2) r0
            r6.put(r2, r0)
            o.a r0 = r1.H
            com.google.android.gms.internal.measurement.g7 r7 = r5.f5179b
            com.google.android.gms.internal.measurement.t2 r7 = (com.google.android.gms.internal.measurement.t2) r7
            java.lang.String r7 = r7.D()
            r0.put(r2, r7)
            o.a r0 = r1.I
            r0.put(r2, r3)
            o.a r0 = r1.J
            r0.put(r2, r4)
            o.a r0 = r1.f13298d
            com.google.android.gms.internal.measurement.g7 r7 = r5.j()
            com.google.android.gms.internal.measurement.t2 r7 = (com.google.android.gms.internal.measurement.t2) r7
            o.a r7 = q(r7)
            r0.put(r2, r7)
            q7.t6 r7 = r1.f13208b
            q7.k r8 = r7.f13350c
            q7.t6.H(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            com.google.android.gms.internal.measurement.g7 r0 = r5.f5179b
            com.google.android.gms.internal.measurement.t2 r0 = (com.google.android.gms.internal.measurement.t2) r0
            com.google.android.gms.internal.measurement.l7 r0 = r0.E()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r9.<init>(r0)
            java.lang.String r10 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r11 = "event_filters"
            java.lang.String r12 = "property_filters"
            r14 = 0
        L_0x007a:
            int r15 = r9.size()
            if (r14 >= r15) goto L_0x01d1
            java.lang.Object r15 = r9.get(r14)
            com.google.android.gms.internal.measurement.a2 r15 = (com.google.android.gms.internal.measurement.a2) r15
            com.google.android.gms.internal.measurement.c7 r15 = r15.j()
            com.google.android.gms.internal.measurement.z1 r15 = (com.google.android.gms.internal.measurement.z1) r15
            com.google.android.gms.internal.measurement.g7 r13 = r15.f5179b
            com.google.android.gms.internal.measurement.a2 r13 = (com.google.android.gms.internal.measurement.a2) r13
            int r13 = r13.u()
            if (r13 == 0) goto L_0x0160
            r13 = 0
        L_0x0097:
            r16 = r6
            com.google.android.gms.internal.measurement.g7 r6 = r15.f5179b
            com.google.android.gms.internal.measurement.a2 r6 = (com.google.android.gms.internal.measurement.a2) r6
            int r6 = r6.u()
            if (r13 >= r6) goto L_0x015d
            com.google.android.gms.internal.measurement.g7 r6 = r15.f5179b
            com.google.android.gms.internal.measurement.a2 r6 = (com.google.android.gms.internal.measurement.a2) r6
            com.google.android.gms.internal.measurement.c2 r6 = r6.x(r13)
            com.google.android.gms.internal.measurement.c7 r6 = r6.j()
            com.google.android.gms.internal.measurement.b2 r6 = (com.google.android.gms.internal.measurement.b2) r6
            com.google.android.gms.internal.measurement.c7 r17 = r6.clone()
            r4 = r17
            com.google.android.gms.internal.measurement.b2 r4 = (com.google.android.gms.internal.measurement.b2) r4
            com.google.android.gms.internal.measurement.g7 r3 = r6.f5179b
            com.google.android.gms.internal.measurement.c2 r3 = (com.google.android.gms.internal.measurement.c2) r3
            java.lang.String r3 = r3.z()
            r17 = r7
            java.lang.String[] r7 = cb.e.Y
            java.lang.String[] r1 = cb.e.f3894a0
            java.lang.String r1 = b1.b.p(r3, r7, r1)
            if (r1 == 0) goto L_0x00d9
            r4.l()
            com.google.android.gms.internal.measurement.g7 r3 = r4.f5179b
            com.google.android.gms.internal.measurement.c2 r3 = (com.google.android.gms.internal.measurement.c2) r3
            com.google.android.gms.internal.measurement.c2.B(r3, r1)
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r3 = r1
            r1 = 0
        L_0x00dc:
            com.google.android.gms.internal.measurement.g7 r7 = r6.f5179b
            com.google.android.gms.internal.measurement.c2 r7 = (com.google.android.gms.internal.measurement.c2) r7
            int r7 = r7.t()
            if (r1 >= r7) goto L_0x012c
            com.google.android.gms.internal.measurement.g7 r7 = r6.f5179b
            com.google.android.gms.internal.measurement.c2 r7 = (com.google.android.gms.internal.measurement.c2) r7
            com.google.android.gms.internal.measurement.e2 r7 = r7.x(r1)
            r18 = r6
            java.lang.String r6 = r7.x()
            r19 = r5
            java.lang.String[] r5 = ag.d.f409d
            r20 = r10
            java.lang.String[] r10 = ag.d.f410e
            java.lang.String r5 = b1.b.p(r6, r5, r10)
            if (r5 == 0) goto L_0x0123
            com.google.android.gms.internal.measurement.c7 r3 = r7.j()
            com.google.android.gms.internal.measurement.d2 r3 = (com.google.android.gms.internal.measurement.d2) r3
            r3.l()
            com.google.android.gms.internal.measurement.g7 r6 = r3.f5179b
            com.google.android.gms.internal.measurement.e2 r6 = (com.google.android.gms.internal.measurement.e2) r6
            com.google.android.gms.internal.measurement.e2.y(r6, r5)
            com.google.android.gms.internal.measurement.g7 r3 = r3.j()
            com.google.android.gms.internal.measurement.e2 r3 = (com.google.android.gms.internal.measurement.e2) r3
            r4.l()
            com.google.android.gms.internal.measurement.g7 r5 = r4.f5179b
            com.google.android.gms.internal.measurement.c2 r5 = (com.google.android.gms.internal.measurement.c2) r5
            com.google.android.gms.internal.measurement.c2.C(r5, r1, r3)
            r3 = 1
        L_0x0123:
            int r1 = r1 + 1
            r6 = r18
            r5 = r19
            r10 = r20
            goto L_0x00dc
        L_0x012c:
            r19 = r5
            r20 = r10
            if (r3 == 0) goto L_0x014b
            r15.l()
            com.google.android.gms.internal.measurement.g7 r1 = r15.f5179b
            com.google.android.gms.internal.measurement.a2 r1 = (com.google.android.gms.internal.measurement.a2) r1
            com.google.android.gms.internal.measurement.g7 r3 = r4.j()
            com.google.android.gms.internal.measurement.c2 r3 = (com.google.android.gms.internal.measurement.c2) r3
            com.google.android.gms.internal.measurement.a2.C(r1, r13, r3)
            com.google.android.gms.internal.measurement.g7 r1 = r15.j()
            com.google.android.gms.internal.measurement.a2 r1 = (com.google.android.gms.internal.measurement.a2) r1
            r9.set(r14, r1)
        L_0x014b:
            int r13 = r13 + 1
            r1 = r29
            r3 = r32
            r4 = r33
            r6 = r16
            r7 = r17
            r5 = r19
            r10 = r20
            goto L_0x0097
        L_0x015d:
            r19 = r5
            goto L_0x0164
        L_0x0160:
            r19 = r5
            r16 = r6
        L_0x0164:
            r17 = r7
            r20 = r10
            com.google.android.gms.internal.measurement.g7 r1 = r15.f5179b
            com.google.android.gms.internal.measurement.a2 r1 = (com.google.android.gms.internal.measurement.a2) r1
            int r1 = r1.v()
            if (r1 == 0) goto L_0x01bf
            r1 = 0
        L_0x0173:
            com.google.android.gms.internal.measurement.g7 r3 = r15.f5179b
            com.google.android.gms.internal.measurement.a2 r3 = (com.google.android.gms.internal.measurement.a2) r3
            int r3 = r3.v()
            if (r1 >= r3) goto L_0x01bf
            com.google.android.gms.internal.measurement.g7 r3 = r15.f5179b
            com.google.android.gms.internal.measurement.a2 r3 = (com.google.android.gms.internal.measurement.a2) r3
            com.google.android.gms.internal.measurement.k2 r3 = r3.y(r1)
            java.lang.String r4 = r3.x()
            java.lang.String[] r5 = gc.b.J
            java.lang.String[] r6 = gc.b.K
            java.lang.String r4 = b1.b.p(r4, r5, r6)
            if (r4 == 0) goto L_0x01bc
            com.google.android.gms.internal.measurement.c7 r3 = r3.j()
            com.google.android.gms.internal.measurement.j2 r3 = (com.google.android.gms.internal.measurement.j2) r3
            r3.l()
            com.google.android.gms.internal.measurement.g7 r5 = r3.f5179b
            com.google.android.gms.internal.measurement.k2 r5 = (com.google.android.gms.internal.measurement.k2) r5
            com.google.android.gms.internal.measurement.k2.y(r5, r4)
            r15.l()
            com.google.android.gms.internal.measurement.g7 r4 = r15.f5179b
            com.google.android.gms.internal.measurement.a2 r4 = (com.google.android.gms.internal.measurement.a2) r4
            com.google.android.gms.internal.measurement.g7 r3 = r3.j()
            com.google.android.gms.internal.measurement.k2 r3 = (com.google.android.gms.internal.measurement.k2) r3
            com.google.android.gms.internal.measurement.a2.B(r4, r1, r3)
            com.google.android.gms.internal.measurement.g7 r3 = r15.j()
            com.google.android.gms.internal.measurement.a2 r3 = (com.google.android.gms.internal.measurement.a2) r3
            r9.set(r14, r3)
        L_0x01bc:
            int r1 = r1 + 1
            goto L_0x0173
        L_0x01bf:
            int r14 = r14 + 1
            r1 = r29
            r3 = r32
            r4 = r33
            r6 = r16
            r7 = r17
            r5 = r19
            r10 = r20
            goto L_0x007a
        L_0x01d1:
            r19 = r5
            r16 = r6
            r17 = r7
            r20 = r10
            r8.j()
            r8.i()
            u6.q.f(r30)
            android.database.sqlite.SQLiteDatabase r1 = r8.B()
            r1.beginTransaction()
            r8.j()     // Catch:{ all -> 0x063c }
            r8.i()     // Catch:{ all -> 0x063c }
            u6.q.f(r30)     // Catch:{ all -> 0x063c }
            android.database.sqlite.SQLiteDatabase r3 = r8.B()     // Catch:{ all -> 0x063c }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x063c }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x063c }
            r3.delete(r12, r0, r5)     // Catch:{ all -> 0x063c }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x063c }
            r5[r6] = r2     // Catch:{ all -> 0x063c }
            r3.delete(r11, r0, r5)     // Catch:{ all -> 0x063c }
            java.util.Iterator r3 = r9.iterator()     // Catch:{ all -> 0x063c }
        L_0x020a:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x063c }
            q7.k4 r6 = r8.f13121a
            if (r0 == 0) goto L_0x04ab
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x04a6 }
            com.google.android.gms.internal.measurement.a2 r0 = (com.google.android.gms.internal.measurement.a2) r0     // Catch:{ all -> 0x04a6 }
            r8.j()     // Catch:{ all -> 0x04a6 }
            r8.i()     // Catch:{ all -> 0x04a6 }
            u6.q.f(r30)     // Catch:{ all -> 0x04a6 }
            u6.q.i(r0)     // Catch:{ all -> 0x04a6 }
            boolean r7 = r0.D()     // Catch:{ all -> 0x04a6 }
            if (r7 != 0) goto L_0x023d
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x063c }
            q7.s2 r0 = r6.E     // Catch:{ all -> 0x063c }
            q7.x3.l(r0)     // Catch:{ all -> 0x063c }
            q7.q2 r0 = r0.E     // Catch:{ all -> 0x063c }
            java.lang.String r4 = "Audience with no ID. appId"
            q7.r2 r5 = q7.s2.r(r30)     // Catch:{ all -> 0x063c }
            r0.c(r5, r4)     // Catch:{ all -> 0x063c }
            goto L_0x020a
        L_0x023d:
            int r7 = r0.t()     // Catch:{ all -> 0x04a6 }
            java.util.List r10 = r0.z()     // Catch:{ all -> 0x04a6 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x04a6 }
        L_0x0249:
            boolean r13 = r10.hasNext()     // Catch:{ all -> 0x04a6 }
            if (r13 == 0) goto L_0x0272
            java.lang.Object r13 = r10.next()     // Catch:{ all -> 0x063c }
            com.google.android.gms.internal.measurement.c2 r13 = (com.google.android.gms.internal.measurement.c2) r13     // Catch:{ all -> 0x063c }
            boolean r13 = r13.H()     // Catch:{ all -> 0x063c }
            if (r13 != 0) goto L_0x0249
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x063c }
            q7.s2 r0 = r6.E     // Catch:{ all -> 0x063c }
            q7.x3.l(r0)     // Catch:{ all -> 0x063c }
            q7.q2 r0 = r0.E     // Catch:{ all -> 0x063c }
            java.lang.String r4 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            q7.r2 r5 = q7.s2.r(r30)     // Catch:{ all -> 0x063c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x063c }
            r0.d(r5, r6, r4)     // Catch:{ all -> 0x063c }
            goto L_0x020a
        L_0x0272:
            com.google.android.gms.internal.measurement.l7 r10 = r0.A()     // Catch:{ all -> 0x04a6 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x04a6 }
        L_0x027a:
            boolean r13 = r10.hasNext()     // Catch:{ all -> 0x04a6 }
            if (r13 == 0) goto L_0x02a4
            java.lang.Object r13 = r10.next()     // Catch:{ all -> 0x063c }
            com.google.android.gms.internal.measurement.k2 r13 = (com.google.android.gms.internal.measurement.k2) r13     // Catch:{ all -> 0x063c }
            boolean r13 = r13.C()     // Catch:{ all -> 0x063c }
            if (r13 != 0) goto L_0x027a
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x063c }
            q7.s2 r0 = r6.E     // Catch:{ all -> 0x063c }
            q7.x3.l(r0)     // Catch:{ all -> 0x063c }
            q7.q2 r0 = r0.E     // Catch:{ all -> 0x063c }
            java.lang.String r4 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            q7.r2 r5 = q7.s2.r(r30)     // Catch:{ all -> 0x063c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x063c }
            r0.d(r5, r6, r4)     // Catch:{ all -> 0x063c }
            goto L_0x020a
        L_0x02a4:
            java.util.List r10 = r0.z()     // Catch:{ all -> 0x04a6 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x04a6 }
        L_0x02ac:
            boolean r13 = r10.hasNext()     // Catch:{ all -> 0x04a6 }
            java.lang.String r14 = "data"
            java.lang.String r15 = "session_scoped"
            java.lang.String r4 = "filter_id"
            java.lang.String r5 = "audience_id"
            r25 = r3
            java.lang.String r3 = "app_id"
            if (r13 == 0) goto L_0x0391
            java.lang.Object r13 = r10.next()     // Catch:{ all -> 0x04a6 }
            com.google.android.gms.internal.measurement.c2 r13 = (com.google.android.gms.internal.measurement.c2) r13     // Catch:{ all -> 0x04a6 }
            r8.j()     // Catch:{ all -> 0x04a6 }
            r8.i()     // Catch:{ all -> 0x04a6 }
            u6.q.f(r30)     // Catch:{ all -> 0x04a6 }
            u6.q.i(r13)     // Catch:{ all -> 0x04a6 }
            java.lang.String r26 = r13.z()     // Catch:{ all -> 0x04a6 }
            boolean r26 = r26.isEmpty()     // Catch:{ all -> 0x04a6 }
            if (r26 == 0) goto L_0x0308
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x063c }
            q7.s2 r0 = r6.E     // Catch:{ all -> 0x063c }
            q7.x3.l(r0)     // Catch:{ all -> 0x063c }
            q7.q2 r0 = r0.E     // Catch:{ all -> 0x063c }
            java.lang.String r3 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            q7.r2 r4 = q7.s2.r(r30)     // Catch:{ all -> 0x063c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x063c }
            boolean r6 = r13.H()     // Catch:{ all -> 0x063c }
            if (r6 == 0) goto L_0x02fc
            int r6 = r13.u()     // Catch:{ all -> 0x063c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x063c }
            goto L_0x02fd
        L_0x02fc:
            r6 = 0
        L_0x02fd:
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x063c }
            r0.e(r3, r4, r5, r6)     // Catch:{ all -> 0x063c }
            r27 = r1
            goto L_0x046f
        L_0x0308:
            r26 = r10
            byte[] r10 = r13.e()     // Catch:{ all -> 0x04a6 }
            r27 = r1
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0638 }
            r1.<init>()     // Catch:{ all -> 0x0638 }
            r1.put(r3, r2)     // Catch:{ all -> 0x0638 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0638 }
            r1.put(r5, r3)     // Catch:{ all -> 0x0638 }
            boolean r3 = r13.H()     // Catch:{ all -> 0x0638 }
            if (r3 == 0) goto L_0x032e
            int r3 = r13.u()     // Catch:{ all -> 0x0638 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0638 }
            goto L_0x032f
        L_0x032e:
            r3 = 0
        L_0x032f:
            r1.put(r4, r3)     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "event_name"
            java.lang.String r4 = r13.z()     // Catch:{ all -> 0x0638 }
            r1.put(r3, r4)     // Catch:{ all -> 0x0638 }
            boolean r3 = r13.I()     // Catch:{ all -> 0x0638 }
            if (r3 == 0) goto L_0x034a
            boolean r3 = r13.F()     // Catch:{ all -> 0x0638 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0638 }
            goto L_0x034b
        L_0x034a:
            r3 = 0
        L_0x034b:
            r1.put(r15, r3)     // Catch:{ all -> 0x0638 }
            r1.put(r14, r10)     // Catch:{ all -> 0x0638 }
            android.database.sqlite.SQLiteDatabase r3 = r8.B()     // Catch:{ SQLiteException -> 0x037c }
            r4 = 5
            r5 = 0
            long r3 = r3.insertWithOnConflict(r11, r5, r1, r4)     // Catch:{ SQLiteException -> 0x037c }
            r13 = -1
            int r1 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0374
            r1 = r6
            q7.x3 r1 = (q7.x3) r1     // Catch:{ SQLiteException -> 0x037c }
            q7.s2 r1 = r1.E     // Catch:{ SQLiteException -> 0x037c }
            q7.x3.l(r1)     // Catch:{ SQLiteException -> 0x037c }
            q7.q2 r1 = r1.B     // Catch:{ SQLiteException -> 0x037c }
            java.lang.String r3 = "Failed to insert event filter (got -1). appId"
            q7.r2 r4 = q7.s2.r(r30)     // Catch:{ SQLiteException -> 0x037c }
            r1.c(r4, r3)     // Catch:{ SQLiteException -> 0x037c }
        L_0x0374:
            r3 = r25
            r10 = r26
            r1 = r27
            goto L_0x02ac
        L_0x037c:
            r0 = move-exception
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x0638 }
            q7.s2 r1 = r6.E     // Catch:{ all -> 0x0638 }
            q7.x3.l(r1)     // Catch:{ all -> 0x0638 }
            q7.q2 r1 = r1.B     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "Error storing event filter. appId"
            q7.r2 r4 = q7.s2.r(r30)     // Catch:{ all -> 0x0638 }
            r1.d(r4, r0, r3)     // Catch:{ all -> 0x0638 }
            goto L_0x046f
        L_0x0391:
            r27 = r1
            com.google.android.gms.internal.measurement.l7 r0 = r0.A()     // Catch:{ all -> 0x0638 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0638 }
        L_0x039b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0638 }
            if (r1 == 0) goto L_0x049c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0638 }
            com.google.android.gms.internal.measurement.k2 r1 = (com.google.android.gms.internal.measurement.k2) r1     // Catch:{ all -> 0x0638 }
            r8.j()     // Catch:{ all -> 0x0638 }
            r8.i()     // Catch:{ all -> 0x0638 }
            u6.q.f(r30)     // Catch:{ all -> 0x0638 }
            u6.q.i(r1)     // Catch:{ all -> 0x0638 }
            java.lang.String r10 = r1.x()     // Catch:{ all -> 0x0638 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x0638 }
            if (r10 == 0) goto L_0x03e9
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x0638 }
            q7.s2 r0 = r6.E     // Catch:{ all -> 0x0638 }
            q7.x3.l(r0)     // Catch:{ all -> 0x0638 }
            q7.q2 r0 = r0.E     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            q7.r2 r4 = q7.s2.r(r30)     // Catch:{ all -> 0x0638 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0638 }
            boolean r6 = r1.C()     // Catch:{ all -> 0x0638 }
            if (r6 == 0) goto L_0x03df
            int r1 = r1.t()     // Catch:{ all -> 0x0638 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0638 }
            goto L_0x03e0
        L_0x03df:
            r1 = 0
        L_0x03e0:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0638 }
            r0.e(r3, r4, r5, r1)     // Catch:{ all -> 0x0638 }
            goto L_0x046f
        L_0x03e9:
            byte[] r10 = r1.e()     // Catch:{ all -> 0x0638 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x0638 }
            r13.<init>()     // Catch:{ all -> 0x0638 }
            r13.put(r3, r2)     // Catch:{ all -> 0x0638 }
            r26 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0638 }
            r13.put(r5, r0)     // Catch:{ all -> 0x0638 }
            boolean r0 = r1.C()     // Catch:{ all -> 0x0638 }
            if (r0 == 0) goto L_0x040d
            int r0 = r1.t()     // Catch:{ all -> 0x0638 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0638 }
            goto L_0x040e
        L_0x040d:
            r0 = 0
        L_0x040e:
            r13.put(r4, r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = "property_name"
            r28 = r3
            java.lang.String r3 = r1.x()     // Catch:{ all -> 0x0638 }
            r13.put(r0, r3)     // Catch:{ all -> 0x0638 }
            boolean r0 = r1.D()     // Catch:{ all -> 0x0638 }
            if (r0 == 0) goto L_0x042b
            boolean r0 = r1.B()     // Catch:{ all -> 0x0638 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0638 }
            goto L_0x042c
        L_0x042b:
            r0 = 0
        L_0x042c:
            r13.put(r15, r0)     // Catch:{ all -> 0x0638 }
            r13.put(r14, r10)     // Catch:{ all -> 0x0638 }
            android.database.sqlite.SQLiteDatabase r0 = r8.B()     // Catch:{ SQLiteException -> 0x045c }
            r1 = 0
            r3 = 5
            long r23 = r0.insertWithOnConflict(r12, r1, r13, r3)     // Catch:{ SQLiteException -> 0x045c }
            r21 = -1
            int r0 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x0456
            r0 = r6
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteException -> 0x045c }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteException -> 0x045c }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x045c }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteException -> 0x045c }
            java.lang.String r1 = "Failed to insert property filter (got -1). appId"
            q7.r2 r3 = q7.s2.r(r30)     // Catch:{ SQLiteException -> 0x045c }
            r0.c(r3, r1)     // Catch:{ SQLiteException -> 0x045c }
            goto L_0x046f
        L_0x0456:
            r0 = r26
            r3 = r28
            goto L_0x039b
        L_0x045c:
            r0 = move-exception
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x0638 }
            q7.s2 r1 = r6.E     // Catch:{ all -> 0x0638 }
            q7.x3.l(r1)     // Catch:{ all -> 0x0638 }
            q7.q2 r1 = r1.B     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "Error storing property filter. appId"
            q7.r2 r4 = q7.s2.r(r30)     // Catch:{ all -> 0x0638 }
            r1.d(r4, r0, r3)     // Catch:{ all -> 0x0638 }
        L_0x046f:
            r8.j()     // Catch:{ all -> 0x0638 }
            r8.i()     // Catch:{ all -> 0x0638 }
            u6.q.f(r30)     // Catch:{ all -> 0x0638 }
            android.database.sqlite.SQLiteDatabase r0 = r8.B()     // Catch:{ all -> 0x0638 }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0638 }
            r4 = 0
            r3[r4] = r2     // Catch:{ all -> 0x0638 }
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0638 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0638 }
            r5 = r20
            r0.delete(r12, r5, r3)     // Catch:{ all -> 0x0638 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0638 }
            r1[r4] = r2     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0638 }
            r1[r6] = r3     // Catch:{ all -> 0x0638 }
            r0.delete(r11, r5, r1)     // Catch:{ all -> 0x0638 }
            goto L_0x049e
        L_0x049c:
            r5 = r20
        L_0x049e:
            r20 = r5
            r3 = r25
            r1 = r27
            goto L_0x020a
        L_0x04a6:
            r0 = move-exception
            r27 = r1
            goto L_0x0639
        L_0x04ab:
            r27 = r1
            r1 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0638 }
            r0.<init>()     // Catch:{ all -> 0x0638 }
            java.util.Iterator r3 = r9.iterator()     // Catch:{ all -> 0x0638 }
        L_0x04b7:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0638 }
            if (r4 == 0) goto L_0x04d7
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0638 }
            com.google.android.gms.internal.measurement.a2 r4 = (com.google.android.gms.internal.measurement.a2) r4     // Catch:{ all -> 0x0638 }
            boolean r5 = r4.D()     // Catch:{ all -> 0x0638 }
            if (r5 == 0) goto L_0x04d2
            int r4 = r4.t()     // Catch:{ all -> 0x0638 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0638 }
            goto L_0x04d3
        L_0x04d2:
            r5 = r1
        L_0x04d3:
            r0.add(r5)     // Catch:{ all -> 0x0638 }
            goto L_0x04b7
        L_0x04d7:
            u6.q.f(r30)     // Catch:{ all -> 0x0638 }
            r8.j()     // Catch:{ all -> 0x0638 }
            r8.i()     // Catch:{ all -> 0x0638 }
            android.database.sqlite.SQLiteDatabase r1 = r8.B()     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "select count(1) from audience_filter_values where app_id=?"
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0573 }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x0573 }
            long r3 = r8.w(r3, r5)     // Catch:{ SQLiteException -> 0x0573 }
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x0638 }
            q7.f r5 = r6.C     // Catch:{ all -> 0x0638 }
            q7.f2 r6 = q7.g2.G     // Catch:{ all -> 0x0638 }
            int r5 = r5.l(r2, r6)     // Catch:{ all -> 0x0638 }
            r6 = 2000(0x7d0, float:2.803E-42)
            int r5 = java.lang.Math.min(r6, r5)     // Catch:{ all -> 0x0638 }
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)     // Catch:{ all -> 0x0638 }
            long r6 = (long) r5     // Catch:{ all -> 0x0638 }
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x050c
            goto L_0x0586
        L_0x050c:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0638 }
            r3.<init>()     // Catch:{ all -> 0x0638 }
            r4 = 0
        L_0x0512:
            int r6 = r0.size()     // Catch:{ all -> 0x0638 }
            if (r4 >= r6) goto L_0x052e
            java.lang.Object r6 = r0.get(r4)     // Catch:{ all -> 0x0638 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0638 }
            if (r6 == 0) goto L_0x0586
            int r6 = r6.intValue()     // Catch:{ all -> 0x0638 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0638 }
            r3.add(r6)     // Catch:{ all -> 0x0638 }
            int r4 = r4 + 1
            goto L_0x0512
        L_0x052e:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r3)     // Catch:{ all -> 0x0638 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0638 }
            r3.<init>()     // Catch:{ all -> 0x0638 }
            java.lang.String r4 = "("
            r3.append(r4)     // Catch:{ all -> 0x0638 }
            r3.append(r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "audience_filter_values"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0638 }
            r4.<init>()     // Catch:{ all -> 0x0638 }
            java.lang.String r6 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r4.append(r6)     // Catch:{ all -> 0x0638 }
            r4.append(r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r4.append(r0)     // Catch:{ all -> 0x0638 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0638 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0638 }
            r6 = 0
            r4[r6] = r2     // Catch:{ all -> 0x0638 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0638 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0638 }
            r1.delete(r3, r0, r4)     // Catch:{ all -> 0x0638 }
            goto L_0x0586
        L_0x0573:
            r0 = move-exception
            q7.x3 r6 = (q7.x3) r6     // Catch:{ all -> 0x0638 }
            q7.s2 r1 = r6.E     // Catch:{ all -> 0x0638 }
            q7.x3.l(r1)     // Catch:{ all -> 0x0638 }
            q7.q2 r1 = r1.B     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "Database error querying filters. appId"
            q7.r2 r4 = q7.s2.r(r30)     // Catch:{ all -> 0x0638 }
            r1.d(r4, r0, r3)     // Catch:{ all -> 0x0638 }
        L_0x0586:
            r27.setTransactionSuccessful()     // Catch:{ all -> 0x0638 }
            r27.endTransaction()
            r19.l()     // Catch:{ RuntimeException -> 0x05a7 }
            r1 = r19
            com.google.android.gms.internal.measurement.g7 r0 = r1.f5179b     // Catch:{ RuntimeException -> 0x05a5 }
            com.google.android.gms.internal.measurement.t2 r0 = (com.google.android.gms.internal.measurement.t2) r0     // Catch:{ RuntimeException -> 0x05a5 }
            com.google.android.gms.internal.measurement.t2.J(r0)     // Catch:{ RuntimeException -> 0x05a5 }
            com.google.android.gms.internal.measurement.g7 r0 = r1.j()     // Catch:{ RuntimeException -> 0x05a5 }
            com.google.android.gms.internal.measurement.t2 r0 = (com.google.android.gms.internal.measurement.t2) r0     // Catch:{ RuntimeException -> 0x05a5 }
            byte[] r0 = r0.e()     // Catch:{ RuntimeException -> 0x05a5 }
            r3 = r29
            goto L_0x05c2
        L_0x05a5:
            r0 = move-exception
            goto L_0x05aa
        L_0x05a7:
            r0 = move-exception
            r1 = r19
        L_0x05aa:
            r3 = r29
            q7.k4 r4 = r3.f13121a
            q7.x3 r4 = (q7.x3) r4
            q7.s2 r4 = r4.E
            q7.x3.l(r4)
            q7.r2 r5 = q7.s2.r(r30)
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            q7.q2 r4 = r4.E
            r4.d(r5, r0, r6)
            r0 = r31
        L_0x05c2:
            r4 = r17
            q7.k r4 = r4.f13350c
            q7.t6.H(r4)
            q7.k4 r5 = r4.f13121a
            u6.q.f(r30)
            r4.i()
            r4.j()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "remote_config"
            r6.put(r7, r0)
            java.lang.String r0 = "config_last_modified_time"
            r7 = r32
            r6.put(r0, r7)
            java.lang.String r0 = "e_tag"
            r7 = r33
            r6.put(r0, r7)
            android.database.sqlite.SQLiteDatabase r0 = r4.B()     // Catch:{ SQLiteException -> 0x0619 }
            java.lang.String r4 = "apps"
            java.lang.String r7 = "app_id = ?"
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0619 }
            r9 = 0
            r8[r9] = r2     // Catch:{ SQLiteException -> 0x0619 }
            int r0 = r0.update(r4, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0619 }
            long r6 = (long) r0     // Catch:{ SQLiteException -> 0x0619 }
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x062c
            r0 = r5
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteException -> 0x0619 }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteException -> 0x0619 }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x0619 }
            q7.q2 r0 = r0.B     // Catch:{ SQLiteException -> 0x0619 }
            java.lang.String r4 = "Failed to update remote config (got 0). appId"
            q7.r2 r6 = q7.s2.r(r30)     // Catch:{ SQLiteException -> 0x0619 }
            r0.c(r6, r4)     // Catch:{ SQLiteException -> 0x0619 }
            goto L_0x062c
        L_0x0619:
            r0 = move-exception
            q7.x3 r5 = (q7.x3) r5
            q7.s2 r4 = r5.E
            q7.x3.l(r4)
            q7.r2 r5 = q7.s2.r(r30)
            java.lang.String r6 = "Error storing remote config. appId"
            q7.q2 r4 = r4.B
            r4.d(r5, r0, r6)
        L_0x062c:
            com.google.android.gms.internal.measurement.g7 r0 = r1.j()
            com.google.android.gms.internal.measurement.t2 r0 = (com.google.android.gms.internal.measurement.t2) r0
            r1 = r16
            r1.put(r2, r0)
            return
        L_0x0638:
            r0 = move-exception
        L_0x0639:
            r3 = r29
            goto L_0x0641
        L_0x063c:
            r0 = move-exception
            r3 = r29
            r27 = r1
        L_0x0641:
            r27.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.r3.w(java.lang.String, byte[], java.lang.String, java.lang.String):void");
    }
}
