package t1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.WeakHashMap;
import s1.w;
import u1.f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f15323a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f15324b = new Object();

    /* renamed from: t1.a$a  reason: collision with other inner class name */
    public static class C0282a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i8) {
            return context.getDrawable(i8);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class d {
        public static int a(Context context, int i8) {
            return context.getColor(i8);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static class e {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return (y1.a.a() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : w.a.a(new w(context).f14536a) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static ColorStateList b(Context context, int i8) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (f.f15673c) {
            SparseArray sparseArray = f.f15672b.get(dVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (cVar = (f.c) sparseArray.get(i8)) == null)) {
                if (!cVar.f15675b.equals(resources.getConfiguration()) || (!(theme == null && cVar.f15676c == 0) && (theme == null || cVar.f15676c != theme.hashCode()))) {
                    sparseArray.remove(i8);
                } else {
                    colorStateList2 = cVar.f15674a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = f.f15671a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z10 = true;
        resources.getValue(i8, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            z10 = false;
        }
        if (!z10) {
            try {
                colorStateList = u1.b.a(resources, resources.getXml(i8), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList == null) {
            return f.b.b(resources, i8, theme);
        }
        synchronized (f.f15673c) {
            WeakHashMap<f.d, SparseArray<f.c>> weakHashMap = f.f15672b;
            SparseArray sparseArray2 = weakHashMap.get(dVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(dVar, sparseArray2);
            }
            sparseArray2.append(i8, new f.c(colorStateList, dVar.f15677a.getConfiguration(), theme));
        }
        return colorStateList;
    }
}
