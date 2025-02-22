package qg;

import d2.f1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qg.d;
import sf.j;
import wg.e;
import wg.h;
import wg.i;
import wg.i0;
import wg.j0;

public final class q implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f13707e;

    /* renamed from: a  reason: collision with root package name */
    public final h f13708a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13709b;

    /* renamed from: c  reason: collision with root package name */
    public final b f13710c;

    /* renamed from: d  reason: collision with root package name */
    public final d.a f13711d;

    public static final class a {
        public static int a(int i8, int i10, int i11) {
            if ((i10 & 8) != 0) {
                i8--;
            }
            if (i11 <= i8) {
                return i8 - i11;
            }
            throw new IOException(androidx.activity.result.d.a("PROTOCOL_ERROR padding ", i11, " > remaining length ", i8));
        }
    }

    public static final class b implements i0 {
        public int B;

        /* renamed from: a  reason: collision with root package name */
        public final h f13712a;

        /* renamed from: b  reason: collision with root package name */
        public int f13713b;

        /* renamed from: c  reason: collision with root package name */
        public int f13714c;

        /* renamed from: d  reason: collision with root package name */
        public int f13715d;

        /* renamed from: e  reason: collision with root package name */
        public int f13716e;

        public b(h hVar) {
            this.f13712a = hVar;
        }

        public final long a0(e eVar, long j10) {
            int i8;
            int readInt;
            j.f(eVar, "sink");
            do {
                int i10 = this.f13716e;
                h hVar = this.f13712a;
                if (i10 == 0) {
                    hVar.skip((long) this.B);
                    this.B = 0;
                    if ((this.f13714c & 4) != 0) {
                        return -1;
                    }
                    i8 = this.f13715d;
                    int t2 = kg.b.t(hVar);
                    this.f13716e = t2;
                    this.f13713b = t2;
                    byte readByte = hVar.readByte() & 255;
                    this.f13714c = hVar.readByte() & 255;
                    Logger logger = q.f13707e;
                    if (logger.isLoggable(Level.FINE)) {
                        e eVar2 = e.f13645a;
                        int i11 = this.f13715d;
                        int i12 = this.f13713b;
                        int i13 = this.f13714c;
                        eVar2.getClass();
                        logger.fine(e.a(true, i11, i12, readByte, i13));
                    }
                    readInt = hVar.readInt() & Integer.MAX_VALUE;
                    this.f13715d = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long a02 = hVar.a0(eVar, Math.min(j10, (long) i10));
                    if (a02 == -1) {
                        return -1;
                    }
                    this.f13716e -= (int) a02;
                    return a02;
                }
            } while (readInt == i8);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        public final j0 b() {
            return this.f13712a.b();
        }

        public final void close() {
        }
    }

    public interface c {
        void a(int i8, List list);

        void b();

        void c(int i8, b bVar);

        void g(int i8, int i10, h hVar, boolean z10);

        void h(int i8, long j10);

        void i(int i8, int i10, boolean z10);

        void j(int i8, b bVar, i iVar);

        void l(v vVar);

        void m();

        void n(int i8, List list, boolean z10);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        j.e(logger, "getLogger(Http2::class.java.name)");
        f13707e = logger;
    }

    public q(h hVar, boolean z10) {
        this.f13708a = hVar;
        this.f13709b = z10;
        b bVar = new b(hVar);
        this.f13710c = bVar;
        this.f13711d = new d.a(bVar);
    }

    public final boolean c(boolean z10, c cVar) {
        int readInt;
        h hVar = this.f13708a;
        j.f(cVar, "handler");
        boolean z11 = false;
        try {
            hVar.z0(9);
            int t2 = kg.b.t(hVar);
            if (t2 <= 16384) {
                byte readByte = hVar.readByte() & 255;
                byte readByte2 = hVar.readByte() & 255;
                int readInt2 = hVar.readInt() & Integer.MAX_VALUE;
                Level level = Level.FINE;
                Logger logger = f13707e;
                if (logger.isLoggable(level)) {
                    e.f13645a.getClass();
                    logger.fine(e.a(true, readInt2, t2, readByte, readByte2));
                }
                if (!z10 || readByte == 4) {
                    b bVar = null;
                    switch (readByte) {
                        case 0:
                            if (readInt2 != 0) {
                                boolean z12 = (readByte2 & 1) != 0;
                                if (!((readByte2 & 32) != 0)) {
                                    if ((readByte2 & 8) != 0) {
                                        z11 = hVar.readByte() & true;
                                    }
                                    cVar.g(readInt2, a.a(t2, readByte2, z11 ? 1 : 0), hVar, z12);
                                    hVar.skip(z11 ? 1 : 0);
                                    break;
                                } else {
                                    throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                                }
                            } else {
                                throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                            }
                        case 1:
                            if (readInt2 != 0) {
                                boolean z13 = (readByte2 & 1) != 0;
                                if ((readByte2 & 8) != 0) {
                                    z11 = hVar.readByte() & true;
                                }
                                if ((readByte2 & 32) != 0) {
                                    j(cVar, readInt2);
                                    t2 -= 5;
                                }
                                cVar.n(readInt2, e(a.a(t2, readByte2, z11 ? 1 : 0), z11, readByte2, readInt2), z13);
                                break;
                            } else {
                                throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                            }
                        case 2:
                            if (t2 != 5) {
                                throw new IOException(d.a.a("TYPE_PRIORITY length: ", t2, " != 5"));
                            } else if (readInt2 != 0) {
                                j(cVar, readInt2);
                                break;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        case 3:
                            if (t2 != 4) {
                                throw new IOException(d.a.a("TYPE_RST_STREAM length: ", t2, " != 4"));
                            } else if (readInt2 != 0) {
                                int readInt3 = hVar.readInt();
                                b[] values = b.values();
                                int length = values.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < length) {
                                        b bVar2 = values[i8];
                                        if (bVar2.f13616a == readInt3) {
                                            bVar = bVar2;
                                        } else {
                                            i8++;
                                        }
                                    }
                                }
                                if (bVar != null) {
                                    cVar.c(readInt2, bVar);
                                    break;
                                } else {
                                    throw new IOException(j.k(Integer.valueOf(readInt3), "TYPE_RST_STREAM unexpected error code: "));
                                }
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        case 4:
                            if (readInt2 != 0) {
                                throw new IOException("TYPE_SETTINGS streamId != 0");
                            } else if ((readByte2 & 1) != 0) {
                                if (t2 == 0) {
                                    cVar.b();
                                    break;
                                } else {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else if (t2 % 6 == 0) {
                                v vVar = new v();
                                wf.d K = f1.K(f1.P(0, t2), 6);
                                int i10 = K.f16714a;
                                int i11 = K.f16715b;
                                int i12 = K.f16716c;
                                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                                    while (true) {
                                        int i13 = i10 + i12;
                                        short readShort = hVar.readShort();
                                        byte[] bArr = kg.b.f10474a;
                                        short s10 = readShort & 65535;
                                        readInt = hVar.readInt();
                                        if (s10 != 2) {
                                            if (s10 == 3) {
                                                s10 = 4;
                                            } else if (s10 != 4) {
                                                if (s10 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                                }
                                            } else if (readInt >= 0) {
                                                s10 = 7;
                                            } else {
                                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            }
                                        } else if (!(readInt == 0 || readInt == 1)) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        vVar.c(s10, readInt);
                                        if (i10 != i11) {
                                            i10 = i13;
                                        }
                                    }
                                    throw new IOException(j.k(Integer.valueOf(readInt), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                }
                                cVar.l(vVar);
                                break;
                            } else {
                                throw new IOException(j.k(Integer.valueOf(t2), "TYPE_SETTINGS length % 6 != 0: "));
                            }
                        case 5:
                            if (readInt2 != 0) {
                                if ((readByte2 & 8) != 0) {
                                    z11 = hVar.readByte() & true;
                                }
                                cVar.a(hVar.readInt() & Integer.MAX_VALUE, e(a.a(t2 - 4, readByte2, z11 ? 1 : 0), z11, readByte2, readInt2));
                                break;
                            } else {
                                throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                            }
                        case 6:
                            if (t2 != 8) {
                                throw new IOException(j.k(Integer.valueOf(t2), "TYPE_PING length != 8: "));
                            } else if (readInt2 == 0) {
                                int readInt4 = hVar.readInt();
                                int readInt5 = hVar.readInt();
                                if ((readByte2 & 1) != 0) {
                                    z11 = true;
                                }
                                cVar.i(readInt4, readInt5, z11);
                                break;
                            } else {
                                throw new IOException("TYPE_PING streamId != 0");
                            }
                        case 7:
                            if (t2 < 8) {
                                throw new IOException(j.k(Integer.valueOf(t2), "TYPE_GOAWAY length < 8: "));
                            } else if (readInt2 == 0) {
                                int readInt6 = hVar.readInt();
                                int readInt7 = hVar.readInt();
                                int i14 = t2 - 8;
                                b[] values2 = b.values();
                                int length2 = values2.length;
                                int i15 = 0;
                                while (true) {
                                    if (i15 < length2) {
                                        b bVar3 = values2[i15];
                                        if (bVar3.f13616a == readInt7) {
                                            bVar = bVar3;
                                        } else {
                                            i15++;
                                        }
                                    }
                                }
                                if (bVar != null) {
                                    i iVar = i.f16760d;
                                    if (i14 > 0) {
                                        iVar = hVar.k((long) i14);
                                    }
                                    cVar.j(readInt6, bVar, iVar);
                                    break;
                                } else {
                                    throw new IOException(j.k(Integer.valueOf(readInt7), "TYPE_GOAWAY unexpected error code: "));
                                }
                            } else {
                                throw new IOException("TYPE_GOAWAY streamId != 0");
                            }
                        case 8:
                            if (t2 == 4) {
                                long readInt8 = ((long) hVar.readInt()) & 2147483647L;
                                if (readInt8 != 0) {
                                    cVar.h(readInt2, readInt8);
                                    break;
                                } else {
                                    throw new IOException("windowSizeIncrement was 0");
                                }
                            } else {
                                throw new IOException(j.k(Integer.valueOf(t2), "TYPE_WINDOW_UPDATE length !=4: "));
                            }
                        default:
                            hVar.skip((long) t2);
                            break;
                    }
                    return true;
                }
                e.f13645a.getClass();
                String[] strArr = e.f13647c;
                throw new IOException(j.k(readByte < strArr.length ? strArr[readByte] : kg.b.i("0x%02x", Integer.valueOf(readByte)), "Expected a SETTINGS frame but was "));
            }
            throw new IOException(j.k(Integer.valueOf(t2), "FRAME_SIZE_ERROR: "));
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void close() {
        this.f13708a.close();
    }

    public final void d(c cVar) {
        j.f(cVar, "handler");
        if (!this.f13709b) {
            i iVar = e.f13646b;
            i k10 = this.f13708a.k((long) iVar.f16761a.length);
            Level level = Level.FINE;
            Logger logger = f13707e;
            if (logger.isLoggable(level)) {
                logger.fine(kg.b.i(j.k(k10.e(), "<< CONNECTION "), new Object[0]));
            }
            if (!j.a(iVar, k10)) {
                throw new IOException(j.k(k10.q(), "Expected a connection header but was "));
            }
        } else if (!c(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00eb, code lost:
        throw new java.io.IOException(sf.j.k(java.lang.Integer.valueOf(r3.f13629b), "Invalid dynamic table size update "));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<qg.c> e(int r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            qg.q$b r0 = r2.f13710c
            r0.f13716e = r3
            r0.f13713b = r3
            r0.B = r4
            r0.f13714c = r5
            r0.f13715d = r6
        L_0x000c:
            qg.d$a r3 = r2.f13711d
            wg.c0 r4 = r3.f13631d
            boolean r5 = r4.y()
            java.util.ArrayList r6 = r3.f13630c
            if (r5 != 0) goto L_0x012c
            byte r4 = r4.readByte()
            byte[] r5 = kg.b.f10474a
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x0124
            r0 = r4 & 128(0x80, float:1.794E-43)
            r1 = 0
            if (r0 != r5) goto L_0x006f
            r5 = 127(0x7f, float:1.78E-43)
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            r5 = 1
            if (r4 < 0) goto L_0x003b
            qg.c[] r0 = qg.d.f13626a
            int r0 = r0.length
            int r0 = r0 - r5
            if (r4 > r0) goto L_0x003b
            r1 = r5
        L_0x003b:
            if (r1 == 0) goto L_0x0045
            qg.c[] r3 = qg.d.f13626a
            r3 = r3[r4]
            r6.add(r3)
            goto L_0x000c
        L_0x0045:
            qg.c[] r0 = qg.d.f13626a
            int r0 = r0.length
            int r0 = r4 - r0
            int r1 = r3.f13633f
            int r1 = r1 + r5
            int r1 = r1 + r0
            if (r1 < 0) goto L_0x005e
            qg.c[] r3 = r3.f13632e
            int r0 = r3.length
            if (r1 >= r0) goto L_0x005e
            r3 = r3[r1]
            sf.j.c(r3)
            r6.add(r3)
            goto L_0x000c
        L_0x005e:
            java.io.IOException r3 = new java.io.IOException
            int r4 = r4 + r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Header index too large "
            java.lang.String r4 = sf.j.k(r4, r5)
            r3.<init>(r4)
            throw r3
        L_0x006f:
            r5 = 64
            if (r4 != r5) goto L_0x0089
            qg.c[] r4 = qg.d.f13626a
            wg.i r4 = r3.d()
            qg.d.a(r4)
            wg.i r5 = r3.d()
            qg.c r6 = new qg.c
            r6.<init>((wg.i) r4, (wg.i) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x0089:
            r0 = r4 & 64
            if (r0 != r5) goto L_0x00a7
            r5 = 63
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            wg.i r4 = r3.b(r4)
            wg.i r5 = r3.d()
            qg.c r6 = new qg.c
            r6.<init>((wg.i) r4, (wg.i) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x00a7:
            r5 = r4 & 32
            r0 = 32
            if (r5 != r0) goto L_0x00ec
            r5 = 31
            int r4 = r3.e(r4, r5)
            r3.f13629b = r4
            if (r4 < 0) goto L_0x00da
            int r5 = r3.f13628a
            if (r4 > r5) goto L_0x00da
            int r5 = r3.f13635h
            if (r4 >= r5) goto L_0x000c
            if (r4 != 0) goto L_0x00d4
            qg.c[] r4 = r3.f13632e
            r5 = 0
            gf.l.a0(r4, r5)
            qg.c[] r4 = r3.f13632e
            int r4 = r4.length
            int r4 = r4 + -1
            r3.f13633f = r4
            r3.f13634g = r1
            r3.f13635h = r1
            goto L_0x000c
        L_0x00d4:
            int r5 = r5 - r4
            r3.a(r5)
            goto L_0x000c
        L_0x00da:
            java.io.IOException r4 = new java.io.IOException
            int r3 = r3.f13629b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "Invalid dynamic table size update "
            java.lang.String r3 = sf.j.k(r3, r5)
            r4.<init>(r3)
            throw r4
        L_0x00ec:
            r5 = 16
            if (r4 == r5) goto L_0x010d
            if (r4 != 0) goto L_0x00f3
            goto L_0x010d
        L_0x00f3:
            r5 = 15
            int r4 = r3.e(r4, r5)
            int r4 = r4 + -1
            wg.i r4 = r3.b(r4)
            wg.i r3 = r3.d()
            qg.c r5 = new qg.c
            r5.<init>((wg.i) r4, (wg.i) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x010d:
            qg.c[] r4 = qg.d.f13626a
            wg.i r4 = r3.d()
            qg.d.a(r4)
            wg.i r3 = r3.d()
            qg.c r5 = new qg.c
            r5.<init>((wg.i) r4, (wg.i) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0124:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x012c:
            java.util.List r3 = gf.q.O0(r6)
            r6.clear()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.q.e(int, int, int, int):java.util.List");
    }

    public final void j(c cVar, int i8) {
        h hVar = this.f13708a;
        hVar.readInt();
        hVar.readByte();
        byte[] bArr = kg.b.f10474a;
        cVar.m();
    }
}
