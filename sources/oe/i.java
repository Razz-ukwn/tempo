package oe;

import ag.g0;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.lifecycle.v;
import ff.m;
import java.util.ArrayList;
import java.util.List;
import lf.c;
import me.d;
import me.e;
import rf.p;
import sf.j;

public final class i extends a {

    /* renamed from: h  reason: collision with root package name */
    public final v<List<d>> f12345h = new v<>();

    /* renamed from: i  reason: collision with root package name */
    public final v<List<e>> f12346i = new v<>();

    /* renamed from: j  reason: collision with root package name */
    public final v<Boolean> f12347j = new v<>();

    /* renamed from: k  reason: collision with root package name */
    public ne.a f12348k;

    @lf.e(c = "droidninja.filepicker.viewmodels.VMMediaPicker", f = "VMMediaPicker.kt", l = {98}, m = "queryImages")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f12349a;

        /* renamed from: b  reason: collision with root package name */
        public int f12350b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ i f12351c;

        /* renamed from: d  reason: collision with root package name */
        public sf.v f12352d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, jf.d dVar) {
            super(dVar);
            this.f12351c = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12349a = obj;
            this.f12350b |= Integer.MIN_VALUE;
            return this.f12351c.i((String) null, 0, 0, 0, this);
        }
    }

    @lf.e(c = "droidninja.filepicker.viewmodels.VMMediaPicker$queryImages$2", f = "VMMediaPicker.kt", l = {}, m = "invokeSuspend")
    public static final class b extends lf.i implements p<g0, jf.d<? super m>, Object> {
        public final /* synthetic */ String B;
        public final /* synthetic */ sf.v C;

        /* renamed from: a  reason: collision with root package name */
        public g0 f12353a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i f12354b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f12355c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f12356d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f12357e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i iVar, int i8, int i10, int i11, String str, sf.v vVar, jf.d dVar) {
            super(2, dVar);
            this.f12354b = iVar;
            this.f12355c = i8;
            this.f12356d = i10;
            this.f12357e = i11;
            this.B = str;
            this.C = vVar;
        }

        public final jf.d<m> create(Object obj, jf.d<?> dVar) {
            j.f(dVar, "completion");
            b bVar = new b(this.f12354b, this.f12355c, this.f12356d, this.f12357e, this.B, this.C, dVar);
            bVar.f12353a = (g0) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create(obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            int i8;
            cb.b.J(obj);
            Uri contentUri = MediaStore.Files.getContentUri("external");
            ArrayList arrayList = new ArrayList();
            int i10 = this.f12355c;
            if (i10 == 3) {
                int i11 = this.f12356d;
                if (i11 != Integer.MAX_VALUE) {
                    arrayList.add(String.valueOf(i11 * 1024 * 1024));
                    str = "media_type=3 AND _size<=?";
                } else {
                    str = "media_type=3";
                }
            } else {
                str = "media_type=1";
            }
            if (i10 == 1 && (i8 = this.f12357e) != Integer.MAX_VALUE) {
                str = str.concat(" AND _size<=?");
                arrayList.add(String.valueOf(i8 * 1024 * 1024));
            }
            int i12 = je.e.f9993a;
            StringBuilder b10 = d.a.b(str, " AND mime_type!='");
            b10.append(MimeTypeMap.getSingleton().getMimeTypeFromExtension("gif"));
            b10.append("'");
            String sb2 = b10.toString();
            String str2 = this.B;
            if (str2 != null) {
                sb2 = sb2 + " AND bucket_id='" + str2 + "'";
            }
            ContentResolver contentResolver = this.f12354b.e().getContentResolver();
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                Cursor query = contentResolver.query(contentUri, (String[]) null, sb2, (String[]) array, "_id DESC");
                if (query != null) {
                    T arrayList2 = new ArrayList();
                    while (query.moveToNext()) {
                        long j10 = query.getLong(query.getColumnIndexOrThrow("_id"));
                        String string = query.getString(query.getColumnIndexOrThrow("bucket_id"));
                        String string2 = query.getString(query.getColumnIndexOrThrow("bucket_display_name"));
                        String string3 = query.getString(query.getColumnIndexOrThrow("title"));
                        int i13 = query.getInt(query.getColumnIndexOrThrow("media_type"));
                        e eVar = new e(0);
                        eVar.f11473a = j10;
                        eVar.f11474b = string;
                        eVar.f11476d = string2;
                        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10);
                        j.e(withAppendedId, "ContentUris.withAppended…    imageId\n            )");
                        if (i10 == 3) {
                            withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10);
                            j.e(withAppendedId, "ContentUris.withAppended…imageId\n                )");
                        }
                        Uri uri = withAppendedId;
                        if (!arrayList2.contains(eVar)) {
                            j.e(string3, "fileName");
                            eVar.B.add(new d(j10, string3, uri, i13));
                            eVar.f11477e = query.getLong(query.getColumnIndexOrThrow("date_added"));
                            arrayList2.add(eVar);
                        } else {
                            e eVar2 = (e) arrayList2.get(arrayList2.indexOf(eVar));
                            j.e(string3, "fileName");
                            eVar2.getClass();
                            eVar2.B.add(new d(j10, string3, uri, i13));
                        }
                    }
                    this.C.f14957a = arrayList2;
                    query.close();
                }
                return m.f8717a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Application application) {
        super(application);
        j.f(application, "application");
    }

    public static final void g(i iVar) {
        if (iVar.f12348k == null) {
            ContentResolver contentResolver = iVar.e().getContentResolver();
            j.e(contentResolver, "getApplication<Application>().contentResolver");
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            j.e(uri, "MediaStore.Images.Media.EXTERNAL_CONTENT_URI");
            ne.a aVar = new ne.a(new j(iVar), new Handler());
            contentResolver.registerContentObserver(uri, true, aVar);
            iVar.f12348k = aVar;
        }
    }

    public static void h(i iVar, int i8, int i10, int i11) {
        iVar.getClass();
        iVar.f(new h(iVar, (String) null, i8, i10, i11, (jf.d) null));
    }

    public final void c() {
        ne.a aVar = this.f12348k;
        if (aVar != null) {
            e().getContentResolver().unregisterContentObserver(aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r16, int r17, int r18, int r19, jf.d<? super java.util.List<me.e>> r20) {
        /*
            r15 = this;
            r0 = r20
            boolean r1 = r0 instanceof oe.i.a
            if (r1 == 0) goto L_0x0016
            r1 = r0
            oe.i$a r1 = (oe.i.a) r1
            int r2 = r1.f12350b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.f12350b = r2
            r10 = r15
            goto L_0x001c
        L_0x0016:
            oe.i$a r1 = new oe.i$a
            r10 = r15
            r1.<init>(r15, r0)
        L_0x001c:
            java.lang.Object r0 = r1.f12349a
            kf.a r11 = kf.a.f10464a
            int r2 = r1.f12350b
            r12 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r12) goto L_0x002d
            sf.v r1 = r1.f12352d
            cb.b.J(r0)
            goto L_0x0069
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            cb.b.J(r0)
            sf.v r0 = new sf.v
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f14957a = r2
            kotlinx.coroutines.scheduling.b r13 = ag.s0.f481b
            oe.i$b r14 = new oe.i$b
            r9 = 0
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = r19
            r6 = r18
            r7 = r16
            r8 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.getClass()
            r1.getClass()
            r1.f12352d = r0
            r1.f12350b = r12
            java.lang.Object r1 = cb.b.M(r13, r14, r1)
            if (r1 != r11) goto L_0x0068
            return r11
        L_0x0068:
            r1 = r0
        L_0x0069:
            T r0 = r1.f14957a
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.i.i(java.lang.String, int, int, int, jf.d):java.lang.Object");
    }
}
