package androidx.media;

import androidx.fragment.app.q;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f2335a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2336b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2337c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2338d = -1;

    public final boolean equals(Object obj) {
        int i8;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2336b != audioAttributesImplBase.f2336b) {
            return false;
        }
        int i10 = this.f2337c;
        int i11 = audioAttributesImplBase.f2337c;
        int i12 = audioAttributesImplBase.f2338d;
        if (i12 == -1) {
            int i13 = audioAttributesImplBase.f2335a;
            int i14 = AudioAttributesCompat.f2331b;
            if ((i11 & 1) != 1) {
                i8 = 4;
                if ((i11 & 4) != 4) {
                    switch (i13) {
                        case 2:
                            i8 = 0;
                            break;
                        case 3:
                            i8 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i8 = 5;
                            break;
                        case 6:
                            i8 = 2;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /*11*/:
                            i8 = 10;
                            break;
                        case 13:
                            i8 = 1;
                            break;
                        default:
                            i8 = 3;
                            break;
                    }
                } else {
                    i8 = 6;
                }
            } else {
                i8 = 7;
            }
        } else {
            i8 = i12;
        }
        if (i8 == 6) {
            i11 |= 4;
        } else if (i8 == 7) {
            i11 |= 1;
        }
        return i10 == (i11 & 273) && this.f2335a == audioAttributesImplBase.f2335a && this.f2338d == i12;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2336b), Integer.valueOf(this.f2337c), Integer.valueOf(this.f2335a), Integer.valueOf(this.f2338d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2338d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2338d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i8 = this.f2335a;
        int i10 = AudioAttributesCompat.f2331b;
        switch (i8) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = q.a("unknown usage ", i8);
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f2336b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2337c).toUpperCase());
        return sb2.toString();
    }
}
