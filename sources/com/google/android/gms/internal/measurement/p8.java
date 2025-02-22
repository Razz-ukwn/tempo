package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class p8 {

    /* renamed from: c  reason: collision with root package name */
    public static final p8 f5471c = new p8();

    /* renamed from: a  reason: collision with root package name */
    public final a8 f5472a = new a8();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f5473b = new ConcurrentHashMap();

    public final s8 a(Class cls) {
        l8 l8Var;
        Class cls2;
        Charset charset = m7.f5399a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f5473b;
            s8 s8Var = (s8) concurrentHashMap.get(cls);
            if (s8Var == null) {
                a8 a8Var = this.f5472a;
                a8Var.getClass();
                Class cls3 = t8.f5528a;
                Class<g7> cls4 = g7.class;
                if (cls4.isAssignableFrom(cls) || (cls2 = t8.f5528a) == null || cls2.isAssignableFrom(cls)) {
                    f8 zzb = a8Var.f5151a.zzb(cls);
                    if (zzb.zzb()) {
                        if (cls4.isAssignableFrom(cls)) {
                            l8Var = new l8(t8.f5531d, v6.f5556a, zzb.zza());
                        } else {
                            d9 d9Var = t8.f5529b;
                            t6 t6Var = v6.f5557b;
                            if (t6Var != null) {
                                l8Var = new l8(d9Var, t6Var, zzb.zza());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        s8Var = l8Var;
                    } else {
                        boolean z10 = false;
                        if (cls4.isAssignableFrom(cls)) {
                            if (zzb.zzc() == 1) {
                                z10 = true;
                            }
                            if (z10) {
                                int i8 = n8.f5417a;
                                u7 u7Var = v7.f5559b;
                                f9 f9Var = t8.f5531d;
                                u6 u6Var = v6.f5556a;
                                int i10 = e8.f5258a;
                                s8Var = k8.x(zzb, u7Var, f9Var, u6Var);
                            } else {
                                int i11 = n8.f5417a;
                                u7 u7Var2 = v7.f5559b;
                                f9 f9Var2 = t8.f5531d;
                                int i12 = e8.f5258a;
                                s8Var = k8.x(zzb, u7Var2, f9Var2, (t6) null);
                            }
                        } else {
                            if (zzb.zzc() == 1) {
                                z10 = true;
                            }
                            if (z10) {
                                int i13 = n8.f5417a;
                                t7 t7Var = v7.f5558a;
                                d9 d9Var2 = t8.f5529b;
                                t6 t6Var2 = v6.f5557b;
                                if (t6Var2 != null) {
                                    int i14 = e8.f5258a;
                                    s8Var = k8.x(zzb, t7Var, d9Var2, t6Var2);
                                } else {
                                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                int i15 = n8.f5417a;
                                t7 t7Var2 = v7.f5558a;
                                d9 d9Var3 = t8.f5530c;
                                int i16 = e8.f5258a;
                                s8Var = k8.x(zzb, t7Var2, d9Var3, (t6) null);
                            }
                        }
                    }
                    s8 s8Var2 = (s8) concurrentHashMap.putIfAbsent(cls, s8Var);
                    return s8Var2 == null ? s8Var : s8Var2;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        throw new NullPointerException("messageType");
    }
}
