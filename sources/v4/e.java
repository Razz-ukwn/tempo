package v4;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p4.h;
import v4.n;

public final class e<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f16160a;

    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f16161a;

        public a(d<Data> dVar) {
            this.f16161a = dVar;
        }

        public final n<File, Data> a(r rVar) {
            return new e(this.f16161a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            public final Object b(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public final void c(Object obj) {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final File f16162a;

        /* renamed from: b  reason: collision with root package name */
        public final d<Data> f16163b;

        /* renamed from: c  reason: collision with root package name */
        public Data f16164c;

        public c(File file, d<Data> dVar) {
            this.f16162a = file;
            this.f16163b = dVar;
        }

        public final Class<Data> a() {
            return this.f16163b.a();
        }

        public final void b() {
            Data data = this.f16164c;
            if (data != null) {
                try {
                    this.f16163b.c(data);
                } catch (IOException unused) {
                }
            }
        }

        public final void cancel() {
        }

        public final p4.a d() {
            return p4.a.f12446a;
        }

        public final void e(j jVar, d.a<? super Data> aVar) {
            try {
                Data b10 = this.f16163b.b(this.f16162a);
                this.f16164c = b10;
                aVar.f(b10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data b(File file);

        void c(Data data);
    }

    /* renamed from: v4.e$e  reason: collision with other inner class name */
    public static class C0300e extends a<InputStream> {

        /* renamed from: v4.e$e$a */
        public class a implements d<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(File file) {
                return new FileInputStream(file);
            }

            public final void c(Object obj) {
                ((InputStream) obj).close();
            }
        }

        public C0300e() {
            super(new a());
        }
    }

    public e(d<Data> dVar) {
        this.f16160a = dVar;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        File file = (File) obj;
        return new n.a(new k5.b(file), new c(file, this.f16160a));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
