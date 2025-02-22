package qg;

import gf.l;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kg.b;
import kotlinx.coroutines.internal.v;
import qg.d;
import sf.j;
import wg.e;
import wg.g;

public final class s implements Closeable {
    public static final Logger C = Logger.getLogger(e.class.getName());
    public final d.b B;

    /* renamed from: a  reason: collision with root package name */
    public final g f13740a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13741b;

    /* renamed from: c  reason: collision with root package name */
    public final e f13742c;

    /* renamed from: d  reason: collision with root package name */
    public int f13743d = 16384;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13744e;

    public s(g gVar, boolean z10) {
        this.f13740a = gVar;
        this.f13741b = z10;
        e eVar = new e();
        this.f13742c = eVar;
        this.B = new d.b(eVar);
    }

    public final synchronized void c(v vVar) {
        j.f(vVar, "peerSettings");
        if (!this.f13744e) {
            int i8 = this.f13743d;
            int i10 = vVar.f13752a;
            if ((i10 & 32) != 0) {
                i8 = vVar.f13753b[5];
            }
            this.f13743d = i8;
            if (((i10 & 2) != 0 ? vVar.f13753b[1] : -1) != -1) {
                d.b bVar = this.B;
                int i11 = (i10 & 2) != 0 ? vVar.f13753b[1] : -1;
                bVar.getClass();
                int min = Math.min(i11, 16384);
                int i12 = bVar.f13640e;
                if (i12 != min) {
                    if (min < i12) {
                        bVar.f13638c = Math.min(bVar.f13638c, min);
                    }
                    bVar.f13639d = true;
                    bVar.f13640e = min;
                    int i13 = bVar.f13644i;
                    if (min < i13) {
                        if (min == 0) {
                            l.a0(bVar.f13641f, (v) null);
                            bVar.f13642g = bVar.f13641f.length - 1;
                            bVar.f13643h = 0;
                            bVar.f13644i = 0;
                        } else {
                            bVar.a(i13 - min);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.f13740a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void close() {
        this.f13744e = true;
        this.f13740a.close();
    }

    public final synchronized void d(boolean z10, int i8, e eVar, int i10) {
        if (!this.f13744e) {
            e(i8, i10, 0, z10 ? 1 : 0);
            if (i10 > 0) {
                j.c(eVar);
                this.f13740a.B(eVar, (long) i10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void e(int i8, int i10, int i11, int i12) {
        Level level = Level.FINE;
        Logger logger = C;
        boolean z10 = false;
        if (logger.isLoggable(level)) {
            e.f13645a.getClass();
            logger.fine(e.a(false, i8, i10, i11, i12));
        }
        if (i10 <= this.f13743d) {
            if ((Integer.MIN_VALUE & i8) == 0) {
                z10 = true;
            }
            if (z10) {
                byte[] bArr = b.f10474a;
                g gVar = this.f13740a;
                j.f(gVar, "<this>");
                gVar.writeByte((i10 >>> 16) & 255);
                gVar.writeByte((i10 >>> 8) & 255);
                gVar.writeByte(i10 & 255);
                gVar.writeByte(i11 & 255);
                gVar.writeByte(i12 & 255);
                gVar.writeInt(i8 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(j.k(Integer.valueOf(i8), "reserved bit set: ").toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f13743d + ": " + i10).toString());
    }

    public final synchronized void j(int i8, b bVar, byte[] bArr) {
        if (!this.f13744e) {
            boolean z10 = false;
            if (bVar.f13616a != -1) {
                e(0, bArr.length + 8, 7, 0);
                this.f13740a.writeInt(i8);
                this.f13740a.writeInt(bVar.f13616a);
                if (bArr.length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    this.f13740a.write(bArr);
                }
                this.f13740a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void p(int i8, int i10, boolean z10) {
        if (!this.f13744e) {
            e(0, 8, 6, z10 ? 1 : 0);
            this.f13740a.writeInt(i8);
            this.f13740a.writeInt(i10);
            this.f13740a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void q(int i8, b bVar) {
        j.f(bVar, "errorCode");
        if (!this.f13744e) {
            if (bVar.f13616a != -1) {
                e(i8, 4, 3, 0);
                this.f13740a.writeInt(bVar.f13616a);
                this.f13740a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void s(int i8, long j10) {
        if (!this.f13744e) {
            if (j10 != 0 && j10 <= 2147483647L) {
                e(i8, 4, 8, 0);
                this.f13740a.writeInt((int) j10);
                this.f13740a.flush();
            } else {
                throw new IllegalArgumentException(j.k(Long.valueOf(j10), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void u(int i8, long j10) {
        while (j10 > 0) {
            long min = Math.min((long) this.f13743d, j10);
            j10 -= min;
            e(i8, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f13740a.B(this.f13742c, min);
        }
    }
}
