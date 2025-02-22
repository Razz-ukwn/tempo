package o4;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12153a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f12154b;

    /* renamed from: c  reason: collision with root package name */
    public c f12155c;

    /* renamed from: d  reason: collision with root package name */
    public int f12156d = 0;

    public final boolean a() {
        return this.f12155c.f12143b != 0;
    }

    public final c b() {
        byte[] bArr;
        if (this.f12154b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f12155c;
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (int i8 = 0; i8 < 6; i8++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.f12155c.f12143b = 1;
            } else {
                this.f12155c.f12147f = f();
                this.f12155c.f12148g = f();
                int c3 = c();
                c cVar = this.f12155c;
                cVar.f12149h = (c3 & 128) != 0;
                cVar.f12150i = (int) Math.pow(2.0d, (double) ((c3 & 7) + 1));
                this.f12155c.f12151j = c();
                c cVar2 = this.f12155c;
                c();
                cVar2.getClass();
                if (this.f12155c.f12149h && !a()) {
                    c cVar3 = this.f12155c;
                    cVar3.f12142a = e(cVar3.f12150i);
                    c cVar4 = this.f12155c;
                    cVar4.f12152k = cVar4.f12142a[cVar4.f12151j];
                }
            }
            if (!a()) {
                boolean z10 = false;
                while (!z10 && !a() && this.f12155c.f12144c <= Integer.MAX_VALUE) {
                    int c10 = c();
                    if (c10 == 33) {
                        int c11 = c();
                        if (c11 == 1) {
                            g();
                        } else if (c11 == 249) {
                            this.f12155c.f12145d = new b();
                            c();
                            int c12 = c();
                            b bVar = this.f12155c.f12145d;
                            int i10 = (c12 & 28) >> 2;
                            bVar.f12137g = i10;
                            if (i10 == 0) {
                                bVar.f12137g = 1;
                            }
                            bVar.f12136f = (c12 & 1) != 0;
                            int f10 = f();
                            if (f10 < 2) {
                                f10 = 10;
                            }
                            b bVar2 = this.f12155c.f12145d;
                            bVar2.f12139i = f10 * 10;
                            bVar2.f12138h = c();
                            c();
                        } else if (c11 == 254) {
                            g();
                        } else if (c11 != 255) {
                            g();
                        } else {
                            d();
                            StringBuilder sb3 = new StringBuilder();
                            int i11 = 0;
                            while (true) {
                                bArr = this.f12153a;
                                if (i11 >= 11) {
                                    break;
                                }
                                sb3.append((char) bArr[i11]);
                                i11++;
                            }
                            if (sb3.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    if (bArr[0] == 1) {
                                        byte b10 = bArr[1];
                                        byte b11 = bArr[2];
                                        this.f12155c.getClass();
                                    }
                                    if (this.f12156d <= 0) {
                                        break;
                                    }
                                } while (a());
                            } else {
                                g();
                            }
                        }
                    } else if (c10 == 44) {
                        c cVar5 = this.f12155c;
                        if (cVar5.f12145d == null) {
                            cVar5.f12145d = new b();
                        }
                        this.f12155c.f12145d.f12131a = f();
                        this.f12155c.f12145d.f12132b = f();
                        this.f12155c.f12145d.f12133c = f();
                        this.f12155c.f12145d.f12134d = f();
                        int c13 = c();
                        boolean z11 = (c13 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c13 & 7) + 1));
                        b bVar3 = this.f12155c.f12145d;
                        bVar3.f12135e = (c13 & 64) != 0;
                        if (z11) {
                            bVar3.f12141k = e(pow);
                        } else {
                            bVar3.f12141k = null;
                        }
                        this.f12155c.f12145d.f12140j = this.f12154b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f12155c;
                            cVar6.f12144c++;
                            cVar6.f12146e.add(cVar6.f12145d);
                        }
                    } else if (c10 != 59) {
                        this.f12155c.f12143b = 1;
                    } else {
                        z10 = true;
                    }
                }
                c cVar7 = this.f12155c;
                if (cVar7.f12144c < 0) {
                    cVar7.f12143b = 1;
                }
            }
            return this.f12155c;
        }
    }

    public final int c() {
        try {
            return this.f12154b.get() & 255;
        } catch (Exception unused) {
            this.f12155c.f12143b = 1;
            return 0;
        }
    }

    public final void d() {
        int c3 = c();
        this.f12156d = c3;
        if (c3 > 0) {
            int i8 = 0;
            int i10 = 0;
            while (true) {
                try {
                    int i11 = this.f12156d;
                    if (i8 < i11) {
                        i10 = i11 - i8;
                        this.f12154b.get(this.f12153a, i8, i10);
                        i8 += i10;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i8 + " count: " + i10 + " blockSize: " + this.f12156d, e10);
                    }
                    this.f12155c.f12143b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i8) {
        byte[] bArr = new byte[(i8 * 3)];
        int[] iArr = null;
        try {
            this.f12154b.get(bArr);
            iArr = new int[256];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8) {
                int i12 = i11 + 1;
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i10 + 1;
                iArr[i10] = ((bArr[i11] & 255) << 16) | -16777216 | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
                i11 = i14;
                i10 = i15;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f12155c.f12143b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f12154b.getShort();
    }

    public final void g() {
        int c3;
        do {
            c3 = c();
            this.f12154b.position(Math.min(this.f12154b.position() + c3, this.f12154b.limit()));
        } while (c3 > 0);
    }
}
