package androidx.compose.ui.platform;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import sf.j;

public final class l implements f1 {

    /* renamed from: a  reason: collision with root package name */
    public final ClipboardManager f1344a;

    public l(Context context) {
        Object systemService = context.getSystemService("clipboard");
        j.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f1344a = (ClipboardManager) systemService;
    }

    public final boolean a() {
        ClipDescription primaryClipDescription = this.f1344a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }
}
