package v4;

import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p4.h;
import v4.n;

public final class c implements n<File, ByteBuffer> {

    public static final class a implements d<ByteBuffer> {

        /* renamed from: a  reason: collision with root package name */
        public final File f16154a;

        public a(File file) {
            this.f16154a = file;
        }

        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final p4.a d() {
            return p4.a.f12446a;
        }

        public final void e(j jVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(l5.a.a(this.f16154a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public static class b implements o<File, ByteBuffer> {
        public final n<File, ByteBuffer> a(r rVar) {
            return new c();
        }
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        File file = (File) obj;
        return new n.a(new k5.b(file), new a(file));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
