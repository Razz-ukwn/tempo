package ua;

import j0.e;
import q.g;

public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f15947a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15948b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15949c;

    public b(String str, long j10, int i8) {
        this.f15947a = str;
        this.f15948b = j10;
        this.f15949c = i8;
    }

    public final int a() {
        return this.f15949c;
    }

    public final String b() {
        return this.f15947a;
    }

    public final long c() {
        return this.f15948b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f15947a;
        if (str != null ? str.equals(fVar.b()) : fVar.b() == null) {
            if (this.f15948b == fVar.c()) {
                int i8 = this.f15949c;
                if (i8 == 0) {
                    if (fVar.a() == 0) {
                        return true;
                    }
                } else if (g.b(i8, fVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = 0;
        String str = this.f15947a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f15948b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        int i11 = this.f15949c;
        if (i11 != 0) {
            i8 = g.c(i11);
        }
        return i8 ^ i10;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f15947a + ", tokenExpirationTimestamp=" + this.f15948b + ", responseCode=" + e.g(this.f15949c) + "}";
    }
}
