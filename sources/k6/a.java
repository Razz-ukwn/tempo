package k6;

import b3.x;

public final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public final long f10295b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10296c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10297d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10298e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10299f;

    public a(long j10, int i8, int i10, long j11, int i11) {
        this.f10295b = j10;
        this.f10296c = i8;
        this.f10297d = i10;
        this.f10298e = j11;
        this.f10299f = i11;
    }

    public final int a() {
        return this.f10297d;
    }

    public final long b() {
        return this.f10298e;
    }

    public final int c() {
        return this.f10296c;
    }

    public final int d() {
        return this.f10299f;
    }

    public final long e() {
        return this.f10295b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10295b == eVar.e() && this.f10296c == eVar.c() && this.f10297d == eVar.a() && this.f10298e == eVar.b() && this.f10299f == eVar.d();
    }

    public final int hashCode() {
        long j10 = this.f10295b;
        long j11 = this.f10298e;
        return ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10296c) * 1000003) ^ this.f10297d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f10299f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f10295b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f10296c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f10297d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f10298e);
        sb2.append(", maxBlobByteSizePerRow=");
        return x.b(sb2, this.f10299f, "}");
    }
}
