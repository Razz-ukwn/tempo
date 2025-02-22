package m2;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.databinding.f;

public final class c implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f11179a;

    public c(f fVar) {
        this.f11179a = fVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
    }

    public final void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        f fVar = this.f11179a;
        if (fVar != null) {
            fVar.a();
        }
    }
}
