package sf;

import b2.c;
import ff.l;
import java.util.Arrays;

public final class j {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
            j(j.class.getName(), illegalStateException);
            throw illegalStateException;
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            j(j.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            j(j.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
            j(j.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(i(str));
            j(j.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i(str));
            j(j.class.getName(), illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    public static int h(int i8, int i10) {
        if (i8 < i10) {
            return -1;
        }
        return i8 == i10 ? 0 : 1;
    }

    public static String i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = j.class.getName();
        int i8 = 0;
        while (!stackTrace[i8].getClassName().equals(name)) {
            i8++;
        }
        while (stackTrace[i8].getClassName().equals(name)) {
            i8++;
        }
        StackTraceElement stackTraceElement = stackTrace[i8];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void j(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i8 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i8 = i10;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i8 + 1, length));
    }

    public static String k(Object obj, String str) {
        return str + obj;
    }

    public static void l(String str) {
        l lVar = new l(c.a("lateinit property ", str, " has not been initialized"));
        j(j.class.getName(), lVar);
        throw lVar;
    }
}
