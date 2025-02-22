package q7;

import com.google.android.gms.internal.measurement.i2;
import com.google.android.gms.internal.measurement.n2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import u6.q;

public abstract class i7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f13127a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13128b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f13129c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f13130d;

    /* renamed from: e  reason: collision with root package name */
    public Long f13131e;

    /* renamed from: f  reason: collision with root package name */
    public Long f13132f;

    public i7(int i8, String str) {
        this.f13127a = str;
        this.f13128b = i8;
    }

    public static Boolean d(BigDecimal bigDecimal, i2 i2Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        q.i(i2Var);
        if (i2Var.z()) {
            boolean z10 = true;
            if (i2Var.E() != 1) {
                if (i2Var.E() == 5) {
                    if (!i2Var.D() || !i2Var.C()) {
                        return null;
                    }
                } else if (!i2Var.A()) {
                    return null;
                }
                int E = i2Var.E();
                if (i2Var.E() == 5) {
                    if (v6.J(i2Var.x()) && v6.J(i2Var.w())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(i2Var.x());
                            bigDecimal3 = new BigDecimal(i2Var.w());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!v6.J(i2Var.v())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(i2Var.v());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (E == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i8 = E - 1;
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d10 != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                                    z10 = false;
                                }
                                return Boolean.valueOf(z10);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            }
        }
        return null;
    }

    public static Boolean e(String str, n2 n2Var, s2 s2Var) {
        List<String> list;
        q.i(n2Var);
        if (str == null || !n2Var.B() || n2Var.C() == 1) {
            return null;
        }
        if (n2Var.C() == 7) {
            if (n2Var.t() == 0) {
                return null;
            }
        } else if (!n2Var.A()) {
            return null;
        }
        int C = n2Var.C();
        boolean y10 = n2Var.y();
        String w10 = (y10 || C == 2 || C == 7) ? n2Var.w() : n2Var.w().toUpperCase(Locale.ENGLISH);
        if (n2Var.t() == 0) {
            list = null;
        } else {
            list = n2Var.x();
            if (!y10) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String upperCase : list) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = C == 2 ? w10 : null;
        if (C == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (w10 == null) {
            return null;
        }
        if (!y10 && C != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C - 1) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, true != y10 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    s2Var.E.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(w10));
            case 3:
                return Boolean.valueOf(str.endsWith(w10));
            case 4:
                return Boolean.valueOf(str.contains(w10));
            case 5:
                return Boolean.valueOf(str.equals(w10));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean f(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
