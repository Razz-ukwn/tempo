package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.j;

public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a  reason: collision with root package name */
    public final f f745a;

    /* renamed from: b  reason: collision with root package name */
    public b f746b;

    /* renamed from: c  reason: collision with root package name */
    public d f747c;

    public g(f fVar) {
        this.f745a = fVar;
    }

    public final void c(f fVar, boolean z10) {
        b bVar;
        if ((z10 || fVar == this.f745a) && (bVar = this.f746b) != null) {
            bVar.dismiss();
        }
    }

    public final boolean d(f fVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i8) {
        d dVar = this.f747c;
        if (dVar.B == null) {
            dVar.B = new d.a();
        }
        this.f745a.q(dVar.B.getItem(i8), (j) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f747c.c(this.f745a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        f fVar = this.f745a;
        if (i8 == 82 || i8 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f746b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f746b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                fVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return fVar.performShortcut(i8, keyEvent, 0);
    }
}
