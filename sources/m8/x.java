package m8;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class x extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public int f11316a;

    public final void b(int i8, boolean z10) {
        super.setVisibility(i8);
        if (z10) {
            this.f11316a = i8;
        }
    }

    public final int getUserSetVisibility() {
        return this.f11316a;
    }

    public void setVisibility(int i8) {
        b(i8, true);
    }
}
