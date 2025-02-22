package l3;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.savedstate.Recreator;
import androidx.savedstate.a;
import b3.l;
import java.util.Map;
import k.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f10967a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.savedstate.a f10968b = new androidx.savedstate.a();

    /* renamed from: c  reason: collision with root package name */
    public boolean f10969c;

    public a(b bVar) {
        this.f10967a = bVar;
    }

    public final void a() {
        b bVar = this.f10967a;
        j b10 = bVar.b();
        if (b10.b() == j.b.f2278b) {
            b10.a(new Recreator(bVar));
            androidx.savedstate.a aVar = this.f10968b;
            aVar.getClass();
            if (!aVar.f2770b) {
                b10.a(new l(aVar, 1));
                aVar.f2770b = true;
                this.f10969c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        if (!this.f10969c) {
            a();
        }
        j b10 = this.f10967a.b();
        if (!(b10.b().compareTo(j.b.f2280d) >= 0)) {
            androidx.savedstate.a aVar = this.f10968b;
            if (!aVar.f2770b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!aVar.f2772d) {
                aVar.f2771c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                aVar.f2772d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + b10.b()).toString());
        }
    }

    public final void c(Bundle bundle) {
        sf.j.f(bundle, "outBundle");
        androidx.savedstate.a aVar = this.f10968b;
        aVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f2771c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b<String, a.b> bVar = aVar.f2769a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f10237c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
