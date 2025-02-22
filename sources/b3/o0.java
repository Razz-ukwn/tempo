package b3;

import android.annotation.SuppressLint;
import b2.c;
import b3.m0;
import java.util.LinkedHashMap;
import sf.j;

@SuppressLint({"TypeParameterUnusedInFormals"})
public final class o0 {

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f3151b = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f3152a = new LinkedHashMap();

    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = o0.f3151b;
            String str = (String) linkedHashMap.get(cls);
            if (str == null) {
                m0.b bVar = (m0.b) cls.getAnnotation(m0.b.class);
                str = bVar != null ? bVar.value() : null;
                if (b(str)) {
                    linkedHashMap.put(cls, str);
                } else {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
            }
            j.c(str);
            return str;
        }

        public static boolean b(String str) {
            if (str == null) {
                return false;
            }
            return str.length() > 0;
        }
    }

    public final void a(m0 m0Var) {
        String a10 = a.a(m0Var.getClass());
        if (a.b(a10)) {
            LinkedHashMap linkedHashMap = this.f3152a;
            m0 m0Var2 = (m0) linkedHashMap.get(a10);
            if (!j.a(m0Var2, m0Var)) {
                if (!(!(m0Var2 != null && m0Var2.f3144b))) {
                    throw new IllegalStateException(("Navigator " + m0Var + " is replacing an already attached " + m0Var2).toString());
                } else if (!m0Var.f3144b) {
                    m0 m0Var3 = (m0) linkedHashMap.put(a10, m0Var);
                } else {
                    throw new IllegalStateException(("Navigator " + m0Var + " is already attached to another NavController").toString());
                }
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
    }

    public final <T extends m0<?>> T b(String str) {
        j.f(str, "name");
        if (a.b(str)) {
            T t2 = (m0) this.f3152a.get(str);
            if (t2 != null) {
                return t2;
            }
            throw new IllegalStateException(c.a("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
