package com.promineotech.jeep.controller.support;

public class CreateOrderTestSupport extends BaseTest{
  
  /**
   * 
   * @return
   */
  protected String createOrderBody() {
    // @formatter:off
    return "{\n"
        + " \"customer\":\"IGNATOV_GISELLA\", \n"
        + " \"model\":\"CHEROKEE\", \n"
        + " \"trim\":\"Trailhawk\", \n"
        + " \"doors\":\"4\", \n"
        + " \"color\":\"EXT_VELVET_RED\",\n"
        + " \"engine\":\"3_6_HYBRID\", \n"
        + " \"tire\":\"265_BRIDGESTONE\", \n"
        + " \"options\":[\n"
        + "     \"DOOR_WARRIOR_MIRROR\",\n"
        + "     \"EXT_DUAL_UPPER_PREMIUM\", \n"
        + "     \"INT_MOPAR_GRAB\", \n"
        + "     \"INT_MOPAR_COLR\", \n"
        + "     \"TOP_MOPAR_SKY\", \n"
        + "     \"WHEEL_TACTIK_MATTE\", \n"
        + "     \"EXT_MOPAR_CAMERA\" \n"
        + " ]\n"
        + "}";
    //formatter:on
  }

}
