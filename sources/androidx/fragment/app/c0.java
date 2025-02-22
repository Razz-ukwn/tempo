package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

public abstract class c0<E> extends z {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f1914b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1915c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1916d;

    /* renamed from: e  reason: collision with root package name */
    public final j0 f1917e = new j0();

    public c0(x xVar) {
        Handler handler = new Handler();
        this.f1914b = xVar;
        if (xVar != null) {
            this.f1915c = xVar;
            this.f1916d = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract void F(PrintWriter printWriter, String[] strArr);

    public abstract x G();

    public abstract LayoutInflater H();

    public abstract boolean I(String str);

    public abstract void J();
}
