package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.hbb20.CountryCodePicker;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberViewModel;

public abstract class j0 extends ViewDataBinding {
    public static final /* synthetic */ int Y = 0;
    public final TextView S;
    public final ImageView T;
    public final MaterialButton U;
    public final CountryCodePicker V;
    public final EditText W;
    public PhoneNumberViewModel X;

    public j0(View view, EditText editText, ImageView imageView, TextView textView, MaterialButton materialButton, CountryCodePicker countryCodePicker, Object obj) {
        super(1, view, obj);
        this.S = textView;
        this.T = imageView;
        this.U = materialButton;
        this.V = countryCodePicker;
        this.W = editText;
    }

    public abstract void w(PhoneNumberViewModel phoneNumberViewModel);
}
