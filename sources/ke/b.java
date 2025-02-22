package ke;

import android.content.Context;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.quickkonnect.silencio.R;
import droidninja.filepicker.views.SmoothCheckBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.e;
import me.c;
import sf.j;
import zf.n;

public final class b extends n<a, me.b> implements Filterable {
    public final Context B;
    public List<me.b> C;
    public final a D;

    public static final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f10423u;

        /* renamed from: v  reason: collision with root package name */
        public final SmoothCheckBox f10424v;

        /* renamed from: w  reason: collision with root package name */
        public final ImageView f10425w;

        /* renamed from: x  reason: collision with root package name */
        public final TextView f10426x;

        /* renamed from: y  reason: collision with root package name */
        public final TextView f10427y;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.checkbox);
            j.e(findViewById, "itemView.findViewById(R.id.checkbox)");
            this.f10424v = (SmoothCheckBox) findViewById;
            View findViewById2 = view.findViewById(R.id.file_iv);
            j.e(findViewById2, "itemView.findViewById(R.id.file_iv)");
            this.f10425w = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.file_name_tv);
            j.e(findViewById3, "itemView.findViewById(R.id.file_name_tv)");
            this.f10426x = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.file_type_tv);
            j.e(findViewById4, "itemView.findViewById(R.id.file_type_tv)");
            this.f10423u = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.file_size_tv);
            j.e(findViewById5, "itemView.findViewById(R.id.file_size_tv)");
            this.f10427y = (TextView) findViewById5;
        }
    }

    /* renamed from: ke.b$b  reason: collision with other inner class name */
    public static final class C0193b extends Filter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10428a;

        public C0193b(b bVar) {
            this.f10428a = bVar;
        }

        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            j.f(charSequence, "charSequence");
            String obj = charSequence.toString();
            boolean z10 = obj.length() == 0;
            b bVar = this.f10428a;
            if (z10) {
                bVar.C = bVar.f10462d;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<? extends T> it = bVar.f10462d.iterator();
                while (it.hasNext()) {
                    me.b bVar2 = (me.b) it.next();
                    String str = bVar2.f11467e;
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        j.e(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (n.A0(lowerCase, obj)) {
                            arrayList.add(bVar2);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                bVar.C = arrayList;
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = bVar.C;
            return filterResults;
        }

        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            j.f(charSequence, "charSequence");
            j.f(filterResults, "filterResults");
            Object obj = filterResults.values;
            if (obj != null) {
                b bVar = this.f10428a;
                bVar.C = (List) obj;
                bVar.g();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<droidninja.filepicker.models.Document>");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, List list, ArrayList arrayList, le.b bVar) {
        super(list, arrayList);
        j.f(arrayList, "selectedPaths");
        this.B = context;
        this.C = list;
        this.D = bVar;
    }

    public static final void t(b bVar, me.b bVar2, a aVar) {
        bVar.getClass();
        if (e.f9993a == 1) {
            e.b(bVar2.B, 2);
        } else {
            SmoothCheckBox smoothCheckBox = aVar.f10424v;
            boolean z10 = smoothCheckBox.O;
            if (z10) {
                smoothCheckBox.b(!z10);
                smoothCheckBox.setVisibility(8);
            } else if (e.e()) {
                smoothCheckBox.b(!smoothCheckBox.O);
                smoothCheckBox.setVisibility(0);
            }
        }
        a aVar2 = bVar.D;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    public final int d() {
        return this.C.size();
    }

    public final Filter getFilter() {
        return new C0193b(this);
    }

    public final void i(RecyclerView.b0 b0Var, int i8) {
        a aVar = (a) b0Var;
        me.b bVar = this.C.get(i8);
        c cVar = bVar.E;
        int i10 = cVar != null ? cVar.f11470c : R.drawable.icon_file_unknown;
        aVar.f10425w.setImageResource(i10);
        int i11 = 8;
        TextView textView = aVar.f10423u;
        if (i10 == R.drawable.icon_file_unknown || i10 == R.drawable.icon_file_pdf) {
            textView.setVisibility(0);
            c cVar2 = bVar.E;
            textView.setText(cVar2 != null ? cVar2.f11468a : null);
        } else {
            textView.setVisibility(8);
        }
        aVar.f10426x.setText(bVar.f11467e);
        String str = bVar.D;
        if (str == null) {
            str = "0";
        }
        aVar.f10427y.setText(Formatter.formatShortFileSize(this.B, Long.parseLong(str)));
        c cVar3 = new c(this, bVar, aVar);
        View view = aVar.f2440a;
        view.setOnClickListener(cVar3);
        SmoothCheckBox smoothCheckBox = aVar.f10424v;
        smoothCheckBox.setOnCheckedChangeListener((SmoothCheckBox.b) null);
        smoothCheckBox.setOnClickListener(new d(this, bVar, aVar));
        smoothCheckBox.setChecked(p(bVar));
        view.setBackgroundResource(p(bVar) ? R.color.bg_gray : 17170443);
        if (p(bVar)) {
            i11 = 0;
        }
        smoothCheckBox.setVisibility(i11);
        smoothCheckBox.setOnCheckedChangeListener(new e(this, bVar, aVar));
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        j.f(recyclerView, "parent");
        View inflate = LayoutInflater.from(this.B).inflate(R.layout.item_doc_layout, recyclerView, false);
        j.e(inflate, "itemView");
        return new a(inflate);
    }
}
