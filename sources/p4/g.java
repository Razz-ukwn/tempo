package p4;

import android.text.TextUtils;
import java.security.MessageDigest;

public final class g<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f12459e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f12460a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f12461b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12462c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f12463d;

    public class a implements b<Object> {
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t2, MessageDigest messageDigest);
    }

    public g(String str, T t2, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f12462c = str;
            this.f12460a = t2;
            this.f12461b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f12459e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f12462c.equals(((g) obj).f12462c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12462c.hashCode();
    }

    public final String toString() {
        return androidx.activity.g.a(new StringBuilder("Option{key='"), this.f12462c, "'}");
    }
}
