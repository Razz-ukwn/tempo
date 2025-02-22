package kotlinx.coroutines.internal;

import cb.b;
import ff.h;
import lf.a;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f10737a = 0;

    static {
        Object obj;
        Object obj2;
        try {
            obj = a.class.getCanonicalName();
        } catch (Throwable th) {
            obj = b.u(th);
        }
        if (h.a(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) obj;
        try {
            obj2 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            obj2 = b.u(th2);
        }
        if (h.a(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) obj2;
    }
}
