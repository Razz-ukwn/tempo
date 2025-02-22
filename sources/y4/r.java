package y4;

import ag.b1;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l5.a;
import l5.j;

public interface r {

    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f17226a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f17227b;

        /* renamed from: c  reason: collision with root package name */
        public final s4.b f17228c;

        public a(s4.b bVar, ByteBuffer byteBuffer, List list) {
            this.f17226a = byteBuffer;
            this.f17227b = list;
            this.f17228c = bVar;
        }

        public final int a() {
            AtomicReference<byte[]> atomicReference = l5.a.f10981a;
            ByteBuffer byteBuffer = (ByteBuffer) this.f17226a.position(0);
            if (byteBuffer == null) {
                return -1;
            }
            List<ImageHeaderParser> list = this.f17227b;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                int b10 = list.get(i8).b(byteBuffer, this.f17228c);
                if (b10 != -1) {
                    return b10;
                }
            }
            return -1;
        }

        public final Bitmap b(BitmapFactory.Options options) {
            AtomicReference<byte[]> atomicReference = l5.a.f10981a;
            return BitmapFactory.decodeStream(new a.C0207a((ByteBuffer) this.f17226a.position(0)), (Rect) null, options);
        }

        public final void c() {
        }

        public final ImageHeaderParser.ImageType d() {
            AtomicReference<byte[]> atomicReference = l5.a.f10981a;
            return com.bumptech.glide.load.a.b(this.f17227b, (ByteBuffer) this.f17226a.position(0));
        }
    }

    public static final class b implements r {

        /* renamed from: a  reason: collision with root package name */
        public final k f17229a;

        /* renamed from: b  reason: collision with root package name */
        public final s4.b f17230b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f17231c;

        public b(s4.b bVar, j jVar, List list) {
            b1.b(bVar);
            this.f17230b = bVar;
            b1.b(list);
            this.f17231c = list;
            this.f17229a = new k(jVar, bVar);
        }

        public final int a() {
            v vVar = this.f17229a.f4121a;
            vVar.reset();
            return com.bumptech.glide.load.a.a(this.f17230b, vVar, this.f17231c);
        }

        public final Bitmap b(BitmapFactory.Options options) {
            v vVar = this.f17229a.f4121a;
            vVar.reset();
            return BitmapFactory.decodeStream(vVar, (Rect) null, options);
        }

        public final void c() {
            v vVar = this.f17229a.f4121a;
            synchronized (vVar) {
                vVar.f17241c = vVar.f17239a.length;
            }
        }

        public final ImageHeaderParser.ImageType d() {
            v vVar = this.f17229a.f4121a;
            vVar.reset();
            return com.bumptech.glide.load.a.c(this.f17230b, vVar, this.f17231c);
        }
    }

    public static final class c implements r {

        /* renamed from: a  reason: collision with root package name */
        public final s4.b f17232a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f17233b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f17234c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, s4.b bVar) {
            b1.b(bVar);
            this.f17232a = bVar;
            b1.b(list);
            this.f17233b = list;
            this.f17234c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC, Splitter:B:19:0x003d] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a() {
            /*
                r10 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r10.f17234c
                s4.b r1 = r10.f17232a
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2 = r10.f17233b
                int r3 = r2.size()
                r4 = 0
            L_0x000b:
                r5 = -1
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r6 = r2.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r6 = (com.bumptech.glide.load.ImageHeaderParser) r6
                y4.v r7 = new y4.v     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r9 = r0.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r8.<init>(r9)     // Catch:{ all -> 0x0039 }
                r7.<init>(r8, r1)     // Catch:{ all -> 0x0039 }
                int r6 = r6.d(r7, r1)     // Catch:{ all -> 0x0037 }
                r7.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                r0.a()
                if (r6 == r5) goto L_0x0034
                r5 = r6
                goto L_0x0044
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r1 = move-exception
                goto L_0x003b
            L_0x0039:
                r1 = move-exception
                r7 = 0
            L_0x003b:
                if (r7 == 0) goto L_0x0040
                r7.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r0.a()
                throw r1
            L_0x0044:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y4.r.c.a():int");
        }

        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f17234c.a().getFileDescriptor(), (Rect) null, options);
        }

        public final void c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.ImageHeaderParser.ImageType d() {
            /*
                r9 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r9.f17234c
                s4.b r1 = r9.f17232a
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2 = r9.f17233b
                int r3 = r2.size()
                r4 = 0
            L_0x000b:
                if (r4 >= r3) goto L_0x0044
                java.lang.Object r5 = r2.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                y4.v r6 = new y4.v     // Catch:{ all -> 0x0039 }
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0039 }
                android.os.ParcelFileDescriptor r8 = r0.a()     // Catch:{ all -> 0x0039 }
                java.io.FileDescriptor r8 = r8.getFileDescriptor()     // Catch:{ all -> 0x0039 }
                r7.<init>(r8)     // Catch:{ all -> 0x0039 }
                r6.<init>(r7, r1)     // Catch:{ all -> 0x0039 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.c(r6)     // Catch:{ all -> 0x0037 }
                r6.close()     // Catch:{ IOException -> 0x002c }
            L_0x002c:
                r0.a()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r5 == r6) goto L_0x0034
                goto L_0x0046
            L_0x0034:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x0037:
                r1 = move-exception
                goto L_0x003b
            L_0x0039:
                r1 = move-exception
                r6 = 0
            L_0x003b:
                if (r6 == 0) goto L_0x0040
                r6.close()     // Catch:{ IOException -> 0x0040 }
            L_0x0040:
                r0.a()
                throw r1
            L_0x0044:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L_0x0046:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y4.r.c.d():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
