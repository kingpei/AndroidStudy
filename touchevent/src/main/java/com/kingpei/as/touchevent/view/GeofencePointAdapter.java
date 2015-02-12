package com.kingpei.as.touchevent.view;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kingpei.as.touchevent.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * 地理围栏列表适配器
 * */
public class GeofencePointAdapter extends BaseAdapter {

	private SparseBooleanArray mAddedArray = new SparseBooleanArray();

	private ArrayList<GeoFencePoint> mGeoFencePoints;

	private Context mContext;

//    private Consumer.TriggerMessageListener mTriggerMessageListener;

    /** 触发后将相应的条目变成蓝色 */
    private SparseBooleanArray mTriggeredArray = new SparseBooleanArray();

    private HashMap<GeoFencePoint, Float> mUserBearings = new HashMap<GeoFencePoint, Float>();
    private HashMap<GeoFencePoint, Float> mCoordinateBearings = new HashMap<GeoFencePoint, Float>();
    private HashMap<GeoFencePoint, Float> mDistances = new HashMap<GeoFencePoint, Float>();
    private HashMap<GeoFencePoint, String> mAddMarks = new HashMap<GeoFencePoint, String>();

	// private OnButtonClickListener mOnButtonClickListener;
	//
	// public void setOnButtonClickListener(
	// OnButtonClickListener onButtonClickListener) {
	// mOnButtonClickListener = onButtonClickListener;
	// }

	public GeofencePointAdapter(Context context) {
		mContext = context;
	}

	@Override
	public int getCount() {
		return mGeoFencePoints == null ? 0 : mGeoFencePoints.size();
	}

	public boolean isGeoFenceAdded(int position) {
		return mAddedArray.get(position);
	}

    /** 触发成功一次，设置一次 **/
    public void setItemTriggered(GeoFencePoint geoFencePoint, boolean isTriggered){
        int index = mGeoFencePoints.indexOf(geoFencePoint);
        if(index != -1){
            mTriggeredArray.put(index, isTriggered);
            notifyDataSetChanged();
        }
    }

    public void onTriggerMessageShow(GeoFencePoint geoFencePoint,
                                     float userBearing, float coordinateBearing, float distance) {

        if (geoFencePoint != null) {
            mUserBearings.put(geoFencePoint, userBearing);
            mCoordinateBearings.put(geoFencePoint, coordinateBearing);
            mDistances.put(geoFencePoint, distance);
        }
    }

    public void onTriggerMessageShow(GeoFencePoint geoFencePoint, String addMark){
        if (geoFencePoint != null) {
           mAddMarks.put(geoFencePoint, addMark);
        }
    }

    public boolean isTriggered(GeoFencePoint geoFencePoint){
        boolean isTriggered = false;

        int index = mGeoFencePoints.indexOf(geoFencePoint);
        if(index != -1){
            isTriggered = mTriggeredArray.get(index);
        }

        return  isTriggered;
    }

    public void clearAll(){
        mAddedArray.clear();

        mUserBearings.clear();
        mCoordinateBearings.clear();
        mDistances.clear();
        mAddMarks.clear();

        //清除所有监控点时调用
        mTriggeredArray.clear();
        notifyDataSetChanged();
    }

	public void setGeoFencePoints(ArrayList<GeoFencePoint> geoFencePoints) {
		mGeoFencePoints = geoFencePoints;
        clearAll();
	}

	public void setItemAdded(int position, boolean isAdded) {
		mAddedArray.put(position, isAdded);
	}
	

	@Override
	public Object getItem(int position) {
		if ((mGeoFencePoints != null)
				&& (mGeoFencePoints.get(position) != null)) {
			return mGeoFencePoints.get(position);
		}

		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.item_geofence_point_operation, null);
		}

		final GeoFencePoint geoFencePoint = mGeoFencePoints.get(position);

        //监控点方向比对
        Float currentCoordinateBearing = mCoordinateBearings.get(geoFencePoint);
        if(currentCoordinateBearing == null){
            currentCoordinateBearing = new Float(0);
        }

        TextView coordinateBearingTv = ViewHolder.get(convertView,
                R.id.item_geofence_point_operation_coordinatebearing_tv);
        coordinateBearingTv.setText("" + currentCoordinateBearing);

        //行车方向比对
        Float currentUserBearing = mUserBearings.get(geoFencePoint);
        if(currentUserBearing == null){
            currentUserBearing = new Float(0);
        }

		TextView userBeaingTv = ViewHolder.get(convertView,
				R.id.item_geofence_point_operation_userbearing_tv);
		userBeaingTv.setText("" + currentUserBearing);

        //距离比对
        Float currentDistance = mDistances.get(geoFencePoint);
        if(currentDistance == null){
            currentDistance = new Float(0);
        }

        TextView distanceTv = ViewHolder.get(convertView,
                R.id.item_geofence_point_operation_distance_tv);
        distanceTv.setText("" + currentDistance);

        //道路名称比对
        ArrayList<String> addMarks = geoFencePoint.getAddMark();

        String addMark = "";

        if(addMarks != null){
            for (int i = 0; i < addMarks.size(); i++) {
                String str = addMarks.get(i);
                if(str != null && !str.isEmpty()){
                    addMark += str;

                    if(i != addMarks.size() -1) {
                        addMark += " ";
                    }
                }
            }
        }

        String currentAddMark = mAddMarks.get(geoFencePoint);
        if(currentAddMark == null){
            currentAddMark = "";
        }

        TextView geoFenceAddMarkTv = ViewHolder.get(convertView,
                R.id.item_geofence_point_operation_addmark_tv);
        geoFenceAddMarkTv.setText("" + currentAddMark);


        //名称
        TextView geoFenceNameTv = ViewHolder.get(convertView,
                R.id.item_geofence_point_operation_name_tv);
        geoFenceNameTv.setText(geoFencePoint.getName());

        //显示监控点是否被添加
        ImageView isAddedIv = ViewHolder.get(convertView,
                R.id.item_geofence_point_operation_isadded_iv);

//        if (isGeoFenceAdded(position)) {
//            isAddedIv.setImageDrawable(mContext.getResources()
//                    .getDrawable(R.drawable.tick));
//        } else {
//            isAddedIv.setImageDrawable(null);
//        }

        //道路方向
        TextView fromToTv = ViewHolder.get(convertView, R.id.item_geofence_point_operation_fromto_tv);
        fromToTv.setText(geoFencePoint.getFromTo());

        //显示监控点是否被触发了
        LinearLayout mainLl = ViewHolder.get(convertView, R.id.item_geofence_point_operation_main_ll);
//        //已经触发的设置为蓝色
//        if(mTriggeredArray.get(position)){
//            mainLl.setBackgroundColor(mContext.getResources().getColor(R.color.triggered_color));
//        }else{
//            mainLl.setBackgroundResource(android.R.drawable.list_selector_background);
//        }
		
		// //添加地理围栏到地图
		// Button geoFenceAddBtn = ViewHolder.get(convertView,
		// R.id.item_geofence_point_operation_add_btn);
		// geoFenceAddBtn.setOnClickListener(new OnClickListener() {
		// @Override
		// public void onClick(View v) {
		// if(mOnButtonClickListener != null){
		// mOnButtonClickListener.onAdd(geoFencePoint);
		// }
		// }
		// });
		//
		// //删除地图上的该地理围栏
		// Button geoFenceDeleteBtn = ViewHolder.get(convertView,
		// R.id.item_geofence_point_operation_delete_btn);
		// geoFenceDeleteBtn.setOnClickListener(new OnClickListener() {
		// @Override
		// public void onClick(View v) {
		// if(mOnButtonClickListener != null){
		// mOnButtonClickListener.onDelete(geoFencePoint);
		// }
		// }
		// });

		return convertView;
	}

	// public interface OnButtonClickListener{
	// public void onAdd(GeoFencePoint geoFencePoint);
	// public void onDelete(GeoFencePoint geoFencePoint);
	// }

}