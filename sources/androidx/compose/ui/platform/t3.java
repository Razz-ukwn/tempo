package androidx.compose.ui.platform;

import ag.g2;
import ag.s0;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.fragment.app.z0;
import cb.d;
import cg.a;
import cg.e;
import com.quickkonnect.silencio.R;
import java.util.LinkedHashMap;
import jf.f;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.w0;
import kotlinx.coroutines.flow.x0;
import kotlinx.coroutines.flow.y0;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.scheduling.c;
import s6.u;
import sf.j;
import t.g0;
import y1.g;

public final class t3 {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f1471a = new LinkedHashMap();

    public static final x0 a(Context context) {
        x0 x0Var;
        LinkedHashMap linkedHashMap = f1471a;
        synchronized (linkedHashMap) {
            Object obj = linkedHashMap.get(context);
            if (obj == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                a d10 = d.d(-1, (e) null, 6);
                n0 n0Var = new n0(new r3(contentResolver, uriFor, new s3(d10, g.a(Looper.getMainLooper())), d10, context, (jf.d<? super r3>) null));
                g2 f10 = d.f();
                c cVar = s0.f480a;
                kotlinx.coroutines.internal.e eVar = new kotlinx.coroutines.internal.e(f10.n0(m.f10728a));
                w0 w0Var = new w0(0, Long.MAX_VALUE);
                Float valueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                u h3 = cb.c.h(n0Var);
                y0 a10 = z0.a(valueOf);
                m0 m0Var = new m0(a10, cb.c.j(eVar, (f) h3.f14792d, (kotlinx.coroutines.flow.f) h3.f14790b, a10, w0Var, valueOf));
                linkedHashMap.put(context, m0Var);
                obj = m0Var;
            }
            x0Var = (x0) obj;
        }
        return x0Var;
    }

    public static final g0 b(View view) {
        j.f(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof g0) {
            return (g0) tag;
        }
        return null;
    }
}
