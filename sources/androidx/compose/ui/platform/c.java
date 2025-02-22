package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import sf.j;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static c f1266d;

    /* renamed from: c  reason: collision with root package name */
    public BreakIterator f1267c;

    public c(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        j.e(characterInstance, "getCharacterInstance(locale)");
        this.f1267c = characterInstance;
    }

    public final int[] a(int i8) {
        int length = d().length();
        if (length <= 0 || i8 >= length) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        do {
            BreakIterator breakIterator = this.f1267c;
            if (breakIterator == null) {
                j.l("impl");
                throw null;
            } else if (!breakIterator.isBoundary(i8)) {
                BreakIterator breakIterator2 = this.f1267c;
                if (breakIterator2 != null) {
                    i8 = breakIterator2.following(i8);
                } else {
                    j.l("impl");
                    throw null;
                }
            } else {
                BreakIterator breakIterator3 = this.f1267c;
                if (breakIterator3 != null) {
                    int following = breakIterator3.following(i8);
                    if (following == -1) {
                        return null;
                    }
                    return c(i8, following);
                }
                j.l("impl");
                throw null;
            }
        } while (i8 != -1);
        return null;
    }

    public final int[] b(int i8) {
        int length = d().length();
        if (length <= 0 || i8 <= 0) {
            return null;
        }
        if (i8 > length) {
            i8 = length;
        }
        do {
            BreakIterator breakIterator = this.f1267c;
            if (breakIterator == null) {
                j.l("impl");
                throw null;
            } else if (!breakIterator.isBoundary(i8)) {
                BreakIterator breakIterator2 = this.f1267c;
                if (breakIterator2 != null) {
                    i8 = breakIterator2.preceding(i8);
                } else {
                    j.l("impl");
                    throw null;
                }
            } else {
                BreakIterator breakIterator3 = this.f1267c;
                if (breakIterator3 != null) {
                    int preceding = breakIterator3.preceding(i8);
                    if (preceding == -1) {
                        return null;
                    }
                    return c(preceding, i8);
                }
                j.l("impl");
                throw null;
            }
        } while (i8 != -1);
        return null;
    }

    public final void e(String str) {
        j.f(str, "text");
        this.f1258a = str;
        BreakIterator breakIterator = this.f1267c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            j.l("impl");
            throw null;
        }
    }
}
