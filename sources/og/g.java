package og;

import java.util.regex.Pattern;
import jg.d0;
import jg.t;
import wg.c0;
import wg.h;

public final class g extends d0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f12374b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12375c;

    /* renamed from: d  reason: collision with root package name */
    public final h f12376d;

    public g(String str, long j10, c0 c0Var) {
        this.f12374b = str;
        this.f12375c = j10;
        this.f12376d = c0Var;
    }

    public final long c() {
        return this.f12375c;
    }

    public final t d() {
        String str = this.f12374b;
        if (str == null) {
            return null;
        }
        Pattern pattern = t.f10171d;
        try {
            return t.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final h e() {
        return this.f12376d;
    }
}
