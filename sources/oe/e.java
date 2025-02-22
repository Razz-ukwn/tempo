package oe;

import ag.g0;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import cb.b;
import ff.m;
import gf.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jf.d;
import lf.i;
import me.c;
import rf.p;
import sf.j;
import sf.v;

@lf.e(c = "droidninja.filepicker.viewmodels.VMDocPicker$queryDocs$2", f = "VMDocPicker.kt", l = {}, m = "invokeSuspend")
public final class e extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public g0 f12328a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f12329b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f12330c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f12331d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Comparator f12332e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar, v vVar, List list, Comparator comparator, d dVar) {
        super(2, dVar);
        this.f12329b = fVar;
        this.f12330c = vVar;
        this.f12331d = list;
        this.f12332e = comparator;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        j.f(dVar, "completion");
        e eVar = new e(this.f12329b, this.f12330c, this.f12331d, this.f12332e, dVar);
        eVar.f12328a = (g0) obj;
        return eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z10;
        c cVar;
        b.J(obj);
        Cursor query = this.f12329b.e().getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_id", "_data", "mime_type", "_size", "date_added", "title"}, "media_type!=1 AND media_type!=3", (String[]) null, "date_added DESC");
        if (query != null) {
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                long j10 = query.getLong(query.getColumnIndexOrThrow("_id"));
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                String string2 = query.getString(query.getColumnIndexOrThrow("title"));
                if (string != null) {
                    int i8 = je.e.f9993a;
                    ArrayList arrayList2 = new ArrayList(je.e.f9996d);
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            cVar = null;
                            break;
                        }
                        String[] strArr = ((c) arrayList2.get(i10)).f11469b;
                        int length = strArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            int i12 = size;
                            if (zf.j.r0(string, strArr[i11], false)) {
                                cVar = (c) arrayList2.get(i10);
                                break;
                            }
                            i11++;
                            size = i12;
                        }
                        int i13 = size;
                        i10++;
                    }
                    File file = new File(string);
                    Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Files.getContentUri("external"), j10);
                    j.e(withAppendedId, "ContentUris.withAppended…imageId\n                )");
                    if (cVar != null && !file.isDirectory() && file.exists()) {
                        j.e(string2, "title");
                        me.b bVar = new me.b(j10, string2, withAppendedId, (String) null, (String) null, (c) null);
                        bVar.E = cVar;
                        String string3 = query.getString(query.getColumnIndexOrThrow("mime_type"));
                        if (string3 == null || TextUtils.isEmpty(string3)) {
                            bVar.C = "";
                        } else {
                            bVar.C = string3;
                        }
                        bVar.D = query.getString(query.getColumnIndexOrThrow("_size"));
                        if (!arrayList.contains(bVar)) {
                            arrayList.add(bVar);
                        }
                    }
                }
            }
            T hashMap = new HashMap();
            for (c cVar2 : this.f12331d) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String[] strArr2 = cVar2.f11469b;
                    String str = ((me.b) next).C;
                    j.f(strArr2, "types");
                    int length2 = strArr2.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length2) {
                            z10 = false;
                            break;
                        }
                        if (j.a(MimeTypeMap.getSingleton().getMimeTypeFromExtension(strArr2[i14]), str)) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    if (z10) {
                        arrayList3.add(next);
                    }
                }
                Comparator comparator = this.f12332e;
                if (comparator != null) {
                    q.J0(arrayList3, comparator);
                }
                hashMap.put(cVar2, arrayList3);
            }
            this.f12330c.f14957a = hashMap;
            query.close();
        }
        return m.f8717a;
    }
}
