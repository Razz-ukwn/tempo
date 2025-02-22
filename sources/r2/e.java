package r2;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.f;
import androidx.emoji2.text.k;

public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f13780a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13781b;

    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f13780a = keyListener;
        this.f13781b = aVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i8) {
        this.f13780a.clearMetaKeyState(view, editable, i8);
    }

    public final int getInputType() {
        return this.f13780a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i8, KeyEvent keyEvent) {
        boolean z10;
        this.f13781b.getClass();
        Object obj = f.f1822j;
        if (i8 != 67 ? i8 != 112 ? false : k.a(editable, keyEvent, true) : k.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.f13780a.onKeyDown(view, editable, i8, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f13780a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i8, KeyEvent keyEvent) {
        return this.f13780a.onKeyUp(view, editable, i8, keyEvent);
    }
}
