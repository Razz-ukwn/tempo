package pe;

import droidninja.filepicker.views.SmoothCheckBox;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SmoothCheckBox f12607a;

    public a(SmoothCheckBox smoothCheckBox) {
        this.f12607a = smoothCheckBox;
    }

    public final void run() {
        SmoothCheckBox smoothCheckBox = this.f12607a;
        smoothCheckBox.P = true;
        smoothCheckBox.postInvalidate();
    }
}
