package com.google.android.material.theme;

import a9.t;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.s;
import com.google.android.material.button.MaterialButton;
import d8.a;
import e.o;

public class MaterialComponentsViewInflater extends o {
    public final d a(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final f c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    public final s d(Context context, AttributeSet attributeSet) {
        return new q8.a(context, attributeSet);
    }

    public final d0 e(Context context, AttributeSet attributeSet) {
        return new b9.a(context, attributeSet);
    }
}
