package b4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import b4.h;
import d2.f1;
import gf.q;
import gf.s;
import h4.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import jf.d;
import m4.c;
import sf.j;
import wg.c0;
import y3.m;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f3211a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3212b;

    /* renamed from: b4.a$a  reason: collision with other inner class name */
    public static final class C0038a implements h.a<Uri> {
        public final h a(Object obj, l lVar) {
            Uri uri = (Uri) obj;
            Bitmap.Config[] configArr = c.f11189a;
            if (!(j.a(uri.getScheme(), "file") && j.a((String) q.v0(uri.getPathSegments()), "android_asset"))) {
                return null;
            }
            return new a(uri, lVar);
        }
    }

    public a(Uri uri, l lVar) {
        this.f3211a = uri;
        this.f3212b = lVar;
    }

    public final Object a(d<? super g> dVar) {
        Iterable iterable;
        ArrayList arrayList;
        Object obj;
        Iterable pathSegments = this.f3211a.getPathSegments();
        j.f(pathSegments, "<this>");
        if (pathSegments instanceof Collection) {
            Collection collection = (Collection) pathSegments;
            int size = collection.size() - 1;
            if (size <= 0) {
                iterable = s.f8978a;
            } else if (size == 1) {
                if (pathSegments instanceof List) {
                    obj = q.B0((List) pathSegments);
                } else {
                    Iterator it = pathSegments.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        while (it.hasNext()) {
                            next = it.next();
                        }
                        obj = next;
                    } else {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                }
                iterable = cb.d.O(obj);
            } else {
                arrayList = new ArrayList(size);
                if (pathSegments instanceof List) {
                    if (pathSegments instanceof RandomAccess) {
                        int size2 = collection.size();
                        for (int i8 = 1; i8 < size2; i8++) {
                            arrayList.add(((List) pathSegments).get(i8));
                        }
                    } else {
                        ListIterator listIterator = ((List) pathSegments).listIterator(1);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    iterable = arrayList;
                }
            }
            String A0 = q.A0(iterable, "/", (String) null, (String) null, (rf.l) null, 62);
            l lVar = this.f3212b;
            c0 j10 = f1.j(f1.J(lVar.f9195a.getAssets().open(A0)));
            y3.a aVar = new y3.a();
            Bitmap.Config[] configArr = c.f11189a;
            File cacheDir = lVar.f9195a.getCacheDir();
            cacheDir.mkdirs();
            return new l(new m(j10, cacheDir, aVar), c.b(MimeTypeMap.getSingleton(), A0), 3);
        }
        arrayList = new ArrayList();
        int i10 = 0;
        for (Object next2 : pathSegments) {
            if (i10 >= 1) {
                arrayList.add(next2);
            } else {
                i10++;
            }
        }
        iterable = cb.d.W(arrayList);
        String A02 = q.A0(iterable, "/", (String) null, (String) null, (rf.l) null, 62);
        l lVar2 = this.f3212b;
        c0 j102 = f1.j(f1.J(lVar2.f9195a.getAssets().open(A02)));
        y3.a aVar2 = new y3.a();
        Bitmap.Config[] configArr2 = c.f11189a;
        File cacheDir2 = lVar2.f9195a.getCacheDir();
        cacheDir2.mkdirs();
        return new l(new m(j102, cacheDir2, aVar2), c.b(MimeTypeMap.getSingleton(), A02), 3);
    }
}
