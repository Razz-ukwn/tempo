package v4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p4.h;
import v4.n;

public final class v<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f16221b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f16222a;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f16223a;

        public a(ContentResolver contentResolver) {
            this.f16223a = contentResolver;
        }

        public final n<Uri, AssetFileDescriptor> a(r rVar) {
            return new v(this);
        }

        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f16223a, uri);
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f16224a;

        public b(ContentResolver contentResolver) {
            this.f16224a = contentResolver;
        }

        public final n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new v(this);
        }

        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri uri) {
            return new i(this.f16224a, uri);
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> b(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f16225a;

        public d(ContentResolver contentResolver) {
            this.f16225a = contentResolver;
        }

        public final n<Uri, InputStream> a(r rVar) {
            return new v(this);
        }

        public final com.bumptech.glide.load.data.d<InputStream> b(Uri uri) {
            return new n(this.f16225a, uri);
        }
    }

    public v(c<Data> cVar) {
        this.f16222a = cVar;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new k5.b(uri), this.f16222a.b(uri));
    }

    public final boolean b(Object obj) {
        return f16221b.contains(((Uri) obj).getScheme());
    }
}
