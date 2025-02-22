package ra;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q4.a;

public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final long f14182b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f14183c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static m f14184d;

    /* renamed from: a  reason: collision with root package name */
    public final a f14185a;

    public m(a aVar) {
        this.f14185a = aVar;
    }

    public static m a() {
        if (a.f12838b == null) {
            a.f12838b = new a(9);
        }
        a aVar = a.f12838b;
        if (f14184d == null) {
            f14184d = new m(aVar);
        }
        return f14184d;
    }

    public final boolean b(ta.a aVar) {
        if (TextUtils.isEmpty(aVar.f15508d)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f14185a.getClass();
        return aVar.f15510f + aVar.f15511g < timeUnit.toSeconds(System.currentTimeMillis()) + f14182b;
    }
}
