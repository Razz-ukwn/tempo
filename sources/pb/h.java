package pb;

import ag.s0;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.lassi.data.database.MediaFileDatabase;
import d2.f1;
import ff.m;
import gf.q;
import java.util.ArrayList;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.n0;
import lf.e;
import nb.b;
import q.g;
import rb.c;
import rf.l;
import s0.b0;
import sf.j;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12561a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12562b = h.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public final long f12563c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12564d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12565e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12566f;

    /* renamed from: g  reason: collision with root package name */
    public MediaFileDatabase f12567g;

    @e(c = "com.lassi.data.media.repository.MediaRepositoryImpl", f = "MediaRepositoryImpl.kt", l = {51}, m = "isDbEmpty")
    public static final class a extends lf.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f12568a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f12569b;

        /* renamed from: c  reason: collision with root package name */
        public int f12570c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, d<? super a> dVar) {
            super(dVar);
            this.f12569b = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12568a = obj;
            this.f12570c |= Integer.MIN_VALUE;
            return this.f12569b.c(this);
        }
    }

    public h(Context context) {
        j.f(context, "context");
        this.f12561a = context;
        Parcelable.Creator<rb.a> creator = rb.a.CREATOR;
        rb.a aVar = rb.a.V;
        this.f12563c = aVar.J * 1000;
        this.f12564d = aVar.K * 1000;
        this.f12565e = aVar.S * 1024;
        this.f12566f = aVar.T * 1024;
    }

    public static final m f(h hVar, String str, long j10, String str2, String str3, long j11, String str4, long j12, long j13, int i8) {
        h hVar2 = hVar;
        long j14 = hVar2.f12563c;
        int i10 = (j14 > 0 ? 1 : (j14 == 0 ? 0 : -1));
        long j15 = hVar2.f12564d;
        if (!(i10 <= 0 || j15 <= 0 ? i10 != 0 || j15 == 0 ? j15 != 0 || i10 == 0 || j14 <= j11 : j11 <= j15 : j11 <= j15 && j14 <= j11) || !hVar.m(j12)) {
            return m.f8717a;
        }
        m k10 = hVar.k(str, new b(j10, str2, str3, j11, str4, j12, false, 64), j13, i8);
        return k10 == kf.a.f10464a ? k10 : m.f8717a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object g(pb.h r5, long r6, jf.d r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof pb.b
            if (r0 == 0) goto L_0x0016
            r0 = r8
            pb.b r0 = (pb.b) r0
            int r1 = r0.f12536c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f12536c = r1
            goto L_0x001b
        L_0x0016:
            pb.b r0 = new pb.b
            r0.<init>(r5, r8)
        L_0x001b:
            java.lang.Object r8 = r0.f12534a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f12536c
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            cb.b.J(r8)
            goto L_0x004e
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            cb.b.J(r8)
            kotlinx.coroutines.scheduling.b r8 = ag.s0.f481b
            kotlinx.coroutines.internal.e r8 = d2.f1.e(r8)
            pb.c r2 = new pb.c
            r4 = 0
            r2.<init>(r5, r6, r4)
            ag.m0 r5 = cb.b.m(r8, r2)
            r0.f12536c = r3
            java.lang.Object r8 = r5.w(r0)
            if (r8 != r1) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            sf.j.c(r8)
            r1 = r8
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.h.g(pb.h, long, jf.d):java.lang.Object");
    }

    public static final String h(h hVar, String str) {
        String str2;
        Cursor query = hVar.f12561a.getContentResolver().query(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album_art"}, "_id=".concat(str), (String[]) null, (String) null);
        if (query == null || query.getCount() <= 0 || !query.moveToFirst() || (str2 = query.getString(query.getColumnIndex("album_art"))) == null) {
            str2 = "";
        }
        if (query != null) {
            query.close();
        }
        return str2;
    }

    public static final String[] i(h hVar) {
        hVar.getClass();
        int c3 = g.c(rb.a.V.F);
        return c3 != 0 ? c3 != 1 ? c3 != 2 ? new String[]{"_id", "title", "_data", "parent", "_size"} : new String[]{"_id", "title", "_data", "album", "duration", "date_added", "album_id", "_size"} : new String[]{"_id", "title", "_data", "bucket_display_name", "duration", "date_added", "_size"} : new String[]{"_id", "title", "_data", "bucket_display_name", "_size", "date_added"};
    }

    public static final Cursor j(h hVar, String[] strArr, long j10) {
        hVar.getClass();
        rb.a aVar = rb.a.V;
        int c3 = g.c(aVar.F);
        String str = "date_added > ?";
        Context context = hVar.f12561a;
        String[] strArr2 = null;
        if (c3 == 0) {
            ContentResolver contentResolver = context.getContentResolver();
            Uri contentUri = Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            int i8 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i8 == 0) {
                str = null;
            }
            if (i8 != 0) {
                strArr2 = new String[]{String.valueOf(j10)};
            }
            return contentResolver.query(contentUri, strArr, str, strArr2, "date_added");
        } else if (c3 == 1) {
            ContentResolver contentResolver2 = context.getContentResolver();
            Uri contentUri2 = Build.VERSION.SDK_INT >= 29 ? MediaStore.Video.Media.getContentUri("external") : MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i10 == 0) {
                str = null;
            }
            if (i10 != 0) {
                strArr2 = new String[]{String.valueOf(j10)};
            }
            return contentResolver2.query(contentUri2, strArr, str, strArr2, "date_added");
        } else if (c3 == 2) {
            ContentResolver contentResolver3 = context.getContentResolver();
            Uri contentUri3 = Build.VERSION.SDK_INT >= 29 ? MediaStore.Audio.Media.getContentUri("external_primary") : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            int i11 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i11 == 0) {
                str = null;
            }
            if (i11 != 0) {
                strArr2 = new String[]{String.valueOf(j10)};
            }
            return contentResolver3.query(contentUri3, strArr, str, strArr2, "date_added");
        } else if (c3 != 3) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String mimeTypeFromExtension : aVar.M) {
                String mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mimeTypeFromExtension);
                if (mimeTypeFromExtension2 != null) {
                    arrayList.add("'" + mimeTypeFromExtension2 + '\'');
                }
            }
            return context.getContentResolver().query(MediaStore.Files.getContentUri("external"), strArr, b0.a(new StringBuilder("mime_type IN ("), q.A0(arrayList, (String) null, (String) null, (String) null, (l) null, 63), ')'), (String[]) null, "date_added");
        }
    }

    @SuppressLint({"Range"})
    public final f a() {
        return cb.d.C(cb.b.q(new n0(new d(this, (d<? super d>) null))), s0.f481b);
    }

    public final Object b(ec.f fVar) {
        return cb.b.m(f1.e(s0.f481b), new g(this, (d<? super g>) null)).w(fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[Catch:{ all -> 0x0027 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(jf.d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pb.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            pb.h$a r0 = (pb.h.a) r0
            int r1 = r0.f12570c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12570c = r1
            goto L_0x0018
        L_0x0013:
            pb.h$a r0 = new pb.h$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f12568a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f12570c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            cb.b.J(r6)     // Catch:{ all -> 0x0027 }
            goto L_0x005d
        L_0x0027:
            r6 = move-exception
            goto L_0x006b
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            cb.b.J(r6)
            android.content.Context r6 = r5.f12561a     // Catch:{ all -> 0x0027 }
            r5.l(r6)     // Catch:{ all -> 0x0027 }
            com.lassi.data.database.MediaFileDatabase r6 = r5.f12567g     // Catch:{ all -> 0x0027 }
            if (r6 == 0) goto L_0x0064
            ob.c r6 = r6.p()     // Catch:{ all -> 0x0027 }
            rb.a r2 = rb.a.V     // Catch:{ all -> 0x0027 }
            int r2 = r2.F     // Catch:{ all -> 0x0027 }
            int r2 = q.g.c(r2)     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0053
            r4 = 2
            if (r2 == r3) goto L_0x0054
            if (r2 == r4) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r4 = 3
            goto L_0x0054
        L_0x0053:
            r4 = r3
        L_0x0054:
            r0.f12570c = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r6 = r6.b(r4, r0)     // Catch:{ all -> 0x0027 }
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0027 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0027 }
            goto L_0x006f
        L_0x0064:
            java.lang.String r6 = "mediaDatabase"
            sf.j.l(r6)     // Catch:{ all -> 0x0027 }
            r6 = 0
            throw r6     // Catch:{ all -> 0x0027 }
        L_0x006b:
            r6.printStackTrace()
            r6 = 0
        L_0x006f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.h.c(jf.d):java.lang.Object");
    }

    public final f d() {
        return cb.d.C(cb.b.q(new n0(new e(this, (d<? super e>) null))), s0.f481b);
    }

    public final Object e(ec.h hVar) {
        return cb.b.m(f1.e(s0.f481b), new f(this, (d<? super f>) null)).w(hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ff.m k(java.lang.String r11, nb.b r12, long r13, int r15) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0010
            android.content.Context r11 = r10.f12561a
            r0 = 2131951870(0x7f1300fe, float:1.9540167E38)
            java.lang.String r11 = r11.getString(r0)
            java.lang.String r0 = "context.getString(R.string.lassi_all)"
            sf.j.e(r11, r0)
        L_0x0010:
            r7 = r11
            java.lang.String r11 = r12.f11620c
            r0 = 0
            if (r11 == 0) goto L_0x003d
            rb.a r1 = rb.a.V
            java.util.List<java.lang.String> r2 = r1.M
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x003e
            java.util.List<java.lang.String> r1 = r1.M
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = zf.j.r0(r11, r2, r3)
            if (r2 == 0) goto L_0x002a
            goto L_0x003e
        L_0x003d:
            r3 = r0
        L_0x003e:
            if (r3 == 0) goto L_0x0056
            kotlinx.coroutines.scheduling.b r11 = ag.s0.f481b
            kotlinx.coroutines.internal.e r11 = d2.f1.e(r11)
            pb.a r9 = new pb.a
            r8 = 0
            r1 = r9
            r2 = r13
            r4 = r12
            r5 = r10
            r6 = r15
            r1.<init>(r2, r4, r5, r6, r7, r8)
            r12 = 3
            r13 = 0
            cb.b.D(r11, r13, r0, r9, r12)
        L_0x0056:
            ff.m r11 = ff.m.f8717a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.h.k(java.lang.String, nb.b, long, int):ff.m");
    }

    public final void l(Context context) {
        if (this.f12567g == null) {
            MediaFileDatabase mediaFileDatabase = MediaFileDatabase.m;
            this.f12567g = MediaFileDatabase.a.a(context);
            j.e(this.f12562b, "TAG");
        }
    }

    public final boolean m(long j10) {
        long j11 = this.f12565e;
        int i8 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
        long j12 = this.f12566f;
        if (i8 <= 0 || j12 <= 0) {
            if (j11 != 0 || j12 == 0) {
                if (j12 == 0 && j11 != 0 && j11 > j10) {
                    return false;
                }
            } else if (j10 > j12) {
                return false;
            }
        } else if (j10 > j12 || j11 > j10) {
            return false;
        }
        return true;
    }
}
