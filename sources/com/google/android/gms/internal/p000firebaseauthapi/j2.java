package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j2  reason: invalid package */
public enum j2 {
    DOUBLE_LIST_PACKED(35, 3, r13),
    SINT64_LIST_PACKED(48, 3, r28);
    

    /* renamed from: d  reason: collision with root package name */
    public static final j2[] f4656d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f4658a;

    /* access modifiers changed from: public */
    static {
        f4656d = new j2[r1];
        for (j2 j2Var : values()) {
            f4656d[j2Var.f4658a] = j2Var;
        }
    }

    /* access modifiers changed from: public */
    j2(int i8, int i10, x2 x2Var) {
        this.f4658a = i8;
        x2 x2Var2 = x2.VOID;
        int i11 = i10 - 1;
        if (i11 == 1) {
            x2Var.getClass();
        } else if (i11 == 3) {
            x2Var.getClass();
        }
        if (i10 == 1) {
            x2Var.ordinal();
        }
    }

    public final int zza() {
        return this.f4658a;
    }
}
