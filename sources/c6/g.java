package c6;

import java.util.List;

public final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    public final long f3824a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3825b;

    /* renamed from: c  reason: collision with root package name */
    public final k f3826c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f3827d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3828e;

    /* renamed from: f  reason: collision with root package name */
    public final List<l> f3829f;

    /* renamed from: g  reason: collision with root package name */
    public final p f3830g;

    public g() {
        throw null;
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f3824a = j10;
        this.f3825b = j11;
        this.f3826c = kVar;
        this.f3827d = num;
        this.f3828e = str;
        this.f3829f = list;
        this.f3830g = pVar;
    }

    public final k a() {
        return this.f3826c;
    }

    public final List<l> b() {
        return this.f3829f;
    }

    public final Integer c() {
        return this.f3827d;
    }

    public final String d() {
        return this.f3828e;
    }

    public final p e() {
        return this.f3830g;
    }

    public final boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f3824a == mVar.f() && this.f3825b == mVar.g() && ((kVar = this.f3826c) != null ? kVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.f3827d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f3828e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((list = this.f3829f) != null ? list.equals(mVar.b()) : mVar.b() == null)) {
            p pVar = this.f3830g;
            if (pVar == null) {
                if (mVar.e() == null) {
                    return true;
                }
            } else if (pVar.equals(mVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f3824a;
    }

    public final long g() {
        return this.f3825b;
    }

    public final int hashCode() {
        long j10 = this.f3824a;
        long j11 = this.f3825b;
        int i8 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        int i10 = 0;
        k kVar = this.f3826c;
        int hashCode = (i8 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f3827d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f3828e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f3829f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f3830g;
        if (pVar != null) {
            i10 = pVar.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f3824a + ", requestUptimeMs=" + this.f3825b + ", clientInfo=" + this.f3826c + ", logSource=" + this.f3827d + ", logSourceName=" + this.f3828e + ", logEvents=" + this.f3829f + ", qosTier=" + this.f3830g + "}";
    }
}
