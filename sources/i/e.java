package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import o.f;
import x1.a;
import x1.b;

public class e extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f9357d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f9357d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return d(this.f9357d.add(charSequence));
    }

    public final int addIntentOptions(int i8, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f9357d.addIntentOptions(i8, i10, i11, componentName, intentArr, intent, i12, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr2[i13] = d(menuItemArr3[i13]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return e(this.f9357d.addSubMenu(charSequence));
    }

    public final void clear() {
        f fVar = (f) this.f9344b;
        if (fVar != null) {
            fVar.clear();
        }
        f fVar2 = (f) this.f9345c;
        if (fVar2 != null) {
            fVar2.clear();
        }
        this.f9357d.clear();
    }

    public final void close() {
        this.f9357d.close();
    }

    public final MenuItem findItem(int i8) {
        return d(this.f9357d.findItem(i8));
    }

    public final MenuItem getItem(int i8) {
        return d(this.f9357d.getItem(i8));
    }

    public final boolean hasVisibleItems() {
        return this.f9357d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i8, KeyEvent keyEvent) {
        return this.f9357d.isShortcutKey(i8, keyEvent);
    }

    public final boolean performIdentifierAction(int i8, int i10) {
        return this.f9357d.performIdentifierAction(i8, i10);
    }

    public final boolean performShortcut(int i8, KeyEvent keyEvent, int i10) {
        return this.f9357d.performShortcut(i8, keyEvent, i10);
    }

    public final void removeGroup(int i8) {
        if (((f) this.f9344b) != null) {
            int i10 = 0;
            while (true) {
                f fVar = (f) this.f9344b;
                if (i10 >= fVar.f12032c) {
                    break;
                }
                if (((b) fVar.i(i10)).getGroupId() == i8) {
                    ((f) this.f9344b).k(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f9357d.removeGroup(i8);
    }

    public final void removeItem(int i8) {
        if (((f) this.f9344b) != null) {
            int i10 = 0;
            while (true) {
                f fVar = (f) this.f9344b;
                if (i10 >= fVar.f12032c) {
                    break;
                } else if (((b) fVar.i(i10)).getItemId() == i8) {
                    ((f) this.f9344b).k(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f9357d.removeItem(i8);
    }

    public final void setGroupCheckable(int i8, boolean z10, boolean z11) {
        this.f9357d.setGroupCheckable(i8, z10, z11);
    }

    public final void setGroupEnabled(int i8, boolean z10) {
        this.f9357d.setGroupEnabled(i8, z10);
    }

    public final void setGroupVisible(int i8, boolean z10) {
        this.f9357d.setGroupVisible(i8, z10);
    }

    public final void setQwertyMode(boolean z10) {
        this.f9357d.setQwertyMode(z10);
    }

    public final int size() {
        return this.f9357d.size();
    }

    public final MenuItem add(int i8) {
        return d(this.f9357d.add(i8));
    }

    public final SubMenu addSubMenu(int i8) {
        return e(this.f9357d.addSubMenu(i8));
    }

    public final MenuItem add(int i8, int i10, int i11, CharSequence charSequence) {
        return d(this.f9357d.add(i8, i10, i11, charSequence));
    }

    public final SubMenu addSubMenu(int i8, int i10, int i11, CharSequence charSequence) {
        return e(this.f9357d.addSubMenu(i8, i10, i11, charSequence));
    }

    public final MenuItem add(int i8, int i10, int i11, int i12) {
        return d(this.f9357d.add(i8, i10, i11, i12));
    }

    public final SubMenu addSubMenu(int i8, int i10, int i11, int i12) {
        return e(this.f9357d.addSubMenu(i8, i10, i11, i12));
    }
}
