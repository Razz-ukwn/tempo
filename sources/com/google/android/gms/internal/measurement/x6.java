package com.google.android.gms.internal.measurement;

import cb.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class x6 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f5582c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final u8 f5583a = new u8(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f5584b;

    static {
        new x6(0);
    }

    public x6() {
    }

    public static final void c(w6 w6Var, Object obj) {
        boolean z10;
        s9 zzb = w6Var.zzb();
        Charset charset = m7.f5399a;
        obj.getClass();
        s9[] s9VarArr = s9.f5519b;
        t9 t9Var = t9.INT;
        switch (zzb.f5520a.ordinal()) {
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
                if ((obj instanceof k6) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof h8) {
                    return;
                }
                break;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(w6Var.zza()), w6Var.zzb().f5520a, obj.getClass().getName()}));
    }

    public final void a() {
        if (!this.f5584b) {
            int i8 = 0;
            while (true) {
                u8 u8Var = this.f5583a;
                if (i8 < u8Var.b()) {
                    Map.Entry entry = (Map.Entry) u8Var.f5153b.get(i8);
                    if (entry.getValue() instanceof g7) {
                        g7 g7Var = (g7) entry.getValue();
                        g7Var.getClass();
                        p8.f5471c.a(g7Var.getClass()).zzf(g7Var);
                        g7Var.o();
                    }
                    i8++;
                } else {
                    u8Var.a();
                    this.f5584b = true;
                    return;
                }
            }
        }
    }

    public final void b(w6 w6Var, Object obj) {
        if (!w6Var.zzc()) {
            c(w6Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                c(w6Var, arrayList.get(i8));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f5583a.put(w6Var, obj);
    }

    public final Object clone() {
        u8 u8Var;
        x6 x6Var = new x6();
        int i8 = 0;
        while (true) {
            u8Var = this.f5583a;
            if (i8 >= u8Var.b()) {
                break;
            }
            Map.Entry entry = (Map.Entry) u8Var.f5153b.get(i8);
            x6Var.b((w6) entry.getKey(), entry.getValue());
            i8++;
        }
        for (Map.Entry entry2 : u8Var.f5154c.isEmpty() ? b.f3882c : u8Var.f5154c.entrySet()) {
            x6Var.b((w6) entry2.getKey(), entry2.getValue());
        }
        return x6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        return this.f5583a.equals(((x6) obj).f5583a);
    }

    public final int hashCode() {
        return this.f5583a.hashCode();
    }

    public x6(int i8) {
        a();
        a();
    }
}
