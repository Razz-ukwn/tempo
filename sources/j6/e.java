package j6;

import a6.d;
import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

@AutoValue
public abstract class e {

    @AutoValue
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: j6.e$a$a  reason: collision with other inner class name */
        public static abstract class C0181a {
        }

        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    public enum b {
        f9809a,
        f9810b,
        f9811c;

        /* access modifiers changed from: public */
        b() {
        }
    }

    public abstract m6.a a();

    public final long b(d dVar, long j10, int i8) {
        long a10 = j10 - a().a();
        a aVar = c().get(dVar);
        long a11 = aVar.a();
        int i10 = i8 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i10) * ((double) a11) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((a11 > 1 ? a11 : 2) * ((long) i10))))), a10), aVar.c());
    }

    public abstract Map<d, a> c();
}
