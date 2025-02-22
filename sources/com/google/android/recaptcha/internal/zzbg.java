package com.google.android.recaptcha.internal;

public final class zzbg {
    public static final zzbg zza = new zzbg();

    private zzbg() {
    }

    public static final Class zza(Object obj) {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            Class cls = intValue == 1 ? Integer.TYPE : intValue == 2 ? Short.TYPE : intValue == 3 ? Byte.TYPE : intValue == 4 ? Long.TYPE : intValue == 5 ? Character.TYPE : intValue == 6 ? Float.TYPE : intValue == 7 ? Double.TYPE : intValue == 8 ? Boolean.TYPE : null;
            if (cls != null) {
                return cls;
            }
            throw new zzs(4, 6, (Throwable) null);
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (zzaz.zzc(str)) {
                try {
                    return Class.forName(str);
                } catch (Exception e10) {
                    throw new zzs(6, 8, e10);
                }
            } else {
                throw new zzs(6, 47, (Throwable) null);
            }
        } else {
            throw new zzs(6, 8, (Throwable) null);
        }
    }
}
