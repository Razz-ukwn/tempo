package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y3  reason: invalid package */
public final class y3 implements m3 {

    /* renamed from: a  reason: collision with root package name */
    public final o3 f5095a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5096b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f5097c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5098d;

    public y3(p2 p2Var, String str, Object[] objArr) {
        this.f5095a = p2Var;
        this.f5096b = str;
        this.f5097c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5098d = charAt;
            return;
        }
        char c3 = charAt & 8191;
        int i8 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                c3 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i10 = i11;
            } else {
                this.f5098d = c3 | (charAt2 << i8);
                return;
            }
        }
    }

    public final String a() {
        return this.f5096b;
    }

    public final Object[] b() {
        return this.f5097c;
    }

    public final o3 zza() {
        return this.f5095a;
    }

    public final boolean zzb() {
        return (this.f5098d & 2) == 2;
    }

    public final int zzc() {
        return (this.f5098d & 1) == 1 ? 1 : 2;
    }
}
