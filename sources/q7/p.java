package q7;

import u6.q;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f13253a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13254b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13255c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13256d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13257e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13258f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13259g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f13260h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f13261i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f13262j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f13263k;

    public p(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        q.f(str);
        q.f(str2);
        boolean z10 = true;
        q.a(j15 >= 0);
        q.a(j16 >= 0);
        q.a(j17 >= 0);
        q.a(j18 < 0 ? false : z10);
        this.f13253a = str;
        this.f13254b = str2;
        this.f13255c = j15;
        this.f13256d = j16;
        this.f13257e = j17;
        this.f13258f = j13;
        this.f13259g = j18;
        this.f13260h = l10;
        this.f13261i = l11;
        this.f13262j = l12;
        this.f13263k = bool;
    }

    public final p a(Long l10, Long l11, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new p(this.f13253a, this.f13254b, this.f13255c, this.f13256d, this.f13257e, this.f13258f, this.f13259g, this.f13260h, l10, l11, bool);
    }

    public final p b(long j10, long j11) {
        return new p(this.f13253a, this.f13254b, this.f13255c, this.f13256d, this.f13257e, this.f13258f, j10, Long.valueOf(j11), this.f13261i, this.f13262j, this.f13263k);
    }
}
