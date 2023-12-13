package automation.api;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class Morroco {

	@BeforeSuite
	public void setUp() {

	}
	
	@Test
	public void getRequest() {
		//RestAssured.baseURI = "";
		RestAssured.given()
		//.header("Postman-Token", "<calculated when request is sent>")
		//.header("Host", "<calculated when request is sent>")
		//.header("User-Agent", "PostmanRuntime/7.36.0")
		//.header("Accept", "*/*")
		//.header("Accept-Encoding", "gzip, deflate, br")
		.header("Connection", "keep-alive")
		.header("X-AUTH-DEVICE-ID", "android_5012a17ff9a50815")
		.header("Content-Type", "application/json")
		.header("Authorization", "Basic c2ljcGFjb25uZWN0OlMxY3A0QzBubjNjdA==")
		.header("APP-VERSION", "1.4.2")
		.header("LocaleId", "fr-PT")
		.header("x-api-key", "1f86c0c37dfd18792677a158ed9af9f6")
		.when().get("https://bc-sc-sqa-tt016.ocs-support.com/api/v1/reporting/schema/sconnect.v4.webreport/EN").then().log()
		  .all();
	}
	
	@Test
	public void getFinalScore(){
		String requestBody= "{\r\n"
				+ "  \"b64Fingerprint\": \"AAAAAgAAABUAAAAVAgcDAAECAGkAZXF3AGYAAAAAAAABA3FmYWV0AGpwAAR1AHYAbYCBf4I7CYcDCRB8CI8aiIs0LJM2iDYVDJMTCYoQERaFBokQJCF5Eo8Bkw4mE3wIB4AHCQWNCZEAf4ILhYcEhwMIAmkAFXh5fIyACYOAAAmBfoEBYmJmXFsACAwDAAgFBIoAeABdAHoAAAAAAAAAa2ZvdIF0eHRxAAACAHBwaWdnY21eAAUDAHBsAHEAZG0AbABycAAAAHUAZ29xegEDZGtuAG8AcAMCAAJkaHkAcwAAaQAIAAAAAgB5agAAAgAKAId5eHN0AgIAd3NsAW57bHQAc4QAeWZoewBzA3JxAH4EcXx5AABwcnWBcmhteHV1enB4dG8BAQBobHsCAABxcwFoBAEDAQEAAm5tbnYAAHYEfAIBcQAAAXV9fnl2A2VuAHgAdHkAgAABAXd6AHYABQJwAHB0AAJ3AHpgd28AcgB9An4DCQNrAHYAcngAaQEAAAECbAByAoIBBAJrAXMAentyBAFldAB4dYCAAHN4dnJuAXYAAABya24BAXsAfIF1AQMGAwIAAHABdwB1amsBAHwAAABl\",\r\n"
				+ "  \"b64Image\": \"\",\r\n"
				+ "  \"b64PrintingMatrix\": \"AAAAFQAAABUBfAPqr5FXRIrKJFjRPsb4BVAf+/9FU4VUU2o22ax5cM9V/4vMhiKPs3RFGJoqYRFXvPvyYBPfgA\\u003d\\u003d\",\r\n"
				+ "  \"barcode\": \"\",\r\n"
				+ "  \"barcodeStatus\": \"NO_BARCODE\",\r\n"
				+ "  \"code\": \"HTTPS://IC.CR/DPBE1E0F5JF\",\r\n"
				+ "  \"codeSet\": \"MOROCCO\",\r\n"
				+ "  \"colorShift\": [\r\n"
				+ "    \"true\"\r\n"
				+ "  ],\r\n"
				+ "  \"diyStatus\": \"NOT_CHECKED\",\r\n"
				+ "  \"hrc\": \"0DPBE1E0F5JF\",\r\n"
				+ "  \"imageData\": \"\",\r\n"
				+ "  \"imageFileNameSuffixWithExtension\": \"\",\r\n"
				+ "  \"isAntiDiyCapable\": true,\r\n"
				+ "  \"isGtin\": false,\r\n"
				+ "  \"isManualCode\": \"false\",\r\n"
				+ "  \"localeId\": \"en-US\",\r\n"
				+ "  \"location\": \"40.19800485;-8.51297604\",\r\n"
				+ "  \"locationDetails\": {\r\n"
				+ "    \"city\": \"Anadia\",\r\n"
				+ "    \"country\": \"Portugal\",\r\n"
				+ "    \"postalCode\": \"3780-202\",\r\n"
				+ "    \"state\": \"Aveiro\",\r\n"
				+ "    \"street\": \"Avenida Engenheiro Tavares da Silva\"\r\n"
				+ "  },\r\n"
				+ "  \"metrics\": {\r\n"
				+ "    \"image_decoding_result_code_symbology_name\": \"QR code\",\r\n"
				+ "    \"scanning_device_serial\": \"unknown\",\r\n"
				+ "    \"image_check_reflectionsChecker_config_bigThreshold\": \"65535\",\r\n"
				+ "    \"image_check_perspectiveDeformation_result_deformation\": \"13.362646\",\r\n"
				+ "    \"scanning_sdk_build\": \"20221221104550\",\r\n"
				+ "    \"image_check_reflectionsChecker_result_valuesAboveMax\": \"0.0\",\r\n"
				+ "    \"scanning_device_model\": \"SM-G781B\",\r\n"
				+ "    \"image_fingerprinting_config_channel\": \"BlueGrayscaler\",\r\n"
				+ "    \"image_check_exposure_config_allowedAboveMax\": \"0.001\",\r\n"
				+ "    \"image_processing_sdk_version\": \"2.16.2\",\r\n"
				+ "    \"image_check_exposure_config_minDelta\": \"100\",\r\n"
				+ "    \"image_check_exposure_valuesBelowMin\": \"25906\",\r\n"
				+ "    \"image_fingerprinting_config_radiusFactor\": \"0.25\",\r\n"
				+ "    \"image_check_reflectionsChecker_config_allowedAboveMax\": \"1.0\",\r\n"
				+ "    \"image_check_exposure_duration\": \"6\",\r\n"
				+ "    \"image_check_sharpness_dirac_config_peakMinSize\": \"1\",\r\n"
				+ "    \"image_decoding_result_code_text_as_decoded\": \"HTTPS://IC.CR/DPBE1E0F5JF\",\r\n"
				+ "    \"image_anticopy_result_status\": \"NOT_CHECKED\",\r\n"
				+ "    \"scanning_device_design_name\": \"r8q\",\r\n"
				+ "    \"image_decoding_result_code_text\": \"HTTPS://IC.CR/DPBE1E0F5JF\",\r\n"
				+ "    \"image_decoding_channel\": \"YGrayscaler\",\r\n"
				+ "    \"scanning_device_os_version\": \"13\",\r\n"
				+ "    \"image_fingerprinting_duration\": \"12\",\r\n"
				+ "    \"scanning_duration\": \"2621\",\r\n"
				+ "    \"image_check_exposure_valueDynamic\": \"197\",\r\n"
				+ "    \"stamp_searching_duration\": \"1\",\r\n"
				+ "    \"scanning_sdk_smic_forcedCapability_fp\": \"false\",\r\n"
				+ "    \"image_processing_duration\": \"2007\",\r\n"
				+ "    \"image_validating_config_channel\": \"YGrayscaler\",\r\n"
				+ "    \"image_check_sharpness_dirac_duration\": \"9\",\r\n"
				+ "    \"scanning_ux_duration\": \"0\",\r\n"
				+ "    \"scanning_sdk_config_source\": \"Remote int(yfjdbffln1)::config/ns-projects/MOROCCO/morocco.yml\",\r\n"
				+ "    \"image_fingerprinting_config_subSamplingFactor\": \"0.25\",\r\n"
				+ "    \"scanning_whiteBalance\": \"AUTO(1)\",\r\n"
				+ "    \"image_check_sharpness_dirac_result_focus\": \"5.695719\",\r\n"
				+ "    \"image_gridding_liquid_duration\": \"1926\",\r\n"
				+ "    \"image_check_reflectionsChecker_config_maxThreshold\": \"65535\",\r\n"
				+ "    \"scanning_sdk_version\": \"4.3.5\",\r\n"
				+ "    \"scanning_sdk_git_revision\": \"49c26bb\",\r\n"
				+ "    \"image_decoding_decoder\": \"DeltaQrMonochromeDecoder\",\r\n"
				+ "    \"image_check_exposure_config_allowedBelowMin\": \"0.3\",\r\n"
				+ "    \"image_check_sharpness_dirac_config_peakMaxSize\": \"3\",\r\n"
				+ "    \"image_check_modulesize_config_minModuleSize\": \"12\",\r\n"
				+ "    \"image_decoding_result_code_symbology_version\": \"1 L 3 : 21x21\",\r\n"
				+ "    \"image_check_modulesize_duration\": \"0\",\r\n"
				+ "    \"image_processing_sdk_git_branch\": \"d23ad8c52f398cb0a412abc14ea3302f2a1a61c6\",\r\n"
				+ "    \"image_check_sharpness_dirac_config_minFocus\": \"0.5\",\r\n"
				+ "    \"image_check_exposure_valuesAboveMax\": \"0\",\r\n"
				+ "    \"image_check_mandatoryFeatures_duration\": \"0\",\r\n"
				+ "    \"scanning_torchOn\": \"false\",\r\n"
				+ "    \"image_check_reflectionsChecker_duration\": \"14\",\r\n"
				+ "    \"stamp_name\": \"TOBACCO DRY STACK DOM D\",\r\n"
				+ "    \"image_check_modulesize_result_moduleSize\": \"15.925102\",\r\n"
				+ "    \"image_check_sharpness_dirac_config_noiseThreshold\": \"30\",\r\n"
				+ "    \"scanning_sdk_camera_raw_image\": \"false\",\r\n"
				+ "    \"scanning_sdk_config_version\": \"2.0.0 RC1\",\r\n"
				+ "    \"image_check_exposure_config_minThreshold\": \"16\",\r\n"
				+ "    \"image_decoding_duration\": \"27\",\r\n"
				+ "    \"image_processing_sdk_git_revision\": \"d23ad8c52f398cb0a412abc14ea3302f2a1a61c6\",\r\n"
				+ "    \"image_check_exposure_config_maxThreshold\": \"254\",\r\n"
				+ "    \"image_check_perspectiveDeformation_duration\": \"0\",\r\n"
				+ "    \"scanning_sdk_smic_forcedCapability_diyCheck\": \"false\",\r\n"
				+ "    \"app_name\": \"ma.gov.douane.samidconnect.sqa/SQA BAYYAN LIY@\",\r\n"
				+ "    \"scanning_sdk_config_filename\": \"config/ns-projects/MOROCCO/morocco.yml\",\r\n"
				+ "    \"scanning_sdk_camera_raw_capable\": \"true\",\r\n"
				+ "    \"image_decoding_quark_substrate_hint\": \"QUARK_ON_SMALL_CAP\",\r\n"
				+ "    \"scanning_device_os_name\": \"android\",\r\n"
				+ "    \"scanning_sdk_android_camera_api_version\": \"2\",\r\n"
				+ "    \"image_check_perspectiveDeformation_config_maxDeformation\": \"150.0\",\r\n"
				+ "    \"scanning_sdk_git_branch\": \"hotfix/security-vulnerability-fixes-v3\"\r\n"
				+ "  },\r\n"
				+ "  \"projectName\": \"MOROCCO\",\r\n"
				+ "  \"referenceTimeInMs\": \"\",\r\n"
				+ "  \"scannerType\": \"QR\",\r\n"
				+ "  \"sclMarker\": \"SCL_SKIPPED\",\r\n"
				+ "  \"supportedPhone\": 1\r\n"
				+ "}";
		RestAssured.baseURI="https://bc-sc-sqa-tt016.ocs-support.com/api/v1";
		RestAssured.given()
		.header("Content-Type", "application/json")
		.header("X-AUTH-DEVICE-ID", "PCroSm5Vhb0u0t02LCGCc3Iok4cp")
		.header("X-AUTH-OTP", "QoGCGKxsVWLxtsZ+cJgPioGtYfodVRKPl8kxx55xxCXMDW4W8ftCIEfrRUiy0HrHKNqp8BIf4L3vjlKvKBztvpm8lrIrT0zbud8E71FDyZI=,X-BlueCoat-Via=ccfe07c2148a837c")
		.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.111 Safari/537.36")
		.header("IP-ADDRESS", "10.40.38.16")
		.header("APP-VERSION", "2.0.0")
		.header("LocaleId", "en")
		.header("x-api-key", "1f86c0c37dfd18792677a158ed9af9f6")
		.body(requestBody)
		.when().post("/product").then().log()
		  .all();
		
	}
	
    @Test
    public void examplePostWithDefinedUrlTest() {
        // Define and initialize the base URL for the API
        String url = "https://api.example.com";
        RestAssured.baseURI = url;

        // JSON payload for the POST request
        String requestBody = "{ \"key1\": \"value1\", \"key2\": \"value2\" }";

        // Perform the POST request with the request body
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
            .when()
                .post("/endpoint")
            .then()
                .statusCode(201) // Expected HTTP status code
                .contentType(ContentType.JSON); // Expected content type
    }
}
