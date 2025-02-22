package pd;

import com.quickkonnect.silencio.models.response.menu.AudioHistory;
import com.quickkonnect.silencio.ui.menu.history.HistoryFragment;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class f extends k implements l<AudioHistory, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HistoryFragment f12594a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(HistoryFragment historyFragment) {
        super(1);
        this.f12594a = historyFragment;
    }

    public final Object invoke(Object obj) {
        AudioHistory audioHistory = (AudioHistory) obj;
        j.f(audioHistory, "it");
        ag.m.c(this.f12594a).n(new h(audioHistory));
        return m.f8717a;
    }
}
