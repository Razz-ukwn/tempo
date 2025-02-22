package j5;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import i5.e;
import j5.d;

public final class b implements d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f9794a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9795b;

    public b(int i8, boolean z10) {
        this.f9794a = i8;
        this.f9795b = z10;
    }

    public final boolean a(Object obj, d.a aVar) {
        Drawable drawable = (Drawable) obj;
        e eVar = (e) aVar;
        Drawable drawable2 = ((ImageView) eVar.f9586a).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f9795b);
        transitionDrawable.startTransition(this.f9794a);
        ((ImageView) eVar.f9586a).setImageDrawable(transitionDrawable);
        return true;
    }
}
