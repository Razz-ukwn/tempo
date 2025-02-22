package y4;

import ag.b1;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class j implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f17187a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f17188b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f17189a;

        public a(ByteBuffer byteBuffer) {
            this.f17189a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final int a() {
            return (c() << 8) | c();
        }

        public final int b(byte[] bArr, int i8) {
            ByteBuffer byteBuffer = this.f17189a;
            int min = Math.min(i8, byteBuffer.remaining());
            if (min == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, min);
            return min;
        }

        public final short c() {
            ByteBuffer byteBuffer = this.f17189a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new c.a();
        }

        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f17189a;
            int min = (int) Math.min((long) byteBuffer.remaining(), j10);
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f17190a;

        public b(byte[] bArr, int i8) {
            this.f17190a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i8);
        }

        public final short a(int i8) {
            ByteBuffer byteBuffer = this.f17190a;
            if (byteBuffer.remaining() - i8 >= 2) {
                return byteBuffer.getShort(i8);
            }
            return -1;
        }
    }

    public interface c {

        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i8);

        short c();

        long skip(long j10);
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f17191a;

        public d(InputStream inputStream) {
            this.f17191a = inputStream;
        }

        public final int a() {
            return (c() << 8) | c();
        }

        public final int b(byte[] bArr, int i8) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8 && (i11 = this.f17191a.read(bArr, i10, i8 - i10)) != -1) {
                i10 += i11;
            }
            if (i10 != 0 || i11 != -1) {
                return i10;
            }
            throw new c.a();
        }

        public final short c() {
            int read = this.f17191a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        public final long skip(long j10) {
            if (j10 < 0) {
                return 0;
            }
            long j11 = j10;
            while (j11 > 0) {
                InputStream inputStream = this.f17191a;
                long skip = inputStream.skip(j11);
                if (skip > 0) {
                    j11 -= skip;
                } else if (inputStream.read() == -1) {
                    break;
                } else {
                    j11--;
                }
            }
            return j10 - j11;
        }
    }

    public static int e(c cVar, s4.b bVar) {
        byte[] bArr;
        try {
            int a10 = cVar.a();
            if (!((a10 & 65496) == 65496 || a10 == 19789 || a10 == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a10);
                }
                return -1;
            }
            int g10 = g(cVar);
            if (g10 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.c(g10, byte[].class);
            int h3 = h(cVar, bArr, g10);
            bVar.put(bArr);
            return h3;
        } catch (c.a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.put(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser.ImageType f(y4.j.c r7) {
        /*
            int r0 = r7.a()     // Catch:{ a -> 0x00fa }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00fa }
            return r7
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r7.c()     // Catch:{ a -> 0x00fa }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00fa }
            return r7
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r7.c()     // Catch:{ a -> 0x00fa }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r7.skip(r0)     // Catch:{ a -> 0x00fa }
            short r7 = r7.c()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r7 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r7
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00fa }
            return r7
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            r2 = 4
            if (r0 == r1) goto L_0x0099
            int r1 = r7.a()     // Catch:{ a -> 0x00fa }
            int r1 = r1 << 16
            int r4 = r7.a()     // Catch:{ a -> 0x00fa }
            r1 = r1 | r4
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r5 = 0
            if (r1 == r4) goto L_0x0055
            goto L_0x0091
        L_0x0055:
            int r1 = r7.a()     // Catch:{ a -> 0x00fa }
            int r1 = r1 << 16
            int r4 = r7.a()     // Catch:{ a -> 0x00fa }
            r1 = r1 | r4
            r4 = 1635150182(0x61766966, float:2.8409336E20)
            if (r1 == r4) goto L_0x0090
            r6 = 1635150195(0x61766973, float:2.8409359E20)
            if (r1 != r6) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            r7.skip(r2)     // Catch:{ a -> 0x00fa }
            int r0 = r0 + -16
            int r1 = r0 % 4
            if (r1 == 0) goto L_0x0075
            goto L_0x0091
        L_0x0075:
            r1 = r5
        L_0x0076:
            r2 = 5
            if (r1 >= r2) goto L_0x0091
            if (r0 <= 0) goto L_0x0091
            int r2 = r7.a()     // Catch:{ a -> 0x00fa }
            int r2 = r2 << 16
            int r3 = r7.a()     // Catch:{ a -> 0x00fa }
            r2 = r2 | r3
            if (r2 == r4) goto L_0x0090
            if (r2 != r6) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            int r1 = r1 + 1
            int r0 = r0 + -4
            goto L_0x0076
        L_0x0090:
            r5 = 1
        L_0x0091:
            if (r5 == 0) goto L_0x0096
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.AVIF     // Catch:{ a -> 0x00fa }
            goto L_0x0098
        L_0x0096:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00fa }
        L_0x0098:
            return r7
        L_0x0099:
            r7.skip(r2)     // Catch:{ a -> 0x00fa }
            int r0 = r7.a()     // Catch:{ a -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.a()     // Catch:{ a -> 0x00fa }
            r0 = r0 | r1
            r1 = 1464156752(0x57454250, float:2.16888601E14)
            if (r0 == r1) goto L_0x00af
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00af:
            int r0 = r7.a()     // Catch:{ a -> 0x00fa }
            int r0 = r0 << 16
            int r1 = r7.a()     // Catch:{ a -> 0x00fa }
            r0 = r0 | r1
            r1 = r0 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r4) goto L_0x00c4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00c4:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 88
            if (r0 != r1) goto L_0x00e2
            r7.skip(r2)     // Catch:{ a -> 0x00fa }
            short r7 = r7.c()     // Catch:{ a -> 0x00fa }
            r0 = r7 & 2
            if (r0 == 0) goto L_0x00d8
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00d8:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x00df
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00df:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00e2:
            r1 = 76
            if (r0 != r1) goto L_0x00f7
            r7.skip(r2)     // Catch:{ a -> 0x00fa }
            short r7 = r7.c()     // Catch:{ a -> 0x00fa }
            r7 = r7 & 8
            if (r7 == 0) goto L_0x00f4
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00fa }
            goto L_0x00f6
        L_0x00f4:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00fa }
        L_0x00f6:
            return r7
        L_0x00f7:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00fa }
            return r7
        L_0x00fa:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.j.f(y4.j$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public static int g(c cVar) {
        short c3;
        int a10;
        long j10;
        long skip;
        do {
            short c10 = cVar.c();
            if (c10 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + c10);
                }
                return -1;
            }
            c3 = cVar.c();
            if (c3 == 218) {
                return -1;
            }
            if (c3 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a10 = cVar.a() - 2;
            if (c3 == 225) {
                return a10;
            }
            j10 = (long) a10;
            skip = cVar.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + c3 + ", wanted to skip: " + a10 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public static int h(c cVar, byte[] bArr, int i8) {
        ByteOrder byteOrder;
        byte[] bArr2 = bArr;
        int i10 = i8;
        int b10 = cVar.b(bArr, i8);
        if (b10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + b10);
            }
            return -1;
        }
        short s10 = 1;
        byte[] bArr3 = f17187a;
        boolean z10 = bArr2 != null && i10 > bArr3.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                if (i11 >= bArr3.length) {
                    break;
                } else if (bArr2[i11] != bArr3[i11]) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (z10) {
            b bVar = new b(bArr2, i10);
            short a10 = bVar.a(6);
            if (a10 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (a10 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a10);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            ByteBuffer byteBuffer = bVar.f17190a;
            byteBuffer.order(byteOrder);
            int i12 = (byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1) + 6;
            short a11 = bVar.a(i12);
            int i13 = 0;
            while (i13 < a11) {
                int i14 = (i13 * 12) + i12 + 2;
                short a12 = bVar.a(i14);
                if (a12 == 274) {
                    short a13 = bVar.a(i14 + 2);
                    if (a13 >= s10 && a13 <= 12) {
                        int i15 = i14 + 4;
                        int i16 = (byteBuffer.remaining() - i15 >= 4 ? s10 : 0) != 0 ? byteBuffer.getInt(i15) : -1;
                        if (i16 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i13 + " tagType=" + a12 + " formatCode=" + a13 + " componentCount=" + i16);
                            }
                            int i17 = i16 + f17188b[a13];
                            if (i17 <= 4) {
                                int i18 = i14 + 8;
                                if (i18 < 0 || i18 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i18 + " tagType=" + a12);
                                    }
                                } else if (i17 >= 0 && i17 + i18 <= byteBuffer.remaining()) {
                                    return bVar.a(i18);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a12);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a13);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + a13);
                    }
                }
                i13++;
                s10 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        b1.b(byteBuffer);
        return f(new a(byteBuffer));
    }

    public final int b(ByteBuffer byteBuffer, s4.b bVar) {
        b1.b(byteBuffer);
        a aVar = new a(byteBuffer);
        b1.b(bVar);
        return e(aVar, bVar);
    }

    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        b1.b(inputStream);
        return f(new d(inputStream));
    }

    public final int d(InputStream inputStream, s4.b bVar) {
        b1.b(inputStream);
        d dVar = new d(inputStream);
        b1.b(bVar);
        return e(dVar, bVar);
    }
}
