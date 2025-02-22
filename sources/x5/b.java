package x5;

import android.view.GestureDetector;
import android.view.View;
import q5.b;

public abstract class b<T extends q5.b<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public int f16964a = 0;

    /* renamed from: b  reason: collision with root package name */
    public u5.b f16965b;

    /* renamed from: c  reason: collision with root package name */
    public final GestureDetector f16966c;

    /* renamed from: d  reason: collision with root package name */
    public final T f16967d;

    public b(T t2) {
        this.f16967d = t2;
        this.f16966c = new GestureDetector(t2.getContext(), this);
    }
}
