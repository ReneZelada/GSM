package com.example.pc.gsmphonelocation;

import java.util.Arrays;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.CellSignalStrength;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // TextView textGsmCellLocation = (TextView)findViewById(R.id.gsmcelllocation);
        TextView textCID = (TextView) findViewById(R.id.cid);
        TextView textSECTOR = (TextView) findViewById(R.id.sector);
        TextView textLAC = (TextView) findViewById(R.id.lac);
        TextView textMCC = (TextView) findViewById(R.id.mcc);
        TextView textMNC = (TextView) findViewById(R.id.mnc);
        TextView textCID2 = (TextView) findViewById(R.id.cid2);
        TextView textCID3 = (TextView) findViewById(R.id.cid3);
        TextView textCID4 = (TextView) findViewById(R.id.cid4);
        //TextView Neighboring = (TextView)findViewById(R.id.neighboring);
        //retrieve a reference to an instance of TelephonyManager
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        GsmCellLocation cellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
        //TelephonyManager telephonyManager1=(TelephonyManager)PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);
        String networkOperator = telephonyManager.getNetworkOperator();
        String mcc = networkOperator.substring(0, 3);
        String mnc = networkOperator.substring(3);
        // super.onSignalStrengthsChanged(signalStrength);
        int cont=0;
 //     int SignalStrength = 0;
        int cid = cellLocation.getCid();
        int lac = cellLocation.getLac();
        int id = cid / 10;
        double sec = cid % 10;
        int se = (int) (sec);
        int b=0;
        textMCC.setText("Operador: Claro GT");
        textMNC.setText("MCC: " + mcc + " MNC: " + mnc);
        textCID.setText("CID: " + id + " LAC: " + lac);
        textSECTOR.setText("Sector: " + se);
        // textLAC.setText("GSM Cell lac: " + lac );

            if (sec==sec){

            textCID2.setText("No hay vecinos");
        } else {

                textCID3.setText("CID: " + cid + " LAC: " + lac);
                textCID4.setText("CID: " + cid + " LAC: " + lac);
            }

        if(id==2312)
        {
            textCID2.setText("Usted se encuentra alrededor: 7a calle zona 3(Xela Center) " );
        }
        if(id==2313)
        {
            textCID2.setText("Usted se encuentra alrededor de: 4ta calle D12 zona 1(Ulew Tinimit Spanish School)" );
        }
        if(id==2324)
        {
            textCID2.setText("Usted se encuentra alrededor de: 3ra calle zona 3(Sociadad Biblica de Guatemala)" );
        }
        if(id==2352)
        {
            textCID2.setText("Usted se encuentra alrededor de: 5a zona 6 (Centro Regional de Justicia)" );
        }
        if(id==2373)
        {
            textCID2.setText("Usted se encuentra alrededor de: zona 9 (Atras de la UMES las americas)" );
        }
        if(id==2374)
        {
            textCID2.setText("Usted se encuentra alrededor de: Avenida Jesus Castillo (Cuesta Blanca)" );
        }
        if(id==2375)
        {
            textCID2.setText("Usted se encuentra alrededor de: 37a zona 8 (Inde)" );
        }

        if(id==2377)
        {
            textCID2.setText("Usted se encuentra alrededor de: Diagonal 15 zona 5 (Hotel del campo)" );
        }
        if(id==2992)
        {
            textCID2.setText("Usted se encuentra alrededor de: 14a zona 3 (teatro municipal) " );
        }
        if(id==3635) {
            textCID2.setText("Usted se encuentra alrededor de: 6ta calle zona 9 (Mc las americas)");
        }
        if(id==3832) {
            textCID2.setText("Usted se encuentra alrededor de: 7ma calle zona 3 (Xela Center)");
        }
        if(id==4118) {
            textCID2.setText("Usted se encuentra alrededor de: 41a zona 9 (La licorera)");
        }
        if(id==4119) {
            textCID2.setText("Usted se encuentra alrededor de: 7ma calle zona 3 (Pradera Xela) ");
        }
        if(id==4445) {
            textCID2.setText("Usted se encuentra alrededor de: 37a zona 8 (Inde) ");
        }
        if(id==5514) {
            textCID2.setText("Usted se encuentra alrededor de: 29a zona 7 (Rotonda el Tecun)");
        }
        if(id==1500) {
            textCID2.setText("Usted se encuentra alrededor de: 29a zona 7 (Aeropuerto)");
        }
        if(id==2000) {
            textCID2.setText("Usted se encuentra alrededor de: 11va calle zona 1 (Clinica Dental Santa Ana)");
        }
        if(id==2100) {
            textCID2.setText("Usted se encuentra alrededor de: 1ra calle zona 2 (Rotonda)");
        }
        if(id==2357) {
            textCID2.setText("Usted se encuentra alrededor de: llanos del pinal");
        }
        if(id==2387) {
            textCID2.setText("Usted se encuentra alrededor de: Av Cenizal ");
        }
        if(id==3634) {
            textCID2.setText("Usted se encuentra alrededor de: zona 3 (Hospital Privado)");
        }
        if(id==3637) {
            textCID2.setText("Usted se encuentra alrededor de: 14a zona 3 (Rincon Uruguyo)");
        }
        if(id==4347) {
            textCID2.setText("Usted se encuentra alrededor de las cordenadas: LOG -91.5589 LAT 14.8612");
        }
        if(id==4583) {
         textCID2.setText("Usted se encuentra alrededor de: zona 7 Gran Karmel");
        }
        if(id==5242) {
            textCID2.setText("Usted se encuentra alrededor de: 11va calle zona 1 (Clinica Dental Santa Ana)");
        }
        if(id==5355) {
            textCID2.setText("Usted se encuentra alrededor de: 14a Avenida zona 3 (URL)");
        }
        if(id==5356) {
            textCID2.setText("Usted se encuentra alrededor de: 14a Avenida zona 3 (URL)");
        }








    }
    }
