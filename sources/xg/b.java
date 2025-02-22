package xg;

import java.io.IOException;
import sf.j;
import wg.e;
import wg.i0;
import wg.o;

public final class b extends o {

    /* renamed from: b  reason: collision with root package name */
    public final long f17073b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17074c;

    /* renamed from: d  reason: collision with root package name */
    public long f17075d;

    public b(i0 i0Var, long j10, boolean z10) {
        super(i0Var);
        this.f17073b = j10;
        this.f17074c = z10;
    }

    public final long a0(e eVar, long j10) {
        j.f(eVar, "sink");
        long j11 = this.f17075d;
        long j12 = this.f17073b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f17074c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1;
            }
            j10 = Math.min(j10, j13);
        }
        long a02 = super.a0(eVar, j10);
        int i8 = (a02 > -1 ? 1 : (a02 == -1 ? 0 : -1));
        if (i8 != 0) {
            this.f17075d += a02;
        }
        long j14 = this.f17075d;
        int i10 = (j14 > j12 ? 1 : (j14 == j12 ? 0 : -1));
        if ((i10 >= 0 || i8 != 0) && i10 <= 0) {
            return a02;
        }
        if (a02 > 0 && i10 > 0) {
            e eVar2 = new e();
            eVar2.x(eVar);
            eVar.B(eVar2, eVar.f16752b - (j14 - j12));
            eVar2.j();
        }
        throw new IOException("expected " + j12 + " bytes but got " + this.f17075d);
    }
}
