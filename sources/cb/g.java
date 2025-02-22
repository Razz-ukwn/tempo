package cb;

import androidx.fragment.app.z;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class g implements s<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final z f3905a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f3906b;

    public g(Class cls) {
        z zVar;
        this.f3906b = cls;
        Class<ObjectStreamClass> cls2 = ObjectStreamClass.class;
        Class<Class> cls3 = Class.class;
        try {
            Class<?> cls4 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls4.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            zVar = new u(cls4.getMethod("allocateInstance", new Class[]{cls3}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod("getConstructorId", new Class[]{cls3});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls2.getDeclaredMethod("newInstance", new Class[]{cls3, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                zVar = new v(intValue, declaredMethod2);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls3, cls3});
                    declaredMethod3.setAccessible(true);
                    zVar = new w(declaredMethod3);
                } catch (Exception unused3) {
                    zVar = new x();
                }
            }
        }
        this.f3905a = zVar;
    }

    public final Object g() {
        Class cls = this.f3906b;
        try {
            return this.f3905a.m(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }
}
