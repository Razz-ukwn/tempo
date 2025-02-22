package c6;

import c6.l;
import java.util.Arrays;

public final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f3810a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f3811b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3812c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f3813d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3814e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3815f;

    /* renamed from: g  reason: collision with root package name */
    public final o f3816g;

    public static final class a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f3817a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f3818b;

        /* renamed from: c  reason: collision with root package name */
        public Long f3819c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f3820d;

        /* renamed from: e  reason: collision with root package name */
        public String f3821e;

        /* renamed from: f  reason: collision with root package name */
        public Long f3822f;

        /* renamed from: g  reason: collision with root package name */
        public o f3823g;
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f3810a = j10;
        this.f3811b = num;
        this.f3812c = j11;
        this.f3813d = bArr;
        this.f3814e = str;
        this.f3815f = j12;
        this.f3816g = oVar;
    }

    public final Integer a() {
        return this.f3811b;
    }

    public final long b() {
        return this.f3810a;
    }

    public final long c() {
        return this.f3812c;
    }

    public final o d() {
        return this.f3816g;
    }

    public final byte[] e() {
        return this.f3813d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f3810a == lVar.b() && ((num = this.f3811b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.f3812c == lVar.c()) {
            if (Arrays.equals(this.f3813d, lVar instanceof f ? ((f) lVar).f3813d : lVar.e()) && ((str = this.f3814e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f3815f == lVar.g()) {
                o oVar = this.f3816g;
                if (oVar == null) {
                    if (lVar.d() == null) {
                        return true;
                    }
                } else if (oVar.equals(lVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f3814e;
    }

    public final long g() {
        return this.f3815f;
    }

    public final int hashCode() {
        long j10 = this.f3810a;
        int i8 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f3811b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f3812c;
        int hashCode2 = (((((i8 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f3813d)) * 1000003;
        String str = this.f3814e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f3815f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        o oVar = this.f3816g;
        if (oVar != null) {
            i10 = oVar.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f3810a + ", eventCode=" + this.f3811b + ", eventUptimeMs=" + this.f3812c + ", sourceExtension=" + Arrays.toString(this.f3813d) + ", sourceExtensionJsonProto3=" + this.f3814e + ", timezoneOffsetSeconds=" + this.f3815f + ", networkConnectionInfo=" + this.f3816g + "}";
    }
}
