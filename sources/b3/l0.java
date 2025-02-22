package b3;

import ag.m0;
import android.view.View;
import cb.c;
import com.google.android.gms.internal.measurement.aa;
import com.quickkonnect.silencio.R;
import f1.i;
import h4.d;
import java.util.List;
import kotlinx.coroutines.internal.v;
import l3.b;
import q7.e2;
import q7.g2;
import sf.j;
import yf.k;
import yf.o;
import z0.p;

public final class l0 implements d, e2 {

    /* renamed from: a  reason: collision with root package name */
    public static final v f3099a = new v("NO_DECISION");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ l0 f3100b = new l0();

    public /* synthetic */ l0() {
    }

    public /* synthetic */ l0(m0 m0Var) {
    }

    public static final long a(int i8, int i10) {
        return (((long) i10) & 4294967295L) | (((long) i8) << 32);
    }

    public static final m b(View view) {
        m mVar = (m) o.p0(o.q0(k.o0(view, j0.f3091a), k0.f3096a));
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static final int c(p pVar, int i8) {
        j.f(pVar, "fontWeight");
        boolean z10 = pVar.compareTo(p.f17605b) >= 0;
        boolean z11 = i8 == 1;
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final void d(View view, b bVar) {
        j.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, bVar);
    }

    public static final long e(long j10) {
        return c.f((float) ((int) (j10 >> 32)), (float) i.a(j10));
    }

    public Object zza() {
        List list = g2.f13022a;
        return Long.valueOf(aa.f5157b.zza().zzb());
    }
}
