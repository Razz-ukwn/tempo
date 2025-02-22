package com.google.firebase.auth;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.CopyOnWriteArrayList;
import m9.f;
import r9.m;
import s9.a0;
import s9.b0;
import s9.d0;
import s9.k;
import s9.x;
import s9.y;
import u6.q;

public abstract class FirebaseAuth implements s9.b {

    /* renamed from: a  reason: collision with root package name */
    public final f f6305a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f6306b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f6307c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList f6308d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final com.google.android.gms.internal.p000firebaseauthapi.a f6309e;

    /* renamed from: f  reason: collision with root package name */
    public m f6310f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f6311g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Object f6312h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public String f6313i;

    /* renamed from: j  reason: collision with root package name */
    public x f6314j;

    /* renamed from: k  reason: collision with root package name */
    public final RecaptchaAction f6315k = RecaptchaAction.custom("getOobCode");

    /* renamed from: l  reason: collision with root package name */
    public final RecaptchaAction f6316l = RecaptchaAction.custom("signInWithPassword");
    public final y m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f6317n;

    /* renamed from: o  reason: collision with root package name */
    public final qa.b f6318o;

    /* renamed from: p  reason: collision with root package name */
    public final qa.b f6319p;

    /* renamed from: q  reason: collision with root package name */
    public a0 f6320q;

    /* renamed from: r  reason: collision with root package name */
    public final b0 f6321r;

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseAuth(m9.f r12, qa.b r13, qa.b r14) {
        /*
            r11 = this;
            com.google.android.gms.internal.firebase-auth-api.a r0 = new com.google.android.gms.internal.firebase-auth-api.a
            r0.<init>(r12)
            s9.y r1 = new s9.y
            r12.a()
            android.content.Context r2 = r12.f11331a
            java.lang.String r3 = r12.f()
            r1.<init>(r2, r3)
            s9.d0 r2 = s9.d0.f14821b
            s9.e0 r3 = s9.e0.f14823a
            r11.<init>()
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r11.f6306b = r4
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r11.f6307c = r4
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList
            r4.<init>()
            r11.f6308d = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r11.f6311g = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r11.f6312h = r4
            java.lang.String r4 = "getOobCode"
            com.google.android.recaptcha.RecaptchaAction r4 = com.google.android.recaptcha.RecaptchaAction.custom(r4)
            r11.f6315k = r4
            java.lang.String r4 = "signInWithPassword"
            com.google.android.recaptcha.RecaptchaAction r4 = com.google.android.recaptcha.RecaptchaAction.custom(r4)
            r11.f6316l = r4
            java.lang.String r4 = "signUpPassword"
            com.google.android.recaptcha.RecaptchaAction.custom(r4)
            s9.b0 r4 = s9.b0.f14816b
            r11.f6321r = r4
            r11.f6305a = r12
            r11.f6309e = r0
            r11.m = r1
            u6.q.i(r2)
            r11.f6317n = r2
            u6.q.i(r3)
            r11.f6318o = r13
            r11.f6319p = r14
            java.lang.String r12 = "type"
            android.content.SharedPreferences r13 = r1.f14875a
            java.lang.String r14 = "com.google.firebase.auth.FIREBASE_USER"
            r0 = 0
            java.lang.String r13 = r13.getString(r14, r0)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 == 0) goto L_0x007a
            goto L_0x0096
        L_0x007a:
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0096 }
            r14.<init>(r13)     // Catch:{ Exception -> 0x0096 }
            boolean r13 = r14.has(r12)     // Catch:{ Exception -> 0x0096 }
            if (r13 == 0) goto L_0x0096
            java.lang.String r12 = r14.optString(r12)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r13 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            boolean r12 = r13.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x0096 }
            if (r12 == 0) goto L_0x0096
            s9.p0 r12 = r1.a(r14)     // Catch:{ Exception -> 0x0096 }
            goto L_0x0097
        L_0x0096:
            r12 = r0
        L_0x0097:
            r11.f6310f = r12
            r13 = 0
            r14 = 1
            if (r12 == 0) goto L_0x00c5
            s9.y r1 = r11.m
            r1.getClass()
            java.lang.Object[] r2 = new java.lang.Object[r14]
            s9.m0 r12 = r12.f14858b
            java.lang.String r12 = r12.f14848a
            r2[r13] = r12
            java.lang.String r12 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r12 = java.lang.String.format(r12, r2)
            android.content.SharedPreferences r1 = r1.f14875a
            java.lang.String r12 = r1.getString(r12, r0)
            if (r12 == 0) goto L_0x00bd
            com.google.android.gms.internal.firebase-auth-api.m0 r12 = com.google.android.gms.internal.p000firebaseauthapi.m0.w(r12)
            goto L_0x00be
        L_0x00bd:
            r12 = r0
        L_0x00be:
            if (r12 == 0) goto L_0x00c5
            r9.m r1 = r11.f6310f
            d(r11, r1, r12, r13, r13)
        L_0x00c5:
            s9.d0 r12 = r11.f6317n
            s9.r r12 = r12.f14822a
            r12.getClass()
            m9.f r12 = r11.f6305a
            r12.a()
            android.content.Context r12 = r12.f11331a
            java.lang.String r1 = "com.google.firebase.auth.internal.ProcessDeathHelper"
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r1, r13)
            java.lang.String r1 = "firebaseAppName"
            java.lang.String r2 = ""
            java.lang.String r1 = r12.getString(r1, r2)
            m9.f r2 = r11.f6305a
            r2.a()
            java.lang.String r2 = r2.f11332b
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00f0
            goto L_0x0420
        L_0x00f0:
            java.lang.String r1 = "verifyAssertionRequest"
            boolean r1 = r12.contains(r1)
            r2 = 0
            if (r1 == 0) goto L_0x03c4
            java.lang.String r1 = "verifyAssertionRequest"
            java.lang.String r4 = ""
            java.lang.String r1 = r12.getString(r1, r4)
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.v0> r4 = com.google.android.gms.internal.p000firebaseauthapi.v0.CREATOR
            if (r1 != 0) goto L_0x0108
            r1 = r0
            goto L_0x010e
        L_0x0108:
            r5 = 10
            byte[] r1 = android.util.Base64.decode(r1, r5)
        L_0x010e:
            u6.q.i(r4)
            android.os.Parcel r5 = android.os.Parcel.obtain()
            int r6 = r1.length
            r5.unmarshall(r1, r13, r6)
            r5.setDataPosition(r13)
            java.lang.Object r1 = r4.createFromParcel(r5)
            v6.c r1 = (v6.c) r1
            r5.recycle()
            com.google.android.gms.internal.firebase-auth-api.v0 r1 = (com.google.android.gms.internal.p000firebaseauthapi.v0) r1
            java.lang.String r4 = "operation"
            java.lang.String r5 = ""
            java.lang.String r4 = r12.getString(r4, r5)
            java.lang.String r5 = "tenantId"
            java.lang.String r5 = r12.getString(r5, r0)
            java.lang.String r6 = "firebaseUserUid"
            java.lang.String r7 = ""
            java.lang.String r6 = r12.getString(r6, r7)
            java.lang.String r7 = "timestamp"
            r12.getLong(r7, r2)
            if (r5 == 0) goto L_0x0153
            u6.q.f(r5)
            java.lang.Object r2 = r11.f6312h
            monitor-enter(r2)
            r11.f6313i = r5     // Catch:{ all -> 0x0150 }
            monitor-exit(r2)     // Catch:{ all -> 0x0150 }
            r1.J = r5
            goto L_0x0153
        L_0x0150:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0150 }
            throw r12
        L_0x0153:
            int r2 = r4.hashCode()
            r3 = -98509410(0xfffffffffa20dd9e, float:-2.088156E35)
            r5 = 2
            if (r2 == r3) goto L_0x017c
            r3 = 175006864(0xa6e6490, float:1.1478197E-32)
            if (r2 == r3) goto L_0x0172
            r3 = 1450464913(0x56745691, float:6.7163159E13)
            if (r2 == r3) goto L_0x0168
            goto L_0x0186
        L_0x0168:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0186
            r2 = r13
            goto L_0x0187
        L_0x0172:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_LINK"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0186
            r2 = r14
            goto L_0x0187
        L_0x017c:
            java.lang.String r2 = "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0186
            r2 = r5
            goto L_0x0187
        L_0x0186:
            r2 = -1
        L_0x0187:
            r3 = 17072(0x42b0, float:2.3923E-41)
            if (r2 == 0) goto L_0x0316
            if (r2 == r14) goto L_0x0266
            if (r2 == r5) goto L_0x0191
            goto L_0x03c0
        L_0x0191:
            r9.m r2 = r11.f6310f
            java.lang.String r2 = r2.z()
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x03c0
            r9.m r8 = r11.f6310f
            r9.g0 r1 = r9.g0.x(r1)
            u6.q.i(r8)
            r9.b r1 = r1.w()
            boolean r2 = r1 instanceof r9.c
            if (r2 == 0) goto L_0x021b
            r9.c r1 = (r9.c) r1
            java.lang.String r2 = r1.f14114b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "password"
            if (r2 != 0) goto L_0x01bc
            r2 = r4
            goto L_0x01be
        L_0x01bc:
            java.lang.String r2 = "emailLink"
        L_0x01be:
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x01df
            java.lang.String r6 = r1.f14113a
            java.lang.String r9 = r1.f14114b
            u6.q.f(r9)
            java.lang.String r13 = r8.y()
            r7 = 1
            r9.l0 r14 = new r9.l0
            r4 = r14
            r5 = r11
            r10 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.google.android.recaptcha.RecaptchaAction r0 = r11.f6316l
            r14.b(r11, r13, r0)
            goto L_0x03c0
        L_0x01df:
            java.lang.String r2 = r1.f14115c
            u6.q.f(r2)
            int r4 = r9.a.f14110c
            u6.q.f(r2)
            r9.a r4 = new r9.a     // Catch:{ IllegalArgumentException -> 0x01ef }
            r4.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x01ef }
            goto L_0x01f0
        L_0x01ef:
            r4 = r0
        L_0x01f0:
            if (r4 == 0) goto L_0x01fd
            java.lang.String r2 = r11.f6313i
            java.lang.String r4 = r4.f14112b
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 != 0) goto L_0x01fd
            r13 = r14
        L_0x01fd:
            if (r13 == 0) goto L_0x020d
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status
            r13.<init>(r3, r0)
            m9.g r13 = com.google.android.gms.internal.p000firebaseauthapi.d.a(r13)
            com.google.android.gms.tasks.Tasks.forException(r13)
            goto L_0x03c0
        L_0x020d:
            r9.m0 r13 = new r9.m0
            r13.<init>(r11, r14, r8, r1)
            com.google.android.recaptcha.RecaptchaAction r14 = r11.f6315k
            java.lang.String r0 = r11.f6313i
            r13.b(r11, r0, r14)
            goto L_0x03c0
        L_0x021b:
            boolean r13 = r1 instanceof r9.r
            m9.f r14 = r11.f6305a
            com.google.android.gms.internal.firebase-auth-api.a r0 = r11.f6309e
            if (r13 == 0) goto L_0x0247
            r9.r r1 = (r9.r) r1
            java.lang.String r13 = r11.f6313i
            r9.x r2 = new r9.x
            r2.<init>(r11)
            r0.getClass()
            o.a r3 = com.google.android.gms.internal.p000firebaseauthapi.z.f5113a
            r3.clear()
            com.google.android.gms.internal.firebase-auth-api.yh r3 = new com.google.android.gms.internal.firebase-auth-api.yh
            r3.<init>(r1, r13)
            r3.d(r14)
            r3.f4929d = r8
            r3.f4930e = r2
            r3.f4931f = r2
            r0.a(r3)
            goto L_0x03c0
        L_0x0247:
            java.lang.String r13 = r8.y()
            r9.x r2 = new r9.x
            r2.<init>(r11)
            r0.getClass()
            com.google.android.gms.internal.firebase-auth-api.ai r3 = new com.google.android.gms.internal.firebase-auth-api.ai
            r3.<init>(r1, r13)
            r3.d(r14)
            r3.f4929d = r8
            r3.f4930e = r2
            r3.f4931f = r2
            r0.a(r3)
            goto L_0x03c0
        L_0x0266:
            r9.m r13 = r11.f6310f
            java.lang.String r13 = r13.z()
            boolean r13 = r13.equals(r6)
            if (r13 == 0) goto L_0x03c0
            r9.m r13 = r11.f6310f
            r9.g0 r1 = r9.g0.x(r1)
            u6.q.i(r13)
            r9.b r1 = r1.w()
            r9.x r2 = new r9.x
            r2.<init>(r11)
            com.google.android.gms.internal.firebase-auth-api.a r3 = r11.f6309e
            r3.getClass()
            m9.f r4 = r11.f6305a
            u6.q.i(r4)
            java.util.List r5 = r13.G()
            if (r5 == 0) goto L_0x02b0
            r6 = r1
            r9.g0 r6 = (r9.g0) r6
            java.lang.String r6 = r6.f14124a
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02a0
            goto L_0x02b0
        L_0x02a0:
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status
            r14 = 17015(0x4277, float:2.3843E-41)
            r13.<init>(r14, r0)
            m9.g r13 = com.google.android.gms.internal.p000firebaseauthapi.d.a(r13)
            com.google.android.gms.tasks.Tasks.forException(r13)
            goto L_0x03c0
        L_0x02b0:
            boolean r0 = r1 instanceof r9.c
            if (r0 == 0) goto L_0x02e5
            r9.c r1 = (r9.c) r1
            java.lang.String r0 = r1.f14115c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r14 = r14 ^ r0
            if (r14 != 0) goto L_0x02d2
            com.google.android.gms.internal.firebase-auth-api.ai r14 = new com.google.android.gms.internal.firebase-auth-api.ai
            r14.<init>(r1)
            r14.d(r4)
            r14.f4929d = r13
            r14.f4930e = r2
            r14.f4931f = r2
            r3.a(r14)
            goto L_0x03c0
        L_0x02d2:
            com.google.android.gms.internal.firebase-auth-api.zh r14 = new com.google.android.gms.internal.firebase-auth-api.zh
            r14.<init>((r9.c) r1)
            r14.d(r4)
            r14.f4929d = r13
            r14.f4930e = r2
            r14.f4931f = r2
            r3.a(r14)
            goto L_0x03c0
        L_0x02e5:
            boolean r14 = r1 instanceof r9.r
            if (r14 == 0) goto L_0x0303
            r9.r r1 = (r9.r) r1
            o.a r14 = com.google.android.gms.internal.p000firebaseauthapi.z.f5113a
            r14.clear()
            com.google.android.gms.internal.firebase-auth-api.bi r14 = new com.google.android.gms.internal.firebase-auth-api.bi
            r14.<init>(r1)
            r14.d(r4)
            r14.f4929d = r13
            r14.f4930e = r2
            r14.f4931f = r2
            r3.a(r14)
            goto L_0x03c0
        L_0x0303:
            com.google.android.gms.internal.firebase-auth-api.di r14 = new com.google.android.gms.internal.firebase-auth-api.di
            r14.<init>(r1)
            r14.d(r4)
            r14.f4929d = r13
            r14.f4930e = r2
            r14.f4931f = r2
            r3.a(r14)
            goto L_0x03c0
        L_0x0316:
            r9.g0 r1 = r9.g0.x(r1)
            r9.b r1 = r1.w()
            boolean r2 = r1 instanceof r9.c
            if (r2 == 0) goto L_0x0382
            r9.c r1 = (r9.c) r1
            java.lang.String r2 = r1.f14115c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ r14
            if (r2 != 0) goto L_0x0347
            java.lang.String r6 = r1.f14113a
            java.lang.String r9 = r1.f14114b
            u6.q.i(r9)
            java.lang.String r13 = r11.f6313i
            r8 = 0
            r7 = 0
            r9.l0 r14 = new r9.l0
            r4 = r14
            r5 = r11
            r10 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.google.android.recaptcha.RecaptchaAction r0 = r11.f6316l
            r14.b(r11, r13, r0)
            goto L_0x03c0
        L_0x0347:
            java.lang.String r2 = r1.f14115c
            u6.q.f(r2)
            int r4 = r9.a.f14110c
            u6.q.f(r2)
            r9.a r4 = new r9.a     // Catch:{ IllegalArgumentException -> 0x0357 }
            r4.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0357 }
            goto L_0x0358
        L_0x0357:
            r4 = r0
        L_0x0358:
            if (r4 == 0) goto L_0x0365
            java.lang.String r2 = r11.f6313i
            java.lang.String r4 = r4.f14112b
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 != 0) goto L_0x0365
            goto L_0x0366
        L_0x0365:
            r14 = r13
        L_0x0366:
            if (r14 == 0) goto L_0x0375
            com.google.android.gms.common.api.Status r13 = new com.google.android.gms.common.api.Status
            r13.<init>(r3, r0)
            m9.g r13 = com.google.android.gms.internal.p000firebaseauthapi.d.a(r13)
            com.google.android.gms.tasks.Tasks.forException(r13)
            goto L_0x03c0
        L_0x0375:
            r9.m0 r14 = new r9.m0
            r14.<init>(r11, r13, r0, r1)
            com.google.android.recaptcha.RecaptchaAction r13 = r11.f6315k
            java.lang.String r0 = r11.f6313i
            r14.b(r11, r0, r13)
            goto L_0x03c0
        L_0x0382:
            boolean r13 = r1 instanceof r9.r
            m9.f r14 = r11.f6305a
            com.google.android.gms.internal.firebase-auth-api.a r0 = r11.f6309e
            if (r13 == 0) goto L_0x03a9
            r9.r r1 = (r9.r) r1
            java.lang.String r13 = r11.f6313i
            r9.w r2 = new r9.w
            r2.<init>(r11)
            r0.getClass()
            o.a r3 = com.google.android.gms.internal.p000firebaseauthapi.z.f5113a
            r3.clear()
            com.google.android.gms.internal.firebase-auth-api.bi r3 = new com.google.android.gms.internal.firebase-auth-api.bi
            r3.<init>(r1, r13)
            r3.d(r14)
            r3.f4930e = r2
            r0.a(r3)
            goto L_0x03c0
        L_0x03a9:
            java.lang.String r13 = r11.f6313i
            r9.w r2 = new r9.w
            r2.<init>(r11)
            r0.getClass()
            com.google.android.gms.internal.firebase-auth-api.zh r3 = new com.google.android.gms.internal.firebase-auth-api.zh
            r3.<init>(r1, r13)
            r3.d(r14)
            r3.f4930e = r2
            r0.a(r3)
        L_0x03c0:
            s9.r.a(r12)
            goto L_0x0420
        L_0x03c4:
            java.lang.String r13 = "recaptchaToken"
            boolean r13 = r12.contains(r13)
            if (r13 == 0) goto L_0x03f4
            java.lang.String r13 = "recaptchaToken"
            java.lang.String r14 = ""
            java.lang.String r13 = r12.getString(r13, r14)
            java.lang.String r14 = "operation"
            java.lang.String r0 = ""
            java.lang.String r14 = r12.getString(r14, r0)
            java.lang.String r0 = "timestamp"
            r12.getLong(r0, r2)
            r14.getClass()
            java.lang.String r0 = "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L_0x03ed
            goto L_0x03f0
        L_0x03ed:
            com.google.android.gms.tasks.Tasks.forResult(r13)
        L_0x03f0:
            s9.r.a(r12)
            goto L_0x0420
        L_0x03f4:
            java.lang.String r13 = "statusCode"
            boolean r13 = r12.contains(r13)
            if (r13 == 0) goto L_0x0420
            java.lang.String r13 = "statusCode"
            r14 = 17062(0x42a6, float:2.3909E-41)
            int r13 = r12.getInt(r13, r14)
            java.lang.String r14 = "statusMessage"
            java.lang.String r0 = ""
            java.lang.String r14 = r12.getString(r14, r0)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r13, r14)
            java.lang.String r13 = "timestamp"
            r12.getLong(r13, r2)
            s9.r.a(r12)
            m9.g r12 = com.google.android.gms.internal.p000firebaseauthapi.d.a(r0)
            com.google.android.gms.tasks.Tasks.forException(r12)
        L_0x0420:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(m9.f, qa.b, qa.b):void");
    }

    public static void b(FirebaseAuth firebaseAuth, m mVar) {
        if (mVar != null) {
            String z10 = mVar.z();
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + z10 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f6321r.execute(new b(firebaseAuth));
    }

    public static void c(FirebaseAuth firebaseAuth, m mVar) {
        if (mVar != null) {
            String z10 = mVar.z();
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + z10 + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.f6321r.execute(new a(firebaseAuth, new va.b(mVar != null ? mVar.E() : null)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:41|42|43|44|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x012c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(com.google.firebase.auth.FirebaseAuth r17, r9.m r18, com.google.android.gms.internal.p000firebaseauthapi.m0 r19, boolean r20, boolean r21) {
        /*
            r0 = r17
            r1 = r19
            u6.q.i(r18)
            u6.q.i(r19)
            r9.m r2 = r0.f6310f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0022
            java.lang.String r2 = r18.z()
            r9.m r5 = r0.f6310f
            java.lang.String r5 = r5.z()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0022
            r2 = r4
            goto L_0x0023
        L_0x0022:
            r2 = r3
        L_0x0023:
            if (r2 != 0) goto L_0x0029
            if (r21 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            return
        L_0x0029:
            r9.m r5 = r0.f6310f
            if (r5 != 0) goto L_0x0030
            r2 = r4
            r5 = r2
            goto L_0x0045
        L_0x0030:
            com.google.android.gms.internal.firebase-auth-api.m0 r5 = r5.D()
            java.lang.String r5 = r5.f4724b
            java.lang.String r6 = r1.f4724b
            boolean r5 = r5.equals(r6)
            r5 = r5 ^ r4
            if (r2 == 0) goto L_0x0043
            if (r5 != 0) goto L_0x0043
            r5 = r3
            goto L_0x0044
        L_0x0043:
            r5 = r4
        L_0x0044:
            r2 = r2 ^ r4
        L_0x0045:
            r9.m r6 = r0.f6310f
            if (r6 != 0) goto L_0x004e
            r7 = r18
            r0.f6310f = r7
            goto L_0x006f
        L_0x004e:
            r7 = r18
            java.util.List r8 = r18.x()
            r6.C(r8)
            boolean r6 = r18.A()
            if (r6 != 0) goto L_0x0062
            r9.m r6 = r0.f6310f
            r6.B()
        L_0x0062:
            r3.s r6 = r18.w()
            java.util.ArrayList r6 = r6.a()
            r9.m r8 = r0.f6310f
            r8.I(r6)
        L_0x006f:
            if (r20 == 0) goto L_0x0195
            s9.y r6 = r0.m
            r9.m r8 = r0.f6310f
            x6.a r9 = r6.f14876b
            u6.q.i(r8)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.Class r11 = r8.getClass()
            java.lang.Class<s9.p0> r12 = s9.p0.class
            boolean r11 = r12.isAssignableFrom(r11)
            if (r11 == 0) goto L_0x017c
            s9.p0 r8 = (s9.p0) r8
            java.lang.String r11 = "cachedTokenState"
            java.lang.String r12 = r8.F()     // Catch:{ Exception -> 0x0167 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r11 = "applicationName"
            java.lang.String r12 = r8.f14859c     // Catch:{ Exception -> 0x0167 }
            m9.f r12 = m9.f.e(r12)     // Catch:{ Exception -> 0x0167 }
            r12.a()     // Catch:{ Exception -> 0x0167 }
            java.lang.String r12 = r12.f11332b     // Catch:{ Exception -> 0x0167 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r11 = "type"
            java.lang.String r12 = "com.google.firebase.auth.internal.DefaultFirebaseUser"
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0167 }
            java.util.List r11 = r8.f14861e     // Catch:{ Exception -> 0x0167 }
            if (r11 == 0) goto L_0x00fc
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ Exception -> 0x0167 }
            r11.<init>()     // Catch:{ Exception -> 0x0167 }
            java.util.List r12 = r8.f14861e     // Catch:{ Exception -> 0x0167 }
            int r13 = r12.size()     // Catch:{ Exception -> 0x0167 }
            int r14 = r12.size()     // Catch:{ Exception -> 0x0167 }
            r15 = 30
            if (r14 <= r15) goto L_0x00e4
            java.lang.String r13 = "Provider user info list size larger than max size, truncating list to %d. Actual list size: %d"
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0167 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0167 }
            r14[r3] = r16     // Catch:{ Exception -> 0x0167 }
            int r16 = r12.size()     // Catch:{ Exception -> 0x0167 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0167 }
            r14[r4] = r16     // Catch:{ Exception -> 0x0167 }
            java.lang.String r15 = r9.f16968a     // Catch:{ Exception -> 0x0167 }
            java.lang.String r13 = r9.d(r13, r14)     // Catch:{ Exception -> 0x0167 }
            android.util.Log.w(r15, r13)     // Catch:{ Exception -> 0x0167 }
            r13 = 30
        L_0x00e4:
            r14 = r3
        L_0x00e5:
            if (r14 >= r13) goto L_0x00f7
            java.lang.Object r15 = r12.get(r14)     // Catch:{ Exception -> 0x0167 }
            s9.m0 r15 = (s9.m0) r15     // Catch:{ Exception -> 0x0167 }
            java.lang.String r15 = r15.w()     // Catch:{ Exception -> 0x0167 }
            r11.put(r15)     // Catch:{ Exception -> 0x0167 }
            int r14 = r14 + 1
            goto L_0x00e5
        L_0x00f7:
            java.lang.String r12 = "userInfos"
            r10.put(r12, r11)     // Catch:{ Exception -> 0x0167 }
        L_0x00fc:
            java.lang.String r11 = "anonymous"
            boolean r12 = r8.A()     // Catch:{ Exception -> 0x0167 }
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r11 = "version"
            java.lang.String r12 = "2"
            r10.put(r11, r12)     // Catch:{ Exception -> 0x0167 }
            s9.d r11 = r8.E     // Catch:{ Exception -> 0x0167 }
            if (r11 == 0) goto L_0x0130
            java.lang.String r12 = "userMetadata"
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x0167 }
            r13.<init>()     // Catch:{ Exception -> 0x0167 }
            java.lang.String r14 = "lastSignInTimestamp"
            r21 = r5
            long r4 = r11.f14819a     // Catch:{ JSONException -> 0x012c }
            r13.put(r14, r4)     // Catch:{ JSONException -> 0x012c }
            java.lang.String r4 = "creationTimestamp"
            r14 = r4
            long r3 = r11.f14820b     // Catch:{ JSONException -> 0x012c }
            r11 = r14
            r13.put(r11, r3)     // Catch:{ JSONException -> 0x012c }
            goto L_0x012c
        L_0x012a:
            r21 = r5
        L_0x012c:
            r10.put(r12, r13)     // Catch:{ Exception -> 0x0167 }
            goto L_0x0132
        L_0x0130:
            r21 = r5
        L_0x0132:
            r3.s r3 = new r3.s     // Catch:{ Exception -> 0x0167 }
            r3.<init>((s9.p0) r8)     // Catch:{ Exception -> 0x0167 }
            java.util.ArrayList r3 = r3.a()     // Catch:{ Exception -> 0x0167 }
            boolean r4 = r3.isEmpty()     // Catch:{ Exception -> 0x0167 }
            if (r4 != 0) goto L_0x0162
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x0167 }
            r4.<init>()     // Catch:{ Exception -> 0x0167 }
            r8 = 0
        L_0x0147:
            int r11 = r3.size()     // Catch:{ Exception -> 0x0167 }
            if (r8 >= r11) goto L_0x015d
            java.lang.Object r11 = r3.get(r8)     // Catch:{ Exception -> 0x0167 }
            r9.p r11 = (r9.p) r11     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r11 = r11.w()     // Catch:{ Exception -> 0x0167 }
            r4.put(r11)     // Catch:{ Exception -> 0x0167 }
            int r8 = r8 + 1
            goto L_0x0147
        L_0x015d:
            java.lang.String r3 = "userMultiFactorInfo"
            r10.put(r3, r4)     // Catch:{ Exception -> 0x0167 }
        L_0x0162:
            java.lang.String r3 = r10.toString()     // Catch:{ Exception -> 0x0167 }
            goto L_0x017f
        L_0x0167:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r9.f16968a
            java.lang.String r3 = "Failed to turn object into JSON"
            java.lang.String r1 = r9.d(r3, r1)
            android.util.Log.wtf(r2, r1, r0)
            com.google.android.gms.internal.firebase-auth-api.oh r1 = new com.google.android.gms.internal.firebase-auth-api.oh
            r1.<init>(r0)
            throw r1
        L_0x017c:
            r21 = r5
            r3 = 0
        L_0x017f:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0197
            android.content.SharedPreferences r4 = r6.f14875a
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r6 = "com.google.firebase.auth.FIREBASE_USER"
            android.content.SharedPreferences$Editor r3 = r4.putString(r6, r3)
            r3.apply()
            goto L_0x0197
        L_0x0195:
            r21 = r5
        L_0x0197:
            if (r21 == 0) goto L_0x01a5
            r9.m r3 = r0.f6310f
            if (r3 == 0) goto L_0x01a0
            r3.H(r1)
        L_0x01a0:
            r9.m r3 = r0.f6310f
            c(r0, r3)
        L_0x01a5:
            if (r2 == 0) goto L_0x01ac
            r9.m r2 = r0.f6310f
            b(r0, r2)
        L_0x01ac:
            if (r20 == 0) goto L_0x01d4
            s9.y r2 = r0.m
            r2.getClass()
            android.content.SharedPreferences r2 = r2.f14875a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r18.z()
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.String r1 = r19.x()
            android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)
            r1.apply()
        L_0x01d4:
            r9.m r1 = r0.f6310f
            if (r1 == 0) goto L_0x0218
            s9.a0 r2 = r0.f6320q
            if (r2 != 0) goto L_0x01e8
            m9.f r2 = r0.f6305a
            u6.q.i(r2)
            s9.a0 r3 = new s9.a0
            r3.<init>(r2)
            r0.f6320q = r3
        L_0x01e8:
            s9.a0 r0 = r0.f6320q
            com.google.android.gms.internal.firebase-auth-api.m0 r1 = r1.D()
            r0.getClass()
            if (r1 != 0) goto L_0x01f4
            goto L_0x0218
        L_0x01f4:
            java.lang.Long r2 = r1.f4725c
            r3 = 0
            if (r2 != 0) goto L_0x01fc
            r5 = r3
            goto L_0x0200
        L_0x01fc:
            long r5 = r2.longValue()
        L_0x0200:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0206
            r5 = 3600(0xe10, double:1.7786E-320)
        L_0x0206:
            java.lang.Long r1 = r1.f4727e
            long r1 = r1.longValue()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r3
            long r5 = r5 + r1
            s9.k r0 = r0.f14815a
            r0.f14840a = r5
            r1 = -1
            r0.f14841b = r1
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.d(com.google.firebase.auth.FirebaseAuth, r9.m, com.google.android.gms.internal.firebase-auth-api.m0, boolean, boolean):void");
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) f.d().b(FirebaseAuth.class);
    }

    public final void a() {
        y yVar = this.m;
        q.i(yVar);
        m mVar = this.f6310f;
        SharedPreferences sharedPreferences = yVar.f14875a;
        if (mVar != null) {
            sharedPreferences.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{mVar.z()})).apply();
            this.f6310f = null;
        }
        sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        c(this, (m) null);
        b(this, (m) null);
        a0 a0Var = this.f6320q;
        if (a0Var != null) {
            k kVar = a0Var.f14815a;
            kVar.f14842c.removeCallbacks(kVar.f14843d);
        }
    }

    @Keep
    public static FirebaseAuth getInstance(f fVar) {
        return (FirebaseAuth) fVar.b(FirebaseAuth.class);
    }
}
