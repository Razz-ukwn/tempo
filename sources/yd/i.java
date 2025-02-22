package yd;

import android.widget.TextView;
import androidx.recyclerview.widget.k;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.tabs.FriendListModel;
import com.quickkonnect.silencio.models.response.tabs.FriendListResponse;
import com.quickkonnect.silencio.ui.tabs.wallet.WalletFragment;
import ff.m;
import gf.s;
import java.util.List;
import nc.i1;
import rf.l;
import sf.j;
import sf.k;
import zd.b;
import zd.d;
import zd.g;

public final class i extends k implements l<g<FriendListResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WalletFragment f17354a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(WalletFragment walletFragment) {
        super(1);
        this.f17354a = walletFragment;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        WalletFragment walletFragment = this.f17354a;
        if (z10) {
            String str = gVar.f17949b;
            if (str != null) {
                String string = walletFragment.e0().getString(R.string.alert_title);
                j.e(string, "getString(R.string.alert_title)");
                d.d(walletFragment, string, str, "OK", (String) null, false, g.f17352a, h.f17353a);
            }
        } else if (!(gVar instanceof g.c)) {
            if (gVar instanceof g.d) {
                FriendListResponse friendListResponse = (FriendListResponse) gVar.f17948a;
                List<FriendListModel> data = friendListResponse != null ? friendListResponse.getData() : null;
                b bVar = walletFragment.D0;
                if (bVar != null) {
                    List<FriendListModel> list = data == null ? s.f8978a : data;
                    k.d a10 = androidx.recyclerview.widget.k.a(new b(bVar.f17342d, list));
                    bVar.f17342d = list;
                    a10.b(new androidx.recyclerview.widget.b(bVar));
                    i1 i1Var = walletFragment.A0;
                    j.c(i1Var);
                    Object[] objArr = new Object[2];
                    int i8 = 0;
                    objArr[0] = Integer.valueOf(data != null ? data.size() : 0);
                    boolean z11 = true;
                    objArr[1] = (data != null ? data.size() : 0) == 1 ? "" : "s";
                    i1Var.X.setText(walletFragment.y(R.string.you_have_referred_user_formatter, objArr));
                    i1 i1Var2 = walletFragment.A0;
                    j.c(i1Var2);
                    TextView textView = i1Var2.U;
                    j.e(textView, "binding.tvNoTeamFound");
                    if (data == null || data.size() != 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        i8 = 8;
                    }
                    textView.setVisibility(i8);
                } else {
                    j.l("adapter");
                    throw null;
                }
            } else {
                boolean z12 = gVar instanceof g.b;
            }
        }
        return m.f8717a;
    }
}
