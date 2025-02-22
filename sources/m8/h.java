package m8;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;

public final class h extends f {
    public h(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i8, int i10, int i11, CharSequence charSequence) {
        androidx.appcompat.view.menu.h a10 = a(i8, i10, i11, charSequence);
        k kVar = new k(this.f722a, this, a10);
        a10.f761o = kVar;
        kVar.setHeaderTitle(a10.f752e);
        return kVar;
    }
}
