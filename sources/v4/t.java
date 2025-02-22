package v4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import p4.h;
import v4.n;

public final class t<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f16217a;

    public static final class a implements o<String, AssetFileDescriptor> {
        public final n<String, AssetFileDescriptor> a(r rVar) {
            return new t(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<String, ParcelFileDescriptor> {
        public final n<String, ParcelFileDescriptor> a(r rVar) {
            return new t(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<String, InputStream> {
        public final n<String, InputStream> a(r rVar) {
            return new t(rVar.b(Uri.class, InputStream.class));
        }
    }

    public t(n<Uri, Data> nVar) {
        this.f16217a = nVar;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str));
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
        }
        if (uri == null) {
            return null;
        }
        n<Uri, Data> nVar = this.f16217a;
        if (!nVar.b(uri)) {
            return null;
        }
        return nVar.a(uri, i8, i10, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        String str = (String) obj;
        return true;
    }
}
