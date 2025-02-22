package q2;

import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f12830a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f12831b;

    /* renamed from: c  reason: collision with root package name */
    public int f12832c;

    /* renamed from: d  reason: collision with root package name */
    public int f12833d;

    public c() {
        if (d.f12834b == null) {
            d.f12834b = new d();
        }
    }

    public final int a(int i8) {
        if (i8 < this.f12833d) {
            return this.f12831b.getShort(this.f12832c + i8);
        }
        return 0;
    }

    public final void b(int i8, ByteBuffer byteBuffer) {
        this.f12831b = byteBuffer;
        if (byteBuffer != null) {
            this.f12830a = i8;
            int i10 = i8 - byteBuffer.getInt(i8);
            this.f12832c = i10;
            this.f12833d = this.f12831b.getShort(i10);
            return;
        }
        this.f12830a = 0;
        this.f12832c = 0;
        this.f12833d = 0;
    }
}
