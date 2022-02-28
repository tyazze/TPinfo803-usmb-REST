package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/travel-duration/{batteryChargeTime}&{autonomy}&{distance}")
public class TravelDurationRessource {
    @GET
    @Produces("text/json")
    public String travelDuration(@PathParam("batteryChargeTime") long batteryChargeTime, @PathParam("autonomy") long autonomy, @PathParam("distance") long distance) {
        long chargeNumber = distance/autonomy;

        long duration = chargeNumber*batteryChargeTime + distance/90;

        return "{" +
                "\"chargeNumber\":" + chargeNumber + "," +
                "\"duration\":" + duration +
                "}";
    }
}