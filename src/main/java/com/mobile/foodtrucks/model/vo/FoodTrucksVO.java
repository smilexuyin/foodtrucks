package com.mobile.foodtrucks.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: yinxu
 * @date 2024/04/23
 * @desc Food trucks data object
 */
@Data
@Schema(title = "FoodTrucksVO", description = "Food trucks info")
public class FoodTrucksVO {

    @Schema(name = "applicant", description = "applicant",  example = "Datam SF LLC dba Anzu To You")
    private String applicant;

    @Schema(name = "locationDescription", description = "locationDescription",  example = "TAYLOR ST: BAY ST to NORTH POINT ST (2500 - 2599)")
    private String locationDescription;

    @Schema(name = "foodItems", description = "foodItems",  example = "Asian Fusion - Japanese Sandwiches/Sliders/Misubi")
    private String foodItems;

    @Schema(name = "address", description = "address",  example = "2535 TAYLOR ST")
    private String address;

    @Schema(name = "facilityType", description = "locationid",  example = "Truck")
    private String facilityType;

    @Schema(name = "permit", description = "permit",  example = "21MFF-00106")
    private String permit;

    @Schema(name = "status", description = "status",  example = "APPROVED")
    private String status;

    @Schema(name = "schedule", description = "schedule",  example = "http://bsm.sfdpw.org/PermitsTracker/reports/report.aspx?title=schedule&report=rptSchedule&params=permit=21MFF-00106&ExportPDF=1&Filename=21MFF-00106_schedule.pdf")
    private String schedule;
}
