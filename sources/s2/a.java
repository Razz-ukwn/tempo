package s2;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.system.OsConstants;
import android.util.Log;
import androidx.appcompat.widget.a1;
import androidx.fragment.app.q;
import b3.x;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import s2.b;

public final class a {
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};
    public static final String[] D = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] E = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] F = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final d G = new d("StripOffsets", 273, 3);
    public static final d[][] H;
    public static final d[] I = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, d>[] J = new HashMap[10];
    public static final HashMap<String, d>[] K = new HashMap[10];
    public static final HashSet<String> L = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap<Integer, Integer> M = new HashMap<>();
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f14549l = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> m = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: n  reason: collision with root package name */
    public static final List<Integer> f14550n = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f14551o = {8, 8, 8};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f14552p = {8};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f14553q = {-1, -40, -1};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f14554r = {102, 116, 121, 112};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f14555s = {109, 105, 102, 49};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f14556t = {104, 101, 105, 99};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f14557u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f14558v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f14559w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f14560x = {101, 88, 73, 102};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f14561y = {73, 72, 68, 82};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f14562z = {73, 69, 78, 68};

    /* renamed from: a  reason: collision with root package name */
    public final FileDescriptor f14563a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f14564b;

    /* renamed from: c  reason: collision with root package name */
    public int f14565c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, c>[] f14566d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f14567e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f14568f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14569g;

    /* renamed from: h  reason: collision with root package name */
    public int f14570h;

    /* renamed from: i  reason: collision with root package name */
    public int f14571i;

    /* renamed from: j  reason: collision with root package name */
    public int f14572j;

    /* renamed from: k  reason: collision with root package name */
    public int f14573k;

    /* renamed from: s2.a$a  reason: collision with other inner class name */
    public class C0274a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        public long f14574a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f14575b;

        public C0274a(f fVar) {
            this.f14575b = fVar;
        }

        public final void close() {
        }

        public final long getSize() {
            return -1;
        }

        public final int readAt(long j10, byte[] bArr, int i8, int i10) {
            if (i10 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f14574a;
                int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
                f fVar = this.f14575b;
                if (i11 != 0) {
                    if (j11 >= 0) {
                        if (j10 >= j11 + ((long) fVar.available())) {
                            return -1;
                        }
                    }
                    fVar.d(j10);
                    this.f14574a = j10;
                }
                if (i10 > fVar.available()) {
                    i10 = fVar.available();
                }
                int read = fVar.read(bArr, i8, i10);
                if (read >= 0) {
                    this.f14574a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f14574a = -1;
            return -1;
        }
    }

    public static class b extends InputStream implements DataInput {
        public static final ByteOrder B = ByteOrder.BIG_ENDIAN;

        /* renamed from: e  reason: collision with root package name */
        public static final ByteOrder f14576e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        public final DataInputStream f14577a;

        /* renamed from: b  reason: collision with root package name */
        public ByteOrder f14578b;

        /* renamed from: c  reason: collision with root package name */
        public int f14579c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f14580d;

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        public final int available() {
            return this.f14577a.available();
        }

        public final void c(int i8) {
            int i10 = 0;
            while (i10 < i8) {
                DataInputStream dataInputStream = this.f14577a;
                int i11 = i8 - i10;
                int skip = (int) dataInputStream.skip((long) i11);
                if (skip <= 0) {
                    if (this.f14580d == null) {
                        this.f14580d = new byte[8192];
                    }
                    skip = dataInputStream.read(this.f14580d, 0, Math.min(8192, i11));
                    if (skip == -1) {
                        throw new EOFException(d.a.a("Reached EOF while skipping ", i8, " bytes."));
                    }
                }
                i10 += skip;
            }
            this.f14579c += i10;
        }

        public final void mark(int i8) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public final int read() {
            this.f14579c++;
            return this.f14577a.read();
        }

        public final boolean readBoolean() {
            this.f14579c++;
            return this.f14577a.readBoolean();
        }

        public final byte readByte() {
            this.f14579c++;
            int read = this.f14577a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public final char readChar() {
            this.f14579c += 2;
            return this.f14577a.readChar();
        }

        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public final void readFully(byte[] bArr, int i8, int i10) {
            this.f14579c += i10;
            this.f14577a.readFully(bArr, i8, i10);
        }

        public final int readInt() {
            this.f14579c += 4;
            DataInputStream dataInputStream = this.f14577a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f14578b;
                if (byteOrder == f14576e) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == B) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f14578b);
            }
            throw new EOFException();
        }

        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public final long readLong() {
            this.f14579c += 8;
            DataInputStream dataInputStream = this.f14577a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f14578b;
                if (byteOrder == f14576e) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i8 = read;
                if (byteOrder == B) {
                    return (((long) i8) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f14578b);
            }
            throw new EOFException();
        }

        public final short readShort() {
            this.f14579c += 2;
            DataInputStream dataInputStream = this.f14577a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f14578b;
                if (byteOrder == f14576e) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == B) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f14578b);
            }
            throw new EOFException();
        }

        public final String readUTF() {
            this.f14579c += 2;
            return this.f14577a.readUTF();
        }

        public final int readUnsignedByte() {
            this.f14579c++;
            return this.f14577a.readUnsignedByte();
        }

        public final int readUnsignedShort() {
            this.f14579c += 2;
            DataInputStream dataInputStream = this.f14577a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f14578b;
                if (byteOrder == f14576e) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == B) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f14578b);
            }
            throw new EOFException();
        }

        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public final int skipBytes(int i8) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            this.f14578b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f14577a = dataInputStream;
            dataInputStream.mark(0);
            this.f14579c = 0;
            this.f14578b = byteOrder;
        }

        public final int read(byte[] bArr, int i8, int i10) {
            int read = this.f14577a.read(bArr, i8, i10);
            this.f14579c += read;
            return read;
        }

        public final void readFully(byte[] bArr) {
            this.f14579c += bArr.length;
            this.f14577a.readFully(bArr);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f14581a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14582b;

        /* renamed from: c  reason: collision with root package name */
        public final long f14583c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f14584d;

        public c(byte[] bArr, int i8, int i10) {
            this(-1, bArr, i8, i10);
        }

        public static c a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.N);
            return new c(bytes, 2, bytes.length);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            long[] jArr = {j10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.E[4] * 1)]);
            wrap.order(byteOrder);
            wrap.putInt((int) jArr[0]);
            return new c(wrap.array(), 4, 1);
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.E[5] * 1)]);
            wrap.order(byteOrder);
            e eVar2 = eVarArr[0];
            wrap.putInt((int) eVar2.f14589a);
            wrap.putInt((int) eVar2.f14590b);
            return new c(wrap.array(), 5, 1);
        }

        public static c d(int i8, ByteOrder byteOrder) {
            int[] iArr = {i8};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.E[3] * 1)]);
            wrap.order(byteOrder);
            wrap.putShort((short) iArr[0]);
            return new c(wrap.array(), 3, 1);
        }

        public final double e(ByteOrder byteOrder) {
            Serializable h3 = h(byteOrder);
            if (h3 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (h3 instanceof String) {
                return Double.parseDouble((String) h3);
            } else {
                if (h3 instanceof long[]) {
                    long[] jArr = (long[]) h3;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h3 instanceof int[]) {
                    int[] iArr = (int[]) h3;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h3 instanceof double[]) {
                    double[] dArr = (double[]) h3;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h3 instanceof e[]) {
                    e[] eVarArr = (e[]) h3;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return ((double) eVar.f14589a) / ((double) eVar.f14590b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public final int f(ByteOrder byteOrder) {
            Serializable h3 = h(byteOrder);
            if (h3 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (h3 instanceof String) {
                return Integer.parseInt((String) h3);
            } else {
                if (h3 instanceof long[]) {
                    long[] jArr = (long[]) h3;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h3 instanceof int[]) {
                    int[] iArr = (int[]) h3;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public final String g(ByteOrder byteOrder) {
            Serializable h3 = h(byteOrder);
            if (h3 == null) {
                return null;
            }
            if (h3 instanceof String) {
                return (String) h3;
            }
            StringBuilder sb2 = new StringBuilder();
            int i8 = 0;
            if (h3 instanceof long[]) {
                long[] jArr = (long[]) h3;
                while (i8 < jArr.length) {
                    sb2.append(jArr[i8]);
                    i8++;
                    if (i8 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h3 instanceof int[]) {
                int[] iArr = (int[]) h3;
                while (i8 < iArr.length) {
                    sb2.append(iArr[i8]);
                    i8++;
                    if (i8 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h3 instanceof double[]) {
                double[] dArr = (double[]) h3;
                while (i8 < dArr.length) {
                    sb2.append(dArr[i8]);
                    i8++;
                    if (i8 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(h3 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) h3;
                while (i8 < eVarArr.length) {
                    sb2.append(eVarArr[i8].f14589a);
                    sb2.append('/');
                    sb2.append(eVarArr[i8].f14590b);
                    i8++;
                    if (i8 != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARNING: type inference failed for: r15v23, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r15v24, types: [long[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r15v25, types: [s2.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r15v27, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r15v28, types: [s2.a$e[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r15v30, types: [double[], java.io.Serializable] */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x017f A[SYNTHETIC, Splitter:B:155:0x017f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.Serializable h(java.nio.ByteOrder r15) {
            /*
                r14 = this;
                byte[] r0 = r14.f14584d
                java.lang.String r1 = "IOException occurred while closing InputStream"
                java.lang.String r2 = "ExifInterface"
                r3 = 0
                s2.a$b r4 = new s2.a$b     // Catch:{ IOException -> 0x016b, all -> 0x0169 }
                r4.<init>((byte[]) r0)     // Catch:{ IOException -> 0x016b, all -> 0x0169 }
                r4.f14578b = r15     // Catch:{ IOException -> 0x00b2 }
                int r15 = r14.f14581a     // Catch:{ IOException -> 0x00b2 }
                r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
                r7 = 1
                r8 = 0
                int r9 = r14.f14582b
                switch(r15) {
                    case 1: goto L_0x012f;
                    case 2: goto L_0x00ec;
                    case 3: goto L_0x00d6;
                    case 4: goto L_0x00be;
                    case 5: goto L_0x0098;
                    case 6: goto L_0x012f;
                    case 7: goto L_0x00ec;
                    case 8: goto L_0x0082;
                    case 9: goto L_0x006c;
                    case 10: goto L_0x004b;
                    case 11: goto L_0x0034;
                    case 12: goto L_0x001e;
                    default: goto L_0x001c;
                }
            L_0x001c:
                goto L_0x015d
            L_0x001e:
                double[] r15 = new double[r9]     // Catch:{ IOException -> 0x00b2 }
            L_0x0020:
                if (r8 >= r9) goto L_0x002b
                double r5 = r4.readDouble()     // Catch:{ IOException -> 0x00b2 }
                r15[r8] = r5     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x0020
            L_0x002b:
                r4.close()     // Catch:{ IOException -> 0x002f }
                goto L_0x0033
            L_0x002f:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x0033:
                return r15
            L_0x0034:
                double[] r15 = new double[r9]     // Catch:{ IOException -> 0x00b2 }
            L_0x0036:
                if (r8 >= r9) goto L_0x0042
                float r0 = r4.readFloat()     // Catch:{ IOException -> 0x00b2 }
                double r5 = (double) r0     // Catch:{ IOException -> 0x00b2 }
                r15[r8] = r5     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x0036
            L_0x0042:
                r4.close()     // Catch:{ IOException -> 0x0046 }
                goto L_0x004a
            L_0x0046:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x004a:
                return r15
            L_0x004b:
                s2.a$e[] r15 = new s2.a.e[r9]     // Catch:{ IOException -> 0x00b2 }
            L_0x004d:
                if (r8 >= r9) goto L_0x0063
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r5 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r10 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                s2.a$e r0 = new s2.a$e     // Catch:{ IOException -> 0x00b2 }
                r0.<init>(r5, r10)     // Catch:{ IOException -> 0x00b2 }
                r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x004d
            L_0x0063:
                r4.close()     // Catch:{ IOException -> 0x0067 }
                goto L_0x006b
            L_0x0067:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x006b:
                return r15
            L_0x006c:
                int[] r15 = new int[r9]     // Catch:{ IOException -> 0x00b2 }
            L_0x006e:
                if (r8 >= r9) goto L_0x0079
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x006e
            L_0x0079:
                r4.close()     // Catch:{ IOException -> 0x007d }
                goto L_0x0081
            L_0x007d:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x0081:
                return r15
            L_0x0082:
                int[] r15 = new int[r9]     // Catch:{ IOException -> 0x00b2 }
            L_0x0084:
                if (r8 >= r9) goto L_0x008f
                short r0 = r4.readShort()     // Catch:{ IOException -> 0x00b2 }
                r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x0084
            L_0x008f:
                r4.close()     // Catch:{ IOException -> 0x0093 }
                goto L_0x0097
            L_0x0093:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x0097:
                return r15
            L_0x0098:
                s2.a$e[] r15 = new s2.a.e[r9]     // Catch:{ IOException -> 0x00b2 }
            L_0x009a:
                if (r8 >= r9) goto L_0x00b5
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r10 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                long r10 = r10 & r5
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r12 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                long r12 = r12 & r5
                s2.a$e r0 = new s2.a$e     // Catch:{ IOException -> 0x00b2 }
                r0.<init>(r10, r12)     // Catch:{ IOException -> 0x00b2 }
                r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x009a
            L_0x00b2:
                r15 = move-exception
                goto L_0x016d
            L_0x00b5:
                r4.close()     // Catch:{ IOException -> 0x00b9 }
                goto L_0x00bd
            L_0x00b9:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x00bd:
                return r15
            L_0x00be:
                long[] r15 = new long[r9]     // Catch:{ IOException -> 0x00b2 }
            L_0x00c0:
                if (r8 >= r9) goto L_0x00cd
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00b2 }
                long r10 = (long) r0     // Catch:{ IOException -> 0x00b2 }
                long r10 = r10 & r5
                r15[r8] = r10     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x00c0
            L_0x00cd:
                r4.close()     // Catch:{ IOException -> 0x00d1 }
                goto L_0x00d5
            L_0x00d1:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x00d5:
                return r15
            L_0x00d6:
                int[] r15 = new int[r9]     // Catch:{ IOException -> 0x00b2 }
            L_0x00d8:
                if (r8 >= r9) goto L_0x00e3
                int r0 = r4.readUnsignedShort()     // Catch:{ IOException -> 0x00b2 }
                r15[r8] = r0     // Catch:{ IOException -> 0x00b2 }
                int r8 = r8 + 1
                goto L_0x00d8
            L_0x00e3:
                r4.close()     // Catch:{ IOException -> 0x00e7 }
                goto L_0x00eb
            L_0x00e7:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x00eb:
                return r15
            L_0x00ec:
                byte[] r15 = s2.a.F     // Catch:{ IOException -> 0x00b2 }
                int r15 = r15.length     // Catch:{ IOException -> 0x00b2 }
                if (r9 < r15) goto L_0x0105
                r15 = r8
            L_0x00f2:
                byte[] r5 = s2.a.F     // Catch:{ IOException -> 0x00b2 }
                int r6 = r5.length     // Catch:{ IOException -> 0x00b2 }
                if (r15 >= r6) goto L_0x0102
                byte r6 = r0[r15]     // Catch:{ IOException -> 0x00b2 }
                byte r10 = r5[r15]     // Catch:{ IOException -> 0x00b2 }
                if (r6 == r10) goto L_0x00ff
                r7 = r8
                goto L_0x0102
            L_0x00ff:
                int r15 = r15 + 1
                goto L_0x00f2
            L_0x0102:
                if (r7 == 0) goto L_0x0105
                int r8 = r5.length     // Catch:{ IOException -> 0x00b2 }
            L_0x0105:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b2 }
                r15.<init>()     // Catch:{ IOException -> 0x00b2 }
            L_0x010a:
                if (r8 >= r9) goto L_0x0122
                byte r5 = r0[r8]     // Catch:{ IOException -> 0x00b2 }
                if (r5 != 0) goto L_0x0111
                goto L_0x0122
            L_0x0111:
                r6 = 32
                if (r5 < r6) goto L_0x011a
                char r5 = (char) r5     // Catch:{ IOException -> 0x00b2 }
                r15.append(r5)     // Catch:{ IOException -> 0x00b2 }
                goto L_0x011f
            L_0x011a:
                r5 = 63
                r15.append(r5)     // Catch:{ IOException -> 0x00b2 }
            L_0x011f:
                int r8 = r8 + 1
                goto L_0x010a
            L_0x0122:
                java.lang.String r15 = r15.toString()     // Catch:{ IOException -> 0x00b2 }
                r4.close()     // Catch:{ IOException -> 0x012a }
                goto L_0x012e
            L_0x012a:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x012e:
                return r15
            L_0x012f:
                int r15 = r0.length     // Catch:{ IOException -> 0x00b2 }
                if (r15 != r7) goto L_0x014d
                byte r15 = r0[r8]     // Catch:{ IOException -> 0x00b2 }
                if (r15 < 0) goto L_0x014d
                if (r15 > r7) goto L_0x014d
                java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x00b2 }
                char[] r5 = new char[r7]     // Catch:{ IOException -> 0x00b2 }
                int r15 = r15 + 48
                char r15 = (char) r15     // Catch:{ IOException -> 0x00b2 }
                r5[r8] = r15     // Catch:{ IOException -> 0x00b2 }
                r0.<init>(r5)     // Catch:{ IOException -> 0x00b2 }
                r4.close()     // Catch:{ IOException -> 0x0148 }
                goto L_0x014c
            L_0x0148:
                r15 = move-exception
                android.util.Log.e(r2, r1, r15)
            L_0x014c:
                return r0
            L_0x014d:
                java.lang.String r15 = new java.lang.String     // Catch:{ IOException -> 0x00b2 }
                java.nio.charset.Charset r5 = s2.a.N     // Catch:{ IOException -> 0x00b2 }
                r15.<init>(r0, r5)     // Catch:{ IOException -> 0x00b2 }
                r4.close()     // Catch:{ IOException -> 0x0158 }
                goto L_0x015c
            L_0x0158:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x015c:
                return r15
            L_0x015d:
                r4.close()     // Catch:{ IOException -> 0x0161 }
                goto L_0x0165
            L_0x0161:
                r15 = move-exception
                android.util.Log.e(r2, r1, r15)
            L_0x0165:
                return r3
            L_0x0166:
                r15 = move-exception
                r3 = r4
                goto L_0x017d
            L_0x0169:
                r15 = move-exception
                goto L_0x017d
            L_0x016b:
                r15 = move-exception
                r4 = r3
            L_0x016d:
                java.lang.String r0 = "IOException occurred during reading a value"
                android.util.Log.w(r2, r0, r15)     // Catch:{ all -> 0x0166 }
                if (r4 == 0) goto L_0x017c
                r4.close()     // Catch:{ IOException -> 0x0178 }
                goto L_0x017c
            L_0x0178:
                r15 = move-exception
                android.util.Log.e(r2, r1, r15)
            L_0x017c:
                return r3
            L_0x017d:
                if (r3 == 0) goto L_0x0187
                r3.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x0187
            L_0x0183:
                r0 = move-exception
                android.util.Log.e(r2, r1, r0)
            L_0x0187:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: s2.a.c.h(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(a.D[this.f14581a]);
            sb2.append(", data length:");
            return x.b(sb2, this.f14584d.length, ")");
        }

        public c(long j10, byte[] bArr, int i8, int i10) {
            this.f14581a = i8;
            this.f14582b = i10;
            this.f14583c = j10;
            this.f14584d = bArr;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f14589a;

        /* renamed from: b  reason: collision with root package name */
        public final long f14590b;

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f14589a = 0;
                this.f14590b = 1;
                return;
            }
            this.f14589a = j10;
            this.f14590b = j11;
        }

        public final String toString() {
            return this.f14589a + "/" + this.f14590b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        H = new d[][]{dVarArr, new d[]{new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")}, new d[]{new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)}, new d[]{new d("InteroperabilityIndex", 1, 2)}, new d[]{new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")}, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        N = forName;
        O = "Exif\u0000\u0000".getBytes(forName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i8 = 0;
        while (true) {
            d[][] dVarArr2 = H;
            if (i8 < dVarArr2.length) {
                J[i8] = new HashMap<>();
                K[i8] = new HashMap<>();
                for (d dVar : dVarArr2[i8]) {
                    J[i8].put(Integer.valueOf(dVar.f14585a), dVar);
                    K[i8].put(dVar.f14586b, dVar);
                }
                i8++;
            } else {
                HashMap<Integer, Integer> hashMap = M;
                d[] dVarArr3 = I;
                hashMap.put(Integer.valueOf(dVarArr3[0].f14585a), 5);
                hashMap.put(Integer.valueOf(dVarArr3[1].f14585a), 1);
                hashMap.put(Integer.valueOf(dVarArr3[2].f14585a), 2);
                hashMap.put(Integer.valueOf(dVarArr3[3].f14585a), 3);
                hashMap.put(Integer.valueOf(dVarArr3[4].f14585a), 7);
                hashMap.put(Integer.valueOf(dVarArr3[5].f14585a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public a(InputStream inputStream) {
        boolean z10;
        d[][] dVarArr = H;
        this.f14566d = new HashMap[dVarArr.length];
        this.f14567e = new HashSet(dVarArr.length);
        if (inputStream != null) {
            boolean z11 = inputStream instanceof AssetManager.AssetInputStream;
            boolean z12 = true;
            boolean z13 = f14549l;
            if (z11) {
                this.f14564b = (AssetManager.AssetInputStream) inputStream;
                this.f14563a = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        b.a.c(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                        z10 = true;
                    } catch (Exception unused) {
                        if (z13) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z10 = false;
                    }
                    if (z10) {
                        this.f14564b = null;
                        this.f14563a = fileInputStream.getFD();
                    }
                }
                this.f14564b = null;
                this.f14563a = null;
            }
            int i8 = 0;
            while (i8 < dVarArr.length) {
                try {
                    this.f14566d[i8] = new HashMap<>();
                    i8++;
                } catch (IOException | UnsupportedOperationException e10) {
                    if (z13) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    a();
                    if (!z13) {
                        return;
                    }
                } catch (Throwable th) {
                    a();
                    if (z13) {
                        q();
                    }
                    throw th;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            int g10 = g(bufferedInputStream);
            this.f14565c = g10;
            if ((g10 == 4 || g10 == 9 || g10 == 13 || g10 == 14) ? false : z12) {
                f fVar = new f((InputStream) bufferedInputStream);
                int i10 = this.f14565c;
                if (i10 == 12) {
                    e(fVar);
                } else if (i10 == 7) {
                    h(fVar);
                } else if (i10 == 10) {
                    l(fVar);
                } else {
                    k(fVar);
                }
                fVar.d((long) this.f14570h);
                v(fVar);
            } else {
                b bVar = new b((InputStream) bufferedInputStream);
                int i11 = this.f14565c;
                if (i11 == 4) {
                    f(bVar, 0, 0);
                } else if (i11 == 13) {
                    i(bVar);
                } else if (i11 == 9) {
                    j(bVar);
                } else if (i11 == 14) {
                    m(bVar);
                }
            }
            a();
            if (!z13) {
                return;
            }
            q();
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public static ByteOrder r(b bVar) {
        short readShort = bVar.readShort();
        boolean z10 = f14549l;
        if (readShort == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        HashMap<String, c>[] hashMapArr = this.f14566d;
        if (b10 != null && b("DateTime") == null) {
            hashMapArr[0].put("DateTime", c.a(b10));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.b(0, this.f14568f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.b(0, this.f14568f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.b(0, this.f14568f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.b(0, this.f14568f));
        }
    }

    public final String b(String str) {
        c d10 = d(str);
        if (d10 != null) {
            if (!L.contains(str)) {
                return d10.g(this.f14568f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i8 = d10.f14581a;
                if (i8 == 5 || i8 == 10) {
                    e[] eVarArr = (e[]) d10.h(this.f14568f);
                    if (eVarArr == null || eVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                        return null;
                    }
                    e eVar = eVarArr[0];
                    e eVar2 = eVarArr[1];
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVar.f14589a) / ((float) eVar.f14590b))), Integer.valueOf((int) (((float) eVar2.f14589a) / ((float) eVar2.f14590b))), Integer.valueOf((int) (((float) eVar3.f14589a) / ((float) eVar3.f14590b)))});
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i8);
                return null;
            }
            try {
                return Double.toString(d10.e(this.f14568f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        c d10 = d("Orientation");
        if (d10 == null) {
            return 1;
        }
        try {
            return d10.f(this.f14568f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final c d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f14549l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i8 = 0; i8 < H.length; i8++) {
            c cVar = this.f14566d[i8].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:55|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0131, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013a, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013b, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013e, code lost:
        throw r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0133 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(s2.a.f r14) {
        /*
            r13 = this;
            java.lang.String r0 = "yes"
            java.lang.String r1 = "Heif meta: "
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x013f
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            s2.a$a r3 = new s2.a$a     // Catch:{ RuntimeException -> 0x0133 }
            r3.<init>(r14)     // Catch:{ RuntimeException -> 0x0133 }
            s2.b.C0275b.a(r2, r3)     // Catch:{ RuntimeException -> 0x0133 }
            r3 = 33
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0133 }
            r4 = 34
            java.lang.String r4 = r2.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0133 }
            r5 = 26
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0133 }
            r6 = 17
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x0133 }
            boolean r5 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0133 }
            if (r5 == 0) goto L_0x0048
            r0 = 29
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0133 }
            r5 = 30
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0133 }
            r6 = 31
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x0133 }
            goto L_0x0064
        L_0x0048:
            boolean r0 = r0.equals(r6)     // Catch:{ RuntimeException -> 0x0133 }
            if (r0 == 0) goto L_0x0061
            r0 = 18
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0133 }
            r5 = 19
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0133 }
            r6 = 24
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x0133 }
            goto L_0x0064
        L_0x0061:
            r0 = 0
            r5 = r0
            r6 = r5
        L_0x0064:
            java.util.HashMap<java.lang.String, s2.a$c>[] r7 = r13.f14566d
            r8 = 0
            if (r0 == 0) goto L_0x007a
            r9 = r7[r8]     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r10 = "ImageWidth"
            int r11 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0133 }
            java.nio.ByteOrder r12 = r13.f14568f     // Catch:{ RuntimeException -> 0x0133 }
            s2.a$c r11 = s2.a.c.d(r11, r12)     // Catch:{ RuntimeException -> 0x0133 }
            r9.put(r10, r11)     // Catch:{ RuntimeException -> 0x0133 }
        L_0x007a:
            if (r5 == 0) goto L_0x008d
            r9 = r7[r8]     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r10 = "ImageLength"
            int r11 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x0133 }
            java.nio.ByteOrder r12 = r13.f14568f     // Catch:{ RuntimeException -> 0x0133 }
            s2.a$c r11 = s2.a.c.d(r11, r12)     // Catch:{ RuntimeException -> 0x0133 }
            r9.put(r10, r11)     // Catch:{ RuntimeException -> 0x0133 }
        L_0x008d:
            r9 = 6
            if (r6 == 0) goto L_0x00b5
            int r10 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x0133 }
            r11 = 90
            if (r10 == r11) goto L_0x00a7
            r11 = 180(0xb4, float:2.52E-43)
            if (r10 == r11) goto L_0x00a5
            r11 = 270(0x10e, float:3.78E-43)
            if (r10 == r11) goto L_0x00a2
            r10 = 1
            goto L_0x00a8
        L_0x00a2:
            r10 = 8
            goto L_0x00a8
        L_0x00a5:
            r10 = 3
            goto L_0x00a8
        L_0x00a7:
            r10 = r9
        L_0x00a8:
            r7 = r7[r8]     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r11 = "Orientation"
            java.nio.ByteOrder r12 = r13.f14568f     // Catch:{ RuntimeException -> 0x0133 }
            s2.a$c r10 = s2.a.c.d(r10, r12)     // Catch:{ RuntimeException -> 0x0133 }
            r7.put(r11, r10)     // Catch:{ RuntimeException -> 0x0133 }
        L_0x00b5:
            if (r3 == 0) goto L_0x0108
            if (r4 == 0) goto L_0x0108
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0133 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0133 }
            if (r4 <= r9) goto L_0x0100
            long r10 = (long) r3     // Catch:{ RuntimeException -> 0x0133 }
            r14.d(r10)     // Catch:{ RuntimeException -> 0x0133 }
            byte[] r7 = new byte[r9]     // Catch:{ RuntimeException -> 0x0133 }
            int r10 = r14.read(r7)     // Catch:{ RuntimeException -> 0x0133 }
            if (r10 != r9) goto L_0x00f8
            int r3 = r3 + r9
            int r4 = r4 + -6
            byte[] r9 = O     // Catch:{ RuntimeException -> 0x0133 }
            boolean r7 = java.util.Arrays.equals(r7, r9)     // Catch:{ RuntimeException -> 0x0133 }
            if (r7 == 0) goto L_0x00f0
            byte[] r7 = new byte[r4]     // Catch:{ RuntimeException -> 0x0133 }
            int r14 = r14.read(r7)     // Catch:{ RuntimeException -> 0x0133 }
            if (r14 != r4) goto L_0x00e8
            r13.f14570h = r3     // Catch:{ RuntimeException -> 0x0133 }
            r13.s(r7, r8)     // Catch:{ RuntimeException -> 0x0133 }
            goto L_0x0108
        L_0x00e8:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r0 = "Can't read exif"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x0133 }
            throw r14     // Catch:{ RuntimeException -> 0x0133 }
        L_0x00f0:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r0 = "Invalid identifier"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x0133 }
            throw r14     // Catch:{ RuntimeException -> 0x0133 }
        L_0x00f8:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r0 = "Can't read identifier"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x0133 }
            throw r14     // Catch:{ RuntimeException -> 0x0133 }
        L_0x0100:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r0 = "Invalid exif length"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x0133 }
            throw r14     // Catch:{ RuntimeException -> 0x0133 }
        L_0x0108:
            boolean r14 = f14549l     // Catch:{ RuntimeException -> 0x0133 }
            if (r14 == 0) goto L_0x012d
            java.lang.String r14 = "ExifInterface"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0133 }
            r3.<init>(r1)     // Catch:{ RuntimeException -> 0x0133 }
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r0 = "x"
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0133 }
            r3.append(r5)     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r0 = ", rotation "
            r3.append(r0)     // Catch:{ RuntimeException -> 0x0133 }
            r3.append(r6)     // Catch:{ RuntimeException -> 0x0133 }
            java.lang.String r0 = r3.toString()     // Catch:{ RuntimeException -> 0x0133 }
            android.util.Log.d(r14, r0)     // Catch:{ RuntimeException -> 0x0133 }
        L_0x012d:
            r2.release()
            return
        L_0x0131:
            r14 = move-exception
            goto L_0x013b
        L_0x0133:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0131 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r14.<init>(r0)     // Catch:{ all -> 0x0131 }
            throw r14     // Catch:{ all -> 0x0131 }
        L_0x013b:
            r2.release()
            throw r14
        L_0x013f:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.e(s2.a$f):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018d A[LOOP:0: B:8:0x0034->B:79:0x018d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0195 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(s2.a.b r24, int r25, int r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r26
            java.lang.String r3 = "ExifInterface"
            boolean r4 = f14549l
            if (r4 == 0) goto L_0x001d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getJpegAttributes starting with: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L_0x001d:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f14578b = r5
            byte r5 = r24.readByte()
            r6 = -1
            java.lang.String r7 = "Invalid marker: "
            if (r5 != r6) goto L_0x01d8
            byte r8 = r24.readByte()
            r9 = -40
            if (r8 != r9) goto L_0x01c0
            r5 = 2
            r7 = r5
        L_0x0034:
            byte r8 = r24.readByte()
            if (r8 != r6) goto L_0x01a6
            r8 = 1
            int r7 = r7 + r8
            byte r9 = r24.readByte()
            if (r4 == 0) goto L_0x0059
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Found JPEG segment indicator: "
            r10.<init>(r11)
            r11 = r9 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r3, r10)
        L_0x0059:
            int r7 = r7 + r8
            r10 = -39
            if (r9 == r10) goto L_0x01a1
            r10 = -38
            if (r9 != r10) goto L_0x0064
            goto L_0x01a1
        L_0x0064:
            int r10 = r24.readUnsignedShort()
            int r10 = r10 - r5
            int r7 = r7 + r5
            if (r4 == 0) goto L_0x0092
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "JPEG segment: "
            r11.<init>(r12)
            r12 = r9 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r12 = " (length: "
            r11.append(r12)
            int r12 = r10 + 2
            r11.append(r12)
            java.lang.String r12 = ")"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.d(r3, r11)
        L_0x0092:
            java.lang.String r11 = "Invalid length"
            if (r10 < 0) goto L_0x019b
            r12 = 0
            r13 = -31
            java.util.HashMap<java.lang.String, s2.a$c>[] r14 = r0.f14566d
            if (r9 == r13) goto L_0x010e
            r13 = -2
            if (r9 == r13) goto L_0x00e4
            switch(r9) {
                case -64: goto L_0x00ae;
                case -63: goto L_0x00ae;
                case -62: goto L_0x00ae;
                case -61: goto L_0x00ae;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            switch(r9) {
                case -59: goto L_0x00ae;
                case -58: goto L_0x00ae;
                case -57: goto L_0x00ae;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            switch(r9) {
                case -55: goto L_0x00ae;
                case -54: goto L_0x00ae;
                case -53: goto L_0x00ae;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            switch(r9) {
                case -51: goto L_0x00ae;
                case -50: goto L_0x00ae;
                case -49: goto L_0x00ae;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x018b
        L_0x00ae:
            r1.c(r8)
            r8 = r14[r2]
            r9 = 4
            if (r2 == r9) goto L_0x00b9
            java.lang.String r12 = "ImageLength"
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r12 = "ThumbnailImageLength"
        L_0x00bb:
            int r13 = r24.readUnsignedShort()
            long r5 = (long) r13
            java.nio.ByteOrder r13 = r0.f14568f
            s2.a$c r5 = s2.a.c.b(r5, r13)
            r8.put(r12, r5)
            r5 = r14[r2]
            if (r2 == r9) goto L_0x00d0
            java.lang.String r6 = "ImageWidth"
            goto L_0x00d2
        L_0x00d0:
            java.lang.String r6 = "ThumbnailImageWidth"
        L_0x00d2:
            int r8 = r24.readUnsignedShort()
            long r8 = (long) r8
            java.nio.ByteOrder r12 = r0.f14568f
            s2.a$c r8 = s2.a.c.b(r8, r12)
            r5.put(r6, r8)
            int r10 = r10 + -5
            goto L_0x018b
        L_0x00e4:
            byte[] r5 = new byte[r10]
            int r6 = r1.read(r5)
            if (r6 != r10) goto L_0x0106
            java.lang.String r6 = "UserComment"
            java.lang.String r9 = r0.b(r6)
            if (r9 != 0) goto L_0x018a
            r8 = r14[r8]
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = N
            r9.<init>(r5, r10)
            s2.a$c r5 = s2.a.c.a(r9)
            r8.put(r6, r5)
            goto L_0x018a
        L_0x0106:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x010e:
            byte[] r5 = new byte[r10]
            r1.readFully(r5)
            int r6 = r7 + r10
            byte[] r9 = O
            if (r9 != 0) goto L_0x011b
        L_0x0119:
            r8 = r12
            goto L_0x012e
        L_0x011b:
            int r13 = r9.length
            if (r10 >= r13) goto L_0x011f
            goto L_0x0119
        L_0x011f:
            r13 = r12
        L_0x0120:
            int r8 = r9.length
            if (r13 >= r8) goto L_0x012d
            byte r8 = r5[r13]
            byte r15 = r9[r13]
            if (r8 == r15) goto L_0x012a
            goto L_0x0119
        L_0x012a:
            int r13 = r13 + 1
            goto L_0x0120
        L_0x012d:
            r8 = 1
        L_0x012e:
            if (r8 == 0) goto L_0x0147
            int r8 = r9.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r8, r10)
            int r7 = r25 + r7
            int r8 = r9.length
            int r7 = r7 + r8
            r0.f14570h = r7
            r0.s(r5, r2)
            s2.a$b r7 = new s2.a$b
            r7.<init>((byte[]) r5)
            r0.v(r7)
            goto L_0x0189
        L_0x0147:
            byte[] r8 = P
            if (r8 != 0) goto L_0x014e
        L_0x014b:
            r16 = r12
            goto L_0x0162
        L_0x014e:
            int r9 = r8.length
            if (r10 >= r9) goto L_0x0152
            goto L_0x014b
        L_0x0152:
            r9 = r12
        L_0x0153:
            int r13 = r8.length
            if (r9 >= r13) goto L_0x0160
            byte r13 = r5[r9]
            byte r15 = r8[r9]
            if (r13 == r15) goto L_0x015d
            goto L_0x014b
        L_0x015d:
            int r9 = r9 + 1
            goto L_0x0153
        L_0x0160:
            r16 = 1
        L_0x0162:
            if (r16 == 0) goto L_0x0189
            int r9 = r8.length
            int r9 = r9 + r7
            int r7 = r8.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r7, r10)
            java.lang.String r7 = "Xmp"
            java.lang.String r8 = r0.b(r7)
            if (r8 != 0) goto L_0x0189
            r8 = r14[r12]
            s2.a$c r10 = new s2.a$c
            r21 = 1
            int r13 = r5.length
            long r14 = (long) r9
            r17 = r10
            r18 = r14
            r20 = r5
            r22 = r13
            r17.<init>(r18, r20, r21, r22)
            r8.put(r7, r10)
        L_0x0189:
            r7 = r6
        L_0x018a:
            r10 = r12
        L_0x018b:
            if (r10 < 0) goto L_0x0195
            r1.c(r10)
            int r7 = r7 + r10
            r5 = 2
            r6 = -1
            goto L_0x0034
        L_0x0195:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r11)
            throw r1
        L_0x019b:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r11)
            throw r1
        L_0x01a1:
            java.nio.ByteOrder r2 = r0.f14568f
            r1.f14578b = r2
            return
        L_0x01a6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid marker:"
            r2.<init>(r3)
            r3 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c0:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.f(s2.a$b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cf, code lost:
        if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0143 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8 A[Catch:{ all -> 0x0188 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0111 A[SYNTHETIC, Splitter:B:99:0x0111] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
            r0 = r4
        L_0x0013:
            byte[] r5 = f14553q
            int r6 = r5.length
            if (r0 >= r6) goto L_0x0023
            byte r6 = r3[r0]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x0020
            r0 = r4
            goto L_0x0024
        L_0x0020:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0023:
            r0 = 1
        L_0x0024:
            r5 = 4
            if (r0 == 0) goto L_0x0028
            return r5
        L_0x0028:
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.defaultCharset()
            byte[] r0 = r0.getBytes(r6)
            r6 = r4
        L_0x0033:
            int r8 = r0.length
            if (r6 >= r8) goto L_0x0041
            byte r8 = r3[r6]
            byte r9 = r0[r6]
            if (r8 == r9) goto L_0x003e
            r0 = r4
            goto L_0x0042
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0 = 9
            return r0
        L_0x0047:
            s2.a$b r8 = new s2.a$b     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            r8.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            int r0 = r8.readInt()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            long r9 = (long) r0     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r11 = f14554r     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r0 != 0) goto L_0x0060
            goto L_0x00d1
        L_0x0060:
            r11 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r13 = 8
            if (r0 != 0) goto L_0x0074
            long r9 = r8.readLong()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r15 = 16
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            goto L_0x00d1
        L_0x0074:
            r15 = r13
        L_0x0075:
            long r6 = (long) r2     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            r9 = r6
        L_0x007b:
            long r9 = r9 - r15
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            goto L_0x00d1
        L_0x0081:
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r6 = 0
            r2 = r4
            r13 = r2
        L_0x0087:
            r14 = 4
            long r14 = r9 / r14
            int r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d1
            int r14 = r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == r5) goto L_0x0096
            goto L_0x00d1
        L_0x0096:
            int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x009b
            goto L_0x00b7
        L_0x009b:
            byte[] r14 = f14555s     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00a5
            r2 = 1
            goto L_0x00ae
        L_0x00a5:
            byte[] r14 = f14556t     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00ae
            r13 = 1
        L_0x00ae:
            if (r2 == 0) goto L_0x00b7
            if (r13 == 0) goto L_0x00b7
            r8.close()
            r0 = 1
            goto L_0x00d5
        L_0x00b7:
            long r6 = r6 + r11
            goto L_0x0087
        L_0x00b9:
            r0 = move-exception
            goto L_0x018b
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c4
        L_0x00be:
            r0 = move-exception
            r6 = 0
            goto L_0x018a
        L_0x00c2:
            r0 = move-exception
            r8 = 0
        L_0x00c4:
            boolean r2 = f14549l     // Catch:{ all -> 0x0188 }
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = "ExifInterface"
            java.lang.String r6 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r6, r0)     // Catch:{ all -> 0x0188 }
        L_0x00cf:
            if (r8 == 0) goto L_0x00d4
        L_0x00d1:
            r8.close()
        L_0x00d4:
            r0 = r4
        L_0x00d5:
            if (r0 == 0) goto L_0x00da
            r0 = 12
            return r0
        L_0x00da:
            s2.a$b r2 = new s2.a$b     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            java.nio.ByteOrder r0 = r(r2)     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r1.f14568f = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r2.f14578b = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r6) goto L_0x00f6
            r6 = 21330(0x5352, float:2.989E-41)
            if (r0 != r6) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r0 = r4
            goto L_0x00f7
        L_0x00f6:
            r0 = 1
        L_0x00f7:
            r2.close()
            goto L_0x010d
        L_0x00fb:
            r0 = move-exception
            r6 = r2
            goto L_0x0100
        L_0x00fe:
            r0 = move-exception
            r6 = 0
        L_0x0100:
            if (r6 == 0) goto L_0x0105
            r6.close()
        L_0x0105:
            throw r0
        L_0x0106:
            r2 = 0
        L_0x0107:
            if (r2 == 0) goto L_0x010c
            r2.close()
        L_0x010c:
            r0 = r4
        L_0x010d:
            if (r0 == 0) goto L_0x0111
            r0 = 7
            return r0
        L_0x0111:
            s2.a$b r2 = new s2.a$b     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            java.nio.ByteOrder r0 = r(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r1.f14568f = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r2.f14578b = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r6 = 85
            if (r0 != r6) goto L_0x0128
            r0 = 1
            goto L_0x0129
        L_0x0128:
            r0 = r4
        L_0x0129:
            r2.close()
            goto L_0x0141
        L_0x012d:
            r0 = move-exception
            r6 = r2
            goto L_0x0134
        L_0x0130:
            r6 = r2
            goto L_0x013b
        L_0x0132:
            r0 = move-exception
            r6 = 0
        L_0x0134:
            if (r6 == 0) goto L_0x0139
            r6.close()
        L_0x0139:
            throw r0
        L_0x013a:
            r6 = 0
        L_0x013b:
            if (r6 == 0) goto L_0x0140
            r6.close()
        L_0x0140:
            r0 = r4
        L_0x0141:
            if (r0 == 0) goto L_0x0146
            r0 = 10
            return r0
        L_0x0146:
            r0 = r4
        L_0x0147:
            byte[] r2 = f14559w
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0157
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0154
            r0 = r4
            goto L_0x0158
        L_0x0154:
            int r0 = r0 + 1
            goto L_0x0147
        L_0x0157:
            r0 = 1
        L_0x0158:
            if (r0 == 0) goto L_0x015d
            r0 = 13
            return r0
        L_0x015d:
            r0 = r4
        L_0x015e:
            byte[] r2 = A
            int r6 = r2.length
            if (r0 >= r6) goto L_0x016d
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x016a
            goto L_0x017c
        L_0x016a:
            int r0 = r0 + 1
            goto L_0x015e
        L_0x016d:
            r0 = r4
        L_0x016e:
            byte[] r6 = B
            int r7 = r6.length
            if (r0 >= r7) goto L_0x0181
            int r7 = r2.length
            int r7 = r7 + r0
            int r7 = r7 + r5
            byte r7 = r3[r7]
            byte r6 = r6[r0]
            if (r7 == r6) goto L_0x017e
        L_0x017c:
            r7 = r4
            goto L_0x0182
        L_0x017e:
            int r0 = r0 + 1
            goto L_0x016e
        L_0x0181:
            r7 = 1
        L_0x0182:
            if (r7 == 0) goto L_0x0187
            r0 = 14
            return r0
        L_0x0187:
            return r4
        L_0x0188:
            r0 = move-exception
            r6 = r8
        L_0x018a:
            r8 = r6
        L_0x018b:
            if (r8 == 0) goto L_0x0190
            r8.close()
        L_0x0190:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.g(java.io.BufferedInputStream):int");
    }

    public final void h(f fVar) {
        int i8;
        int i10;
        k(fVar);
        HashMap<String, c>[] hashMapArr = this.f14566d;
        c cVar = hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f14584d);
            fVar2.f14578b = this.f14568f;
            byte[] bArr = f14557u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.d(0);
            byte[] bArr3 = f14558v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.d(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.d(12);
            }
            t(fVar2, 6);
            c cVar2 = hashMapArr[7].get("PreviewImageStart");
            c cVar3 = hashMapArr[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f14568f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 > i12 && (i8 = iArr[3]) > (i10 = iArr[1])) {
                    int i13 = (i11 - i12) + 1;
                    int i14 = (i8 - i10) + 1;
                    if (i13 < i14) {
                        int i15 = i13 + i14;
                        i14 = i15 - i14;
                        i13 = i15 - i14;
                    }
                    c d10 = c.d(i13, this.f14568f);
                    c d11 = c.d(i14, this.f14568f);
                    hashMapArr[0].put("ImageWidth", d10);
                    hashMapArr[0].put("ImageLength", d11);
                }
            }
        }
    }

    public final void i(b bVar) {
        if (f14549l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f14578b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f14559w;
        bVar.c(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i8 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i10 = i8 + 4;
                    if (i10 == 16) {
                        if (!Arrays.equals(bArr2, f14561y)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f14562z)) {
                        if (Arrays.equals(bArr2, f14560x)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f14570h = i10;
                                    s(bArr3, 0);
                                    y();
                                    v(new b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                        }
                        int i11 = readInt + 4;
                        bVar.c(i11);
                        length = i10 + i11;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(b bVar) {
        boolean z10 = f14549l;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.c(i8 - bVar.f14579c);
        bVar.read(bArr4);
        f(new b(bArr4), i8, 5);
        bVar.c(i11 - bVar.f14579c);
        bVar.f14578b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == G.f14585a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d10 = c.d(readShort, this.f14568f);
                c d11 = c.d(readShort2, this.f14568f);
                HashMap<String, c>[] hashMapArr = this.f14566d;
                hashMapArr[0].put("ImageLength", d10);
                hashMapArr[0].put("ImageWidth", d11);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.c(readUnsignedShort2);
        }
    }

    public final void k(f fVar) {
        p(fVar);
        t(fVar, 0);
        x(fVar, 0);
        x(fVar, 5);
        x(fVar, 4);
        y();
        if (this.f14565c == 8) {
            HashMap<String, c>[] hashMapArr = this.f14566d;
            c cVar = hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f14584d);
                fVar2.f14578b = this.f14568f;
                fVar2.c(6);
                t(fVar2, 9);
                c cVar2 = hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void l(f fVar) {
        if (f14549l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        HashMap<String, c>[] hashMapArr = this.f14566d;
        c cVar = hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f14584d), (int) cVar.f14583c, 5);
        }
        c cVar2 = hashMapArr[0].get("ISO");
        c cVar3 = hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void m(b bVar) {
        if (f14549l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f14578b = ByteOrder.LITTLE_ENDIAN;
        bVar.c(A.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i8 = length + 4 + 4;
                    if (Arrays.equals(C, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f14570h = i8;
                            s(bArr3, 0);
                            v(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i8 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.c(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void n(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f14568f);
            int f11 = cVar2.f(this.f14568f);
            if (this.f14565c == 7) {
                f10 += this.f14571i;
            }
            if (f10 > 0 && f11 > 0 && this.f14564b == null && this.f14563a == null) {
                bVar.skip((long) f10);
                bVar.read(new byte[f11]);
            }
            if (f14549l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f10 + ", length: " + f11);
            }
        }
    }

    public final boolean o(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.f(this.f14568f) <= 512 && cVar2.f(this.f14568f) <= 512;
    }

    public final void p(b bVar) {
        ByteOrder r10 = r(bVar);
        this.f14568f = r10;
        bVar.f14578b = r10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i8 = this.f14565c;
        if (i8 == 7 || i8 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i10 = readInt - 8;
                if (i10 > 0) {
                    bVar.c(i10);
                    return;
                }
                return;
            }
            throw new IOException(q.a("Invalid first Ifd offset: ", readInt));
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void q() {
        int i8 = 0;
        while (true) {
            HashMap<String, c>[] hashMapArr = this.f14566d;
            if (i8 < hashMapArr.length) {
                StringBuilder b10 = a1.b("The size of tag group[", i8, "]: ");
                b10.append(hashMapArr[i8].size());
                Log.d("ExifInterface", b10.toString());
                for (Map.Entry next : hashMapArr[i8].entrySet()) {
                    c cVar = (c) next.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) next.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.g(this.f14568f) + "'");
                }
                i8++;
            } else {
                return;
            }
        }
    }

    public final void s(byte[] bArr, int i8) {
        f fVar = new f(bArr);
        p(fVar);
        t(fVar, i8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(s2.a.f r32, int r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            int r3 = r1.f14579c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r4 = r0.f14567e
            r4.add(r3)
            short r3 = r32.readShort()
            java.lang.String r5 = "ExifInterface"
            boolean r6 = f14549l
            if (r6 == 0) goto L_0x002c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "numberOfDirectoryEntry: "
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L_0x002c:
            if (r3 > 0) goto L_0x002f
            return
        L_0x002f:
            r8 = 0
        L_0x0030:
            r9 = 5
            java.util.HashMap<java.lang.String, s2.a$c>[] r14 = r0.f14566d
            if (r8 >= r3) goto L_0x0349
            int r15 = r32.readUnsignedShort()
            int r10 = r32.readUnsignedShort()
            int r11 = r32.readInt()
            int r12 = r1.f14579c
            r22 = r14
            long r13 = (long) r12
            r18 = 4
            long r13 = r13 + r18
            java.util.HashMap<java.lang.Integer, s2.a$d>[] r12 = J
            r12 = r12[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            java.lang.Object r7 = r12.get(r7)
            s2.a$d r7 = (s2.a.d) r7
            if (r6 == 0) goto L_0x008f
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r21 = java.lang.Integer.valueOf(r33)
            r23 = 0
            r9[r23] = r21
            java.lang.Integer r21 = java.lang.Integer.valueOf(r15)
            r17 = 1
            r9[r17] = r21
            if (r7 == 0) goto L_0x0071
            java.lang.String r12 = r7.f14586b
            goto L_0x0072
        L_0x0071:
            r12 = 0
        L_0x0072:
            r20 = 2
            r9[r20] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r21 = 3
            r9[r21] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r16 = 4
            r9[r16] = r12
            java.lang.String r12 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r9 = java.lang.String.format(r12, r9)
            android.util.Log.d(r5, r9)
        L_0x008f:
            if (r7 != 0) goto L_0x00ab
            if (r6 == 0) goto L_0x00a4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r12 = "Skip the tag entry since tag number is not defined: "
            r9.<init>(r12)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L_0x00a4:
            r25 = r3
            r26 = r8
        L_0x00a8:
            r8 = r4
            goto L_0x0158
        L_0x00ab:
            if (r10 <= 0) goto L_0x0140
            int[] r9 = E
            int r12 = r9.length
            if (r10 < r12) goto L_0x00b4
            goto L_0x0140
        L_0x00b4:
            int r12 = r7.f14587c
            r25 = r3
            r3 = 7
            if (r12 == r3) goto L_0x00e8
            if (r10 != r3) goto L_0x00be
            goto L_0x00e8
        L_0x00be:
            if (r12 == r10) goto L_0x00e8
            int r3 = r7.f14588d
            if (r3 != r10) goto L_0x00c5
            goto L_0x00e8
        L_0x00c5:
            r26 = r8
            r8 = 4
            if (r12 == r8) goto L_0x00cc
            if (r3 != r8) goto L_0x00d0
        L_0x00cc:
            r8 = 3
            if (r10 != r8) goto L_0x00d0
            goto L_0x00ea
        L_0x00d0:
            r8 = 9
            if (r12 == r8) goto L_0x00d6
            if (r3 != r8) goto L_0x00db
        L_0x00d6:
            r8 = 8
            if (r10 != r8) goto L_0x00db
            goto L_0x00ea
        L_0x00db:
            r8 = 12
            if (r12 == r8) goto L_0x00e1
            if (r3 != r8) goto L_0x00e6
        L_0x00e1:
            r3 = 11
            if (r10 != r3) goto L_0x00e6
            goto L_0x00ea
        L_0x00e6:
            r3 = 0
            goto L_0x00eb
        L_0x00e8:
            r26 = r8
        L_0x00ea:
            r3 = 1
        L_0x00eb:
            if (r3 != 0) goto L_0x010f
            if (r6 == 0) goto L_0x00a8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r8 = "Skip the tag entry since data format ("
            r3.<init>(r8)
            java.lang.String[] r8 = D
            r8 = r8[r10]
            r3.append(r8)
            java.lang.String r8 = ") is unexpected for tag: "
            r3.append(r8)
            java.lang.String r8 = r7.f14586b
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
            goto L_0x00a8
        L_0x010f:
            r3 = 7
            r8 = r4
            if (r10 != r3) goto L_0x0114
            r10 = r12
        L_0x0114:
            long r3 = (long) r11
            r9 = r9[r10]
            r12 = r10
            long r9 = (long) r9
            long r3 = r3 * r9
            r9 = 0
            int r27 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r27 < 0) goto L_0x012b
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0128
            goto L_0x012b
        L_0x0128:
            r10 = r12
            r9 = 1
            goto L_0x015b
        L_0x012b:
            if (r6 == 0) goto L_0x013e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Skip the tag entry since the number of components is invalid: "
            r9.<init>(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L_0x013e:
            r10 = r12
            goto L_0x015a
        L_0x0140:
            r25 = r3
            r26 = r8
            r8 = r4
            if (r6 == 0) goto L_0x0158
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x0158:
            r3 = 0
        L_0x015a:
            r9 = 0
        L_0x015b:
            if (r9 != 0) goto L_0x0166
            r1.d(r13)
            r15 = r5
            r24 = r6
            r11 = r8
            goto L_0x033e
        L_0x0166:
            int r9 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            java.lang.String r12 = "Compression"
            if (r9 <= 0) goto L_0x01e9
            int r9 = r32.readInt()
            r27 = r13
            if (r6 == 0) goto L_0x0185
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "seek to data offset: "
            r13.<init>(r14)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            android.util.Log.d(r5, r13)
        L_0x0185:
            int r13 = r0.f14565c
            r14 = 7
            if (r13 != r14) goto L_0x01dd
            java.lang.String r13 = r7.f14586b
            java.lang.String r14 = "MakerNote"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x0197
            r0.f14571i = r9
            goto L_0x01dd
        L_0x0197:
            r13 = 6
            if (r2 != r13) goto L_0x01dd
            java.lang.String r14 = "ThumbnailImage"
            java.lang.String r13 = r7.f14586b
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x01dd
            r0.f14572j = r9
            r0.f14573k = r11
            java.nio.ByteOrder r13 = r0.f14568f
            r14 = 6
            s2.a$c r13 = s2.a.c.d(r14, r13)
            int r14 = r0.f14572j
            r24 = r7
            r29 = r8
            long r7 = (long) r14
            java.nio.ByteOrder r14 = r0.f14568f
            s2.a$c r7 = s2.a.c.b(r7, r14)
            int r8 = r0.f14573k
            r30 = r10
            r14 = r11
            long r10 = (long) r8
            java.nio.ByteOrder r8 = r0.f14568f
            s2.a$c r8 = s2.a.c.b(r10, r8)
            r10 = 4
            r11 = r22[r10]
            r11.put(r12, r13)
            r11 = r22[r10]
            java.lang.String r13 = "JPEGInterchangeFormat"
            r11.put(r13, r7)
            r7 = r22[r10]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r7.put(r10, r8)
            goto L_0x01e4
        L_0x01dd:
            r24 = r7
            r29 = r8
            r30 = r10
            r14 = r11
        L_0x01e4:
            long r7 = (long) r9
            r1.d(r7)
            goto L_0x01f2
        L_0x01e9:
            r24 = r7
            r29 = r8
            r30 = r10
            r27 = r13
            r14 = r11
        L_0x01f2:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r7 = M
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r6 == 0) goto L_0x0219
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "nextIfdType: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r9 = " byteCount: "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r5, r8)
        L_0x0219:
            if (r7 == 0) goto L_0x02c7
            r10 = r30
            r8 = 3
            if (r10 == r8) goto L_0x0248
            r3 = 4
            if (r10 == r3) goto L_0x023c
            r3 = 8
            if (r10 == r3) goto L_0x0237
            r3 = 9
            if (r10 == r3) goto L_0x0232
            r3 = 13
            if (r10 == r3) goto L_0x0232
            r3 = -1
            goto L_0x024d
        L_0x0232:
            int r3 = r32.readInt()
            goto L_0x024c
        L_0x0237:
            short r3 = r32.readShort()
            goto L_0x024c
        L_0x023c:
            int r3 = r32.readInt()
            long r3 = (long) r3
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r8
            goto L_0x024d
        L_0x0248:
            int r3 = r32.readUnsignedShort()
        L_0x024c:
            long r3 = (long) r3
        L_0x024d:
            if (r6 == 0) goto L_0x0269
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r10 = 0
            r8[r10] = r9
            r9 = r24
            java.lang.String r9 = r9.f14586b
            r10 = 1
            r8[r10] = r9
            java.lang.String r9 = "Offset: %d, tagName: %s"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            android.util.Log.d(r5, r8)
        L_0x0269:
            r8 = 0
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x02a8
            int r8 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11 = r29
            boolean r8 = r11.contains(r8)
            if (r8 != 0) goto L_0x0287
            r1.d(r3)
            int r3 = r7.intValue()
            r0.t(r1, r3)
            goto L_0x02bd
        L_0x0287:
            if (r6 == 0) goto L_0x02bd
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Skip jump into the IFD since it has already been read: IfdType "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = " (at "
            r8.append(r7)
            r8.append(r3)
            java.lang.String r3 = ")"
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            android.util.Log.d(r5, r3)
            goto L_0x02bd
        L_0x02a8:
            r11 = r29
            if (r6 == 0) goto L_0x02bd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Skip jump into the IFD since its offset is invalid: "
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            android.util.Log.d(r5, r3)
        L_0x02bd:
            r7 = r27
            r1.d(r7)
            r15 = r5
            r24 = r6
            goto L_0x033e
        L_0x02c7:
            r9 = r24
            r7 = r27
            r11 = r29
            r10 = r30
            int r13 = r1.f14579c
            int r15 = r0.f14570h
            int r13 = r13 + r15
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            s2.a$c r4 = new s2.a$c
            r15 = r5
            r24 = r6
            long r5 = (long) r13
            r16 = r4
            r17 = r5
            r19 = r3
            r20 = r10
            r21 = r14
            r16.<init>(r17, r19, r20, r21)
            r3 = r22[r2]
            java.lang.String r5 = r9.f14586b
            r3.put(r5, r4)
            java.lang.String r3 = "DNGVersion"
            java.lang.String r5 = r9.f14586b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0301
            r3 = 3
            r0.f14565c = r3
        L_0x0301:
            java.lang.String r3 = "Make"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0311
            java.lang.String r3 = "Model"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x031f
        L_0x0311:
            java.nio.ByteOrder r3 = r0.f14568f
            java.lang.String r3 = r4.g(r3)
            java.lang.String r6 = "PENTAX"
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x0330
        L_0x031f:
            boolean r3 = r12.equals(r5)
            if (r3 == 0) goto L_0x0334
            java.nio.ByteOrder r3 = r0.f14568f
            int r3 = r4.f(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x0334
        L_0x0330:
            r3 = 8
            r0.f14565c = r3
        L_0x0334:
            int r3 = r1.f14579c
            long r3 = (long) r3
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x033e
            r1.d(r7)
        L_0x033e:
            int r8 = r26 + 1
            short r8 = (short) r8
            r4 = r11
            r5 = r15
            r6 = r24
            r3 = r25
            goto L_0x0030
        L_0x0349:
            r11 = r4
            r15 = r5
            r24 = r6
            r22 = r14
            int r2 = r32.readInt()
            if (r24 == 0) goto L_0x036a
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "nextIfdOffset: %d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r4 = r15
            android.util.Log.d(r4, r3)
            goto L_0x036b
        L_0x036a:
            r4 = r15
        L_0x036b:
            long r5 = (long) r2
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x03ac
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r11.contains(r3)
            if (r3 != 0) goto L_0x0398
            r1.d(r5)
            r2 = 4
            r3 = r22[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x038c
            r0.t(r1, r2)
            goto L_0x03bf
        L_0x038c:
            r2 = r22[r9]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03bf
            r0.t(r1, r9)
            goto L_0x03bf
        L_0x0398:
            if (r24 == 0) goto L_0x03bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r4, r1)
            goto L_0x03bf
        L_0x03ac:
            if (r24 == 0) goto L_0x03bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r4, r1)
        L_0x03bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.t(s2.a$f, int):void");
    }

    public final void u(int i8, String str, String str2) {
        HashMap<String, c>[] hashMapArr = this.f14566d;
        if (!hashMapArr[i8].isEmpty() && hashMapArr[i8].get(str) != null) {
            HashMap<String, c> hashMap = hashMapArr[i8];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i8].remove(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(s2.a.b r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.HashMap<java.lang.String, s2.a$c>[] r2 = r0.f14566d
            r3 = 4
            r2 = r2[r3]
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)
            s2.a$c r3 = (s2.a.c) r3
            if (r3 == 0) goto L_0x014d
            java.nio.ByteOrder r4 = r0.f14568f
            int r3 = r3.f(r4)
            r4 = 1
            r5 = 6
            if (r3 == r4) goto L_0x0029
            if (r3 == r5) goto L_0x0024
            r6 = 7
            if (r3 == r6) goto L_0x0029
            goto L_0x0150
        L_0x0024:
            r0.n(r1, r2)
            goto L_0x0150
        L_0x0029:
            java.lang.String r3 = "BitsPerSample"
            java.lang.Object r3 = r2.get(r3)
            s2.a$c r3 = (s2.a.c) r3
            java.lang.String r6 = "ExifInterface"
            r7 = 0
            if (r3 == 0) goto L_0x0070
            java.nio.ByteOrder r8 = r0.f14568f
            java.io.Serializable r3 = r3.h(r8)
            int[] r3 = (int[]) r3
            int[] r8 = f14551o
            boolean r9 = java.util.Arrays.equals(r8, r3)
            if (r9 == 0) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            int r9 = r0.f14565c
            r10 = 3
            if (r9 != r10) goto L_0x0070
            java.lang.String r9 = "PhotometricInterpretation"
            java.lang.Object r9 = r2.get(r9)
            s2.a$c r9 = (s2.a.c) r9
            if (r9 == 0) goto L_0x0070
            java.nio.ByteOrder r10 = r0.f14568f
            int r9 = r9.f(r10)
            if (r9 != r4) goto L_0x0066
            int[] r10 = f14552p
            boolean r10 = java.util.Arrays.equals(r3, r10)
            if (r10 != 0) goto L_0x006e
        L_0x0066:
            if (r9 != r5) goto L_0x0070
            boolean r3 = java.util.Arrays.equals(r3, r8)
            if (r3 == 0) goto L_0x0070
        L_0x006e:
            r3 = r4
            goto L_0x007a
        L_0x0070:
            boolean r3 = f14549l
            if (r3 == 0) goto L_0x0079
            java.lang.String r3 = "Unsupported data type value"
            android.util.Log.d(r6, r3)
        L_0x0079:
            r3 = r7
        L_0x007a:
            if (r3 == 0) goto L_0x0150
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            s2.a$c r3 = (s2.a.c) r3
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)
            s2.a$c r2 = (s2.a.c) r2
            if (r3 == 0) goto L_0x0150
            if (r2 == 0) goto L_0x0150
            java.nio.ByteOrder r5 = r0.f14568f
            java.io.Serializable r3 = r3.h(r5)
            long[] r3 = s2.b.b(r3)
            java.nio.ByteOrder r5 = r0.f14568f
            java.io.Serializable r2 = r2.h(r5)
            long[] r2 = s2.b.b(r2)
            if (r3 == 0) goto L_0x0147
            int r5 = r3.length
            if (r5 != 0) goto L_0x00ab
            goto L_0x0147
        L_0x00ab:
            if (r2 == 0) goto L_0x0141
            int r5 = r2.length
            if (r5 != 0) goto L_0x00b2
            goto L_0x0141
        L_0x00b2:
            int r5 = r3.length
            int r8 = r2.length
            if (r5 == r8) goto L_0x00bd
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            android.util.Log.w(r6, r1)
            goto L_0x0150
        L_0x00bd:
            int r5 = r2.length
            r8 = 0
            r10 = r7
        L_0x00c1:
            if (r10 >= r5) goto L_0x00c9
            r11 = r2[r10]
            long r8 = r8 + r11
            int r10 = r10 + 1
            goto L_0x00c1
        L_0x00c9:
            int r5 = (int) r8
            byte[] r5 = new byte[r5]
            r0.f14569g = r4
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x00d1:
            int r11 = r3.length
            if (r8 >= r11) goto L_0x013a
            r11 = r3[r8]
            int r11 = (int) r11
            r12 = r2[r8]
            int r12 = (int) r12
            int r13 = r3.length
            int r13 = r13 - r4
            if (r8 >= r13) goto L_0x00eb
            int r13 = r11 + r12
            long r13 = (long) r13
            int r15 = r8 + 1
            r15 = r3[r15]
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x00eb
            r0.f14569g = r7
        L_0x00eb:
            int r11 = r11 - r9
            if (r11 >= 0) goto L_0x00f4
            java.lang.String r1 = "Invalid strip offset value"
            android.util.Log.d(r6, r1)
            goto L_0x0150
        L_0x00f4:
            long r13 = (long) r11
            long r15 = r1.skip(r13)
            int r13 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            java.lang.String r14 = " bytes."
            if (r13 == 0) goto L_0x0114
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to skip "
            r1.<init>(r2)
            r1.append(r11)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r6, r1)
            goto L_0x0150
        L_0x0114:
            int r9 = r9 + r11
            byte[] r11 = new byte[r12]
            int r13 = r1.read(r11)
            if (r13 == r12) goto L_0x0132
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to read "
            r1.<init>(r2)
            r1.append(r12)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r6, r1)
            goto L_0x0150
        L_0x0132:
            int r9 = r9 + r12
            java.lang.System.arraycopy(r11, r7, r5, r10, r12)
            int r10 = r10 + r12
            int r8 = r8 + 1
            goto L_0x00d1
        L_0x013a:
            boolean r1 = r0.f14569g
            if (r1 == 0) goto L_0x0150
            r1 = r3[r7]
            goto L_0x0150
        L_0x0141:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            android.util.Log.w(r6, r1)
            goto L_0x0150
        L_0x0147:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
            android.util.Log.w(r6, r1)
            goto L_0x0150
        L_0x014d:
            r0.n(r1, r2)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.v(s2.a$b):void");
    }

    public final void w(int i8, int i10) {
        HashMap<String, c>[] hashMapArr = this.f14566d;
        boolean isEmpty = hashMapArr[i8].isEmpty();
        boolean z10 = f14549l;
        if (!isEmpty && !hashMapArr[i10].isEmpty()) {
            c cVar = hashMapArr[i8].get("ImageLength");
            c cVar2 = hashMapArr[i8].get("ImageWidth");
            c cVar3 = hashMapArr[i10].get("ImageLength");
            c cVar4 = hashMapArr[i10].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (z10) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int f10 = cVar.f(this.f14568f);
                int f11 = cVar2.f(this.f14568f);
                int f12 = cVar3.f(this.f14568f);
                int f13 = cVar4.f(this.f14568f);
                if (f10 < f12 && f11 < f13) {
                    HashMap<String, c> hashMap = hashMapArr[i8];
                    hashMapArr[i8] = hashMapArr[i10];
                    hashMapArr[i10] = hashMap;
                }
            } else if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (z10) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void x(f fVar, int i8) {
        c cVar;
        c cVar2;
        HashMap<String, c>[] hashMapArr = this.f14566d;
        c cVar3 = hashMapArr[i8].get("DefaultCropSize");
        c cVar4 = hashMapArr[i8].get("SensorTopBorder");
        c cVar5 = hashMapArr[i8].get("SensorLeftBorder");
        c cVar6 = hashMapArr[i8].get("SensorBottomBorder");
        c cVar7 = hashMapArr[i8].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f14581a == 5) {
                e[] eVarArr = (e[]) cVar3.h(this.f14568f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVar2 = c.c(eVarArr[0], this.f14568f);
                cVar = c.c(eVarArr[1], this.f14568f);
            } else {
                int[] iArr = (int[]) cVar3.h(this.f14568f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVar2 = c.d(iArr[0], this.f14568f);
                cVar = c.d(iArr[1], this.f14568f);
            }
            hashMapArr[i8].put("ImageWidth", cVar2);
            hashMapArr[i8].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            c cVar8 = hashMapArr[i8].get("ImageLength");
            c cVar9 = hashMapArr[i8].get("ImageWidth");
            if (cVar8 == null || cVar9 == null) {
                c cVar10 = hashMapArr[i8].get("JPEGInterchangeFormat");
                c cVar11 = hashMapArr[i8].get("JPEGInterchangeFormatLength");
                if (cVar10 != null && cVar11 != null) {
                    int f10 = cVar10.f(this.f14568f);
                    int f11 = cVar10.f(this.f14568f);
                    fVar.d((long) f10);
                    byte[] bArr = new byte[f11];
                    fVar.read(bArr);
                    f(new b(bArr), f10, i8);
                }
            }
        } else {
            int f12 = cVar4.f(this.f14568f);
            int f13 = cVar6.f(this.f14568f);
            int f14 = cVar7.f(this.f14568f);
            int f15 = cVar5.f(this.f14568f);
            if (f13 > f12 && f14 > f15) {
                c d10 = c.d(f13 - f12, this.f14568f);
                c d11 = c.d(f14 - f15, this.f14568f);
                hashMapArr[i8].put("ImageLength", d10);
                hashMapArr[i8].put("ImageWidth", d11);
            }
        }
    }

    public final void y() {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap<String, c>[] hashMapArr = this.f14566d;
        c cVar = hashMapArr[1].get("PixelXDimension");
        c cVar2 = hashMapArr[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && o(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!o(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public static class f extends b {
        public f(byte[] bArr) {
            super(bArr);
            this.f14577a.mark(Integer.MAX_VALUE);
        }

        public final void d(long j10) {
            int i8 = this.f14579c;
            if (((long) i8) > j10) {
                this.f14579c = 0;
                this.f14577a.reset();
            } else {
                j10 -= (long) i8;
            }
            c((int) j10);
        }

        public f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f14577a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f14585a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14586b;

        /* renamed from: c  reason: collision with root package name */
        public final int f14587c;

        /* renamed from: d  reason: collision with root package name */
        public final int f14588d;

        public d(String str, int i8, int i10) {
            this.f14586b = str;
            this.f14585a = i8;
            this.f14587c = i10;
            this.f14588d = -1;
        }

        public d(int i8, int i10, int i11, String str) {
            this.f14586b = str;
            this.f14585a = i8;
            this.f14587c = i10;
            this.f14588d = i11;
        }
    }
}
