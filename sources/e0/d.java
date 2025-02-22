package e0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import sf.j;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f7763a = new d();

    public final AutofillId a(ViewStructure viewStructure) {
        j.f(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    public final boolean b(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        return autofillValue.isDate();
    }

    public final boolean c(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        return autofillValue.isList();
    }

    public final boolean d(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        return autofillValue.isText();
    }

    public final boolean e(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        return autofillValue.isToggle();
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        j.f(viewStructure, "structure");
        j.f(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i8) {
        j.f(viewStructure, "structure");
        j.f(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i8);
    }

    public final void h(ViewStructure viewStructure, int i8) {
        j.f(viewStructure, "structure");
        viewStructure.setAutofillType(i8);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        j.f(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        j.e(textValue, "value.textValue");
        return textValue;
    }
}
