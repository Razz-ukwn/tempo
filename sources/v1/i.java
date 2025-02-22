package v1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u1.d;

public class i extends n {

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f16130a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<?> f16131b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Method f16132c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f16133d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f16134e = false;

    public static boolean f(Object obj, String str, int i8, boolean z10) {
        g();
        try {
            return ((Boolean) f16132c.invoke(obj, new Object[]{str, Integer.valueOf(i8), Boolean.valueOf(z10)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void g() {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2;
        if (!f16134e) {
            f16134e = true;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                constructor = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            } catch (ClassNotFoundException | NoSuchMethodException e10) {
                Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
                cls = null;
                method2 = null;
                constructor = null;
                method = null;
            }
            f16131b = constructor;
            f16130a = cls;
            f16132c = method;
            f16133d = method2;
        }
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i8) {
        g();
        try {
            Object newInstance = f16131b.newInstance(new Object[0]);
            d.C0288d[] dVarArr = cVar.f15658a;
            int length = dVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                d.C0288d dVar = dVarArr[i10];
                File d10 = o.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!o.b(d10, resources, dVar.f15664f)) {
                        d10.delete();
                        return null;
                    } else if (!f(newInstance, d10.getPath(), dVar.f15660b, dVar.f15661c)) {
                        return null;
                    } else {
                        d10.delete();
                        i10++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(f16130a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f16133d.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
