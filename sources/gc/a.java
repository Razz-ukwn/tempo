package gc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public abstract class a implements Application.ActivityLifecycleCallbacks {
    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
