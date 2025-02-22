package v4;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p4.h;
import v4.n;

public final class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f16226b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final n<f, Data> f16227a;

    public static class a implements o<Uri, InputStream> {
        public final n<Uri, InputStream> a(r rVar) {
            return new w(rVar.b(f.class, InputStream.class));
        }
    }

    public w(n<f, Data> nVar) {
        this.f16227a = nVar;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        return this.f16227a.a(new f(((Uri) obj).toString()), i8, i10, hVar);
    }

    public final boolean b(Object obj) {
        return f16226b.contains(((Uri) obj).getScheme());
    }
}
