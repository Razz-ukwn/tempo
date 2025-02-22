package wg;

import java.io.FileNotFoundException;
import java.util.List;
import sf.j;
import wg.z;
import xg.d;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final u f16785a;

    static {
        u uVar;
        try {
            Class.forName("java.nio.file.Files");
            uVar = new v();
        } catch (ClassNotFoundException unused) {
            uVar = new u();
        }
        f16785a = uVar;
        String str = z.f16808b;
        String property = System.getProperty("java.io.tmpdir");
        j.e(property, "getProperty(\"java.io.tmpdir\")");
        z.a.a(property, false);
        ClassLoader classLoader = d.class.getClassLoader();
        j.e(classLoader, "ResourceFileSystem::class.java.classLoader");
        new d(classLoader);
    }

    public abstract g0 a(z zVar);

    public abstract void b(z zVar, z zVar2);

    public abstract void c(z zVar);

    public abstract void d(z zVar);

    public final void e(z zVar) {
        j.f(zVar, "path");
        d(zVar);
    }

    public final boolean f(z zVar) {
        j.f(zVar, "path");
        return i(zVar) != null;
    }

    public abstract List<z> g(z zVar);

    public final k h(z zVar) {
        j.f(zVar, "path");
        k i8 = i(zVar);
        if (i8 != null) {
            return i8;
        }
        throw new FileNotFoundException("no such file: " + zVar);
    }

    public abstract k i(z zVar);

    public abstract j j(z zVar);

    public abstract g0 k(z zVar);

    public abstract i0 l(z zVar);
}
