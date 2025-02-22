package ng;

import java.io.IOException;
import java.net.ProtocolException;
import jg.c0;
import jg.n;
import og.d;
import qg.w;
import sf.j;
import wg.e;
import wg.g0;
import wg.i0;
import wg.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f11923a;

    /* renamed from: b  reason: collision with root package name */
    public final n f11924b;

    /* renamed from: c  reason: collision with root package name */
    public final c f11925c;

    /* renamed from: d  reason: collision with root package name */
    public final d f11926d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11927e;

    /* renamed from: f  reason: collision with root package name */
    public final e f11928f;

    public final class a extends wg.n {
        public final /* synthetic */ b B;

        /* renamed from: b  reason: collision with root package name */
        public final long f11929b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f11930c;

        /* renamed from: d  reason: collision with root package name */
        public long f11931d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11932e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, g0 g0Var, long j10) {
            super(g0Var);
            j.f(bVar, "this$0");
            j.f(g0Var, "delegate");
            this.B = bVar;
            this.f11929b = j10;
        }

        public final void B(e eVar, long j10) {
            j.f(eVar, "source");
            if (!this.f11932e) {
                long j11 = this.f11929b;
                if (j11 == -1 || this.f11931d + j10 <= j11) {
                    try {
                        super.B(eVar, j10);
                        this.f11931d += j10;
                    } catch (IOException e10) {
                        throw c(e10);
                    }
                } else {
                    throw new ProtocolException("expected " + j11 + " bytes but received " + (this.f11931d + j10));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E c(E e10) {
            if (this.f11930c) {
                return e10;
            }
            this.f11930c = true;
            return this.B.a(false, true, e10);
        }

        public final void close() {
            if (!this.f11932e) {
                this.f11932e = true;
                long j10 = this.f11929b;
                if (j10 == -1 || this.f11931d == j10) {
                    try {
                        super.close();
                        c((IOException) null);
                    } catch (IOException e10) {
                        throw c(e10);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public final void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw c(e10);
            }
        }
    }

    /* renamed from: ng.b$b  reason: collision with other inner class name */
    public final class C0227b extends o {
        public boolean B;
        public final /* synthetic */ b C;

        /* renamed from: b  reason: collision with root package name */
        public final long f11933b;

        /* renamed from: c  reason: collision with root package name */
        public long f11934c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f11935d = true;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11936e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0227b(b bVar, i0 i0Var, long j10) {
            super(i0Var);
            j.f(i0Var, "delegate");
            this.C = bVar;
            this.f11933b = j10;
            if (j10 == 0) {
                c((IOException) null);
            }
        }

        public final long a0(e eVar, long j10) {
            j.f(eVar, "sink");
            if (!this.B) {
                try {
                    long a02 = this.f16789a.a0(eVar, j10);
                    if (this.f11935d) {
                        this.f11935d = false;
                        b bVar = this.C;
                        n nVar = bVar.f11924b;
                        d dVar = bVar.f11923a;
                        nVar.getClass();
                        j.f(dVar, "call");
                    }
                    if (a02 == -1) {
                        c((IOException) null);
                        return -1;
                    }
                    long j11 = this.f11934c + a02;
                    long j12 = this.f11933b;
                    if (j12 == -1 || j11 <= j12) {
                        this.f11934c = j11;
                        if (j11 == j12) {
                            c((IOException) null);
                        }
                        return a02;
                    }
                    throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
                } catch (IOException e10) {
                    throw c(e10);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public final <E extends IOException> E c(E e10) {
            if (this.f11936e) {
                return e10;
            }
            this.f11936e = true;
            b bVar = this.C;
            if (e10 == null && this.f11935d) {
                this.f11935d = false;
                bVar.f11924b.getClass();
                j.f(bVar.f11923a, "call");
            }
            return bVar.a(true, false, e10);
        }

        public final void close() {
            if (!this.B) {
                this.B = true;
                try {
                    super.close();
                    c((IOException) null);
                } catch (IOException e10) {
                    throw c(e10);
                }
            }
        }
    }

    public b(d dVar, n nVar, c cVar, d dVar2) {
        j.f(nVar, "eventListener");
        this.f11923a = dVar;
        this.f11924b = nVar;
        this.f11925c = cVar;
        this.f11926d = dVar2;
        this.f11928f = dVar2.f();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            c(iOException);
        }
        n nVar = this.f11924b;
        d dVar = this.f11923a;
        if (z11) {
            if (iOException != null) {
                nVar.getClass();
                j.f(dVar, "call");
            } else {
                nVar.getClass();
                j.f(dVar, "call");
            }
        }
        if (z10) {
            if (iOException != null) {
                nVar.getClass();
                j.f(dVar, "call");
            } else {
                nVar.getClass();
                j.f(dVar, "call");
            }
        }
        return dVar.j(this, z11, z10, iOException);
    }

    public final c0.a b(boolean z10) {
        try {
            c0.a e10 = this.f11926d.e(z10);
            if (e10 != null) {
                e10.m = this;
            }
            return e10;
        } catch (IOException e11) {
            this.f11924b.getClass();
            j.f(this.f11923a, "call");
            c(e11);
            throw e11;
        }
    }

    public final void c(IOException iOException) {
        this.f11925c.c(iOException);
        e f10 = this.f11926d.f();
        d dVar = this.f11923a;
        synchronized (f10) {
            j.f(dVar, "call");
            if (!(iOException instanceof w)) {
                if (!(f10.f11962g != null) || (iOException instanceof qg.a)) {
                    f10.f11965j = true;
                    if (f10.m == 0) {
                        e.d(dVar.f11947a, f10.f11957b, iOException);
                        f10.f11967l++;
                    }
                }
            } else if (((w) iOException).f13754a == qg.b.REFUSED_STREAM) {
                int i8 = f10.f11968n + 1;
                f10.f11968n = i8;
                if (i8 > 1) {
                    f10.f11965j = true;
                    f10.f11967l++;
                }
            } else if (((w) iOException).f13754a != qg.b.CANCEL || !dVar.L) {
                f10.f11965j = true;
                f10.f11967l++;
            }
        }
    }
}
