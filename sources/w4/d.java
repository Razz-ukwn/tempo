package w4;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p4.h;
import v4.n;
import v4.o;
import v4.r;

public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16482a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f16483b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f16484c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f16485d;

    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16486a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f16487b;

        public a(Context context, Class<DataT> cls) {
            this.f16486a = context;
            this.f16487b = cls;
        }

        public final n<Uri, DataT> a(r rVar) {
            Class<DataT> cls = this.f16487b;
            return new d(this.f16486a, rVar.b(File.class, cls), rVar.b(Uri.class, cls), cls);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: w4.d$d  reason: collision with other inner class name */
    public static final class C0305d<DataT> implements com.bumptech.glide.load.data.d<DataT> {
        public static final String[] G = {"_data"};
        public final int B;
        public final h C;
        public final Class<DataT> D;
        public volatile boolean E;
        public volatile com.bumptech.glide.load.data.d<DataT> F;

        /* renamed from: a  reason: collision with root package name */
        public final Context f16488a;

        /* renamed from: b  reason: collision with root package name */
        public final n<File, DataT> f16489b;

        /* renamed from: c  reason: collision with root package name */
        public final n<Uri, DataT> f16490c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f16491d;

        /* renamed from: e  reason: collision with root package name */
        public final int f16492e;

        public C0305d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i8, int i10, h hVar, Class<DataT> cls) {
            this.f16488a = context.getApplicationContext();
            this.f16489b = nVar;
            this.f16490c = nVar2;
            this.f16491d = uri;
            this.f16492e = i8;
            this.B = i10;
            this.C = hVar;
            this.D = cls;
        }

        public final Class<DataT> a() {
            return this.D;
        }

        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.F;
            if (dVar != null) {
                dVar.b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.data.d<DataT> c() {
            /*
                r14 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                p4.h r2 = r14.C
                int r3 = r14.B
                int r4 = r14.f16492e
                android.content.Context r5 = r14.f16488a
                if (r0 == 0) goto L_0x0078
                android.net.Uri r0 = r14.f16491d
                java.lang.String r12 = "File path was empty in media store for: "
                java.lang.String r13 = "Failed to media store entry for: "
                android.content.ContentResolver r6 = r5.getContentResolver()     // Catch:{ all -> 0x0071 }
                java.lang.String[] r8 = G     // Catch:{ all -> 0x0071 }
                r9 = 0
                r10 = 0
                r11 = 0
                r7 = r0
                android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0071 }
                if (r5 == 0) goto L_0x005c
                boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x006e }
                if (r6 == 0) goto L_0x005c
                java.lang.String r6 = "_data"
                int r6 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x006e }
                java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x006e }
                boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x006e }
                if (r7 != 0) goto L_0x004a
                java.io.File r0 = new java.io.File     // Catch:{ all -> 0x006e }
                r0.<init>(r6)     // Catch:{ all -> 0x006e }
                r5.close()
                v4.n<java.io.File, DataT> r5 = r14.f16489b
                v4.n$a r0 = r5.a(r0, r4, r3, r2)
                goto L_0x0091
            L_0x004a:
                java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x006e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                r2.<init>(r12)     // Catch:{ all -> 0x006e }
                r2.append(r0)     // Catch:{ all -> 0x006e }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x006e }
                r1.<init>(r0)     // Catch:{ all -> 0x006e }
                throw r1     // Catch:{ all -> 0x006e }
            L_0x005c:
                java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x006e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                r2.<init>(r13)     // Catch:{ all -> 0x006e }
                r2.append(r0)     // Catch:{ all -> 0x006e }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x006e }
                r1.<init>(r0)     // Catch:{ all -> 0x006e }
                throw r1     // Catch:{ all -> 0x006e }
            L_0x006e:
                r0 = move-exception
                r1 = r5
                goto L_0x0072
            L_0x0071:
                r0 = move-exception
            L_0x0072:
                if (r1 == 0) goto L_0x0077
                r1.close()
            L_0x0077:
                throw r0
            L_0x0078:
                java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r5.checkSelfPermission(r0)
                if (r0 != 0) goto L_0x0082
                r0 = 1
                goto L_0x0083
            L_0x0082:
                r0 = 0
            L_0x0083:
                android.net.Uri r5 = r14.f16491d
                if (r0 == 0) goto L_0x008b
                android.net.Uri r5 = android.provider.MediaStore.setRequireOriginal(r5)
            L_0x008b:
                v4.n<android.net.Uri, DataT> r0 = r14.f16490c
                v4.n$a r0 = r0.a(r5, r4, r3, r2)
            L_0x0091:
                if (r0 == 0) goto L_0x0095
                com.bumptech.glide.load.data.d<Data> r1 = r0.f16190c
            L_0x0095:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: w4.d.C0305d.c():com.bumptech.glide.load.data.d");
        }

        public final void cancel() {
            this.E = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.F;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public final p4.a d() {
            return p4.a.f12446a;
        }

        public final void e(j jVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c3 = c();
                if (c3 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f16491d));
                    return;
                }
                this.F = c3;
                if (this.E) {
                    cancel();
                } else {
                    c3.e(jVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f16482a = context.getApplicationContext();
        this.f16483b = nVar;
        this.f16484c = nVar2;
        this.f16485d = cls;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new k5.b(uri), new C0305d(this.f16482a, this.f16483b, this.f16484c, uri, i8, i10, hVar, this.f16485d));
    }

    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && cb.b.B((Uri) obj);
    }
}
