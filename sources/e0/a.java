package e0;

import android.view.View;
import android.view.autofill.AutofillManager;
import sf.j;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final View f7759a;

    /* renamed from: b  reason: collision with root package name */
    public final g f7760b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f7761c;

    public a(View view, g gVar) {
        j.f(view, "view");
        j.f(gVar, "autofillTree");
        this.f7759a = view;
        this.f7760b = gVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f7761c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
}
