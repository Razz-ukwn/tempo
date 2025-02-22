package q7;

import android.os.Bundle;

public final class t2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f13332a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13333b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13334c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f13335d;

    public t2(long j10, Bundle bundle, String str, String str2) {
        this.f13332a = str;
        this.f13333b = str2;
        this.f13335d = bundle;
        this.f13334c = j10;
    }

    public static t2 b(s sVar) {
        String str = sVar.f13311a;
        String str2 = sVar.f13313c;
        return new t2(sVar.f13314d, sVar.f13312b.w(), str, str2);
    }

    public final s a() {
        return new s(this.f13332a, new q(new Bundle(this.f13335d)), this.f13333b, this.f13334c);
    }

    public final String toString() {
        String obj = this.f13335d.toString();
        return "origin=" + this.f13333b + ",name=" + this.f13332a + ",params=" + obj;
    }
}
