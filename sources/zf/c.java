package zf;

import cb.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sf.j;

public final class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f17974a;

    public c(String str) {
        Pattern compile = Pattern.compile(str);
        j.e(compile, "compile(pattern)");
        this.f17974a = compile;
    }

    public final List a(CharSequence charSequence) {
        j.f(charSequence, "input");
        int i8 = 0;
        n.P0(0);
        Matcher matcher = this.f17974a.matcher(charSequence);
        if (!matcher.find()) {
            return d.O(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(i8, matcher.start()).toString());
            i8 = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i8, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.f17974a.toString();
        j.e(pattern, "nativePattern.toString()");
        return pattern;
    }
}
