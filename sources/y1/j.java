package y1;

import android.os.LocaleList;
import java.util.Locale;

public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f17121a;

    public j(Object obj) {
        this.f17121a = (LocaleList) obj;
    }

    public final String a() {
        return this.f17121a.toLanguageTags();
    }

    public final Object b() {
        return this.f17121a;
    }

    public final boolean equals(Object obj) {
        return this.f17121a.equals(((i) obj).b());
    }

    public final Locale get(int i8) {
        return this.f17121a.get(i8);
    }

    public final int hashCode() {
        return this.f17121a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f17121a.isEmpty();
    }

    public final int size() {
        return this.f17121a.size();
    }

    public final String toString() {
        return this.f17121a.toString();
    }
}
