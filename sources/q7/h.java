package q7;

import android.os.Bundle;
import java.util.EnumMap;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f13093b = new h((Boolean) null, (Boolean) null);

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f13094a;

    public h(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(g.class);
        this.f13094a = enumMap;
        enumMap.put(g.f13015b, bool);
        enumMap.put(g.f13016c, bool2);
    }

    public static h a(Bundle bundle) {
        if (bundle == null) {
            return f13093b;
        }
        EnumMap enumMap = new EnumMap(g.class);
        for (g gVar : g.values()) {
            String string = bundle.getString(gVar.f13019a);
            Boolean bool = null;
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
            }
            enumMap.put(gVar, bool);
        }
        return new h(enumMap);
    }

    public static h b(String str) {
        EnumMap enumMap = new EnumMap(g.class);
        if (str != null) {
            for (int i8 = 0; i8 < 2; i8++) {
                g gVar = g.f13017d[i8];
                int i10 = i8 + 2;
                if (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(gVar, bool);
                }
            }
        }
        return new h(enumMap);
    }

    public final h c(h hVar) {
        EnumMap enumMap = new EnumMap(g.class);
        for (g gVar : g.values()) {
            Boolean bool = (Boolean) this.f13094a.get(gVar);
            Boolean bool2 = (Boolean) hVar.f13094a.get(gVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(gVar, bool);
        }
        return new h(enumMap);
    }

    public final h d(h hVar) {
        EnumMap enumMap = new EnumMap(g.class);
        for (g gVar : g.values()) {
            Boolean bool = (Boolean) this.f13094a.get(gVar);
            if (bool == null) {
                bool = (Boolean) hVar.f13094a.get(gVar);
            }
            enumMap.put(gVar, bool);
        }
        return new h(enumMap);
    }

    public final String e() {
        StringBuilder sb2 = new StringBuilder("G1");
        g[] gVarArr = g.f13017d;
        for (int i8 = 0; i8 < 2; i8++) {
            Boolean bool = (Boolean) this.f13094a.get(gVarArr[i8]);
            sb2.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        g[] values = g.values();
        int length = values.length;
        int i8 = 0;
        while (true) {
            boolean z10 = true;
            if (i8 >= length) {
                return true;
            }
            g gVar = values[i8];
            Boolean bool = (Boolean) this.f13094a.get(gVar);
            boolean z11 = bool == null ? false : bool.booleanValue() ? true : true;
            Boolean bool2 = (Boolean) hVar.f13094a.get(gVar);
            if (bool2 == null) {
                z10 = false;
            } else if (!bool2.booleanValue()) {
                z10 = true;
            }
            if (z11 != z10) {
                return false;
            }
            i8++;
        }
    }

    public final boolean f(g gVar) {
        Boolean bool = (Boolean) this.f13094a.get(gVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean g(h hVar, g... gVarArr) {
        for (g gVar : gVarArr) {
            Boolean bool = (Boolean) this.f13094a.get(gVar);
            Boolean bool2 = (Boolean) hVar.f13094a.get(gVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = 17;
        for (Boolean bool : this.f13094a.values()) {
            i8 = (i8 * 31) + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i8;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("settings: ");
        g[] values = g.values();
        int length = values.length;
        for (int i8 = 0; i8 < length; i8++) {
            g gVar = values[i8];
            if (i8 != 0) {
                sb2.append(", ");
            }
            sb2.append(gVar.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.f13094a.get(gVar);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb2.toString();
    }

    public h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(g.class);
        this.f13094a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
