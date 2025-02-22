package pe;

import android.view.View;
import droidninja.filepicker.views.SmoothCheckBox;

public final class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SmoothCheckBox f12609a;

    public c(SmoothCheckBox smoothCheckBox) {
        this.f12609a = smoothCheckBox;
    }

    public final void onClick(View view) {
        SmoothCheckBox smoothCheckBox = this.f12609a;
        smoothCheckBox.toggle();
        smoothCheckBox.P = false;
        smoothCheckBox.E = 0.0f;
        if (smoothCheckBox.O) {
            smoothCheckBox.c();
        } else {
            smoothCheckBox.d();
        }
    }
}
