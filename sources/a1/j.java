package a1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import d2.u1;
import h1.a;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final View f44a;

    /* renamed from: b  reason: collision with root package name */
    public i f45b;

    public j(AndroidComposeView androidComposeView) {
        sf.j.f(androidComposeView, "view");
        this.f44a = androidComposeView;
    }

    public final u1 a() {
        Window window;
        View view = this.f44a;
        ViewParent parent = view.getParent();
        a aVar = parent instanceof a ? (a) parent : null;
        if (aVar == null || (window = aVar.getWindow()) == null) {
            Context context = view.getContext();
            sf.j.e(context, "context");
            while (true) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        window = null;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    sf.j.e(context, "baseContext");
                } else {
                    window = ((Activity) context).getWindow();
                    break;
                }
            }
        }
        if (window != null) {
            return new u1(window, view);
        }
        return null;
    }

    public void b(InputMethodManager inputMethodManager) {
        sf.j.f(inputMethodManager, "imm");
        u1 a10 = a();
        if (a10 != null) {
            a10.f7275a.a();
            return;
        }
        i iVar = this.f45b;
        if (iVar == null) {
            iVar = new i(this.f44a);
            this.f45b = iVar;
        }
        iVar.a(inputMethodManager);
    }

    public void c(InputMethodManager inputMethodManager) {
        sf.j.f(inputMethodManager, "imm");
        u1 a10 = a();
        if (a10 != null) {
            a10.f7275a.e();
            return;
        }
        i iVar = this.f45b;
        if (iVar == null) {
            iVar = new i(this.f44a);
            this.f45b = iVar;
        }
        iVar.b(inputMethodManager);
    }
}
