package w4;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import k5.b;
import p4.h;
import q4.b;
import v4.n;
import v4.o;
import v4.r;
import y4.b0;

public final class c implements n<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16480a;

    public static class a implements o<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16481a;

        public a(Context context) {
            this.f16481a = context;
        }

        public final n<Uri, InputStream> a(r rVar) {
            return new c(this.f16481a);
        }
    }

    public c(Context context) {
        this.f16480a = context.getApplicationContext();
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        Uri uri = (Uri) obj;
        boolean z10 = true;
        if (i8 != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE && i8 <= 512 && i10 <= 384) {
            Long l10 = (Long) hVar.c(b0.f17171d);
            if (l10 == null || l10.longValue() != -1) {
                z10 = false;
            }
            if (z10) {
                b bVar = new b(uri);
                Context context = this.f16480a;
                return new n.a(bVar, q4.b.c(context, uri, new b.C0252b(context.getContentResolver())));
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return cb.b.B(uri) && uri.getPathSegments().contains("video");
    }
}
