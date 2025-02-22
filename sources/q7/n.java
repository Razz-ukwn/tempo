package q7;

import android.accounts.AccountManager;
import h0.e;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class n extends j4 {
    public Boolean B;
    public long C;

    /* renamed from: c  reason: collision with root package name */
    public long f13209c;

    /* renamed from: d  reason: collision with root package name */
    public String f13210d;

    /* renamed from: e  reason: collision with root package name */
    public AccountManager f13211e;

    public n(x3 x3Var) {
        super(x3Var);
    }

    public final boolean j() {
        Calendar instance = Calendar.getInstance();
        this.f13209c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f13210d = e.b(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long m() {
        i();
        return this.C;
    }

    public final long n() {
        k();
        return this.f13209c;
    }

    public final String o() {
        k();
        return this.f13210d;
    }
}
