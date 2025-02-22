package pe;

import droidninja.filepicker.views.SmoothCheckBox;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SmoothCheckBox f12608a;

    public b(SmoothCheckBox smoothCheckBox) {
        this.f12608a = smoothCheckBox;
    }

    public final void run() {
        this.f12608a.postInvalidate();
    }
}
