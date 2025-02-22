package com.hbb20;

import android.content.DialogInterface;

public final class c implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CountryCodePicker f6410a;

    public c(CountryCodePicker countryCodePicker) {
        this.f6410a = countryCodePicker;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        e.a(e.f6416e);
        this.f6410a.getDialogEventsListener();
    }
}
