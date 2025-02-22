package w6;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.tasks.Task;
import h7.f;
import r3.s;
import t6.d;
import u6.t;
import u6.u;

public final class c extends com.google.android.gms.common.api.c {

    /* renamed from: k  reason: collision with root package name */
    public static final a f16494k = new a("ClientTelemetry.API", new b(), new a.f());

    public c(Context context) {
        super(context, f16494k, u.f15865b, c.a.f4193c);
    }

    public final Task<Void> d(t tVar) {
        p.a aVar = new p.a();
        aVar.f4317c = new d[]{f.f9274a};
        aVar.f4316b = false;
        aVar.f4315a = new s((Object) tVar);
        return c(2, new s0(aVar, aVar.f4317c, aVar.f4316b, aVar.f4318d));
    }
}
