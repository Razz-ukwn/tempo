package e0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import sf.j;

public final class e extends AutofillManager.AutofillCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final e f7764a = new e();

    public final void a(a aVar) {
        j.f(aVar, "autofill");
        aVar.f7761c.registerCallback(this);
    }

    public final void b(a aVar) {
        j.f(aVar, "autofill");
        aVar.f7761c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i8, int i10) {
        j.f(view, "view");
        super.onAutofillEvent(view, i8, i10);
        Log.d("Autofill Status", i10 != 1 ? i10 != 2 ? i10 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
