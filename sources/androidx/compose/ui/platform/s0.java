package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import sf.j;
import u0.a;

public final class s0 implements ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Configuration f1457a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f1458b;

    public s0(Configuration configuration, a aVar) {
        this.f1457a = configuration;
        this.f1458b = aVar;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        j.f(configuration, "configuration");
        Configuration configuration2 = this.f1457a;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator<Map.Entry<Object, WeakReference<a.C0287a>>> it = this.f1458b.f15647a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, WeakReference<a.C0287a>> next = it.next();
            j.e(next, "it.next()");
            if (((a.C0287a) ((WeakReference) next.getValue()).get()) == null || Configuration.needNewResources(updateFrom, 0)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    public final void onLowMemory() {
        this.f1458b.f15647a.clear();
    }

    public final void onTrimMemory(int i8) {
        this.f1458b.f15647a.clear();
    }
}
