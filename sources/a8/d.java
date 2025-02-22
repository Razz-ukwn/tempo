package a8;

import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.b;

public final class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f130a;

    public d(b bVar) {
        this.f130a = bVar;
    }

    public final void onClick(View view) {
        b bVar = this.f130a;
        if (bVar.F && bVar.isShowing()) {
            if (!bVar.H) {
                TypedArray obtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{16843611});
                bVar.G = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                bVar.H = true;
            }
            if (bVar.G) {
                bVar.cancel();
            }
        }
    }
}
