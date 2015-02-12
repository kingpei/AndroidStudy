package com.kingpei.as.touchevent.view;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class GeoFencePoint implements Parcelable {
	public static final Creator<GeoFencePoint> CREATOR = new Creator<GeoFencePoint>() {
		public GeoFencePoint createFromParcel(Parcel parcel) {
			return new GeoFencePoint(parcel.readString(),
					parcel.readDouble(),
					parcel.readDouble(),
					parcel.readFloat(),
					parcel.readFloat(),
					parcel.readString(),
					parcel.readInt(),
					parcel.readInt(),
					parcel.readFloat(),
					parcel.readFloat());
		}

		public GeoFencePoint[] newArray(int size) {
			return new GeoFencePoint[size];
		}
	};
	public static final int MOVE_TRIGGER = 2;
	public static final int STILL_TRIGGER = 1;
	
	public static final int DIRECTORY_LEFT = 1;
	public static final int DIRECTORY_RIGHT = 2;
    public static final int DIRECTORY_FRONT = 3;

	private String address;
	private float coordinateBearing;
	private int geoFenceType;
	private int groupId;
	private double latitude;
	private float limitSpeed;
	private double longitude;
	private String name;
	private float triggerDistance;
	private float userBearing;
	
	private ArrayList<String> addMark;
	private int directory;
    private String fromTo;

    public String getFromTo() {
        return fromTo;
    }

    public void setFromTo(String fromTo) {
        this.fromTo = fromTo;
    }

    public ArrayList<String> getAddMark() {
		return addMark;
	}

	public void setAddMark(ArrayList<String>  addMark) {
		this.addMark = addMark;
	}

	public int getDirectory() {
		return directory;
	}

	public void setDirectory(int directory) {
		this.directory = directory;
	}

	public GeoFencePoint() {
	}

	public GeoFencePoint(String name, double latitude,
                         double longitude, float userBearing, float coordinateBearing,
                         String address, int geoFenceType, int groupId,
                         float limitSpeed, float triggerDistance) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.userBearing = userBearing;
		this.address = address;
		this.geoFenceType = geoFenceType;
		this.groupId = groupId;
		this.limitSpeed = limitSpeed;
		this.triggerDistance = triggerDistance;
		this.coordinateBearing = coordinateBearing;
	}
	
	public GeoFencePoint(String name, double latitude,
                         double longitude, float userBearing, float coordinateBearing,
                         String address, int geoFenceType, int groupId,
                         float limitSpeed, float triggerDistance, ArrayList<String> addMark, int directory) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.userBearing = userBearing;
		this.address = address;
		this.geoFenceType = geoFenceType;
		this.groupId = groupId;
		this.limitSpeed = limitSpeed;
		this.triggerDistance = triggerDistance;
		this.coordinateBearing = coordinateBearing;
		this.addMark = addMark;
		this.directory = directory;
	}

    public GeoFencePoint(String name, double latitude,
                         double longitude, float userBearing, float coordinateBearing,
                         String address, int geoFenceType, int groupId,
                         float limitSpeed, float triggerDistance, ArrayList<String> addMark, int directory, String fromTo) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.userBearing = userBearing;
        this.address = address;
        this.geoFenceType = geoFenceType;
        this.groupId = groupId;
        this.limitSpeed = limitSpeed;
        this.triggerDistance = triggerDistance;
        this.coordinateBearing = coordinateBearing;
        this.addMark = addMark;
        this.directory = directory;
        this.fromTo = fromTo;
    }

	public int describeContents() {
		return 0;
	}

	public String getAddress() {
		return this.address;
	}

	public float getCoordinateBearing() {
		return this.coordinateBearing;
	}

	public int getGeoFenceType() {
		return this.geoFenceType;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public float getLimitSpeed() {
		return this.limitSpeed;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public String getName() {
		return this.name;
	}

	public float getTriggerDistance() {
		return this.triggerDistance;
	}

	public float getUserBearing() {
		return this.userBearing;
	}

	public void setAddress(String paramString) {
		this.address = paramString;
	}

	public void setCoordinateBearing(float paramFloat) {
		this.coordinateBearing = paramFloat;
	}

	public void setGeoFenceType(int paramInt) {
		this.geoFenceType = paramInt;
	}

	public void setGroupId(int paramInt) {
		this.groupId = paramInt;
	}

	public void setLatitude(double paramDouble) {
		this.latitude = paramDouble;
	}

	public void setLimitSpeed(float paramFloat) {
		this.limitSpeed = paramFloat;
	}

	public void setLongitude(double paramDouble) {
		this.longitude = paramDouble;
	}

	public void setName(String paramString) {
		this.name = paramString;
	}

	public void setTriggerDistance(float paramFloat) {
		this.triggerDistance = paramFloat;
	}

	public void setUserBearing(float paramFloat) {
		this.userBearing = paramFloat;
	}

	public void writeToParcel(Parcel paramParcel, int paramInt) {
		paramParcel.writeString(this.name);
		paramParcel.writeDouble(this.latitude);
		paramParcel.writeDouble(this.longitude);
		paramParcel.writeFloat(this.userBearing);
		paramParcel.writeFloat(this.coordinateBearing);
		paramParcel.writeString(this.address);
		paramParcel.writeInt(this.geoFenceType);
		paramParcel.writeInt(this.groupId);
		paramParcel.writeFloat(this.limitSpeed);
		paramParcel.writeFloat(this.triggerDistance);
	}
}