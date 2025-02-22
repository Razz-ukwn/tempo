package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2282a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f2283b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f2284c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void c() {
    }

    public final Object d(Object obj, String str) {
        Object obj2;
        synchronized (this.f2282a) {
            obj2 = this.f2282a.get(str);
            if (obj2 == null) {
                this.f2282a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f2284c) {
            b(obj);
        }
        return obj;
    }
}
