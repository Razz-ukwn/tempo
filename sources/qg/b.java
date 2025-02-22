package qg;

public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f13616a;

    /* access modifiers changed from: public */
    b(int i8) {
        this.f13616a = i8;
    }
}
