package q7;

import com.google.android.gms.internal.measurement.f3;

public final class g7 {

    /* renamed from: a  reason: collision with root package name */
    public f3 f13089a;

    /* renamed from: b  reason: collision with root package name */
    public Long f13090b;

    /* renamed from: c  reason: collision with root package name */
    public long f13091c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f13092d;

    public /* synthetic */ g7(b bVar) {
        this.f13092d = bVar;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.io.Serializable] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        if (r2 == null) goto L_0x00f4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.f3 a(com.google.android.gms.internal.measurement.f3 r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r8 = r20
            r3 = r21
            java.lang.String r0 = r20.A()
            java.util.List r9 = r20.B()
            q7.b r2 = r1.f13092d
            q7.t6 r4 = r2.f13208b
            r4.O()
            java.lang.String r4 = "_eid"
            java.io.Serializable r5 = q7.v6.n(r8, r4)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x0209
            java.lang.String r6 = "_ep"
            boolean r6 = r0.equals(r6)
            q7.k4 r10 = r2.f13121a
            q7.t6 r11 = r2.f13208b
            if (r6 == 0) goto L_0x01c8
            r11.O()
            java.lang.String r0 = "_en"
            java.io.Serializable r0 = q7.v6.n(r8, r0)
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r2 = 0
            if (r0 == 0) goto L_0x004d
            q7.x3 r10 = (q7.x3) r10
            q7.s2 r0 = r10.E
            q7.x3.l(r0)
            java.lang.String r3 = "Extra parameter without an event name. eventId"
            q7.q2 r0 = r0.C
            r0.c(r5, r3)
            return r2
        L_0x004d:
            com.google.android.gms.internal.measurement.f3 r0 = r1.f13089a
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0065
            java.lang.Long r0 = r1.f13090b
            if (r0 == 0) goto L_0x0065
            long r15 = r5.longValue()
            java.lang.Long r0 = r1.f13090b
            long r17 = r0.longValue()
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0118
        L_0x0065:
            q7.k r0 = r11.f13350c
            q7.t6.H(r0)
            q7.k4 r15 = r0.f13121a
            r0.i()
            r0.j()
            android.database.sqlite.SQLiteDatabase r0 = r0.B()     // Catch:{ SQLiteException -> 0x00df, all -> 0x00db }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00df, all -> 0x00db }
            r12[r6] = r3     // Catch:{ SQLiteException -> 0x00df, all -> 0x00db }
            java.lang.String r13 = r5.toString()     // Catch:{ SQLiteException -> 0x00df, all -> 0x00db }
            r12[r7] = r13     // Catch:{ SQLiteException -> 0x00df, all -> 0x00db }
            android.database.Cursor r2 = r0.rawQuery(r2, r12)     // Catch:{ SQLiteException -> 0x00df, all -> 0x00db }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00c4 }
            if (r0 != 0) goto L_0x009d
            r0 = r15
            q7.x3 r0 = (q7.x3) r0     // Catch:{ SQLiteException -> 0x00c4 }
            q7.s2 r0 = r0.E     // Catch:{ SQLiteException -> 0x00c4 }
            q7.x3.l(r0)     // Catch:{ SQLiteException -> 0x00c4 }
            q7.q2 r0 = r0.J     // Catch:{ SQLiteException -> 0x00c4 }
            java.lang.String r12 = "Main event not found"
            r0.b(r12)     // Catch:{ SQLiteException -> 0x00c4 }
            goto L_0x00f1
        L_0x009d:
            byte[] r0 = r2.getBlob(r6)     // Catch:{ SQLiteException -> 0x00c4 }
            long r12 = r2.getLong(r7)     // Catch:{ SQLiteException -> 0x00c4 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x00c4 }
            com.google.android.gms.internal.measurement.e3 r13 = com.google.android.gms.internal.measurement.f3.x()     // Catch:{ IOException -> 0x00c6 }
            com.google.android.gms.internal.measurement.c7 r0 = q7.v6.A(r13, r0)     // Catch:{ IOException -> 0x00c6 }
            com.google.android.gms.internal.measurement.e3 r0 = (com.google.android.gms.internal.measurement.e3) r0     // Catch:{ IOException -> 0x00c6 }
            com.google.android.gms.internal.measurement.g7 r0 = r0.j()     // Catch:{ IOException -> 0x00c6 }
            com.google.android.gms.internal.measurement.f3 r0 = (com.google.android.gms.internal.measurement.f3) r0     // Catch:{ IOException -> 0x00c6 }
            android.util.Pair r0 = android.util.Pair.create(r0, r12)     // Catch:{ SQLiteException -> 0x00c4 }
            r2.close()
            goto L_0x00f5
        L_0x00c1:
            r0 = move-exception
            goto L_0x01c2
        L_0x00c4:
            r0 = move-exception
            goto L_0x00e1
        L_0x00c6:
            r0 = move-exception
            r12 = r15
            q7.x3 r12 = (q7.x3) r12     // Catch:{ SQLiteException -> 0x00c4 }
            q7.s2 r12 = r12.E     // Catch:{ SQLiteException -> 0x00c4 }
            q7.x3.l(r12)     // Catch:{ SQLiteException -> 0x00c4 }
            q7.q2 r12 = r12.B     // Catch:{ SQLiteException -> 0x00c4 }
            java.lang.String r13 = "Failed to merge main event. appId, eventId"
            q7.r2 r6 = q7.s2.r(r21)     // Catch:{ SQLiteException -> 0x00c4 }
            r12.e(r13, r6, r5, r0)     // Catch:{ SQLiteException -> 0x00c4 }
            goto L_0x00f1
        L_0x00db:
            r0 = move-exception
            r2 = 0
            goto L_0x01c2
        L_0x00df:
            r0 = move-exception
            r2 = 0
        L_0x00e1:
            q7.x3 r15 = (q7.x3) r15     // Catch:{ all -> 0x00c1 }
            q7.s2 r6 = r15.E     // Catch:{ all -> 0x00c1 }
            q7.x3.l(r6)     // Catch:{ all -> 0x00c1 }
            q7.q2 r6 = r6.B     // Catch:{ all -> 0x00c1 }
            java.lang.String r12 = "Error selecting main event"
            r6.c(r0, r12)     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x00f4
        L_0x00f1:
            r2.close()
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r2 = r0.first
            if (r2 != 0) goto L_0x00fd
            goto L_0x01b2
        L_0x00fd:
            com.google.android.gms.internal.measurement.f3 r2 = (com.google.android.gms.internal.measurement.f3) r2
            r1.f13089a = r2
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f13091c = r12
            r11.O()
            com.google.android.gms.internal.measurement.f3 r0 = r1.f13089a
            java.io.Serializable r0 = q7.v6.n(r0, r4)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f13090b = r0
        L_0x0118:
            long r12 = r1.f13091c
            r15 = -1
            long r12 = r12 + r15
            r1.f13091c = r12
            r15 = 0
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x015a
            q7.k r0 = r11.f13350c
            q7.t6.H(r0)
            r0.i()
            q7.k4 r2 = r0.f13121a
            q7.x3 r2 = (q7.x3) r2
            q7.s2 r4 = r2.E
            q7.x3.l(r4)
            java.lang.String r5 = "Clearing complex main event info. appId"
            q7.q2 r4 = r4.J
            r4.c(r3, r5)
            android.database.sqlite.SQLiteDatabase r0 = r0.B()     // Catch:{ SQLiteException -> 0x014c }
            java.lang.String r4 = "delete from main_event_params where app_id=?"
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x014c }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x014c }
            r0.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x014c }
            goto L_0x016b
        L_0x014c:
            r0 = move-exception
            q7.s2 r2 = r2.E
            q7.x3.l(r2)
            java.lang.String r3 = "Error clearing complex main event"
            q7.q2 r2 = r2.B
            r2.c(r0, r3)
            goto L_0x016b
        L_0x015a:
            q7.k r2 = r11.f13350c
            q7.t6.H(r2)
            long r6 = r1.f13091c
            com.google.android.gms.internal.measurement.f3 r0 = r1.f13089a
            r3 = r21
            r4 = r5
            r5 = r6
            r7 = r0
            r2.r(r3, r4, r5, r7)
        L_0x016b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.f3 r2 = r1.f13089a
            java.util.List r2 = r2.B()
            java.util.Iterator r2 = r2.iterator()
        L_0x017a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0197
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.j3 r3 = (com.google.android.gms.internal.measurement.j3) r3
            r11.O()
            java.lang.String r4 = r3.z()
            com.google.android.gms.internal.measurement.j3 r4 = q7.v6.m(r8, r4)
            if (r4 != 0) goto L_0x017a
            r0.add(r3)
            goto L_0x017a
        L_0x0197:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01a2
            r0.addAll(r9)
            r9 = r0
            goto L_0x01b0
        L_0x01a2:
            q7.x3 r10 = (q7.x3) r10
            q7.s2 r0 = r10.E
            q7.x3.l(r0)
            java.lang.String r2 = "No unique parameters in main event. eventName"
            q7.q2 r0 = r0.C
            r0.c(r14, r2)
        L_0x01b0:
            r0 = r14
            goto L_0x0209
        L_0x01b2:
            q7.x3 r10 = (q7.x3) r10
            q7.s2 r0 = r10.E
            q7.x3.l(r0)
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            q7.q2 r0 = r0.C
            r0.d(r14, r5, r2)
            r2 = 0
            return r2
        L_0x01c2:
            if (r2 == 0) goto L_0x01c7
            r2.close()
        L_0x01c7:
            throw r0
        L_0x01c8:
            r1.f13090b = r5
            r1.f13089a = r8
            r11.O()
            r6 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r4 = "_epc"
            java.io.Serializable r4 = q7.v6.n(r8, r4)
            if (r4 == 0) goto L_0x01de
            r2 = r4
        L_0x01de:
            java.lang.Long r2 = (java.lang.Long) r2
            long r12 = r2.longValue()
            r1.f13091c = r12
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x01f9
            q7.x3 r10 = (q7.x3) r10
            q7.s2 r2 = r10.E
            q7.x3.l(r2)
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            q7.q2 r2 = r2.C
            r2.c(r0, r3)
            goto L_0x0209
        L_0x01f9:
            q7.k r2 = r11.f13350c
            q7.t6.H(r2)
            long r6 = r1.f13091c
            r3 = r21
            r4 = r5
            r5 = r6
            r7 = r20
            r2.r(r3, r4, r5, r7)
        L_0x0209:
            com.google.android.gms.internal.measurement.c7 r2 = r20.j()
            com.google.android.gms.internal.measurement.e3 r2 = (com.google.android.gms.internal.measurement.e3) r2
            r2.l()
            com.google.android.gms.internal.measurement.g7 r3 = r2.f5179b
            com.google.android.gms.internal.measurement.f3 r3 = (com.google.android.gms.internal.measurement.f3) r3
            com.google.android.gms.internal.measurement.f3.H(r3, r0)
            r2.l()
            com.google.android.gms.internal.measurement.g7 r0 = r2.f5179b
            com.google.android.gms.internal.measurement.f3 r0 = (com.google.android.gms.internal.measurement.f3) r0
            com.google.android.gms.internal.measurement.f3.F(r0)
            r2.l()
            com.google.android.gms.internal.measurement.g7 r0 = r2.f5179b
            com.google.android.gms.internal.measurement.f3 r0 = (com.google.android.gms.internal.measurement.f3) r0
            com.google.android.gms.internal.measurement.f3.E(r0, r9)
            com.google.android.gms.internal.measurement.g7 r0 = r2.j()
            com.google.android.gms.internal.measurement.f3 r0 = (com.google.android.gms.internal.measurement.f3) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.g7.a(com.google.android.gms.internal.measurement.f3, java.lang.String):com.google.android.gms.internal.measurement.f3");
    }
}
