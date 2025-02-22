package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import java.util.HashMap;
import java.util.Iterator;

public final class l0 extends j0 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f2020j = new a();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, p> f2021d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, l0> f2022e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, o0> f2023f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2024g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2025h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2026i = false;

    public class a implements m0.b {
        public final <T extends j0> T a(Class<T> cls) {
            return new l0(true);
        }
    }

    public l0(boolean z10) {
        this.f2024g = z10;
    }

    public final void c() {
        if (i0.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2025h = true;
    }

    public final void e(p pVar) {
        if (i0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + pVar);
        }
        f(pVar.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f2021d.equals(l0Var.f2021d) && this.f2022e.equals(l0Var.f2022e) && this.f2023f.equals(l0Var.f2023f);
    }

    public final void f(String str) {
        HashMap<String, l0> hashMap = this.f2022e;
        l0 l0Var = hashMap.get(str);
        if (l0Var != null) {
            l0Var.c();
            hashMap.remove(str);
        }
        HashMap<String, o0> hashMap2 = this.f2023f;
        o0 o0Var = hashMap2.get(str);
        if (o0Var != null) {
            o0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void g(p pVar) {
        if (!this.f2026i) {
            if ((this.f2021d.remove(pVar.B) != null) && i0.J(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + pVar);
            }
        } else if (i0.J(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public final int hashCode() {
        int hashCode = this.f2022e.hashCode();
        return this.f2023f.hashCode() + ((hashCode + (this.f2021d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<p> it = this.f2021d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f2022e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2023f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
