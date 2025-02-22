package i0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import sf.j;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static Method f9369a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f9370b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f9371c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(Canvas canvas, boolean z10) {
        Method method;
        j.f(canvas, "canvas");
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            h.f9372a.a(canvas, z10);
            return;
        }
        if (!f9371c) {
            Class<Canvas> cls = Canvas.class;
            if (i8 == 28) {
                Class<Class> cls2 = Class.class;
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    f9369a = (Method) declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                    f9370b = (Method) declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                f9369a = cls.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f9370b = cls.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            Method method2 = f9369a;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f9370b;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            f9371c = true;
        }
        if (z10) {
            try {
                Method method4 = f9369a;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z10 && (method = f9370b) != null) {
            method.invoke(canvas, new Object[0]);
        }
    }
}
