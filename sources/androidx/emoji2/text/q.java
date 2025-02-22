package androidx.emoji2.text;

import java.nio.ByteBuffer;
import q2.a;
import q2.b;

public final class q {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<a> f1885d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f1886a;

    /* renamed from: b  reason: collision with root package name */
    public final o f1887b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1888c = 0;

    public q(o oVar, int i8) {
        this.f1887b = oVar;
        this.f1886a = i8;
    }

    public final int a(int i8) {
        a c3 = c();
        int a10 = c3.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c3.f12831b;
        int i10 = a10 + c3.f12830a;
        return byteBuffer.getInt((i8 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final int b() {
        a c3 = c();
        int a10 = c3.a(16);
        if (a10 == 0) {
            return 0;
        }
        int i8 = a10 + c3.f12830a;
        return c3.f12831b.getInt(c3.f12831b.getInt(i8) + i8);
    }

    public final a c() {
        ThreadLocal<a> threadLocal = f1885d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = this.f1887b.f1875a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i8 = a10 + bVar.f12830a;
            int i10 = (this.f1886a * 4) + bVar.f12831b.getInt(i8) + i8 + 4;
            aVar.b(bVar.f12831b.getInt(i10) + i10, bVar.f12831b);
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        a c3 = c();
        int a10 = c3.a(4);
        sb2.append(Integer.toHexString(a10 != 0 ? c3.f12831b.getInt(a10 + c3.f12830a) : 0));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i8 = 0; i8 < b10; i8++) {
            sb2.append(Integer.toHexString(a(i8)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
