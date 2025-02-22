package qe;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

public final class f implements Externalizable {
    public boolean B = false;
    public boolean C;
    public String D = "";

    /* renamed from: a  reason: collision with root package name */
    public String f13567a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f13568b = "";

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f13569c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f13570d;

    /* renamed from: e  reason: collision with root package name */
    public String f13571e = "";

    public final void readExternal(ObjectInput objectInput) {
        this.f13567a = objectInput.readUTF();
        this.f13568b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f13569c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f13570d = true;
            this.f13571e = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.C = true;
            this.D = readUTF2;
        }
        this.B = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f13567a);
        objectOutput.writeUTF(this.f13568b);
        ArrayList arrayList = this.f13569c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            objectOutput.writeUTF((String) arrayList.get(i8));
        }
        objectOutput.writeBoolean(this.f13570d);
        if (this.f13570d) {
            objectOutput.writeUTF(this.f13571e);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            objectOutput.writeUTF(this.D);
        }
        objectOutput.writeBoolean(this.B);
    }
}
