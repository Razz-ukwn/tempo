package mc;

import android.app.Application;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import java.io.File;
import java.util.regex.Pattern;
import jf.d;
import jg.t;
import jg.u;
import jg.y;
import yg.b0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final lc.a f11379a;

    public a(Application application, lc.a aVar) {
        this.f11379a = aVar;
    }

    public final Object a(String str, String str2, boolean z10, File file, d<? super b0<LoginWithPhoneResponseModel>> dVar) {
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
            aVar.a("firstName", str);
            aVar.a("lastName", str2);
            aVar.a("isFile", String.valueOf(z10));
            if (z10 && file != null && file.exists()) {
                aVar.f10187c.add(u.c.a.b("picture", "image" + System.currentTimeMillis() + '.' + pf.a.R(file), new y(file, tVar)));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return this.f11379a.k(aVar.b(), dVar);
    }
}
