package ha;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f9284a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9285b = new b();

    public a(c... cVarArr) {
        this.f9284a = cVarArr;
    }

    public final StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (c cVar : this.f9284a) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = cVar.c(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.f9285b.c(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
