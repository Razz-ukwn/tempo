package o0;

import android.view.MotionEvent;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final List<o> f12062a;

    /* renamed from: b  reason: collision with root package name */
    public int f12063b;

    public j(List<o> list, e eVar) {
        this.f12062a = list;
        MotionEvent motionEvent = eVar.f12045b.f12086b;
        if (motionEvent != null) {
            motionEvent.getButtonState();
        }
        MotionEvent motionEvent2 = eVar.f12045b.f12086b;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = eVar.f12045b.f12086b;
        int i8 = 0;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                i8 = 6;
                                break;
                            case 9:
                                i8 = 4;
                                break;
                            case 10:
                                i8 = 5;
                                break;
                        }
                    }
                    i8 = 3;
                    this.f12063b = i8;
                }
            }
            i8 = 1;
            this.f12063b = i8;
        }
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            o oVar = list.get(i10);
            sf.j.f(oVar, "<this>");
            boolean z10 = oVar.f12072d;
            boolean z11 = oVar.f12075g;
            if (z11 && !z10) {
                break;
            }
            if (!z11 && z10) {
                break;
            }
            i10++;
        }
        i8 = 1;
        this.f12063b = i8;
        i8 = 2;
        this.f12063b = i8;
    }
}
