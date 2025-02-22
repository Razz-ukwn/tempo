package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i2  reason: invalid package */
public final class i2 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f4633c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final b4 f4634a = new b4(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f4635b;

    static {
        new i2(0);
    }

    public i2() {
    }

    public static final void c(h2 h2Var, Object obj) {
        boolean z10;
        z4 zzb = h2Var.zzb();
        Charset charset = u2.f4974a;
        obj.getClass();
        z4[] z4VarArr = z4.f5121b;
        a5 a5Var = a5.INT;
        switch (zzb.f5122a.ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                break;
            case 1:
                z10 = obj instanceof Long;
                break;
            case 2:
                z10 = obj instanceof Float;
                break;
            case 3:
                z10 = obj instanceof Double;
                break;
            case 4:
                z10 = obj instanceof Boolean;
                break;
            case 5:
                z10 = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof q1) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof r2)) {
                    return;
                }
            case 8:
                if (obj instanceof o3) {
                    return;
                }
                break;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(h2Var.zza()), h2Var.zzb().f5122a, obj.getClass().getName()}));
    }

    public final void a() {
        if (!this.f4635b) {
            int i8 = 0;
            while (true) {
                b4 b4Var = this.f4634a;
                if (i8 < b4Var.b()) {
                    Map.Entry entry = (Map.Entry) b4Var.f4611b.get(i8);
                    if (entry.getValue() instanceof p2) {
                        p2 p2Var = (p2) entry.getValue();
                        p2Var.getClass();
                        w3.f5030c.a(p2Var.getClass()).zzf(p2Var);
                        p2Var.e();
                    }
                    i8++;
                } else {
                    b4Var.a();
                    this.f4635b = true;
                    return;
                }
            }
        }
    }

    public final void b(h2 h2Var, Object obj) {
        if (!h2Var.zzc()) {
            c(h2Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                c(h2Var, arrayList.get(i8));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f4634a.put(h2Var, obj);
    }

    public final Object clone() {
        b4 b4Var;
        i2 i2Var = new i2();
        int i8 = 0;
        while (true) {
            b4Var = this.f4634a;
            if (i8 >= b4Var.b()) {
                break;
            }
            Map.Entry entry = (Map.Entry) b4Var.f4611b.get(i8);
            i2Var.b((h2) entry.getKey(), entry.getValue());
            i8++;
        }
        for (Map.Entry entry2 : b4Var.f4612c.isEmpty() ? g.f4558b : b4Var.f4612c.entrySet()) {
            i2Var.b((h2) entry2.getKey(), entry2.getValue());
        }
        return i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return this.f4634a.equals(((i2) obj).f4634a);
    }

    public final int hashCode() {
        return this.f4634a.hashCode();
    }

    public i2(int i8) {
        a();
        a();
    }
}
