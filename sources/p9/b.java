package p9;

import android.os.Bundle;
import cb.e;
import com.google.android.gms.internal.measurement.s5;
import p7.a;

public final class b implements a.C0244a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f12524a;

    public b(c cVar) {
        this.f12524a = cVar;
    }

    public final void a(long j10, Bundle bundle, String str, String str2) {
        c cVar = this.f12524a;
        if (cVar.f12525a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            s5 s5Var = a.f12520a;
            String p10 = b1.b.p(str2, e.f3894a0, e.Y);
            if (p10 != null) {
                str2 = p10;
            }
            bundle2.putString("events", str2);
            ((v9.b) cVar.f12526b).a(2, bundle2);
        }
    }
}
