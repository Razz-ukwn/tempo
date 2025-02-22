package pb;

import ag.s0;
import android.content.Context;
import com.lassi.data.database.MediaFileDatabase;
import java.util.ArrayList;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.n0;
import nb.b;
import rb.d;

public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12575a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12576b = j.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public MediaFileDatabase f12577c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f12578d = new ArrayList<>();

    public j(Context context) {
        sf.j.f(context, "context");
        this.f12575a = context;
    }

    public final f a(String str) {
        return cb.d.C(cb.b.q(new n0(new i(this, str, (jf.d<? super i>) null))), s0.f481b);
    }
}
