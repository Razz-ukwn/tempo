package fc;

import android.os.Parcelable;
import android.view.View;
import com.quickkonnect.silencio.models.response.menu.AudioHistory;
import pd.j;
import rf.l;
import sf.j;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8678b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Parcelable f8679c;

    public /* synthetic */ a(Object obj, Parcelable parcelable, int i8) {
        this.f8677a = i8;
        this.f8678b = obj;
        this.f8679c = parcelable;
    }

    public final void onClick(View view) {
        int i8 = this.f8677a;
        Parcelable parcelable = this.f8679c;
        Object obj = this.f8678b;
        switch (i8) {
            case 0:
                b bVar = (b) obj;
                nb.a aVar = (nb.a) parcelable;
                j.f(bVar, "this$0");
                j.f(aVar, "$bucket");
                bVar.f8680d.invoke(aVar);
                return;
            default:
                l lVar = (l) obj;
                AudioHistory audioHistory = (AudioHistory) parcelable;
                int i10 = j.b.f12598v;
                sf.j.f(lVar, "$onClicks");
                sf.j.f(audioHistory, "$currentItem");
                lVar.invoke(audioHistory);
                return;
        }
    }
}
