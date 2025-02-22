package r4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import l5.i;
import p4.f;
import p4.h;
import p4.l;
import s4.b;

public final class y implements f {

    /* renamed from: j  reason: collision with root package name */
    public static final i<Class<?>, byte[]> f14004j = new i<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final b f14005b;

    /* renamed from: c  reason: collision with root package name */
    public final f f14006c;

    /* renamed from: d  reason: collision with root package name */
    public final f f14007d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14008e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14009f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f14010g;

    /* renamed from: h  reason: collision with root package name */
    public final h f14011h;

    /* renamed from: i  reason: collision with root package name */
    public final l<?> f14012i;

    public y(b bVar, f fVar, f fVar2, int i8, int i10, l<?> lVar, Class<?> cls, h hVar) {
        this.f14005b = bVar;
        this.f14006c = fVar;
        this.f14007d = fVar2;
        this.f14008e = i8;
        this.f14009f = i10;
        this.f14012i = lVar;
        this.f14010g = cls;
        this.f14011h = hVar;
    }

    public final void a(MessageDigest messageDigest) {
        b bVar = this.f14005b;
        byte[] bArr = (byte[]) bVar.d();
        ByteBuffer.wrap(bArr).putInt(this.f14008e).putInt(this.f14009f).array();
        this.f14007d.a(messageDigest);
        this.f14006c.a(messageDigest);
        messageDigest.update(bArr);
        l<?> lVar = this.f14012i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f14011h.a(messageDigest);
        i<Class<?>, byte[]> iVar = f14004j;
        Class<?> cls = this.f14010g;
        byte[] a10 = iVar.a(cls);
        if (a10 == null) {
            a10 = cls.getName().getBytes(f.f12458a);
            iVar.d(cls, a10);
        }
        messageDigest.update(a10);
        bVar.put(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (r4.y) r4;
        r0 = r4.f14009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof r4.y
            r1 = 0
            if (r0 == 0) goto L_0x0046
            r4.y r4 = (r4.y) r4
            int r0 = r4.f14009f
            int r2 = r3.f14009f
            if (r2 != r0) goto L_0x0046
            int r0 = r3.f14008e
            int r2 = r4.f14008e
            if (r0 != r2) goto L_0x0046
            p4.l<?> r0 = r3.f14012i
            p4.l<?> r2 = r4.f14012i
            boolean r0 = l5.l.b(r0, r2)
            if (r0 == 0) goto L_0x0046
            java.lang.Class<?> r0 = r3.f14010g
            java.lang.Class<?> r2 = r4.f14010g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            p4.f r0 = r3.f14006c
            p4.f r2 = r4.f14006c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            p4.f r0 = r3.f14007d
            p4.f r2 = r4.f14007d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            p4.h r0 = r3.f14011h
            p4.h r4 = r4.f14011h
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0046
            r1 = 1
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.y.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = ((((this.f14007d.hashCode() + (this.f14006c.hashCode() * 31)) * 31) + this.f14008e) * 31) + this.f14009f;
        l<?> lVar = this.f14012i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        int hashCode2 = this.f14010g.hashCode();
        return this.f14011h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f14006c + ", signature=" + this.f14007d + ", width=" + this.f14008e + ", height=" + this.f14009f + ", decodedResourceClass=" + this.f14010g + ", transformation='" + this.f14012i + "', options=" + this.f14011h + '}';
    }
}
