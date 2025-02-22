package pb;

import ag.g0;
import android.database.Cursor;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import mb.b;
import rf.p;

@e(c = "com.lassi.data.media.repository.MediaRepositoryImpl$fetchAndInsertMediaHelper$result$1", f = "MediaRepositoryImpl.kt", l = {445, 458}, m = "invokeSuspend")
public final class c extends i implements p<g0, d<? super b<? extends Boolean>>, Object> {
    public final /* synthetic */ long B;

    /* renamed from: a  reason: collision with root package name */
    public String[] f12537a;

    /* renamed from: b  reason: collision with root package name */
    public Cursor f12538b;

    /* renamed from: c  reason: collision with root package name */
    public h f12539c;

    /* renamed from: d  reason: collision with root package name */
    public int f12540d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h f12541e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(h hVar, long j10, d<? super c> dVar) {
        super(2, dVar);
        this.f12541e = hVar;
        this.B = j10;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f12541e, this.B, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[Catch:{ Exception -> 0x016e, all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cc A[Catch:{ Exception -> 0x016e, all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017e  */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            r1 = r30
            kf.a r0 = kf.a.f10464a
            int r2 = r1.f12540d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 == r5) goto L_0x0023
            if (r2 != r4) goto L_0x001b
            pb.h r2 = r1.f12539c
            android.database.Cursor r6 = r1.f12538b
            java.lang.String[] r7 = r1.f12537a
            cb.b.J(r31)     // Catch:{ Exception -> 0x0198 }
            r12 = r1
            goto L_0x0124
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0023:
            pb.h r2 = r1.f12539c
            android.database.Cursor r6 = r1.f12538b
            java.lang.String[] r7 = r1.f12537a
            cb.b.J(r31)     // Catch:{ Exception -> 0x0198 }
            r12 = r1
            goto L_0x0163
        L_0x002f:
            r0 = move-exception
            goto L_0x01aa
        L_0x0032:
            cb.b.J(r31)
            pb.h r2 = r1.f12541e
            java.lang.String[] r6 = pb.h.i(r2)
            long r7 = r1.B
            android.database.Cursor r7 = pb.h.j(r2, r6, r7)
            if (r7 == 0) goto L_0x01af
            boolean r8 = r7.moveToLast()     // Catch:{ Exception -> 0x019c, all -> 0x019a }
            if (r8 == 0) goto L_0x018c
            r12 = r1
            r14 = r6
            r15 = r7
        L_0x004c:
            r6 = 0
            r7 = r14[r6]     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            int r7 = r15.getColumnIndex(r7)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            long r17 = r15.getLong(r7)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r7 = r14[r5]     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            int r7 = r15.getColumnIndex(r7)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            java.lang.String r10 = r15.getString(r7)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r7 = r14[r4]     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            int r7 = r15.getColumnIndex(r7)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            java.lang.String r11 = r15.getString(r7)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r7 = 3
            r8 = r14[r7]     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            int r8 = r15.getColumnIndex(r8)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            java.lang.String r8 = r15.getString(r8)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            java.lang.String r9 = "_size"
            int r9 = r15.getColumnIndex(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            long r5 = r15.getLong(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            rb.a r9 = rb.a.V     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            int r13 = r9.F     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            if (r13 != r7) goto L_0x00a1
            r13 = 6
            r13 = r14[r13]     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            int r13 = r15.getColumnIndex(r13)     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            java.lang.String r13 = r15.getString(r13)     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            if (r13 == 0) goto L_0x0098
            java.lang.String r13 = pb.h.h(r2, r13)     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            goto L_0x00a3
        L_0x0098:
            r24 = r12
            r21 = r14
            r22 = r15
            r5 = 1
            goto L_0x0172
        L_0x00a1:
            java.lang.String r13 = ""
        L_0x00a3:
            r23 = r13
            int r9 = r9.F     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            if (r9 == r4) goto L_0x00b1
            if (r9 != r7) goto L_0x00ac
            goto L_0x00b1
        L_0x00ac:
            r19 = 0
        L_0x00ae:
            r21 = r19
            goto L_0x00bd
        L_0x00b1:
            r9 = 4
            r9 = r14[r9]     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            int r9 = r15.getColumnIndex(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            long r19 = r15.getLong(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            goto L_0x00ae
        L_0x00bd:
            java.lang.String r9 = "date_added"
            int r9 = r15.getColumnIndex(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            long r28 = r15.getLong(r9)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r2.getClass()     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            if (r11 == 0) goto L_0x00de
            int r9 = r11.length()     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            if (r9 != 0) goto L_0x00d4
            r9 = 1
            goto L_0x00d5
        L_0x00d4:
            r9 = 0
        L_0x00d5:
            if (r9 == 0) goto L_0x00d8
            goto L_0x00de
        L_0x00d8:
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x00de, all -> 0x016a }
            r9.<init>(r11)     // Catch:{ Exception -> 0x00de, all -> 0x016a }
            goto L_0x00df
        L_0x00de:
            r9 = r3
        L_0x00df:
            android.content.Context r13 = r2.f12561a     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r2.l(r13)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            if (r9 == 0) goto L_0x0098
            boolean r9 = r9.exists()     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            if (r9 == 0) goto L_0x0098
            rb.a r9 = rb.a.V     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            int r13 = r9.F     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            if (r13 == r4) goto L_0x0128
            if (r13 != r7) goto L_0x00f5
            goto L_0x0128
        L_0x00f5:
            boolean r5 = r2.m(r5)     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            if (r5 == 0) goto L_0x0098
            nb.b r5 = new nb.b     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            r24 = 0
            r26 = 0
            r27 = 96
            r16 = r5
            r19 = r10
            r20 = r11
            r16.<init>(r17, r19, r20, r21, r23, r24, r26, r27)     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            int r11 = r9.F     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            r12.f12537a = r14     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            r12.f12538b = r15     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            r12.f12539c = r2     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            r12.f12540d = r4     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            r6 = r2
            r7 = r8
            r8 = r5
            r9 = r28
            ff.m r5 = r6.k(r7, r8, r9, r11)     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            if (r5 != r0) goto L_0x0122
            return r0
        L_0x0122:
            r7 = r14
            r6 = r15
        L_0x0124:
            r15 = r6
            r14 = r7
            r5 = 1
            goto L_0x0178
        L_0x0128:
            java.lang.String r7 = "name"
            sf.j.e(r10, r7)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            java.lang.String r7 = "path"
            sf.j.e(r11, r7)     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            int r13 = r9.F     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r12.f12537a = r14     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r12.f12538b = r15     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r12.f12539c = r2     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r9 = 1
            r12.f12540d = r9     // Catch:{ Exception -> 0x016e, all -> 0x016a }
            r19 = r5
            r6 = r2
            r7 = r8
            r5 = r9
            r8 = r17
            r24 = r12
            r25 = r13
            r12 = r21
            r21 = r14
            r14 = r23
            r22 = r15
            r15 = r19
            r17 = r28
            r19 = r25
            ff.m r6 = pb.h.f(r6, r7, r8, r10, r11, r12, r14, r15, r17, r19)     // Catch:{ Exception -> 0x0168, all -> 0x0166 }
            if (r6 != r0) goto L_0x015d
            return r0
        L_0x015d:
            r7 = r21
            r6 = r22
            r12 = r24
        L_0x0163:
            r15 = r6
            r14 = r7
            goto L_0x0178
        L_0x0166:
            r0 = move-exception
            goto L_0x0186
        L_0x0168:
            r0 = move-exception
            goto L_0x0189
        L_0x016a:
            r0 = move-exception
            r22 = r15
            goto L_0x0186
        L_0x016e:
            r0 = move-exception
            r22 = r15
            goto L_0x0189
        L_0x0172:
            r14 = r21
            r15 = r22
            r12 = r24
        L_0x0178:
            boolean r6 = r15.moveToPrevious()     // Catch:{ Exception -> 0x0183, all -> 0x0180 }
            if (r6 != 0) goto L_0x004c
            r6 = r15
            goto L_0x018d
        L_0x0180:
            r0 = move-exception
            r7 = r15
            goto L_0x01ab
        L_0x0183:
            r0 = move-exception
            r6 = r15
            goto L_0x019e
        L_0x0186:
            r7 = r22
            goto L_0x01ab
        L_0x0189:
            r6 = r22
            goto L_0x019e
        L_0x018c:
            r6 = r7
        L_0x018d:
            mb.b$c r0 = new mb.b$c     // Catch:{ Exception -> 0x0198 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0198 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0198 }
            r6.close()
            return r0
        L_0x0198:
            r0 = move-exception
            goto L_0x019e
        L_0x019a:
            r0 = move-exception
            goto L_0x01ab
        L_0x019c:
            r0 = move-exception
            r6 = r7
        L_0x019e:
            r0.printStackTrace()     // Catch:{ all -> 0x002f }
            mb.b$a r2 = new mb.b$a     // Catch:{ all -> 0x002f }
            r2.<init>(r0)     // Catch:{ all -> 0x002f }
            r6.close()
            return r2
        L_0x01aa:
            r7 = r6
        L_0x01ab:
            r7.close()
            throw r0
        L_0x01af:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
