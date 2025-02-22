package com.google.android.gms.internal.measurement;

public final class r8 implements f8 {

    /* renamed from: a  reason: collision with root package name */
    public final h8 f5502a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5503b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f5504c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5505d;

    public r8(g7 g7Var, String str, Object[] objArr) {
        this.f5502a = g7Var;
        this.f5503b = str;
        this.f5504c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5505d = charAt;
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
                this.f5505d = c3 | (charAt2 << i8);
                return;
            }
        }
    }

    public final String a() {
        return this.f5503b;
    }

    public final Object[] b() {
        return this.f5504c;
    }

    public final h8 zza() {
        return this.f5502a;
    }

    public final boolean zzb() {
        return (this.f5505d & 2) == 2;
    }

    public final int zzc() {
        return (this.f5505d & 1) == 1 ? 1 : 2;
    }
}
