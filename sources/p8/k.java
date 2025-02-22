package p8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import s3.c;

public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f12512a;

    public k(l lVar) {
        this.f12512a = lVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        l lVar = this.f12512a;
        k.super.setVisible(false, false);
        ArrayList arrayList = lVar.B;
        if (arrayList != null && !lVar.C) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(lVar);
            }
        }
    }
}
