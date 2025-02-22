package h;

import android.view.View;
import android.view.animation.Interpolator;
import d2.d1;
import d2.e1;
import d2.f1;
import java.util.ArrayList;
import java.util.Iterator;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d1> f9055a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f9056b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f9057c;

    /* renamed from: d  reason: collision with root package name */
    public e1 f9058d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9059e;

    /* renamed from: f  reason: collision with root package name */
    public final a f9060f = new a();

    public class a extends f1 {
        public boolean C = false;
        public int D = 0;

        public a() {
        }

        public final void a() {
            int i8 = this.D + 1;
            this.D = i8;
            g gVar = g.this;
            if (i8 == gVar.f9055a.size()) {
                e1 e1Var = gVar.f9058d;
                if (e1Var != null) {
                    e1Var.a();
                }
                this.D = 0;
                this.C = false;
                gVar.f9059e = false;
            }
        }

        public final void d() {
            if (!this.C) {
                this.C = true;
                e1 e1Var = g.this.f9058d;
                if (e1Var != null) {
                    e1Var.d();
                }
            }
        }
    }

    public final void a() {
        if (this.f9059e) {
            Iterator<d1> it = this.f9055a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f9059e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.f9059e) {
            Iterator<d1> it = this.f9055a.iterator();
            while (it.hasNext()) {
                d1 next = it.next();
                long j10 = this.f9056b;
                if (j10 >= 0) {
                    next.c(j10);
                }
                Interpolator interpolator = this.f9057c;
                if (!(interpolator == null || (view = next.f7198a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f9058d != null) {
                    next.d(this.f9060f);
                }
                View view2 = next.f7198a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f9059e = true;
        }
    }
}
