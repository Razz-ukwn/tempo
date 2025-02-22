package m9;

import android.content.Context;
import na.c;
import oa.i;
import qa.b;
import va.a;

public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11325a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f11326b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11327c;

    public /* synthetic */ d(Context context, String str) {
        this.f11326b = context;
        this.f11327c = str;
    }

    public /* synthetic */ d(f fVar, Context context) {
        this.f11327c = fVar;
        this.f11326b = context;
    }

    public final Object get() {
        int i8 = this.f11325a;
        Context context = this.f11326b;
        Object obj = this.f11327c;
        switch (i8) {
            case 0:
                f fVar = (f) obj;
                return new a(context, fVar.f(), (c) fVar.f11334d.a(c.class));
            default:
                return new i(context, (String) obj);
        }
    }
}
