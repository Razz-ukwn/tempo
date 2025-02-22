package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.hbb20.CountryCodePicker;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordViewModel;

public abstract class x extends ViewDataBinding {
    public static final /* synthetic */ int Y = 0;
    public final ImageView S;
    public final MaterialButton T;
    public final CountryCodePicker U;
    public final EditText V;
    public final TextView W;
    public ForgotPasswordViewModel X;

    public x(View view, EditText editText, ImageView imageView, TextView textView, MaterialButton materialButton, CountryCodePicker countryCodePicker, Object obj) {
        super(1, view, obj);
        this.S = imageView;
        this.T = materialButton;
        this.U = countryCodePicker;
        this.V = editText;
        this.W = textView;
    }

    public abstract void w(ForgotPasswordViewModel forgotPasswordViewModel);
}
