package t3;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final o.a<String, Method> f15330a;

    /* renamed from: b  reason: collision with root package name */
    public final o.a<String, Method> f15331b;

    /* renamed from: c  reason: collision with root package name */
    public final o.a<String, Class> f15332c;

    public a(o.a<String, Method> aVar, o.a<String, Method> aVar2, o.a<String, Class> aVar3) {
        this.f15330a = aVar;
        this.f15331b = aVar2;
        this.f15332c = aVar3;
    }

    public abstract b a();

    public final Class b(Class<? extends c> cls) {
        String name = cls.getName();
        o.a<String, Class> aVar = this.f15332c;
        Class orDefault = aVar.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        aVar.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method c(String str) {
        o.a<String, Method> aVar = this.f15330a;
        Method orDefault = aVar.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Class<a> cls = a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        aVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        o.a<String, Method> aVar = this.f15331b;
        Method orDefault = aVar.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class b10 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b10.getDeclaredMethod("write", new Class[]{cls, a.class});
        aVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i8);

    public abstract int i();

    public final int j(int i8, int i10) {
        return !h(i10) ? i8 : i();
    }

    public abstract <T extends Parcelable> T k();

    public abstract String l();

    public final <T extends c> T m() {
        String l10 = l();
        if (l10 == null) {
            return null;
        }
        b a10 = a();
        try {
            return (c) c(l10).invoke((Object) null, new Object[]{a10});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    public abstract void n(int i8);

    public abstract void o(boolean z10);

    public abstract void p(byte[] bArr);

    public abstract void q(CharSequence charSequence);

    public abstract void r(int i8);

    public final void s(int i8, int i10) {
        n(i10);
        r(i8);
    }

    public abstract void t(Parcelable parcelable);

    public abstract void u(String str);

    public final void v(c cVar) {
        if (cVar == null) {
            u((String) null);
            return;
        }
        try {
            u(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke((Object) null, new Object[]{cVar, a10});
                a10.w();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (InvocationTargetException e11) {
                if (e11.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e11.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}
