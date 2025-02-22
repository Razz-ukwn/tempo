package yd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.recyclerview.widget.RecyclerView;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.tabs.FriendId;
import com.quickkonnect.silencio.models.response.tabs.FriendListModel;
import e9.c;
import gf.l;
import gf.q;
import gf.s;
import h4.h;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import nc.m1;
import sf.j;
import x3.f;

public final class b extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public List<FriendListModel> f17342d = s.f8978a;

    public static final class a extends RecyclerView.b0 {

        /* renamed from: v  reason: collision with root package name */
        public static final /* synthetic */ int f17343v = 0;

        /* renamed from: u  reason: collision with root package name */
        public final m1 f17344u;

        public a(m1 m1Var) {
            super(m1Var.G);
            this.f17344u = m1Var;
        }
    }

    public final int d() {
        return this.f17342d.size();
    }

    public final void i(RecyclerView.b0 b0Var, int i8) {
        Long timeStamp;
        String str;
        a aVar = (a) b0Var;
        FriendListModel friendListModel = (FriendListModel) q.x0(i8, this.f17342d);
        if (friendListModel != null) {
            m1 m1Var = aVar.f17344u;
            m1Var.w(friendListModel);
            ImageView imageView = m1Var.S;
            j.e(imageView, "binding.imageViewWalletRecycler");
            String profilePic = friendListModel.getProfilePic();
            f e10 = cb.f.e(imageView.getContext());
            h.a aVar2 = new h.a(imageView.getContext());
            aVar2.f9171c = profilePic;
            aVar2.c(imageView);
            aVar2.b(true);
            aVar2.m = c.n(l.f0(new k4.b[]{new k4.a()}));
            aVar2.F = Integer.valueOf(R.drawable.user_img);
            aVar2.G = null;
            e10.a(aVar2.a());
            String format = String.format("%,.2f", Arrays.copyOf(new Object[]{friendListModel.getAmount()}, 1));
            j.e(format, "format(format, *args)");
            m1Var.T.setText(format);
            FriendId friendId = friendListModel.getFriendId();
            boolean a10 = friendId != null ? j.a(friendId.isActive(), Boolean.TRUE) : false;
            TextView textView = m1Var.U;
            View view = aVar.f2440a;
            if (!a10 || ((timeStamp = friendListModel.getTimeStamp()) != null && timeStamp.longValue() == 0)) {
                textView.setText(view.getContext().getText(R.string.wallet_friend_list_inactivation_formatter));
                return;
            }
            Context context = view.getContext();
            Object[] objArr = new Object[1];
            Long timeStamp2 = friendListModel.getTimeStamp();
            try {
                long time = (new Date().getTime() - (timeStamp2 != null ? timeStamp2.longValue() : 0)) / ((long) 3600000);
                if (time > 0) {
                    str = time + " h ago";
                } else {
                    str = "0h ago";
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                str = "";
            }
            objArr[0] = str;
            textView.setText(context.getString(R.string.wallet_friend_list_last_activation_formatter, objArr));
        }
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        j.f(recyclerView, "parent");
        int i10 = a.f17343v;
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        int i11 = m1.X;
        DataBinderMapperImpl dataBinderMapperImpl = e.f1771a;
        m1 m1Var = (m1) ViewDataBinding.p(from, R.layout.item_wallet_recycler, recyclerView, false, (Object) null);
        j.e(m1Var, "inflate(layoutInflater,parent,false)");
        return new a(m1Var);
    }
}
