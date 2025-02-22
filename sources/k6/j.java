package k6;

import android.database.Cursor;
import android.util.Base64;
import android.util.JsonReader;
import ca.a;
import com.google.android.gms.tasks.OnFailureListener;
import com.quickkonnect.silencio.ui.measure.claimcoin.congratulation.ClaimCoinCongratulationBottomSheet;
import d6.j;
import java.util.ArrayList;
import k6.s;

public final /* synthetic */ class j implements s.a, a.C0060a, OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10310a;

    public /* synthetic */ j(int i8) {
        this.f10310a = i8;
    }

    public final Object apply(Object obj) {
        boolean z10 = false;
        switch (this.f10310a) {
            case 0:
                throw new l6.a("Timed out while trying to open db.", (Throwable) obj);
            case 1:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    j.a a10 = d6.s.a();
                    a10.b(cursor.getString(1));
                    a10.c(n6.a.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    a10.f7346b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(a10.a());
                }
                return arrayList;
            default:
                if (((Cursor) obj).getCount() > 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    public final Object b(JsonReader jsonReader) {
        return a.a(jsonReader);
    }

    public final void onFailure(Exception exc) {
        int i8 = ClaimCoinCongratulationBottomSheet.Q0;
        sf.j.f(exc, "it");
        bh.a.f3654a.c(exc);
    }
}
