package a1;

import androidx.fragment.app.f1;

public final class h {

    /* renamed from: f  reason: collision with root package name */
    public static final h f37f = new h();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f38a = false;

    /* renamed from: b  reason: collision with root package name */
    public final int f39b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f40c = true;

    /* renamed from: d  reason: collision with root package name */
    public final int f41d = 1;

    /* renamed from: e  reason: collision with root package name */
    public final int f42e = 1;

    public final boolean equals(Object obj) {
        h hVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h) || this.f38a != (hVar = (h) obj).f38a) {
            return false;
        }
        if (!(this.f39b == hVar.f39b) || this.f40c != hVar.f40c) {
            return false;
        }
        if (!(this.f41d == hVar.f41d)) {
            return false;
        }
        return this.f42e == hVar.f42e;
    }

    public final int hashCode() {
        int c3 = f1.c(this.f39b, Boolean.hashCode(this.f38a) * 31, 31);
        return Integer.hashCode(this.f42e) + f1.c(this.f41d, (Boolean.hashCode(this.f40c) + c3) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=");
        sb2.append(this.f38a);
        sb2.append(", capitalization=");
        boolean z10 = true;
        int i8 = this.f39b;
        String str2 = "Invalid";
        if (i8 == 0) {
            str = "None";
        } else {
            if (i8 == 1) {
                str = "Characters";
            } else {
                if (i8 == 2) {
                    str = "Words";
                } else {
                    str = i8 == 3 ? "Sentences" : str2;
                }
            }
        }
        sb2.append(str);
        sb2.append(", autoCorrect=");
        sb2.append(this.f40c);
        sb2.append(", keyboardType=");
        int i10 = this.f41d;
        if (i10 == 1) {
            str2 = "Text";
        } else {
            if (i10 == 2) {
                str2 = "Ascii";
            } else {
                if (i10 == 3) {
                    str2 = "Number";
                } else {
                    if (i10 == 4) {
                        str2 = "Phone";
                    } else {
                        if (i10 == 5) {
                            str2 = "Uri";
                        } else {
                            if (i10 == 6) {
                                str2 = "Email";
                            } else {
                                if (i10 == 7) {
                                    str2 = "Password";
                                } else {
                                    if (i10 == 8) {
                                        str2 = "NumberPassword";
                                    } else {
                                        if (i10 != 9) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            str2 = "Decimal";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        sb2.append(str2);
        sb2.append(", imeAction=");
        sb2.append(g.a(this.f42e));
        sb2.append(')');
        return sb2.toString();
    }
}
