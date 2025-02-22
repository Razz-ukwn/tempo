package vb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.lassi.presentation.cameraview.controls.g;
import u.b;
import ub.h;

public abstract class a<T extends View, Output> {

    /* renamed from: i  reason: collision with root package name */
    public static final wb.a f16353i = new wb.a(a.class.getSimpleName());

    /* renamed from: a  reason: collision with root package name */
    public boolean f16354a;

    /* renamed from: b  reason: collision with root package name */
    public int f16355b;

    /* renamed from: c  reason: collision with root package name */
    public int f16356c;

    /* renamed from: d  reason: collision with root package name */
    public int f16357d;

    /* renamed from: e  reason: collision with root package name */
    public int f16358e;

    /* renamed from: f  reason: collision with root package name */
    public final b f16359f = new b();

    /* renamed from: g  reason: collision with root package name */
    public C0302a f16360g;

    /* renamed from: h  reason: collision with root package name */
    public final T f16361h;

    /* renamed from: vb.a$a  reason: collision with other inner class name */
    public interface C0302a {
    }

    public a(Context context, ViewGroup viewGroup) {
        this.f16361h = g(context, viewGroup);
        this.f16360g = null;
    }

    public void a() {
        b bVar = this.f16359f;
        bVar.e();
        bVar.a((Integer) null);
    }

    public final void b(int i8, int i10) {
        f16353i.a(1, "dispatchOnSurfaceAvailable:", "w=", Integer.valueOf(i8), "h=", Integer.valueOf(i10));
        this.f16355b = i8;
        this.f16356c = i10;
        if (i8 > 0 && i10 > 0) {
            a();
        }
        ((g) this.f16360g).y();
    }

    public final void c() {
        this.f16355b = 0;
        this.f16356c = 0;
        g gVar = (g) this.f16360g;
        gVar.getClass();
        g.Y.a(1, "onSurfaceDestroyed");
        gVar.z((b) null, true, new h(gVar));
    }

    public final void d(int i8, int i10) {
        f16353i.a(1, "dispatchOnSurfaceSizeChanged:", "w=", Integer.valueOf(i8), "h=", Integer.valueOf(i10));
        if (i8 != this.f16355b || i10 != this.f16356c) {
            this.f16355b = i8;
            this.f16356c = i10;
            if (i8 > 0 && i10 > 0) {
                a();
            }
            g gVar = (g) this.f16360g;
            gVar.getClass();
            g.Y.a(1, "onSurfaceChanged, size is", gVar.g());
            gVar.z((b) null, true, new ub.g(gVar));
        }
    }

    public abstract Output e();

    public abstract Class<Output> f();

    public abstract T g(Context context, ViewGroup viewGroup);

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void k(int i8, int i10, boolean z10) {
        f16353i.a(1, "setStreamSize:", "desiredW=", Integer.valueOf(i8), "desiredH=", Integer.valueOf(i10));
        this.f16357d = i8;
        this.f16358e = i10;
        if (i8 > 0 && i10 > 0) {
            a();
        }
    }

    public boolean l() {
        return this instanceof d;
    }
}
