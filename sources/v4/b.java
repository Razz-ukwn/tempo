package v4;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p4.h;
import v4.n;

public final class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final C0299b<Data> f16151a;

    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: v4.b$a$a  reason: collision with other inner class name */
        public class C0298a implements C0299b<ByteBuffer> {
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public final Object b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public final n<byte[], ByteBuffer> a(r rVar) {
            return new b(new C0298a());
        }
    }

    /* renamed from: v4.b$b  reason: collision with other inner class name */
    public interface C0299b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16152a;

        /* renamed from: b  reason: collision with root package name */
        public final C0299b<Data> f16153b;

        public c(byte[] bArr, C0299b<Data> bVar) {
            this.f16152a = bArr;
            this.f16153b = bVar;
        }

        public final Class<Data> a() {
            return this.f16153b.a();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final p4.a d() {
            return p4.a.f12446a;
        }

        public final void e(j jVar, d.a<? super Data> aVar) {
            aVar.f(this.f16153b.b(this.f16152a));
        }
    }

    public static class d implements o<byte[], InputStream> {

        public class a implements C0299b<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public final n<byte[], InputStream> a(r rVar) {
            return new b(new a());
        }
    }

    public b(C0299b<Data> bVar) {
        this.f16151a = bVar;
    }

    public final n.a a(Object obj, int i8, int i10, h hVar) {
        byte[] bArr = (byte[]) obj;
        return new n.a(new k5.b(bArr), new c(bArr, this.f16151a));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
