package wg;

import java.nio.ByteBuffer;
import sf.j;

public final class b0 implements g {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f16735a;

    /* renamed from: b  reason: collision with root package name */
    public final e f16736b = new e();

    /* renamed from: c  reason: collision with root package name */
    public boolean f16737c;

    public b0(g0 g0Var) {
        j.f(g0Var, "sink");
        this.f16735a = g0Var;
    }

    public final g A0(long j10) {
        if (!this.f16737c) {
            this.f16736b.A0(j10);
            c();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void B(e eVar, long j10) {
        j.f(eVar, "source");
        if (!this.f16737c) {
            this.f16736b.B(eVar, j10);
            c();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g M(String str) {
        j.f(str, "string");
        if (!this.f16737c) {
            this.f16736b.v0(str);
            c();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g O(i iVar) {
        j.f(iVar, "byteString");
        if (!this.f16737c) {
            this.f16736b.f0(iVar);
            c();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g W(long j10) {
        if (!this.f16737c) {
            this.f16736b.m0(j10);
            c();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final e a() {
        return this.f16736b;
    }

    public final j0 b() {
        return this.f16735a.b();
    }

    public final g c() {
        if (!this.f16737c) {
            e eVar = this.f16736b;
            long q10 = eVar.q();
            if (q10 > 0) {
                this.f16735a.B(eVar, q10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        g0 g0Var = this.f16735a;
        if (!this.f16737c) {
            try {
                e eVar = this.f16736b;
                long j10 = eVar.f16752b;
                if (j10 > 0) {
                    g0Var.B(eVar, j10);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                g0Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f16737c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (!this.f16737c) {
            e eVar = this.f16736b;
            long j10 = eVar.f16752b;
            int i8 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            g0 g0Var = this.f16735a;
            if (i8 > 0) {
                g0Var.B(eVar, j10);
            }
            g0Var.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean isOpen() {
        return !this.f16737c;
    }

    public final String toString() {
        return "buffer(" + this.f16735a + ')';
    }

    public final int write(ByteBuffer byteBuffer) {
        j.f(byteBuffer, "source");
        if (!this.f16737c) {
            int write = this.f16736b.write(byteBuffer);
            c();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g writeByte(int i8) {
        if (!this.f16737c) {
            this.f16736b.g0(i8);
            c();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g writeInt(int i8) {
        if (!this.f16737c) {
            this.f16736b.n0(i8);
            c();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g writeShort(int i8) {
        if (!this.f16737c) {
            this.f16736b.p0(i8);
            c();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long x(i0 i0Var) {
        long j10 = 0;
        while (true) {
            long a02 = ((s) i0Var).a0(this.f16736b, 8192);
            if (a02 == -1) {
                return j10;
            }
            j10 += a02;
            c();
        }
    }

    public final g write(byte[] bArr) {
        j.f(bArr, "source");
        if (!this.f16737c) {
            e eVar = this.f16736b;
            eVar.getClass();
            eVar.write(bArr, 0, bArr.length);
            c();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g write(byte[] bArr, int i8, int i10) {
        j.f(bArr, "source");
        if (!this.f16737c) {
            this.f16736b.write(bArr, i8, i10);
            c();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
