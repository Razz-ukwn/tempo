package d6;

import a6.d;
import android.util.Base64;
import com.google.auto.value.AutoValue;
import d6.j;

@AutoValue
public abstract class s {

    @AutoValue.Builder
    public static abstract class a {
    }

    public static j.a a() {
        j.a aVar = new j.a();
        aVar.c(d.f118a);
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public final j e(d dVar) {
        j.a a10 = a();
        a10.b(b());
        a10.c(dVar);
        a10.f7346b = c();
        return a10.a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
