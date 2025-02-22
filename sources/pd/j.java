package pd;

import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import bh.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.menu.AudioHistory;
import f3.a2;
import f3.f;
import ff.m;
import h4.h;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import nc.k1;
import rf.l;

public final class j extends a2<AudioHistory, b> {
    public static final a C = new a();
    public final l<AudioHistory, m> B;

    public static final class a extends k.e<AudioHistory> {
        public final boolean a(Object obj, Object obj2) {
            AudioHistory audioHistory = (AudioHistory) obj;
            AudioHistory audioHistory2 = (AudioHistory) obj2;
            sf.j.f(audioHistory, "oldItem");
            sf.j.f(audioHistory2, "newItem");
            return sf.j.a(audioHistory, audioHistory2);
        }

        public final boolean b(Object obj, Object obj2) {
            AudioHistory audioHistory = (AudioHistory) obj;
            AudioHistory audioHistory2 = (AudioHistory) obj2;
            sf.j.f(audioHistory, "oldItem");
            sf.j.f(audioHistory2, "newItem");
            return sf.j.a(audioHistory, audioHistory2);
        }
    }

    public static final class b extends RecyclerView.b0 {

        /* renamed from: v  reason: collision with root package name */
        public static final /* synthetic */ int f12598v = 0;

        /* renamed from: u  reason: collision with root package name */
        public final k1 f12599u;

        public b(k1 k1Var) {
            super(k1Var.G);
            this.f12599u = k1Var;
        }
    }

    public j(f fVar) {
        super(C);
        this.B = fVar;
    }

    /* JADX INFO: finally extract failed */
    public final void i(RecyclerView.b0 b0Var, int i8) {
        b bVar = (b) b0Var;
        f<T> fVar = this.f8071e;
        fVar.getClass();
        try {
            fVar.f8181e = true;
            Object b10 = fVar.f8182f.b(i8);
            fVar.f8181e = false;
            AudioHistory audioHistory = (AudioHistory) b10;
            a.C0053a aVar = bh.a.f3654a;
            aVar.b("=== bindview holder", new Object[0]);
            if (audioHistory != null) {
                l<AudioHistory, m> lVar = this.B;
                sf.j.f(lVar, "onClicks");
                aVar.b("===== bind", new Object[0]);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy , hh:mm", Locale.getDefault());
                Long createdAt = audioHistory.getCreatedAt();
                String format = simpleDateFormat.format(new Date(createdAt != null ? createdAt.longValue() : 0));
                k1 k1Var = bVar.f12599u;
                k1Var.W.setText(format.toString());
                k1Var.V.setText(bVar.f2440a.getContext().getString(R.string.history_db_formatter, new Object[]{audioHistory.getAvgDb()}));
                ImageView imageView = k1Var.T;
                sf.j.e(imageView, "binding.imageViewHistoryRecycler");
                String pathImage = audioHistory.getPathImage();
                x3.f e10 = cb.f.e(imageView.getContext());
                h.a aVar2 = new h.a(imageView.getContext());
                aVar2.f9171c = pathImage;
                aVar2.c(imageView);
                aVar2.b(true);
                aVar2.D = Integer.valueOf(R.drawable.screenshot_placeholder);
                aVar2.E = null;
                aVar2.F = Integer.valueOf(R.drawable.screenshot_placeholder);
                aVar2.G = null;
                e10.a(aVar2.a());
                String format2 = String.format("%,.2f", Arrays.copyOf(new Object[]{audioHistory.getCoinsEarned()}, 1));
                sf.j.e(format2, "format(format, *args)");
                k1Var.U.setText(format2);
                k1Var.S.setOnClickListener(new fc.a(lVar, audioHistory, 1));
            }
        } catch (Throwable th) {
            fVar.f8181e = false;
            throw th;
        }
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        sf.j.f(recyclerView, "parent");
        int i10 = b.f12598v;
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        int i11 = k1.X;
        DataBinderMapperImpl dataBinderMapperImpl = e.f1771a;
        k1 k1Var = (k1) ViewDataBinding.p(from, R.layout.item_history_menu_recycler, recyclerView, false, (Object) null);
        sf.j.e(k1Var, "inflate(layoutInflater, parent, false)");
        return new b(k1Var);
    }
}
