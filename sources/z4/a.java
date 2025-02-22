package z4;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

public final class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f17720a;

    /* renamed from: z4.a$a  reason: collision with other inner class name */
    public static class C0333a implements e.a<ByteBuffer> {
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final e b(Object obj) {
            return new a((ByteBuffer) obj);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f17720a = byteBuffer;
    }

    public final Object a() {
        ByteBuffer byteBuffer = this.f17720a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public final void b() {
    }
}
