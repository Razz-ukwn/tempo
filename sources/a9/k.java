package a9;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class k implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f148a;

    public /* synthetic */ k(n nVar) {
        this.f148a = nVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        n nVar = this.f148a;
        nVar.getClass();
        if (motionEvent.getAction() == 1) {
            long currentTimeMillis = System.currentTimeMillis() - nVar.f160o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                nVar.m = false;
            }
            nVar.u();
            nVar.m = true;
            nVar.f160o = System.currentTimeMillis();
        }
        return false;
    }
}
