package o8;

import android.content.Context;
import android.view.SubMenu;
import androidx.activity.g;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;

public final class c extends f {
    public final int A;

    /* renamed from: z  reason: collision with root package name */
    public final Class<?> f12220z;

    public c(Context context, Class<?> cls, int i8) {
        super(context);
        this.f12220z = cls;
        this.A = i8;
    }

    public final h a(int i8, int i10, int i11, CharSequence charSequence) {
        int size = size() + 1;
        int i12 = this.A;
        if (size <= i12) {
            y();
            h a10 = super.a(i8, i10, i11, charSequence);
            a10.f(true);
            x();
            return a10;
        }
        String simpleName = this.f12220z.getSimpleName();
        StringBuilder sb2 = new StringBuilder("Maximum number of items supported by ");
        sb2.append(simpleName);
        sb2.append(" is ");
        sb2.append(i12);
        sb2.append(". Limit can be checked with ");
        throw new IllegalArgumentException(g.a(sb2, simpleName, "#getMaxItemCount()"));
    }

    public final SubMenu addSubMenu(int i8, int i10, int i11, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f12220z.getSimpleName().concat(" does not support submenus"));
    }
}
