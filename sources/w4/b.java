package w4;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p4.h;
import q4.b;
import v4.n;
import v4.o;
import v4.r;

public final class b implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16478a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16479a;

        public a(Context context) {
            this.f16479a = context;
        }

        public final n<Uri, InputStream> a(r rVar) {
            return new b(this.f16479a);
        }
    }

    public b(Context context) {
        this.f16478a = context.getApplicationContext();
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        Uri uri = (Uri) obj;
        if (!(i8 != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE && i8 <= 512 && i10 <= 384)) {
            return null;
        }
        k5.b bVar = new k5.b(uri);
        Context context = this.f16478a;
        return new n.a(bVar, q4.b.c(context, uri, new b.a(context.getContentResolver())));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return cb.b.B(uri) && !uri.getPathSegments().contains("video");
    }
}
