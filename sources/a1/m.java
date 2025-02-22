package a1;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import b7.a;
import sf.j;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final View f47a;

    public m(AndroidComposeView androidComposeView) {
        j.f(androidComposeView, "view");
        this.f47a = androidComposeView;
        a.w(new l(this));
        if (Build.VERSION.SDK_INT < 30) {
            new i(androidComposeView);
        } else {
            new j(androidComposeView);
        }
    }
}
