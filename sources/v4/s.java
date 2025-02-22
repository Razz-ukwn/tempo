package v4;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p4.h;
import v4.n;

public final class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f16211a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f16212b;

    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f16213a;

        public a(Resources resources) {
            this.f16213a = resources;
        }

        public final n<Integer, AssetFileDescriptor> a(r rVar) {
            return new s(this.f16213a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f16214a;

        public b(Resources resources) {
            this.f16214a = resources;
        }

        public final n<Integer, ParcelFileDescriptor> a(r rVar) {
            return new s(this.f16214a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f16215a;

        public c(Resources resources) {
            this.f16215a = resources;
        }

        public final n<Integer, InputStream> a(r rVar) {
            return new s(this.f16215a, rVar.b(Uri.class, InputStream.class));
        }
    }

    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f16216a;

        public d(Resources resources) {
            this.f16216a = resources;
        }

        public final n<Integer, Uri> a(r rVar) {
            return new s(this.f16216a, u.f16218a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f16212b = resources;
        this.f16211a = nVar;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        Uri uri;
        Integer num = (Integer) obj;
        Resources resources = this.f16212b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f16211a.a(uri, i8, i10, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
