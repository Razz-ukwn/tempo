package sb;

import android.net.Uri;
import com.google.android.recaptcha.RecaptchaDefinitions;
import ff.j;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import mb.c;
import sf.k;

public final class h extends yb.c {

    /* renamed from: e  reason: collision with root package name */
    public final String f14894e = h.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    public final qb.c<Uri> f14895f = new qb.c<>();

    /* renamed from: g  reason: collision with root package name */
    public final qb.c<mb.c<File>> f14896g = new qb.c<>();

    /* renamed from: h  reason: collision with root package name */
    public final j f14897h = b7.a.x(b.f14902a);

    /* renamed from: i  reason: collision with root package name */
    public final j f14898i = b7.a.x(c.f14903a);

    /* renamed from: j  reason: collision with root package name */
    public long f14899j = e();

    /* renamed from: k  reason: collision with root package name */
    public final j f14900k = b7.a.x(new a(this));

    public static final class a extends k implements rf.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f14901a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(0);
            this.f14901a = hVar;
        }

        public final Object d() {
            h hVar = this.f14901a;
            return new g(hVar, hVar.e());
        }
    }

    public static final class b extends k implements rf.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14902a = new b();

        public b() {
            super(0);
        }

        public final Object d() {
            long j10 = rb.a.V.K;
            return Long.valueOf(j10 == 0 ? RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT : j10 * 1000);
        }
    }

    public static final class c extends k implements rf.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f14903a = new c();

        public c() {
            super(0);
        }

        public final Object d() {
            long j10 = rb.a.V.J;
            return Long.valueOf(j10 == 0 ? 5000 : j10 * 1000);
        }
    }

    public final long e() {
        return ((Number) this.f14897h.getValue()).longValue();
    }

    public final void f() {
        sf.j.e(this.f14894e, "logTag");
        j jVar = this.f14898i;
        ((Number) jVar.getValue()).longValue();
        int i8 = (((Number) jVar.getValue()).longValue() > this.f14899j ? 1 : (((Number) jVar.getValue()).longValue() == this.f14899j ? 0 : -1));
        qb.c<mb.c<File>> cVar = this.f14896g;
        if (i8 >= 0) {
            Date date = new Date(((Number) jVar.getValue()).longValue());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            String format = simpleDateFormat.format(date);
            sf.j.e(format, "df.format(d)");
            cVar.k(new c.b(format));
            return;
        }
        cVar.k(new c.a());
    }
}
