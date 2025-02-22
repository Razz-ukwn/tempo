package n0;

import android.view.KeyEvent;
import d0.g;
import rf.l;
import sf.j;

public final class c extends g.c implements d {
    public l<? super b, Boolean> G;
    public l<? super b, Boolean> H = null;

    public c(l lVar) {
        this.G = lVar;
    }

    public final boolean a(KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        l<? super b, Boolean> lVar = this.H;
        if (lVar != null) {
            return lVar.invoke(new b(keyEvent)).booleanValue();
        }
        return false;
    }

    public final boolean k(KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        l<? super b, Boolean> lVar = this.G;
        if (lVar != null) {
            return lVar.invoke(new b(keyEvent)).booleanValue();
        }
        return false;
    }
}
