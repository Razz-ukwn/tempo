package d1;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import b1.c;
import b1.d;
import b1.e;
import c1.b;
import gf.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import sf.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7184a = new a();

    public final Object a(d dVar) {
        j.f(dVar, "localeList");
        ArrayList arrayList = new ArrayList(m.n0(dVar));
        Iterator<c> it = dVar.iterator();
        while (it.hasNext()) {
            c next = it.next();
            j.f(next, "<this>");
            e eVar = next.f2997a;
            j.d(eVar, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            arrayList.add(((b1.a) eVar).f2991a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(b bVar, d dVar) {
        j.f(bVar, "textPaint");
        throw null;
    }
}
