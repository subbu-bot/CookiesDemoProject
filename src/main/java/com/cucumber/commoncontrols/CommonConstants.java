package com.cucumber.commoncontrols;




public class CommonConstants {
    static String userName= System.getProperty("user.name");
    static String userDirectory = System.getProperty("user.dir");
    public static String projectRoot =System.getProperty("user.dir");
    public static final String destinationFile = "C:/Users/" + userName + "/Downloads/";
    public static final String jiraLinkPath= "/src/test/resources/features/ZephyrFeatures/test.txt";
    public static final String KML_FILE_PATH = userDirectory+"\\Resource\\KMLFiles";
    public static final String buildingCreationPath = "C:/Users/"+userName+"/Desktop/SymmetricalBuildingCreation.xlsx";
    public static final String accessoriesCreationPath = "C:/Users/"+userName+"/Desktop/CreateAccessories.xlsx";
    public static final String uswWarranty="C:/Users/"+userName+"/Desktop/USWWarrantyTestData.xlsx";
    public static final String uswDealerInvoice="C:/Users/"+userName+"/Desktop/";
    public static final String uswWindowOrDoorPhoto="C:/Users/"+userName+"/Desktop/";
    public static final String MORE_THAN_100_MB_FILE = userDirectory+"\\Resource\\PurchaseOrderFiles\\More_than_100_MB.pdf";
    public static final String RANDOM_FILE_FORMAT = userDirectory+"\\Resource\\PurchaseOrderFiles\\PurchaseOrderFile.docx";
    public static final String RANDOM_PDF_FILE = userDirectory+"\\Resource\\PurchaseOrderFiles\\RandomPDF.pdf";
}
