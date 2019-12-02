package com.sampleservice.meituanservice.controller;

import com.septemberhx.common.base.MResponse;
import com.septemberhx.mclient.annotation.MApiFunction;
import com.septemberhx.mclient.annotation.MRestApiType;
import com.septemberhx.mclient.base.MObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/11/25
 */
@RestController
public class MainController extends MObject {
    @ResponseBody
    @RequestMapping(value = "/hotel", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse hotelFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/hotel");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/canteen", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse canteenFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/canteen");
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/carryout", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse carryoutFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/carryout");
        return result;
    }
}
