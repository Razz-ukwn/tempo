package e8;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f7870a;

    public /* synthetic */ a(Chip chip) {
        this.f7870a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f7870a.E;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }
}
