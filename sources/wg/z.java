package wg;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sf.j;
import xg.k;

public final class z implements Comparable<z> {

    /* renamed from: b  reason: collision with root package name */
    public static final String f16808b;

    /* renamed from: a  reason: collision with root package name */
    public final i f16809a;

    public static final class a {
        public static z a(String str, boolean z10) {
            j.f(str, "<this>");
            i iVar = k.f17098a;
            e eVar = new e();
            eVar.v0(str);
            return k.d(eVar, z10);
        }

        public static z b(File file) {
            String str = z.f16808b;
            j.f(file, "<this>");
            String file2 = file.toString();
            j.e(file2, "toString()");
            return a(file2, false);
        }
    }

    static {
        new a();
        String str = File.separator;
        j.e(str, "separator");
        f16808b = str;
    }

    public z(i iVar) {
        j.f(iVar, "bytes");
        this.f16809a = iVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a10 = k.a(this);
        i iVar = this.f16809a;
        if (a10 == -1) {
            a10 = 0;
        } else if (a10 < iVar.d() && iVar.i(a10) == ((byte) 92)) {
            a10++;
        }
        int d10 = iVar.d();
        int i8 = a10;
        while (a10 < d10) {
            if (iVar.i(a10) == ((byte) 47) || iVar.i(a10) == ((byte) 92)) {
                arrayList.add(iVar.n(i8, a10));
                i8 = a10 + 1;
            }
            a10++;
        }
        if (i8 < iVar.d()) {
            arrayList.add(iVar.n(i8, iVar.d()));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r1.l(0, r3, r3.d()) != false) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final wg.z b() {
        /*
            r9 = this;
            wg.i r0 = xg.k.f17101d
            wg.i r1 = r9.f16809a
            boolean r2 = sf.j.a(r1, r0)
            if (r2 != 0) goto L_0x00cd
            wg.i r2 = xg.k.f17098a
            boolean r3 = sf.j.a(r1, r2)
            if (r3 != 0) goto L_0x00cd
            wg.i r3 = xg.k.f17099b
            boolean r4 = sf.j.a(r1, r3)
            if (r4 != 0) goto L_0x00cd
            wg.i r4 = xg.k.f17102e
            r1.getClass()
            java.lang.String r5 = "suffix"
            sf.j.f(r4, r5)
            int r5 = r1.d()
            byte[] r6 = r4.f16761a
            int r7 = r6.length
            int r5 = r5 - r7
            int r6 = r6.length
            boolean r4 = r1.l(r5, r4, r6)
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0058
            int r4 = r1.d()
            if (r4 != r6) goto L_0x003d
            goto L_0x0056
        L_0x003d:
            int r4 = r1.d()
            int r4 = r4 + -3
            boolean r4 = r1.l(r4, r2, r7)
            if (r4 == 0) goto L_0x004a
            goto L_0x0056
        L_0x004a:
            int r4 = r1.d()
            int r4 = r4 + -3
            boolean r4 = r1.l(r4, r3, r7)
            if (r4 == 0) goto L_0x0058
        L_0x0056:
            r4 = r7
            goto L_0x0059
        L_0x0058:
            r4 = r5
        L_0x0059:
            if (r4 == 0) goto L_0x005d
            goto L_0x00cd
        L_0x005d:
            int r2 = wg.i.k(r1, r2)
            r4 = -1
            if (r2 == r4) goto L_0x0065
            goto L_0x0069
        L_0x0065:
            int r2 = wg.i.k(r1, r3)
        L_0x0069:
            if (r2 != r6) goto L_0x0083
            java.lang.Character r8 = r9.e()
            if (r8 == 0) goto L_0x0083
            int r0 = r1.d()
            r2 = 3
            if (r0 != r2) goto L_0x0079
            goto L_0x00cd
        L_0x0079:
            wg.z r0 = new wg.z
            wg.i r1 = wg.i.o(r1, r5, r2, r7)
            r0.<init>(r1)
            goto L_0x00cb
        L_0x0083:
            if (r2 != r7) goto L_0x0095
            java.lang.String r8 = "prefix"
            sf.j.f(r3, r8)
            int r8 = r3.d()
            boolean r3 = r1.l(r5, r3, r8)
            if (r3 == 0) goto L_0x0095
            goto L_0x00cd
        L_0x0095:
            if (r2 != r4) goto L_0x00ae
            java.lang.Character r3 = r9.e()
            if (r3 == 0) goto L_0x00ae
            int r0 = r1.d()
            if (r0 != r6) goto L_0x00a4
            goto L_0x00cd
        L_0x00a4:
            wg.z r0 = new wg.z
            wg.i r1 = wg.i.o(r1, r5, r6, r7)
            r0.<init>(r1)
            goto L_0x00cb
        L_0x00ae:
            if (r2 != r4) goto L_0x00b6
            wg.z r1 = new wg.z
            r1.<init>(r0)
            goto L_0x00ce
        L_0x00b6:
            if (r2 != 0) goto L_0x00c2
            wg.z r0 = new wg.z
            wg.i r1 = wg.i.o(r1, r5, r7, r7)
            r0.<init>(r1)
            goto L_0x00cb
        L_0x00c2:
            wg.z r0 = new wg.z
            wg.i r1 = wg.i.o(r1, r5, r2, r7)
            r0.<init>(r1)
        L_0x00cb:
            r1 = r0
            goto L_0x00ce
        L_0x00cd:
            r1 = 0
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.z.b():wg.z");
    }

    public final z c(String str) {
        j.f(str, "child");
        e eVar = new e();
        eVar.v0(str);
        return k.b(this, k.d(eVar, false), false);
    }

    public final int compareTo(Object obj) {
        z zVar = (z) obj;
        j.f(zVar, "other");
        return this.f16809a.compareTo(zVar.f16809a);
    }

    @IgnoreJRERequirement
    public final Path d() {
        Path path = Paths.get(toString(), new String[0]);
        j.e(path, "get(toString())");
        return path;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r0 == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Character e() {
        /*
            r4 = this;
            wg.i r0 = xg.k.f17098a
            wg.i r1 = r4.f16809a
            int r0 = wg.i.g(r1, r0)
            r2 = -1
            if (r0 == r2) goto L_0x000c
            goto L_0x003e
        L_0x000c:
            int r0 = r1.d()
            r2 = 2
            if (r0 >= r2) goto L_0x0014
            goto L_0x003e
        L_0x0014:
            r0 = 1
            byte r2 = r1.i(r0)
            r3 = 58
            byte r3 = (byte) r3
            if (r2 == r3) goto L_0x001f
            goto L_0x003e
        L_0x001f:
            r2 = 0
            byte r1 = r1.i(r2)
            char r1 = (char) r1
            r3 = 97
            if (r3 > r1) goto L_0x002f
            r3 = 123(0x7b, float:1.72E-43)
            if (r1 >= r3) goto L_0x002f
            r3 = r0
            goto L_0x0030
        L_0x002f:
            r3 = r2
        L_0x0030:
            if (r3 != 0) goto L_0x0040
            r3 = 65
            if (r3 > r1) goto L_0x003b
            r3 = 91
            if (r1 >= r3) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r0 = r2
        L_0x003c:
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            r0 = 0
            goto L_0x0044
        L_0x0040:
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.z.e():java.lang.Character");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && j.a(((z) obj).f16809a, this.f16809a);
    }

    public final int hashCode() {
        return this.f16809a.hashCode();
    }

    public final File toFile() {
        return new File(toString());
    }

    public final String toString() {
        return this.f16809a.q();
    }
}
