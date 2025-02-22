package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import sf.j;

public class f implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        j.f(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        j.f(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        j.f(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
        j.f(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        j.f(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        j.f(activity, "activity");
    }
}
