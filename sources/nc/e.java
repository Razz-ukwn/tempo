package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel;

public abstract class e extends ViewDataBinding {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f11660b0 = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final EditText U;
    public final TextInputLayout V;
    public final TextInputLayout W;
    public final EditText X;
    public final EditText Y;
    public final TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public ChangePasswordViewModel f11661a0;

    public e(Object obj, View view, ImageView imageView, MaterialButton materialButton, EditText editText, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, EditText editText2, EditText editText3, TextView textView) {
        super(3, view, obj);
        this.S = imageView;
        this.T = materialButton;
        this.U = editText;
        this.V = textInputLayout;
        this.W = textInputLayout2;
        this.X = editText2;
        this.Y = editText3;
        this.Z = textView;
    }

    public abstract void w(ChangePasswordViewModel changePasswordViewModel);
}
