package a1;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import ff.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import sf.j;

public final class c0 implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f0 f24a;

    public c0(f0 f0Var) {
        this.f24a = f0Var;
    }

    public final void a(KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        ((BaseInputConnection) this.f24a.f36h.getValue()).sendKeyEvent(keyEvent);
    }

    public final void b() {
        this.f24a.f32d.getClass();
        m mVar = m.f8717a;
    }

    public final void c(ArrayList arrayList) {
        this.f24a.f31c.invoke(arrayList);
    }

    public final void d(u uVar) {
        j.f(uVar, "ic");
        f0 f0Var = this.f24a;
        int size = f0Var.f35g.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList arrayList = f0Var.f35g;
            if (j.a(((WeakReference) arrayList.get(i8)).get(), uVar)) {
                arrayList.remove(i8);
                return;
            }
        }
    }
}
