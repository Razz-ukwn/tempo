package wg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import sf.j;

public class u extends l {
    public final g0 a(z zVar) {
        File file = zVar.toFile();
        Logger logger = w.f16803a;
        return new y(new FileOutputStream(file, true), new j0());
    }

    public void b(z zVar, z zVar2) {
        j.f(zVar, "source");
        j.f(zVar2, "target");
        if (!zVar.toFile().renameTo(zVar2.toFile())) {
            throw new IOException("failed to move " + zVar + " to " + zVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0.f16774b == true) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(wg.z r4) {
        /*
            r3 = this;
            java.io.File r0 = r4.toFile()
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L_0x002e
            wg.k r0 = r3.i(r4)
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.f16774b
            r1 = 1
            if (r0 != r1) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to create directory: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.u.c(wg.z):void");
    }

    public final void d(z zVar) {
        j.f(zVar, "path");
        File file = zVar.toFile();
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + zVar);
        }
    }

    public final List<z> g(z zVar) {
        j.f(zVar, "dir");
        File file = zVar.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                j.e(str, "it");
                arrayList.add(zVar.c(str));
            }
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            return arrayList;
        } else if (!file.exists()) {
            throw new FileNotFoundException("no such file: " + zVar);
        } else {
            throw new IOException("failed to list " + zVar);
        }
    }

    public k i(z zVar) {
        j.f(zVar, "path");
        File file = zVar.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new k(isFile, isDirectory, (z) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null);
    }

    public final j j(z zVar) {
        j.f(zVar, "file");
        return new t(new RandomAccessFile(zVar.toFile(), "r"));
    }

    public final g0 k(z zVar) {
        j.f(zVar, "file");
        File file = zVar.toFile();
        Logger logger = w.f16803a;
        return new y(new FileOutputStream(file, false), new j0());
    }

    public final i0 l(z zVar) {
        j.f(zVar, "file");
        File file = zVar.toFile();
        Logger logger = w.f16803a;
        return new s(new FileInputStream(file), j0.f16769d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
