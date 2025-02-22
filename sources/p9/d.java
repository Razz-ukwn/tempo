package p9;

import android.os.Bundle;
import p7.a;
import v9.b;

public final class d implements a.C0244a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12527a;

    public d(e eVar) {
        this.f12527a = eVar;
    }

    public final void a(long j10, Bundle bundle, String str, String str2) {
        if (str != null && (!a.f12520a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            ((b) this.f12527a.f12528a).a(3, bundle2);
        }
    }
}
