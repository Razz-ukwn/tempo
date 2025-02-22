package m2;

import android.widget.CompoundButton;
import androidx.databinding.f;
import nc.u;

public final class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CompoundButton.OnCheckedChangeListener f11176a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f11177b;

    public a(u.d dVar) {
        this.f11177b = dVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f11176a;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
        this.f11177b.a();
    }
}
