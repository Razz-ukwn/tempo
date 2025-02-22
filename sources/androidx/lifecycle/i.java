package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.j;
import androidx.savedstate.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l3.b;
import sf.j;

public final class i {

    public static final class a implements a.C0031a {
        public final void a(b bVar) {
            LinkedHashMap linkedHashMap;
            j.f(bVar, "owner");
            if (bVar instanceof p0) {
                o0 s10 = ((p0) bVar).s();
                androidx.savedstate.a w10 = bVar.w();
                s10.getClass();
                Iterator it = new HashSet(s10.f2301a.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    linkedHashMap = s10.f2301a;
                    if (!hasNext) {
                        break;
                    }
                    String str = (String) it.next();
                    j.f(str, "key");
                    j0 j0Var = (j0) linkedHashMap.get(str);
                    j.c(j0Var);
                    i.a(j0Var, w10, bVar.b());
                }
                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                    w10.d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    public static final void a(j0 j0Var, androidx.savedstate.a aVar, j jVar) {
        Object obj;
        j.f(aVar, "registry");
        j.f(jVar, "lifecycle");
        HashMap hashMap = j0Var.f2282a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = j0Var.f2282a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.f2233c) {
            savedStateHandleController.a(jVar, aVar);
            c(jVar, aVar);
        }
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, j jVar, String str, Bundle bundle) {
        Bundle a10 = aVar.a(str);
        Class<? extends Object>[] clsArr = b0.f2241f;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, b0.a.a(a10, bundle));
        savedStateHandleController.a(jVar, aVar);
        c(jVar, aVar);
        return savedStateHandleController;
    }

    public static void c(j jVar, androidx.savedstate.a aVar) {
        j.b b10 = jVar.b();
        if (b10 != j.b.f2278b) {
            if (!(b10.compareTo(j.b.f2280d) >= 0)) {
                jVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(jVar, aVar));
                return;
            }
        }
        aVar.d();
    }
}
