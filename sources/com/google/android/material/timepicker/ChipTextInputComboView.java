package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;
import m8.r;
import m8.u;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public final Chip f6221a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f6222b;

    public class a extends r {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (isEmpty) {
                chipTextInputComboView.f6221a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            String a10 = ChipTextInputComboView.a(chipTextInputComboView, editable);
            Chip chip = chipTextInputComboView.f6221a;
            if (TextUtils.isEmpty(a10)) {
                a10 = ChipTextInputComboView.a(chipTextInputComboView, "00");
            }
            chip.setText(a10);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f6221a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f6222b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        editText.setId(i0.e.a());
        i0.e.h((TextView) findViewById(R.id.material_label), editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final boolean isChecked() {
        return this.f6221a.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6222b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public final void setChecked(boolean z10) {
        Chip chip = this.f6221a;
        chip.setChecked(z10);
        int i8 = 0;
        int i10 = z10 ? 0 : 4;
        EditText editText = this.f6222b;
        editText.setVisibility(i10);
        if (z10) {
            i8 = 8;
        }
        chip.setVisibility(i8);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new u(editText));
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6221a.setOnClickListener(onClickListener);
    }

    public final void setTag(int i8, Object obj) {
        this.f6221a.setTag(i8, obj);
    }

    public final void toggle() {
        this.f6221a.toggle();
    }
}
