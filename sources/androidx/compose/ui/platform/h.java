package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import sf.j;

public final class h extends b {

    /* renamed from: d  reason: collision with root package name */
    public static h f1292d;

    /* renamed from: c  reason: collision with root package name */
    public BreakIterator f1293c;

    public h(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        j.e(wordInstance, "getWordInstance(locale)");
        this.f1293c = wordInstance;
    }

    public final int[] a(int i8) {
        if (d().length() <= 0 || i8 >= d().length()) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (!g(i8)) {
            if (g(i8) && (i8 == 0 || !g(i8 + -1))) {
                break;
            }
            BreakIterator breakIterator = this.f1293c;
            if (breakIterator != null) {
                i8 = breakIterator.following(i8);
                if (i8 == -1) {
                    return null;
                }
            } else {
                j.l("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f1293c;
        if (breakIterator2 != null) {
            int following = breakIterator2.following(i8);
            if (following == -1 || !f(following)) {
                return null;
            }
            return c(i8, following);
        }
        j.l("impl");
        throw null;
    }

    public final int[] b(int i8) {
        int length = d().length();
        if (length <= 0 || i8 <= 0) {
            return null;
        }
        if (i8 > length) {
            i8 = length;
        }
        while (i8 > 0 && !g(i8 - 1) && !f(i8)) {
            BreakIterator breakIterator = this.f1293c;
            if (breakIterator != null) {
                i8 = breakIterator.preceding(i8);
                if (i8 == -1) {
                    return null;
                }
            } else {
                j.l("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f1293c;
        if (breakIterator2 != null) {
            int preceding = breakIterator2.preceding(i8);
            if (preceding != -1) {
                if (g(preceding) && (preceding == 0 || !g(preceding + -1))) {
                    return c(preceding, i8);
                }
            }
            return null;
        }
        j.l("impl");
        throw null;
    }

    public final void e(String str) {
        j.f(str, "text");
        this.f1258a = str;
        BreakIterator breakIterator = this.f1293c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            j.l("impl");
            throw null;
        }
    }

    public final boolean f(int i8) {
        return i8 > 0 && g(i8 + -1) && (i8 == d().length() || !g(i8));
    }

    public final boolean g(int i8) {
        if (i8 < 0 || i8 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i8));
    }
}
