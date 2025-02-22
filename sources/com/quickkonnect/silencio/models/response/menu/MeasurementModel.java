package com.quickkonnect.silencio.models.response.menu;

import bb.b;
import sf.e;
import sf.j;

public final class MeasurementModel {
    public static final int $stable = 0;
    @b("avgMin")
    private final Double avgMin;
    @b("Hours")
    private final Double hours;
    @b("TotalCount")
    private final Double totalCount;

    public MeasurementModel() {
        this((Double) null, (Double) null, (Double) null, 7, (e) null);
    }

    public MeasurementModel(Double d10, Double d11, Double d12) {
        this.avgMin = d10;
        this.hours = d11;
        this.totalCount = d12;
    }

    public static /* synthetic */ MeasurementModel copy$default(MeasurementModel measurementModel, Double d10, Double d11, Double d12, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            d10 = measurementModel.avgMin;
        }
        if ((i8 & 2) != 0) {
            d11 = measurementModel.hours;
        }
        if ((i8 & 4) != 0) {
            d12 = measurementModel.totalCount;
        }
        return measurementModel.copy(d10, d11, d12);
    }

    public final Double component1() {
        return this.avgMin;
    }

    public final Double component2() {
        return this.hours;
    }

    public final Double component3() {
        return this.totalCount;
    }

    public final MeasurementModel copy(Double d10, Double d11, Double d12) {
        return new MeasurementModel(d10, d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeasurementModel)) {
            return false;
        }
        MeasurementModel measurementModel = (MeasurementModel) obj;
        return j.a(this.avgMin, measurementModel.avgMin) && j.a(this.hours, measurementModel.hours) && j.a(this.totalCount, measurementModel.totalCount);
    }

    public final Double getAvgMin() {
        return this.avgMin;
    }

    public final Double getHours() {
        return this.hours;
    }

    public final Double getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        Double d10 = this.avgMin;
        int i8 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.hours;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.totalCount;
        if (d12 != null) {
            i8 = d12.hashCode();
        }
        return hashCode2 + i8;
    }

    public String toString() {
        return "MeasurementModel(avgMin=" + this.avgMin + ", hours=" + this.hours + ", totalCount=" + this.totalCount + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeasurementModel(Double d10, Double d11, Double d12, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : d10, (i8 & 2) != 0 ? null : d11, (i8 & 4) != 0 ? null : d12);
    }
}
