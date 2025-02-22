package com.quickkonnect.silencio.models.request;

import rb.b;

public final class DashboardRequestModel {
    public static final int $stable = 0;

    /* renamed from: id  reason: collision with root package name */
    private final int f6672id;

    public DashboardRequestModel(int i8) {
        this.f6672id = i8;
    }

    public static /* synthetic */ DashboardRequestModel copy$default(DashboardRequestModel dashboardRequestModel, int i8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = dashboardRequestModel.f6672id;
        }
        return dashboardRequestModel.copy(i8);
    }

    public final int component1() {
        return this.f6672id;
    }

    public final DashboardRequestModel copy(int i8) {
        return new DashboardRequestModel(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DashboardRequestModel) && this.f6672id == ((DashboardRequestModel) obj).f6672id;
    }

    public final int getId() {
        return this.f6672id;
    }

    public int hashCode() {
        return Integer.hashCode(this.f6672id);
    }

    public String toString() {
        return b.a(new StringBuilder("DashboardRequestModel(id="), this.f6672id, ')');
    }
}
