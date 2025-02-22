package nc;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel;

public abstract class t extends ViewDataBinding {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f11837b0 = 0;
    public final TextView S;
    public final ImageView T;
    public final MaterialButton U;
    public final EditText V;
    public final EditText W;
    public final EditText X;
    public final RadioButton Y;
    public final TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public CreateAccountViewModel f11838a0;

    public t(Object obj, View view, TextView textView, ImageView imageView, MaterialButton materialButton, EditText editText, EditText editText2, EditText editText3, RadioButton radioButton, TextView textView2) {
        super(4, view, obj);
        this.S = textView;
        this.T = imageView;
        this.U = materialButton;
        this.V = editText;
        this.W = editText2;
        this.X = editText3;
        this.Y = radioButton;
        this.Z = textView2;
    }

    public abstract void w(CreateAccountViewModel createAccountViewModel);
}
