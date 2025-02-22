package b1;

import java.util.Locale;
import sf.j;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Locale f2991a;

    public a(Locale locale) {
        this.f2991a = locale;
    }

    public final String a() {
        String languageTag = this.f2991a.toLanguageTag();
        j.e(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
