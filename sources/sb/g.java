package sb;

import android.os.CountDownTimer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import mb.c;
import qb.c;
import sf.j;

public final class g extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f14893a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, long j10) {
        super(j10, 1000);
        this.f14893a = hVar;
    }

    public final void onFinish() {
        this.f14893a.f();
    }

    public final void onTick(long j10) {
        h hVar = this.f14893a;
        hVar.f14899j = hVar.e() - j10;
        c<mb.c<File>> cVar = hVar.f14896g;
        Date date = new Date(j10);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(date);
        j.e(format, "df.format(d)");
        cVar.k(new c.d(format));
    }
}
