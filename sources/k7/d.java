package k7;

import ag.m;
import android.content.Context;
import android.os.WorkSource;
import androidx.compose.ui.platform.j3;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s0;
import com.google.android.gms.tasks.Task;
import n7.b;

public final class d extends c implements b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f10357k = new a("LocationServices.API", new b(), new a.f());

    public d(Context context) {
        super(context, f10357k, a.c.f4182h, c.a.f4193c);
    }

    public final Task d() {
        m.z(100);
        n7.a aVar = new n7.a(60000, 0, 100, Long.MAX_VALUE, false, 0, (String) null, new WorkSource((WorkSource) null), (q) null);
        p.a aVar2 = new p.a();
        aVar2.f4315a = new j3((Object) aVar, (Object) null);
        aVar2.f4318d = 2415;
        return c(0, new s0(aVar2, aVar2.f4317c, aVar2.f4316b, aVar2.f4318d));
    }
}
