package s9;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.b;
import m9.f;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final k f14815a;

    public a0(f fVar) {
        fVar.a();
        Context context = fVar.f11331a;
        this.f14815a = new k(fVar);
        b.a((Application) context.getApplicationContext());
        b bVar = b.f4212e;
        z zVar = new z(this);
        bVar.getClass();
        synchronized (bVar) {
            bVar.f4215c.add(zVar);
        }
    }
}
