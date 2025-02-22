package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import ff.j;
import java.util.Map;
import sf.k;

public final class d0 implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.savedstate.a f2259a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2260b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f2261c;

    /* renamed from: d  reason: collision with root package name */
    public final j f2262d;

    public static final class a extends k implements rf.a<e0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p0 f2263a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p0 p0Var) {
            super(0);
            this.f2263a = p0Var;
        }

        public final Object d() {
            return c0.c(this.f2263a);
        }
    }

    public d0(androidx.savedstate.a aVar, p0 p0Var) {
        sf.j.f(aVar, "savedStateRegistry");
        sf.j.f(p0Var, "viewModelStoreOwner");
        this.f2259a = aVar;
        this.f2262d = b7.a.x(new a(p0Var));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2261c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((e0) this.f2262d.getValue()).f2264d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((b0) entry.getValue()).f2246e.a();
            if (!sf.j.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f2260b = false;
        return bundle;
    }
}
