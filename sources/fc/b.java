package fc;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.quickkonnect.silencio.R;
import ec.d;
import ff.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import rf.l;
import sf.j;

public final class b extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public final l<nb.a, m> f8680d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<nb.a> f8681e = new ArrayList<>();

    public final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final View f8682u;

        /* renamed from: v  reason: collision with root package name */
        public final LinkedHashMap f8683v = new LinkedHashMap();

        public a(View view) {
            super(view);
            this.f8682u = view;
        }

        public final View r(int i8) {
            View findViewById;
            LinkedHashMap linkedHashMap = this.f8683v;
            View view = (View) linkedHashMap.get(Integer.valueOf(i8));
            if (view != null) {
                return view;
            }
            View view2 = this.f8682u;
            if (view2 == null || (findViewById = view2.findViewById(i8)) == null) {
                return null;
            }
            linkedHashMap.put(Integer.valueOf(i8), findViewById);
            return findViewById;
        }
    }

    public b(d dVar) {
        this.f8680d = dVar;
    }

    public final int d() {
        return this.f8681e.size();
    }

    public final void i(RecyclerView.b0 b0Var, int i8) {
        a aVar = (a) b0Var;
        nb.a aVar2 = this.f8681e.get(i8);
        j.e(aVar2, "buckets[position]");
        nb.a aVar3 = aVar2;
        TextView textView = (TextView) aVar.r(R.id.tvFolderName);
        j.e(textView, "tvFolderName");
        textView.setVisibility(0);
        TextView textView2 = (TextView) aVar.r(R.id.tvDuration);
        j.e(textView2, "tvDuration");
        textView2.setVisibility(8);
        ImageView imageView = (ImageView) aVar.r(R.id.ivFolderThumbnail);
        j.e(imageView, "ivFolderThumbnail");
        z0.f(imageView, aVar3.f11616b);
        String string = ((TextView) aVar.r(R.id.tvFolderName)).getContext().getString(R.string.directory_with_item_count);
        j.e(string, "tvFolderName.context.get…irectory_with_item_count)");
        String format = String.format(string, Arrays.copyOf(new Object[]{aVar3.f11615a, String.valueOf(aVar3.f11617c)}, 2));
        j.e(format, "format(format, *args)");
        ((TextView) aVar.r(R.id.tvFolderName)).setText(format);
        aVar.f2440a.setOnClickListener(new a(b.this, aVar3, 0));
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        j.f(recyclerView, "parent");
        View inflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_media, recyclerView, false);
        j.e(inflate, "from(context).inflate(la…tRes, this, attachToRoot)");
        return new a(inflate);
    }
}
