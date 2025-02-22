package u6;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
import y6.a;

public final class f1 implements ServiceConnection, i1 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15798a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f15799b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15800c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f15801d;

    /* renamed from: e  reason: collision with root package name */
    public final e1 f15802e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f15803f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h1 f15804g;

    public f1(h1 h1Var, e1 e1Var) {
        this.f15804g = h1Var;
        this.f15802e = e1Var;
    }

    public final void a(String str, Executor executor) {
        this.f15799b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            h1 h1Var = this.f15804g;
            a aVar = h1Var.f15821g;
            Context context = h1Var.f15819e;
            boolean d10 = aVar.d(context, str, this.f15802e.a(context), this, 4225, executor);
            this.f15800c = d10;
            if (d10) {
                this.f15804g.f15820f.sendMessageDelayed(this.f15804g.f15820f.obtainMessage(1, this.f15802e), this.f15804g.f15823i);
            } else {
                this.f15799b = 2;
                try {
                    h1 h1Var2 = this.f15804g;
                    h1Var2.f15821g.c(h1Var2.f15819e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f15804g.f15818d) {
            this.f15804g.f15820f.removeMessages(1, this.f15802e);
            this.f15801d = iBinder;
            this.f15803f = componentName;
            for (ServiceConnection onServiceConnected : this.f15798a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f15799b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f15804g.f15818d) {
            this.f15804g.f15820f.removeMessages(1, this.f15802e);
            this.f15801d = null;
            this.f15803f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f15798a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f15799b = 2;
        }
    }
}
