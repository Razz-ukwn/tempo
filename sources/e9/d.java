package e9;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import f9.j;

public final class d extends j {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        androidx.activity.result.d.b("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
        new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
    }
}
