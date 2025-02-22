package t4;

import ag.b1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import l5.i;
import l5.l;
import m5.a;
import m5.d;
import p4.f;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final i<f, String> f15364a = new i<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final a.c f15365b = m5.a.a(10, new a());

    public class a implements a.b<b> {
        public final Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        public final MessageDigest f15366a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a f15367b = new d.a();

        public b(MessageDigest messageDigest) {
            this.f15366a = messageDigest;
        }

        public final d.a b() {
            return this.f15367b;
        }
    }

    public final String a(f fVar) {
        String a10;
        synchronized (this.f15364a) {
            a10 = this.f15364a.a(fVar);
        }
        if (a10 == null) {
            Object b10 = this.f15365b.b();
            b1.b(b10);
            b bVar = (b) b10;
            try {
                fVar.a(bVar.f15366a);
                byte[] digest = bVar.f15366a.digest();
                char[] cArr = l.f11008b;
                synchronized (cArr) {
                    for (int i8 = 0; i8 < digest.length; i8++) {
                        byte b11 = digest[i8] & 255;
                        int i10 = i8 * 2;
                        char[] cArr2 = l.f11007a;
                        cArr[i10] = cArr2[b11 >>> 4];
                        cArr[i10 + 1] = cArr2[b11 & 15];
                    }
                    a10 = new String(cArr);
                }
                this.f15365b.a(bVar);
            } catch (Throwable th) {
                this.f15365b.a(bVar);
                throw th;
            }
        }
        synchronized (this.f15364a) {
            this.f15364a.d(fVar, a10);
        }
        return a10;
    }
}
