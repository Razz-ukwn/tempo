package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.j;

public final class a0 extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2238b = 0;

    /* renamed from: a  reason: collision with root package name */
    public a f2239a;

    public interface a {
        void a();

        void b();

        void c();
    }

    public static final class b {
        public static void a(Activity activity, j.a aVar) {
            sf.j.f(activity, "activity");
            sf.j.f(aVar, "event");
            if (activity instanceof r) {
                ((r) activity).b().f(aVar);
            } else if (activity instanceof p) {
                j b10 = ((p) activity).b();
                if (b10 instanceof q) {
                    ((q) b10).f(aVar);
                }
            }
        }

        public static void b(Activity activity) {
            sf.j.f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new c());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new a0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            sf.j.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new c());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            sf.j.f(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            sf.j.f(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            sf.j.f(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            sf.j.f(activity, "activity");
            int i8 = a0.f2238b;
            b.a(activity, j.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            sf.j.f(activity, "activity");
            int i8 = a0.f2238b;
            b.a(activity, j.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            sf.j.f(activity, "activity");
            int i8 = a0.f2238b;
            b.a(activity, j.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            sf.j.f(activity, "activity");
            int i8 = a0.f2238b;
            b.a(activity, j.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            sf.j.f(activity, "activity");
            int i8 = a0.f2238b;
            b.a(activity, j.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            sf.j.f(activity, "activity");
            int i8 = a0.f2238b;
            b.a(activity, j.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            sf.j.f(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            sf.j.f(activity, "activity");
            sf.j.f(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            sf.j.f(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            sf.j.f(activity, "activity");
        }
    }

    public final void a(j.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            sf.j.e(activity, "activity");
            b.a(activity, aVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.f2239a;
        if (aVar != null) {
            aVar.b();
        }
        a(j.a.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(j.a.ON_DESTROY);
        this.f2239a = null;
    }

    public final void onPause() {
        super.onPause();
        a(j.a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        a aVar = this.f2239a;
        if (aVar != null) {
            aVar.c();
        }
        a(j.a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        a aVar = this.f2239a;
        if (aVar != null) {
            aVar.a();
        }
        a(j.a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(j.a.ON_STOP);
    }
}
