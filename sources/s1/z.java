package s1;

import android.app.Person;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f14537a;

    /* renamed from: b  reason: collision with root package name */
    public final IconCompat f14538b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14539c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14540d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14541e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14542f;

    public static class a {
        public static z a(Person person) {
            IconCompat iconCompat;
            b bVar = new b();
            bVar.f14543a = person.getName();
            if (person.getIcon() != null) {
                Icon c3 = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f1740k;
                c3.getClass();
                int c10 = IconCompat.a.c(c3);
                if (c10 == 2) {
                    iconCompat = IconCompat.a(IconCompat.a.b(c3), IconCompat.a.a(c3));
                } else if (c10 == 4) {
                    Uri d10 = IconCompat.a.d(c3);
                    d10.getClass();
                    String uri = d10.toString();
                    uri.getClass();
                    iconCompat = new IconCompat(4);
                    iconCompat.f1742b = uri;
                } else if (c10 != 6) {
                    iconCompat = new IconCompat(-1);
                    iconCompat.f1742b = c3;
                } else {
                    Uri d11 = IconCompat.a.d(c3);
                    d11.getClass();
                    String uri2 = d11.toString();
                    uri2.getClass();
                    iconCompat = new IconCompat(6);
                    iconCompat.f1742b = uri2;
                }
            } else {
                iconCompat = null;
            }
            bVar.f14544b = iconCompat;
            bVar.f14545c = person.getUri();
            bVar.f14546d = person.getKey();
            bVar.f14547e = person.isBot();
            bVar.f14548f = person.isImportant();
            return new z(bVar);
        }

        public static Person b(z zVar) {
            Person.Builder name = new Person.Builder().setName(zVar.f14537a);
            Icon icon = null;
            IconCompat iconCompat = zVar.f14538b;
            if (iconCompat != null) {
                iconCompat.getClass();
                icon = IconCompat.a.f(iconCompat, (Context) null);
            }
            return name.setIcon(icon).setUri(zVar.f14539c).setKey(zVar.f14540d).setBot(zVar.f14541e).setImportant(zVar.f14542f).build();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f14543a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f14544b;

        /* renamed from: c  reason: collision with root package name */
        public String f14545c;

        /* renamed from: d  reason: collision with root package name */
        public String f14546d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14547e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f14548f;
    }

    public z(b bVar) {
        this.f14537a = bVar.f14543a;
        this.f14538b = bVar.f14544b;
        this.f14539c = bVar.f14545c;
        this.f14540d = bVar.f14546d;
        this.f14541e = bVar.f14547e;
        this.f14542f = bVar.f14548f;
    }
}
