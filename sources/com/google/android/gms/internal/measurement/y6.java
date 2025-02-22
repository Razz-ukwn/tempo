package com.google.android.gms.internal.measurement;

public enum y6 {
    DOUBLE_LIST_PACKED(35, 3, r13),
    SINT64_LIST_PACKED(48, 3, r28);
    

    /* renamed from: d  reason: collision with root package name */
    public static final y6[] f5603d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f5605a;

    /* access modifiers changed from: public */
    static {
        f5603d = new y6[r1];
        for (y6 y6Var : values()) {
            f5603d[y6Var.f5605a] = y6Var;
        }
    }

    /* access modifiers changed from: public */
    y6(int i8, int i10, p7 p7Var) {
        this.f5605a = i8;
        p7 p7Var2 = p7.VOID;
        int i11 = i10 - 1;
        if (i11 == 1) {
            p7Var.getClass();
        } else if (i11 == 3) {
            p7Var.getClass();
        }
        if (i10 == 1) {
            p7Var.ordinal();
        }
    }

    public final int zza() {
        return this.f5605a;
    }
}
