package lf;

import cb.b;
import ff.m;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import jf.d;
import lf.f;
import sf.j;

public abstract class a implements d<Object>, d, Serializable {
    private final d<Object> completion;

    public a(d<Object> dVar) {
        this.completion = dVar;
    }

    public d<m> create(d<?> dVar) {
        j.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i8;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v3 = eVar.v();
        if (v3 <= 1) {
            int i10 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i8 = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i8 = -1;
            }
            if (i8 >= 0) {
                i10 = eVar.l()[i8];
            }
            f.a aVar = f.f11109b;
            f.a aVar2 = f.f11108a;
            if (aVar == null) {
                try {
                    f.a aVar3 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.f11109b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    f.f11109b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2) {
                Method method = aVar.f11110a;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = aVar.f11111b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = aVar.f11112c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i10);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            d dVar2 = aVar.completion;
            j.c(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == kf.a.f10464a) {
                    return;
                }
            } catch (Throwable th) {
                obj = b.u(th);
            }
            aVar.releaseIntercepted();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public d<m> create(Object obj, d<?> dVar) {
        j.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
