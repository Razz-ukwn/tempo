package j0;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.JsonReader;
import ba.c0;
import ba.r;
import ca.a;
import com.google.android.gms.tasks.OnFailureListener;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import java.util.ArrayList;
import java.util.List;
import k6.j;
import k6.s;
import la.d;
import qa.a;
import x3.b;
import ya.f;

public final /* synthetic */ class f implements j, b.C0313b, s.a, f.a, a.C0253a, a.C0060a, OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9685a;

    public /* synthetic */ f(int i8) {
        this.f9685a = i8;
    }

    public final Object apply(Object obj) {
        switch (this.f9685a) {
            case 3:
                a6.b bVar = s.B;
                return (List) s.D(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new j(1));
            default:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
        }
    }

    public final Object b(JsonReader jsonReader) {
        switch (this.f9685a) {
            case 8:
                return ca.a.e(jsonReader);
            default:
                d dVar = ca.a.f3872a;
                jsonReader.beginObject();
                String str = null;
                Integer num = null;
                c0 c0Var = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    nextName.hashCode();
                    char c3 = 65535;
                    switch (nextName.hashCode()) {
                        case -1266514778:
                            if (nextName.equals("frames")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 3373707:
                            if (nextName.equals("name")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 2125650548:
                            if (nextName.equals("importance")) {
                                c3 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(ca.a.a(jsonReader));
                            }
                            jsonReader.endArray();
                            c0Var = new c0(arrayList);
                            break;
                        case 1:
                            str = jsonReader.nextString();
                            if (str != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 2:
                            num = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                String str2 = str == null ? " name" : "";
                if (num == null) {
                    str2 = str2.concat(" importance");
                }
                if (c0Var == null) {
                    str2 = h4.a.c(str2, " frames");
                }
                if (str2.isEmpty()) {
                    return new r(str, num.intValue(), c0Var);
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
        }
    }

    public final String c(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    public final void d(qa.b bVar) {
    }

    public final double e(double d10) {
        double d11 = d10 < 0.0d ? -d10 : d10;
        return Math.copySign(d11 >= 0.04045d ? Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d) : d11 * 0.07739938080495357d, d10);
    }

    public final void onFailure(Exception exc) {
        int i8 = MeasuringBottomSheet.f6988h1;
        sf.j.f(exc, "it");
    }
}
