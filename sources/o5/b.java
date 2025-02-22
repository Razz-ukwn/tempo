package o5;

import android.content.Context;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import e.s;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public FastScroller f12178a;

    /* renamed from: b  reason: collision with root package name */
    public s f12179b;

    public final s a() {
        if (this.f12179b == null) {
            this.f12179b = new s((Object) new d(((a) this).f12176c, 1.0f, 1.0f));
        }
        return this.f12179b;
    }

    public final Context b() {
        return this.f12178a.getContext();
    }

    public final s c() {
        return null;
    }
}
