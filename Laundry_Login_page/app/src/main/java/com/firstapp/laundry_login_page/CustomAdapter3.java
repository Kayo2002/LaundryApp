package com.firstapp.laundry_login_page;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter3 extends ArrayAdapter<PendingClass>{
//    private static final String TAG = "PersonListAdapter";
    private final Context mContext;
    private final int mResource;
    ArrayList<PendingClass> mobjects;
    ArrayList<String> data = new ArrayList<>();
    private int lastPosition = -1;
    private List<EditText> editTextList;
    private static class ViewHolder {
        TextView quantity;
        TextView date;
        TextView amount;
        TextView time;

    }
    public CustomAdapter3(Context context, int resource, ArrayList<PendingClass> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
        mobjects=objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String quantity = getItem(position).getQuantity();
        String date = getItem(position).getDate();
        String amount = getItem(position).getAmount();
        String time =getItem(position).getTime();

        //Create the person object with the information
        PendingClass priceList = new PendingClass(quantity, date, amount, time);

        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        com.firstapp.laundry_login_page.CustomAdapter3.ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.quantity = (TextView) convertView.findViewById(R.id.total_clothes);
            holder.date = (TextView) convertView.findViewById(R.id.date);
            holder.amount = (TextView) convertView.findViewById(R.id.balance);
            holder.time = (TextView)convertView.findViewById(R.id.Time);

            result = convertView;

            convertView.setTag(holder);
        }
//        else{
//            holder = (com.firstapp.laundry_login_page.ViewHolder) convertView.getTag();
//            result = convertView;
//        }
////        lastPosition = position;
////        holder.quantity.setText(priceList.getQuantity());
////        holder.date.setText(priceList.getDate());
////        holder.amount.setText(priceList.getAmount());
////        holder.time.setText(priceList.getTime());
////        holder.quantity.setText(data.get(position));
////        holder.quantity.setId(position);
//        holder.quantity.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            public void onFocusChange(View v, boolean hasFocus) {
//                if(!hasFocus) {
//                    final int position = v.getId();
//                    final EditText Caption = (EditText) v;
//                    data.set(position, Caption.getText().toString());
//                    etcurr = (EditText) v;
//                    holder.totalprice.setText(priceList.getTotalprice());
//                }
//                else{
//                    final int position = v.getId();
//                    final EditText Caption = (EditText) v;
//                    data.set(position, Caption.getText().toString());
//                    etcurr = (EditText) v;
//                }

//            }
//        });

        return convertView;

    }
}
