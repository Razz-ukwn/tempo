package gc;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.lassi.presentation.mediadirectory.LassiMediaPickerActivity;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f8940a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8941b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8942c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8943d = true;

    /* renamed from: e  reason: collision with root package name */
    public volatile CountDownLatch f8944e = null;

    /* renamed from: f  reason: collision with root package name */
    public final ExecutorService f8945f = Executors.newCachedThreadPool();

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArrayList f8946g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f8947h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final WeakHashMap f8948i = new WeakHashMap();

    /* renamed from: j  reason: collision with root package name */
    public final f f8949j;

    /* renamed from: k  reason: collision with root package name */
    public final SharedPreferences f8950k;

    public e(Context context, LassiMediaPickerActivity.c cVar) {
        this.f8950k = context.getSharedPreferences("gc.e", 0);
        this.f8949j = cVar;
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new d(this));
    }
}
