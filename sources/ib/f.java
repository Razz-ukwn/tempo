package ib;

import android.app.Dialog;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hbb20.CountryCodePicker;
import com.quickkonnect.silencio.R;
import h0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n5.b;

public final class f extends RecyclerView.e<a> implements b {
    public final TextView B;
    public final CountryCodePicker C;
    public final LayoutInflater D;
    public final EditText E;
    public final Dialog F;
    public final Context G;
    public final ImageView H;
    public int I = 0;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f9637d = null;

    /* renamed from: e  reason: collision with root package name */
    public final List<com.hbb20.a> f9638e = null;

    public class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final RelativeLayout f9639u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f9640v;

        /* renamed from: w  reason: collision with root package name */
        public final TextView f9641w;

        /* renamed from: x  reason: collision with root package name */
        public final ImageView f9642x;

        /* renamed from: y  reason: collision with root package name */
        public final LinearLayout f9643y;

        /* renamed from: z  reason: collision with root package name */
        public final View f9644z;

        public a(View view) {
            super(view);
            RelativeLayout relativeLayout = (RelativeLayout) view;
            this.f9639u = relativeLayout;
            TextView textView = (TextView) relativeLayout.findViewById(R.id.textView_countryName);
            this.f9640v = textView;
            TextView textView2 = (TextView) relativeLayout.findViewById(R.id.textView_code);
            this.f9641w = textView2;
            this.f9642x = (ImageView) relativeLayout.findViewById(R.id.image_flag);
            this.f9643y = (LinearLayout) relativeLayout.findViewById(R.id.linear_flag_holder);
            View findViewById = relativeLayout.findViewById(R.id.preferenceDivider);
            this.f9644z = findViewById;
            int dialogTextColor = f.this.C.getDialogTextColor();
            CountryCodePicker countryCodePicker = f.this.C;
            if (dialogTextColor != 0) {
                textView.setTextColor(countryCodePicker.getDialogTextColor());
                textView2.setTextColor(countryCodePicker.getDialogTextColor());
                findViewById.setBackgroundColor(countryCodePicker.getDialogTextColor());
            }
            if (countryCodePicker.getCcpDialogRippleEnable()) {
                TypedValue typedValue = new TypedValue();
                f.this.G.getTheme().resolveAttribute(16843534, typedValue, true);
                int i8 = typedValue.resourceId;
                if (i8 != 0) {
                    relativeLayout.setBackgroundResource(i8);
                } else {
                    relativeLayout.setBackgroundResource(typedValue.data);
                }
            }
            try {
                if (countryCodePicker.getDialogTypeFace() == null) {
                    return;
                }
                if (countryCodePicker.getDialogTypeFaceStyle() != -99) {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    return;
                }
                textView2.setTypeface(countryCodePicker.getDialogTypeFace());
                textView.setTypeface(countryCodePicker.getDialogTypeFace());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public f(Context context, List<com.hbb20.a> list, CountryCodePicker countryCodePicker, RelativeLayout relativeLayout, EditText editText, TextView textView, Dialog dialog, ImageView imageView) {
        this.G = context;
        this.f9638e = list;
        this.C = countryCodePicker;
        this.F = dialog;
        this.B = textView;
        this.E = editText;
        this.H = imageView;
        this.D = LayoutInflater.from(context);
        this.f9637d = p("");
        if (countryCodePicker.f6365f0) {
            imageView.setVisibility(8);
            editText.addTextChangedListener(new c(this));
            editText.setOnEditorActionListener(new d(this));
            imageView.setOnClickListener(new b(this));
            return;
        }
        relativeLayout.setVisibility(8);
    }

    public final String c(int i8) {
        com.hbb20.a aVar = (com.hbb20.a) this.f9637d.get(i8);
        return this.I > i8 ? "★" : aVar != null ? aVar.f6403c.substring(0, 1) : "☺";
    }

    public final int d() {
        return this.f9637d.size();
    }

    public final void i(RecyclerView.b0 b0Var, int i8) {
        a aVar = (a) b0Var;
        com.hbb20.a aVar2 = (com.hbb20.a) this.f9637d.get(i8);
        View view = aVar.f9644z;
        LinearLayout linearLayout = aVar.f9643y;
        TextView textView = aVar.f9640v;
        TextView textView2 = aVar.f9641w;
        if (aVar2 != null) {
            view.setVisibility(8);
            textView.setVisibility(0);
            textView2.setVisibility(0);
            f fVar = f.this;
            if (fVar.C.V) {
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            CountryCodePicker countryCodePicker = fVar.C;
            StringBuilder c3 = e.c((!countryCodePicker.getCcpDialogShowFlag() || !countryCodePicker.f6372m0) ? "" : com.hbb20.a.g(aVar2).concat("   "));
            c3.append(aVar2.f6403c);
            String sb2 = c3.toString();
            if (countryCodePicker.getCcpDialogShowNameCode()) {
                StringBuilder b10 = d.a.b(sb2, " (");
                b10.append(aVar2.f6401a.toUpperCase(Locale.US));
                b10.append(")");
                sb2 = b10.toString();
            }
            textView.setText(sb2);
            textView2.setText("+" + aVar2.f6402b);
            if (!countryCodePicker.getCcpDialogShowFlag() || countryCodePicker.f6372m0) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                if (aVar2.f6405e == -99) {
                    aVar2.f6405e = com.hbb20.a.h(aVar2);
                }
                aVar.f9642x.setImageResource(aVar2.f6405e);
            }
        } else {
            view.setVisibility(0);
            textView.setVisibility(8);
            textView2.setVisibility(8);
            linearLayout.setVisibility(8);
        }
        int size = this.f9637d.size();
        RelativeLayout relativeLayout = aVar.f9639u;
        if (size <= i8 || this.f9637d.get(i8) == null) {
            relativeLayout.setOnClickListener((View.OnClickListener) null);
        } else {
            relativeLayout.setOnClickListener(new e(this, i8));
        }
    }

    public final RecyclerView.b0 j(RecyclerView recyclerView, int i8) {
        return new a(this.D.inflate(R.layout.layout_recycler_country_tile, recyclerView, false));
    }

    public final ArrayList p(String str) {
        ArrayList arrayList = new ArrayList();
        this.I = 0;
        CountryCodePicker countryCodePicker = this.C;
        ArrayList arrayList2 = countryCodePicker.f6381v0;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = countryCodePicker.f6381v0.iterator();
            while (it.hasNext()) {
                com.hbb20.a aVar = (com.hbb20.a) it.next();
                if (aVar.k(str)) {
                    arrayList.add(aVar);
                    this.I++;
                }
            }
            if (arrayList.size() > 0) {
                arrayList.add((Object) null);
                this.I++;
            }
        }
        for (com.hbb20.a next : this.f9638e) {
            if (next.k(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
