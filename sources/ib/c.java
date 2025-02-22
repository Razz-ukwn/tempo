package ib;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public final class c implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f9633a;

    public c(f fVar) {
        this.f9633a = fVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
    }

    public final void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        String charSequence2 = charSequence.toString();
        f fVar = this.f9633a;
        TextView textView = fVar.B;
        textView.setVisibility(8);
        String lowerCase = charSequence2.toLowerCase();
        if (lowerCase.length() > 0 && lowerCase.charAt(0) == '+') {
            lowerCase = lowerCase.substring(1);
        }
        ArrayList p10 = fVar.p(lowerCase);
        fVar.f9637d = p10;
        if (p10.size() == 0) {
            textView.setVisibility(0);
        }
        fVar.g();
        boolean equals = charSequence.toString().trim().equals("");
        ImageView imageView = fVar.H;
        if (equals) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
    }
}
