package dc;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.quickkonnect.silencio.R;
import ff.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import rf.l;
import sf.j;
import sf.r;

public final class b extends RecyclerView.e<a> {
    public final ArrayList<nb.b> B = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final l<ArrayList<nb.b>, m> f7505d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7506e = b.class.getSimpleName();

    public final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final View f7507u;

        /* renamed from: v  reason: collision with root package name */
        public final LinkedHashMap f7508v = new LinkedHashMap();

        public a(View view) {
            super(view);
            this.f7507u = view;
        }

        public final View r(int i8) {
            View findViewById;
            LinkedHashMap linkedHashMap = this.f7508v;
            View view = (View) linkedHashMap.get(Integer.valueOf(i8));
            if (view != null) {
                return view;
            }
            View view2 = this.f7507u;
            if (view2 == null || (findViewById = view2.findViewById(i8)) == null) {
                return null;
            }
            linkedHashMap.put(Integer.valueOf(i8), findViewById);
            return findViewById;
        }
    }

    public b(l<? super ArrayList<nb.b>, m> lVar) {
        this.f7505d = lVar;
    }

    public final int d() {
        return this.B.size();
    }

    public final void i(RecyclerView.b0 b0Var, int i8) {
        boolean z10;
        a aVar = (a) b0Var;
        nb.b bVar = this.B.get(i8);
        j.e(bVar, "images[position]");
        nb.b bVar2 = bVar;
        r rVar = new r();
        Iterator<nb.b> it = rb.a.V.E.iterator();
        while (true) {
            if (it.hasNext()) {
                if (zf.j.s0(it.next().f11620c, bVar2.f11620c, false)) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        rVar.f14953a = z10;
        ((TextView) aVar.r(R.id.tvFolderName)).setText(bVar2.f11619b);
        aVar.r(R.id.viewAlpha).setAlpha(rVar.f14953a ? 0.5f : 0.0f);
        rb.a aVar2 = rb.a.V;
        ((AppCompatImageView) aVar.r(R.id.ivSelect)).setImageResource(aVar2.D);
        AppCompatImageView appCompatImageView = (AppCompatImageView) aVar.r(R.id.ivSelect);
        j.e(appCompatImageView, "ivSelect");
        appCompatImageView.setVisibility(rVar.f14953a ? 0 : 8);
        ImageView imageView = (ImageView) aVar.r(R.id.ivFolderThumbnail);
        j.e(imageView, "ivFolderThumbnail");
        z0.f(imageView, aVar2.F == 3 ? bVar2.f11622e : bVar2.f11620c);
        long j10 = bVar2.f11621d;
        if (j10 != 0) {
            ((TextView) aVar.r(R.id.tvDuration)).setVisibility(0);
            TextView textView = (TextView) aVar.r(R.id.tvDuration);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long hours = timeUnit.toHours(j10);
            long millis = j10 - TimeUnit.HOURS.toMillis(hours);
            long minutes = timeUnit.toMinutes(millis);
            long seconds = timeUnit.toSeconds(millis - TimeUnit.MINUTES.toMillis(minutes));
            StringBuilder sb2 = new StringBuilder();
            if (hours > 0) {
                sb2.append(hours);
                sb2.append(":");
            }
            if (minutes < 10) {
                sb2.append('0');
            }
            sb2.append(minutes);
            sb2.append(":");
            if (seconds < 10) {
                sb2.append('0');
            }
            sb2.append(seconds);
            String sb3 = sb2.toString();
            j.e(sb3, "durationBuilder.toString()");
            textView.setText(sb3);
        }
        aVar.f7507u.setOnClickListener(new a(rVar, b.this, bVar2, aVar));
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        j.f(recyclerView, "parent");
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_media, recyclerView, false);
        j.e(inflate, "from(context).inflate(la…tRes, this, attachToRoot)");
        return new a(inflate);
    }
}
