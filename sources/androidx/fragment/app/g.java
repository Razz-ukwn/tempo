package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.d1;
import androidx.fragment.app.m;

public final class g implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d1.b f1952a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1953b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1954c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m.a f1955d;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            g gVar = g.this;
            gVar.f1953b.endViewTransition(gVar.f1954c);
            gVar.f1955d.a();
        }
    }

    public g(View view, ViewGroup viewGroup, m.a aVar, d1.b bVar) {
        this.f1952a = bVar;
        this.f1953b = viewGroup;
        this.f1954c = view;
        this.f1955d = aVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f1953b.post(new a());
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1952a + " has ended.");
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (i0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1952a + " has reached onAnimationStart.");
        }
    }
}
