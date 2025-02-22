package a9;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.a;
import com.quickkonnect.silencio.R;

public final class w extends o {

    /* renamed from: e  reason: collision with root package name */
    public final int f206e = R.drawable.design_password_eye;

    /* renamed from: f  reason: collision with root package name */
    public EditText f207f;

    /* renamed from: g  reason: collision with root package name */
    public final v f208g = new v(this, 0);

    public w(a aVar, int i8) {
        super(aVar);
        if (i8 != 0) {
            this.f206e = i8;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return R.string.password_toggle_content_description;
    }

    public final int d() {
        return this.f206e;
    }

    public final View.OnClickListener f() {
        return this.f208g;
    }

    public final boolean k() {
        return true;
    }

    public final boolean l() {
        EditText editText = this.f207f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    public final void m(EditText editText) {
        this.f207f = editText;
        q();
    }

    public final void r() {
        EditText editText = this.f207f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f207f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f207f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
