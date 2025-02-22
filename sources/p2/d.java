package p2;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import p8.i;

public final class d extends b<d> {

    /* renamed from: r  reason: collision with root package name */
    public e f12428r = null;

    /* renamed from: s  reason: collision with root package name */
    public float f12429s = Float.MAX_VALUE;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12430t = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Object obj) {
        super(obj);
        i.a aVar = i.M;
    }

    public final void c() {
        if (!(this.f12428r.f12432b > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f12419f) {
            this.f12430t = true;
        }
    }
}
