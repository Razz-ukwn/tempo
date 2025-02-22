package b4;

import android.webkit.MimeTypeMap;
import b4.h;
import h4.l;
import java.io.Closeable;
import java.io.File;
import jf.d;
import wg.z;
import y3.j;

public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final File f3224a;

    public static final class a implements h.a<File> {
        public final h a(Object obj, l lVar) {
            return new i((File) obj);
        }
    }

    public i(File file) {
        this.f3224a = file;
    }

    public final Object a(d<? super g> dVar) {
        String str = z.f16808b;
        File file = this.f3224a;
        return new l(new j(z.a.b(file), wg.l.f16785a, (String) null, (Closeable) null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(pf.a.R(file)), 3);
    }
}
