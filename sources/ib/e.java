package ib;

import android.content.SharedPreferences;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.hbb20.CountryCodePicker;
import com.hbb20.a;
import java.util.ArrayList;

public final class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9635a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f9636b;

    public e(f fVar, int i8) {
        this.f9636b = fVar;
        this.f9635a = i8;
    }

    public final void onClick(View view) {
        ArrayList arrayList;
        f fVar = this.f9636b;
        ArrayList arrayList2 = fVar.f9637d;
        int i8 = this.f9635a;
        if (arrayList2 != null && arrayList2.size() > i8) {
            a aVar = (a) fVar.f9637d.get(i8);
            CountryCodePicker countryCodePicker = fVar.C;
            CountryCodePicker countryCodePicker2 = countryCodePicker.N;
            if (countryCodePicker2.f6368i0) {
                String str = aVar.f6401a;
                SharedPreferences.Editor edit = countryCodePicker2.f6363e.getSharedPreferences(countryCodePicker2.f6357b, 0).edit();
                edit.putString(countryCodePicker2.f6376q0, str);
                edit.apply();
            }
            countryCodePicker.setSelectedCountry(aVar);
        }
        if (view != null && (arrayList = fVar.f9637d) != null && arrayList.size() > i8 && fVar.f9637d.get(i8) != null) {
            ((InputMethodManager) fVar.G.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            fVar.F.dismiss();
        }
    }
}
