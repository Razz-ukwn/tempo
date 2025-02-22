package ba;

import androidx.activity.g;
import ba.d0;

public final class z extends d0.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f3601a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3602b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3603c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3604d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3605e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3606f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3607g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3608h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3609i;

    public z(int i8, String str, int i10, long j10, long j11, boolean z10, int i11, String str2, String str3) {
        this.f3601a = i8;
        if (str != null) {
            this.f3602b = str;
            this.f3603c = i10;
            this.f3604d = j10;
            this.f3605e = j11;
            this.f3606f = z10;
            this.f3607g = i11;
            if (str2 != null) {
                this.f3608h = str2;
                if (str3 != null) {
                    this.f3609i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final int a() {
        return this.f3601a;
    }

    public final int b() {
        return this.f3603c;
    }

    public final long c() {
        return this.f3605e;
    }

    public final boolean d() {
        return this.f3606f;
    }

    public final String e() {
        return this.f3608h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.b)) {
            return false;
        }
        d0.b bVar = (d0.b) obj;
        return this.f3601a == bVar.a() && this.f3602b.equals(bVar.f()) && this.f3603c == bVar.b() && this.f3604d == bVar.i() && this.f3605e == bVar.c() && this.f3606f == bVar.d() && this.f3607g == bVar.h() && this.f3608h.equals(bVar.e()) && this.f3609i.equals(bVar.g());
    }

    public final String f() {
        return this.f3602b;
    }

    public final String g() {
        return this.f3609i;
    }

    public final int h() {
        return this.f3607g;
    }

    public final int hashCode() {
        long j10 = this.f3604d;
        long j11 = this.f3605e;
        return ((((((((((((((((this.f3601a ^ 1000003) * 1000003) ^ this.f3602b.hashCode()) * 1000003) ^ this.f3603c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f3606f ? 1231 : 1237)) * 1000003) ^ this.f3607g) * 1000003) ^ this.f3608h.hashCode()) * 1000003) ^ this.f3609i.hashCode();
    }

    public final long i() {
        return this.f3604d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f3601a);
        sb2.append(", model=");
        sb2.append(this.f3602b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f3603c);
        sb2.append(", totalRam=");
        sb2.append(this.f3604d);
        sb2.append(", diskSpace=");
        sb2.append(this.f3605e);
        sb2.append(", isEmulator=");
        sb2.append(this.f3606f);
        sb2.append(", state=");
        sb2.append(this.f3607g);
        sb2.append(", manufacturer=");
        sb2.append(this.f3608h);
        sb2.append(", modelClass=");
        return g.a(sb2, this.f3609i, "}");
    }
}
