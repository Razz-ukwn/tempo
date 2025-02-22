package u6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import b7.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.quickkonnect.silencio.R;
import java.util.Locale;
import o.f;
import t6.h;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final f f15875a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f15876b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = c.a(context).f3272a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i8) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i8 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{a10});
        } else if (i8 != 2) {
            if (i8 == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{a10});
            } else if (i8 == 5) {
                return d(context, "common_google_play_services_invalid_account_text", a10);
            } else {
                if (i8 == 7) {
                    return d(context, "common_google_play_services_network_error_text", a10);
                }
                if (i8 == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{a10});
                } else if (i8 == 20) {
                    return d(context, "common_google_play_services_restricted_profile_text", a10);
                } else {
                    switch (i8) {
                        case 16:
                            return d(context, "common_google_play_services_api_unavailable_text", a10);
                        case 17:
                            return d(context, "common_google_play_services_sign_in_failed_text", a10);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{a10});
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{a10});
                    }
                }
            }
        } else if (z6.c.a(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{a10});
        }
    }

    public static String c(Context context, int i8) {
        Resources resources = context.getResources();
        switch (i8) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case ModuleDescriptor.MODULE_VERSION:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i8);
                return null;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e10, new Object[]{str2});
    }

    public static String e(Context context, String str) {
        Resources resources;
        f fVar = f15875a;
        synchronized (fVar) {
            Locale locale = y1.f.a(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(f15876b)) {
                fVar.clear();
                f15876b = locale;
            }
            String str2 = (String) fVar.getOrDefault(str, null);
            if (str2 != null) {
                return str2;
            }
            int i8 = h.f15401e;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                return null;
            }
            f15875a.put(str, string);
            return string;
        }
    }
}
