package mc;

import android.app.Application;
import java.io.File;
import java.util.regex.Pattern;
import jf.d;
import jg.t;
import jg.u;
import jg.y;
import pf.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final lc.b f11380a;

    public b(Application application, lc.b bVar) {
        this.f11380a = bVar;
    }

    public final Object a(String str, String str2, d dVar) {
        t tVar;
        u.a aVar = new u.a(0);
        aVar.c(u.f10177f);
        Pattern pattern = t.f10171d;
        try {
            tVar = t.a.a("image/jpeg");
        } catch (IllegalArgumentException unused) {
            tVar = null;
        }
        try {
            aVar.a("sampleId", str);
            aVar.a("isFile", String.valueOf(true));
            File file = new File(str2);
            if (file.exists()) {
                aVar.f10187c.add(u.c.a.b("screenshot", "image" + System.currentTimeMillis() + '.' + a.R(file), new y(file, tVar)));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return this.f11380a.c(aVar.b(), dVar);
    }
}
