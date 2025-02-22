package p8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import s3.c;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f12511a;

    public j(l lVar) {
        this.f12511a = lVar;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        l lVar = this.f12511a;
        ArrayList arrayList = lVar.B;
        if (arrayList != null && !lVar.C) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b(lVar);
            }
        }
    }
}
