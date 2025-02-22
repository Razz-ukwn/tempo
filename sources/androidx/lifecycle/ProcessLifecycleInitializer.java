package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import gf.s;
import java.util.List;
import p3.a;
import p3.b;
import sf.j;

public final class ProcessLifecycleInitializer implements b<p> {
    public final List<Class<? extends b<?>>> a() {
        return s.f8978a;
    }

    public final Object b(Context context) {
        j.f(context, "context");
        a c3 = a.c(context);
        j.e(c3, "getInstance(context)");
        if (c3.f12444b.contains(ProcessLifecycleInitializer.class)) {
            if (!m.f2293a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                j.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new m.a());
            }
            y yVar = y.E;
            yVar.getClass();
            yVar.f2329e = new Handler();
            yVar.B.f(j.a.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            sf.j.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(yVar));
            return yVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
