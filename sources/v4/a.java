package v4;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import java.io.InputStream;
import v4.n;

public final class a<Data> implements n<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f16147a;

    /* renamed from: b  reason: collision with root package name */
    public final C0297a<Data> f16148b;

    /* renamed from: v4.a$a  reason: collision with other inner class name */
    public interface C0297a<Data> {
        d<Data> b(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, AssetFileDescriptor>, C0297a<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f16149a;

        public b(AssetManager assetManager) {
            this.f16149a = assetManager;
        }

        public final n<Uri, AssetFileDescriptor> a(r rVar) {
            return new a(this.f16149a, this);
        }

        public final d<AssetFileDescriptor> b(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }
    }

    public static class c implements o<Uri, InputStream>, C0297a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f16150a;

        public c(AssetManager assetManager) {
            this.f16150a = assetManager;
        }

        public final n<Uri, InputStream> a(r rVar) {
            return new a(this.f16150a, this);
        }

        public final d<InputStream> b(AssetManager assetManager, String str) {
            return new m(assetManager, str);
        }
    }

    public a(AssetManager assetManager, C0297a<Data> aVar) {
        this.f16147a = assetManager;
        this.f16148b = aVar;
    }

    public final n.a a(Object obj, int i8, int i10, p4.h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new k5.b(uri), this.f16148b.b(this.f16147a, uri.toString().substring(22)));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
