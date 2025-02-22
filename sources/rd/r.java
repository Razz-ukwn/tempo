package rd;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.gms.internal.p000firebaseauthapi.sh;
import com.google.android.material.button.MaterialButton;
import sf.j;

public final class r implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ sh f14239a;

    public r(sh shVar) {
        this.f14239a = shVar;
    }

    public final void afterTextChanged(Editable editable) {
        ((MaterialButton) this.f14239a.f4922b).setEnabled(j.a(String.valueOf(editable), "DELETE"));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
    }

    public final void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
    }
}
