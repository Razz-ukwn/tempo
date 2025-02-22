package z3;

import ag.s0;
import android.os.StatFs;
import java.io.Closeable;
import wg.l;
import wg.u;
import wg.z;
import z3.f;

public interface a {

    /* renamed from: z3.a$a  reason: collision with other inner class name */
    public static final class C0331a {

        /* renamed from: a  reason: collision with root package name */
        public z f17685a;

        /* renamed from: b  reason: collision with root package name */
        public final u f17686b = l.f16785a;

        /* renamed from: c  reason: collision with root package name */
        public final double f17687c = 0.02d;

        /* renamed from: d  reason: collision with root package name */
        public final long f17688d = 10485760;

        /* renamed from: e  reason: collision with root package name */
        public final long f17689e = 262144000;

        /* renamed from: f  reason: collision with root package name */
        public final kotlinx.coroutines.scheduling.b f17690f = s0.f481b;

        public final f a() {
            long j10;
            long j11 = this.f17688d;
            z zVar = this.f17685a;
            if (zVar != null) {
                double d10 = this.f17687c;
                if (d10 > 0.0d) {
                    try {
                        StatFs statFs = new StatFs(zVar.toFile().getAbsolutePath());
                        long blockCountLong = (long) (d10 * ((double) statFs.getBlockCountLong()) * ((double) statFs.getBlockSizeLong()));
                        long j12 = this.f17689e;
                        if (j11 > j12) {
                            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
                        } else if (blockCountLong >= j11) {
                            j10 = blockCountLong > j12 ? j12 : blockCountLong;
                            return new f(j10, zVar, this.f17686b, this.f17690f);
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    j11 = 0;
                }
                j10 = j11;
                return new f(j10, zVar, this.f17686b, this.f17690f);
            }
            throw new IllegalStateException("directory == null".toString());
        }
    }

    public interface b extends Closeable {
        z E();

        f.a V();

        z getData();
    }

    f.b a(String str);

    f.a b(String str);

    l getFileSystem();
}
