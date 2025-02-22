package v4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import p4.h;
import v4.n;

public final class j implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16178a;

    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16179a;

        public a(Context context) {
            this.f16179a = context;
        }

        public final n<Uri, File> a(r rVar) {
            return new j(this.f16179a);
        }
    }

    public static class b implements d<File> {

        /* renamed from: c  reason: collision with root package name */
        public static final String[] f16180c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f16181a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f16182b;

        public b(Context context, Uri uri) {
            this.f16181a = context;
            this.f16182b = uri;
        }

        public final Class<File> a() {
            return File.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final p4.a d() {
            return p4.a.f12446a;
        }

        public final void e(com.bumptech.glide.j jVar, d.a<? super File> aVar) {
            Cursor query = this.f16181a.getContentResolver().query(this.f16182b, f16180c, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f16182b));
                return;
            }
            aVar.f(new File(str));
        }
    }

    public j(Context context) {
        this.f16178a = context;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new k5.b(uri), new b(this.f16178a, uri));
    }

    public final boolean b(Object obj) {
        return cb.b.B((Uri) obj);
    }
}
