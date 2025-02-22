package n4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f11589a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f11590b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f11591c;

    /* renamed from: d  reason: collision with root package name */
    public int f11592d;

    /* renamed from: e  reason: collision with root package name */
    public int f11593e;

    public class a extends ByteArrayOutputStream {
        public a(int i8) {
            super(i8);
        }

        public final String toString() {
            int i8 = this.count;
            if (i8 > 0 && this.buf[i8 - 1] == 13) {
                i8--;
            }
            try {
                return new String(this.buf, 0, i8, b.this.f11590b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(c.f11595a)) {
            this.f11589a = fileInputStream;
            this.f11590b = charset;
            this.f11591c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final String c() {
        int i8;
        synchronized (this.f11589a) {
            byte[] bArr = this.f11591c;
            if (bArr != null) {
                if (this.f11592d >= this.f11593e) {
                    int read = this.f11589a.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f11592d = 0;
                        this.f11593e = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i10 = this.f11592d; i10 != this.f11593e; i10++) {
                    byte[] bArr2 = this.f11591c;
                    if (bArr2[i10] == 10) {
                        int i11 = this.f11592d;
                        if (i10 != i11) {
                            i8 = i10 - 1;
                            if (bArr2[i8] == 13) {
                                String str = new String(bArr2, i11, i8 - i11, this.f11590b.name());
                                this.f11592d = i10 + 1;
                                return str;
                            }
                        }
                        i8 = i10;
                        String str2 = new String(bArr2, i11, i8 - i11, this.f11590b.name());
                        this.f11592d = i10 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f11593e - this.f11592d) + 80);
                while (true) {
                    byte[] bArr3 = this.f11591c;
                    int i12 = this.f11592d;
                    aVar.write(bArr3, i12, this.f11593e - i12);
                    this.f11593e = -1;
                    byte[] bArr4 = this.f11591c;
                    int read2 = this.f11589a.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f11592d = 0;
                        this.f11593e = read2;
                        int i13 = 0;
                        while (true) {
                            if (i13 != this.f11593e) {
                                byte[] bArr5 = this.f11591c;
                                if (bArr5[i13] == 10) {
                                    int i14 = this.f11592d;
                                    if (i13 != i14) {
                                        aVar.write(bArr5, i14, i13 - i14);
                                    }
                                    this.f11592d = i13 + 1;
                                    String aVar2 = aVar.toString();
                                    return aVar2;
                                }
                                i13++;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    public final void close() {
        synchronized (this.f11589a) {
            if (this.f11591c != null) {
                this.f11591c = null;
                this.f11589a.close();
            }
        }
    }
}
