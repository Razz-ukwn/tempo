package ha;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final int f9286a = 1024;

    public final StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i8 = this.f9286a;
        if (length <= i8) {
            return stackTraceElementArr;
        }
        int i10 = i8 / 2;
        int i11 = i8 - i10;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i8];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i11);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i10, stackTraceElementArr2, i11, i10);
        return stackTraceElementArr2;
    }
}
