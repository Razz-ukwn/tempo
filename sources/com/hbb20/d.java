package com.hbb20;

import android.content.DialogInterface;

public final class d implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CountryCodePicker f6411a;

    public d(CountryCodePicker countryCodePicker) {
        this.f6411a = countryCodePicker;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        e.a(e.f6416e);
        this.f6411a.getDialogEventsListener();
    }
}
