package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a7 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f5148a = Logger.getLogger(o6.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final String f5149b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static s6 b() {
        String str;
        Class<a7> cls = a7.class;
        ClassLoader classLoader = cls.getClassLoader();
        Class<s6> cls2 = s6.class;
        if (cls2.equals(cls2)) {
            str = f5149b;
        } else if (cls2.getPackage().equals(cls.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls2.getPackage().getName(), cls2.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls2.getName());
        }
        try {
            return cls2.cast(((a7) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException(e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        } catch (IllegalAccessException e12) {
            throw new IllegalStateException(e12);
        } catch (InvocationTargetException e13) {
            throw new IllegalStateException(e13);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls2.cast(((a7) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    f5148a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls2.getSimpleName()), e14);
                }
            }
            if (arrayList.size() == 1) {
                return (s6) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (s6) cls2.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    public abstract s6 a();
}
