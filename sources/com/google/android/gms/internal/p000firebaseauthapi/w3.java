package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w3  reason: invalid package */
public final class w3 {

    /* renamed from: c  reason: collision with root package name */
    public static final w3 f5030c = new w3();

    /* renamed from: a  reason: collision with root package name */
    public final h3 f5031a = new h3();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f5032b = new ConcurrentHashMap();

    public final z3 a(Class cls) {
        s3 s3Var;
        Class cls2;
        Charset charset = u2.f4974a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f5032b;
            z3 z3Var = (z3) concurrentHashMap.get(cls);
            if (z3Var == null) {
                h3 h3Var = this.f5031a;
                h3Var.getClass();
                Class cls3 = a4.f4371a;
                Class<p2> cls4 = p2.class;
                if (cls4.isAssignableFrom(cls) || (cls2 = a4.f4371a) == null || cls2.isAssignableFrom(cls)) {
                    m3 zzb = h3Var.f4609a.zzb(cls);
                    if (zzb.zzb()) {
                        if (cls4.isAssignableFrom(cls)) {
                            s3Var = new s3(a4.f4374d, g2.f4564a, zzb.zza());
                        } else {
                            k4 k4Var = a4.f4372b;
                            d2 d2Var = g2.f4565b;
                            if (d2Var != null) {
                                s3Var = new s3(k4Var, d2Var, zzb.zza());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        z3Var = s3Var;
                    } else {
                        boolean z10 = false;
                        if (cls4.isAssignableFrom(cls)) {
                            if (zzb.zzc() == 1) {
                                z10 = true;
                            }
                            if (z10) {
                                int i8 = u3.f4976a;
                                c3 c3Var = d3.f4479b;
                                m4 m4Var = a4.f4374d;
                                e2 e2Var = g2.f4564a;
                                int i10 = l3.f4702a;
                                z3Var = r3.C(zzb, c3Var, m4Var, e2Var);
                            } else {
                                int i11 = u3.f4976a;
                                c3 c3Var2 = d3.f4479b;
                                m4 m4Var2 = a4.f4374d;
                                int i12 = l3.f4702a;
                                z3Var = r3.C(zzb, c3Var2, m4Var2, (d2) null);
                            }
                        } else {
                            if (zzb.zzc() == 1) {
                                z10 = true;
                            }
                            if (z10) {
                                int i13 = u3.f4976a;
                                b3 b3Var = d3.f4478a;
                                k4 k4Var2 = a4.f4372b;
                                d2 d2Var2 = g2.f4565b;
                                if (d2Var2 != null) {
                                    int i14 = l3.f4702a;
                                    z3Var = r3.C(zzb, b3Var, k4Var2, d2Var2);
                                } else {
                                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                int i15 = u3.f4976a;
                                b3 b3Var2 = d3.f4478a;
                                k4 k4Var3 = a4.f4373c;
                                int i16 = l3.f4702a;
                                z3Var = r3.C(zzb, b3Var2, k4Var3, (d2) null);
                            }
                        }
                    }
                    z3 z3Var2 = (z3) concurrentHashMap.putIfAbsent(cls, z3Var);
                    return z3Var2 == null ? z3Var : z3Var2;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        throw new NullPointerException("messageType");
    }
}
