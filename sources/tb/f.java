package tb;

public enum f {
    NONE(0),
    FOCUS(1),
    FOCUS_WITH_MARKER(2),
    CAPTURE(3),
    ZOOM(4),
    EXPOSURE_CORRECTION(5);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f15547a;

    /* access modifiers changed from: public */
    f(int i8) {
        this.f15547a = i8;
    }

    public static f a(int i8) {
        for (f fVar : values()) {
            if (fVar.f15547a == i8) {
                return fVar;
            }
        }
        return null;
    }
}
