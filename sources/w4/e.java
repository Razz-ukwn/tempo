package w4;

import java.io.InputStream;
import java.net.URL;
import p4.h;
import v4.f;
import v4.n;
import v4.o;
import v4.r;

public final class e implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<f, InputStream> f16493a;

    public static class a implements o<URL, InputStream> {
        public final n<URL, InputStream> a(r rVar) {
            return new e(rVar.b(f.class, InputStream.class));
        }
    }

    public e(n<f, InputStream> nVar) {
        this.f16493a = nVar;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        return this.f16493a.a(new f((URL) obj), i8, i10, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        URL url = (URL) obj;
        return true;
    }
}
