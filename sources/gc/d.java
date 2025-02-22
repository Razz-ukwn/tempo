package gc;

import android.app.Activity;
import android.os.Bundle;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f8939a;

    public d(e eVar) {
        this.f8939a = eVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e eVar = this.f8939a;
        eVar.f8941b = true;
        eVar.f8942c = false;
        if (eVar.f8943d) {
            eVar.f8943d = false;
            if (bundle == null) {
                eVar.f8950k.edit().clear().apply();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f8939a.f8941b = activity.isFinishing();
    }

    public final void onActivityPaused(Activity activity) {
        this.f8939a.f8942c = activity.isChangingConfigurations();
    }

    public final void onActivityStarted(Activity activity) {
        this.f8939a.f8940a++;
    }

    public final void onActivityStopped(Activity activity) {
        e eVar = this.f8939a;
        eVar.f8940a--;
    }
}
