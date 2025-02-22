package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.j;
import androidx.lifecycle.y;
import sf.j;

public final class z extends f {
    final /* synthetic */ y this$0;

    public static final class a extends f {
        final /* synthetic */ y this$0;

        public a(y yVar) {
            this.this$0 = yVar;
        }

        public void onActivityPostResumed(Activity activity) {
            j.f(activity, "activity");
            this.this$0.a();
        }

        public void onActivityPostStarted(Activity activity) {
            j.f(activity, "activity");
            y yVar = this.this$0;
            int i8 = yVar.f2325a + 1;
            yVar.f2325a = i8;
            if (i8 == 1 && yVar.f2328d) {
                yVar.B.f(j.a.ON_START);
                yVar.f2328d = false;
            }
        }
    }

    public z(y yVar) {
        this.this$0 = yVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        sf.j.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i8 = a0.f2238b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            sf.j.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((a0) findFragmentByTag).f2239a = this.this$0.D;
        }
    }

    public void onActivityPaused(Activity activity) {
        sf.j.f(activity, "activity");
        y yVar = this.this$0;
        int i8 = yVar.f2326b - 1;
        yVar.f2326b = i8;
        if (i8 == 0) {
            Handler handler = yVar.f2329e;
            sf.j.c(handler);
            handler.postDelayed(yVar.C, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        sf.j.f(activity, "activity");
        y.a.a(activity, new a(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        sf.j.f(activity, "activity");
        y yVar = this.this$0;
        int i8 = yVar.f2325a - 1;
        yVar.f2325a = i8;
        if (i8 == 0 && yVar.f2327c) {
            yVar.B.f(j.a.ON_STOP);
            yVar.f2328d = true;
        }
    }
}
