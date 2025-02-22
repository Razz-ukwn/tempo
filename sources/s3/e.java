package s3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f14609a;

    public e(d dVar) {
        this.f14609a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f14609a;
        ArrayList arrayList = new ArrayList(dVar.f14602e);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((c) arrayList.get(i8)).a(dVar);
        }
    }

    public final void onAnimationStart(Animator animator) {
        d dVar = this.f14609a;
        ArrayList arrayList = new ArrayList(dVar.f14602e);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((c) arrayList.get(i8)).b(dVar);
        }
    }
}
