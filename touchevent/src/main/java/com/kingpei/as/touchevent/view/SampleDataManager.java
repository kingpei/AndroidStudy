package com.kingpei.as.touchevent.view;

import java.util.ArrayList;

public class SampleDataManager {
    public static ArrayList<GeoFencePoint> getCsGeoFencePoints() {
        ArrayList<GeoFencePoint> geoFencePoints = new ArrayList<GeoFencePoint>();
        geoFencePoints.add(new GeoFencePoint("望城坡街道长华社区西北方向", 28.224959815199998D, 112.907107544D, 270.0F, 90.0F, "", 1, 1, 70.0F, 200.0F, getArrayList("岳麓大道"), GeoFencePoint.DIRECTORY_RIGHT));
        geoFencePoints.add(new GeoFencePoint("永安村东南方向约0.99公里", 28.2253206816D, 112.89535606D, 270.0F, 90.0F, "", 1, 1, 70.0F, 200.0F, getArrayList("岳麓大道"), GeoFencePoint.DIRECTORY_RIGHT));
        geoFencePoints.add(new GeoFencePoint("永安村东南方向", 28.225340681599999D, 112.89255806D, 90.0F, 270.0F, "", 1, 1, 70.0F, 200.0F, getArrayList("岳麓大道"), GeoFencePoint.DIRECTORY_RIGHT));
        geoFencePoints.add(new GeoFencePoint("长华社区西方向约0.97公里", 28.224768815200001D, 112.9057375439D, 90.0F, 270.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("岳麓大道"), GeoFencePoint.DIRECTORY_RIGHT));
        return geoFencePoints;
    }

    public static ArrayList<String> getArrayList(String... strs){
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);
        }

        return list;
    }

//  public static ArrayList<GeoFencePoint> getUserSampleGeoFencePoints()
//  {
//    ArrayList<GeoFencePoint> geoFencePoints = new ArrayList<GeoFencePoint>();
//    geoFencePoints.add(new GeoFencePoint("青山公路大欖涌九龍", 22.3571396500, 114.0241312200, 360.0F, 180.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("青山公路小欖九龍", 22.3635641500, 114.0148795000, 96.0F, 276.0F, "", 1, 1, 50.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("青山公路大欖段屯門", 22.3633811500, 114.0161465000, 289.0F, 109.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("青山公路小欖屯門", 22.3633801500, 114.0162795000, 281.0F, 101.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門青山公路沙倉屯門", 22.3527270900, 114.0319214900, 286.0F, 106.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路虹橋九龍", 22.3980595400, 113.9821466400, 190.0F, 10.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路市中心九龍", 22.3872125500, 113.9829210300, 165.0F, 345.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路掃管笏九龍", 22.3702100700, 114.0030050000, 151.0F, 331.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路小欖轉車站九龍", 22.3604318600, 114.0199588200, 328.0F, 148.0F, "", 2, 2, 70.0F, 400.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路大欖上斜九龍", 22.3543696500, 114.0262712200, 120.0F, 300.0F, "", 2, 2, 70.0F, 400.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路青龍頭九龍", 22.3584569900, 114.0423681600, 49.0F, 229.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路深井落斜九龍", 22.3634180100, 114.0573861200, 59.0F, 239.0F, "", 2, 2, 70.0F, 400.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路汀九九龍", 22.3682011600, 114.0788033300, 29.0F, 209.0F, "", 2, 2, 70.0F, 400.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路油柑頭段九龍", 22.3669803300, 114.0905528600, 106.0F, 286.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路油柑頭落斜荃灣", 22.3704036800, 114.1047064200, 68.0F, 248.0F, "", 2, 2, 70.0F, 400.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路麗城段屯門", 22.3791042100, 114.1754647800, 67.0F, 247.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路汀九屯門 1", 22.3687125600, 114.0817018700, 279.0F, 99.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路汀九屯門 2", 22.3665131600, 114.0778393300, 188.0F, 8.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路深井屯門", 22.3637821600, 114.0709343300, 295.0F, 115.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路浪翠園屯門", 22.3635060100, 114.0579511200, 245.0F, 65.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路大欖屯門", 22.3532030900, 114.0334594900, 262.0F, 82.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路掃管笏屯門", 22.3680300700, 114.0041650000, 328.0F, 148.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路市中心元朗", 22.3879835500, 113.9825700300, 346.0F, 166.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路新墟元朗", 22.3968935400, 113.9817106400, 9.0F, 189.0F, "", 1, 1, 70.0F, 200.0F));
//    geoFencePoints.add(new GeoFencePoint("屯門公路屯門醫院元朗", 22.4030969100, 113.9829965900, 9.0F, 189.0F, "", 1, 1, 70.0F, 200.0F));
//    return geoFencePoints;
//  }

    //2月5日
//  public static ArrayList<GeoFencePoint> getUserSampleGeoFencePoints()
//  {
//    ArrayList<GeoFencePoint> geoFencePoints = new ArrayList<GeoFencePoint>();
//    geoFencePoints.add(new GeoFencePoint("青山公路大欖涌九龍", 22.359659, 114.019132, 360.0F, 180.0F, "", 1, 1, 70.0F, 200.0F, "青山公路大欖段", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("青山公路大欖段屯門", 22.366394, 114.00987, 276.0F, 96f, "", 1, 1, 50.0F, 200.0F, "青山公路大欖段", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("青山公路小欖屯門", 22.366211, 114.011137, 109.0F, 289f, "", 1, 1, 70.0F, 200.0F, "青山公路大欖段", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門青山公路沙倉屯門", 22.35573, 114.02975, 80.0F, 260f, "", 2, 2, 70.0F, 400.0F, "青山公路青龍頭段", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路虹橋九龍", 22.400984, 113.97721, 10.0F, 190f, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路市中心九龍", 22.390134, 113.977983, 345.0F, 165f, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路掃管笏九龍", 22.37307, 113.99802, 331.0F, 151f, "", 1, 1, 80.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路小欖轉車站九龍", 22.361767, 114.016254, 321.0F, 141f, "", 2, 2, 80.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路小欖橋九龍", 22.364456, 114.014148, 328.0F, 148.0F, "", 2, 2, 80.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_FRONT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路大欖上斜九龍", 22.35717, 114.02124, 300.0F, 120f, "", 2, 2, 80.0F, 400.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路青龍頭九龍", 22.36121, 114.0373, 229.0F, 49f, "", 1, 1, 80.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路深井落斜九龍", 22.366189, 114.05243, 239.0F, 59f, "", 2, 2, 80.0F, 400.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路深井交匯處九龍", 22.36931, 114.06135, 236.0F, 56f, "", 2, 2, 80.0F, 400.0F, "屯門公路", GeoFencePoint.DIRECTORY_FRONT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路汀九九龍", 22.370898, 114.073694, 209.0F, 29f, "", 2, 2, 70.0F, 400.0F, "屯門公路", GeoFencePoint.DIRECTORY_FRONT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路油柑頭段九龍", 22.36966, 114.08544, 286.0F, 106f, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路有線電視九龍", 22.374039, 114.102173, 248.0F, 68f, "", 2, 2, 70.0F, 400.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路麗城方向屯門", 22.37311, 114.10009, 68.0F, 248.0F, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路汀九屯門 1", 22.3714, 114.07659, 99.0F, 279f, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路汀九屯門 2", 22.369002, 114.072629, 28.0F, 208f, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路深井屯門", 22.366479, 114.065825, 115.0F, 295f, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路浪翠園屯門", 22.366238, 114.052865, 65.0F, 245f, "", 1, 1, 80.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路沙倉屯門", 22.35598, 114.02841, 82.0F, 262f, "", 1, 1, 80.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路大欖落斜方向屯門", 22.35842, 114.03349, 54.0F, 234f, "", 2, 2, 80.0F, 400.0F, "屯門公路", GeoFencePoint.DIRECTORY_RIGHT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路大欖轉車站屯門", 22.35863, 114.01879, 136.0F, 316f, "", 2, 2, 80.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路小欖橋屯門", 22.364255, 114.014153, 148.0F, 328f, "", 2, 2, 80.0F, 400.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路掃管笏屯門", 22.37089, 113.99918, 148.0F, 328f, "", 1, 1, 80.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路市中心元朗", 22.390905, 113.977632, 166.0F, 346f, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路新墟元朗", 22.399818, 113.976774, 189.0F, 9.0F, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//    geoFencePoints.add(new GeoFencePoint("屯門公路屯門醫院元朗", 22.406022, 113.978059, 189.0F, 9.0F, "", 1, 1, 70.0F, 200.0F, "屯門公路", GeoFencePoint.DIRECTORY_LEFT));
//
//    return geoFencePoints;
//  }

    public static ArrayList<GeoFencePoint> getUserSampleGeoFencePoints() {
        ArrayList<GeoFencePoint> geoFencePoints = new ArrayList<GeoFencePoint>();
        geoFencePoints.add(new GeoFencePoint("屯門青山公路沙倉屯門", 22.35573, 114.02975, 80, 260, "", 2, 1, 70.0F, 200.0F, getArrayList("青山公路青龍頭段"), GeoFencePoint.DIRECTORY_LEFT, "九龍->屯門"));
        geoFencePoints.add(new GeoFencePoint("屯門公路沙倉屯門", 22.35598, 114.02841, 82, 262, "", 1, 1, 80.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "九龍->屯門"));
        geoFencePoints.add(new GeoFencePoint("屯門公路虹橋九龍", 22.400984, 113.97721, 10, 190, "", 1, 1, 70.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "屯門->九龍"));
        geoFencePoints.add(new GeoFencePoint("屯門公路市中心九龍", 22.390134, 113.977983, 345, 165, "", 1, 1, 70.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "屯門->九龍"));
        geoFencePoints.add(new GeoFencePoint("屯門公路市中心元朗", 22.390905, 113.977632, 166, 346, "", 1, 1, 70.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "九龍->屯門"));
        geoFencePoints.add(new GeoFencePoint("屯門公路新墟元朗", 22.399818, 113.976774, 189, 9, "", 1, 1, 70.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "九龍->屯門"));
        geoFencePoints.add(new GeoFencePoint("屯門公路屯門醫院元朗", 22.406022, 113.978059, 189, 9, "", 1, 1, 70.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "九龍->屯門"));
        geoFencePoints.add(new GeoFencePoint("屯門公路小欖轉車站九龍", 22.361767, 114.016254, 321, 141f, "", 2, 2, 80.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "屯門->九龍"));
        geoFencePoints.add(new GeoFencePoint("屯門公路小欖橋九龍", 22.364456, 114.014148, 328, 148.0F, "", 2, 2, 80.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_FRONT, "屯門->九龍"));
        geoFencePoints.add(new GeoFencePoint("屯門公路有線電視九龍", 22.374039, 114.102173, 248, 68, "", 2, 2, 70.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "屯門->九龍"));
        geoFencePoints.add(new GeoFencePoint("屯門公路麗城方向屯門", 22.37311, 114.10009, 68, 248, "", 1, 1, 70.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "九龍->屯門"));
        geoFencePoints.add(new GeoFencePoint("屯門公路大欖轉車站屯門", 22.35863, 114.01879, 136, 316, "", 2, 2, 80.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_LEFT, "九龍->屯門"));
        geoFencePoints.add(new GeoFencePoint("屯門公路小欖橋屯門", 22.364255, 114.014153, 148, 328, "", 2, 2, 80.0F, 200.0F, getArrayList("屯門公路"), GeoFencePoint.DIRECTORY_FRONT, "九龍->屯門"));

        return geoFencePoints;
    }

//    public static Integer getSoundFileResource(String name){
//        String[] names = {"屯門青山公路沙倉屯門","屯門公路沙倉屯門","屯門公路虹橋九龍","屯門公路市中心九龍",
//                "屯門公路市中心元朗","屯門公路新墟元朗","屯門公路屯門醫院元朗","屯門公路小欖轉車站九龍",
//                "屯門公路小欖橋九龍","屯門公路有線電視九龍","屯門公路麗城方向屯門","屯門公路大欖轉車站屯門","屯門公路小欖橋屯門"};
//        int[] resources = {R.raw.voice1,R.raw.voice2, R.raw.voice3, R.raw.voice4, R.raw.voice5, R.raw.voice6, R.raw.voice7, R.raw.voice8, R.raw.voice9, R.raw.voice10, R.raw.voice11, R.raw.voice12, R.raw.voice13};
//
//        HashMap<String, Integer> resourceMap = new HashMap<>();
//        for (int i = 0; i < names.length; i++) {
//            resourceMap.put(names[i], resources[i]);
//        }
//
//        return resourceMap.get(name);
//    }

//    //测试
//    public static Integer getSoundFileResource(String name){
//        String[] names = {"岭兜社区西北方向","万景社区西北方向","莲前街道万景社区","云顶中路1185号-1441号",
//                "云顶中路515号","云顶中路415号","云顶中路636号","莲前西路791号-801号",
//                "莲前西路861号","莲前西路169号","莲前西路194号","莲前西路35号","莲前西路20号"};
//        int[] resources = {R.raw.voice1,R.raw.voice2, R.raw.voice3, R.raw.voice4, R.raw.voice5, R.raw.voice6, R.raw.voice7, R.raw.voice8, R.raw.voice9, R.raw.voice10, R.raw.voice11, R.raw.voice12, R.raw.voice13};
//
//        HashMap<String, Integer> resourceMap = new HashMap<>();
//        for (int i = 0; i < names.length; i++) {
//            resourceMap.put(names[i], resources[i]);
//        }
//
//        return resourceMap.get(name);
//    }

//    public static ArrayList<GeoFencePoint> getUserSampleGeoFencePointsC() {
//        ArrayList<GeoFencePoint> geoFencePoints = getUserSampleGeoFencePoints();
//        for (int i = 0; i < geoFencePoints.size(); i++) {
//            GeoFencePoint geoFencePoint = geoFencePoints.get(i);
//            double[] result = MapFix.getInstance().fix(geoFencePoint.getLongitude(), geoFencePoint.getLatitude());
//            geoFencePoint.setLatitude(result[1]);
//            geoFencePoint.setLongitude(result[0]);
//        }
//
//        return geoFencePoints;
//    }

    ;

    public static ArrayList<GeoFencePoint> getXmGeoFencePoints() {
        ArrayList<GeoFencePoint> geoFencePoints = new ArrayList<GeoFencePoint>();
        geoFencePoints.add(new GeoFencePoint("岭兜社区西北方向", 24.482944477099998D, 118.1784667451D, 280.0F, 80.0F, "", 1, 1, 70.0F, 200.0F, getArrayList("吕岭路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("万景社区西北方向", 24.485729361200001D, 118.1631525478D, 285.0F, 75.0F, "", 1, 1, 70.0F, 200.0F, getArrayList("吕岭路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("莲前街道万景社区", 24.485482361199999D, 118.1643425477D, 85.0F, 285.0F, "", 1, 1, 70.0F, 200.0F, getArrayList("吕岭路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("岭兜社区西北方向", 24.483441477100001D, 118.17666074509999D, 95.0F, 290.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("吕岭路"), GeoFencePoint.DIRECTORY_FRONT));

        geoFencePoints.add(new GeoFencePoint("云顶中路1185号-1441号", 24.4843860000, 118.1525650000, 275.0F, 65.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("云顶中路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("云顶中路515号", 24.4838854506, 118.1527266631, 10.0F, 190.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("云顶中路"), GeoFencePoint.DIRECTORY_FRONT));

        geoFencePoints.add(new GeoFencePoint("云顶中路415号", 24.4775435238, 118.1523511539, 195.0F, 15.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("云顶中路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("云顶中路636号", 24.4785639170, 118.1524852643,  105.0F, 75.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("云顶中路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("莲前西路791号-801号", 24.4770064715, 118.1489876637, 180.0F, 35.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("莲前西路861号", 24.4768648846, 118.1497011313, 105F, 285F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("莲前西路169号", 24.4763866536, 118.1309944304, 250.0F, 80.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("莲前西路194号", 24.4760839489, 118.1337517412, 100.0F, 280.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("莲前西路35号", 24.4766340275, 118.1233528158, 265.0F, 85.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
        geoFencePoints.add(new GeoFencePoint("莲前西路20号", 24.4766307698, 118.1260162504, 65.0F, 245.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("东浦路258号", 24.4755249196, 118.1293260963, 155.0F, 335.0F, "", 1, 1, 50.0F, 400.0F, "东浦路", GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("东浦路256号", 24.4751904774, 118.1294172915, 35.0F, 215.0F, "", 1, 1, 50.0F, 400.0F, "东浦路", GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("东浦路68号", 24.4718819846, 118.1267128248, 265, 85, "", 1, 1, 50.0F, 400.0F, "东浦路", GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("东浦路20号", 24.4717989820, 118.1251571435, 80.0F, 260.0F, "", 1, 1, 50.0F, 400.0F, "东浦路", GeoFencePoint.DIRECTORY_FRONT));
        return geoFencePoints;
    }

//    public static ArrayList<GeoFencePoint> getXmGeoFencePointsC() {
//        ArrayList<GeoFencePoint> geoFencePoints = new ArrayList<GeoFencePoint>();
//        geoFencePoints.add(new GeoFencePoint("岭兜社区西北方向", 24.4856960171, 118.1736444251, 280.0F, 80.0F, "", 1, 1, 70.0F, 200.0F, getArrayList("吕岭路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("万景社区西北方向", 24.4884455012, 118.1582801178, 285.0F, 75.0F, "", 1, 1, 70.0F, 200.0F, getArrayList("吕岭路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("莲前街道万景社区", 24.4881985012, 118.1594701177, 85.0F, 285.0F, "", 1, 1, 70.0F, 200.0F, getArrayList("吕岭路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("岭兜社区西北方向", 24.4861930171, 118.1718384251, 95.0F, 290.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("吕岭路"), GeoFencePoint.DIRECTORY_FRONT));
//
//        geoFencePoints.add(new GeoFencePoint("云顶中路1185号-1441号", 24.4870829500, 118.1476693000, 275.0F, 250.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("云顶中路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("云顶中路515号", 24.4865824006, 118.1478309631, 10.0F, 190.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("云顶中路"), GeoFencePoint.DIRECTORY_FRONT));
//
//        geoFencePoints.add(new GeoFencePoint("云顶中路415号", 24.4802404738, 118.1474554539, 195.0F, 15.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("云顶中路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("云顶中路636号 ", 24.4812608670, 118.1475895643, 105.0F, 75.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("云顶中路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("莲前西路791号-801号", 24.4797034215, 118.1440919637, 180.0F, 35.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("莲前西路861号", 24.4795618346, 118.1448054313,  105F, 285F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("莲前西路169号", 24.4790540736, 118.1260567904, 250.0F, 80.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("莲前西路194号", 24.4787513689, 118.1288141012, 100.0F, 280.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("莲前西路35号", 24.4792933075, 118.1184017658, 265.0F, 85.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
//        geoFencePoints.add(new GeoFencePoint("莲前西路20号", 24.4792981898, 118.1210786104, 65.0F, 245.0F, "", 1, 1, 50.0F, 400.0F, getArrayList("莲前西路"), GeoFencePoint.DIRECTORY_FRONT));
////        geoFencePoints.add(new GeoFencePoint("东浦路258号", 24.4781923396, 118.1243884563, 155.0F, 335.0F, "", 1, 1, 50.0F, 400.0F, "东浦路", GeoFencePoint.DIRECTORY_FRONT));
////        geoFencePoints.add(new GeoFencePoint("东浦路256号", 24.4778578974, 118.1244796515, 35.0F, 215.0F, "", 1, 1, 50.0F, 400.0F, "东浦路", GeoFencePoint.DIRECTORY_FRONT));
////        geoFencePoints.add(new GeoFencePoint("东浦路68号", 24.4745478146, 118.1217759848, 265, 85, "", 1, 1, 50.0F, 400.0F, "东浦路", GeoFencePoint.DIRECTORY_FRONT));
////        geoFencePoints.add(new GeoFencePoint("东浦路20号", 24.4744648120, 118.1202203035, 80.0F, 260.0F, "", 1, 1, 50.0F, 400.0F, "东浦路", GeoFencePoint.DIRECTORY_FRONT));
//        for (int i = 0; i < geoFencePoints.size(); i++) {
//            GeoFencePoint geoFencePoint = geoFencePoints.get(i);
//            double[] result = MapFix.getInstance().fix(geoFencePoint.getLongitude(), geoFencePoint.getLatitude());
//            geoFencePoint.setLatitude(result[1]);
//            geoFencePoint.setLongitude(result[0]);
//        }
//
//        return geoFencePoints;
//    }
}
