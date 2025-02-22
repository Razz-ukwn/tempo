package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import k.b;
import sf.j;

@SuppressLint({"RestrictedApi"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final k.b<String, b> f2769a = new k.b<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2770b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f2771c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2772d;

    /* renamed from: e  reason: collision with root package name */
    public Recreator.a f2773e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2774f = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    public interface C0031a {
        void a(l3.b bVar);
    }

    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        j.f(str, "key");
        if (this.f2772d) {
            Bundle bundle = this.f2771c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f2771c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f2771c;
            boolean z10 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                this.f2771c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final b b() {
        Map.Entry entry;
        b bVar;
        Iterator<Map.Entry<String, b>> it = this.f2769a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            entry = (Map.Entry) eVar.next();
            j.e(entry, "components");
            bVar = (b) entry.getValue();
        } while (!j.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return bVar;
    }

    public final void c(String str, b bVar) {
        j.f(str, "key");
        j.f(bVar, "provider");
        if (!(this.f2769a.b(str, bVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        Class<i.a> cls = i.a.class;
        if (this.f2774f) {
            Recreator.a aVar = this.f2773e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.f2773e = aVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.f2773e;
                if (aVar2 != null) {
                    aVar2.f2768a.add(cls.getName());
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
