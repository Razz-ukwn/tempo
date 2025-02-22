package e8;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;

public final class b extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f7871a;

    public b(Chip chip) {
        this.f7871a = chip;
    }

    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        a aVar = this.f7871a.f5809e;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
