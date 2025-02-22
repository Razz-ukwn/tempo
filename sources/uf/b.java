package uf;

import java.util.Random;
import sf.j;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final a f16030c = new a();

    public static final class a extends ThreadLocal<Random> {
        public final Object initialValue() {
            return new Random();
        }
    }

    public final Random d() {
        Object obj = this.f16030c.get();
        j.e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
