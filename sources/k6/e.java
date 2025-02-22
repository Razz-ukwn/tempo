package k6;

import com.google.auto.value.AutoValue;
import h4.a;

@AutoValue
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10306a;

    static {
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        String str = l10 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            str = str.concat(" loadBatchSize");
        }
        if (num2 == null) {
            str = a.c(str, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            str = a.c(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = a.c(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f10306a = new a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
