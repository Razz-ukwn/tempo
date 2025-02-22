package v1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u1.d;
import z1.l;

public class j extends i {

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f16135f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor<?> f16136g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f16137h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f16138i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f16139j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f16140k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f16141l;

    public j() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method4 = l(cls);
            method3 = m(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method5 = cls.getMethod("abortCreation", new Class[0]);
            method = n(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f16135f = cls;
        this.f16136g = constructor;
        this.f16137h = method4;
        this.f16138i = method3;
        this.f16139j = method2;
        this.f16140k = method5;
        this.f16141l = method;
    }

    public static Method l(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public static Method m(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public final Typeface a(Context context, d.c cVar, Resources resources, int i8) {
        Object obj;
        if (!k()) {
            return super.a(context, cVar, resources, i8);
        }
        try {
            obj = this.f16136g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0288d dVar : cVar.f15658a) {
            if (!h(context, obj, dVar.f15659a, dVar.f15663e, dVar.f15660b, dVar.f15661c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f15662d))) {
                try {
                    this.f16140k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!j(obj)) {
            return null;
        }
        return i(obj);
    }

    public final Typeface b(Context context, l[] lVarArr, int i8) {
        Object obj;
        Typeface i10;
        boolean z10;
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        l[] lVarArr2 = lVarArr;
        int i11 = i8;
        if (lVarArr2.length < 1) {
            return null;
        }
        if (!k()) {
            l e10 = e(i11, lVarArr2);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(e10.f17652a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e10.f17654c).setItalic(e10.f17655d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (l lVar : lVarArr2) {
                if (lVar.f17656e == 0) {
                    Uri uri = lVar.f17652a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, o.e(context, uri));
                    }
                }
                Context context2 = context;
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f16136g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = lVarArr2.length;
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                Method method = this.f16140k;
                if (i12 < length) {
                    l lVar2 = lVarArr2[i12];
                    ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f17652a);
                    if (byteBuffer != null) {
                        try {
                            z10 = ((Boolean) this.f16138i.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(lVar2.f17653b), null, Integer.valueOf(lVar2.f17654c), Integer.valueOf(lVar2.f17655d ? 1 : 0)})).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                            z10 = false;
                        }
                        if (!z10) {
                            try {
                                method.invoke(obj, new Object[0]);
                                return null;
                            } catch (IllegalAccessException | InvocationTargetException unused4) {
                                return null;
                            }
                        } else {
                            z11 = true;
                        }
                    }
                    i12++;
                } else if (!z11) {
                    try {
                        method.invoke(obj, new Object[0]);
                        return null;
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                        return null;
                    }
                } else if (j(obj) && (i10 = i(obj)) != null) {
                    return Typeface.create(i10, i11);
                } else {
                    return null;
                }
            }
        }
        throw th;
    }

    public final Typeface c(Context context, Resources resources, int i8, String str, int i10) {
        Object obj;
        if (!k()) {
            return super.c(context, resources, i8, str, i10);
        }
        try {
            obj = this.f16136g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!h(context, obj, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            try {
                this.f16140k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!j(obj)) {
            return null;
        } else {
            return i(obj);
        }
    }

    public final boolean h(Context context, Object obj, String str, int i8, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f16137h.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i8), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f16135f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f16141l.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean j(Object obj) {
        try {
            return ((Boolean) this.f16139j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean k() {
        Method method = this.f16137h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public Method n(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
