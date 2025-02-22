package v4;

import android.util.Base64;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p4.h;
import v4.n;

public final class d<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f16155a;

    public interface a<Data> {
    }

    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final String f16156a;

        /* renamed from: b  reason: collision with root package name */
        public final a<Data> f16157b;

        /* renamed from: c  reason: collision with root package name */
        public ByteArrayInputStream f16158c;

        public b(String str, a<Data> aVar) {
            this.f16156a = str;
            this.f16157b = aVar;
        }

        public final Class<Data> a() {
            this.f16157b.getClass();
            return InputStream.class;
        }

        public final void b() {
            try {
                a<Data> aVar = this.f16157b;
                ByteArrayInputStream byteArrayInputStream = this.f16158c;
                ((c.a) aVar).getClass();
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }

        public final void cancel() {
        }

        public final p4.a d() {
            return p4.a.f12446a;
        }

        public final void e(j jVar, d.a<? super Data> aVar) {
            try {
                ByteArrayInputStream a10 = ((c.a) this.f16157b).a(this.f16156a);
                this.f16158c = a10;
                aVar.f(a10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a f16159a = new a();

        public class a implements a<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public final n<Model, InputStream> a(r rVar) {
            return new d(this.f16159a);
        }
    }

    public d(c.a aVar) {
        this.f16155a = aVar;
    }

    public final n.a<Data> a(Model model, int i8, int i10, h hVar) {
        return new n.a<>(new k5.b(model), new b(model.toString(), this.f16155a));
    }

    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
