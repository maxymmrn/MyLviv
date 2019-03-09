package com.android.mylviv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.mylviv.*;

public class complain_status extends AppCompatActivity {

    TextView title;
    ImageView image;
    TextView address;
    TextView status;
    TextView company;
    TextView description;
    Complaint currentComplaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_status);

        title = (TextView) findViewById(R.id.complaint_status_title);
        image = (ImageView) findViewById(R.id.complaint_status_image);
        address = (TextView) findViewById(R.id.complaint_status_address);
        status = (TextView) findViewById(R.id.complaint_status_progress_status);
        company = (TextView) findViewById(R.id.complaint_status_responsible_company);
        description = (TextView) findViewById(R.id.complaint_status_description);

        currentComplaint = new Complaint(ComplaintType.LIGHT, "парк Франка",
                Status.IN_PROGRESS, R.drawable.lihtar, "ПП \"Світло\"",
                "Ліхтар розбитий вже протягом 4 днів.\n" +
                        "А отже й не світить стільки ж.\n" +
                        "Зремонтуйте його будь ласка.");

        displayInfo(currentComplaint);
    }

    private void displayInfo(Complaint complaint){
        title.setText(complaint.getType().toString());
        image.setImageResource(complaint.getPictureId());
        address.setText(complaint.getAddress());
        status.setText(complaint.getStatus().toString());
        company.setText(complaint.getResponsibleCompany());
        description.setText(complaint.getDescription());
    }
}
