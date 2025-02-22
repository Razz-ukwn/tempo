package yc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.p;
import cb.b;
import com.quickkonnect.silencio.R;
import h4.h;
import j1.c;
import sf.j;
import x3.f;

public final class d extends p {

    /* renamed from: v0  reason: collision with root package name */
    public c f17336v0;

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8;
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_on_boarding_view_pager, viewGroup, false);
        int i10 = R.id.iv_on_boarding_image;
        ImageView imageView = (ImageView) b.x(inflate, R.id.iv_on_boarding_image);
        if (imageView != null) {
            i10 = R.id.iv_on_boarding_subtitle;
            TextView textView = (TextView) b.x(inflate, R.id.iv_on_boarding_subtitle);
            if (textView != null) {
                i10 = R.id.iv_on_boarding_title;
                TextView textView2 = (TextView) b.x(inflate, R.id.iv_on_boarding_title);
                if (textView2 != null) {
                    c cVar = new c((Object) (LinearLayout) inflate, (Object) imageView, (Object) textView, (Object) textView2);
                    this.f17336v0 = cVar;
                    TextView textView3 = (TextView) cVar.f9758d;
                    Bundle bundle2 = this.C;
                    Integer num = null;
                    textView3.setText(bundle2 != null ? bundle2.getString("TITLE") : null);
                    c cVar2 = this.f17336v0;
                    j.c(cVar2);
                    TextView textView4 = (TextView) cVar2.f9757c;
                    Bundle bundle3 = this.C;
                    textView4.setText(bundle3 != null ? bundle3.getString("SUB_TITLE") : null);
                    c cVar3 = this.f17336v0;
                    j.c(cVar3);
                    ImageView imageView2 = (ImageView) cVar3.f9756b;
                    j.e(imageView2, "binding.ivOnBoardingImage");
                    Bundle bundle4 = this.C;
                    if (bundle4 != null) {
                        num = Integer.valueOf(bundle4.getInt("PAGE_NO"));
                    }
                    if (num != null && num.intValue() == 1) {
                        i8 = R.drawable.on_boarding_1;
                    } else if (num != null && num.intValue() == 2) {
                        i8 = R.drawable.on_boarding_2;
                    } else if (num != null && num.intValue() == 3) {
                        i8 = R.drawable.on_boarding_4;
                    } else if (num != null && num.intValue() == 4) {
                        i8 = R.drawable.on_boarding_3;
                    } else {
                        if (num != null) {
                            num.intValue();
                        }
                        i8 = R.drawable.on_boarding_5;
                    }
                    Integer valueOf = Integer.valueOf(i8);
                    f e10 = cb.f.e(imageView2.getContext());
                    h.a aVar = new h.a(imageView2.getContext());
                    aVar.f9171c = valueOf;
                    aVar.c(imageView2);
                    aVar.b(false);
                    e10.a(aVar.a());
                    c cVar4 = this.f17336v0;
                    j.c(cVar4);
                    LinearLayout linearLayout = (LinearLayout) cVar4.f9755a;
                    j.e(linearLayout, "binding.root");
                    return linearLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    public final void N() {
        this.f2062b0 = true;
        this.f17336v0 = null;
    }
}
