package tb;

import java.util.Arrays;
import java.util.List;

public enum e {
    PINCH(r3, r5),
    TAP(r9, r10, r11),
    LONG_TAP(r9, r10, r11),
    SCROLL_HORIZONTAL(r3, r5),
    SCROLL_VERTICAL(r3, r5);
    

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f15542a;

    /* access modifiers changed from: public */
    e(f... fVarArr) {
        this.f15542a = Arrays.asList(fVarArr);
    }
}
